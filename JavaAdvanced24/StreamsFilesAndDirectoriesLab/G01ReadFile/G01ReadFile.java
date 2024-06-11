package StreamsFilesAndDirectoriesLab.G01ReadFile;

import java.io.FileInputStream;
import java.io.IOException;

public class G01ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "/home/baldar/Documents/GitHub/JavaAdvanced24/JavaAdvanced24/StreamsFilesAndDirectoriesLab/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int asciiCode = inputStream.read();

        while (asciiCode != -1) {
            System.out.print(Integer.toBinaryString(asciiCode) + " ");
            asciiCode = inputStream.read();
        }
    }
}
