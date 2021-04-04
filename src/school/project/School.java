/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.project;

import java.util.List;

public class School {

    static void UpdateTotalMoneySpent(int salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Teachers> teachers;
    private List<Student> students;
    private static int totalMoneySpent;
    private static int totalMoneyEarnt;

    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneySpent = 0;
        this.totalMoneyEarnt = 0;
    }

    /**
     *
     * @param add teacher to the school
     *
     */
    public void AddTeachers(Teachers teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return The teacher's name to the school.
     */
    public List<Teachers> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param Add student to the school.
     */
    public void AddStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the student's name.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param totalMoneySpent
     * @param update total money that spent from school.
     */
    
    public static void updateTotalMoneySpent(int totalMoneySpent) {
        totalMoneyEarnt -= totalMoneySpent;
    }

    /**
     *
     * @return the total of money that spent.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param update the Money that the school that earnt.
     */
    public static void UpdateTotalMoneyEarnt(int MoneyEarnt) {
        totalMoneyEarnt += MoneyEarnt;
    }

    /**
     *
     * @return all the money that school earn.
     */
    public int getTotalMoneyEarnt() {
        return totalMoneyEarnt;
    }

}
