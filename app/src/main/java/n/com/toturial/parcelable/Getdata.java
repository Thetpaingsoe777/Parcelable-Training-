package n.com.toturial.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import n.com.toturial.parcelable.Parcel.Userdata;

public class Getdata extends AppCompatActivity {
    EditText txtnrc;
    Button finished;
    String nrc;
    Userdata udata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);

       udata=getIntent().getParcelableExtra("data");

       Toast.makeText(getApplicationContext(),udata.getUser_address(),Toast.LENGTH_SHORT).show();



    }
}
