
package com.mitocode.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para op_asignar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="op_asignar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obj_usuario" type="{http://impl.service.mitocode.com/}usuario" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://impl.service.mitocode.com/}rol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "op_asignar", propOrder = {
    "objUsuario",
    "rol"
})
public class OpAsignar {

    @XmlElement(name = "obj_usuario")
    protected Usuario objUsuario;
    protected List<Rol> rol;

    /**
     * Obtiene el valor de la propiedad objUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getObjUsuario() {
        return objUsuario;
    }

    /**
     * Define el valor de la propiedad objUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setObjUsuario(Usuario value) {
        this.objUsuario = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rol }
     * 
     * 
     */
    public List<Rol> getRol() {
        if (rol == null) {
            rol = new ArrayList<Rol>();
        }
        return this.rol;
    }

}
