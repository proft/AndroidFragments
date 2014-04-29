package proft.me.pointsonmap.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.TextView;


public class PointDetailActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        setContentView(R.layout.fragment_detail);

//        if (savedInstanceState == null) {
//            Bundle arguments = new Bundle();
//            String point = getIntent().getStringExtra(PointDetailFragment.ARG_ITEM_ID);
//            arguments.putString(PointDetailFragment.ARG_ITEM_ID, point);
//
//            PointDetailFragment fragment = new PointDetailFragment();
//            fragment.setArguments(arguments);
//            getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragment).commit();
//        }

        Intent i = this.getIntent();
        String s = i.getExtras().getString(PointDetailFragment.ARG_ITEM_ID);

        TextView tvPoint = (TextView) findViewById(R.id.tvPoint);
        tvPoint.setText(s);

//        fragmentDetail.setText(s);

//        Log.d("SwA", "URL ["+link+"]");
//        wvf.init(link);
//        getFragmentManager().beginTransaction().add(android.R.id.content, wvf).commit();

    }


}