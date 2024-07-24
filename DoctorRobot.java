package baiTapNhom;

public class DoctorRobot extends Robot implements MedicalRobot {
    public DoctorRobot(String id) {
        super(id, "Doctor");
    }

    public void care() {
        System.out.println("Providing medical care.");
    }
}