package com.example.fessutival_re.calendarPage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fessutival_re.R;

import java.util.List;

public class EventAdapter extends BaseAdapter {
    private Context context;
    private List<Object> items; // 데이터 리스트

    // 생성자
    public EventAdapter(Context context, List<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_event, parent, false);
        }

        TextView tvSectionTitle = convertView.findViewById(R.id.tv_section_title);
        TextView tvEventName = convertView.findViewById(R.id.tv_event_name);

        Object item = items.get(position);

        if (item instanceof EventSection) {
            EventSection section = (EventSection) item;
            tvSectionTitle.setText(section.getTitle());
            tvSectionTitle.setVisibility(View.VISIBLE);
            tvEventName.setVisibility(View.GONE);
        } else if (item instanceof Event) {
            Event event = (Event) item;
            tvEventName.setText(event.getName());
            tvEventName.setVisibility(View.VISIBLE);
            tvSectionTitle.setVisibility(View.GONE);
        }

        return convertView;
    }
}
