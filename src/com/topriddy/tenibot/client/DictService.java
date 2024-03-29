
package com.topriddy.tenibot.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * Word Dictionary Web Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DictService", targetNamespace = "http://services.aonaware.com/webservices/", wsdlLocation = "http://services.aonaware.com/DictService/DictService.asmx?WSDL")
public class DictService
    extends Service
{

    private final static URL DICTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.topriddy.tenibot.client.DictService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.topriddy.tenibot.client.DictService.class.getResource(".");
            url = new URL(baseUrl, "http://services.aonaware.com/DictService/DictService.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://services.aonaware.com/DictService/DictService.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DICTSERVICE_WSDL_LOCATION = url;
    }

    public DictService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DictService() {
        super(DICTSERVICE_WSDL_LOCATION, new QName("http://services.aonaware.com/webservices/", "DictService"));
    }

    /**
     * 
     * @return
     *     returns DictServiceSoap
     */
    @WebEndpoint(name = "DictServiceSoap")
    public DictServiceSoap getDictServiceSoap() {
        return super.getPort(new QName("http://services.aonaware.com/webservices/", "DictServiceSoap"), DictServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DictServiceSoap
     */
    @WebEndpoint(name = "DictServiceSoap")
    public DictServiceSoap getDictServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.aonaware.com/webservices/", "DictServiceSoap"), DictServiceSoap.class, features);
    }

}
