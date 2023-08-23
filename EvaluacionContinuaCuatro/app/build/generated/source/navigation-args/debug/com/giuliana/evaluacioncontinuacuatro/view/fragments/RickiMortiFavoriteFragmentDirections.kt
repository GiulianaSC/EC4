package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class RickiMortiFavoriteFragmentDirections private constructor() {
  private data class ActionRickiMortiFavoriteFragmentToRickiMortiDetailFragment(
    public val results: Rickimorti
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_rickiMortiFavoriteFragment_to_rickiMortiDetailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionRickiMortiFavoriteFragmentToRickiMortiDetailFragment(results: Rickimorti):
        NavDirections = ActionRickiMortiFavoriteFragmentToRickiMortiDetailFragment(results)
  }
}
