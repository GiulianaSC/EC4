// Generated by view binder compiler. Do not edit!
package com.giuliana.evaluacioncontinuacuatro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.giuliana.evaluacioncontinuacuatro.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRickiMortiFavoriteBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RecyclerView rvRickimortiFavorite;

  private FragmentRickiMortiFavoriteBinding(@NonNull FrameLayout rootView,
      @NonNull RecyclerView rvRickimortiFavorite) {
    this.rootView = rootView;
    this.rvRickimortiFavorite = rvRickimortiFavorite;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRickiMortiFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRickiMortiFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ricki_morti_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRickiMortiFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_rickimorti_favorite;
      RecyclerView rvRickimortiFavorite = ViewBindings.findChildViewById(rootView, id);
      if (rvRickimortiFavorite == null) {
        break missingId;
      }

      return new FragmentRickiMortiFavoriteBinding((FrameLayout) rootView, rvRickimortiFavorite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
