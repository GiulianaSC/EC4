package com.giuliana.evaluacioncontinuacuatro.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/giuliana/evaluacioncontinuacuatro/view/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/giuliana/evaluacioncontinuacuatro/databinding/ActivityLoginBinding;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "googleLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "isCredentialsValidated", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "signInFirebaseWihEmail", "email", "", "password", "signInFirebaseWithGoogle", "idToken", "signInWithEmailPassword", "signInWithGoogle", "signUpWithEmailPassword", "validateInputs", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.giuliana.evaluacioncontinuacuatro.databinding.ActivityLoginBinding binding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> googleLauncher;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void signInFirebaseWithGoogle(java.lang.String idToken) {
    }
    
    private final void setupView() {
    }
    
    private final void signUpWithEmailPassword() {
    }
    
    private final void signInWithEmailPassword() {
    }
    
    private final void signInFirebaseWihEmail(java.lang.String email, java.lang.String password) {
    }
    
    private final boolean isCredentialsValidated() {
        return false;
    }
    
    private final void signInWithGoogle() {
    }
    
    private final boolean validateInputs(java.lang.String email, java.lang.String password) {
        return false;
    }
}