package transcoder;

public interface JobQueue {
  JobData getJob();
  void addJob(JobData jobData);
}
