package gcit.edu.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE= "gcit.edu.todo_12.extra.MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donut(View view) {
        Toast.makeText(this, "You Ordered Donut", Toast.LENGTH_SHORT).show();
    }

    public void ice(View view) {
        Toast.makeText(this, "You Ordered Ice Cream", Toast.LENGTH_SHORT).show();
    }

    public void froyo(View view) {
        Toast.makeText(this, "You Ordered Froyo", Toast.LENGTH_SHORT).show();
    }

    public void call(View view) {
        Intent obj=new Intent(gcit.edu.todo_12.MainActivity.this,gcit.edu.todo_12.MainActivity2.class);
        obj.putExtra(EXTRA_MESSAGE,mOrderMessage);
        startActivity(obj);
    }
}