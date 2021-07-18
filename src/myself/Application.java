package myself;

public class Application {
    public static void main (String[] args) {
        WaterSpray waterSpray = new WaterSpray(100);
        waterSpray.fillUp();
        FlowerPot flowerPot = new FlowerPot(10);
        int water = waterSpray.getRemainingWaterInMl();
        waterSpray.spray();
        water -= waterSpray.getRemainingWaterInMl();
        waterSpray.addWater(water);
        flowerPot.liveAnotherDay();

        System.out.printf("How much water is left? %d\n", waterSpray.getRemainingWaterInMl());
        System.out.printf("pot is alive? %s\n", flowerPot.isAlive());

    }
}
