// Generated by view binder compiler. Do not edit!
package com.giuliana.evaluacioncontinuacuatro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.giuliana.evaluacioncontinuacuatro.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGoogle;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Button btnSingUp;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final Guideline guilelineMediumHorizontal;

  @NonNull
  public final ImageView imgLogin;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final TextView textView2;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnGoogle,
      @NonNull Button btnLogin, @NonNull Button btnSingUp, @NonNull TextInputLayout email,
      @NonNull Guideline guilelineMediumHorizontal, @NonNull ImageView imgLogin,
      @NonNull TextInputLayout password, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.btnGoogle = btnGoogle;
    this.btnLogin = btnLogin;
    this.btnSingUp = btnSingUp;
    this.email = email;
    this.guilelineMediumHorizontal = guilelineMediumHorizontal;
    this.imgLogin = imgLogin;
    this.password = password;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_google;
      Button btnGoogle = ViewBindings.findChildViewById(rootView, id);
      if (btnGoogle == null) {
        break missingId;
      }

      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btnSingUp;
      Button btnSingUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSingUp == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputLayout email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.guileline_medium_horizontal;
      Guideline guilelineMediumHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (guilelineMediumHorizontal == null) {
        break missingId;
      }

      id = R.id.img_login;
      ImageView imgLogin = ViewBindings.findChildViewById(rootView, id);
      if (imgLogin == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnGoogle, btnLogin, btnSingUp,
          email, guilelineMediumHorizontal, imgLogin, password, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
