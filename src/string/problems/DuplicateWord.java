package string.problems;
import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */


        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String []ar = st.split("\\s");
        Map<String, Integer> mp= new HashMap<String, Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;

            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }
            }

            mp.put(ar[i], count);
        }

        System.out.println(mp);
    }

}
