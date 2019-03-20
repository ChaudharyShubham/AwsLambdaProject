package com.amazonaws.lambda.demo;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CreatePostApi implements RequestHandler<Map<String, String>, Map<String, String>>{

//	@Override
//	public Map<String, String> handleRequest(RequestClass request, Context context) {
//		ResponseClass responseClass = new ResponseClass();		
//Map<String, String> map;
//		//		responseClass.map.put("firstName", request.firstName);
////		responseClass.map.put("lastName", request.lastName);
//		map.put("firstName", request.firstName);
//		map.put("lastName", request.lastName);
//		//String greetingString = String.format("Hello %s, %s.", request.firstName, request.lastName);
////		 return responseClass;
//    }

	@Override
	public Map<String, String> handleRequest(Map<String, String> request, Context context) {
		Map<String, String> map = new HashMap<String, String>();
		//		responseClass.map.put("firstName", request.firstName);
//		responseClass.map.put("lastName", request.lastName);
		map.put("firstName", request.get("firstName"));
		map.put("lastName", request.get("lastName"));
		return map;
	}
}