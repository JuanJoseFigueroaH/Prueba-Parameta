//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.19 a las 09:25:20 PM COT 
//


package com.parameta.api.web.ws.dto;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultCode",
    "resultMsg",
        "resultCompany",
        "resultBirthday"
})
@XmlRootElement(name = "EmployeeResponse")
public class EmployeeResponse {

    protected int resultCode;
    @XmlElement(required = true)
    protected String resultMsg;

    protected String resultCompany;

    protected String resultBirthday;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int value) {
        this.resultCode = value;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String value) {
        this.resultMsg = value;
    }

    public String getResultCompany() {
        return resultCompany;
    }

    public void setResultCompany(String resultCompany) {
        this.resultCompany = resultCompany;
    }

    public String getResultBirthday() {
        return resultBirthday;
    }

    public void setResultBirthday(String resultBirthday) {
        this.resultBirthday = resultBirthday;
    }
}
