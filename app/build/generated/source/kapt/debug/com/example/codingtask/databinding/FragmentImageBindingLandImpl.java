package com.example.codingtask.databinding;
import com.example.codingtask.R;
import com.example.codingtask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentImageBindingLandImpl extends FragmentImageBinding implements com.example.codingtask.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageRecycler, 2);
        sViewsWithIds.put(R.id.searchLayout, 3);
        sViewsWithIds.put(R.id.search, 4);
        sViewsWithIds.put(R.id.progressBar, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentImageBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentImageBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchViewFab.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.codingtask.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.imageFramgnet == variableId) {
            setImageFramgnet((com.example.codingtask.ui.fragments.ImageFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageFramgnet(@Nullable com.example.codingtask.ui.fragments.ImageFragment ImageFramgnet) {
        this.mImageFramgnet = ImageFramgnet;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageFramgnet);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.codingtask.ui.fragments.ImageFragment imageFramgnet = mImageFramgnet;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.searchViewFab.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // imageFramgnet
        com.example.codingtask.ui.fragments.ImageFragment imageFramgnet = mImageFramgnet;
        // imageFramgnet != null
        boolean imageFramgnetJavaLangObjectNull = false;



        imageFramgnetJavaLangObjectNull = (imageFramgnet) != (null);
        if (imageFramgnetJavaLangObjectNull) {


            imageFramgnet.setVisibility();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageFramgnet
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}