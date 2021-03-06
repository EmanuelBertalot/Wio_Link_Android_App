package cc.seeed.iot.ui_main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import cc.seeed.iot.R;
import cc.seeed.iot.webapi.model.Node;

public class MainSettingActivity extends AppCompatActivity {
    public Toolbar mToolbar;
    public Node node;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Node Setting");

        MainPreferenceFragment fragment = new MainPreferenceFragment();
        getFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();
    }


}
