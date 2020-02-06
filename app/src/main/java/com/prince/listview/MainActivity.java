package com.prince.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int PostionOfItem;
ListView monthlist;
ArrayAdapter arrayAdapter;
private String[] months={"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monthlist=(ListView)findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,months);
        monthlist.setAdapter(arrayAdapter);
      monthlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
               PostionOfItem = position;
              String itemValue=(String)monthlist.getItemAtPosition(position);
              Toast.makeText(MainActivity.this, "Item is : "+itemValue+"  , Position is : "+(position+1), Toast.LENGTH_LONG).show();

          }
      });
       

    }
}
