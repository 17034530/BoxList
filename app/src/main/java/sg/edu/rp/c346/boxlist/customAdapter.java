package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;


public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<box> boxlist;

    public customAdapter(@NonNull Context context, int resource, @NonNull ArrayList<box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxlist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView imbox = rowView.findViewById(R.id.imageViewBox);
        box currentItem = boxlist.get(position);
        if (currentItem.getColor().equalsIgnoreCase("blue")) {
            imbox.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getColor().equalsIgnoreCase("orange")) {
            imbox.setImageResource(R.drawable.orange_box);
        } else if (currentItem.getColor().equalsIgnoreCase("brown")) {
            imbox.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}