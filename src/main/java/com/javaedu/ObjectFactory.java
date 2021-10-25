
package com.javaedu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.javaedu package. 
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

    private final static QName _Login_QNAME = new QName("http://www.javaedu.com", "login");
    private final static QName _GetItemList_QNAME = new QName("http://www.javaedu.com", "getItemList");
    private final static QName _LoginResponse_QNAME = new QName("http://www.javaedu.com", "loginResponse");
    private final static QName _QueryItemResponse_QNAME = new QName("http://www.javaedu.com", "queryItemResponse");
    private final static QName _ClearItemResponse_QNAME = new QName("http://www.javaedu.com", "clearItemResponse");
    private final static QName _AddItemResponse_QNAME = new QName("http://www.javaedu.com", "addItemResponse");
    private final static QName _ClearItem_QNAME = new QName("http://www.javaedu.com", "clearItem");
    private final static QName _DeleteItemResponse_QNAME = new QName("http://www.javaedu.com", "deleteItemResponse");
    private final static QName _Register_QNAME = new QName("http://www.javaedu.com", "register");
    private final static QName _AddItem_QNAME = new QName("http://www.javaedu.com", "addItem");
    private final static QName _QueryItem_QNAME = new QName("http://www.javaedu.com", "queryItem");
    private final static QName _DeleteItem_QNAME = new QName("http://www.javaedu.com", "deleteItem");
    private final static QName _GetItemListResponse_QNAME = new QName("http://www.javaedu.com", "getItemListResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://www.javaedu.com", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.javaedu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItemList }
     * 
     */
    public GetItemList createGetItemList() {
        return new GetItemList();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link QueryItemResponse }
     * 
     */
    public QueryItemResponse createQueryItemResponse() {
        return new QueryItemResponse();
    }

    /**
     * Create an instance of {@link ClearItemResponse }
     * 
     */
    public ClearItemResponse createClearItemResponse() {
        return new ClearItemResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddItem }
     * 
     */
    public AddItem createAddItem() {
        return new AddItem();
    }

    /**
     * Create an instance of {@link QueryItem }
     * 
     */
    public QueryItem createQueryItem() {
        return new QueryItem();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link GetItemListResponse }
     * 
     */
    public GetItemListResponse createGetItemListResponse() {
        return new GetItemListResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link AddItemResponse }
     * 
     */
    public AddItemResponse createAddItemResponse() {
        return new AddItemResponse();
    }

    /**
     * Create an instance of {@link ClearItem }
     * 
     */
    public ClearItem createClearItem() {
        return new ClearItem();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "getItemList")
    public JAXBElement<GetItemList> createGetItemList(GetItemList value) {
        return new JAXBElement<GetItemList>(_GetItemList_QNAME, GetItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "queryItemResponse")
    public JAXBElement<QueryItemResponse> createQueryItemResponse(QueryItemResponse value) {
        return new JAXBElement<QueryItemResponse>(_QueryItemResponse_QNAME, QueryItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "clearItemResponse")
    public JAXBElement<ClearItemResponse> createClearItemResponse(ClearItemResponse value) {
        return new JAXBElement<ClearItemResponse>(_ClearItemResponse_QNAME, ClearItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "addItemResponse")
    public JAXBElement<AddItemResponse> createAddItemResponse(AddItemResponse value) {
        return new JAXBElement<AddItemResponse>(_AddItemResponse_QNAME, AddItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "clearItem")
    public JAXBElement<ClearItem> createClearItem(ClearItem value) {
        return new JAXBElement<ClearItem>(_ClearItem_QNAME, ClearItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "deleteItemResponse")
    public JAXBElement<DeleteItemResponse> createDeleteItemResponse(DeleteItemResponse value) {
        return new JAXBElement<DeleteItemResponse>(_DeleteItemResponse_QNAME, DeleteItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "addItem")
    public JAXBElement<AddItem> createAddItem(AddItem value) {
        return new JAXBElement<AddItem>(_AddItem_QNAME, AddItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "queryItem")
    public JAXBElement<QueryItem> createQueryItem(QueryItem value) {
        return new JAXBElement<QueryItem>(_QueryItem_QNAME, QueryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "deleteItem")
    public JAXBElement<DeleteItem> createDeleteItem(DeleteItem value) {
        return new JAXBElement<DeleteItem>(_DeleteItem_QNAME, DeleteItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "getItemListResponse")
    public JAXBElement<GetItemListResponse> createGetItemListResponse(GetItemListResponse value) {
        return new JAXBElement<GetItemListResponse>(_GetItemListResponse_QNAME, GetItemListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.javaedu.com", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
