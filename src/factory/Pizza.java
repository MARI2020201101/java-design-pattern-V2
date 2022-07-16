package factory;

interface Pizza {
}
class NyPizza implements Pizza{
    private Cheese cheese;
    private Dough dough;
    private Sauce sauce;

    private PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

    public NyPizza(){
        this.cheese = pizzaIngredientFactory.createCheese();
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();

    }
    public NyPizza(PizzaType type){

    }
}
class ChicagoPizza implements Pizza{
    private Cheese cheese;
    private Dough dough;
    private Sauce sauce;
    private PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
    public ChicagoPizza(){
        this.cheese = pizzaIngredientFactory.createCheese();
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
    }
    public ChicagoPizza(PizzaType type){

    }
}
