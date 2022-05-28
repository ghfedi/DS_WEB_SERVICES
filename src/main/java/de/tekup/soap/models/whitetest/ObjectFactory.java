//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.22 à 02:19:14 PM WAT 
//


package de.tekup.soap.models.whitetest;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


 
    public ObjectFactory() {
    }

    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }


    public WhiteTestResponse createWhiteTestResponse() {
        return new WhiteTestResponse();
    }

    public Student createStudent() {
        return new Student();
    }


    public Exam createExam() {
        return new Exam();
    }


    public Address createAddress() {
        return new Address();
    }

}
