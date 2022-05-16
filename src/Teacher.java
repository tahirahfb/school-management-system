/*
Created by Tahirah Farrer-Bradley
This class is responsible for keeping track of teacher's name, id, and salary.
 */


public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

/*
This constructor creates a new Teacher object.
@param id id for the teacher.
@param name name of the teacher.
@param salary salary of the teacher.
*/    

public Teacher(int id, String name, int salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.salaryEarned = 0;
}    

/*
get methods @returns the id, name, and salary for the teacher. 
*/

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public int getSalary(){
    return salary;
}

//sets the salary

public void setSalary(int salary){
    this.salary = salary;
}


/*
Adds to the salaryEarned
Removes from the total money earned by the school.
@param salary
*/
public void receiveSalary(int salary){
    salaryEarned += salary;
    School.updateTotalMoneySpent(salary);

}

@Override
public String toString(){
    return "Name of the teacher: " + name + ". Total salary earned so far $" + salaryEarned;
}

}
