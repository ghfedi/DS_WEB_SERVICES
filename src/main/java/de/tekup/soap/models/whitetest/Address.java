

package de.tekup.soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "street",
    "city",
    "posteCode"
})
public class Address {

    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "poste-code")
    protected int posteCode;

  
    public String getStreet() {
        return street;
    }


    public void setStreet(String value) {
        this.street = value;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String value) {
        this.city = value;
    }


    public int getPosteCode() {
        return posteCode;
    }


    public void setPosteCode(int value) {
        this.posteCode = value;
    }

}
