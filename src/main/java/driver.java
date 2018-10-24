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

        //Create Mock Students
        Student student1 = new Student("Eamon",dob1,001);
        Student student2 = new Student("Cormac",dob2,002);
        Student student3 = new Student("Marc",dob3,003);
        Student student4 = new Student("Alan",dob4,004);
        Student student5 = new Student("Mack",dob5,005);

        //add the students to a list
       ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //Create Mock Modules
        Module module1 = new Module("Soft Eng 3", 4001);
        Module module2 = new Module("Graphics & Img", 4002);
        Module module3 = new Module("Programming", 4003);

        //Create Mock Courses
        LocalDate courseStartDate = new LocalDate(2018,9,01);
        LocalDate courseEndDate = new LocalDate(2018, 12, 02);
        Course course1 = new Course("4BCT",courseStartDate,courseEndDate);
        Course course2 = new Course("4BA",courseStartDate,courseEndDate);
        ArrayList<Course> courseList = new ArrayList<Course>();
        courseList.add(course1);
        courseList.add(course2);
        //Assign Courses to Students

            addStudentToCourse(student1, course1);
            addStudentToCourse(student2, course2);
            addStudentToCourse(student3, course2);
            addStudentToCourse(student4, course1);
            addStudentToCourse(student5, course1);



        //Add Modules to Course
        ArrayList<Module> mockModuleList = new ArrayList<Module>();
        mockModuleList.add(module1);
        mockModuleList.add(module2);
        mockModuleList.add(module3);
        for(Module m : mockModuleList)
        {
            addModuleToCourse(m, course1);
        }
        //Add only 2 modules to second course
        mockModuleList.remove(module1);
        for(Module m : mockModuleList)
        {
            addModuleToCourse(m, course2);
        }



        //Add Students to Modules
        addStudentToModule(student1, module1);
        addStudentToModule(student1, module2);
        addStudentToModule(student2, module2);
        addStudentToModule(student2, module3);
        addStudentToModule(student3, module2);
        addStudentToModule(student3, module3);
        addStudentToModule(student4, module1);
        addStudentToModule(student4, module2);
        addStudentToModule(student4, module3);
        addStudentToModule(student5, module1);
        addStudentToModule(student5, module2);





        //Print Modules assigned to each course with student Details

        ArrayList<Module> moduleList;



        for(Course c : courseList) {
            moduleList = c.getModules();
            System.out.println("\n\n" + c.getCourseName() + "\n");
            System.out.println("Modules:");
            for (Module m : moduleList) {
                System.out.println("\nModule Name:\t" + m.getModuleName());
                System.out.println("Students Registered");
                for (Student s : m.getStudents()) {
                    System.out.println(s.getFullName() + "\tUsername: " + s.getUsername() + "\tCourse: " + s.getEnrolledCourse().getCourseName());
                }

            }
        }

        //Print a list of All Students with their courses and Modules
        System.out.println("\n\n List of All Students Registered \n\n");
        for(Student s : studentList){
            System.out.println("Name: \t" + s.getFullName());
            System.out.println("Username: \t" + s.getUsername());
            System.out.println("Course: \t" + s.getEnrolledCourse().getCourseName());
            ArrayList<Module>  studentModules = s.getModuleList();
            System.out.println("Modules Registered");
            for(Module m : studentModules)
            {
                System.out.println(m.getModuleName());
            }
            System.out.println("\n");

        }



    }

    private static void addStudentToCourse(Student s, Course course)
    {
        s.setEnrolledCourse(course);
        course.addStudent(s);
    }

    private static void addStudentToModule(Student s, Module module)
    {
        s.addModule(module);
        module.addStudent(s);
    }

    private static void addModuleToCourse(Module m, Course c)
    {
        m.addCourse(c);
        c.addModule(m);
    }
}
