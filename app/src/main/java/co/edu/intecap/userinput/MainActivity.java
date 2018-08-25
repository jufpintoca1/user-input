package co.edu.intecap.userinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private int mCounter = 0;
    private  TextView txtCountValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCountValue = findViewById(R.id.txtCounterValue);
        txtCountValue.setText(String.valueOf(0));

        //se asigna un click listener a nuestro boton
        Button clickButton = findViewById(R.id.btn_tap);
        clickButton.setOnClickListener(this);
        Button screenButton = findViewById(R.id.btn_screen);
        screenButton.setOnClickListener(this);
    }


    public int getmCounter() {
        return mCounter;
    }

    public void setmCounter(int mCounter) {
        this.mCounter = mCounter;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tap:
                Toast.makeText(this, "CLICK!!!", Toast.LENGTH_SHORT).show();
                mCounter++;
                txtCountValue.setText(String.valueOf((mCounter)));
                break;
            case R.id.btn_screen:
                Intent intent = new Intent(this, SaludoActivity.class);
                startActivity(intent);
                break;
        }
    }


}
