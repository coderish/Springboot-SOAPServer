package com.rish.tutorial.springboot.soap.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.rish.tutorial.springboot.soap.server.xsd.models.StudentDetailsRequest;
import com.rish.tutorial.springboot.soap.server.xsd.models.StudentDetailsResponse;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "com/rish/tutorial/springboot/soap/server/xsd/models";

	private com.rish.tutorial.springboot.soap.server.repository.StudentRepository StudentRepository;

	@Autowired
	public StudentEndpoint(com.rish.tutorial.springboot.soap.server.repository.StudentRepository StudentRepository) {
		this.StudentRepository = StudentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
		StudentDetailsResponse response = new StudentDetailsResponse();
		response.setStudent(StudentRepository.findStudent(request.getName()));

		return response;
	}
}