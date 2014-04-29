package proft.me.pointsonmap.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PointDetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item";
    private String point;
    TextView tvPoint;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (getArguments().containsKey(ARG_ITEM_ID)) {
//            point = getArguments().getString(ARG_ITEM_ID);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

//        if (point != null) {
//            tvPoint = (TextView)view.findViewById(R.id.tvPoint);
//            tvPoint.setText(point);
////            setText(point);
//        }

        return view;
    }

    public void setText(String item){
        tvPoint = (TextView)getView().findViewById(R.id.tvPoint);
        tvPoint.setText(item);
    }
}