import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String idStudent;
    private String fam;
    private String name;
    private String group;
    private String department;
    private String discipline;
    private int mark;
    private String nameTeacher;

    public Student(String idStudent, String fam, String name, String group, String department,
            String discipline, int mark, String nameTeacher) {
        this.idStudent = idStudent;
        this.fam = fam;
        this.name = name;
        this.group = group;
        this.department = department;
        this.discipline = discipline;
        this.mark = mark;
        this.nameTeacher = nameTeacher;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getFam() {
        return fam;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getDepartment() {
        return department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getMark() {
        return mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    @Override
    public String toString() {
        return String.format(
                "Номер зачётной книжки: %s, Фамилия: %s, Имя: %s, Группа: %s, Кафедра: %s, Дисциплина: %s, Оценка: %d, Преподаватель: %s",
                idStudent, fam, name, group, department, discipline, mark, nameTeacher);
    }
}

class FullTimeStudent extends Student {
    private int egeScore;
    private double averageCertificateScore;

    public FullTimeStudent(String idStudent, String fam, String name, String group, String department,
            String discipline, int mark, String nameTeacher, int egeScore, double averageCertificateScore) {
        super(idStudent, fam, name, group, department, discipline, mark, nameTeacher);
        this.egeScore = egeScore;
        this.averageCertificateScore = averageCertificateScore;
    }

    public int getEgeScore() {
        return egeScore;
    }

    public double getAverageCertificateScore() {
        return averageCertificateScore;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Балл ЕГЭ: %d, Средний балл аттестата: %.2f",
                egeScore, averageCertificateScore);
    }
}

class PartTimeStudent extends Student {
    private String workPlace;
    private String position;
    private double tuitionFee;

    public PartTimeStudent(String idStudent, String fam, String name, String group, String department,
            String discipline, int mark, String nameTeacher, String workPlace,
            String position, double tuitionFee) {
        super(idStudent, fam, name, group, department, discipline, mark, nameTeacher);
        this.workPlace = workPlace;
        this.position = position;
        this.tuitionFee = tuitionFee;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public String getPosition() {
        return position;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Место работы: %s, Должность: %s, Сумма обучения: %.2f",
                workPlace, position, tuitionFee);
    }
}

class TargetedStudent extends Student {
    private String enterpriseName;
    private double tuitionFee;

    public TargetedStudent(String idStudent, String fam, String name, String group, String department,
            String discipline, int mark, String nameTeacher, String enterpriseName,
            double tuitionFee) {
        super(idStudent, fam, name, group, department, discipline, mark, nameTeacher);
        this.enterpriseName = enterpriseName;
        this.tuitionFee = tuitionFee;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Целевое предприятие: %s, Сумма обучения: %.2f",
                enterpriseName, tuitionFee);
    }
}

class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента очного отделения");
            System.out.println("2. Добавить студента заочного отделения");
            System.out.println("3. Добавить студента целевого обучения");
            System.out.println("4. Печать списка студентов");
            System.out.println("5. Сортировка по фамилии и баллам ЕГЭ");
            System.out.println("6. Выйти");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Введите фамилию: ");
                    String fam = scanner.nextLine();
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер зачётной книжки: ");
                    String id = scanner.nextLine();
                    System.out.print("Введите группу: ");
                    String group = scanner.nextLine();
                    System.out.print("Введите кафедру: ");
                    String department = scanner.nextLine();
                    System.out.print("Введите дисциплину: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Введите оценку: ");
                    int mark = scanner.nextInt();
                    System.out.print("Введите балл ЕГЭ: ");
                    int egeScore = scanner.nextInt();
                    System.out.print("Введите средний балл аттестата: ");
                    double avgScore = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Введите фамилию преподавателя: ");
                    String teacher = scanner.nextLine();

                    students.add(new FullTimeStudent(id, fam, name, group, department, discipline, mark,
                            teacher, egeScore, avgScore));
                    break;
                }
                case 2: {
                    System.out.print("Введите фамилию: ");
                    String fam = scanner.nextLine();
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер зачётной книжки: ");
                    String id = scanner.nextLine();
                    System.out.print("Введите группу: ");
                    String group = scanner.nextLine();
                    System.out.print("Введите кафедру: ");
                    String department = scanner.nextLine();
                    System.out.print("Введите дисциплину: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Введите оценку: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите место работы: ");
                    String workPlace = scanner.nextLine();
                    System.out.print("Введите должность: ");
                    String position = scanner.nextLine();
                    System.out.print("Введите сумму обучения: ");
                    double tuitionFee = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Введите фамилию преподавателя: ");
                    String teacher = scanner.nextLine();

                    students.add(new PartTimeStudent(id, fam, name, group, department, discipline, mark,
                            teacher, workPlace, position, tuitionFee));
                    break;
                }
                case 3: {
                    System.out.print("Введите фамилию: ");
                    String fam = scanner.nextLine();
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер зачётной книжки: ");
                    String id = scanner.nextLine();
                    System.out.print("Введите группу: ");
                    String group = scanner.nextLine();
                    System.out.print("Введите кафедру: ");
                    String department = scanner.nextLine();
                    System.out.print("Введите дисциплину: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Введите оценку: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите название целевого предприятия: ");
                    String enterprise = scanner.nextLine();
                    System.out.print("Введите сумму обучения: ");
                    double tuitionFee = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Введите фамилию преподавателя: ");
                    String teacher = scanner.nextLine();

                    students.add(new TargetedStudent(id, fam, name, group, department, discipline, mark,
                            teacher, enterprise, tuitionFee));
                    break;
                }
                case 4: {
                    if (students.isEmpty()) {
                        System.out.println("Список студентов пуст.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                }
                case 5: {
                    sortByFamAndEgeScore(students);

                    if (students.isEmpty()) {
                        System.out.println("Список студентов пуст.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                }
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }

    private static void sortByFamAndEgeScore(List<Student> students) {
        students.removeIf(student -> !(student instanceof FullTimeStudent));

        students.sort((s1, s2) -> {
            FullTimeStudent f1 = (FullTimeStudent) s1;
            FullTimeStudent f2 = (FullTimeStudent) s2;

            if (f1.getEgeScore() != 0 && f2.getEgeScore() != 0) {
                int famCompare = f1.getFam().compareTo(f2.getFam());
                if (famCompare != 0) {
                    return famCompare;
                }
                return Integer.compare(f1.getEgeScore(), f2.getEgeScore());
            }
            return 0;
        });
        System.out.println("Список студентов отсортирован по фамилии и баллу ЕГЭ.");
    }
}
