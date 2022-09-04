package com.example.codingtask.databinding;
import com.example.codingtask.R;
import com.example.codingtask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingLandImpl extends FragmentDetailBinding implements com.example.codingtask.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 10);
        sViewsWithIds.put(R.id.imageViewLayout, 11);
        sViewsWithIds.put(R.id.expandableLayout, 12);
        sViewsWithIds.put(R.id.tags, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textview.MaterialTextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[10]
            , null
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.dropdown.setTag(null);
        this.imageView.setTag(null);
        this.imageViewUser.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView9 = (com.google.android.material.textview.MaterialTextView) bindings[9];
        this.mboundView9.setTag(null);
        this.textView6.setTag(null);
        this.textViewComments.setTag(null);
        this.textViewDownloads.setTag(null);
        this.textViewLikes.setTag(null);
        this.textViewViews.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.codingtask.generated.callback.OnClickListener(this, 1);
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
        if (BR.detailFragment == variableId) {
            setDetailFragment((com.example.codingtask.ui.fragments.DetailFragment) variable);
        }
        else if (BR.Item == variableId) {
            setItem((com.example.codingtask.data.local.entity.Pixabay) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailFragment(@Nullable com.example.codingtask.ui.fragments.DetailFragment DetailFragment) {
        this.mDetailFragment = DetailFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.detailFragment);
        super.requestRebind();
    }
    public void setItem(@Nullable com.example.codingtask.data.local.entity.Pixabay Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.Item);
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
        java.lang.String itemUserImageURL = null;
        java.lang.String stringValueOfItemViews = null;
        int itemLikes = 0;
        int itemViews = 0;
        com.example.codingtask.ui.fragments.DetailFragment detailFragment = mDetailFragment;
        java.lang.String stringValueOfItemLikes = null;
        com.example.codingtask.data.local.entity.Pixabay item = mItem;
        int itemDownloads = 0;
        java.lang.String itemTags = null;
        java.lang.String itemUser = null;
        java.lang.String stringValueOfItemComments = null;
        int itemComments = 0;
        java.lang.String stringValueOfItemTags = null;
        java.lang.String itemWebformatURL = null;
        java.lang.String stringValueOfItemDownloads = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (item != null) {
                    // read Item.userImageURL
                    itemUserImageURL = item.getUserImageURL();
                    // read Item.likes
                    itemLikes = item.getLikes();
                    // read Item.views
                    itemViews = item.getViews();
                    // read Item.downloads
                    itemDownloads = item.getDownloads();
                    // read Item.tags
                    itemTags = item.getTags();
                    // read Item.user
                    itemUser = item.getUser();
                    // read Item.comments
                    itemComments = item.getComments();
                    // read Item.webformatURL
                    itemWebformatURL = item.getWebformatURL();
                }


                // read String.valueOf(Item.likes)
                stringValueOfItemLikes = java.lang.String.valueOf(itemLikes);
                // read String.valueOf(Item.views)
                stringValueOfItemViews = java.lang.String.valueOf(itemViews);
                // read String.valueOf(Item.downloads)
                stringValueOfItemDownloads = java.lang.String.valueOf(itemDownloads);
                // read String.valueOf(Item.tags)
                stringValueOfItemTags = java.lang.String.valueOf(itemTags);
                // read String.valueOf(Item.comments)
                stringValueOfItemComments = java.lang.String.valueOf(itemComments);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.dropdown.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.codingtask.ui.adapter.ImageBindingAdapterKt.imageFromUrl(this.imageView, itemWebformatURL);
            com.example.codingtask.ui.adapter.ImageBindingAdapterKt.imageFromUrl(this.imageViewUser, itemUserImageURL);
            this.mboundView9.setText(stringValueOfItemTags);
            this.textView6.setText(itemUser);
            this.textViewComments.setText(stringValueOfItemComments);
            this.textViewDownloads.setText(stringValueOfItemDownloads);
            this.textViewLikes.setText(stringValueOfItemLikes);
            this.textViewViews.setText(stringValueOfItemViews);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // detailFragment
        com.example.codingtask.ui.fragments.DetailFragment detailFragment = mDetailFragment;
        // detailFragment != null
        boolean detailFragmentJavaLangObjectNull = false;



        detailFragmentJavaLangObjectNull = (detailFragment) != (null);
        if (detailFragmentJavaLangObjectNull) {


            detailFragment.VisibilityStatus();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailFragment
        flag 1 (0x2L): Item
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}