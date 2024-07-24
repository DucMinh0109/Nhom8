package baiTapNhom;
public class FishCareRobot extends Robot implements FarmingRobot {
    public FishCareRobot(String id) {
        super(id, "FishCare");
    }

    public void harvest() {
        System.out.println(this.getId() + " is collecting fish from ponds.");
    }

    public void process() {
        System.out.println(this.getId() + " is processing fish for market.");
    }
}
