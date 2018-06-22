package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputTestMain {

    public static void main(String[] args) {
        int c;
        try {
            LoweCaseInputStream in = new LoweCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/home/pavlochechehov/IdeaProjects/HeadFirstDesignPatterns/src/decorator/text.txt")));


            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
