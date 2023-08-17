import java.io.*;

public class que4 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String file_name = br.readLine();
    File f1 = new File(file_name);
    String result = f1.exists() ? "exists" : "does not exist";
    System.out.println("Thie file " + result);
    if (f1.exists()) {
      result = f1.canRead() ? "readable" : "not readable";
      System.out.println("The file is " + result);
      result = f1.canWrite() ? "writable" : "not writable";
      System.out.println("The file is " + result);
      System.out.println("The file has " + f1.length() + " number of bytes");
      if (file_name.endsWith(".jpg") || file_name.endsWith(".png") || file_name.endsWith(".jpeg"))
        System.out.println("Image file");
      else if (file_name.endsWith(".mp4"))
        System.out.println("Video file");
      else if (file_name.endsWith(".mp3"))
        System.out.println("Audio file");
      else if (file_name.endsWith(".exe"))
        System.out.println("Executable file");
      else if (file_name.endsWith(".txt"))
        System.out.println("Text file");
      else
        System.out.println("File type is unknown");
    }
  }
}
