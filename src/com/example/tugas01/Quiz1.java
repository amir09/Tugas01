package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1 extends Activity {
	EditText ea;
	EditText eb;
	Button bbanding;
	TextView thasil;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz1);
        
        ea = (EditText)findViewById(R.id.eta);
        eb = (EditText)findViewById(R.id.etb);
        bbanding = (Button)findViewById(R.id.btnbanding);
        thasil = (TextView)findViewById(R.id.tvhasil);
        
        bbanding.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			int a = Integer.parseInt(ea.getText().toString());
			int b = Integer.parseInt(eb.getText().toString());
			
			if (a>b) {
				thasil.setText("Nilai A = " +a+ " Lebih Besar dari nilai B = " +b);
			} else if (b>a){
				thasil.setText("Nilai B = " +b+ " Lebih Besar dari nilai A = " +a);
			} else {
				thasil.setText("Nilai A dan B sama");
			}
			}
		});
	}
}
