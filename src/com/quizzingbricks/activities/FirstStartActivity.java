package com.quizzingbricks.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.quizzingbricks.R;

public class FirstStartActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first_start);
    }
	
	public void changeToLoginActivity(View view)	{
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
	}
	
	public void changeToRegisterUserActivity(View view)	{
		Intent intent = new Intent(this, RegisterUserActivity.class);
		startActivity(intent);
	}
}