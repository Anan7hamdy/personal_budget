

import java.util.Scanner;
import java.io.File;






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MainChoice;
        int subChoice;
        System.out.print("Enter your Budget: ");
        int Budget= input.nextInt();
        System.out.println("===== Main Menu =====");
        System.out.println("1. Reminder 1");
        System.out.println("2. Expenses 2");
        System.out.println("3. exit 3");
        System.out.print("Enter your choice: ");

        MainChoice = input.nextInt();

        while (true) {
            switch (MainChoice) {

                case 1:
                    System.out.print("do you want to  \n 1.  Add Reminder. \n 2. Show Reminders. \n select (1,2,etc) ");
                    subChoice = input.nextInt();
                    Reminder r1 = new Reminder();
                    if (subChoice == 1) {
                        int time;
                        String date, title;
                        System.out.print("Enter date: ");
                        date = input.next();
                        System.out.print("Enter time: ");
                        time = input.nextInt();
                        System.out.print("Enter title: ");
                        title = input.next();
                        r1.addReminder(date, time, title);
                        continue;

                    } else if (subChoice == 2) {
                        r1.showReminder();
                        continue;
                    } else {
                        break;
                    }
                case 2:
                    System.out.print("do you want to  \n 1.  Add expense. 2. Show Reminders. \n select (1,2,etc) ");
                    subChoice = input.nextInt();
                    Expenses E1 = new Expenses(Budget);
                    if (subChoice == 1) {
                        int Amount;
                        String description, Category;
                        System.out.print("Enter The Amount : ");
                        Amount = input.nextInt();
                        System.out.print("Enter The Category : ");
                        Category = input.next();
                        System.out.print("Enter The Description : ");
                        description = input.next();
                        E1.addExpense(Amount, Category, description);
                        continue;
                    }else if (subChoice == 2) {
                        E1.showExpenses();
                        continue;
                    }else {
                        break;
                    }
                case 3:
                    break;
            }
        }
    }
}