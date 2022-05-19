package mx.uv.t4is.ContratosCFE;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class ContratoConf {
    @Bean
    public XsdSchema ContratoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("contratos.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDistpatcheerServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    //
    @Bean(name="contratos")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema contratosSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("contratosPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://t4is.uv.mx/contratos");
        wsdl.setSchema(contratosSchema);
        return wsdl;
    }
}