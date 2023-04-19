package sg.edu.nus.iss;

public class Employee {
    private String staffNumber;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private Integer salary;

    //constructors

    public Employee() {
    }
    
    public Employee(String staffNumber, String fullName, String department, String role, String emailAddress,
            Integer salary) {
        this.staffNumber = staffNumber;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }

    // getters and setters

    public String getStaffNumber() {
        return staffNumber;
    }
    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // toString()

    @Override
    public String toString() {
        return "Employee [staffNumber=" + staffNumber + ", fullName=" + fullName + ", department=" + department
                + ", role=" + role + ", emailAddress=" + emailAddress + ", salary=" + salary + "]";
    }


    
}
