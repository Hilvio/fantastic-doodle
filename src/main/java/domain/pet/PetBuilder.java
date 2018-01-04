package domain.pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonnehirvi on 2018-01-02.
 */
public class PetBuilder {

    private Pet tempPet;

    public PetBuilder() {

        Pet aPet = new Pet();

        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("testurl");

        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag(1, "aTag"));

        aPet.setId(1);
        aPet.setName("Moose");
        aPet.setCategory(new Category(0, "aCategory"));
        aPet.setPhotoUrls(photoUrls);
        aPet.setTags(tags);
        aPet.setStatus("available");

        tempPet = aPet;

    }

    public PetBuilder withId(long id) {
        tempPet.setId(id);
        return this;
    }

    public Pet build() {
        return tempPet;
    }
}
