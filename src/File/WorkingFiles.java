package File;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class WorkingFiles {

    public void saveToFile(String nameFile, StringBuilder infoUser) {
        Path path = Path.of("src/File/" + nameFile);
        File file = new File(String.valueOf(path));
        FileWriter fr = null;

        try {
            fr = new FileWriter(file, true);
            if (fr.equals(null)) {
                fr.write(String.valueOf(infoUser));
            }
            fr.write(infoUser + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
