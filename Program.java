import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    Input inp = new Input();
    Print pr = new Print();
    Read re = new Read();
    Write wr = new Write();
    ArrayList<Person> people = new ArrayList<>();
    GeoTree gt = new GeoTree();

    re.People_Read("people.txt", people);
    inp.InputPerson(people);
    pr.Print_People(people);
    wr.People_Writ("people.txt", people);

    System.out.println("\nРаспределите детей:");
    for (Person person : people) {
      System.out.printf("У %s есть дети?\n", person.GetFullName());
      System.out.println("Введите id детей через пробел или Enter, если детей нет");
      pr.Print_People(people);
      Scanner child = new Scanner(System.in);
      String[] id_child = child.nextLine().split(" ");
      if (id_child[0] == "") {
        continue;
      } else {
        for (int i = 0; i < id_child.length; i++) {
          int id_chil = Integer.parseInt(id_child[i]);
          int result = new Research(gt).Search(people.get(id_chil));
          if (result == 1) {
            System.out.println(people.get(id_chil) + " - Уже чей-то ребенок");
            continue;
          }
          if (person.GetYear_of_birth() < people.get(id_chil).GetYear_of_birth() - 15) {
            gt.Append(person, people.get(id_chil));
          } else {
            System.out.println("Родитель должен быть старше ребенка минимум на 15 лет");
          }
        }
        continue;
      }
    }

    System.out.println("Поиск детей");
    System.out.println("Введите id родителя для поиска детей:");
    pr.Print_People(people);

    Scanner parent = new Scanner(System.in);
    int id_parent = parent.nextInt();
    System.out.printf("У %s дети:\n", people.get(id_parent).Get_f_l_Name());
    ArrayList<Person> result = new ArrayList<>();
    result = new Research(gt).Spend(people.get(id_parent), Relationship.parent);
    for (Person person : result) {
      System.out.println(person);
    }
  }
}

enum Relationship {
  parent,
  children
}