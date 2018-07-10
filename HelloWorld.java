import java.util.Scanner;
public class HelloWorld{

    public static void main(String[ ] args){
        System.out.println("Hello World");
        
        String name;
        System.out.println("Hi, what's your name? ");
        // Scanner is used to get input from the keyboard
        Scanner keyboard = new Scanner(System.in); 
        //get input from the user and store in String variable
        name = keyboard.next(); 
        //Append the user's name with a little message
        System.out.println("Nice to meet you "+ name);
    }  
}
