package domain.pet;

import java.util.List;

/**
 * Created by jonnehirvi on 2018-01-01.
 */
public class Pet {

    private long id;
    private String name;
    private String status;
    private List<String> photoUrls;
    private List<Tag> tags;
    private Category category;

    protected Pet() {}

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }
}
