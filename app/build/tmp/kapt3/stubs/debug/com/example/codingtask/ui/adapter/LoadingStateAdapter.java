package com.example.codingtask.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/codingtask/ui/adapter/LoadingStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/example/codingtask/ui/adapter/LoadingStateAdapter$LoaderStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoaderStateViewHolder", "app_debug"})
public final class LoadingStateAdapter extends androidx.paging.LoadStateAdapter<com.example.codingtask.ui.adapter.LoadingStateAdapter.LoaderStateViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    public LoadingStateAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.ui.adapter.LoadingStateAdapter.LoaderStateViewHolder holder, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.codingtask.ui.adapter.LoadingStateAdapter.LoaderStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/codingtask/ui/adapter/LoadingStateAdapter$LoaderStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/codingtask/databinding/ErrorStateBinding;", "retry", "Lkotlin/Function0;", "", "(Lcom/example/codingtask/databinding/ErrorStateBinding;Lkotlin/jvm/functions/Function0;)V", "bind", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public static final class LoaderStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.codingtask.databinding.ErrorStateBinding binding = null;
        
        public LoaderStateViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.codingtask.databinding.ErrorStateBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        androidx.paging.LoadState loadState) {
        }
    }
}