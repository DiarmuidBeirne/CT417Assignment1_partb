/*
CT417Assignment1_partb 
Author: 15331436 | Diarmuid Beirne

24 Oct 2018
*/

import com.diarmuidbeirne.ct417assignment1.*;
import org.joda.time.LocalDate;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.util.ArrayList;

public class driver {

    public static void main(String[] args)
    {
        //Create Modules DOB's
        LocalDate dob1 = new LocalDate(1999,12,02);
        LocalDate dob2 = new LocalDate(1997,11,07);
        LocalDate dob3 = new LocalDate(1993,05,15);
        LocalDate dob4 = new LocalDate(1998, 05,02);
        LocalDate dob5 = new LocalDate(1990, 12,30);

        //Create Modules Students
        Student student1 = new Student("Eamon",dob1,001);
        Student student2 = new Student("Cormac",dob2,002);
        Student student3 = new Student("Marc",dob3,003);
        Student student4 = new Student("Alan",dob4,004);
        Student student5 = new Student("Mac",dob5,005);

        //Create Mock Modules
        Module module1 = new Module("Soft Eng 3", 4001);
        Module module2 = new Module("Graphics & Img", 4002);
        Module module3 = new Module("Programming", 4003);

        //Create Mock Course
        LocalDate courseStartDate = new LocalDate(2018,9,01);
        LocalDate courseEndDate = new LocalDate(2018, 12, 02);
        Course course1 = new Course("4BCT",courseStartDate,courseEndDate);

        //Add Modules to Course
        ArrayList<Module> mockModuleList = new ArrayList<Module>();
        mockModuleList.add(module1);
        mockModuleList.add(module2);
        mockModuleList.add(module3);
        course1.setModuleList(mockModuleList);

        //Add Students to Modules
        //Add individual students to a module
        module1.addStudent(student1);
        module1.addStudent(student2);
        module1.addStudent(student3);
        module2.addStudent(student4);
        module2.addStudent(student5);
        //Create a list of students and assign List to module
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        module3.setStudents(studentList);


        //Print Modules assigned to course
        ArrayList<Module> moduleList;
        moduleList = course1.getModules();


        for (Module m : moduleList) {
            System.out.println(m.getModuleName());
        }


    }
}
