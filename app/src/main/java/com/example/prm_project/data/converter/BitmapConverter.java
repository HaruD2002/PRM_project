package com.example.prm_project.data.converter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.room.TypeConverter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class BitmapConverter {
    @TypeConverter
    public static byte[] fromBitmap(Bitmap bitmap){
        if(bitmap == null){
            return null;
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        if(bitmap.hasAlpha()){
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        }else {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        }
        return stream.toByteArray();
    }

    @TypeConverter
    public static Bitmap toBitmap(byte[] byteArray){
        if(byteArray == null || byteArray.length == 0){
            return null;
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

}
