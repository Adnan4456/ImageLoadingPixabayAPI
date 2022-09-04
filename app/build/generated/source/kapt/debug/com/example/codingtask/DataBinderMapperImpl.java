package com.example.codingtask;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.codingtask.databinding.ErrorStateBindingImpl;
import com.example.codingtask.databinding.FragmentDetailBindingImpl;
import com.example.codingtask.databinding.FragmentDetailBindingLandImpl;
import com.example.codingtask.databinding.FragmentImageBindingImpl;
import com.example.codingtask.databinding.FragmentImageBindingLandImpl;
import com.example.codingtask.databinding.ImageItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ERRORSTATE = 1;

  private static final int LAYOUT_FRAGMENTDETAIL = 2;

  private static final int LAYOUT_FRAGMENTIMAGE = 3;

  private static final int LAYOUT_IMAGEITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.codingtask.R.layout.error_state, LAYOUT_ERRORSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.codingtask.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.codingtask.R.layout.fragment_image, LAYOUT_FRAGMENTIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.codingtask.R.layout.image_item, LAYOUT_IMAGEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ERRORSTATE: {
          if ("layout/error_state_0".equals(tag)) {
            return new ErrorStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for error_state is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout-land/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingLandImpl(component, view);
          }
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGE: {
          if ("layout/fragment_image_0".equals(tag)) {
            return new FragmentImageBindingImpl(component, view);
          }
          if ("layout-land/fragment_image_0".equals(tag)) {
            return new FragmentImageBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image is invalid. Received: " + tag);
        }
        case  LAYOUT_IMAGEITEM: {
          if ("layout/image_item_0".equals(tag)) {
            return new ImageItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for image_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(1, "Item");
      sKeys.put(0, "_all");
      sKeys.put(2, "detailFragment");
      sKeys.put(3, "imageFramgnet");
      sKeys.put(4, "listItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/error_state_0", com.example.codingtask.R.layout.error_state);
      sKeys.put("layout-land/fragment_detail_0", com.example.codingtask.R.layout.fragment_detail);
      sKeys.put("layout/fragment_detail_0", com.example.codingtask.R.layout.fragment_detail);
      sKeys.put("layout/fragment_image_0", com.example.codingtask.R.layout.fragment_image);
      sKeys.put("layout-land/fragment_image_0", com.example.codingtask.R.layout.fragment_image);
      sKeys.put("layout/image_item_0", com.example.codingtask.R.layout.image_item);
    }
  }
}
