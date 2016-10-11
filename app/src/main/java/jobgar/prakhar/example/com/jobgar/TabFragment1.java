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

public class TabFragment1 extends Fragment {

    View rootView;
    private CustomScrollView scrollView;;
    private ExpandableGridView expandableGridView;
    private GridAdapter gridAdapter;
    private  GridView gridView;
    public static List<GridView> gridViewList = new ArrayList<GridView>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab_fragment_1, container, false);
        expandableGridView = (ExpandableGridView) rootView.findViewById(R.id.gridFeed);
        expandableGridView.setExpanded(true);
        expandableGridView.setFocusable(false);
        gridAdapter = new GridAdapter(getContext(), gridViewList);
        expandableGridView.setAdapter(null);
        expandableGridView.setAdapter(gridAdapter);
        for (int i = 0; i < 10; i++)
        {
            gridView = new GridView();
            gridView.setLikes(i);
            gridViewList.add(gridView);
        }
        gridAdapter.notifyDataSetChanged();
        expandableGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),"Grid Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
