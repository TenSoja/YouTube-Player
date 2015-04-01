package org.example.youtube_player;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
	
	public static final String GOOGLE_API_KEY = "AIzaSyAiXIv5rtvRyiNkdNOg1zyX2pqDsVWbpEc";
	
	public static final String YOUTUBE_VIDEO_ID = "KMYDYYQmqgA";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtube);
		YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
		youTubePlayerView.initialize(GOOGLE_API_KEY, this);
	}
	
	public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
		Toast.makeText(this, "Cannot initialize YouTube player", Toast.LENGTH_LONG).show();
	}
	
	public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);
		
		if(!wasRestored) {
			player.cueVideo(YOUTUBE_VIDEO_ID);
		}
	}

	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
		
		public void onBuffering(boolean arg0) {
			
		}
		
		public void onPaused() {
			
		}
		
		public void onPlaying() {
			
		}
		
		public void onSeekTo(int arg0) {
			
		}
		
		public void onStopped() {
			
		}
	};
	
	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
		
		public void onAdStarted() {
			
		}
		
		public void onError(ErrorReason arg0) {
			
		}
		
		public void onVideoEnded() {
			
		}

		public void onLoaded(String arg0) {
			
		}

		public void onVideoStarted() {
			
		}

		public void onLoading() {
			
		}
	};
}
