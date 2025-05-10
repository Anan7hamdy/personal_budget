import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// exoenses tracking class
public class Expenses {
    private int Amount;
    private String Category;
    private final int Budget;
    private String description;
    private static int remaining ;
    private static int counter = 1;

    public  Expenses(int Budget) {
        this.Budget = Budget;
        this.remaining = Budget;
    }
    public void addExpense( int Amount , String Category , String description) {
        this.Amount = Amount;
        this.Category = Category;
        this.description = description;
        remaining = Budget - Amount;
        database();

    }

    public void database() {
        try (FileWriter databs = new FileWriter("expensesdata.txt" , true) ){

            String expenseDetials = "Expense "+ counter + ":\n"+"Amount : "+Amount+"\n"+"Category : "+Category+"\n"+"Description : "+description+"\nRemaining budget: "+remaining+"\n \n";
            counter++;
            databs.write(expenseDetials);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void showExpenses(){
        try {
            BufferedReader show = new BufferedReader(new FileReader("expensesdata.txt"));
            String line1;
            while ((line1 = show.readLine()) != null) {
                System.out.println(line1);
            }show.close();
        }catch (Exception e){
            System.out.println("error opening file: " +e.getMessage());
        }
    }




    }

