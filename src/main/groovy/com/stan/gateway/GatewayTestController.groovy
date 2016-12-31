package com.stan.gateway

import java.security.Principal

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.oauth2.client.OAuth2ClientContext
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GatewayTestController {
	
	@Value('${proxy.auth.routes.catalog-service}')
	private String prop
	
	@Autowired
	OAuth2ClientContext context

	@RequestMapping('/test')
	def test(Principal principal){
		return principal == null ? "Hello anonymous" : "Hello " + principal.getName();
	}
	
	@RequestMapping('/login')
	def login(){
		return "logged in"
	}
	
	@RequestMapping('/')
	def home(){
		return 'home'
	}
	
	@RequestMapping('/unauth')
	def unauth(){
		return 'unauth'
	}
}
