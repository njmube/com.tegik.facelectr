//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.27 at 04:03:07 PM CDT 
//


package com.tegik.facelectr.servicios.sat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expresionImpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "expresionImpresa"
})
@XmlRootElement(name = "Consulta", namespace="http://tempuri.org/")
public class Consulta {

    @XmlElement(required = true, namespace="http://tempuri.org/")
    protected String expresionImpresa;

    /**
     * Gets the value of the expresionImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpresionImpresa() {
        return expresionImpresa;
    }

    /**
     * Sets the value of the expresionImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpresionImpresa(String value) {
        this.expresionImpresa = value;
    }

}
