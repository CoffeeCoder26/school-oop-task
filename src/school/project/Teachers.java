/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.project;

public class Teachers {

    /**
     * Class Attribute
     */
    private String TeacherName;
    private int TeacherId;
    private int TeacherSalary;
    private int TeacherFinanicalIncentives;

    /**
     * Initilze Teachers's Attribute in Constructor
     *
     * @param techName
     * @param techId
     * @param techSalary
     */
    public Teachers(int techId, String techName, int techSalary) {

        this.TeacherName = techName;
        this.TeacherId = techId;
        this.TeacherSalary = techSalary;
        this.TeacherFinanicalIncentives = 0;

    }

    /**
     * GetTechName Methods is used for return TeacherName.
     *
     * @return
     */
    public String GetTechName() {
        return this.TeacherName;
    }

    /**
     * GetId Method is used for return TeacherId.
     *
     * @return
     */
    public int GetTechId() {
        return this.TeacherId;
    }

    public void SetSalary(int salary) {
        this.TeacherSalary = salary;
    }

    /**
     * GetTechSalary Method is used for return TeacherSalary.
     *
     * @return
     */
    public double GetTechSalary() {
        return this.TeacherSalary;
    }

    public void TotalSalary(int salary) {

        TeacherFinanicalIncentives += salary;
        School.UpdateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Teacher Name is : " + this.TeacherName + " His Total Salary is :$ " + this.GetTechSalary();
    }

}
