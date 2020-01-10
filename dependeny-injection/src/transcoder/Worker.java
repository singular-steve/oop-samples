package transcoder;

public class Worker {
  private JobQueue jobQueue;
  private Transcoder transcoder;

  public Worker(JobQueue jobQueue, Transcoder transcoder) {
    this.jobQueue = jobQueue;
    this.transcoder = transcoder;
  }

  public void run() {
    while (someCondition()) {
      JobData jobData = jobQueue.getJob();
      transcoder.transcode(jobData.getSource(), jobData.getTarget());
    }
  }

  private boolean someCondition() {
    // TODO
    return false;
  }
}
