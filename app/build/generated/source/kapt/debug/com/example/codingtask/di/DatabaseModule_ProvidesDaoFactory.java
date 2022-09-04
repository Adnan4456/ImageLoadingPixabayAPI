// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.di;

import com.example.codingtask.data.local.dao.PixabayDao;
import com.example.codingtask.data.local.db.PixabayDb;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvidesDaoFactory implements Factory<PixabayDao> {
  private final Provider<PixabayDb> pixabayDbProvider;

  public DatabaseModule_ProvidesDaoFactory(Provider<PixabayDb> pixabayDbProvider) {
    this.pixabayDbProvider = pixabayDbProvider;
  }

  @Override
  public PixabayDao get() {
    return providesDao(pixabayDbProvider.get());
  }

  public static DatabaseModule_ProvidesDaoFactory create(Provider<PixabayDb> pixabayDbProvider) {
    return new DatabaseModule_ProvidesDaoFactory(pixabayDbProvider);
  }

  public static PixabayDao providesDao(PixabayDb pixabayDb) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesDao(pixabayDb));
  }
}
