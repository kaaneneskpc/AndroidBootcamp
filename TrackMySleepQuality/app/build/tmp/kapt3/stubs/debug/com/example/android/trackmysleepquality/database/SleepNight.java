package com.example.android.trackmysleepquality.database;

import java.lang.System;

@androidx.room.Entity(tableName = "daily_sleep_quality_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/example/android/trackmysleepquality/database/SleepNight;", "", "nightId", "", "startTimeMilli", "endTimeMilli", "sleepQuality", "", "(JJJI)V", "getEndTimeMilli", "()J", "setEndTimeMilli", "(J)V", "getNightId", "setNightId", "getSleepQuality", "()I", "setSleepQuality", "(I)V", "getStartTimeMilli", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class SleepNight {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long nightId;
    @androidx.room.ColumnInfo(name = "start_time_milli")
    private final long startTimeMilli = 0L;
    @androidx.room.ColumnInfo(name = "end_time_milli")
    private long endTimeMilli;
    @androidx.room.ColumnInfo(name = "quality_rating")
    private int sleepQuality;
    
    public final long getNightId() {
        return 0L;
    }
    
    public final void setNightId(long p0) {
    }
    
    public final long getStartTimeMilli() {
        return 0L;
    }
    
    public final long getEndTimeMilli() {
        return 0L;
    }
    
    public final void setEndTimeMilli(long p0) {
    }
    
    public final int getSleepQuality() {
        return 0;
    }
    
    public final void setSleepQuality(int p0) {
    }
    
    public SleepNight(long nightId, long startTimeMilli, long endTimeMilli, int sleepQuality) {
        super();
    }
    
    public SleepNight() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepNight copy(long nightId, long startTimeMilli, long endTimeMilli, int sleepQuality) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}