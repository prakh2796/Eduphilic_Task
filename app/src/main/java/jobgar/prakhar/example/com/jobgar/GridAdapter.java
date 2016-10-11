package jobgar.prakhar.example.com.jobgar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prakhar Gupta on 11/10/2016.
 */

public class GridAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<GridView> gridViewList;

    public GridAdapter(Context context, List<GridView> gridViewList) {
        this.context = context;
        this.gridViewList = gridViewList;
    }

    @Override
    public int getCount() {
        return gridViewList.size() ;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        view = inflater.inflate(R.layout.gridview, null);
        TextView textView = (TextView) view.findViewById(R.id.blockLikes1);
        GridView gridView = gridViewList.get(i);
        textView.setText(String.valueOf(gridView.getLikes()));
        return view;
    }
}
