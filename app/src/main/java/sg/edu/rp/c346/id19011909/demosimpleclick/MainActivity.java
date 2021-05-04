package sg.edu.rp.c346.id19011909.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //1. Declaring Variable,
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Linking Variable,
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);

        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioButtonGender);


        //3. Setting Action,
/*        btnDisplay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String stringResponse = etInput.getText().toString();
               tvDisplay.setText(stringResponse);
           }
        });*/


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbtn.isChecked())
                {   etInput.setEnabled(true);       }
                else
                {   etInput.setEnabled(false);      }

            }
        });


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String Final = "";
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    Final = "He says " + stringResponse ;
                }
                else{
                    // Write the code when female selected
                    Final = "She says " + stringResponse;
                }
                tvDisplay.setText(Final);
            }
        });



    }
}