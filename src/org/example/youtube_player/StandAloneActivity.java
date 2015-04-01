package org.example.youtube_player;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandAloneActivity extends Activity implements View.OnClickListener{
		
		public static final String GOOGLE_API_KEY = "AIzaSyAiXIv5rtvRyiNkdNOg1zyX2pqDsVWbpEc";
		
		public static final String YOUTUBE_VIDEO_ID = "KMYDYYQmqgA";
		public static final String YOUTUBE_PLAYLIST_ID = "PLJYebCJrTR73Qy8f4EdbrFVnnlXsxcOX5";
		
		private Button btnPlay;
		private Button btnPlaylist;
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.standalone);
			
			btnPlay = (Button) findViewById(R.id.btnStart);
			btnPlaylist = (Button) findViewById(R.id.btnPlaylist);
			
			btnPlay.setOnClickListener(this);
			btnPlaylist.setOnClickListener(this);
		}
		
		public void onClick(View v) {
			Intent intent = null;
			if(v == btnPlay) {
				intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
			} else if(v == btnPlaylist) {
				intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
			}
			if(intent != null) {
				startActivity(intent);
			}
		}
		
	}
