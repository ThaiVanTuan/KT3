package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietBaiThoActivity extends AppCompatActivity {
    TextView txtChiTietBaiTho;
    TextView txtBaiTho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bai_tho);
        txtChiTietBaiTho =(TextView) findViewById(R.id.chitiettho);
        txtBaiTho =(TextView) findViewById(R.id.baitho);
        Intent intent= getIntent();
        txtChiTietBaiTho.setText(intent.getStringExtra("tentacpham"));
        if(intent.getStringExtra("tentacpham").equals("Từ Ấy")){
            txtBaiTho.setText(ChiTietBaiTho.TUAY);
        }else if(intent.getStringExtra("tentacpham").equals("Việt Bắc")){
            txtBaiTho.setText(ChiTietBaiTho.VIETBAC);
        }else if(intent.getStringExtra("tentacpham").equals("Mùa Thu Mới")){
            txtBaiTho.setText(ChiTietBaiTho.MUATHUMOI);
        }
        ImageView imgBack= (ImageView) findViewById(R.id.btnBackChiTiet);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChiTietBaiThoActivity.this,DetailActivity.class));
            }
        });
    }


}