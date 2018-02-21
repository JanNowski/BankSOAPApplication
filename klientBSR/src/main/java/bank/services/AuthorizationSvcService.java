
package bank.services;

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
@WebServiceClient(name = "AuthorizationSvcService", targetNamespace = "http://services.bank/", wsdlLocation = "http://localhost:8002/auth?wsdl")
public class AuthorizationSvcService
    extends Service
{

    private final static URL AUTHORIZATIONSVCSERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTHORIZATIONSVCSERVICE_EXCEPTION;
    private final static QName AUTHORIZATIONSVCSERVICE_QNAME = new QName("http://services.bank/", "AuthorizationSvcService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8002/auth?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHORIZATIONSVCSERVICE_WSDL_LOCATION = url;
        AUTHORIZATIONSVCSERVICE_EXCEPTION = e;
    }

    public AuthorizationSvcService() {
        super(__getWsdlLocation(), AUTHORIZATIONSVCSERVICE_QNAME);
    }

    public AuthorizationSvcService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHORIZATIONSVCSERVICE_QNAME, features);
    }

    public AuthorizationSvcService(URL wsdlLocation) {
        super(wsdlLocation, AUTHORIZATIONSVCSERVICE_QNAME);
    }

    public AuthorizationSvcService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHORIZATIONSVCSERVICE_QNAME, features);
    }

    public AuthorizationSvcService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthorizationSvcService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthorizationSvc
     */
    @WebEndpoint(name = "AuthorizationSvcPort")
    public AuthorizationSvc getAuthorizationSvcPort() {
        return super.getPort(new QName("http://services.bank/", "AuthorizationSvcPort"), AuthorizationSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthorizationSvc
     */
    @WebEndpoint(name = "AuthorizationSvcPort")
    public AuthorizationSvc getAuthorizationSvcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.bank/", "AuthorizationSvcPort"), AuthorizationSvc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHORIZATIONSVCSERVICE_EXCEPTION!= null) {
            throw AUTHORIZATIONSVCSERVICE_EXCEPTION;
        }
        return AUTHORIZATIONSVCSERVICE_WSDL_LOCATION;
    }

}
