import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWord(args[0]));
        Utility.merger();
    }

    static int countWord(String fileName){
        int count = 0;
        try(Scanner scanner = new Scanner(new FileReader(fileName))){

            while (scanner.hasNext()){
                scanner.next();
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}
