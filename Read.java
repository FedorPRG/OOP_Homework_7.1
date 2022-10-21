import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    static Scanner input = new Scanner(System.in);

    public void People_Read(String text, ArrayList<Person> people) throws Exception {
        System.out.printf("Загрузить список людей из файла? (0-да, 1-нет):");
        int a = input.nextInt();
        if (a == 0) {
            FileReader pr = new FileReader(text);
            Scanner scan = new Scanner(pr);
            while (scan.hasNextLine()) {
                String[] fullName = scan.nextLine().split(" ");
                int id = Integer.parseInt(fullName[0]);
                String first_Name = fullName[1];
                String Last_Name = fullName[2];
                int year_of_birth = Integer.parseInt(fullName[3]);
                people.add(new Person(id, first_Name, Last_Name, year_of_birth));
            }
            scan.close();
            pr.close();
        }
    }
}
