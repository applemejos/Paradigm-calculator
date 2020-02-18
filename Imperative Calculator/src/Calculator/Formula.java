package Calculator;

public class Formula extends MenuCalculator {

    public Formula() {
        super();
    }

    public double adds() {
        return this.getX() + this.getY();
    }

    public double subs() {
        return this.getX() - this.getY();
    }

    public double muls() {
        return this.getX() * this.getY();
    }

    public double divs() {
        double z = this.getY();
        if (z == 0) {
            return 0;
        }
        return this.getX() / z;
    }

    public double mods() {
        double z = this.getY();
        if (z == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
        }
        return this.getX() % this.getY();
    }
}
