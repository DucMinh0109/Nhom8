package baiTapNhom;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Robot> robots;

    public Team(String teamName) {
        this.teamName = teamName;
        this.robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void displayWelcome() {
        System.out.println("***************WELCOME TO***************");
        System.out.println("****************" + this.teamName + "*****************");
    }
}


