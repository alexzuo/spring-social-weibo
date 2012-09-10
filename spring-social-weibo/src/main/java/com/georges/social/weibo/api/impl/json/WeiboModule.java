package com.georges.social.weibo.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;

import com.georges.social.weibo.api.WeiboProfile;

public class WeiboModule extends SimpleModule {

	public WeiboModule() {
		super("WeiboModule", new Version(1, 0, 0, null));
	}

	/* (non-Javadoc)
	 * @see org.codehaus.jackson.map.module.SimpleModule#setupModule(org.codehaus.jackson.map.Module.SetupContext)
	 */
	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(WeiboProfile.class, WeiboProfileMixin.class);
	}

}
