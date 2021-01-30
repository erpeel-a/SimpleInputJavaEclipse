package com.example.formsiswa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	
	EditText editTxt1, editTxt2, editTxt3, editTxt4;
	Button btn;
	TextView textVw;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editTxt1 = (EditText)findViewById(R.id.editText1);
		editTxt2 = (EditText)findViewById(R.id.editText2);
		editTxt3 = (EditText)findViewById(R.id.editText3);
		editTxt4 = (EditText)findViewById(R.id.editText4);
		btn = (Button)findViewById(R.id.button1);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				textVw = (TextView)findViewById(R.id.textView3);
				textVw.setText("Nama \t : " + editTxt1.getText().toString() +
							   "\n NIS \t : " + editTxt4.getText().toString() +
							   "\n Tempat Lahir \t : " + editTxt2.getText().toString() +
							   "\n Tanggal Lahir \t : " + editTxt3.getText().toString());				
			}
		});
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
