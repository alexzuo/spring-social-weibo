/**
 * 
 */
package com.georges.social.weibo.connect;

import org.apache.commons.lang.StringUtils;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

import com.georges.social.weibo.api.Weibo;
import com.georges.social.weibo.api.WeiboProfile;

/**
 * @author alexzuo
 * 
 */
public class WeiboAdapter implements ApiAdapter<Weibo> {

	public UserProfile fetchUserProfile(Weibo weibo) {
		WeiboProfile profile = weibo.userOperations().getUserProfile();
		//For Sina WEIBO, screen name is unique
		return new UserProfileBuilder().setName(profile.getName())
				.setUsername("WEIBO_"+profile.getScreenName()).build();
	}

	public void setConnectionValues(Weibo weibo, ConnectionValues values) {
		WeiboProfile profile = weibo.userOperations().getUserProfile();
		values.setProviderUserId(String.valueOf(profile.getId()));
		values.setDisplayName(profile.getName());
		values.setImageUrl(profile.getImageUrl());
		values.setProfileUrl("http://weibo.com/"
				+ StringUtils.defaultString(profile.getDomain(),
						String.valueOf(profile.getId())));
	}
	public boolean test(Weibo weibo) {
		try {
			weibo.userOperations().getUserProfile();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void updateStatus(Weibo weibo, String message) {
	//TODO:update status to Weibo 
	}

}
