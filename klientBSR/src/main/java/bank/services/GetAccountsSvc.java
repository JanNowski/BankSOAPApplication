
package bank.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetAccountsSvc", targetNamespace = "http://services.bank/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetAccountsSvc {


    /**
     * 
     * @return
     *     returns java.util.List<bank.services.Account>
     * @throws AuthorizationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "http://services.bank/", className = "bank.services.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse", targetNamespace = "http://services.bank/", className = "bank.services.GetAccountsResponse")
    @Action(input = "http://services.bank/GetAccountsSvc/getAccountsRequest", output = "http://services.bank/GetAccountsSvc/getAccountsResponse", fault = {
        @FaultAction(className = AuthorizationException_Exception.class, value = "http://services.bank/GetAccountsSvc/getAccounts/Fault/AuthorizationException")
    })
    public List<Account> getAccounts()
        throws AuthorizationException_Exception
    ;

}
