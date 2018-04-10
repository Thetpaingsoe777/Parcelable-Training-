package n.com.toturial.parcelable.Parcel;
import android.os.Parcel;
import android.os.Parcelable;
/**
 * Created by HP on 4/5/2018.
 */

public class Userdata implements Parcelable {

    private String user_name;
    private String user_email;
    private String user_address;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Userdata(){

    }


        protected Userdata(Parcel in) {
            user_name=in.readString();
            user_email=in.readString();
            user_address=in.readString();
    }

    public static final Creator<Userdata> CREATOR = new Creator<Userdata>() {
        @Override
        public Userdata createFromParcel(Parcel in) {
            return new Userdata(in);
        }

        @Override
        public Userdata[] newArray(int size) {
            return new Userdata[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(user_name);
        parcel.writeString(user_email);
        parcel.writeString(user_address);
    }
}
