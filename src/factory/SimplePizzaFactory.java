package factory;

interface SimplePizzaFactory {
    Pizza createPizza(PizzaType type);
}
class NYPizzaFactory implements SimplePizzaFactory{
    @Override
    public Pizza createPizza(PizzaType type) {
        return null;
    }
}
class ChicagoPizzaFactory implements SimplePizzaFactory{
    @Override
    public Pizza createPizza(PizzaType type) {
        return null;
    }
}