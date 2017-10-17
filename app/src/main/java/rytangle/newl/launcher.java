package rytangle.newl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class launcher extends Activity {
    String pakmeg="io.rytangle.vfs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    @Override
    public void onBackPressed() {
    }

    public void showapp(View view) {

        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(pakmeg);
        startActivity( LaunchIntent );

    }

    public void onShowDialogWindow(View view) {
        setContentView(R.layout.popup);
    }

    public void cancelActivity(View view) {
        setContentView(R.layout.activity_launcher);

    }

    public void validate(View view) {
        EditText password = findViewById(R.id.pwd);

        if(password.getText().toString().equals("1234")){
            Log.i("log","authencaticate");
            Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.settings");
            startActivity( LaunchIntent );
            //correcct password
        }else{
            Log.i("log","wrong");
            setContentView(R.layout.activity_launcher);
        }
    }
}

