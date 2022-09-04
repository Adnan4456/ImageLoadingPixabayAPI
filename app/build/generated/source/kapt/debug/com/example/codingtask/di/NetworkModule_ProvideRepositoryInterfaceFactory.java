// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.di;

import com.example.codingtask.data.local.db.PixabayDb;
import com.example.codingtask.data.remote.PixabayApi;
import com.example.codingtask.utils.RepositoryInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRepositoryInterfaceFactory implements Factory<RepositoryInterface> {
  private final Provider<PixabayApi> pixabayApiProvider;

  private final Provider<PixabayDb> pixabayDatabaseProvider;

  public NetworkModule_ProvideRepositoryInterfaceFactory(Provider<PixabayApi> pixabayApiProvider,
      Provider<PixabayDb> pixabayDatabaseProvider) {
    this.pixabayApiProvider = pixabayApiProvider;
    this.pixabayDatabaseProvider = pixabayDatabaseProvider;
  }

  @Override
  public RepositoryInterface get() {
    return provideRepositoryInterface(pixabayApiProvider.get(), pixabayDatabaseProvider.get());
  }

  public static NetworkModule_ProvideRepositoryInterfaceFactory create(
      Provider<PixabayApi> pixabayApiProvider, Provider<PixabayDb> pixabayDatabaseProvider) {
    return new NetworkModule_ProvideRepositoryInterfaceFactory(pixabayApiProvider, pixabayDatabaseProvider);
  }

  public static RepositoryInterface provideRepositoryInterface(PixabayApi pixabayApi,
      PixabayDb pixabayDatabase) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRepositoryInterface(pixabayApi, pixabayDatabase));
  }
}
