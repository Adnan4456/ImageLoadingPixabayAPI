package com.example.codingtask.data.local.dao;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.codingtask.data.local.entity.Pixabay;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PixabayDao_Impl implements PixabayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pixabay> __insertionAdapterOfPixabay;

  private final EntityInsertionAdapter<Pixabay> __insertionAdapterOfPixabay_1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PixabayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPixabay = new EntityInsertionAdapter<Pixabay>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `pixabay_table` (`id`,`collections`,`comments`,`downloads`,`imageHeight`,`imageSize`,`imageWidth`,`largeImageURL`,`likes`,`pageURL`,`previewHeight`,`previewURL`,`previewWidth`,`tags`,`type`,`user`,`userId`,`userImageURL`,`views`,`webformatHeight`,`webformatURL`,`webformatWidth`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pixabay value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCollections());
        stmt.bindLong(3, value.getComments());
        stmt.bindLong(4, value.getDownloads());
        stmt.bindLong(5, value.getImageHeight());
        stmt.bindLong(6, value.getImageSize());
        stmt.bindLong(7, value.getImageWidth());
        if (value.getLargeImageURL() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLargeImageURL());
        }
        stmt.bindLong(9, value.getLikes());
        if (value.getPageURL() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPageURL());
        }
        stmt.bindLong(11, value.getPreviewHeight());
        if (value.getPreviewURL() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPreviewURL());
        }
        stmt.bindLong(13, value.getPreviewWidth());
        if (value.getTags() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getTags());
        }
        if (value.getType() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getType());
        }
        if (value.getUser() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getUser());
        }
        stmt.bindLong(17, value.getUserId());
        if (value.getUserImageURL() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getUserImageURL());
        }
        stmt.bindLong(19, value.getViews());
        stmt.bindLong(20, value.getWebformatHeight());
        if (value.getWebformatURL() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getWebformatURL());
        }
        stmt.bindLong(22, value.getWebformatWidth());
      }
    };
    this.__insertionAdapterOfPixabay_1 = new EntityInsertionAdapter<Pixabay>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `pixabay_table` (`id`,`collections`,`comments`,`downloads`,`imageHeight`,`imageSize`,`imageWidth`,`largeImageURL`,`likes`,`pageURL`,`previewHeight`,`previewURL`,`previewWidth`,`tags`,`type`,`user`,`userId`,`userImageURL`,`views`,`webformatHeight`,`webformatURL`,`webformatWidth`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pixabay value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCollections());
        stmt.bindLong(3, value.getComments());
        stmt.bindLong(4, value.getDownloads());
        stmt.bindLong(5, value.getImageHeight());
        stmt.bindLong(6, value.getImageSize());
        stmt.bindLong(7, value.getImageWidth());
        if (value.getLargeImageURL() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLargeImageURL());
        }
        stmt.bindLong(9, value.getLikes());
        if (value.getPageURL() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPageURL());
        }
        stmt.bindLong(11, value.getPreviewHeight());
        if (value.getPreviewURL() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPreviewURL());
        }
        stmt.bindLong(13, value.getPreviewWidth());
        if (value.getTags() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getTags());
        }
        if (value.getType() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getType());
        }
        if (value.getUser() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getUser());
        }
        stmt.bindLong(17, value.getUserId());
        if (value.getUserImageURL() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getUserImageURL());
        }
        stmt.bindLong(19, value.getViews());
        stmt.bindLong(20, value.getWebformatHeight());
        if (value.getWebformatURL() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getWebformatURL());
        }
        stmt.bindLong(22, value.getWebformatWidth());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pixabay_table";
        return _query;
      }
    };
  }

  @Override
  public Object saveImage(final List<Pixabay> pixabay,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPixabay.insert(pixabay);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertRecord(final Pixabay pixabay, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPixabay_1.insert(pixabay);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, Pixabay> fetchImages(final String query) {
    final String _sql = "SELECT * FROM pixabay_table WHERE tags OR previewURL OR pageURL LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return new LimitOffsetPagingSource<Pixabay>(_statement, __db, "pixabay_table") {
      @Override
      protected List<Pixabay> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfCollections = CursorUtil.getColumnIndexOrThrow(cursor, "collections");
        final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(cursor, "comments");
        final int _cursorIndexOfDownloads = CursorUtil.getColumnIndexOrThrow(cursor, "downloads");
        final int _cursorIndexOfImageHeight = CursorUtil.getColumnIndexOrThrow(cursor, "imageHeight");
        final int _cursorIndexOfImageSize = CursorUtil.getColumnIndexOrThrow(cursor, "imageSize");
        final int _cursorIndexOfImageWidth = CursorUtil.getColumnIndexOrThrow(cursor, "imageWidth");
        final int _cursorIndexOfLargeImageURL = CursorUtil.getColumnIndexOrThrow(cursor, "largeImageURL");
        final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(cursor, "likes");
        final int _cursorIndexOfPageURL = CursorUtil.getColumnIndexOrThrow(cursor, "pageURL");
        final int _cursorIndexOfPreviewHeight = CursorUtil.getColumnIndexOrThrow(cursor, "previewHeight");
        final int _cursorIndexOfPreviewURL = CursorUtil.getColumnIndexOrThrow(cursor, "previewURL");
        final int _cursorIndexOfPreviewWidth = CursorUtil.getColumnIndexOrThrow(cursor, "previewWidth");
        final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(cursor, "tags");
        final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
        final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(cursor, "user");
        final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
        final int _cursorIndexOfUserImageURL = CursorUtil.getColumnIndexOrThrow(cursor, "userImageURL");
        final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(cursor, "views");
        final int _cursorIndexOfWebformatHeight = CursorUtil.getColumnIndexOrThrow(cursor, "webformatHeight");
        final int _cursorIndexOfWebformatURL = CursorUtil.getColumnIndexOrThrow(cursor, "webformatURL");
        final int _cursorIndexOfWebformatWidth = CursorUtil.getColumnIndexOrThrow(cursor, "webformatWidth");
        final List<Pixabay> _result = new ArrayList<Pixabay>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Pixabay _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final int _tmpCollections;
          _tmpCollections = cursor.getInt(_cursorIndexOfCollections);
          final int _tmpComments;
          _tmpComments = cursor.getInt(_cursorIndexOfComments);
          final int _tmpDownloads;
          _tmpDownloads = cursor.getInt(_cursorIndexOfDownloads);
          final int _tmpImageHeight;
          _tmpImageHeight = cursor.getInt(_cursorIndexOfImageHeight);
          final int _tmpImageSize;
          _tmpImageSize = cursor.getInt(_cursorIndexOfImageSize);
          final int _tmpImageWidth;
          _tmpImageWidth = cursor.getInt(_cursorIndexOfImageWidth);
          final String _tmpLargeImageURL;
          if (cursor.isNull(_cursorIndexOfLargeImageURL)) {
            _tmpLargeImageURL = null;
          } else {
            _tmpLargeImageURL = cursor.getString(_cursorIndexOfLargeImageURL);
          }
          final int _tmpLikes;
          _tmpLikes = cursor.getInt(_cursorIndexOfLikes);
          final String _tmpPageURL;
          if (cursor.isNull(_cursorIndexOfPageURL)) {
            _tmpPageURL = null;
          } else {
            _tmpPageURL = cursor.getString(_cursorIndexOfPageURL);
          }
          final int _tmpPreviewHeight;
          _tmpPreviewHeight = cursor.getInt(_cursorIndexOfPreviewHeight);
          final String _tmpPreviewURL;
          if (cursor.isNull(_cursorIndexOfPreviewURL)) {
            _tmpPreviewURL = null;
          } else {
            _tmpPreviewURL = cursor.getString(_cursorIndexOfPreviewURL);
          }
          final int _tmpPreviewWidth;
          _tmpPreviewWidth = cursor.getInt(_cursorIndexOfPreviewWidth);
          final String _tmpTags;
          if (cursor.isNull(_cursorIndexOfTags)) {
            _tmpTags = null;
          } else {
            _tmpTags = cursor.getString(_cursorIndexOfTags);
          }
          final String _tmpType;
          if (cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = cursor.getString(_cursorIndexOfType);
          }
          final String _tmpUser;
          if (cursor.isNull(_cursorIndexOfUser)) {
            _tmpUser = null;
          } else {
            _tmpUser = cursor.getString(_cursorIndexOfUser);
          }
          final int _tmpUserId;
          _tmpUserId = cursor.getInt(_cursorIndexOfUserId);
          final String _tmpUserImageURL;
          if (cursor.isNull(_cursorIndexOfUserImageURL)) {
            _tmpUserImageURL = null;
          } else {
            _tmpUserImageURL = cursor.getString(_cursorIndexOfUserImageURL);
          }
          final int _tmpViews;
          _tmpViews = cursor.getInt(_cursorIndexOfViews);
          final int _tmpWebformatHeight;
          _tmpWebformatHeight = cursor.getInt(_cursorIndexOfWebformatHeight);
          final String _tmpWebformatURL;
          if (cursor.isNull(_cursorIndexOfWebformatURL)) {
            _tmpWebformatURL = null;
          } else {
            _tmpWebformatURL = cursor.getString(_cursorIndexOfWebformatURL);
          }
          final int _tmpWebformatWidth;
          _tmpWebformatWidth = cursor.getInt(_cursorIndexOfWebformatWidth);
          _item = new Pixabay(_tmpId,_tmpCollections,_tmpComments,_tmpDownloads,_tmpImageHeight,_tmpImageSize,_tmpImageWidth,_tmpLargeImageURL,_tmpLikes,_tmpPageURL,_tmpPreviewHeight,_tmpPreviewURL,_tmpPreviewWidth,_tmpTags,_tmpType,_tmpUser,_tmpUserId,_tmpUserImageURL,_tmpViews,_tmpWebformatHeight,_tmpWebformatURL,_tmpWebformatWidth);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
