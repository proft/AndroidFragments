package proft.me.pointsonmap.app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PointsListFragment extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] {
                "Point 1",
                "Point 2",
                "Point 3"};

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        PointDetailFragment fragment = (PointDetailFragment)getFragmentManager().findFragmentById(R.id.fragment_detail);

        if (fragment != null && fragment.isInLayout()) {
            fragment.setText(item);
        } else {
            Intent intent = new Intent(getActivity().getApplicationContext(), PointDetailActivity.class);
            intent.putExtra(PointDetailFragment.ARG_ITEM_ID, item);
            startActivity(intent);
        }
    }

}