package coursework.documentation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;

public class InvalidFile {
    public static LinkedList<File> wrongFormat(File[] files, String WRONG_FILE_WAY) throws IOException {

        FileWriter errorDocWriter = new FileWriter(WRONG_FILE_WAY, true);
        // это полезная штука, позволяет создавать обьект и сразу же записать куда надо добавлять записанные данные
        // короче один из конструкторов класса FileWriter

        LinkedList<File> txtFiles = new LinkedList<>();
        for (File oneFile : Objects.requireNonNull(files)) {
            if (!oneFile.getName().endsWith(".txt")) {
                errorDocWriter.write("Invalid File or wrong format " + oneFile + ".\n");
            } else if (!oneFile.toString().contains("2023")) {
                errorDocWriter.write("outdated file " + oneFile + ".\n");
            }

          else if (oneFile.getAbsolutePath().contains("invoices")) {
                if (!oneFile.getName().toLowerCase().contains("invoice")) {
                    errorDocWriter.write("Wrong name " + oneFile + ".\n");
                }
            } else if (oneFile.getAbsolutePath().contains("checks")) {
                if (!oneFile.getName().toLowerCase().contains("electric_bill")) {
                    errorDocWriter.write("Wrong name " + oneFile + ".\n");
                }
            } else if (oneFile.getAbsolutePath().contains("orders")) {
                if (!oneFile.getName().toLowerCase().contains("order")) {
                    errorDocWriter.write("Wrong name " + oneFile + ".\n");
                }
            }
        }
        return txtFiles;
    }
}

//TODO почему-то поиск неправильного имени не работает)))))))) спроси пж у своего друга, может он знает.
