package com.example.dellpc.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rv;
    private Hospital hospital;
    private ArrayList<Hospital> hospitalList;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      //  this.mapping();

        rv=(RecyclerView)findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setItemAnimator(new DefaultItemAnimator());
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(this, R.dimen.item_offset);
        rv.addItemDecoration(itemDecoration);



        this.setList();



    }

    public void setList(){
      hospitalList = new ArrayList<>();
        for(int i=1;i<8;i++){
          hospital =new Hospital();
          hospital.setHospitalId(i);
          hospital.setHospitalName("Hospital "+i);
          hospital.setLocation("Location"+i);
          hospitalList.add(hospital);
      }
        HomeEventsAdapter homeEventsAdapter = new HomeEventsAdapter(this, hospitalList);
        rv.setAdapter(homeEventsAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
