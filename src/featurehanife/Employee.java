package featurehanife;

public class Employee extends Person{
    private boolean isFullTime;
    private String jobTitle;
    private int employeeId;
    private double salary;
    private int  experienceInYears;

    public Employee(String name, char gender, int age, boolean isFullTime, String jobTitle, int employeeId, double salary, int experienceInYears) {
        super(name, gender, age);
        this.isFullTime = isFullTime;
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
        this.salary = salary;
        this.experienceInYears = experienceInYears;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public void work(){
        System.out.println(getName()+ " is working for "+experienceInYears+ " years.");
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


