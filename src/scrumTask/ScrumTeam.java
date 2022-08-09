package scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam extends Person{
    public String PO,BA,SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> developersList = new ArrayList<>();


    public ScrumTeam(String name, char gender, int age) {
        super(name, gender, age);
    }

    public ScrumTeam(String name, char gender, int age, String PO, String BA, String SM, ArrayList<Tester> testersList, ArrayList<Developer> developersList, int daysOfSprint) {
        super(name, gender, age);
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testersList = testersList;
        this.developersList = developersList;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.getEmployeeId() == employeeID);
    }

    public void removeDeveloper(int employeeID){
        developersList.removeIf(p-> p.getEmployeeId()== employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                '}';
    }
}

