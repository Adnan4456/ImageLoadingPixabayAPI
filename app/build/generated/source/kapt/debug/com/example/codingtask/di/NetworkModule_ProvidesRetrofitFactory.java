// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return providesRetrofit();
  }

  public static NetworkModule_ProvidesRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit providesRetrofit() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesRetrofit());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesRetrofitFactory INSTANCE = new NetworkModule_ProvidesRetrofitFactory();
  }
}
