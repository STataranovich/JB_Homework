package Module6;

import java.util.Scanner;

public class Students {
    public String name;
    public int markForMathematics;
    public int markForChemie;
    public int markForPhysics;
    private double avgMark;

    private static Scanner sc=new Scanner (System.in);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getMarkForMathematics() {
        return markForMathematics;
    }
    public void setMarkForMathematics(int markForMathematics) {
        this.markForMathematics=markForMathematics;
    }
    public int getMarkForChemie() {
        return markForChemie;
    }
    public void setMarkForChemie(int markForChemie) {
        this.markForChemie=markForChemie;
    }
    public int getMarkForPhysics() {
        return markForPhysics;
    }
    public void setMarkForPhysics(int markForPhysics) {
        this.markForPhysics=markForPhysics;
    }
    public double getAvgMark() {
        return avgMark;
    }
    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }
    public void typeName () {
        System.out.println();
        System.out.print("Имя студента: ");
        String temp = sc.nextLine();
        this.setName(temp);
    }
    public void enterMarkForMathematics() {
        System.out.print("Оценка по математике: ");
        while(!sc.hasNextInt()) {
            sc.next();
           System.out.print("Оценка по математике: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setMarkForMathematics(temp);
        } else {
            System.out.println("Неправильное значение");
            enterMarkForMathematics();
        }
    }
    public void enterMarkForChemie() {
        System.out.print("Оценка по химии: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Оценка по химии: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setMarkForChemie(temp);
        } else {
            System.out.println("Неправильное значение");
            enterMarkForChemie();
        }
    }
    public void enterMarkForPhysics() {
        System.out.print("Оценка по физике: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Оценка по физике: ");
        }
        int temp = sc.nextInt();
        if (temp > 0 && temp <= 10) {
            this.setMarkForPhysics(temp);
        } else {
            System.out.println("Неправильное значение");
            enterMarkForPhysics();
        }
    }
    public double calcAvgMark() {
        double avgMark = ((getMarkForMathematics() + getMarkForChemie() + getMarkForPhysics()) / 3);
        setAvgMark(avgMark);
        return avgMark;
    }
    public boolean isOtlichnik() {
        if(calcAvgMark() >= 9) {
            return true;
        } else {
            return false;}
    }
    public boolean isDvoechnik() {
        if (getMarkForMathematics() <= 2 || getMarkForChemie() <= 2 || getMarkForPhysics() <= 2) {
            return true;
        } else
        {return false;}
    }
    public void printStudent() {
        System.out.println();
        System.out.println("Имя студента: " + getName());
        System.out.println("Оценка по математике: " + getMarkForMathematics());
        System.out.println("Оценка по химии: " + getMarkForChemie());
        System.out.println("Оценка по физике: " + getMarkForPhysics());
        System.out.println("Средний балл: " + getAvgMark());
    }
}
