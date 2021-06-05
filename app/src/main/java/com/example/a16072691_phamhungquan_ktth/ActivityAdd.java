package com.example.a16072691_phamhungquan_ktth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityAdd extends AppCompatActivity {
    EditText et_ma, et_ten, et_donvi, et_gia;
    Button bt_save, bt_reset, bt_exit;
    DataBaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        et_ma = (EditText) findViewById(R.id.edt_idsp);
        et_ten = (EditText) findViewById(R.id.edt_namesp);
        et_donvi = (EditText) findViewById(R.id.edt_donvisp);
        et_gia = (EditText) findViewById(R.id.edt_giasp);
        dbHelper = new DataBaseHelper(this);

        bt_save = (Button) findViewById(R.id.btn_save);
        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product product = new Product();
                product.setMa(Integer.parseInt(et_ma.getText().toString()));
                product.setTen(et_ten.getText().toString());
                product.setDonvi(et_donvi.getText().toString());
                product.setGia(Integer.parseInt(et_gia.getText().toString()));
                if(dbHelper.insertProduct(product) >0)
                    Toast.makeText(getApplicationContext(),"Lưu không thành công",
                            Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Lưu thành công",
                            Toast.LENGTH_LONG).show();
            }
        });

        bt_exit= (Button) findViewById(R.id.btn_Exit1);
        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}