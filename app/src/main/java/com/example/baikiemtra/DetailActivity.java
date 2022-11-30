package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    TextView txtName ;
    ListView lvDetail;
    List<String> ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        txtName = (TextView) findViewById(R.id.tenTacGiaDeTal);
        lvDetail =(ListView) findViewById(R.id.listViewDeTail);
        ar = new ArrayList<>();
        Intent intent = getIntent();
        txtName.setText(intent.getStringExtra("name"));
        ar.add(ToHuu.t1);
        ar.add(ToHuu.t2);
        ar.add(ToHuu.t3);
       ArrayAdapter arrayAdapter = new ArrayAdapter(DetailActivity.this, android.R.layout.simple_list_item_1,ar);
       lvDetail.setAdapter(arrayAdapter);
       lvDetail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent1 = new Intent(DetailActivity.this,ChiTietBaiThoActivity.class);
              intent1.putExtra("tentacpham",ar.get(i));
              startActivity(intent1);
           }
       });

        ImageView imgBack =(ImageView) findViewById(R.id.btnBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailActivity.this,ListTacGiaActivity.class));
            }
        });
    }
}