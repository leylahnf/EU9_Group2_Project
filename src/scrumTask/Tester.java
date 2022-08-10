package scrumTask;

public class Tester extends Employee {
    //added comment again
    private String jobDefinition;

    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isFullTime=" + getIsFullTime() +
                ", jobTitle='" +getJobTitle() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", salary=" + getSalary()+
                ", experienceInYears=" + getExperienceInYears() +
                '}';
    }

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    public void work(){
        System.out.println(this.jobDefinition+" "+ this.getName()+" is testing");
    }
    public Tester(String name,String jobDefinition, char gender, int age, boolean isFullTime,  String jobTitle, int employeeId,double salary, int experienceInYears) {
        super(name, gender, age, isFullTime, "Tester", employeeId, salary, experienceInYears);
        this.jobDefinition=jobDefinition;
    }
}
