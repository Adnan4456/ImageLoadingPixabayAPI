// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.di;

import android.content.Context;
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
public final class DatabaseModule_ProvidesDbFactory implements Factory<PixabayDb> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvidesDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PixabayDb get() {
    return providesDb(contextProvider.get());
  }

  public static DatabaseModule_ProvidesDbFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvidesDbFactory(contextProvider);
  }

  public static PixabayDb providesDb(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesDb(context));
  }
}
