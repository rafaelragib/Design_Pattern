import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("file.txt");
        in = new LowerCaseInputs( new BufferedInputStream(in));
        int c;
        while((c = in.read()) >= 0) {
            System.out.print((char) c);
        }
    }
}
