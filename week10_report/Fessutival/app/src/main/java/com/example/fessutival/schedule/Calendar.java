package com.example.fessutival.schedule;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fessutival.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Calendar extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EventAdapter adapter;
    private List<Object> items;
    private Map<String, List<Object>> eventsByDate;
    private TextView tvDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Log.d("CalendarActivity", "onCreate called");

        // CalendarView, TextView, RecyclerView 초기화
        CalendarView calendarView = findViewById(R.id.cv_calendar);
        tvDate = findViewById(R.id.tv_date);
        recyclerView = findViewById(R.id.rv_event);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        items = new ArrayList<>();
        adapter = new EventAdapter(items);
        recyclerView.setAdapter(adapter);

        // Adapter가 null이 아닌지 확인하기 위해 로그 추가
        if (adapter != null) {
            Log.d("CalendarActivity", "Adapter is set successfully.");
        } else {
            Log.e("CalendarActivity", "Adapter is null!");
        }

        // 초기 이벤트 데이터 설정
        initializeEvents();

        // CalendarView 날짜 변경 이벤트 리스너 설정
//        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
//            // 선택된 날짜 형식 지정하여 TextView에 표시
//            String formattedDate = (month + 1) + "월 " + dayOfMonth + "일 축제 일정";
//            tvDate.setText(formattedDate);
//
//            // 선택한 날짜에 맞는 일정 표시
//            String selectedDate = year + "-" + (month + 1) + "-" + dayOfMonth;
//            updateEventsForDate(selectedDate);
//        });
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            // CalendarView의 month 값은 0부터 시작하므로, +1을 해주어야 합니다.
            String formattedMonth = String.format("%02d", month + 1); // 두 자리로 포맷
            String formattedDay = String.format("%02d", dayOfMonth); // 두 자리로 포맷

            // 선택된 날짜를 "YYYY-MM-DD" 형식으로 변환
            String selectedDate = year + "-" + formattedMonth + "-" + formattedDay;
            tvDate.setText(formattedMonth + "월 " + formattedDay + "일 축제 일정");

            // 로그 추가: 날짜 선택 시 호출 여부 확인
            Log.d("CalendarActivity", "Date selected: " + selectedDate);

            // 선택한 날짜에 맞는 이벤트를 업데이트
            updateEventsForDate(selectedDate);
        });
    }

    // 날짜별 초기 이벤트 데이터 설정
    private void initializeEvents() {
        eventsByDate = new HashMap<>();
        Log.d("CalendarActivity", "Initializing events...");

        List<Object> eventsForFirstDay = new ArrayList<>();

        eventsForFirstDay.add(new EventSection("STAGE LINE-UP"));
        eventsForFirstDay.add(new Event("위너스"));
        eventsForFirstDay.add(new Event("소리마을"));
        eventsForFirstDay.add(new Event("두메"));
        eventsForFirstDay.add(new Event("째즐"));
        eventsForFirstDay.add(new Event("파란"));

        eventsForFirstDay.add(new EventSection("STAGE LINE-UP special contents"));
        eventsForFirstDay.add(new Event("개막식"));
        eventsForFirstDay.add(new Event("w.위너스"));

        eventsForFirstDay.add(new EventSection("STAGE LINE-UP artist"));
        eventsForFirstDay.add(new Event("10cm"));
        eventsForFirstDay.add(new Event("더윈드"));
        eventsForFirstDay.add(new Event("하이라이트"));

        eventsForFirstDay.add(new EventSection("SUB STAGE"));
        eventsForFirstDay.add(new Event("영역전개"));
        eventsForFirstDay.add(new Event("애플망고치즈"));
        eventsForFirstDay.add(new Event("톤"));
        eventsForFirstDay.add(new Event("이소쿠리클럽"));
        eventsForFirstDay.add(new Event("슬기로운 경대생활"));
        eventsForFirstDay.add(new Event("권나래"));
        eventsForFirstDay.add(new Event("스파클"));
        
        eventsByDate.put("2024-09-30", eventsForFirstDay);
        Log.d("CalendarActivity", "Events for 2024-09-30 added. Size: " + eventsForFirstDay.size());

        List<Object> eventsForSecondDay = new ArrayList<>();
        eventsForSecondDay.add(new EventSection("STAGE LINE-UP SPECIAL CONTENTS"));
        eventsForSecondDay.add(new Event("토크 콘서트"));
        eventsForSecondDay.add(new Event("w. 빵송국"));
        eventsByDate.put("2024-10-01", eventsForSecondDay);
        Log.d("CalendarActivity", "Events for 2024-10-01 added. Size: " + eventsForSecondDay.size());

        List<Object> eventsForThirdDay = new ArrayList<>();
        eventsForThirdDay.add(new EventSection("STAGE LINE-UP ARTISTS"));
        eventsForThirdDay.add(new Event("RESCENE"));
        eventsForThirdDay.add(new Event("FROMIS_9"));
        eventsByDate.put("2024-10-02", eventsForThirdDay);
        Log.d("CalendarActivity", "Events for 2024-10-02 added. Size: " + eventsForThirdDay.size());
    }

    // 선택된 날짜에 따라 RecyclerView에 일정을 업데이트하는 메소드
    private void updateEventsForDate(String date) {
        items.clear();
        Log.d("CalendarActivity", "items cleared. Size: " + items.size());
        if (eventsByDate.containsKey(date)) {
            items.addAll(eventsByDate.get(date));
            Log.d("CalendarActivity", "Events found for date: " + date);
        } else {
            // 선택한 날짜에 일정이 없을 경우 표시할 항목 추가
            items.add(new EventSection("No Events"));
            Log.d("CalendarActivity", "No events found for date: " + date);
        }

        // Adapter가 null이 아닌지 확인
        if (adapter != null) {
            adapter.notifyDataSetChanged();
            Log.d("CalendarActivity", "Adapter notified of data change.");
        } else {
            Log.e("CalendarActivity", "Adapter is null when trying to notify!");
        }
    }
}

