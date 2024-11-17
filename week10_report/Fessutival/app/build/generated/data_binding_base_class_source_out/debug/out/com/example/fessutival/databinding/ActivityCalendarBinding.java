// Generated by view binder compiler. Do not edit!
package com.example.fessutival.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fessutival.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalendarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CalendarView cvCalendar;

  @NonNull
  public final CardView cvList;

  @NonNull
  public final CardView cvTop;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView rvEvent;

  @NonNull
  public final TextView tvDate;

  private ActivityCalendarBinding(@NonNull ConstraintLayout rootView,
      @NonNull CalendarView cvCalendar, @NonNull CardView cvList, @NonNull CardView cvTop,
      @NonNull ConstraintLayout main, @NonNull RecyclerView rvEvent, @NonNull TextView tvDate) {
    this.rootView = rootView;
    this.cvCalendar = cvCalendar;
    this.cvList = cvList;
    this.cvTop = cvTop;
    this.main = main;
    this.rvEvent = rvEvent;
    this.tvDate = tvDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv_calendar;
      CalendarView cvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (cvCalendar == null) {
        break missingId;
      }

      id = R.id.cv_list;
      CardView cvList = ViewBindings.findChildViewById(rootView, id);
      if (cvList == null) {
        break missingId;
      }

      id = R.id.cv_top;
      CardView cvTop = ViewBindings.findChildViewById(rootView, id);
      if (cvTop == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.rv_event;
      RecyclerView rvEvent = ViewBindings.findChildViewById(rootView, id);
      if (rvEvent == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      return new ActivityCalendarBinding((ConstraintLayout) rootView, cvCalendar, cvList, cvTop,
          main, rvEvent, tvDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}