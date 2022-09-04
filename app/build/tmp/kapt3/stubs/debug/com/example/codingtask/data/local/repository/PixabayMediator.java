package com.example.codingtask.data.local.repository;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/codingtask/data/local/repository/PixabayMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/example/codingtask/data/local/entity/Pixabay;", "db", "Lcom/example/codingtask/data/local/db/PixabayDb;", "apiService", "Lcom/example/codingtask/data/remote/PixabayApi;", "tag", "", "(Lcom/example/codingtask/data/local/db/PixabayDb;Lcom/example/codingtask/data/remote/PixabayApi;Ljava/lang/String;)V", "index", "getFirstRemoteKeys", "Lcom/example/codingtask/data/local/entity/RemoteKeys;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeyPageData", "", "loadType", "Landroidx/paging/LoadType;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastRemoteKey", "getRefreshRemoteKey", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "app_debug"})
public final class PixabayMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> {
    private final com.example.codingtask.data.local.db.PixabayDb db = null;
    private final com.example.codingtask.data.remote.PixabayApi apiService = null;
    private final java.lang.String tag = null;
    private final int index = 1;
    
    public PixabayMediator(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb db, @org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.remote.PixabayApi apiService, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
    
    private final java.lang.Object getKeyPageData(androidx.paging.LoadType loadType, androidx.paging.PagingState<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> state, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return null;
    }
    
    private final java.lang.Object getFirstRemoteKeys(androidx.paging.PagingState<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> state, kotlin.coroutines.Continuation<? super com.example.codingtask.data.local.entity.RemoteKeys> continuation) {
        return null;
    }
    
    private final java.lang.Object getLastRemoteKey(androidx.paging.PagingState<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> state, kotlin.coroutines.Continuation<? super com.example.codingtask.data.local.entity.RemoteKeys> continuation) {
        return null;
    }
    
    private final java.lang.Object getRefreshRemoteKey(androidx.paging.PagingState<java.lang.Integer, com.example.codingtask.data.local.entity.Pixabay> state, kotlin.coroutines.Continuation<? super com.example.codingtask.data.local.entity.RemoteKeys> continuation) {
        return null;
    }
}