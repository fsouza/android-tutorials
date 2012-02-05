package com.chico.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LunchList extends Activity {
    private Restaurante r = new Restaurante();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button save = (Button)this.findViewById(R.id.save);
        save.setOnClickListener(onSave);
    }

    private View.OnClickListener onSave = new View.OnClickListener() {
        public void onClick(View v) {
            EditText nome = (EditText)findViewById(R.id.name);
            EditText endereco = (EditText)findViewById(R.id.address);

            r.setNome(nome.getText().toString());
            r.setEndereco(endereco.getText().toString());

            System.out.println(r.getNome());
            System.out.println(r.getEndereco());
        }
    };
}
