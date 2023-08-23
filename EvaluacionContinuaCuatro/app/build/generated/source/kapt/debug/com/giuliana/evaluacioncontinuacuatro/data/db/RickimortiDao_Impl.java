package com.giuliana.evaluacioncontinuacuatro.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti;
import java.lang.Class;
import java.lang.Exception;
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
public final class RickimortiDao_Impl implements RickimortiDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Rickimorti> __insertionAdapterOfRickimorti;

  private final EntityDeletionOrUpdateAdapter<Rickimorti> __deletionAdapterOfRickimorti;

  public RickimortiDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRickimorti = new EntityInsertionAdapter<Rickimorti>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `rickimorti` (`id`,`image`,`name`,`status`,`species`,`gender`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rickimorti value) {
        stmt.bindLong(1, value.getId());
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSpecies());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGender());
        }
      }
    };
    this.__deletionAdapterOfRickimorti = new EntityDeletionOrUpdateAdapter<Rickimorti>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `rickimorti` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rickimorti value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object addFavorite(final Rickimorti rickimorti,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRickimorti.insert(rickimorti);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFavorite(final Rickimorti rickimorti,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRickimorti.handle(rickimorti);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<Rickimorti> getFavorites() {
    final String _sql = "SELECT * from rickimorti";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final List<Rickimorti> _result = new ArrayList<Rickimorti>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Rickimorti _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpSpecies;
        if (_cursor.isNull(_cursorIndexOfSpecies)) {
          _tmpSpecies = null;
        } else {
          _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
        }
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        _item = new Rickimorti(_tmpId,_tmpImage,_tmpName,_tmpStatus,_tmpSpecies,_tmpGender);
        _result.add(_item);
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
