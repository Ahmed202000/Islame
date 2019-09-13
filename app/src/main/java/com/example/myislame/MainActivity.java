package com.example.myislame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtT,txtRh;
    TextView txtTS;
    Button btnTs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText txtT=findViewById(R.id.txtT);
       final EditText txtRh=findViewById(R.id.txtRh);
       final TextView txtTS=findViewById(R.id.txtTS);
       btnTs=findViewById(R.id.btnTS);




        btnTs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Double T=Double.parseDouble(txtT.getText().toString());
                Double  RH=Double.parseDouble(txtRh.getText().toString());
                Double TS=T*(.31-.31*RH)*(T-14.4);

                txtTS.setText(Double.toString(TS));

            }
        });



}
}