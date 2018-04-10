package n.com.toturial.parcelable.Parcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by HP on 4/8/2018.
 */

public class p implements Parcelable {

    private String name;
    private String email;
    private String pas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public static Creator<p> getCREATOR() {
        return CREATOR;
    }

    public p(){}


    protected p(Parcel in) {
      name=in.readString();
      email=in.readString();
      pas=in.readString();
    }

    public static final Creator<p> CREATOR = new Creator<p>() {
        @Override
        public p createFromParcel(Parcel in) {
            return new p(in);
        }

        @Override
        public p[] newArray(int size) {
            return new p[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(name);
    parcel.writeString(email);
    parcel.writeString(pas);


    }
}
