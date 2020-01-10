package ui;

import transcoder.JobData;
import transcoder.JobQueue;

public class JobCLI {
  private JobQueue jobQueue;

  public JobCLI(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }

  public void interact() {
    printInputSourceMessage();
    String source = getSourceFromConsole();
    printInputTargetMessage();
    String target = getTargetFromConsole();

    jobQueue.addJob(new JobData(source, target));
  }

  private void printInputSourceMessage() {
    System.out.println("source : ");
  }

  private void printInputTargetMessage() {
    System.out.println("target : ");
  }

  private String getSourceFromConsole() {
    return null;
  }

  private String getTargetFromConsole() {
    return null;
  }
}
