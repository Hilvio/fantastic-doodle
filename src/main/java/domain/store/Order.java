package domain.store;

/**
 * Created by jonnehirvi on 2018-01-02.
 */
public class Order {

    private long id;
    private long petId;
    private long quantity;
    private String shipDate;
    private String status;
    private boolean complete;

    protected Order() {}

    public void setId(long id) {
        this.id = id;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getStatus() {
        return status;
    }
}

