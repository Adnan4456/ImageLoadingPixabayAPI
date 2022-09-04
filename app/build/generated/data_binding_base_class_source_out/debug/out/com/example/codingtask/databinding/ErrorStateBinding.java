// Generated by data binding compiler. Do not edit!
package com.example.codingtask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.codingtask.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ErrorStateBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorTxt;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button retryBtn;

  protected ErrorStateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView errorTxt, ProgressBar progressBar, Button retryBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorTxt = errorTxt;
    this.progressBar = progressBar;
    this.retryBtn = retryBtn;
  }

  @NonNull
  public static ErrorStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.error_state, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ErrorStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ErrorStateBinding>inflateInternal(inflater, R.layout.error_state, root, attachToRoot, component);
  }

  @NonNull
  public static ErrorStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.error_state, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ErrorStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ErrorStateBinding>inflateInternal(inflater, R.layout.error_state, null, false, component);
  }

  public static ErrorStateBinding bind(@NonNull View view) {
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
  public static ErrorStateBinding bind(@NonNull View view, @Nullable Object component) {
    return (ErrorStateBinding)bind(component, view, R.layout.error_state);
  }
}
