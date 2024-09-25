package edu.niu.android.colorapp;


import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText colorOne = (EditText) findViewById(R.id.colorOne);

        findViewById(R.id.colorOne).setOnKeyListener(new View.OnKeyListener(){

            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String textColorOne = colorOne.getText().toString();
                if(textColorOne.isEmpty()){
                    findViewById(R.id.colorOne).setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                }
                else{
                    String tempColorValue = String.format("%02X", Integer.parseInt(textColorOne));
                    String colorValue = "#FF" + tempColorValue + "00" + "00";
                    int i1 = Color.parseColor(colorValue);
                    findViewById(R.id.colorOne).setBackgroundColor(i1);
                }
                return false;
            }
        });

    }

    public void generateColor(View view){
        String stringOne = ((EditText) findViewById(R.id.colorOne)).getText().toString();
        String stringTwo = ((EditText)findViewById(R.id.colorTwo)).getText().toString();
        String stringThree = ((EditText)findViewById(R.id.colorThree)).getText().toString();
        if(!stringOne.isEmpty() && !stringTwo.isEmpty() && !stringThree.isEmpty()){
            Integer colorOne = Integer.valueOf(stringOne);
            Integer colorTwo = Integer.valueOf(stringTwo);
            Integer colorThree = Integer.valueOf(stringThree);
            ColorApp colorApp = new ColorApp();
            String color = colorApp.findHex(colorOne, colorTwo, colorThree);
            int colorValue = Color.parseColor(color);
            TextView output = findViewById(R.id.outputColor);
            output.setBackgroundColor(colorValue);
            output.setTextColor(colorValue);
        }
        else {
            ((EditText) findViewById(R.id.colorOne)).setError("All Fields Are Mandatory");
            ((EditText) findViewById(R.id.colorTwo)).setError("All Fields Are Mandatory");
            ((EditText) findViewById(R.id.colorThree)).setError("All Fields Are Mandatory");

        }




    }
}