// Generated by data binding compiler. Do not edit!
package com.example.codingtask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.codingtask.R;
import com.example.codingtask.data.local.entity.Pixabay;
import com.google.android.material.textview.MaterialTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ImageItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView dropdown;

  @NonNull
  public final LinearLayout expandableLayout;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final MaterialTextView tags;

  @NonNull
  public final TextView user;

  @Bindable
  protected Pixabay mListItem;

  protected ImageItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, ImageView dropdown, LinearLayout expandableLayout,
      AppCompatImageView imageView, MaterialTextView tags, TextView user) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.dropdown = dropdown;
    this.expandableLayout = expandableLayout;
    this.imageView = imageView;
    this.tags = tags;
    this.user = user;
  }

  public abstract void setListItem(@Nullable Pixabay listItem);

  @Nullable
  public Pixabay getListItem() {
    return mListItem;
  }

  @NonNull
  public static ImageItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.image_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ImageItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ImageItemBinding>inflateInternal(inflater, R.layout.image_item, root, attachToRoot, component);
  }

  @NonNull
  public static ImageItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.image_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ImageItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ImageItemBinding>inflateInternal(inflater, R.layout.image_item, null, false, component);
  }

  public static ImageItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ImageItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ImageItemBinding)bind(component, view, R.layout.image_item);
  }
}
