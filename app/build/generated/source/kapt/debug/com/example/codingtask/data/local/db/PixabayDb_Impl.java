package com.example.codingtask.data.local.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.codingtask.data.local.dao.PixabayDao;
import com.example.codingtask.data.local.dao.PixabayDao_Impl;
import com.example.codingtask.data.local.dao.RemoteKeysDao;
import com.example.codingtask.data.local.dao.RemoteKeysDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PixabayDb_Impl extends PixabayDb {
  private volatile PixabayDao _pixabayDao;

  private volatile RemoteKeysDao _remoteKeysDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pixabay_table` (`id` INTEGER NOT NULL, `collections` INTEGER NOT NULL, `comments` INTEGER NOT NULL, `downloads` INTEGER NOT NULL, `imageHeight` INTEGER NOT NULL, `imageSize` INTEGER NOT NULL, `imageWidth` INTEGER NOT NULL, `largeImageURL` TEXT NOT NULL, `likes` INTEGER NOT NULL, `pageURL` TEXT NOT NULL, `previewHeight` INTEGER NOT NULL, `previewURL` TEXT NOT NULL, `previewWidth` INTEGER NOT NULL, `tags` TEXT NOT NULL, `type` TEXT NOT NULL, `user` TEXT NOT NULL, `userId` INTEGER NOT NULL, `userImageURL` TEXT NOT NULL, `views` INTEGER NOT NULL, `webformatHeight` INTEGER NOT NULL, `webformatURL` TEXT NOT NULL, `webformatWidth` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `remoteKeys` (`id` INTEGER NOT NULL, `prevKey` INTEGER, `nextKey` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ca81884f57b1b49ada665c6d3c2a552')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `pixabay_table`");
        _db.execSQL("DROP TABLE IF EXISTS `remoteKeys`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPixabayTable = new HashMap<String, TableInfo.Column>(22);
        _columnsPixabayTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("collections", new TableInfo.Column("collections", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("comments", new TableInfo.Column("comments", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("downloads", new TableInfo.Column("downloads", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("imageHeight", new TableInfo.Column("imageHeight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("imageSize", new TableInfo.Column("imageSize", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("imageWidth", new TableInfo.Column("imageWidth", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("largeImageURL", new TableInfo.Column("largeImageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("likes", new TableInfo.Column("likes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("pageURL", new TableInfo.Column("pageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("previewHeight", new TableInfo.Column("previewHeight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("previewURL", new TableInfo.Column("previewURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("previewWidth", new TableInfo.Column("previewWidth", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("user", new TableInfo.Column("user", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("userImageURL", new TableInfo.Column("userImageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("views", new TableInfo.Column("views", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("webformatHeight", new TableInfo.Column("webformatHeight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("webformatURL", new TableInfo.Column("webformatURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPixabayTable.put("webformatWidth", new TableInfo.Column("webformatWidth", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPixabayTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPixabayTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPixabayTable = new TableInfo("pixabay_table", _columnsPixabayTable, _foreignKeysPixabayTable, _indicesPixabayTable);
        final TableInfo _existingPixabayTable = TableInfo.read(_db, "pixabay_table");
        if (! _infoPixabayTable.equals(_existingPixabayTable)) {
          return new RoomOpenHelper.ValidationResult(false, "pixabay_table(com.example.codingtask.data.local.entity.Pixabay).\n"
                  + " Expected:\n" + _infoPixabayTable + "\n"
                  + " Found:\n" + _existingPixabayTable);
        }
        final HashMap<String, TableInfo.Column> _columnsRemoteKeys = new HashMap<String, TableInfo.Column>(3);
        _columnsRemoteKeys.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemoteKeys.put("prevKey", new TableInfo.Column("prevKey", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemoteKeys.put("nextKey", new TableInfo.Column("nextKey", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRemoteKeys = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRemoteKeys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRemoteKeys = new TableInfo("remoteKeys", _columnsRemoteKeys, _foreignKeysRemoteKeys, _indicesRemoteKeys);
        final TableInfo _existingRemoteKeys = TableInfo.read(_db, "remoteKeys");
        if (! _infoRemoteKeys.equals(_existingRemoteKeys)) {
          return new RoomOpenHelper.ValidationResult(false, "remoteKeys(com.example.codingtask.data.local.entity.RemoteKeys).\n"
                  + " Expected:\n" + _infoRemoteKeys + "\n"
                  + " Found:\n" + _existingRemoteKeys);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8ca81884f57b1b49ada665c6d3c2a552", "f9658ad804618f55cbb9a44f69c5687b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "pixabay_table","remoteKeys");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `pixabay_table`");
      _db.execSQL("DELETE FROM `remoteKeys`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PixabayDao.class, PixabayDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RemoteKeysDao.class, RemoteKeysDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PixabayDao pixabayDao() {
    if (_pixabayDao != null) {
      return _pixabayDao;
    } else {
      synchronized(this) {
        if(_pixabayDao == null) {
          _pixabayDao = new PixabayDao_Impl(this);
        }
        return _pixabayDao;
      }
    }
  }

  @Override
  public RemoteKeysDao remoteKeyDao() {
    if (_remoteKeysDao != null) {
      return _remoteKeysDao;
    } else {
      synchronized(this) {
        if(_remoteKeysDao == null) {
          _remoteKeysDao = new RemoteKeysDao_Impl(this);
        }
        return _remoteKeysDao;
      }
    }
  }
}
