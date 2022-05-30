/**
 * 
 */
package com.example.demo_999;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raghav
 *
 */
@RestController
public class Controller {
	
	@GetMapping(
			value = "/audio",
			produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
			)
	public byte[] audio() throws IOException {
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("something.mp3");
		return IOUtils.toByteArray(inputStream);
	}

}
