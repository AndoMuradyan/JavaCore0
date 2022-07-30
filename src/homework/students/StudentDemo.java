package homework.students;

import homework.students.command.Commands;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.model.User;
import homework.students.model.UserType;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;
import homework.students.storage.UserStorage;

import java.util.Scanner;

import static homework.students.command.Commands.*;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        initData();
        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command: ");
            }
        }


    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with" + emailPassword[0] + "does not exists!!");

        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }

    }

    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count: " + studentStorage.getSize());
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command: ");

            }
        }
    }


    private static void register() {
        System.out.println("please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct data!");
        } else {

            if (userStorage.getUserByEmail(userData[0]) == null) {

                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created!");
            } else {
                System.out.println("user with" + userData[0] + "already exists!");
            }
        }

    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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

    private static void initData() {
        User admin = new User("admin", "admin", "admin@mail.ru", "admin", UserType.ADMIN);
        userStorage.add(admin);
        Lesson java = new Lesson("java", "poxos", 7, 25000);
        Lesson mysql = new Lesson("mysql", "petros", 6, 15000);
        Lesson php = new Lesson("php", "poxosik", 8, 12000);
        lessonStorage.add(java);
        lessonStorage.add(php);
        lessonStorage.add(java);
        studentStorage.add(new Student("poxos", "poxosyan", 24, "515151", "gyumri", java, admin));
        studentStorage.add(new Student("poxos", "poxosyan", 24, "515555151", "gyumri", mysql, admin));
        studentStorage.add(new Student("poxos", "poxosyan", 24, "511", "gyumri", php, admin));
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
                Student student = new Student(name, surname, age, phoneNumber, city, lesson, currentUser);
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
