package co.edu.intecap.userinput;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String COUNTER = "counter";
    private int mCounter = 0;
    private  TextView txtCountValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCountValue = findViewById(R.id.txtCounterValue);

    /*    if(savedInstanceState != null){
            mCounter = savedInstanceState.getInt(COUNTER, 0);
        }*/
        txtCountValue.setText(String.valueOf(mCounter));



        //se asigna un click listener a nuestro boton
        Button clickButton = findViewById(R.id.btn_count);
        clickButton.setOnClickListener(this);

        Button secondScreen = findViewById(R.id.btn_second_screen);
        secondScreen.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(COUNTER, mCounter);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_count:
                mCounter++;
                txtCountValue.setText(String.valueOf((mCounter)));
                break;
            case R.id.btn_second_screen:
                Intent intent = new Intent(this, SaludoActivity.class);
                startActivity(intent);
                break;
        }

    }


}
