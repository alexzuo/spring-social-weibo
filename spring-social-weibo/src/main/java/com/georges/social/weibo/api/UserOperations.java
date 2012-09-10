/**
 * 
 */
package com.georges.social.weibo.api;

import java.util.List;

/**
 * @author alexzuo
 * 
 */
public interface UserOperations {
	public abstract List<WeiboProfile> getFriendsChainFollowers(long id);

	public abstract List<WeiboProfile> getFriendsChainFollowers(long id,
			int count, int page);
	public abstract List<WeiboProfile> getFollowersActive(long id, int count);
	public abstract List<WeiboProfile> getFollowers(String screenName);
	public abstract List<WeiboProfile> getFollowers(long id);
	public abstract List<WeiboProfile> getFollowers(String screenName,
			int count, int cursor);
	public abstract List<WeiboProfile> getFollowers(long id, int count,
			int cursor);
	public abstract List<WeiboProfile> getFriendsBilateral(long id);
	public abstract List<WeiboProfile> getFriendsBilateral(long id, int page);
	public abstract List<WeiboProfile> getFriendsBilateral(long id, int count,
			int page);
	public abstract List<WeiboProfile> getFriendsBilateral(long id, int count,
			int page, int sort);
	public abstract List<WeiboProfile> getFriendsInCommon(long id);
	public abstract List<WeiboProfile> getFriendsInCommon(long id, int page);
	public abstract List<WeiboProfile> getFriendsInCommon(long id, int count,
			int page);
	public abstract List<WeiboProfile> getFriendsInCommon(long id, long sid,
			int count, int page);
	public abstract List<WeiboProfile> getFriends(String screenName);
	public abstract List<WeiboProfile> getFriends(long id);
	public abstract List<WeiboProfile> getFriends(String screenName, int count,
			int cursor);
	public abstract List<WeiboProfile> getFriends(long id, int count, int cursor);
	public abstract WeiboProfile destroyFriendship(String screenName);
	public abstract WeiboProfile destroyFriendship(long id);
	public abstract WeiboProfile createFriendship(String screenName);
	public abstract WeiboProfile createFriendship(long id);
	public abstract WeiboProfile getUserProfile();
	public abstract WeiboProfile getUserProfile(String screenName);
	public abstract WeiboProfile getUserProfile(long uid);
	public abstract List<WeiboProfile> getUserSuggestionsByStatus(String content);
	public abstract List<WeiboProfile> getUserSuggestionsByStatus(
			String content, int count);
	public abstract List<WeiboProfile> getHotUserSuggestions();
	public abstract List<WeiboProfile> getHotUserSuggestions(String category);
	public abstract WeiboProfile notInterestedUser(long id);

}
