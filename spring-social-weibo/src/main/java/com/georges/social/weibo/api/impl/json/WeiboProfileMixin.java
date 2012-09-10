package com.georges.social.weibo.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class WeiboProfileMixin {

	@JsonCreator
	WeiboProfileMixin(
			@JsonProperty("id") long id,
			@JsonProperty("screen_name") String screenName,
			@JsonProperty("name") String name,
			@JsonProperty("province") int province,
			@JsonProperty("city") int city,
			@JsonProperty("location") String location,
			@JsonProperty("description") String description,
			@JsonProperty("url") String url,
			@JsonProperty("profile_image_url") String imageUrl,
			@JsonProperty("domain") String domain,
			@JsonProperty("gender") String gender,
			@JsonProperty("followers_count") int followersCount,
			@JsonProperty("friends_count") int friendsCount,
			@JsonProperty("statuses_count") int statusesCount,
			@JsonProperty("favourites_count") int favouritesCount,
			@JsonProperty("created_at") String createAt,
			@JsonProperty("following") boolean following,
			@JsonProperty("allow_all_act_msg") boolean allowAllActMsg,
			@JsonProperty("geo_enabled") boolean geoEnabled,
			@JsonProperty("verified") boolean verified,
			@JsonProperty("allow_all_comment") boolean allowAllComment,
			@JsonProperty("avatar_large") String avatarLarge,
			@JsonProperty("verified_reason") String verifiedReason,
			@JsonProperty("follow_me") boolean followMe,
			@JsonProperty("online_status") int onlineStatus,
			@JsonProperty("bi_followers_count") int biFollowersCount) {
	}

}
