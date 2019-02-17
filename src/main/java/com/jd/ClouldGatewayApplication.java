package com.jd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClouldGatewayApplication {
	
	  private static final Logger logger = LoggerFactory.getLogger(ClouldGatewayApplication.class);
	
//	   @Bean
//	   public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//	      
//		   return builder.routes()
//	               .route(p -> p
//	                       .path("/get")
//	                       .filters(f -> f.addRequestHeader("Hello", "World"))
//	                       .uri("http://httpbin.org:80"))
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
	    
		public static void main(String[] args) {
			
			logger.info("项目启动咯。。。。");
			
			SpringApplication.run(ClouldGatewayApplication.class, args);
		}

}

