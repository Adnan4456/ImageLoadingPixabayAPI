package com.example.codingtask.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.codingtask.data.local.entity.Pixabay;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id")) {
      Pixabay id;
      if (Parcelable.class.isAssignableFrom(Pixabay.class) || Serializable.class.isAssignableFrom(Pixabay.class)) {
        id = (Pixabay) bundle.get("id");
      } else {
        throw new UnsupportedOperationException(Pixabay.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    if (savedStateHandle.contains("id")) {
      Pixabay id;
      id = savedStateHandle.get("id");
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Pixabay getId() {
    return (Pixabay) arguments.get("id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("id")) {
      Pixabay id = (Pixabay) arguments.get("id");
      if (Parcelable.class.isAssignableFrom(Pixabay.class) || id == null) {
        __result.set("id", Parcelable.class.cast(id));
      } else if (Serializable.class.isAssignableFrom(Pixabay.class)) {
        __result.set("id", Serializable.class.cast(id));
      } else {
        throw new UnsupportedOperationException(Pixabay.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
      return false;
    }
    if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getId() != null ? getId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "id=" + getId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Pixabay id) {
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setId(@NonNull Pixabay id) {
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Pixabay getId() {
      return (Pixabay) arguments.get("id");
    }
  }
}
