package com.syaikhanagil.belajar.editText;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.text.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final EditText edit = findViewById(R.id.mainEditText);
		final TextView text = findViewById(R.id.mainText);
		edit.addTextChangedListener(new TextWatcher(){

				@Override
				public void beforeTextChanged(CharSequence s, int start, int count, int after)
				{
					
				}

				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count)
				{
					
				}

				@Override
				public void afterTextChanged(Editable s)
				{
					String name = edit.getText().toString();
					text.setText("Hi "+name);
				}

			
		});
    }
}
