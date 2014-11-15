package com.elionhaxhi.ribbit;

import android.app.Application;

import com.elionhaxhi.ribbit.ui.MainActivity;
import com.elionhaxhi.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class RibbitApplication extends Application {
	
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "y0UvVoTCmlcY0Iu3zo7p5S47CegclOLMAkga6obn", 
				  "SU7A58chcuKib7X5PQGiVnvviJwEcjZrFVOpvyA0");
		  
//		  PushService.setDefaultPushCallback(this, MainActivity.class);
		  PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
		 ParseInstallation.getCurrentInstallation().saveInBackground();
	

		  
	}
	
	public static void updateParseIntallation(ParseUser user){
		
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
