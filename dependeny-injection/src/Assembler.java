import ffmpegtranscoder.FfmpegTranscoder;
import filejobqueue.FileJobQueue;
import transcoder.JobQueue;
import transcoder.Transcoder;
import transcoder.Worker;
import ui.JobCLI;

public class Assembler {
  private Worker worker;
  private JobCLI jobCLI;

  public void createAndWire() {
    JobQueue jobQueue = new FileJobQueue();
    Transcoder transcoder = new FfmpegTranscoder();
    this.worker = new Worker(jobQueue, transcoder);
    this.jobCLI = new JobCLI(jobQueue);
  }

  public Worker getWorker() {
    return worker;
  }

  public JobCLI getJobCLI() {
    return jobCLI;
  }
}
