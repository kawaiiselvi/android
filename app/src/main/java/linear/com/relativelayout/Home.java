package linear.com.relativelayout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button satu = (Button) findViewById(R.id.Button01);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), RelativeLayout.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dua = (Button) findViewById(R.id.Button02);
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tiga = (Button) findViewById(R.id.Button03);
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), TampilanGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button empat = (Button) findViewById(R.id.Button04);
        empat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), AutoCompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button lima = (Button) findViewById(R.id.Button05);
        lima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button enam = (Button) findViewById(R.id.Button06);
        enam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), picker.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tujuh = (Button) findViewById(R.id.Button07);
        tujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button delapan = (Button) findViewById(R.id.Button08);
        delapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button sembilan = (Button) findViewById(R.id.Button09);
        sembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent (bebek.getContext(), seleksi.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }
}
