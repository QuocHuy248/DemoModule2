public class Student {
    private int id;
    private String name;
    private String school;
    private int age;

    enum Gender {
        MALE, FEMALE
    }

    ;
    private Gender gender;

    public Student(int id, String name, String school, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student s1 = new Student(123, "Huy", "NH", 18, Gender.MALE);
        System.out.println(s1);
    }

}
