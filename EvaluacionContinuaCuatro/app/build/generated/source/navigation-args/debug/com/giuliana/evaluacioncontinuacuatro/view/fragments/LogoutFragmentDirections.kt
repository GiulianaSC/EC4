package com.giuliana.evaluacioncontinuacuatro.view.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.giuliana.evaluacioncontinuacuatro.R

public class LogoutFragmentDirections private constructor() {
  public companion object {
    public fun actionLogoutFragmentToLoginActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_logoutFragment_to_loginActivity)
  }
}
