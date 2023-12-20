import java.util.*;
class SimpleQuiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        
        do {
            int score=0;
        
        System.out.println("Welcome to Simple Java Quiz");
        System.out.println("This quiz is done as a part of analysing your existing basic knowledge on java programming. There will be a total of 4 questions and their options. You can view your score at the last.");
        
        
            System.out.println("Question no:1");
            System.out.println("What does JDK stands for?");
            System.out.println("a.Java Run Time Env b.Java Development Kit c.Java Virtual Machine");
            char in=sc.next().charAt(0);
            switch(in) {
                case 'b': 
                score=score+1; System.out.println("Hurray..Correct Answer"); break;
                default: System.out.println("Better luck next time"); break;
            }
            System.out.println("Question no:2");
            System.out.println("What does JVM stands for?");
            System.out.println("a.Java Run Time Env b.Java Development Kit c.Java Virtual Machine");
            in=sc.next().charAt(0);
            switch(in) {
                case 'c': 
                score=score+1; System.out.println("Hurray..Correct Answer"); break;
                default: System.out.println("Better luck next time"); break;
            }
            System.out.println("Question no:3");
            System.out.println("Predict the output?");
            System.out.println("int x=5; double y=2.5; System.out.println(x+y);");
            System.out.println("a.Compilation error b.7.5");
            in=sc.next().charAt(0);
            switch(in) {
                case 'b': 
                score=score+1; System.out.println("Hurray..Correct Answer"); break;
                default: System.out.println("Better luck next time"); break;
            }
            System.out.println("Question no:4");
            System.out.println("Decision-making statements in Java, like \"if,\" \"else,\" and \"switch,\" control program flow based on conditions. They allow the execution of specific code blocks depending on whether a condition evaluates to true or false. These statements enhance the flexibility and logic of Java programs.");
            System.out.println(" What is the correct syntax for an 'if' statement in Java? a) if condition { // code } b) if (condition) { // code } c) if { // code } condition");
            in=sc.next().charAt(0);
            switch(in) {
                case 'b': 
                score=score+1; System.out.println("Hurray..Correct Answer"); break;
                default: System.out.println("Better luck next time"); break;
            }
        
        System.out.println("Your Score is:"+score);
        System.out.println("If you want to exit press '1' or any other key(0-9) to continue");
        choice= sc.nextInt();
        }
        while(choice!=1);

        sc.close();
    }
}