package student;

import java.util.HashMap;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        HashMap<String, Integer> studentList = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);     
        
        System.out.println("1) Login");
        System.out.println("2) Register");
        System.out.println("3) Exit");
        System.out.print("Enter your choice: ");
        Integer choice = Integer.parseInt(input.nextLine());
        studentList.put("june",55);

        do
        {
            if(choice == 1){
                System.out.println("Login in ");
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Enter your id number: ");
                Integer idNumber = Integer.parseInt(input.nextLine());
                if(studentList.containsKey(name)){
                    break;
                }
                else{
                    System.out.println("You are not registered you must register first.");
                    
                }
                //studentList.putIfAbsent(name, idNumber);
            }else if (choice == 2){
                System.out.println("Registering ");
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Enter your id number: ");
                Integer idNumber = Integer.parseInt(input.nextLine());
                //studentList.put(name,idNumber);
                studentList.putIfAbsent(name, idNumber);
        }
        studentList.put("june",66);
        System.out.println(studentList);
        System.out.println("1) Login");
        System.out.println("2) Register");
        System.out.println("3) Exit");
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(input.nextLine());
    }while(choice != 3);
        System.out.println("After do while" + studentList);
    }
}