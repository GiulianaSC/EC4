// Generated by view binder compiler. Do not edit!
package com.giuliana.evaluacioncontinuacuatro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.giuliana.evaluacioncontinuacuatro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRickiMortiDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddFavorite;

  @NonNull
  public final FrameLayout flBackgroundRm;

  @NonNull
  public final TextView gender;

  @NonNull
  public final Guideline guidelineTop;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView species;

  @NonNull
  public final TextView status;

  private FragmentRickiMortiDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAddFavorite, @NonNull FrameLayout flBackgroundRm, @NonNull TextView gender,
      @NonNull Guideline guidelineTop, @NonNull ImageView imageView, @NonNull TextView name,
      @NonNull TextView species, @NonNull TextView status) {
    this.rootView = rootView;
    this.btnAddFavorite = btnAddFavorite;
    this.flBackgroundRm = flBackgroundRm;
    this.gender = gender;
    this.guidelineTop = guidelineTop;
    this.imageView = imageView;
    this.name = name;
    this.species = species;
    this.status = status;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ricki_morti_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_favorite;
      Button btnAddFavorite = ViewBindings.findChildViewById(rootView, id);
      if (btnAddFavorite == null) {
        break missingId;
      }

      id = R.id.fl_background_rm;
      FrameLayout flBackgroundRm = ViewBindings.findChildViewById(rootView, id);
      if (flBackgroundRm == null) {
        break missingId;
      }

      id = R.id.gender;
      TextView gender = ViewBindings.findChildViewById(rootView, id);
      if (gender == null) {
        break missingId;
      }

      id = R.id.guideline_top;
      Guideline guidelineTop = ViewBindings.findChildViewById(rootView, id);
      if (guidelineTop == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.species;
      TextView species = ViewBindings.findChildViewById(rootView, id);
      if (species == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      return new FragmentRickiMortiDetailBinding((ConstraintLayout) rootView, btnAddFavorite,
          flBackgroundRm, gender, guidelineTop, imageView, name, species, status);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
