package com.example.databaseconnectivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class MyDB extends SQLiteOpenHelper {
    public MyDB(@Nullable Context context, @Nullable String name, @Nullable
            SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student(stud_Id varChar(10) , stud_Name varChar(20))");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //body
    }
    void Read_Data(String studentId, String studentName) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("stud_Id", studentId);
        contentValues.put("stud_Name", studentName);
        db.insert("student", null, contentValues);
        db.close();
    }
    String Display_Data() {
        String result = "";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from student", null);
        while (cursor.moveToNext()) {
            String id = cursor.getString(0);
            String name = cursor.getString(1);
            result += id + ":" + name + "\n";
        }
        db.close();
        return result;
    }
    int Delete_Data(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql="delete from student where stud_Id="+id;
        return (db.delete("student","stud_Id=?",new String[]{id}));
        //db.close();
    }
}