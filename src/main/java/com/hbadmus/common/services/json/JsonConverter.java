package com.hbadmus.common.services.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JsonConverter {

	@Autowired
	@Setter
	private ObjectMapper objectMapper;

	public <T> T toObject(String source, Class<T> target) throws JsonProcessingException {
		return objectMapper.readValue(source, target);
	}


}
