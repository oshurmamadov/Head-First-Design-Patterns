package factory.factory_method;

import factory.factory_method.la_store.LAPizzaStore;
import factory.factory_method.ny_store.NYPizzaStore;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore laPizzaStore = new LAPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("pipperoni");
        laPizzaStore.orderPizza("cheese");
        laPizzaStore.orderPizza("pipperoni");
    }
}
