import java.io.*;
import java.util.Scanner;

public class Utility {
    public static void merger(){

        //for (int i =0; i < fileNames.length; i++)
            try(OutputStreamWriter outPut = new OutputStreamWriter(System.out)) {
                try(Scanner scanner = new Scanner(new BufferedInputStream(new SequenceInputStream
                        (new FileInputStream("C:\\Users\\Diana\\Desktop\\croc1.txt"),
                                new FileInputStream("C:\\Users\\Diana\\Desktop\\croc2.txt")))))
                 {
                    while (scanner.hasNextLine()){
                        System.out.println(Integer.parseInt(scanner.next()));
                        scanner.next();
                        //outPut.write(Integer.parseInt(scanner.nextLine().split(" ")[0]));
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
