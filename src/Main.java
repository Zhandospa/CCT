import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Number 1 is Add to student");
            System.out.println("Number 2 is stoped project");
            System.out.println("Number 3 is Show my Students");
            System.out.print("Sdelai vybor : ");
            int number = sc.nextInt();
            System.out.println();
            if (number == 3) {
                Student student = new Student();
                for (int i = 0; i < students.size(); i++) {
                    student = students.get(i);
                    int age = student.getage();
                    String name = student.getname();
                    int ID = student.getID();
                    System.out.print(name+" "+age+" "+ID);
                    System.out.println();
                }
                System.out.println();
            }
            if (number == 2) {
                break;
            }
            if (number == 1) {
                System.out.println("Write your age");
                int age = sc.nextInt();
                System.out.println("Write your name");
                String name = sc.next();
                System.out.println("Write your ID");
                int ID = sc.nextInt();
                Student student = new Student(age, name, ID);
                students.add(student);
            }
        }
    }
}