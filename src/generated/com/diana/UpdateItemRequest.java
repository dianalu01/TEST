
package com.diana;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateItemRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateItemRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amountItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateItemRequest", propOrder = {
    "idItem",
    "nameItem",
    "descriptionItem",
    "amountItem"
})
public class UpdateItemRequest {

    @XmlElement(required = true)
    protected String idItem;
    @XmlElement(required = true)
    protected String nameItem;
    @XmlElement(required = true)
    protected String descriptionItem;
    @XmlElement(required = true)
    protected BigInteger amountItem;

    /**
     * Obtiene el valor de la propiedad idItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItem() {
        return idItem;
    }

    /**
     * Define el valor de la propiedad idItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItem(String value) {
        this.idItem = value;
    }

    /**
     * Obtiene el valor de la propiedad nameItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameItem() {
        return nameItem;
    }

    /**
     * Define el valor de la propiedad nameItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameItem(String value) {
        this.nameItem = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionItem() {
        return descriptionItem;
    }

    /**
     * Define el valor de la propiedad descriptionItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionItem(String value) {
        this.descriptionItem = value;
    }

    /**
     * Obtiene el valor de la propiedad amountItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountItem() {
        return amountItem;
    }

    /**
     * Define el valor de la propiedad amountItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountItem(BigInteger value) {
        this.amountItem = value;
    }

}
