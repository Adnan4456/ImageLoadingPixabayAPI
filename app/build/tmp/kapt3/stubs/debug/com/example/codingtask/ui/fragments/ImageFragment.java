package com.example.codingtask.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/codingtask/ui/fragments/ImageFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "binding", "Lcom/example/codingtask/databinding/FragmentImageBinding;", "internetStatus", "Lcom/example/codingtask/utils/InternetStatus;", "getInternetStatus", "()Lcom/example/codingtask/utils/InternetStatus;", "setInternetStatus", "(Lcom/example/codingtask/utils/InternetStatus;)V", "myAdapter", "Lcom/example/codingtask/ui/adapter/MyPagingAdapter;", "getMyAdapter", "()Lcom/example/codingtask/ui/adapter/MyPagingAdapter;", "setMyAdapter", "(Lcom/example/codingtask/ui/adapter/MyPagingAdapter;)V", "viewModel", "Lcom/example/codingtask/ui/viewmodels/MainViewModel;", "getViewModel", "()Lcom/example/codingtask/ui/viewmodels/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "searchImage", "", "query", "", "setVisibility", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ImageFragment extends androidx.fragment.app.Fragment implements androidx.lifecycle.LifecycleObserver {
    private com.example.codingtask.databinding.FragmentImageBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.codingtask.utils.InternetStatus internetStatus;
    public com.example.codingtask.ui.adapter.MyPagingAdapter myAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public ImageFragment() {
        super();
    }
    
    private final com.example.codingtask.ui.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.codingtask.utils.InternetStatus getInternetStatus() {
        return null;
    }
    
    public final void setInternetStatus(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.utils.InternetStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.codingtask.ui.adapter.MyPagingAdapter getMyAdapter() {
        return null;
    }
    
    public final void setMyAdapter(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.ui.adapter.MyPagingAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setVisibility() {
    }
    
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    private final void searchImage(java.lang.String query) {
    }
}