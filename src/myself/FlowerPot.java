package myself;

public class FlowerPot {
    private boolean alive = true;
    private final int minDailyWaterInMl;
    private int dailyWaterReceived = 0;

    public FlowerPot(int minDailyWaterInMl) {
        this.minDailyWaterInMl =  minDailyWaterInMl;
    }

    public boolean isAlive() {
        return this.alive;
    }
    public int getMinDailyWaterInMl() {
        return minDailyWaterInMl;
    }
    public void addWater(int amountInMl) {
       dailyWaterReceived += amountInMl;
    }
    public void liveAnotherDay() {
        System.out.printf("%s %s\n", dailyWaterReceived, minDailyWaterInMl);
        alive = dailyWaterReceived > minDailyWaterInMl;
        System.out.println(alive);
    }

    public void addWater(WaterSpray spray) {
        int water = spray.getRemainingWaterInMl();
        spray.spray();
        water -= spray.getRemainingWaterInMl();

        dailyWaterReceived += water;
    }
}
