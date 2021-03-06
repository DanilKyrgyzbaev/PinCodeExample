// Generated by view binder compiler. Do not edit!
package com.abakumov.pincode_example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.abakumov.pincode_example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btn0;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final Button btn3;

  @NonNull
  public final Button btn4;

  @NonNull
  public final Button btn5;

  @NonNull
  public final Button btn6;

  @NonNull
  public final Button btn7;

  @NonNull
  public final Button btn8;

  @NonNull
  public final Button btn9;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final LinearLayout linearLayoutPin;

  @NonNull
  public final LinearLayout linearLayoutSupport;

  @NonNull
  public final TextView logotype;

  @NonNull
  public final ImageView num1;

  @NonNull
  public final ImageView num2;

  @NonNull
  public final ImageView num3;

  @NonNull
  public final ImageView num4;

  @NonNull
  public final LinearLayout test;

  @NonNull
  public final TextView textPINCode;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btn0,
      @NonNull Button btn1, @NonNull Button btn2, @NonNull Button btn3, @NonNull Button btn4,
      @NonNull Button btn5, @NonNull Button btn6, @NonNull Button btn7, @NonNull Button btn8,
      @NonNull Button btn9, @NonNull Button btnDelete, @NonNull LinearLayout linearLayoutPin,
      @NonNull LinearLayout linearLayoutSupport, @NonNull TextView logotype,
      @NonNull ImageView num1, @NonNull ImageView num2, @NonNull ImageView num3,
      @NonNull ImageView num4, @NonNull LinearLayout test, @NonNull TextView textPINCode) {
    this.rootView = rootView;
    this.btn0 = btn0;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btn5 = btn5;
    this.btn6 = btn6;
    this.btn7 = btn7;
    this.btn8 = btn8;
    this.btn9 = btn9;
    this.btnDelete = btnDelete;
    this.linearLayoutPin = linearLayoutPin;
    this.linearLayoutSupport = linearLayoutSupport;
    this.logotype = logotype;
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
    this.num4 = num4;
    this.test = test;
    this.textPINCode = textPINCode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_0;
      Button btn0 = ViewBindings.findChildViewById(rootView, id);
      if (btn0 == null) {
        break missingId;
      }

      id = R.id.btn_1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn_2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn_3;
      Button btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btn_4;
      Button btn4 = ViewBindings.findChildViewById(rootView, id);
      if (btn4 == null) {
        break missingId;
      }

      id = R.id.btn_5;
      Button btn5 = ViewBindings.findChildViewById(rootView, id);
      if (btn5 == null) {
        break missingId;
      }

      id = R.id.btn_6;
      Button btn6 = ViewBindings.findChildViewById(rootView, id);
      if (btn6 == null) {
        break missingId;
      }

      id = R.id.btn_7;
      Button btn7 = ViewBindings.findChildViewById(rootView, id);
      if (btn7 == null) {
        break missingId;
      }

      id = R.id.btn_8;
      Button btn8 = ViewBindings.findChildViewById(rootView, id);
      if (btn8 == null) {
        break missingId;
      }

      id = R.id.btn_9;
      Button btn9 = ViewBindings.findChildViewById(rootView, id);
      if (btn9 == null) {
        break missingId;
      }

      id = R.id.btn_delete;
      Button btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.linearLayoutPin;
      LinearLayout linearLayoutPin = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutPin == null) {
        break missingId;
      }

      id = R.id.linearLayoutSupport;
      LinearLayout linearLayoutSupport = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutSupport == null) {
        break missingId;
      }

      id = R.id.logotype;
      TextView logotype = ViewBindings.findChildViewById(rootView, id);
      if (logotype == null) {
        break missingId;
      }

      id = R.id.num1;
      ImageView num1 = ViewBindings.findChildViewById(rootView, id);
      if (num1 == null) {
        break missingId;
      }

      id = R.id.num2;
      ImageView num2 = ViewBindings.findChildViewById(rootView, id);
      if (num2 == null) {
        break missingId;
      }

      id = R.id.num3;
      ImageView num3 = ViewBindings.findChildViewById(rootView, id);
      if (num3 == null) {
        break missingId;
      }

      id = R.id.num4;
      ImageView num4 = ViewBindings.findChildViewById(rootView, id);
      if (num4 == null) {
        break missingId;
      }

      id = R.id.test;
      LinearLayout test = ViewBindings.findChildViewById(rootView, id);
      if (test == null) {
        break missingId;
      }

      id = R.id.textPIN_code;
      TextView textPINCode = ViewBindings.findChildViewById(rootView, id);
      if (textPINCode == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btn0, btn1, btn2, btn3, btn4,
          btn5, btn6, btn7, btn8, btn9, btnDelete, linearLayoutPin, linearLayoutSupport, logotype,
          num1, num2, num3, num4, test, textPINCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
