package filejobqueue;

import transcoder.JobData;
import transcoder.JobQueue;

public class FileJobQueue implements JobQueue {
  @Override
  public JobData getJob() {
    return null;
  }

  @Override
  public void addJob(JobData jobData) {

  }
}
