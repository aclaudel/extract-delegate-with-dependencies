package extract.delegate;

public class GodClass {

  private ShoppingBasketsService shoppingBasketsService;
  private ShoppingSummaryRenderer shoppingViewRenderer;

  GodClass(CustomerApi customerApi, ShoppingBasketApi shoppingBasketApi, ShoppingSummaryRenderer shoppingViewRenderer) {
    shoppingBasketsService = new ShoppingBasketsService();
    this.shoppingBasketsService.setCustomerApi(customerApi);
    this.shoppingBasketsService.setShoppingBasketApi(shoppingBasketApi);
    this.shoppingViewRenderer = shoppingViewRenderer;
  }

  void render(CustomerId customerId) {
    ShoppingBaskets shoppingBaskets = shoppingBasketsService.getShoppingBaskets(customerId);

    // render data
    shoppingViewRenderer.render(shoppingBaskets);
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