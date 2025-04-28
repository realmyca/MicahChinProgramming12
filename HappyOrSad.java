import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java
//https://stackoverflow.com/questions/5600422/method-to-find-string-inside-of-the-text-file-then-getting-the-following-lines
//https://www.w3schools.com/java/ref_string_charat.asp

public class HappyOrSad {
    public static void main (String[] args){

        int happy = 0;
        int sad = 0;

        File file = new File("happyorsad.txt");

        try{
            Scanner scanner = new Scanner(file);

            if(scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++){
                    if (line.charAt(i) == ')'){
                        happy++;
                    }
                    else if(line.charAt(i) == '('){
                        sad++;
                    }
                }
            }
            scanner.close();

            if (happy == 0 && sad == 0){
                System.out.println("none");
            }
            else if (happy > sad){
                System.out.println("happy");
            }
            else if (sad > happy){
                System.out.println("sad");
            }
            else{
                System.out.println("unsure");
            }

        }
        catch (FileNotFoundException e){ 
            System.out.print("No file.");
        }
    }
}

// I felt :-( this morning, but then I ate pizza :-) and saw a puppy :-). Now I'm happy :-).
