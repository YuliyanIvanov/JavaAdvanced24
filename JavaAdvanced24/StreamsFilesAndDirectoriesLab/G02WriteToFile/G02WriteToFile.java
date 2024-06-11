package StreamsFilesAndDirectoriesLab.G02WriteToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class G02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "/home/baldar/Documents/GitHub/JavaAdvanced24/JavaAdvanced24/StreamsFilesAndDirectoriesLab/G02WriteToFile/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("/home/baldar/Documents/GitHub/JavaAdvanced24/JavaAdvanced24/StreamsFilesAndDirectoriesLab/G02WriteToFile/02.WriteToFileOutput.txt");

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            next = next.replaceAll("[,.!?]", "");
            for (int i = 0; i < next.length(); i++) {
                outputStream.write(next.charAt(i));
            }
            String lineSeparator = System.lineSeparator();
            for (int i = 0; i < lineSeparator.length(); i++) {
                outputStream.write(lineSeparator.charAt(i));
            }
        }
    }
}
