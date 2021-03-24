package com.example.android.trackmysleepquality.sleepquality;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SleepQualityFragmentArgs {
  private long sleepNightKey;

  private SleepQualityFragmentArgs() {
  }

  @NonNull
  public static SleepQualityFragmentArgs fromBundle(Bundle bundle) {
    SleepQualityFragmentArgs result = new SleepQualityFragmentArgs();
    bundle.setClassLoader(SleepQualityFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sleepNightKey")) {
      result.sleepNightKey = bundle.getLong("sleepNightKey");
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  public long getSleepNightKey() {
    return sleepNightKey;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putLong("sleepNightKey", this.sleepNightKey);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SleepQualityFragmentArgs that = (SleepQualityFragmentArgs) object;
    if (sleepNightKey != that.sleepNightKey) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (int)(sleepNightKey ^ (sleepNightKey >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "SleepQualityFragmentArgs{"
        + "sleepNightKey=" + sleepNightKey
        + "}";
  }

  public static class Builder {
    private long sleepNightKey;

    public Builder(SleepQualityFragmentArgs original) {
      this.sleepNightKey = original.sleepNightKey;
    }

    public Builder(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
    }

    @NonNull
    public SleepQualityFragmentArgs build() {
      SleepQualityFragmentArgs result = new SleepQualityFragmentArgs();
      result.sleepNightKey = this.sleepNightKey;
      return result;
    }

    @NonNull
    public Builder setSleepNightKey(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
      return this;
    }

    public long getSleepNightKey() {
      return sleepNightKey;
    }
  }
}
