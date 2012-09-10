package com.georges.social.weibo.api;
import org.springframework.social.ApiBinding;

import com.georges.social.weibo.api.UserOperations;

public interface Weibo extends ApiBinding {

	public abstract UserOperations userOperations();
	
}
