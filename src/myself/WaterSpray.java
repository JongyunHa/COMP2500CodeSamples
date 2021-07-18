package myself;

public class WaterSpray {
    private static final int CAPACITY = 200;
    private int remainingWaterInMl = 0;

    public WaterSpray(int remainingWaterInMl) {
        this.remainingWaterInMl = remainingWaterInMl;
    }

    public int getRemainingWaterInMl() {
        return remainingWaterInMl;
    }

    public void addWater(int amountInMl) {
        this.remainingWaterInMl += amountInMl;
    }

    public void spray() {
        this.remainingWaterInMl -= Math.min(this.remainingWaterInMl, 5);
        this.remainingWaterInMl = Math.min(this.remainingWaterInMl, CAPACITY);
    }

    public void fillUp() {
        this.remainingWaterInMl = CAPACITY;
    }

}
