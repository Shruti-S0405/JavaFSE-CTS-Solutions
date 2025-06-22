package Java_FSA;

class Employee {
    int employeeId;
    String employeeName;
    String position;
    double salary;

    Employee(int employeeId, String employeeName, String position, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.position = position;
    }
    @Override
    public String toString(){
        return "{ Employee ID: "+employeeId+ " , Employee Name: "+employeeName+" , Position: " +position+ " ,Salary "+salary+" }";
    }
}
