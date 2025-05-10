
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reminder {
    private String date ;
    private int time ;
    private String title ;
    private static int counter = 1 ;
    public Reminder(){
    }
    public void addReminder(String date, int time, String title) {
        this.date = date;
        this.time = time;
        this.title = title;
        this.database();

    }

    public void database() {
        try (FileWriter databs = new FileWriter("database.txt" , true) ){

            String data = "Reminder "+ counter + ":\n"+"Date : "+date+"\n"+"Time : "+time+"\n"+"Title : "+title+"\n \n";
            counter++;
            databs.write(data);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void showReminder() {
        try {
            BufferedReader show = new BufferedReader(new FileReader("database.txt"));
            String line;
            while ((line = show.readLine()) != null) {
                System.out.println(line);
            }show.close();
        }catch (Exception e){
            System.out.println("error opening file: " +e.getMessage());
        }

    }
}
