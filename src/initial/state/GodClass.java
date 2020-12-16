package initial.state;

public class GodClass {

  private CustomerApi customerApi;
  private ShoppingBasketApi shoppingBasketApi;
  private ShoppingSummaryRenderer shoppingViewRenderer;

  GodClass(CustomerApi customerApi,
      ShoppingBasketApi shoppingBasketApi,
      ShoppingSummaryRenderer shoppingViewRenderer) {
    this.customerApi = customerApi;
    this.shoppingBasketApi = shoppingBasketApi;
    this.shoppingViewRenderer = shoppingViewRenderer;
  }

  void render(CustomerId customerId) {
    ShoppingBaskets shoppingBaskets = getShoppingBaskets(customerId);

    // render data
    shoppingViewRenderer.render(shoppingBaskets);
  }

  private ShoppingBaskets getShoppingBaskets(CustomerId customerId) {
    // collect data
    Customer customer = customerApi.find(customerId);
    ShoppingBaskets shoppingBaskets = shoppingBasketApi.getBasketsFor(customer);

    // apply some filters and business logic
    shoppingBaskets.removeInactiveBaskets();
    return shoppingBaskets;
  }
}

class Customer {}
class CustomerId {}


class CustomerApi {

  public Customer find(CustomerId customerId) {
    return null;
  }
}

class ShoppingBaskets {

  public void removeInactiveBaskets() {

  }

  ;
}
class ShoppingBasketApi {

  public ShoppingBaskets getBasketsFor(Customer customer) {
    return null;
  }
}
class ShoppingSummaryRenderer {

  public void render(ShoppingBaskets shoppingBaskets) {

  }
}