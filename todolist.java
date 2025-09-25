import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class todolist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Welcome to Karun's TODO list: ");
        Scanner input = new Scanner(System.in);
        boolean user_choice = true;
        while (user_choice){
        System.out.println("Enter 1 to add task \n Enter 2 to remove a task which has been done \n Enter 3 to sort the todo list in ascending order \n Enter 4 to print the todo list\n Enter 5 to add a task at a particular index:");
        int user_input = input.nextInt();
        input.nextLine();
        
        
            switch(user_input){
                case 1:{
                    System.out.println("Enter a task:");
                    String temp = input.nextLine();
                    list.add(temp);
              

                    break;
                }
                case 2:{
                    System.out.println("Enter the task  to be removed:");
                    String temp1 = input.nextLine();
                    for(int i = 0;i<list.size();i++){
                        if(list.get(i).equalsIgnoreCase(temp1)){
                            list.remove(i);
                            System.out.println("Removed sucessfully....");
                            break;

                        }
                    }
                    System.out.println("Error task not found!!");
                
            }

                    break;

                
                case 3:{
                    Collections.sort(list);
                    break;
                }
                case 4:{
                    System.out.println("The list is...");
                    for(int i =0;i<list.size();i++){
                        System.out.println("Task" + " " +i+":"+list.get(i));
                        

                    }
            
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the index and the task:");
                    int nu = input.nextInt();
                    String te = input.nextLine();
                    list.add(nu,te);
                   

                    break;

                }


            }
             System.out.println("DO you want to continue.."+" "+"Enter y or n");
            char ch = input.nextLine().charAt(0);
            if( ch !='y'){
                user_choice = false;

            }

           
            
        }

        
    }
    
    

}
