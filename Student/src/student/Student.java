package student;

import java.util.HashMap;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<Integer,String>();
        Scanner input = new Scanner(System.in);
        Students users = new Students();

        System.out.println("1) Login");
        System.out.println("2) Register & show list");
        System.out.println("3) Search for Student");
        System.out.println("4) Exit");
        System.out.print("Enter your choice: ");
        Integer choice = Integer.parseInt(input.nextLine());
        
        do
        {
            if(choice == 1){
                System.out.println("Login in ");
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Enter your id number: ");
                Integer idNumber = Integer.parseInt(input.nextLine());
                if(studentList.containsKey(idNumber)){
                    break;
                }
                else{
                    System.out.println("You are not registered you must register first.");

                }
            }else if (choice == 2){
                System.out.println("Registering ");
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Enter your id number: ");
                Integer idNumber = Integer.parseInt(input.nextLine());
                studentList.putIfAbsent(idNumber,name);
                //System.out.println(users.addUser(studentList.get(name), studentList.get(idNumber)));
                System.out.println(users.addUser(name, idNumber));
                System.out.println("Displaying Users.");
        	System.out.println(users.displayUsers());
                System.out.println("Displaying users after sorting by idNumber.");
                users.sortUsers();
                System.out.println(users.displayUsers());
            }else if (choice == 3){
               // Students users = new Students();
                //System.out.println(users.addUser(studentList.get(name), studentList.get(idNumber)));
                System.out.print("Searching for user with id: ");
                Integer idSearch = Integer.parseInt(input.nextLine());
                System.out.println("User is : " + users.searchById(idSearch));
            }
        System.out.println(studentList);
        System.out.println("1) Login");
        System.out.println("2) Register & show list");
        System.out.println("3) Search for Student");
        System.out.println("4) Exit");
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(input.nextLine());
    }while(choice != 4);
        System.out.println("Student list: " + studentList);
    }
}