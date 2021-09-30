
package com.mitocode.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mitocode.service.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OpAsignarResponse_QNAME = new QName("http://impl.service.mitocode.com/", "op_asignarResponse");
    private final static QName _Listar_QNAME = new QName("http://impl.service.mitocode.com/", "listar");
    private final static QName _Registrar_QNAME = new QName("http://impl.service.mitocode.com/", "registrar");
    private final static QName _ListarResponse_QNAME = new QName("http://impl.service.mitocode.com/", "listarResponse");
    private final static QName _ModificarResponse_QNAME = new QName("http://impl.service.mitocode.com/", "modificarResponse");
    private final static QName _Rol_QNAME = new QName("http://impl.service.mitocode.com/", "rol");
    private final static QName _Exception_QNAME = new QName("http://impl.service.mitocode.com/", "Exception");
    private final static QName _IsAutenticar_QNAME = new QName("http://impl.service.mitocode.com/", "isAutenticar");
    private final static QName _RegistrarResponse_QNAME = new QName("http://impl.service.mitocode.com/", "registrarResponse");
    private final static QName _ListarPorIdResponse_QNAME = new QName("http://impl.service.mitocode.com/", "listarPorIdResponse");
    private final static QName _ListarRolesPorUsuario_QNAME = new QName("http://impl.service.mitocode.com/", "listarRolesPorUsuario");
    private final static QName _OpAsignar_QNAME = new QName("http://impl.service.mitocode.com/", "op_asignar");
    private final static QName _Modificar_QNAME = new QName("http://impl.service.mitocode.com/", "modificar");
    private final static QName _IsAutenticarResponse_QNAME = new QName("http://impl.service.mitocode.com/", "isAutenticarResponse");
    private final static QName _ListarRolesPorUsuarioResponse_QNAME = new QName("http://impl.service.mitocode.com/", "listarRolesPorUsuarioResponse");
    private final static QName _ListarPorId_QNAME = new QName("http://impl.service.mitocode.com/", "listarPorId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mitocode.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpAsignarResponse }
     * 
     */
    public OpAsignarResponse createOpAsignarResponse() {
        return new OpAsignarResponse();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ModificarResponse }
     * 
     */
    public ModificarResponse createModificarResponse() {
        return new ModificarResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link IsAutenticar }
     * 
     */
    public IsAutenticar createIsAutenticar() {
        return new IsAutenticar();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ListarPorIdResponse }
     * 
     */
    public ListarPorIdResponse createListarPorIdResponse() {
        return new ListarPorIdResponse();
    }

    /**
     * Create an instance of {@link ListarRolesPorUsuario }
     * 
     */
    public ListarRolesPorUsuario createListarRolesPorUsuario() {
        return new ListarRolesPorUsuario();
    }

    /**
     * Create an instance of {@link IsAutenticarResponse }
     * 
     */
    public IsAutenticarResponse createIsAutenticarResponse() {
        return new IsAutenticarResponse();
    }

    /**
     * Create an instance of {@link ListarRolesPorUsuarioResponse }
     * 
     */
    public ListarRolesPorUsuarioResponse createListarRolesPorUsuarioResponse() {
        return new ListarRolesPorUsuarioResponse();
    }

    /**
     * Create an instance of {@link Modificar }
     * 
     */
    public Modificar createModificar() {
        return new Modificar();
    }

    /**
     * Create an instance of {@link OpAsignar }
     * 
     */
    public OpAsignar createOpAsignar() {
        return new OpAsignar();
    }

    /**
     * Create an instance of {@link ListarPorId }
     * 
     */
    public ListarPorId createListarPorId() {
        return new ListarPorId();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link UsuarioRol }
     * 
     */
    public UsuarioRol createUsuarioRol() {
        return new UsuarioRol();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpAsignarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "op_asignarResponse")
    public JAXBElement<OpAsignarResponse> createOpAsignarResponse(OpAsignarResponse value) {
        return new JAXBElement<OpAsignarResponse>(_OpAsignarResponse_QNAME, OpAsignarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "modificarResponse")
    public JAXBElement<ModificarResponse> createModificarResponse(ModificarResponse value) {
        return new JAXBElement<ModificarResponse>(_ModificarResponse_QNAME, ModificarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "rol")
    public JAXBElement<Rol> createRol(Rol value) {
        return new JAXBElement<Rol>(_Rol_QNAME, Rol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAutenticar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "isAutenticar")
    public JAXBElement<IsAutenticar> createIsAutenticar(IsAutenticar value) {
        return new JAXBElement<IsAutenticar>(_IsAutenticar_QNAME, IsAutenticar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "registrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listarPorIdResponse")
    public JAXBElement<ListarPorIdResponse> createListarPorIdResponse(ListarPorIdResponse value) {
        return new JAXBElement<ListarPorIdResponse>(_ListarPorIdResponse_QNAME, ListarPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRolesPorUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listarRolesPorUsuario")
    public JAXBElement<ListarRolesPorUsuario> createListarRolesPorUsuario(ListarRolesPorUsuario value) {
        return new JAXBElement<ListarRolesPorUsuario>(_ListarRolesPorUsuario_QNAME, ListarRolesPorUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpAsignar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "op_asignar")
    public JAXBElement<OpAsignar> createOpAsignar(OpAsignar value) {
        return new JAXBElement<OpAsignar>(_OpAsignar_QNAME, OpAsignar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modificar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "modificar")
    public JAXBElement<Modificar> createModificar(Modificar value) {
        return new JAXBElement<Modificar>(_Modificar_QNAME, Modificar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAutenticarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "isAutenticarResponse")
    public JAXBElement<IsAutenticarResponse> createIsAutenticarResponse(IsAutenticarResponse value) {
        return new JAXBElement<IsAutenticarResponse>(_IsAutenticarResponse_QNAME, IsAutenticarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRolesPorUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listarRolesPorUsuarioResponse")
    public JAXBElement<ListarRolesPorUsuarioResponse> createListarRolesPorUsuarioResponse(ListarRolesPorUsuarioResponse value) {
        return new JAXBElement<ListarRolesPorUsuarioResponse>(_ListarRolesPorUsuarioResponse_QNAME, ListarRolesPorUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.mitocode.com/", name = "listarPorId")
    public JAXBElement<ListarPorId> createListarPorId(ListarPorId value) {
        return new JAXBElement<ListarPorId>(_ListarPorId_QNAME, ListarPorId.class, null, value);
    }

}
