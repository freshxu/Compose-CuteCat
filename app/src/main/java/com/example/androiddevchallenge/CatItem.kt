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

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Cat
import com.example.androiddevchallenge.model.CatRepo

@Composable
fun CatItem(cat: Cat, onClick: (cat: Cat) -> Unit = {}) {
    Surface(
        color = Color.White,
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
            .clickable(true, onClick = { onClick(cat) }),
        shape = RoundedCornerShape(5)
    ) {
        Row(Modifier.fillMaxWidth(1f)) {
            Image(
                painterResource(id = cat.imageId),
                contentDescription = "photo",
                Modifier.size(96.dp),
                contentScale = ContentScale.Crop,
            )
            Column(
                Modifier
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(text = cat.title, fontSize = 18.sp)
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    val cats = CatRepo.get()
    Surface(color = Color.White) {
        Column {
            CatItem(cats[0])
            CatItem(cats[1])
            CatItem(cats[2])
            CatItem(cats[3])
            CatItem(cats[4])
        }
    }
}
