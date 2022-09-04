package com.example.codingtask.databinding;
import com.example.codingtask.R;
import com.example.codingtask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ImageItemBindingImpl extends ImageItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dropdown, 4);
        sViewsWithIds.put(R.id.expandableLayout, 5);
        sViewsWithIds.put(R.id.tags, 6);
    }
    // views
    @NonNull
    private final com.google.android.material.textview.MaterialTextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ImageItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ImageItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            );
        this.cardView.setTag(null);
        this.imageView.setTag(null);
        this.mboundView3 = (com.google.android.material.textview.MaterialTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.user.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.listItem == variableId) {
            setListItem((com.example.codingtask.data.local.entity.Pixabay) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListItem(@Nullable com.example.codingtask.data.local.entity.Pixabay ListItem) {
        this.mListItem = ListItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listItem);
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
        java.lang.String listItemTags = null;
        java.lang.String listItemUser = null;
        com.example.codingtask.data.local.entity.Pixabay listItem = mListItem;
        java.lang.String listItemWebformatURL = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listItem != null) {
                    // read listItem.tags
                    listItemTags = listItem.getTags();
                    // read listItem.user
                    listItemUser = listItem.getUser();
                    // read listItem.webformatURL
                    listItemWebformatURL = listItem.getWebformatURL();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.codingtask.ui.adapter.ImageBindingAdapterKt.imageFromUrl(this.imageView, listItemWebformatURL);
            this.mboundView3.setText(listItemTags);
            this.user.setText(listItemUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}