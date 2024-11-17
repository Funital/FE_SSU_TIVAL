//package com.example.fessutival_re.bottomNavigation;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.fragment.app.Fragment;
//
//import com.example.fessutival_re.R;
//
//import java.util.List;
//import java.util.Map;
//
//public class CalendarFragment extends Fragment {
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private TextView tvDate;
//    private Map<String, List<Object>> eventsByDate;
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public CalendarFragment() {
//        // Required empty public constructor
//    }
//
//    public static CalendarFragment newInstance(String param1, String param2) {
//        CalendarFragment fragment = new CalendarFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_calendar, container, false);
//    }
//}

package com.example.fessutival_re.bottomNavigation;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.fessutival_re.Event;
import com.example.fessutival_re.EventSection;
import com.example.fessutival_re.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarFragment extends Fragment {

    private TextView tvDate;
    private Map<String, List<Object>> eventsByDate;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public CalendarFragment() {
        // Required empty public constructor
    }

    public static CalendarFragment newInstance(String param1, String param2) {
        CalendarFragment fragment = new CalendarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        CalendarView calendarView = view.findViewById(R.id.cv_calendar);
        tvDate = view.findViewById(R.id.tv_calendar);

        // Initialize event data
        initializeEvents();

        calendarView.setOnDateChangeListener((view1, year, month, dayOfMonth) -> {
            String formattedMonth = String.format("%02d", month + 1); // Format to two digits
            String formattedDay = String.format("%02d", dayOfMonth); // Format to two digits
            String selectedDate = year + "-" + formattedMonth + "-" + formattedDay;

            tvDate.setText(formattedMonth + "월 " + formattedDay + "일 축제 일정");

            // Update event list for the selected date
            updateEventsForDate(selectedDate);
        });

        return view;
    }

    // Initialize event data by date
    private void initializeEvents() {
        eventsByDate = new HashMap<>();

        // Example data for 2024-09-30
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

        // Example data for 2024-10-01
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

        // Example data for 2024-10-02
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
        TextView tvEvents = getView().findViewById(R.id.tv_events);

        StringBuilder eventsText = new StringBuilder();

        for (int i = 0; i < events.size(); i++) {
            Object event = events.get(i);

            if (event instanceof EventSection) {
                // Add extra space between sections
                if (i != 0) { // Add space between sections if it's not the first
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

