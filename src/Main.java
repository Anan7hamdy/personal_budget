

import java.util.Scanner;
import java.io.File;






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainChoice;
        int subChoice;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("===== Main Menu =====");
        System.out.println("1. Option 1");
        System.out.println("2. Expenses 2");
        System.out.println("3. Option 3");
        System.out.print("Enter your choice: ");
        mainChoice = input.nextInt();
        while (true) {
            switch (mainChoice) {
                case 1:
                    System.out.print("do you want to  \n 1.  Add Reminder. 2. Show Reminders. \n select (1,2,etc) ");
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
                    break;
            }
        }
    }
}