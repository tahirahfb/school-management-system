/*
Created by Tahirah Farrer-Bradley
This class is responsible for keeping track of student fees, fees paid, name,  and grade.
*/ 

public class Student {
    
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
    The role of a constructor is to create a new object, by initializing the values. 
    Fees for every student is $30,000/year.
    Fees paid initially is 0. 
    @param id id for the student (unique).
    @param name name of the student.
    @param grade grade for the student.
    */

public Student(int id, String name, int grade){
    feesPaid = 0;
    feesTotal = 30000;
    this.id = id;
    this.name = name;
    this.grade = grade;
}

//Not going to alter student's name or student's id.

/*
Used to update the student's grade.
@param grade is new grade of the student.
*/

public void setGrade(int grade){
    this.grade = grade;
}

/*
Keep adding the fees to feesPaid field.
Add the fee to the fees paid. 
The school is going to receive the funds. 
@param fees the fees that the student pays.
*/

public void payFees(int fees){
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
}

//get methods return the id, name, grade, fees paid and total fees of the student

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public int getGrade(){
    return grade;
}

public int getFeesPaid(){
    return feesPaid;
}

public int getFeesTotal(){
    return feesTotal;
}

//@return the remaining fees.

public int getRemainingFees(){
   return feesTotal - feesPaid;
}

@Override
public String toString(){
    return "Student's name: " + name + ". Total fees paid thus far: $" + feesPaid;
}

}

