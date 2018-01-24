package za.ac.cput.inforshareapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import za.ac.cput.inforshareapp.services.Validate;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    Button btnProceed;
    EditText editTextEmail;
    Spinner spinnerInstitution;
    EditText editTextPassword;
   public static String email,pass,insti;
    TextView textView ;


    byte bs=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bs=0;
        setContentView(R.layout.activity_main);
        editTextEmail= findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);

        textView = findViewById(R.id.tv3);
        btnProceed=findViewById(R.id.btn_login);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=editTextEmail.getText().toString();
                if(bs==0 && Validate.isValidEmail(email)){
                    bs++;
                   loadSpinner();
                    findViewById(R.id.tv2).setVisibility(View.VISIBLE);
                    spinnerInstitution.setVisibility(View.VISIBLE);

                }
                else// TO DO need more work
                    if(bs==1)
                        {
                            bs++;
                            email=editTextEmail.getText().toString();
                            pass=editTextPassword.getText().toString();
                            Toast.makeText(view.getContext(),"Your Credentials "+email+" & "+pass,Toast.LENGTH_LONG).show();
                         Intent intent=new Intent(MainActivity.this ,TestActivity.class);
                         intent.putExtra("email", email);
                         intent.putExtra("insti",insti);
                         startActivity(intent);


                        }
                        else {

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

                                        if (!isFinishing()){
                                            new AlertDialog.Builder(MainActivity.this)
                                                    .setTitle("Alert!")
                                                    .setMessage("BS value is "+bs)
                                                    .setCancelable(true)
                                                    .show();
                                        }
                                }
                            });
                        bs=0;
                        }
            }
        });

            }



    private void loadSpinner() {
        spinnerInstitution=findViewById(R.id.spinnerInstitution);
        List<String> list = new ArrayList<String>();
        list.add("CPUT");
        list.add("UCT");
        list.add("ADMIN");
        try {

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                    android.R.layout.select_dialog_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
            spinnerInstitution.setAdapter(dataAdapter);
            spinnerInstitution.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    insti = spinnerInstitution.getSelectedItem().toString();

                    textView.setText(" Enter Your Password for "+insti);
                    btnProceed.setText("Login");
                    textView.setVisibility(View.VISIBLE);
                    editTextPassword.setVisibility(View.VISIBLE);

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }
        catch (Exception e){
            Toast.makeText(this,"Exception on Spinner Load"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}


