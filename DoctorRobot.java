package baiTapNhom;

public class DoctorRobot extends Robot implements MedicalRobot {
    public DoctorRobot(String id) {
        super(id, "Doctor");
    }

    public void care() {
        System.out.println(this.getId() + " is providing medical care.");
    }
    public void performSurgery() {
        System.out.println(this.getId() + " is performing surgery.");
    }
}