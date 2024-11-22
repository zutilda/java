import java.io.*;
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
                "Score of the certificate: %s, Surname: %s, Name: %s, Group: %s, Department: %s, Subject: %s, Assessmante: %d, Teacher: %s",
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
        return super.toString() + String.format(", Score USE: %d, The average score of the certificate: %.2f",
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
        return super.toString() + String.format(", Work place: %s, Post: %s, Education price: %.2f",
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
        return super.toString() + String.format(", Targeted company: %s, Education price: %.2f",
                enterpriseName, tuitionFee);
    }
}

class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add full time student");
            System.out.println("2. Add part time student");
            System.out.println("3. Add targeted student");
            System.out.println("4. Print the list of student");
            System.out.println("5. Sort by Surname and score USE");
            System.out.println("6. Save list to file");
            System.out.println("7. Exite");
            System.out.print("Select menu item: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter surname: ");
                    String fam = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter faculty number: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Enter assessment: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter USE score: ");
                    int egeScore = scanner.nextInt();
                    System.out.print("Enter the average score of the certificate: ");
                    double avgScore = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter theacher surname: ");
                    String teacher = scanner.nextLine();

                    students.add(new FullTimeStudent(id, fam, name, group, department, discipline, mark,
                            teacher, egeScore, avgScore));
                    break;
                }
                case 2: {
                    System.out.print("Enter surname: ");
                    String fam = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter faculty number: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Enter assessment: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter work place: ");
                    String workPlace = scanner.nextLine();
                    System.out.print("Enter post: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter education price: ");
                    double tuitionFee = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter theacher surname: ");
                    String teacher = scanner.nextLine();

                    students.add(new PartTimeStudent(id, fam, name, group, department, discipline, mark,
                            teacher, workPlace, position, tuitionFee));
                    break;
                }
                case 3: {
                    System.out.print("Enter surname: ");
                    String fam = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter faculty number: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String discipline = scanner.nextLine();
                    System.out.print("Enter assessment: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter target company name: ");
                    String enterprise = scanner.nextLine();
                    System.out.print("Enter education price: ");
                    double tuitionFee = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter theacher surname: ");
                    String teacher = scanner.nextLine();

                    students.add(new TargetedStudent(id, fam, name, group, department, discipline, mark,
                            teacher, enterprise, tuitionFee));
                    break;
                }
                case 4: {
                    if (students.isEmpty()) {
                        System.out.println("The list student is empty.");
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
                        System.out.println("The list student is empty.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.print("Enter File Name to save: ");
                    String fileName = scanner.nextLine();
                    saveStudentsToFile(students, fileName);
                    break;
                }
                case 7: {
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Try again.");
            }
        }

        System.out.println("Program completed.");
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
        System.out.println("List is sort by surname and score USE.");
    }

    private static void saveStudentsToFile(List<Student> students, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.println(student.toString());
            }
            System.out.println("List save to: " + fileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
