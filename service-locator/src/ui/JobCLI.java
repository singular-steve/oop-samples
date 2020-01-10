package ui;

import transcoder.JobData;
import transcoder.JobQueue;

public class JobCLI {
  public void interact() {
    printInputSourceMessage();
    String source = getSourceFromConsole();
    printInputTargetMessage();
    String target = getTargetFromConsole();

    JobQueue jobQueue = null; // TODO
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
