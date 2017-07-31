package linear.com.relativelayout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceSederhana extends Activity implements OnClickListener {
    Button startBtn,stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_sederhana);

        startBtn=(Button)findViewById(R.id.startBtn);
        stopBtn=(Button)findViewById(R.id.stopBtn);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.startBtn:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.stopBtn:
                stopService(new Intent(this,MyService.class));
                break;
        }
    }
}
