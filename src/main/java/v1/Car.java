package v1;

public class Car {

    private String name;
    private int step;

    public Car(String name) {
        this.name = name;
        this.step = 0;
    }

    public void proceed(int fuel) {
        if (FuelValidationUtils.isSufficient(fuel)) {
            this.step++;
        }
    }

    public int steps() {
        return this.step;
    }

    public String getName() {
        return this.name;
    }

    public void printSteps() {
        System.out.print(name + " : ");
        for (int i = 0; i < step ; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
