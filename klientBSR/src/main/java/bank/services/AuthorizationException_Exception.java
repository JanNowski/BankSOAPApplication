
package bank.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AuthorizationException", targetNamespace = "http://services.bank/")
public class AuthorizationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AuthorizationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AuthorizationException_Exception(String message, AuthorizationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AuthorizationException_Exception(String message, AuthorizationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: bank.services.AuthorizationException
     */
    public AuthorizationException getFaultInfo() {
        return faultInfo;
    }

}
