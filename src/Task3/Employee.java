package Task3;

public class Employee {
    private Short employeeId;
    private String employeeName;
    private double salary;
    private byte leavesTaken;
    public Employee() {
    }
    public Employee(Short employeeId, String employeeName, double salary, byte leavesTaken) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.leavesTaken = leavesTaken;
    }
    public Short getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Short employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public byte getLeavesTaken() {
        return leavesTaken;
    }
    public void setLeavesTaken(byte leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + employeeId;
        result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + leavesTaken;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employeeId != other.employeeId)
            return false;
        if (employeeName == null) {
            if (other.employeeName != null)
                return false;
        } else if (!employeeName.equals(other.employeeName))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (leavesTaken != other.leavesTaken)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "[employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
                + ", leavesTaken=" + leavesTaken + "]";
    }
    
    
}
