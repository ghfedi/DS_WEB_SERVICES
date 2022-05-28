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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId",
    "examCode"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    protected int studentId;
    @XmlElement(required = true)
    protected String examCode;


    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int value) {
        this.studentId = value;
    }

  
    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String value) {
        this.examCode = value;
    }

}
