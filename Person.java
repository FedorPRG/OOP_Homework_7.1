public class Person {
    private Integer id;
    private String first_Name;
    private String last_Name;
    private Integer year_of_birth;

    public String GetFullName() {
        return id + " " + first_Name + " " + last_Name + " " + year_of_birth + " года рождения";
    }

    public String Get_f_l_Name() {
        return first_Name + " " + last_Name;
    }

    public Integer GetIdName() {
        return id;
    }

    public Integer GetYear_of_birth() {
        return year_of_birth;
    }

    public Person(int id, String first_Name, String last_Name, int year_of_birth) {
        this.id = id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.year_of_birth = year_of_birth;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d года рождения", this.id, this.first_Name, this.last_Name, this.year_of_birth);
    }
}
