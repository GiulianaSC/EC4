package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RickiMortiDetailFragmentArgs(
  public val results: Rickimorti
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Rickimorti::class.java)) {
      result.putParcelable("results", this.results as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Rickimorti::class.java)) {
      result.putSerializable("results", this.results as Serializable)
    } else {
      throw UnsupportedOperationException(Rickimorti::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Rickimorti::class.java)) {
      result.set("results", this.results as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Rickimorti::class.java)) {
      result.set("results", this.results as Serializable)
    } else {
      throw UnsupportedOperationException(Rickimorti::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): RickiMortiDetailFragmentArgs {
      bundle.setClassLoader(RickiMortiDetailFragmentArgs::class.java.classLoader)
      val __results : Rickimorti?
      if (bundle.containsKey("results")) {
        if (Parcelable::class.java.isAssignableFrom(Rickimorti::class.java) ||
            Serializable::class.java.isAssignableFrom(Rickimorti::class.java)) {
          __results = bundle.get("results") as Rickimorti?
        } else {
          throw UnsupportedOperationException(Rickimorti::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__results == null) {
          throw IllegalArgumentException("Argument \"results\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"results\" is missing and does not have an android:defaultValue")
      }
      return RickiMortiDetailFragmentArgs(__results)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        RickiMortiDetailFragmentArgs {
      val __results : Rickimorti?
      if (savedStateHandle.contains("results")) {
        if (Parcelable::class.java.isAssignableFrom(Rickimorti::class.java) ||
            Serializable::class.java.isAssignableFrom(Rickimorti::class.java)) {
          __results = savedStateHandle.get<Rickimorti?>("results")
        } else {
          throw UnsupportedOperationException(Rickimorti::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__results == null) {
          throw IllegalArgumentException("Argument \"results\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"results\" is missing and does not have an android:defaultValue")
      }
      return RickiMortiDetailFragmentArgs(__results)
    }
  }
}
