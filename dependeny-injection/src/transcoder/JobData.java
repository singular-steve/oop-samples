package transcoder;

public class JobData {
  private String source;
  private String target;

  public JobData(String source, String target) {
    this.source = source;
    this.target = target;
  }

  public String getSource() {
    return source;
  }

  public String getTarget() {
    return target;
  }
}
