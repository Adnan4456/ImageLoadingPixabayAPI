package com.example.codingtask.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/codingtask/ui/adapter/MyPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/codingtask/data/local/entity/Pixabay;", "Lcom/example/codingtask/ui/adapter/MyPagingAdapter$MyViewHolder;", "onClickListener", "Lcom/example/codingtask/ui/adapter/MyPagingAdapter$OnClickListener;", "(Lcom/example/codingtask/ui/adapter/MyPagingAdapter$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "OnClickListener", "app_debug"})
public final class MyPagingAdapter extends androidx.paging.PagingDataAdapter<com.example.codingtask.data.local.entity.Pixabay, com.example.codingtask.ui.adapter.MyPagingAdapter.MyViewHolder> {
    private final com.example.codingtask.ui.adapter.MyPagingAdapter.OnClickListener onClickListener = null;
    
    public MyPagingAdapter(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.ui.adapter.MyPagingAdapter.OnClickListener onClickListener) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.ui.adapter.MyPagingAdapter.MyViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.codingtask.ui.adapter.MyPagingAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/codingtask/ui/adapter/MyPagingAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/codingtask/databinding/ImageItemBinding;", "(Lcom/example/codingtask/databinding/ImageItemBinding;)V", "getBinding", "()Lcom/example/codingtask/databinding/ImageItemBinding;", "bind", "", "image", "Lcom/example/codingtask/data/local/entity/Pixabay;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.codingtask.databinding.ImageItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.codingtask.databinding.ImageItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.codingtask.databinding.ImageItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.codingtask.data.local.entity.Pixabay image) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/codingtask/ui/adapter/MyPagingAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/example/codingtask/data/local/entity/Pixabay;", "Lkotlin/ParameterName;", "name", "pix", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.codingtask.data.local.entity.Pixabay, kotlin.Unit> clickListener = null;
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.codingtask.data.local.entity.Pixabay, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.codingtask.data.local.entity.Pixabay, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.example.codingtask.data.local.entity.Pixabay pix) {
        }
    }
}