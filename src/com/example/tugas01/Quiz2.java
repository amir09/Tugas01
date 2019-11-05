package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz2 extends Activity {

	EditText ea1;
	EditText eb1;
	EditText ec1;
	Button bbanding1;
	TextView thasil1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz2);
    
        ea1 = (EditText)findViewById(R.id.eta1);
        eb1 = (EditText)findViewById(R.id.etb1);
        ec1 = (EditText)findViewById(R.id.etc1);
        bbanding1 = (Button)findViewById(R.id.btnbanding1);
        thasil1 = (TextView)findViewById(R.id.tvhasil1);
        
        bbanding1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			int a1 = Integer.parseInt(ea1.getText().toString());
			int b1 = Integer.parseInt(eb1.getText().toString());
			int c1 = Integer.parseInt(ec1.getText().toString());
			
			if(a1>b1 && a1>b1 && b1>c1 ){
				thasil1.setText("Nilai A = " +a1+ " merupakan nilai terbesar sedangkan Nilai C = " +c1+ " merupakan nilai terkecil");
			} else if (a1>b1 && a1>c1 && c1>b1){
				thasil1.setText("Nilai A = " +a1+ " merupakan nilai terbesar sedangkan Nilai B = " +b1+ " merupakan nilai terkecil");
			} else if (b1>a1 && b1>c1 && a1>c1){
				thasil1.setText("Nilai B = " +b1+ " merupakan nilai terbesar sedangkan nilai C = " +c1+ " merupakan nilai terkecil" );
			} else if (b1>a1 && b1>c1 && c1>a1){
				thasil1.setText ("Nilai B = " +b1+ " merupakan nilai terbesar sedangkan nilai A = " +a1+ " merupakan nilai terkecil" );
			} else if (c1>a1 && c1>b1 && a1>b1){
				thasil1.setText ("Nilai C = " +c1+ " merupakan nilai terbesar sedangkan nilai B = " +b1+ " merupakan nilai terkecil" );
			} else if (c1>a1 && c1>b1 && b1>a1) {
				thasil1.setText ("Nilai C = " +c1+ " merupakan nilai terbesar sedangkan nilai A = " +a1+ " merupakan nilai terkecil" );
			} else if (a1>b1 && a1>c1 && b1==c1){
				thasil1.setText ("Nilai A = " +a1+ " merupakan nilai terbesar sedangkan nilai B = "+b1+ " dan nilai C = "+c1+ " sama");
			} else if (b1>a1 && b1>c1 && a1==c1){
				thasil1.setText ("Nilai B = " +b1+ " merupakan nilai terbesar sedangkan nilai A = "+a1+ " dan nilai C = "+c1+ " sama");
			} else if (c1>a1 && c1>b1 && a1==b1) {
				thasil1.setText ("Nilai C = " +c1+ " merupakan nilai terbesar sedangkan nilai A = "+a1+ " dan nilai B = "+b1+ " sama");
			} else {
				thasil1.setText ("Hasilnya sama");
			}
			}
		});
	}
	
}
