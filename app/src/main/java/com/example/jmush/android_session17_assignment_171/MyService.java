package com.example.jmush.android_session17_assignment_171;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Created by jmush on 10/22/17.
 */


public class MyService extends Service{

    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }


    /**
     *
     The system calls this method when the service is first created using onStartCommand() or onBind().
     This call is required to perform one-time setup.
     */
    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.audio);
    }

    /**
     *
     The system calls this method when another component, such as an activity,
     requests that the service be started, by calling startService().
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mediaPlayer.start();
        return START_STICKY;
    }

    /**
     * The system calls this method when the service is no longer used and is being destroyed.
     */

    @Override
    public void onDestroy(){
        mediaPlayer.release();
        super.onDestroy();
    }

}
