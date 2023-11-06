/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package CDIBaan;

//import Client.AddressClient;
import Client.addressClient;
import Entity.Address;
import Entity.Customer;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Dell
 */
@Named(value = "addressBean")
@RequestScoped
public class AddressBean {

    addressClient ac;
    Response rs;
    String city, state;
    String ename;
    int cid;
    Collection<Address> ads;
    GenericType<Collection<Address>> gads;
    Collection<Customer> cus;
    GenericType<Collection<Customer>> gcus;
    
    private Address address = new Address();

//    Collection<>
    public AddressBean() {
        ac = new addressClient();
        ads = new ArrayList<>();
        gads = new GenericType<Collection<Address>>() {};
        cus = new ArrayList<>();
        gcus = new GenericType<Collection<Customer>>(){};
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Collection<Address> getAds() {
        return ads;
    }

    public void setAds(Collection<Address> ads) {
        this.ads = ads;
    }

    public GenericType<Collection<Address>> getGads() {
        return gads;
    }

    public void setGads(GenericType<Collection<Address>> gads) {
        this.gads = gads;
    }

    public Collection<Customer> getCus() {
        return cus;
    }

    public void setCus(Collection<Customer> cus) {
        this.cus = cus;
    }

    public GenericType<Collection<Customer>> getGcus() {
        return gcus;
    }

    public void setGcus(GenericType<Collection<Customer>> gcus) {
        this.gcus = gcus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
