package transcoder;

public class Worker {
  public void run() {
    JobQueue jobQueue = Locator.getInstance().getJobQueue();
    Transcoder transcoder = Locator.getInstance().getTranscoder();

    while (1 == 1) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcode(jobData.getSource(), jobData.getTarget());
    }
  }
}
