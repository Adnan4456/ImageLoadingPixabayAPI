package com.example.codingtask.ui.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/codingtask/ui/viewmodels/PixabayViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/codingtask/utils/RepositoryInterface;", "(Lcom/example/codingtask/utils/RepositoryInterface;)V", "_searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "searchQuery", "Landroidx/lifecycle/LiveData;", "getSearchQuery", "()Landroidx/lifecycle/LiveData;", "getImages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/codingtask/utils/Resource;", "", "Lcom/example/codingtask/data/local/entity/Pixabay;", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PixabayViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.codingtask.utils.RepositoryInterface repository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> searchQuery = null;
    
    @javax.inject.Inject()
    public PixabayViewModel(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.utils.RepositoryInterface repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImages(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.codingtask.utils.Resource<java.util.List<com.example.codingtask.data.local.entity.Pixabay>>>> continuation) {
        return null;
    }
}