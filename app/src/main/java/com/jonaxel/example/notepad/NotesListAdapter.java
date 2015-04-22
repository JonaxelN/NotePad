package com.jonaxel.example.notepad;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by JonathanAxel on 21/04/15.
 */
public class NotesListAdapter extends CursorAdapter {

    private String[] from;

    public NotesListAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        // and an array of the fields we want to bind those fields to (in this case just text1)
        //int[] to = new int[]{R.id.text1};
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.item_row_notas_alma, viewGroup, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView titleTxt = (TextView) view.findViewById(R.id.rowTitle);

        String title = cursor.getString(cursor.getColumnIndexOrThrow(NotesDbAdapter.KEY_TITLE));

        titleTxt.setText(title);
    }

}
