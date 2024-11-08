package com.example.fessutival.schedule;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.fessutival.R;

public class EventAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_SECTION = 0;
    private static final int TYPE_ITEM = 1;

    private List<Object> items; // 이벤트와 섹션 데이터를 포함하는 리스트

//    public EventAdapter(List<Object> items) {
//        this.items = items;
//    }

    public EventAdapter(List<Object> items) {
        if (items == null) {
            this.items = new ArrayList<>(); // items가 null이면 빈 리스트로 초기화
        } else {
            this.items = items;
        }
    }
    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof EventSection) {
            return TYPE_SECTION;
        } else {
            return TYPE_ITEM;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_SECTION) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_event_section, parent, false);
            return new SectionViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_event, parent, false);
            return new ItemViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // 디버깅 로그: 현재 position에서 items 리스트에 들어 있는 객체의 클래스 이름을 출력합니다.
        Log.d("EventAdapter", "Item at position " + position + ": " + items.get(position).getClass().getSimpleName());


        if (holder instanceof SectionViewHolder) {
            EventSection section = (EventSection) items.get(position);
            ((SectionViewHolder) holder).sectionTitle.setText(section.getTitle());
            Log.d("EventAdapter", "Section: " + section.getTitle());
        } else if (holder instanceof ItemViewHolder) {
            Event event = (Event) items.get(position);
            ((ItemViewHolder) holder).eventName.setText(event.getName());
            Log.d("EventAdapter", "Event: " + event.getName());
        }
    }

    @Override
    public int getItemCount() {
        Log.d("EventAdapter", "Item count: " + items.size());
        return items.size();
    }

    // Section ViewHolder
    static class SectionViewHolder extends RecyclerView.ViewHolder {
        TextView sectionTitle;

        SectionViewHolder(@NonNull View itemView) {
            super(itemView);
            sectionTitle = itemView.findViewById(R.id.section_title);
        }
    }

    // Item ViewHolder
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView eventName;

        ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.event_name);
        }
    }
}
