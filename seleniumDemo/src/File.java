import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("name.txt");
        f.createNewFile();

        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());

        // Writing
        FileWriter fw = new FileWriter(f);
        fw.write("Welcome to Java file handling");
        fw.close();

        // FileReader
        FileReader fr = new FileReader(f);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

        // BufferedReader (MOVED INSIDE main)
        try {
            BufferedReader bf = new BufferedReader(new FileReader("name.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Stream copy
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("copy.txt");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
