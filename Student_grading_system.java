

import java.util.Scanner;

public class Student_grading_system 
{

    private static void readinfo() 
    {
        
        Scanner sc=new Scanner(System.in);

        int stotal=0;
        int[] scores=new int[100];

        System.out.println("Enter name of student:"); 
        String name=sc.nextLine();

        System.out.println("Enter roll no:");
        int roll=sc.nextInt();

        System.out.println("Enter the number of subjects:");
        int no=sc.nextInt();

        System.out.println("Enter the total marks:");
        int total=sc.nextInt();

        System.out.println("Enter the scores for each subject attained by the student:");
        for (int i=0;i<no;i++) 
        {
            scores[i]=sc.nextInt();
            stotal=stotal+scores[i];
        }
         
        char grade=calculategrade(total,stotal);

        display(name,roll,scores,no,grade);
    }

    private static char calculategrade(int total,int stotal) 
    {
        float percentage = ((float) stotal / total) * 100;
        
        if(percentage>90) {
            return 'A';
        }
        else if(percentage>80) {
            return 'B';
        }
         else if(percentage>70) {
            return 'C';
        }
         else if(percentage>60) {
            return 'D';
        }
         else if(percentage>50) {
            return 'E';
        }
        else {
            return 'F';
        }
        
    }

    private static void display(String name, int roll,int[] scores,int no,char grade) 
    {
        System.out.println("ACADEMIC DETAILS");
        System.out.println("Name of the Student:"+name);
        System.out.println("Roll No: " + roll);
        int j=1;
        for (int i=0;i<no;i++) 
        {
            
            System.out.println("Subject "+j+":"+scores[i]);
            j++;
        }
        System.out.println("Overall Grade: " + grade);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do 
        {
            readinfo();
            System.out.println("If you want to exit press 1 , if you want to continue enter any other number!!!");
            choice=sc.nextInt();
        }while(choice!=1);
            
    }
}
