package solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	Main main = new Main();
	main.notDublicate();
    }
    //sorting out the numbers
    private void notDublicate() throws IOException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));
        int count  = scanner.nextInt();
        int i;
        for (i = 1; i <=count; i++) {
            if(isDublicate(i)){
                count++;
            }
        }
        FileWriter writer = new FileWriter("OUTPUT.TXT");
        writer.write(String.valueOf(count));
        writer.close();
    }
    private Boolean isDublicate(int k){
        char[] chars = String.valueOf(k).toCharArray();
        for (int i = 0; i <chars.length; i++) {
            for (int j = 0; j <chars.length; j++) {
               if(i!=j&&chars[i]==chars[j]){
                   return true;
               }
            }
        }
        return false;
    }
}
