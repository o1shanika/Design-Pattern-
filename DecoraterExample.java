// Interface
interface Pizza {
    String getDescription();
}

// Concrete component
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
// Abstract decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }
}
// Concrete decorators
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Cheese";
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Pepperoni";
    }
}

class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Mushroom";
    }
}

class ChickenDecorator extends PizzaDecorator {
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with Chicken";
    }
}
// The main public class in the file, named to match the filename
public class DecoraterExample {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription());

        Pizza cheesePizza = new CheeseDecorator(new PlainPizza());
        System.out.println(cheesePizza.getDescription());

        Pizza pepperoniPizza = new PepperoniDecorator(new PlainPizza());
        System.out.println(pepperoniPizza.getDescription());

        Pizza mushroomPizza = new MushroomDecorator(new PlainPizza());
        System.out.println(mushroomPizza.getDescription());

        Pizza chickenPizza = new ChickenDecorator(new PlainPizza());
        System.out.println(chickenPizza.getDescription());

        Pizza fullyLoadedPizza = new ChickenDecorator(new MushroomDecorator(new PepperoniDecorator(new CheeseDecorator(new PlainPizza()))));
        System.out.println(fullyLoadedPizza.getDescription());
    }
}
