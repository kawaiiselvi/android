package linear.com.relativelayout;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public void onCreate() {
        mp=MediaPlayer.create(this, R.raw.beraksi);
        mp.setLooping(false);
    }

    public void onStart(Intent intent,int StartId) {
        mp.start();
    }

    @Override
    public void onDestroy() {
        mp.stop();
    }
}
