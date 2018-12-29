package com.example.android.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast = (Button) findViewById(R.id.button);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Data is saved successfully", Toast.LENGTH_SHORT).show();
                Toast("Bello");
            }
        });


    }

    public void Toast(String message)
    {
        View toastView= getLayoutInflater().inflate(R.layout.toast, (ViewGroup) findViewById(R.id.laylout));
        TextView tv=(TextView) toastView.findViewById(R.id.textView);
        tv.setText(message);
        Toast toast=new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastView);
        toast.show();
    }
}
