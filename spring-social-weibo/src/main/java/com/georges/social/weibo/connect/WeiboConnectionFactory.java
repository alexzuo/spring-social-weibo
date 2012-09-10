/**
 * 
 */
package com.georges.social.weibo.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;

import com.georges.social.weibo.api.Weibo;

/**
 * @author alexzuo
 * 
 */
public class WeiboConnectionFactory extends OAuth2ConnectionFactory<Weibo> {

	public WeiboConnectionFactory(String clientId, String clientSecret) {
		super("weibo", new WeiboServiceProvider(clientId, clientSecret),
				new WeiboAdapter());
	}

}
