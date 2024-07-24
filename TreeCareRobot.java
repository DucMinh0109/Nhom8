package baiTapNhom;
public class TreeCareRobot extends Robot implements FarmingRobot {
    public TreeCareRobot(String id) {
        super(id, "TreeCare");
    }

    public void harvest() {
        System.out.println(this.getId() + " is harvesting fruits from trees.");
    }

    public void process() {
        System.out.println(this.getId() + " is processing fruits for delivery.");
    }
    public void waterPlants() {
        System.out.println(this.getId() + " is watering the plants.");
    }

    public void pruneTrees() {
        System.out.println(this.getId() + " is pruning the trees.");
    }
}
