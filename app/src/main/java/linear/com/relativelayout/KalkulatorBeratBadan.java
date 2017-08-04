package linear.com.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorBeratBadan extends AppCompatActivity {
    private float Height;
    private float Weight;
    private float BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_berat_badan);

        final Button Hitung = (Button) findViewById(R.id.Hitung);
        final EditText Height_value = (EditText) findViewById(R.id.height);
        final EditText Weight_value = (EditText) findViewById(R.id.weight);
        final TextView Result = (TextView) findViewById(R.id.Result);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Height_value.getText().length()>0 == Weight_value.getText().length()>0) {
                    Height = Float.parseFloat(Height_value.getText().toString());
                    Weight = Float.parseFloat(Weight_value.getText().toString());
                    BMI = KalkulasiPerhitungan(Height, Weight);

                    if (BMI<16) {
                        Result.setText("Your hasil" + BMI + "Cungkring");
                    } else if (BMI<18.5) {
                        Result.setText("Your hasil" + BMI + "Peot");
                    } else if (BMI<30) {
                        Result.setText("Yor hasil" + BMI + "Normal");
                    } else {
                        Result.setText("Yor hasil" + BMI + "Obesitas");
                    }
                }
            }
        });
    }
    private float KalkulasiPerhitungan(float Height, float Weight) {
        Height=(Height/100);
        return (float) (Weight/(Height*Height));

    }
}
