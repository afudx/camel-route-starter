package id.nullpointr.camelroute.route;

import java.net.ConnectException;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class CobaRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		/*
			Configure we want to use servlet as the component for the rest DSL
        	and we enable json binding mode
        */
        restConfiguration().component("servlet").bindingMode(RestBindingMode.json)
        .dataFormatProperty("prettyPrint", "true")
        .port(8989);
        
        
        from("servlet:///test").log(">> Let's get log!")
        .transform().simple("Gotcha!");
        
	}
	
}
