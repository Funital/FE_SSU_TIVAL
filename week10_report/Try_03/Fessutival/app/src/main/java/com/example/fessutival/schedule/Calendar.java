package com.example.fessutival.schedule;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fessutival.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar extends AppCompatActivity {
    private TextView tvDate;
//    private ListView lvEvents;
    private Map<String, List<Object>> eventsByDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        CalendarView calendarView = findViewById(R.id.cv_calendar);
        tvDate = findViewById(R.id.tv_calendar);
//        lvEvents = findViewById(R.id.lv_list);

        // 초기 데이터 설정
        initializeEvents();

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String formattedMonth = String.format("%02d", month + 1); // 두 자리로 포맷
            String formattedDay = String.format("%02d", dayOfMonth); // 두 자리로 포맷
            String selectedDate = year + "-" + formattedMonth + "-" + formattedDay;

            tvDate.setText(formattedMonth + "월 " + formattedDay + "일 축제 일정");

            // 선택된 날짜에 맞는 일정 리스트를 업데이트
            updateEventsForDate(selectedDate);
        });
    }

    // 날짜별 초기 이벤트 데이터 설정
    private void initializeEvents() {
        eventsByDate = new HashMap<>();

        // 예제 데이터: 2024-09-30 일정
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

        // 예제 데이터: 2024-10-01 일정
        List<Object> eventsForSecondDay = new ArrayList<>();
        eventsForSecondDay.add(new EventSection("STAGE LINE-UP"));
        eventsForSecondDay.add(new Event("서있는 사람"));
        eventsForSecondDay.add(new Event("플레이버"));
        eventsForSecondDay.add(new Event("민수는 혼란스럽다"));
        eventsForSecondDay.add(new Event("펜타킬"));
        eventsForSecondDay.add(new Event("써밋"));

        eventsForSecondDay.add(new EventSection("STAGE LINE-UP special contents"));
        eventsForSecondDay.add(new Event("토크콘서트"));
        eventsForSecondDay.add(new Event("w.빵송국"));

        eventsForSecondDay.add(new EventSection("STAGE LINE-UP artist"));
        eventsForSecondDay.add(new Event("RESCENE"));
        eventsForSecondDay.add(new Event("로이킴"));
        eventsForSecondDay.add(new Event("유다빈밴드"));
        eventsForSecondDay.add(new Event("하현상"));
        eventsForSecondDay.add(new Event("PROMIS_9"));

        eventsByDate.put("2024-10-01", eventsForSecondDay);

        // 예제 데이터: 2024-10-02 일정
        List<Object> eventsForThirdDay = new ArrayList<>();

        eventsForThirdDay.add(new EventSection("STAGE LINE-UP"));
        eventsForThirdDay.add(new Event("위니"));
        eventsForThirdDay.add(new Event("순간"));
        eventsForThirdDay.add(new Event("호흡곤란"));

        eventsForThirdDay.add(new EventSection("STAGE LINE-UP special contents"));
        eventsForThirdDay.add(new Event("백마가요제"));
        eventsForThirdDay.add(new Event("폐막식"));
        eventsForThirdDay.add(new Event("w.위니"));

        eventsForThirdDay.add(new EventSection("STAGE LINE-UP artist"));
        eventsForThirdDay.add(new Event("LUCY"));
        eventsForThirdDay.add(new Event("윤하"));
        eventsForThirdDay.add(new Event("릴보이"));
        eventsForThirdDay.add(new Event("비와이"));
        eventsForThirdDay.add(new Event("CNBLUE"));

        eventsByDate.put("2024-10-02", eventsForThirdDay);
    }

    private void updateEventsForDate(String date) {
        List<Object> events = eventsByDate.getOrDefault(date, new ArrayList<>());
        TextView tvEvents = findViewById(R.id.tv_events);

        StringBuilder eventsText = new StringBuilder();

        for (int i = 0; i < events.size(); i++) {
            Object event = events.get(i);

            if (event instanceof EventSection) {
                // 섹션 간에는 더 큰 간격 추가
                if (i != 0) { // 첫 번째 섹션이 아닐 경우에만 간격 추가
                    eventsText.append("\n\n");
                }
                eventsText.append(((EventSection) event).getTitle()).append("\n\n");
            } else if (event instanceof Event) {
                eventsText.append(((Event) event).getName()).append("\n");
            }
        }

        tvEvents.setText(eventsText.toString());
    }
}

