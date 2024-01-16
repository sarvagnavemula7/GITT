import java.util.ArrayList;
import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        ExpenseTraker m=new ExpenseTraker();
        do{
        System.out.println("expense Tracker Menu :");
        System.out.println("1.Add Expense");
        System.out.println("2.Display Expense");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
            switch (choice){
                case 1:
                  m.addExpenses();
                    System.out.println("Expense added successfully..!!");
                  break;
                case 2:
                 m.displayExpenses();
                 break;
                case 3:
                    System.out.println("Exiting expense Tracker..!!");
                    break;
                default:
                    System.out.println("Not Valid option..");
            }
        }while(choice!=3);
        sc.close();
    }
}
class ExpensesData{
    String Description;
    int Amount;
    String Category;
    String Date;
    ExpensesData(String Description,int Amount,String Category,String Date){
        this.Description=Description;
       this.Amount=Amount;
       this.Category= Category;
        this.Date=Date;
    }
}
class ExpenseTraker{
    ArrayList<ExpensesData> a=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public void addExpenses(){
        System.out.println("Enter Expense Description :");
        String description=scanner.nextLine();
        System.out.println("Enter Expense Amount :");
        int amount=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Expense Category :");
        String category=scanner.nextLine();
        System.out.println("Enter Expense Date (e.g:YYYY-MM-DD) :");
        String date=scanner.nextLine();
        ExpensesData e=new ExpensesData(description,amount,category,date);
        a.add(e);
    }
    public void displayExpenses(){
        if(a.isEmpty()){
            System.out.println("There are no Expenses...");
        }
        else{
            System.out.println("Expenses :");
        for(ExpensesData d:a) {
            System.out.println("Description :" + d.Description);
            System.out.println("Amount :" + d.Amount);
            System.out.println("Category :" + d.Category);
            System.out.println("Date :" + d.Date);
            System.out.println("----------------------");
        }
        }
    }
}
