package jobgar.prakhar.example.com.jobgar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prakhar Gupta on 11/10/2016.
 */

public class ListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<ListItem> listItemList;

    public ListAdapter(Context context, List<ListItem> listItemList) {
        this.context = context;
        this.listItemList = listItemList;
    }

    @Override
    public int getCount() {
        return listItemList.size();
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
        view = inflater.inflate(R.layout.row_item, null);
        TextView name = (TextView) view.findViewById(R.id.username);
        TextView likes = (TextView) view.findViewById(R.id.blockLikes1);
        ListItem listItem = listItemList.get(i);
        name.setText(listItem.getUsername());
        likes.setText(String.valueOf(listItem.getLikes()));
        return view;
    }
}
