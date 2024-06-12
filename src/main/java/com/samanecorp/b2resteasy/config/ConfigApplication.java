package com.samanecorp.b2resteasy.config;

import java.util.HashSet;
import java.util.Set;

import com.samanecorp.b2resteasy.controller.TransactionController;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
public class ConfigApplication extends Application {

	Set<Object> singletons = new HashSet<>();
	
	public ConfigApplication() {
		this.singletons.add(new TransactionController());
	}

	@Override
	public Set<Object> getSingletons() {
		return super.getSingletons();
	}
}