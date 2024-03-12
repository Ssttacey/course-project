package coursework.invalidFiles;

import coursework.fileDescription.FileChecking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static coursework.invalidFiles.IWrongFileWay.WRONG_FILE_WAY;

public class InvalidFiles {

    public static void invalidFiles(File file) throws IOException {
        FileWriter errorDocWriter = new FileWriter(WRONG_FILE_WAY, true);

        if (!FileChecking.fileTypeCheck(file)){
            errorDocWriter.write("Invalid File or wrong format " + file + ".\n");
        } else if (!FileChecking.fileYearCheck(file)) {
            errorDocWriter.write("outdated file " + file + ".\n");
        } else if (!FileChecking.fileStructureCheck(file)) {
            errorDocWriter.write("Wrong name " + file + ".\n");
        }
        errorDocWriter.close();
    }

}
