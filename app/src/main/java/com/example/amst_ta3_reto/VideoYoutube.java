package com.example.amst_ta3_reto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoYoutube extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener {

    String claveYoutube="AIzaSyDaXi2vfERNucGyC2EyKI4e-ehzISuZTjc";// Clave de API
    YouTubePlayerView youTubePlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_youtube);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(claveYoutube,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean restaurado) {
        if(!restaurado){
            youTubePlayer.cueVideo("0RUAlxVnMFo"); //ID el video de youtube se encuentra en el url
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error="Error al inicializar Youtube"+youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
        }
    }
    protected void onActivityResult(int recuestCode, int resultCode, Intent data){
        if (resultCode==1){
            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }
    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
