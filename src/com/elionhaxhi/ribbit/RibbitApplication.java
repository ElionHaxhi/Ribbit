package com.elionhaxhi.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "y0UvVoTCmlcY0Iu3zo7p5S47CegclOLMAkga6obn", "SU7A58chcuKib7X5PQGiVnvviJwEcjZrFVOpvyA0");
	

		  
	}
}
