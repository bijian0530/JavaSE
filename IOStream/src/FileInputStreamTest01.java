import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("tempfile");
            System.out.println("最开始文件的字节数 = "+fis.available());
            byte[] bytes = new byte[4];
            int readCount = fis.read(bytes);
            int leftCount = fis.available();
            System.out.println("leftCount = "+leftCount);
            System.out.println(readCount);
            System.out.println(new String(bytes));

            System.out.println(">>>>>>>>>>>>>>>>>>>>");

            readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes));

            System.out.println("<<<<<<<<<<<<<<<<<<<<<<");

            readCount = fis.read(bytes);
            System.out.println(readCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
