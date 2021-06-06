package com.example.myapplication.scenetransition.managergo.autotransition;


import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SceneAutoTransitionActivity extends AppCompatActivity {

	private Context mContext;
	private ViewGroup mSceneRootView;
	private Scene mSceneStart;
	private Scene     mSceneEnd;
	private boolean   mStartSceneState;

	@RequiresApi(api = Build.VERSION_CODES.KITKAT)
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scene_effect);
		mContext = this;
		initView();
		initEvent();
		initData();
	}

	private void initView() {
		mSceneRootView = findViewById(R.id.layout_scene_transition_root);
	}

	private void initEvent() {
		findViewById(R.id.button_scene_transition_toggle).setOnClickListener(new View.OnClickListener() {
			@RequiresApi(api = Build.VERSION_CODES.KITKAT)
			@Override
			public void onClick(View v) {
				toggleScene();
			}
		});
	}

	@RequiresApi(api = Build.VERSION_CODES.KITKAT)
	private void initData() {
		mSceneStart = Scene.getSceneForLayout(mSceneRootView, R.layout.scene_change_bounds_start, mContext);
		mSceneEnd = Scene.getSceneForLayout(mSceneRootView, R.layout.scene_change_bounds_end, mContext);
		/**
		 * 切换到开始场景状态
		 */
		TransitionManager.go(mSceneStart);
		mStartSceneState = true;
	}

	/**
	 * 两个场景之间相互切换
	 */
	@RequiresApi(api = Build.VERSION_CODES.KITKAT)
	private void toggleScene() {
		/**
		 * 不指定默认就是AutoTransition
		 */
		TransitionManager.go(mStartSceneState ? mSceneEnd : mSceneStart);
		mStartSceneState = !mStartSceneState;
	}
}
