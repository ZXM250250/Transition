package com.example.myapplication.scenetransition;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.scenetransition.delayed.SceneDelayedActivity;
import com.example.myapplication.scenetransition.managergo.SceneManagerGoActivity;

public class SceneTransitionMainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scene_transition_main);
		mContext = this;
		findViewById(R.id.layout_scene_transition_manager_go).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * 这里使用了我们常规的启动方式。API 21之前不带Transition的启动方式
				 */
				startActivity(new Intent(mContext, SceneManagerGoActivity.class));
			}
		});

		findViewById(R.id.layout_scene_beginDelayed_transition).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * 这里使用了我们常规的启动方式。API 21之前不带Transition的启动方式
				 */
				startActivity(new Intent(mContext, SceneDelayedActivity.class));
			}
		});
	}
}
