package tests;

import domain.pet.PetBuilder;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import domain.pet.Pet;
import steps.PetSteps;

/**
 * Created by jonnehirvi on 2018-01-01.
 */
@RunWith(SerenityRunner.class)
@WithTag("feature:Pet")
public class PetTest {

    @Steps
    PetSteps petSteps;

    @Test
    @Title("Add new pet to the store")
    public void addNewPetToStore() {

        Pet aPet = new PetBuilder()
                .withId(1)
                .build();

        petSteps.addPet(aPet);
        petSteps.requestIsSuccessfull();
    }

    @Test
    @Title("Remove a pet from the store")
    public void removePetFromStore() {

        Pet aPet = new PetBuilder()
                .withId(2)
                .build();

        petSteps.addPet(aPet);
        petSteps.removePetWithId(2);
        petSteps.requestIsSuccessfull();
    }
}
