package com.sertecayo.prueba1;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View boton=findViewById(R.id.button1);
        boton.setOnClickListener(this);
    }        
    @Override
    public void onClick(View v){
    	Intent intencion=new Intent(this, MenuPrincipal.class);
    	startActivity(intencion);
    	Toast.makeText(this, "Un momento por favor", 1).show();
    }
}
