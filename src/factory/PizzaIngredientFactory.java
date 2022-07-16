package factory;

interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}
class NyPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new HardDough();
    }

    @Override
    public Sauce createSauce() {
        return new BazilSource();
    }

    @Override
    public Cheese createCheese() {
        return new LongCheese();
    }
}
class ChicagoIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSource();
    }

    @Override
    public Cheese createCheese() {
        return new SimpleCheese();
    }
}