package extract.delegate;

public class ShoppingBasketsService {

  CustomerApi customerApi;

  public void setCustomerApi(CustomerApi customerApi) {
    this.customerApi = customerApi;
  }

  ShoppingBasketApi shoppingBasketApi;

  public void setShoppingBasketApi(ShoppingBasketApi shoppingBasketApi) {
    this.shoppingBasketApi = shoppingBasketApi;
  }

  public ShoppingBasketsService() {
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