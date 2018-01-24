package za.ac.cput.inforshareapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class TestActivity extends AppCompatActivity {
    TextView id,siteId,email,name;
    Button btn;
   // User user;
   // UserModel userModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        id=findViewById(R.id.id);
        siteId=findViewById(R.id.siteId);
        email=findViewById(R.id.email);
        name=findViewById(R.id.name);
        btn=findViewById(R.id.button);
      //  userModel = ViewModelProviders.of(this).get(UserModel.class);
        Bundle info=getIntent().getExtras();
        siteId.setText((String)info.get("insti"));
        email.setText((String)info.get("email"));

      //  user=new User(1, siteId.getText().toString(),email.getText().toString(),name.getText().toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{

                    Toast.makeText(getApplicationContext(), "Done",Toast.LENGTH_LONG);
                    }
                catch (Exception e){
                    Log.d("Error DAO ","At on Click to init DAO Error"+e.getMessage());
                }


            }
        });

    }
}
