package Task15;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

interface ICompareTwoString{
    boolean compareStrings(String a,String b);
}

public class Program {


    public static String comparator(String[] a, String max, ICompareTwoString iCompareTwoString ){
        for (int i = 0; i < a.length; i++)
            if(iCompareTwoString.compareStrings(a[i],max))
                max=a[i];

        return max;
    }



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        ArrayList<String> arr=new ArrayList<>();

        String max="";

        while(sc.hasNext()){
            String s = sc.next();

            String[] words=s.split(" ");

            max= comparator(words,max,(a,b)->a.length()>b.length());


        }

        System.out.println(max);


    }
}
