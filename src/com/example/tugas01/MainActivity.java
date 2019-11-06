package com.example.tugas01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lvjudul;
	String[] judul = {"Profil", "Quiz", "Exit"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lvjudul = (ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, judul);
	    lvjudul.setAdapter(adapter);
        lvjudul.setOnItemClickListener(ListClick);
  }
	private AdapterView.OnItemClickListener ListClick = new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			if (arg2==0){
				Intent intent = new Intent(MainActivity.this, Profil.class);
				startActivity(intent);
			} else if (arg2==1) {
				Intent intent = new Intent(MainActivity.this, MainActivity2.class);
				startActivity(intent);
			} else if (arg3>=2){
			  System.exit(0);
			}
		}
	};
}
