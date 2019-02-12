package ittepic.edu.tpdm_u1_practica1_miguelc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView label;
    EditText edit;
    Button boton;
    ToggleButton toggle;
    Spinner spinner;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label=findViewById(R.id.etiqueta);
        edit=findViewById(R.id.txt);
        boton=findViewById(R.id.btn);
        toggle=findViewById(R.id.tggl);
        spinner=findViewById(R.id.spn);
        linear=findViewById(R.id.layout);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggle.isChecked()){
                    linear.setBackgroundColor(getResources().getColor(R.color.Negro));
                }else{
                    linear.setBackgroundColor(getResources().getColor(R.color.Blanco));
                }
            }
        });
        spinner.setOnItemSelectedListener(this);
    }

    public void cambiarTxt(View v){
        label.setText(edit.getText());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(id==0){
            label.setTextColor(getResources().getColor(R.color.Negro));
        }else if(id==1){
            label.setTextColor(getResources().getColor(R.color.Rojo));
        }else if(id==2){
            label.setTextColor(getResources().getColor(R.color.Verde));
        }else{
            label.setTextColor(getResources().getColor(R.color.Azul));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
