package com.example.codingtask;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PixabayApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PixabayApplication_GeneratedInjector {
  void injectPixabayApplication(PixabayApplication pixabayApplication);
}
