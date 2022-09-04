package com.example.codingtask.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.codingtask.data.local.entity.RemoteKeys;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RemoteKeysDao_Impl implements RemoteKeysDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RemoteKeys> __insertionAdapterOfRemoteKeys;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public RemoteKeysDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRemoteKeys = new EntityInsertionAdapter<RemoteKeys>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `remoteKeys` (`id`,`prevKey`,`nextKey`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RemoteKeys value) {
        stmt.bindLong(1, value.getId());
        if (value.getPrevKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPrevKey());
        }
        if (value.getNextKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getNextKey());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remoteKeys";
        return _query;
      }
    };
  }

  @Override
  public Object insetAll(final List<RemoteKeys> pixabay,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRemoteKeys.insert(pixabay);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void clearAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAll.release(_stmt);
    }
  }

  @Override
  public RemoteKeys getAllRemoteKeys(final int id) {
    final String _sql = "SELECT * FROM remoteKeys WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPrevKey = CursorUtil.getColumnIndexOrThrow(_cursor, "prevKey");
      final int _cursorIndexOfNextKey = CursorUtil.getColumnIndexOrThrow(_cursor, "nextKey");
      final RemoteKeys _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Integer _tmpPrevKey;
        if (_cursor.isNull(_cursorIndexOfPrevKey)) {
          _tmpPrevKey = null;
        } else {
          _tmpPrevKey = _cursor.getInt(_cursorIndexOfPrevKey);
        }
        final Integer _tmpNextKey;
        if (_cursor.isNull(_cursorIndexOfNextKey)) {
          _tmpNextKey = null;
        } else {
          _tmpNextKey = _cursor.getInt(_cursorIndexOfNextKey);
        }
        _result = new RemoteKeys(_tmpId,_tmpPrevKey,_tmpNextKey);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
