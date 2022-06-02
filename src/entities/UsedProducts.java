package entities;

import java.util.Date;

public class UsedProducts extends Product{
    public Date manufactureDate;

    public UsedProducts(){
        super();
    }

    public UsedProducts(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
