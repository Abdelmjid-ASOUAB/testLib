package pay.youcan.abde_libr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pay.youcan.abdelibr.AbdeLib;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbdeLib.logAbde("Test","swnbc vjs");
    }
}