package com.example.codingtask.data.local.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/codingtask/data/local/repository/PixabayRepository;", "Lcom/example/codingtask/utils/SafeApiRequest;", "Lcom/example/codingtask/utils/RepositoryInterface;", "pixabayApi", "Lcom/example/codingtask/data/remote/PixabayApi;", "pixabayDatabase", "Lcom/example/codingtask/data/local/db/PixabayDb;", "(Lcom/example/codingtask/data/remote/PixabayApi;Lcom/example/codingtask/data/local/db/PixabayDb;)V", "fetchImages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/codingtask/utils/Resource;", "", "Lcom/example/codingtask/data/local/entity/Pixabay;", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PixabayRepository extends com.example.codingtask.utils.SafeApiRequest implements com.example.codingtask.utils.RepositoryInterface {
    private final com.example.codingtask.data.remote.PixabayApi pixabayApi = null;
    private final com.example.codingtask.data.local.db.PixabayDb pixabayDatabase = null;
    
    @javax.inject.Inject()
    public PixabayRepository(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.remote.PixabayApi pixabayApi, @org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb pixabayDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchImages(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.codingtask.utils.Resource<java.util.List<com.example.codingtask.data.local.entity.Pixabay>>>> continuation) {
        return null;
    }
}