/*
 * Created by awitrisna on 2013-11-15.
 * Copyright (c) 2013 CA Technologies. All rights reserved.
 */

package com.ca.apim.mag.examplea;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.l7tech.msso.auth.QRCode;
import com.l7tech.msso.auth.QRCodeRenderer;
import com.l7tech.msso.gui.AbstractLogonActivity;

import java.util.List;

public class DaimlerLogonActivity extends AbstractLogonActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<View> providers = getProviders();
        if (!providers.isEmpty()) {
            for (final View provider : providers) {
                if (provider instanceof ImageButton) {
                    ((ImageButton)provider).performClick();
                }
            }
        }
    }
}