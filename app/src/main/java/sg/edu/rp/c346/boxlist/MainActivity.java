package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvbox;
    ArrayList<box> boxArrayList;
    customAdapter boxs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvbox = findViewById(R.id.listViewBox);
        boxArrayList= new ArrayList<>();
        boxArrayList.add(new box("blue"));
        boxArrayList.add(new box("orange"));
        boxArrayList.add(new box("brown"));

        boxs = new customAdapter(this,R.layout.box_item,boxArrayList);
        lvbox.setAdapter(boxs);
    }
}
