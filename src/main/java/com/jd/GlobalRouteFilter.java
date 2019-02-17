package com.jd;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;


@Configuration
public class GlobalRouteFilter  implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		MultiValueMap<String,String> params = exchange.getRequest().getQueryParams();
		
		params.forEach((k,v)->{
			
			System.out.println("参数名:"+ k +" 参数值："+v);
		});
		
		
		
		System.out.println("全局过滤.....");
		ServerHttpRequest.Builder builder = exchange.getRequest().mutate();
        builder.header("GlobalFilter","GlobalFilter success");
        chain.filter(exchange.mutate().request(builder.build()).build());
        return chain.filter(exchange.mutate().request(builder.build()).build());
	}
	 

}
