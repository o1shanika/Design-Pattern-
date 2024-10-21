abstract class Beverage {
    // This is the template method
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (addCondiments()) {
            addExtras();
        }
    }

    // Abstract methods to be implemented by subclasses
    abstract void brew();
    abstract void addExtras();

    // Concrete methods
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method
    boolean addCondiments() {
        return true; // Default behavior, can be overridden by subclasses
    }
}

class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addExtras() {
        System.out.println("Adding lemon");
    }
}

class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addExtras() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean addCondiments() {
        return false; // Don't add extras for black coffee
    }
}

public class templateExample {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Making tea...");
        tea.prepareBeverage();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Making coffee...");
        coffee.prepareBeverage();
    }
}
