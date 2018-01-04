package tests;

import domain.store.Order;
import domain.store.OrderBuilder;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.StoreSteps;

/**
 * Created by jonnehirvi on 2018-01-02.
 */
@RunWith(SerenityRunner.class)
public class StoreTest {

    @After
    public void cleanUp() {
        storeSteps.removeOrderWithId(12);
    }

    @Steps
    StoreSteps storeSteps;

    @Test
    @Title("Place an order")
    @WithTag("feature:Inventory")
    public void placeOrder() {

        Order aOrder = new OrderBuilder()
                .withId(123)
                .withStatus("placed")
                .build();

        storeSteps.placeOrder(aOrder);
        storeSteps.requestIsSuccessfull();
        storeSteps.orderHasStatus("placed");
    }
}
