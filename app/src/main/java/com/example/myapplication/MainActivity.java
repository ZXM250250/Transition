package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.activitytransition.ActivityTransitionMainActivity;
import com.example.myapplication.scenetransition.SceneTransitionMainActivity;
import com.example.myapplication.shareelementtransition.ShareElementTransitionMainActivity;

public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.layout_scene_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * 这里使用了我们常规的启动方式。API 21之前不带Transition的启动方式
				 */
				startActivity(new Intent(mContext, SceneTransitionMainActivity.class));
			}
		});

		findViewById(R.id.layout_activity_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * 这里使用了我们常规的启动方式。API 21之前不带Transition的启动方式
				 */
				startActivity(new Intent(mContext, ActivityTransitionMainActivity.class));
			}
		});

		findViewById(R.id.layout_share_element_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * 这里使用了我们常规的启动方式。API 21之前不带Transition的启动方式
				 */
				startActivity(new Intent(mContext, ShareElementTransitionMainActivity.class));
			}
		});
	}


}
