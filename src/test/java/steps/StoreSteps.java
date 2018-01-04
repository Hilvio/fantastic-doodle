package steps;

import domain.store.Order;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;

/**
 * Created by jonnehirvi on 2018-01-02.
 */
public class StoreSteps extends CommonSteps {

    private String endPoint = baseUrl + "/store/order";

    @Step("User places an order")
    public void placeOrder(Order order) {

        response = SerenityRest
                .given()
                    .contentType("application/json")
                    .body(order)
                .when()
                    .post(endPoint);
    }

    @Step("The order has correct status")
    public void orderHasStatus(String expectedStatus) {

        Order order = response.as(Order.class);
        Assert.assertThat("Unexpected order status! ", order.getStatus(), is(equalTo(expectedStatus)));
    }

    @Step("User removes the order")
    public Response removeOrderWithId(long id) {

        return SerenityRest
                .given().log().all()
                .when()
                .delete(endPoint + "/" + id);
    }
}
