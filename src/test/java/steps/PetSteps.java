package steps;

import domain.pet.Pet;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

/**
 * Created by jonnehirvi on 2018-01-01.
 */
public class PetSteps extends CommonSteps {

    private String endPoint  = baseUrl + "/pet";

    @Step("User adds a pet to the store")
    public void addPet(Pet pet) {
        response = SerenityRest
                .given()
                    .contentType("application/json")
                    .body(pet)
                .when()
                    .post(endPoint);
    }

    @Step("User removes a pet from the store")
    public void removePetWithId(long id) {
        response = SerenityRest
                .given()
                    .header(new Header("api_key", apiKey))
                .when()
                    .delete(endPoint + "/" + id);
    }
}
