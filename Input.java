import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner(System.in);

    public String[] Input_FullName() {
        while (true) {
            System.out.printf("Введите имя, фамилию и год рождения через пробелы: ");
            String[] str = input.nextLine().split(" ");
            if (Integer.parseInt(str[2]) > 2022) {
                System.out.printf("Год рождения %s введен не коректно (человек еще не родился)\n", str[2]);
                continue;
            }
            return str;
        }
    }

    public void InputPerson(ArrayList<Person> people) {
        // Scanner input = new Scanner(System.in);
        System.out.printf("Введите количество дополнительныйх записей (можно 0):");
        int amount = input.nextInt();

        for (int i = 0; i < amount; i++) {
            String[] fullName = Input_FullName();
            String first_Name = fullName[0];
            String Last_Name = fullName[1];
            int year_of_birth = Integer.parseInt(fullName[2]);
            people.add(new Person(i, first_Name, Last_Name, year_of_birth));
        }
    }
}