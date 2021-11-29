import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputs extends FilterInputStream {

  public LowerCaseInputs(InputStream in){
    super(in);
  }
  @Override
  public int read()  throws IOException {
    int c = in.read();
    return (c== -1 ? c : Character.toLowerCase((char) c));

  }
  public int read(byte[] b,int off, int len) throws IOException {
    int result = in.read(b,off,len);
    for(int i= off; i<len; i++) {
      b[i] = (byte) Character.toUpperCase((char) b[i]);
    }
    return result;
  } 
}
