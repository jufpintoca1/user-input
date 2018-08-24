package co.edu.intecap.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SaludoActivity extends AppCompatActivity {
    private TextView txtSaludo;
    private EditText editTextNombre;
    private Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo); //aqui asignamos el layout

        txtSaludo = findViewById(R.id.txt_saludo);
        editTextNombre = findViewById(R.id.edit_txt_nombre);
        btnSaludar = findViewById(R.id.btn_saludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                if (!nombre.trim().isEmpty()) {
                    txtSaludo.setText("Hola " + nombre.trim());

                }else{
                    Toast.makeText(SaludoActivity.this, "No se aceptan textos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
