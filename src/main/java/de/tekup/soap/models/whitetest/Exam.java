//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.22 à 02:19:14 PM WAT 
//


package de.tekup.soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exam", propOrder = {
    "code",
    "name"
})
public class Exam {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;

    public String getCode() {
        return code;
    }


    public void setCode(String value) {
        this.code = value;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }

}
