package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSleepTrackerBindingImpl extends FragmentSleepTrackerBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSleepTrackerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSleepTrackerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.clearButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.startButton.setTag(null);
        this.stopButton.setTag(null);
        this.textview.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sleepTrackerViewModel == variableId) {
            setSleepTrackerViewModel((com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleepTrackerViewModel(@Nullable com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel SleepTrackerViewModel) {
        this.mSleepTrackerViewModel = SleepTrackerViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sleepTrackerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSleepTrackerViewModelNightsString((androidx.lifecycle.LiveData<android.text.Spanned>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelNightsString(androidx.lifecycle.LiveData<android.text.Spanned> SleepTrackerViewModelNightsString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.text.Spanned sleepTrackerViewModelNightsStringGetValue = null;
        androidx.lifecycle.LiveData<android.text.Spanned> sleepTrackerViewModelNightsString = null;
        com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (sleepTrackerViewModel != null) {
                    // read sleepTrackerViewModel.nightsString
                    sleepTrackerViewModelNightsString = sleepTrackerViewModel.getNightsString();
                }
                updateLiveDataRegistration(0, sleepTrackerViewModelNightsString);


                if (sleepTrackerViewModelNightsString != null) {
                    // read sleepTrackerViewModel.nightsString.getValue()
                    sleepTrackerViewModelNightsStringGetValue = sleepTrackerViewModelNightsString.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clearButton.setOnClickListener(mCallback3);
            this.startButton.setOnClickListener(mCallback1);
            this.stopButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview, sleepTrackerViewModelNightsStringGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onClear();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStartTracking();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStopTracking();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleepTrackerViewModel.nightsString
        flag 1 (0x2L): sleepTrackerViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}