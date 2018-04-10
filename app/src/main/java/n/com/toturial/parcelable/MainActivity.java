package n.com.toturial.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import n.com.toturial.parcelable.Parcel.Userdata;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtemail,txtaddress;
    Button register;
    String name,emai,address;
    Userdata usdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname=(EditText)findViewById(R.id.etname);
        txtemail=(EditText)findViewById(R.id.etemail);
        txtaddress=(EditText)findViewById(R.id.etaddress);
        register=(Button)findViewById(R.id.btnRegister);






        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=txtname.getText().toString();
                emai=txtemail.getText().toString();
                address=txtaddress.getText().toString();





                usdata=new Userdata();


                usdata.setUser_name(name);





                usdata.setUser_name(name);
                usdata.setUser_email(emai);
                usdata.setUser_address(address);

               Intent i=new Intent(MainActivity.this,Getdata.class);
               i.putExtra("data",usdata);
               startActivity(i);
            }
        });

    }


}
