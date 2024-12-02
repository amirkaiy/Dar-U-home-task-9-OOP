public class Main1 {
    public static void main(String[] args) {
        Student student = new Student("Arlen", 777);

        System.out.println("Имя студента: " + student.getName());
        System.out.println("ID студента: " + student.getId());
        System.out.println("Год обучения студента: " + student.getYearOfStudy());

        student.increaseYearOfStudy();
        System.out.println("Следующий год обучения студента: " + student.getYearOfStudy());
    }
}

//    1. Реализуйте класс Student. Студент имеет имя, id и год обучения.
//    Предоставьте конструктор с двумя параметрами и создайте методы для
//    доступа к имени, id и увеличения года обучения

class Student {

    private String name;
    private int id;
    private int yearOfStudy;

    public Student (String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }
}
