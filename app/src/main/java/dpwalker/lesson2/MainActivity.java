package dpwalker.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void SubmitOrder(View view){display(1);
}

    private void display(int i) {
        TextView CupQuantity = (TextView) findViewById(R.id.cupQuantity)
    }


}


