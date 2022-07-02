package homework.students;

import homework.students.command.Commands;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

import static homework.students.command.Commands.*;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "poxos", 7, 25000);
        Lesson mysql = new Lesson("mysql", "petros", 6, 15000);
        Lesson php = new Lesson("php", "poxosik", 8, 12000);
        lessonStorage.add(java);
        lessonStorage.add(php);
        lessonStorage.add(java);
        studentStorage.add(new Student("poxos", "poxosyan", 24, "515151", "gyumri", java));
        studentStorage.add(new Student("poxos", "poxosyan", 24, "515555151", "gyumri", mysql));
        studentStorage.add(new Student("poxos", "poxosyan", 24, "511", "gyumri", php));

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count: " + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command: ");

            }
        }


    }

    private static void addLesson() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("please input teacher name");
        String teacherName = scanner.nextLine();
        System.out.println("please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson create");
    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByLessonName(index);
        if (student == null) {
            System.out.println("Wrong index!!!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("please choose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                if (lesson != null) {
                    student.setLesson(lesson);
                    System.out.println("lesson changed!");
                }
            }

        }
    }

    private static void printStudentsByLessonName() {
        System.out.println("please input lesson name ");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {

        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("please choose correct index!!!");
                addStudent();
            } else {
                System.out.println("Please input student`s name");
                String name = scanner.nextLine();
                System.out.println("Please input student`s surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student`s phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student`s city");
                String city = scanner.nextLine();
                System.out.println("Please input student`s age");
                int age = Integer.parseInt(scanner.nextLine());
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("student created");
            }


        }


//
//        System.out.println("Please input student`s gender");
//        String genderStr = scanner.nextLine();
//        System.out.println("Please input student`s mail");
//        String mail = scanner.nextLine();
//
//        char gender = genderStr.charAt(0);
//        if (gender == 'M' || gender == 'F') {
//            System.out.println(gender);
//        } else {
//            System.out.println("invalid commands");
//        }


    }


}
