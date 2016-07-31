package softwarefactory.androidlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void onClickDone(View v){
        // finish() essentially closes this activity keeping your app's memory useage clean.
        // Also equivalent to the back button.
        finish();
    }
}
