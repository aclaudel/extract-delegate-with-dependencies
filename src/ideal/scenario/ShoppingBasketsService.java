package ideal.scenario;

public class ShoppingBasketsService {

  CustomerApi customerApi;
  ShoppingBasketApi shoppingBasketApi;

  public ShoppingBasketsService(CustomerApi customerApi, ShoppingBasketApi shoppingBasketApi) {
    this.customerApi = customerApi;
    this.shoppingBasketApi = shoppingBasketApi;
  }

  ShoppingBaskets getShoppingBaskets(CustomerId customerId) {
    // collect data
    Customer customer = customerApi.find(customerId);
    ShoppingBaskets shoppingBaskets = shoppingBasketApi.getBasketsFor(customer);

    // apply some filters and business logic
    shoppingBaskets.removeInactiveBaskets();
    return shoppingBaskets;
  }
}