package baiTapNhom;

public class NurseRobot extends Robot implements MedicalRobot {
    public NurseRobot(String id) {
        super(id, "Nurse");
    }

    public void care() {
        System.out.println(this.getId() + "is assisting in medical care.");
    }
}