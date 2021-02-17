import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.*;

public class kolekcje {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

         boolean w = true;

        for (int i=0; i<text.length()-1; i++){

            if((int)(text.charAt(i+1))!=(int)(text.charAt(i)+1)){

                w=false;

            }

        }

        System.out.println(w);

    }
}