/*
CT417Assignment1_partb 
Author: 15331436 | Diarmuid Beirne

24 Oct 2018
*/

import com.diarmuidbeirne.ct417assignment1.*;
import org.joda.time.LocalDate;

public class driver {

    public static void main(String[] args)
    {
        //Create Test DOB's
        LocalDate dob1 = new LocalDate(1999,12,02);
        LocalDate dob2 = new LocalDate(1997,11,07);
        LocalDate dob3 = new LocalDate(1993,05,15);
        LocalDate dob4 = new LocalDate(1998, 05,02);
        LocalDate dob5 = new LocalDate(1990, 12,30);

        //Create Test Students
        Student student1 = new Student("Eamon",dob1,001);
        Student student2 = new Student("Cormac",dob2,002);
        Student student3 = new Student("Marc",dob3,003);
        Student student4 = new Student("Alan",dob4,004);
        Student student5 = new Student("Mac",dob5,005);


    }
}
