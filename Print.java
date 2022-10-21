import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    static Scanner input = new Scanner(System.in);

    public void Print_People(ArrayList<Person> people) {
        System.out.printf("Вывести на экран список людей? (0-да, Enter-нет):");

        String[] sp = input.nextLine().split(" ");
        if (sp[0] != "") {
            int a = Integer.parseInt(sp[0]);
            if (a == 0) {
                for (Person human : people) {
                    System.out.println(human);
                }
            }
        }
    }
}