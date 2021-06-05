package com.example.a16072691_phamhungquan_ktth;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(@Nullable Context context) {
        super(context, "BD.sqlite",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Product("+
                "ma integer primary key,"+
                "ten text,"+
                "donvi text,"+
                "gia interger)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Product");
        onCreate(sqLiteDatabase);

    }

    public int insertProduct(Product product){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ma", product.getMa());
        contentValues.put("ten", product.getTen());
        contentValues.put("donvi", product.getDonvi());
        contentValues.put("gia", product.getGia());
        int result =(int)db.insert("Products",null , contentValues);
        db.close();
        return result;
    }

}
