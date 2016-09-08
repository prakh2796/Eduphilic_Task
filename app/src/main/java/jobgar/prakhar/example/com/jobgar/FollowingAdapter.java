package jobgar.prakhar.example.com.jobgar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prakhar Gupta on 08/09/2016.
 */
public class FollowingAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<FollowingItem> followingItemList;

    public FollowingAdapter(Activity activity, List<FollowingItem> followingItemList) {
        this.activity = activity;
        this.followingItemList = followingItemList;
    }

    @Override
    public int getCount() {
        return followingItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return followingItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null) {
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        view = inflater.inflate(R.layout.row_following, null);
        FollowingItem followingItem = followingItemList.get(i);
        TextView companyName = (TextView) view.findViewById(R.id.company_name);
        TextView industry = (TextView) view.findViewById(R.id.industry);
        companyName.setText(followingItem.getCompanyName());
        industry.setText(followingItem.getIndustry());
        return view;
    }
}
