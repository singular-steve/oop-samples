public class ByteSourceFactory {

  private static ByteSourceFactory instance = new ByteSourceFactory();

  public static ByteSourceFactory getInstance() {
    return instance;
  }

  public ByteSource create() {
    if (userFile()) {
      return new FileDataReader();
    } else {
      return new SocketDataReader();
    }
  }

  private boolean userFile() {
    String useFileVal = System.getProperty("useFile");
    return useFileVal != null && Boolean.valueOf(useFileVal);
  }

}
