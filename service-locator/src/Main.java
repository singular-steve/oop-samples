import ffmpegtranscoder.FfmpegTranscoder;
import filejobqueue.FileJobQueue;
import transcoder.JobQueue;
import transcoder.Locator;
import transcoder.Transcoder;
import transcoder.Worker;
import ui.JobCLI;

public class Main {
  public static void main(String[] args) {
    // 상위 수준 transcoder 에서 사용할 하위 수준 객체 생성
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();

    // 상위 수준에서 하위 수준을 사용할 수 있도록 Locator 초기화
    Locator locator = new Locator(jobQueue, transcoder);
    Locator.init(locator);

    // 상위 수준 객체 생성 및 실행
    Worker worker = new Worker();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        worker.run();
      }
    });
    JobCLI jobCLI = new JobCLI();
    jobCLI.interact();
  }
}
