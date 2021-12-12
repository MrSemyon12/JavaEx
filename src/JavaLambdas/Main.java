package JavaLambdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    @FunctionalInterface
    interface ICompStrings{
        public String getMaxString(String a, String b);
    }

    public static void main(String[] args) {

        ICompStrings compStrings = (a, b) -> {
            if (a.length() >= b.length()) return a;
            else return b;
        };

        Scanner file = null;
        try {
            file = new Scanner(new File("./src/JavaLambdas/input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String maxStr = "";

        if(file.hasNext()) {
            maxStr = file.next();

            while (file.hasNext()) {
                maxStr = compStrings.getMaxString(maxStr, file.next());
            }
        }

        System.out.println(maxStr);
    }
}
