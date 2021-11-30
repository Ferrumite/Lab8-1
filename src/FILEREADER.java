import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FILEREADER {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        String text = in.nextLine();

        try(FileWriter zapis = new FileWriter("LABS8-Text.txt", false))
        {
            zapis.write(text);
            zapis.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        ///////////////////


        try(FileReader reader = new FileReader("LABS8-Text.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
