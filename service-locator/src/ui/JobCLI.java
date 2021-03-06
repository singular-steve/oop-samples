package ui;

import transcoder.JobData;
import transcoder.JobQueue;
import transcoder.Locator;

public class JobCLI {
  public void interact() {
    printInputSourceMessage();
    String source = getSourceFromConsole();
    printInputTargetMessage();
    String target = getTargetFromConsole();

    JobQueue jobQueue = Locator.getInstance().getJobQueue();
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
