package com.example.codingtask.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.codingtask.R;
import com.example.codingtask.data.local.entity.Pixabay;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ImageFragmentDirections {
  private ImageFragmentDirections() {
  }

  @NonNull
  public static ActionImageFragmentToBottomSheet actionImageFragmentToBottomSheet(
      @NonNull Pixabay id) {
    return new ActionImageFragmentToBottomSheet(id);
  }

  public static class ActionImageFragmentToBottomSheet implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionImageFragmentToBottomSheet(@NonNull Pixabay id) {
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionImageFragmentToBottomSheet setId(@NonNull Pixabay id) {
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        Pixabay id = (Pixabay) arguments.get("id");
        if (Parcelable.class.isAssignableFrom(Pixabay.class) || id == null) {
          __result.putParcelable("id", Parcelable.class.cast(id));
        } else if (Serializable.class.isAssignableFrom(Pixabay.class)) {
          __result.putSerializable("id", Serializable.class.cast(id));
        } else {
          throw new UnsupportedOperationException(Pixabay.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_imageFragment_to_bottomSheet;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Pixabay getId() {
      return (Pixabay) arguments.get("id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionImageFragmentToBottomSheet that = (ActionImageFragmentToBottomSheet) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getId() != null ? getId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionImageFragmentToBottomSheet(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + "}";
    }
  }
}
