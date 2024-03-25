package v1;

public class Car {

    private String name;
    private int step;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int step) {
        this.name = name;
        this.step = step;
    }

    public void proceed(int fuel) {
        if (isSufficient(fuel)) {
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

    public boolean isSameStep(final int maxValue) {
        return step == maxValue;
    }

    private boolean isSufficient(int fuel) {
        return 4 <= fuel && fuel <= 9;
    }
}
