/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.model.Cat
import com.example.androiddevchallenge.model.CatRepo
import com.example.androiddevchallenge.ui.theme.MyTheme

class CatDetailActivity : AppCompatActivity() {

    companion object {
        private const val INTENT_EXTRA_CAT = "CAT"

        fun startActivity(activity: AppCompatActivity, cat: Cat) {
            activity.startActivity(
                Intent(activity, CatDetailActivity::class.java).apply {
                    putExtra(INTENT_EXTRA_CAT, cat)
                }
            )
        }
    }

    private val cat: Cat?
        get() = intent.getParcelableExtra(INTENT_EXTRA_CAT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                cat?.let { cat ->
                    Surface(color = MaterialTheme.colors.background) {
                        Column {
                            Box {
                                DetailView(cat = cat)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360)
@Composable
private fun Preview() {
    val cat = CatRepo.get()[0]
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                Box {
                    DetailView(cat = cat)
                }
            }
        }
    }
}
