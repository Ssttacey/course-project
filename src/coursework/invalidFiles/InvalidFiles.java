package coursework.invalidFiles;

import coursework.fileDescription.FileChecking;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class InvalidFiles {

    public static void invalidFiles(File file) throws IOException {

        if (!FileChecking.fileIsTrue(file)) {

                Files.copy(file.toPath(), new File("D:\\data 1\\data\\invalid" + File.separator + file.getName()).toPath());
                Files.delete(file.toPath());
        }
    }

}
