/**
 * 
 */
package com.couponornot.social.weibo.api;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

import com.georges.social.weibo.api.WeiboProfile;
import com.georges.social.weibo.api.impl.json.WeiboModule;

/**
 * @author alexzuo
 *
 */
public class WeiboProfileTestCase {
	MappingJacksonHttpMessageConverter converter;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		converter = new MappingJacksonHttpMessageConverter();
		
		ObjectMapper objectMapper = new ObjectMapper();				
		objectMapper.registerModule(new WeiboModule());
		converter.setObjectMapper(objectMapper);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		converter = null;
	}

	/**
	 * Test method for {@link com.georges.social.weibo.api.WeiboProfile#WeiboProfile(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testWeiboProfile() {
		try {
			WeiboProfile profile = (WeiboProfile) converter.read(WeiboProfile.class, new HttpInputMessage() {
				
				public HttpHeaders getHeaders() {
					return null;
				}
				
				public InputStream getBody() throws IOException {
					return this.getClass().getResourceAsStream("/profile.json");
				}
			});
			assertEquals(1404376560, profile.getId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
