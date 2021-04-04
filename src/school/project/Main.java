/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teachers Karim = new Teachers(1, "Karim", 1000);
        Teachers Omar = new Teachers(2, "Omar", 1500);
        Teachers Muhammed = new Teachers(3, "Muhammed", 1300);
        Teachers Ahmed = new Teachers(4, "Ahmed", 1200);
        /**
         * Add Teachers to the school
         */
        List<Teachers> TeacherList = new ArrayList<>();
        TeacherList.add(Karim);
        TeacherList.add(Omar);
        TeacherList.add(Muhammed);
        TeacherList.add(Ahmed);

        Student Amira = new Student(1, "Amira", 50);
        Student Alaa = new Student(2, "Alaa", 40);
        Student Esraa = new Student(3, "Esraa", 70);
        Student Eman = new Student(4, "Eman", 100);
        /**
         * Add students to that school
         */
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(Eman);
        StudentList.add(Alaa);
        StudentList.add(Esraa);
        StudentList.add(Amira);

        School Harvard = new School(TeacherList, StudentList);
        /**
         * Add new Teacher
         */
        Teachers Tarek = new Teachers(5, "Tarek", 1800);
        Harvard.AddTeachers(Tarek);

        /**
         * Student pay outlay
         */
        Amira.updateOutlay(5000);
        Alaa.updateOutlay(4000);
        Eman.updateOutlay(7000);
        System.out.println("Harvard School Has Earnt $ " + Harvard.getTotalMoneyEarnt());

        System.out.println("Harvard School Has Paid Salary to : " + Karim.GetTechName() + " And His Salaray is $ " + Karim.GetTechSalary()
                + " And Harvard School Has Total Money Now : $ " + (Harvard.getTotalMoneyEarnt() - Karim.GetTechSalary())
        );
        
        System.out.println(Omar);
        System.out.println(Amira);

    }

}
