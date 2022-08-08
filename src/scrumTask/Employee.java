package scrumTask;

public class Employee extends Person{
    private boolean isFullTime;
    private String jobTitle;
    private int employeeId;
    private double salary;
    private int experienceInYears;

    public boolean getIsFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public Employee(String name, char gender, int age, boolean isFullTime, String jobTitle, int employeeId, double salary, int experienceInYears) {
        super(name, gender, age);
        setFullTime(isFullTime);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
        setExperienceInYears(experienceInYears);
    }

    public void work (){
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isFullTime=" + isFullTime +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", experienceInYears=" + experienceInYears +
                '}';
    }
}

/*
     AA) Class Employee
            isFullTime,
            jobTitle,employeeId,salary
            experienceInYears,
            work(),
 */