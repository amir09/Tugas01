package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profil extends Activity {

	EditText enama;
	EditText enim;
	EditText eprodi;
	EditText efakultas;
	Button bproses;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_profil);
     
        enama =(EditText)findViewById(R.id.et);
        enim =(EditText)findViewById(R.id.et1);
        eprodi =(EditText)findViewById(R.id.et2);
        efakultas =(EditText)findViewById(R.id.et3);
        bproses =(Button)findViewById(R.id.btnproses);
        
        bproses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String Message = enama.getText().toString();
				Toast.makeText(Profil.this , "Anda merupakan Mahasiswa Unpri " + Message,
						Toast.LENGTH_SHORT).show();

			}
		});
	}
}
