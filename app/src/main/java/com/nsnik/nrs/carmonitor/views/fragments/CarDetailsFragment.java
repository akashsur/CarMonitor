/*
 *    Copyright 2018 nsnikhil
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.nsnik.nrs.carmonitor.views.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nsnik.nrs.carmonitor.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class CarDetailsFragment extends Fragment {

    @BindView(R.id.detailsCarNumber)
    TextView mCarNo;
    @BindView(R.id.detailsMethaneLevel)
    TextView mMethaneLevel;
    @BindView(R.id.detailsCarbonMonoxideLevel)
    TextView mCarbonMonoxideLevel;
    @BindView(R.id.detailsNitrogenLevel)
    TextView mNitrogenLevel;

    private Unbinder mUnbinder;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car_details, container, false);
        mUnbinder = ButterKnife.bind(this, view);
        initialize();
        return view;
    }

    private void initialize() {

    }

    private void cleanUp() {
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }

    @Override
    public void onDestroy() {
        cleanUp();
        super.onDestroy();
    }

}
