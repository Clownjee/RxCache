package com.clownjee.rxcache;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.clownjee.rxcache.cache.RxCache;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File(Environment.getExternalStorageDirectory().toString() + File.separator + "RxCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        RxCache.init("CACHE", 10 * 1024, file.getPath());
    }
}
