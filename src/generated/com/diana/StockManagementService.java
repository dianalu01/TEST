package com.diana;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-03-05T23:40:53.638-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "StockManagementService", 
                  wsdlLocation = "file:/C:/Users/Mi%20Pc/Documents/workspace/stockManagement/src/main/webapp/WEB-INF/wsdl/StockManagement.wsdl",
                  targetNamespace = "http://diana.com/") 
public class StockManagementService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://diana.com/", "StockManagementService");
    public final static QName StockManagementPort = new QName("http://diana.com/", "StockManagementPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Mi%20Pc/Documents/workspace/stockManagement/src/main/webapp/WEB-INF/wsdl/StockManagement.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StockManagementService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Mi%20Pc/Documents/workspace/stockManagement/src/main/webapp/WEB-INF/wsdl/StockManagement.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StockManagementService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StockManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StockManagementService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StockManagementService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StockManagementService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public StockManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns StockManagementPortType
     */
    @WebEndpoint(name = "StockManagementPort")
    public StockManagementPortType getStockManagementPort() {
        return super.getPort(StockManagementPort, StockManagementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockManagementPortType
     */
    @WebEndpoint(name = "StockManagementPort")
    public StockManagementPortType getStockManagementPort(WebServiceFeature... features) {
        return super.getPort(StockManagementPort, StockManagementPortType.class, features);
    }

}
