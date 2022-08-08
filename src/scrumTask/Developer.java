package scrumTask;

public class Developer extends Employee {
    private String jobDefinition;

    public String getJobDefinition() {
        return jobDefinition;
    }

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    public Developer(String name, char gender, int age, boolean isFullTime, int employeeId, double salary, int experienceInYears, String jobDefinition) {
        super(name, gender, age, isFullTime, "Developer", employeeId, salary, experienceInYears);
        setJobDefinition(jobDefinition);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a " + getJobDefinition());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isFullTime=" + getIsFullTime() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", salary=" + getSalary() +
                ", experienceInYears=" + getExperienceInYears() +
                ", jobDefinition='" + jobDefinition + '\'' +
                '}';
    }
}


/*
    AAB) Class Developer
         jobDefinition(Frontend,Backend,Fullstack)
          work()

 */