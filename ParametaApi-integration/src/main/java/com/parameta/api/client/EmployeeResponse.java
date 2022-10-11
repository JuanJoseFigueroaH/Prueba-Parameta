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
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
