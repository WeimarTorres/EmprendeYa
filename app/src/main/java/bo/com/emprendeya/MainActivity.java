package bo.com.emprendeya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG, "onCreate");

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LOG, "onResume");

        //Consumir los recursos
        //La foto fue subida con exito.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LOG, "onPause");

        //Liberar los recursos
        //Continuar subiendo la foto
    }

    private void subirFotoAInstagram() {

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LOG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(LOG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LOG, "onDestroy");
    }

    public void openSecondActivity(View view) {
        startActivity(new Intent(MainActivity.this, Activity2.class));
    }
}