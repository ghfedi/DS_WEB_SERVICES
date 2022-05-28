//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.22 à 02:19:14 PM WAT 
//


package de.tekup.soap.models.whitetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student",
    "exam",
    "date",
    "badRequests"
})
@XmlRootElement(name = "WhiteTestResponse")
public class WhiteTestResponse {

    @XmlElement(required = true)
    protected Student student;
    @XmlElement(required = true)
    protected Exam exam;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected List<String> badRequests;


    public Student getStudent() {
        return student;
    }


    public void setStudent(Student value) {
        this.student = value;
    }


    public Exam getExam() {
        return exam;
    }


    public void setExam(Exam value) {
        this.exam = value;
    }


    public XMLGregorianCalendar getDate() {
        return date;
    }


    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }


    public List<String> getBadRequests() {
        if (badRequests == null) {
            badRequests = new ArrayList<String>();
        }
        return this.badRequests;
    }

}
