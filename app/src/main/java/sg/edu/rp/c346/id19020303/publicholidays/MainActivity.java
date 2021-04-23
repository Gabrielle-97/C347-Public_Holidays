package sg.edu.rp.c346.id19020303.publicholidays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvHoliday);

        //Create a few Holiday objects in Food Array
        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday("New Year's Day", "1st Jan 2021"));
        holiday.add(new Holiday("Chinese New Year", "12 February 2021"));
        holiday.add(new Holiday("Good Friday", "2nd April 2021"));
        holiday.add(new Holiday("Labour Day", "1st May 2021"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

    }
}