import java.util.*;

/*
Created by Tahirah Farrer-Bradley
A school can have many teachers and many students
Implement teachers and students using an ArrayList.
*/

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

/*
New school object is created.
@param teachers is list of teachers in the school
@param students is list of students in the school
*/    

public School(List<Teacher> teachers, List<Student> students){
    this.teachers = teachers;
    this.students = students;
    totalMoneyEarned = 0;
    totalMoneySpent = 0;
}

/*
Getters return list of teachers, list of students
Setters 
*/

public List<Teacher> getTeachers(){
    return teachers;
}

/*
Adds a teacher to the school
@param teacher the teacher to be added
*/
public void addTeacher(Teacher teacher){
    teachers.add(teacher);
}

//@returns the list of students in the school.

public List<Student> getStudents(){
    return students;
}

/*
Adds a student to a school
@param student the student to be added.
*/

public void addStudent(Student student){
    students.add(student);
}

//@returns the total money earned by the school.

public int getTotalMoneyEarned(){
    return totalMoneyEarned;
}

/*
Adds the total money earned by the school.
@param MoneyEarned money that is supposed to be added.
*/
public static void updateTotalMoneyEarned(int moneyEarned){
    totalMoneyEarned += moneyEarned;
}

//@returns the total money spent by the school

public int getTotalMoneySpent(){
    return totalMoneySpent;
}

/*
Update the money that is spent by the school
which is the salary given by the school to its teachers
@param MoneySpent the money spent by school
*/

public static void updateTotalMoneySpent(int moneySpent){
    totalMoneyEarned -= moneySpent;
}


}
