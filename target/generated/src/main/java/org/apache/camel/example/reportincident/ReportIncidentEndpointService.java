package org.apache.camel.example.reportincident;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630133
 * 2017-08-25T07:05:03.170-04:00
 * Generated source version: 3.1.5.redhat-630133
 * 
 */
@WebServiceClient(name = "ReportIncidentEndpointService", 
                  wsdlLocation = "file:/Users/mfentane/Documents/products/bundles/final/fuse-fsi-osgi_v6.2/jboss-fuse-6.2.0.redhat-133/extras/apache-camel-2.15.1.redhat-620133/examples/camel-example-cxf-proxy/src/main/resources/etc/report_incident.wsdl",
                  targetNamespace = "http://reportincident.example.camel.apache.org") 
public class ReportIncidentEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentEndpointService");
    public final static QName ReportIncidentEndpoint = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mfentane/Documents/products/bundles/final/fuse-fsi-osgi_v6.2/jboss-fuse-6.2.0.redhat-133/extras/apache-camel-2.15.1.redhat-620133/examples/camel-example-cxf-proxy/src/main/resources/etc/report_incident.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportIncidentEndpointService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/mfentane/Documents/products/bundles/final/fuse-fsi-osgi_v6.2/jboss-fuse-6.2.0.redhat-133/extras/apache-camel-2.15.1.redhat-620133/examples/camel-example-cxf-proxy/src/main/resources/etc/report_incident.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReportIncidentEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportIncidentEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ReportIncidentEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReportIncidentEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentEndpoint")
    public ReportIncidentEndpoint getReportIncidentEndpoint() {
        return super.getPort(ReportIncidentEndpoint, ReportIncidentEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentEndpoint")
    public ReportIncidentEndpoint getReportIncidentEndpoint(WebServiceFeature... features) {
        return super.getPort(ReportIncidentEndpoint, ReportIncidentEndpoint.class, features);
    }

}
