package org.rkm.Setter;

public class PhoneBean {
    private String brand;
    private int id;

   /* public PhoneBean(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }
*/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void getDetails(){
        System.out.println("Brand is "+brand+" and id is "+id);
    }

    public void close(){
        System.out.println("This is destroy method");
    }
    public void start(){
        System.out.println("This is init method");
    }
}
