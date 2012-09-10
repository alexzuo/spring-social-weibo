/**
 * 
 */
package com.georges.social.weibo.api;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author alexzuo
 * 
 */
public class WeiboProfile implements Serializable {
	private static final long serialVersionUID = -5116269573848009800L;

	private final long id;
	private final String name;
	private final String screenName;
	private final String imageUrl;
	private final String domain;
	private final String url;
	private final int province;
	private final int city;
	private final String location;
	private final String description;
	private final String gender;
	private final int followersCount;
	private final int friendsCount;
	private final int statusesCount;
	private final int favouritesCount;
	private final String createdAt;
	private final boolean following;
	private final boolean allowAllActMsg;
	private final boolean geoEnabled;
	private final boolean verified;
	private final boolean allowAllComment;
	private final String avatarLarge;
	private final String verifiedReason;
	private final boolean followMe;
	private final int onlineStatus;
	private final int biFollowersCount;

	public WeiboProfile(long id, String screenName, String name, int province,
			int city, String location, String description, String url,
			String imageUrl, String domain, String gender, int followersCount,
			int friendsCount, int statusesCount, int favouritesCount,
			String createdAt, boolean following, boolean allowAllActMsg,
			boolean geoEnabled, boolean verified, boolean allowAllComment,
			String avatarLarge, String verifiedReason, boolean followMe,
			int onlineStatus, int biFollowersCount) {
		this.id = id;
		this.name = name;
		this.screenName = screenName;
		this.imageUrl = imageUrl;
		this.domain = domain;
		this.url = url;
		this.province = province;
		this.city = city;
		this.location = location;
		this.description = description;
		this.gender = gender;
		this.followersCount = followersCount;
		this.friendsCount = friendsCount;
		this.statusesCount = statusesCount;
		this.favouritesCount = favouritesCount;
		this.createdAt = createdAt;
		this.following = following;
		this.allowAllActMsg = allowAllActMsg;
		this.geoEnabled = geoEnabled;
		this.verified = verified;
		this.allowAllComment = allowAllComment;
		this.avatarLarge = avatarLarge;
		this.verifiedReason = verifiedReason;
		this.followMe = followMe;
		this.onlineStatus = onlineStatus;
		this.biFollowersCount = biFollowersCount;
	}


	public String getUrl() {
		return url;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getScreenName() {
		return screenName;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	public String getDomain() {
		return domain;
	}

	public int getProvince() {
		return province;
	}

	public int getCity() {
		return city;
	}

	public String getLocation() {
		return location;
	}
	public String getDescription() {
		return description;
	}

	public String getGender() {
		return gender;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public int getStatusesCount() {
		return statusesCount;
	}

	public int getFavouritesCount() {
		return favouritesCount;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public boolean isFollowing() {
		return following;
	}

	public boolean isAllowAllActMsg() {
		return allowAllActMsg;
	}

	public boolean isGeoEnabled() {
		return geoEnabled;
	}

	public boolean isVerified() {
		return verified;
	}

	public boolean isAllowAllComment() {
		return allowAllComment;
	}

	public String getAvatarLarge() {
		return avatarLarge;
	}

	public String getVerifiedReason() {
		return verifiedReason;
	}


	public boolean isFollowMe() {
		return followMe;
	}

	public int getOnlineStatus() {
		return onlineStatus;
	}

	public int getBiFollowersCount() {
		return biFollowersCount;
	}
}
