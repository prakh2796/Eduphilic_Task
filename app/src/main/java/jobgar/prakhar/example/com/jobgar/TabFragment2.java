package jobgar.prakhar.example.com.jobgar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prakhar Gupta on 10/10/2016.
 */

public class TabFragment2 extends Fragment {

    private ExpandableListView expandableListView;
    private ListAdapter listAdapter;
    private  ListItem listItem;
    private static List<ListItem> listItemList = new ArrayList<ListItem>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.tab_fragment_2, container, false);
        expandableListView = (ExpandableListView) view.findViewById(R.id.listview);
        expandableListView.setExpanded(true);
        expandableListView.setFocusable(false);
        listAdapter = new ListAdapter(getContext(), listItemList);
        expandableListView.setAdapter(null);
        expandableListView.setAdapter(listAdapter);
        for (int i = 0; i < 10; i++)
        {
            listItem = new ListItem();
            listItem.setUsername("Username " + i);
            listItem.setLikes(i);
            listItemList.add(listItem);
        }
        listAdapter.notifyDataSetChanged();
        expandableListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),"List Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
