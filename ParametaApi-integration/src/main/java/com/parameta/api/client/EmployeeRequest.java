//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.11 a las 09:39:05 AM COT 
//


package com.parameta.api.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hiringDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="positionRoleType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "names",
    "lastName",
    "documentType",
    "documentNumber",
    "dateOfBirth",
    "hiringDate",
    "positionRoleType",
    "salary"
})
@XmlRootElement(name = "EmployeeRequest")
public class EmployeeRequest {

    @XmlElement(required = true)
    protected String names;
    @XmlElement(required = true)
    protected String lastName;
    protected int documentType;
    @XmlElement(required = true)
    protected String documentNumber;
    @XmlElement(required = true)
    protected String dateOfBirth;
    @XmlElement(required = true)
    protected String hiringDate;
    protected int positionRoleType;
    protected double salary;

    /**
     * Obtiene el valor de la propiedad names.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNames() {
        return names;
    }

    /**
     * Define el valor de la propiedad names.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNames(String value) {
        this.names = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     */
    public int getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     */
    public void setDocumentType(int value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define el valor de la propiedad dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad hiringDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiringDate() {
        return hiringDate;
    }

    /**
     * Define el valor de la propiedad hiringDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiringDate(String value) {
        this.hiringDate = value;
    }

    /**
     * Obtiene el valor de la propiedad positionRoleType.
     * 
     */
    public int getPositionRoleType() {
        return positionRoleType;
    }

    /**
     * Define el valor de la propiedad positionRoleType.
     * 
     */
    public void setPositionRoleType(int value) {
        this.positionRoleType = value;
    }

    /**
     * Obtiene el valor de la propiedad salary.
     * 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Define el valor de la propiedad salary.
     * 
     */
    public void setSalary(double value) {
        this.salary = value;
    }

}
