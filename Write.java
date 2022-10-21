import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Write {
    static Scanner input = new Scanner(System.in);

    public void People_Writ(String text, ArrayList<Person> people) throws Exception {
        System.out.printf("Записать список людей в файл? (0-да, 1-нет):");
        int a = input.nextInt();
        if (a == 0) {
            FileWriter pw = new FileWriter(text, false);
            for (Person human : people) {
                pw.write(human.GetFullName() + "\n");
                System.out.println(human);
            }
            pw.flush();
            pw.close();
        }
    }
}
