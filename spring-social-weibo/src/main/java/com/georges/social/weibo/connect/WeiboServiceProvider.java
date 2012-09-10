/**
 * 
 */
package com.georges.social.weibo.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

import com.georges.social.weibo.api.Weibo;
import com.georges.social.weibo.api.impl.WeiboTemplate;

/**
 * @author alexzuo
 * 
 */
public class WeiboServiceProvider extends AbstractOAuth2ServiceProvider<Weibo> {

	public WeiboServiceProvider(String clientId, String clientSecret) {
		super(new WeiboOAuth2Template(clientId, clientSecret,
				"https://api.weibo.com/oauth2/authorize",
				"https://api.weibo.com/oauth2/access_token"));
	}

	@Override
	public Weibo getApi(String accessToken) {
		return new WeiboTemplate(accessToken);
	}

}
