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
        
        exercise1();
        exercise2();
        exercise3();
        
        
    } 
    
    public static void exercise2(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n =kb.nextInt();
        for (int i = 1; i< n ; i++){
            if(i%2 == 0 )
                System.out.println(i);
        }
    
    }
    
    
     public static void exercise3(){   
         Scanner keyboard = new Scanner(System.in);
         String[] qs = new String[4];
         qs[1]= "whats the weather like?";
         qs[2]= "what day is it?";
         qs[3]= "where's waldo?";
         int n = 1;
         String input = "";
           while((!input.equals("exit"))  ){
            System.out.println(qs[n]);
            input = keyboard.next(); 
            if(n<3)
            n++;
            else
            n = 1;
           }
    }
    
    public static void exercise1(){
        int length = 20;
        int breadth = 20;
        int area = length * breadth;
        System.out.println( "There area of a square with side " + length + " is " +  area );
    }
    
}