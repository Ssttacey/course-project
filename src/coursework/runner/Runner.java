package coursework.runner;

import coursework.entrance.Entrance;
import coursework.fileDescription.path.EnterThePath;
import coursework.statistics.FileWithStatistic;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws IOException {
        if(Entrance.loginAndPassword()) {
            String path = EnterThePath.enterThePath();
            FileWithStatistic.fileWithStatistic(path);
        }
    }
}
