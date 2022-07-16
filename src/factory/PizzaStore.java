package factory;

abstract class PizzaStore {
    public final Pizza orderPizza(PizzaType type){
        System.out.println(type.name()+" 피자 주문을 받았음");
        return createPizza(type);
    }
    abstract protected Pizza createPizza(PizzaType pizzaType);
}
class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        System.out.println("뉴욕풍 치즈피자");
        return new NyPizza();
    }
}
class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        System.out.println("시카고풍 해물피자");
        return new ChicagoPizza();
    }
}