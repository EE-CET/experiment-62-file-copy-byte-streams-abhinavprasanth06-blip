import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        // Relative paths (DO NOT use absolute paths)
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try {
            // Create FileInputStream to read from source file
            FileInputStream fis = new FileInputStream(sourceFile);

            // Create FileOutputStream to write to destination file
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int data;

            // Read byte by byte and write to destination
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            // Close streams
            fis.close();
            fos.close();

            System.out.println("File Copied");

            // Display content of destination file
            BufferedReader reader = new BufferedReader(new FileReader(destinationFile));
            String line;

            System.out.println("Content of destination file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
