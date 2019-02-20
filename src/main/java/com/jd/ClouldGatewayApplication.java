package com.jd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients     //开启Fegin
public class ClouldGatewayApplication {
	
	  private static final Logger logger = LoggerFactory.getLogger(ClouldGatewayApplication.class);
	
//	   @Bean
//	   public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//	      
//		   return builder.routes()
//	               .route(p -> p
//	                       .path("/orderapi/**")
//	                       .filters(f -> f.filter(new ElapsedFilter()).stripPrefix(1).addResponseHeader("Hello", "World"))
//	                       .uri("lb://ORDERSERVICE")
//	                       .id("ORDERSERVICE"))
//	               .build();
//	   }
	   
	   
//	    @Bean
//	    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//	    	  StripPrefixGatewayFilterFactory.Config config = new StripPrefixGatewayFilterFactory.Config();
//	          config.setParts(1);
//	          
//	          
//	          return builder.routes()
//	                  .route("ORDERSWEVICE", r -> r.path("/a/**").filters(f -> f.stripPrefix(1)).uri("http://localhost:8090"))
//	                  .build();
//	    }
//	    
	   
	   
	   @Bean
	   public TokenFilter tokenFilter(){
		   
		   return new TokenFilter();
	   }
	    
		public static void main(String[] args) {
			
			SpringApplication.run(ClouldGatewayApplication.class, args);
		}

}

