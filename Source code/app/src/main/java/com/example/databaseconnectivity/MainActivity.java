package com.example.databaseconnectivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText editTextId, editTextName;
    MyDB MyDBHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDBHandler = new MyDB(getApplicationContext(),"student",null,1);
        editTextId=findViewById(R.id.ID_EditText);
        editTextName=findViewById(R.id.Name_EditText);
    }
    public void Insert(View view){
        String studentId = editTextId.getText().toString();
        String studentName = editTextName.getText().toString();

        if(studentId.equals("")||studentName.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter the Data Required",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            MyDBHandler.Read_Data(studentId,studentName);
            Toast.makeText(getApplicationContext(), "Record Inserted Successfully",
                    Toast.LENGTH_SHORT).show();
        }
    }
    public void Display(View v) {
        String data = MyDBHandler.Display_Data();
        if(data.equals("")){
            Toast.makeText(getApplicationContext(), "No Record Found", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
        }
    }
    public void Delete(View v) {
        String id = editTextId.getText().toString();
        if(id.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter the Student Id", Toast.LENGTH_SHORT).show();
        }
        else{
            if(MyDBHandler.Delete_Data(id)==1)
            {
                Toast.makeText(getApplicationContext(), "Record Deleted Successfully",
                        Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "No Record Found", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
