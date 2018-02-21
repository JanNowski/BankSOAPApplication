
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
@WebServiceClient(name = "DeleteAccountSvcService", targetNamespace = "http://services.bank/", wsdlLocation = "http://localhost:8002/deleteAccount?wsdl")
public class DeleteAccountSvcService
    extends Service
{

    private final static URL DELETEACCOUNTSVCSERVICE_WSDL_LOCATION;
    private final static WebServiceException DELETEACCOUNTSVCSERVICE_EXCEPTION;
    private final static QName DELETEACCOUNTSVCSERVICE_QNAME = new QName("http://services.bank/", "DeleteAccountSvcService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8002/deleteAccount?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DELETEACCOUNTSVCSERVICE_WSDL_LOCATION = url;
        DELETEACCOUNTSVCSERVICE_EXCEPTION = e;
    }

    public DeleteAccountSvcService() {
        super(__getWsdlLocation(), DELETEACCOUNTSVCSERVICE_QNAME);
    }

    public DeleteAccountSvcService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DELETEACCOUNTSVCSERVICE_QNAME, features);
    }

    public DeleteAccountSvcService(URL wsdlLocation) {
        super(wsdlLocation, DELETEACCOUNTSVCSERVICE_QNAME);
    }

    public DeleteAccountSvcService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DELETEACCOUNTSVCSERVICE_QNAME, features);
    }

    public DeleteAccountSvcService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeleteAccountSvcService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DeleteAccountSvc
     */
    @WebEndpoint(name = "DeleteAccountSvcPort")
    public DeleteAccountSvc getDeleteAccountSvcPort() {
        return super.getPort(new QName("http://services.bank/", "DeleteAccountSvcPort"), DeleteAccountSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeleteAccountSvc
     */
    @WebEndpoint(name = "DeleteAccountSvcPort")
    public DeleteAccountSvc getDeleteAccountSvcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.bank/", "DeleteAccountSvcPort"), DeleteAccountSvc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DELETEACCOUNTSVCSERVICE_EXCEPTION!= null) {
            throw DELETEACCOUNTSVCSERVICE_EXCEPTION;
        }
        return DELETEACCOUNTSVCSERVICE_WSDL_LOCATION;
    }

}
