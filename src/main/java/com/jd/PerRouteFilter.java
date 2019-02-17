package com.jd;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.FallbackHeadersGatewayFilterFactory.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;

/**
 * 暂时无效  需要查看原因
 * @author Administrator
 *
 */
@Configuration
public class PerRouteFilter  extends  AbstractGatewayFilterFactory<Config> {

	@Override
	public GatewayFilter apply(Config config) {
		
		 return (exchange, chain) -> {
			 
			 
			 System.out.println("PerRouteFilter...前置Filter");
			 
			 ServerHttpRequest.Builder builder = exchange.getRequest().mutate();
             //If you want to build a "pre" filter you need to manipulate the
             //request before calling change.filter  ServerHttpRequest.Builder builder = exchange.getRequest().mutate();
             builder.header("GatewayFilter", "PreGatewayFilterFactory success");
             //use builder to manipulate the request
             return chain.filter(exchange.mutate().request(builder.build()).build());
         };
	}




}
