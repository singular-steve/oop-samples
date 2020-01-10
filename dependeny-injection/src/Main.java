import ffmpegtranscoder.FfmpegTranscoder;
import filejobqueue.FileJobQueue;
import transcoder.JobQueue;
import transcoder.Transcoder;
import transcoder.Worker;
import ui.JobCLI;

public class Main {
  public static void main(String[] args) {
    // 상위 수준 transcoder 에서 사용할 하위 수준 객체 생성
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();

    // 상위 수준 객체 생성 및 실행
    Assembler assembler = new Assembler();
    assembler.createAndWire();

    final Worker worker = assembler.getWorker();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        worker.run();
      }
    });
    JobCLI jobCLI = assembler.getJobCLI();
    jobCLI.interact();
  }
}