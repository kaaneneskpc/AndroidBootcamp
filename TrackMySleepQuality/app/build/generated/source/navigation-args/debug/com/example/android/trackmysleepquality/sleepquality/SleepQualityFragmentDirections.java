package com.example.android.trackmysleepquality.sleepquality;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SleepQualityFragmentDirections {
  @NonNull
  public static ActionSleepQualityFragmentToSleepTrackerFragment actionSleepQualityFragmentToSleepTrackerFragment(
      ) {
    return new ActionSleepQualityFragmentToSleepTrackerFragment();
  }

  public static class ActionSleepQualityFragmentToSleepTrackerFragment implements NavDirections {
    public ActionSleepQualityFragmentToSleepTrackerFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.android.trackmysleepquality.R.id.action_sleepQualityFragment_to_sleepTrackerFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepQualityFragmentToSleepTrackerFragment that = (ActionSleepQualityFragmentToSleepTrackerFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepQualityFragmentToSleepTrackerFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
