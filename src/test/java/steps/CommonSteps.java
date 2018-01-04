package steps;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import util.Environment;

/**
 * Created by jonnehirvi on 2018-01-03.
 */
public class CommonSteps {

    String baseUrl = Environment.BASE_URL;
    String apiKey = Environment.API_KEY;
    Response response;

    @Step("Request is executed successfully")
    public void requestIsSuccessfull() {
        response.then()
                .statusCode(200);
    }
}
