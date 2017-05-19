package helloworld.madmindlab.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstEditText, secondEditText;
    private Button posButton, negButton, mulButton, divButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing edittexts
        firstEditText = (EditText) findViewById(R.id.id_firstValue);
        secondEditText = (EditText) findViewById(R.id.id_secondValue);

        //init buttons

        posButton = (Button) findViewById(R.id.plus_button);
        negButton = (Button) findViewById(R.id.minus_button);
        mulButton = (Button) findViewById(R.id.multiply_button);
        divButton = (Button) findViewById(R.id.divide_button);

        //init textView

        textView = (TextView) findViewById(R.id.result_text_view);

        //get value from edit text


        //making listener for buttons

        posButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =  Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                int result = num1+num2;
                textView.setText(" "+result);
            }
        });

         negButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int num1 =  Integer.parseInt(firstEditText.getText().toString());
                 int num2 = Integer.parseInt(secondEditText.getText().toString());
                 int result = num1-num2;
                // Log.d("firstProgram","result is "+(num1-num2));
                 textView.setText(" "+result);
             }
         });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                int result = num1*num2;
                textView.setText(" "+result);
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                int result = num1/num2;
                textView.setText(" "+result);
            }
        });

    }
}
