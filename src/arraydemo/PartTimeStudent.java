/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author dhams
 */
public class PartTimeStudent extends Student{
    private int NumberofCourses;

    public int getNumberofCourses() {
        return NumberofCourses;
    }

    public void setNumberofCourses(int NumberofCourses) {
        this.NumberofCourses = NumberofCourses;
    }

    public PartTimeStudent(int NumberofCourses, int sID, String sName) {
        super(sID, sName);
        this.NumberofCourses = NumberofCourses;
    }
    
    
    
}
