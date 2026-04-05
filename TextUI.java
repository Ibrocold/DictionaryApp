import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command:");
            String word = scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
        }
            if(word.equals("add")){
                System.out.println("Word:");
                String newword = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(newword, translation);
                continue;
            }
            if(word.equals("search")){
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                if(this.dictionary.translate(search) != null){
                    System.out.println("Translation: "+this.dictionary.translate(search)); 
                } else {
                    System.out.println("Word " + search + " was not found");
                }
                
                continue;
            }   
            System.out.println("Unknown command");
            continue;
        }
        
    }
}
