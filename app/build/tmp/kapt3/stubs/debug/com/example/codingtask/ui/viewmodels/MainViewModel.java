package com.example.codingtask.ui.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0007R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/codingtask/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "db", "Lcom/example/codingtask/data/local/db/PixabayDb;", "apiService", "Lcom/example/codingtask/data/remote/PixabayApi;", "(Lcom/example/codingtask/data/local/db/PixabayDb;Lcom/example/codingtask/data/remote/PixabayApi;)V", "_searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "searchQuery", "Landroidx/lifecycle/LiveData;", "getSearchQuery", "()Landroidx/lifecycle/LiveData;", "getAllImages", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/codingtask/data/local/entity/Pixabay;", "query", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.codingtask.data.local.db.PixabayDb db = null;
    private final com.example.codingtask.data.remote.PixabayApi apiService = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> searchQuery = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb db, @org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.remote.PixabayApi apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.paging.ExperimentalPagingApi()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.codingtask.data.local.entity.Pixabay>> getAllImages(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}