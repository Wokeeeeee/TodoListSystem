
package com.javaedu;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ToDoListServiceService", targetNamespace = "http://www.javaedu.com", wsdlLocation = "http://127.0.0.1:8001/webservice/todolistService?wsdl")
public class ToDoListServiceService
    extends Service
{

    private final static URL TODOLISTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TODOLISTSERVICESERVICE_EXCEPTION;
    private final static QName TODOLISTSERVICESERVICE_QNAME = new QName("http://www.javaedu.com", "ToDoListServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8001/webservice/todolistService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TODOLISTSERVICESERVICE_WSDL_LOCATION = url;
        TODOLISTSERVICESERVICE_EXCEPTION = e;
    }

    public ToDoListServiceService() {
        super(__getWsdlLocation(), TODOLISTSERVICESERVICE_QNAME);
    }

    public ToDoListServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TODOLISTSERVICESERVICE_QNAME, features);
    }

    public ToDoListServiceService(URL wsdlLocation) {
        super(wsdlLocation, TODOLISTSERVICESERVICE_QNAME);
    }

    public ToDoListServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TODOLISTSERVICESERVICE_QNAME, features);
    }

    public ToDoListServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ToDoListServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TodolistService
     */
    @WebEndpoint(name = "todolistPort")
    public TodolistService getTodolistPort() {
        return super.getPort(new QName("http://www.javaedu.com", "todolistPort"), TodolistService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TodolistService
     */
    @WebEndpoint(name = "todolistPort")
    public TodolistService getTodolistPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.javaedu.com", "todolistPort"), TodolistService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TODOLISTSERVICESERVICE_EXCEPTION!= null) {
            throw TODOLISTSERVICESERVICE_EXCEPTION;
        }
        return TODOLISTSERVICESERVICE_WSDL_LOCATION;
    }

}
