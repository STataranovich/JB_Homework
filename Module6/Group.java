package Module6;

import java.util.Scanner;

public class Group {
    private static Students[] studentsArray;
    private static int countOfStudents;
    private static double avgGroupMark;
    private static int countOtlichnik = 0;
    private static int countDvoechnik = 0;
    private static Scanner sc = new Scanner(System.in);
    public int getCountOfStudents() {
        return countOfStudents;
    }
    public void setCountOfStudents(int countOfStudents) {
        Group.countOfStudents = countOfStudents;
    }
    public Students[] getStudentsArray() {
        return studentsArray;
    }
    public void setStudentsArray(Students[] studentsArray) {
        Group.studentsArray = studentsArray;
    }
    public double getAvgGroupMark() {
        return avgGroupMark;
    }
    public void setAvgGroupMark(double avgGroupMark) {
        Group.avgGroupMark = avgGroupMark;
    }
    public int getCountOtlichnik() {
        return countOtlichnik;
    }

    public void setCountOtlichnik(int countOtlichnik) {
        Group.countOtlichnik = countOtlichnik;
    }

    public int getCountDvoechnik() {
        return countDvoechnik;
    }

    public void setCountDvoechnik(int countDvoechnik) {
        Group.countDvoechnik = countDvoechnik;
    }
    public int enterCountOfStudents() {
        System.out.print("Количество студентов: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Количество студентов: ");
        }
        countOfStudents = sc.nextInt();
        return countOfStudents;
    }

    public void enterGroup(int countOfStudents) {
        Group.studentsArray = new Students[countOfStudents];
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            Students student = new Students();
            student.typeName();
            student.enterMarkForMathematics();
            student.enterMarkForChemie();
            student.enterMarkForPhysics();
            this.getStudentsArray()[i] = student;
        }
    }
    public void calcAvgMark() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].calcAvgMark();
        }
    }
    public void calcAvgGroupMark() {
        double temp = this.getAvgGroupMark();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            temp += this.getStudentsArray()[i].getMarkForMathematics();
            temp += this.getStudentsArray()[i].getMarkForChemie();
            temp += this.getStudentsArray()[i].getMarkForPhysics();
            this.setAvgGroupMark(temp);
        }
        this.setAvgGroupMark(this.getAvgGroupMark()/(this.getCountOfStudents()*3));
    }
    public void calcOtlichnik() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isOtlichnik()) {
                this.setCountOtlichnik(this.getCountOtlichnik() + 1);
            }
        }
    }

    public void calcDvoechnik() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isDvoechnik()) {
                this.setCountDvoechnik(this.getCountDvoechnik() + 1);
            }
        }
    }
    public void printGroup() {
        System.out.println();
        System.out.println("Количество студентов: " + getCountOfStudents());
        Students[] studentsArray = this.getStudentsArray();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].printStudent();
        }
        System.out.println();
        System.out.println("Средний балл: " + getAvgGroupMark());
        System.out.println("Количество отличников: " + getCountOtlichnik());
        System.out.println("Количество двоичников: " + getCountDvoechnik());
    }
}
