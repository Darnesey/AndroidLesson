package softwarefactory.androidlesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (TextView) findViewById(R.id.textMain);

    }

    public void onClickExampleOutput(View v){
        main.setText(R.string.exampleOutput);
    }

    public void OnClickNavigate(View v){
        // Intent builds a reference stating that we are going to be navigating from the main activity
        // to SecondaryActivity. This is essentially backlogging what the last page we were in was
        // (kind of like a web browser's back button. Without this, we would lose our progress
        // inside main activity.
        Intent intent = new Intent(this, SecondaryActivity.class);
        // this is the call that actually opens the secondary page.
        startActivity(intent);
    }


}
