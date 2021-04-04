/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.project;

public class Student {

    /**
     * Student's Attribute Declaration
     */
    private String StudentName;
    private int StudentId;
    private double StudentGrade;
    private int StudentPaidOutlay;
    private int TotalOutlay;

    /**
     * Initilize Student's Attribute
     *
     * @param name
     * @param id
     * @param grade
     */
    Student(int id, String name, double grade) {

        this.StudentName = name;
        this.StudentId = id;
        this.StudentGrade = grade;
        this.StudentPaidOutlay = 0;
        this.TotalOutlay = 15000;

    }

    /**
     * SetGrade Function is for updating student's grade.
     */
    void setGrade(double grade) {

        this.StudentGrade = grade;
    }

    /**
     * UpdateOutlay function is for Adding Student's outlay.
     *
     * @param outlay
     */
    void updateOutlay(int outlay) {

        StudentPaidOutlay += outlay;
        School.UpdateTotalMoneyEarnt(StudentPaidOutlay);
    }

    /**
     * getStudentName() return the student name.
     *
     * @return
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * getStudentId() return the student id.
     *
     * @return
     */
    public int getStudentId() {
        return StudentId;
    }

    /**
     * getStudentGrade() return the student grade.
     *
     * @return
     */
    public double getStudentGrade() {
        return StudentGrade;
    }

    /**
     * getStudentPaidOutlay() return the outlay of student.
     *
     * @return
     */
    public int getStudentPaidOutlay() {
        return StudentPaidOutlay;
    }

    /**
     * getTotalOutlay() return the total outlay.
     *
     * @return
     */
    public int getTotalOutlay() {
        return TotalOutlay;
    }
    
    public int getRemainingOutlay(){
        return this.getTotalOutlay() - StudentPaidOutlay;
    }

    @Override
     public String toString() {
        return "Student Name is : " + this.StudentName + " His Outlay is $ " + this.StudentPaidOutlay;
    }
}
