/**
 * 
 */
package com.georges.social.weibo.api.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

import com.georges.social.weibo.api.UserOperations;
import com.georges.social.weibo.api.Weibo;
import com.georges.social.weibo.api.impl.json.WeiboModule;
import com.georges.social.weibo.connect.WeiboRequestInterceptor;

/**
 * @author alexzuo
 * 
 */
public class WeiboTemplate extends AbstractOAuth2ApiBinding implements Weibo {
	private UserOperations userOperations;
	private ObjectMapper objectMapper;

	/**
	 * 
	 */
	public WeiboTemplate() {
		super();
		initialize();
	}

	/**
	 * @param consumerKey
	 * @param consumerSecret
	 * @param accessToken
	 * @param accessTokenSecret
	 */
	public WeiboTemplate(String accessToken) {
		super(accessToken);
		List<ClientHttpRequestInterceptor> interceptors = new LinkedList<ClientHttpRequestInterceptor>();
		interceptors.add(new WeiboRequestInterceptor(accessToken));
		getRestTemplate().setInterceptors(interceptors);
		initialize();
	}

	private void initialize() {
		userOperations = new UserTemplate(this, getRestTemplate(),
				isAuthorized());
	}

	/**
	 * @return the userOperations
	 */
	public UserOperations userOperations() {
		return userOperations;
	}

	protected MappingJacksonHttpMessageConverter getJsonMessageConverter() {
		MappingJacksonHttpMessageConverter converter = super
				.getJsonMessageConverter();
		List<MediaType> list = new ArrayList<MediaType>();
		list.addAll(converter.getSupportedMediaTypes());
		list.add(MediaType.TEXT_PLAIN);
		converter.setSupportedMediaTypes(list);

		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new WeiboModule());
		converter.setObjectMapper(objectMapper);
		return converter;
	}

}
