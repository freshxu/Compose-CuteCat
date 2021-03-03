package com.example.androiddevchallenge

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.model.Cat
import com.example.androiddevchallenge.model.CatRepo

@Composable
fun CatList(cats: List<Cat>, modifier: Modifier = Modifier, onClick: (Cat) -> Unit) {
    LazyColumn(modifier = modifier) {
        items(cats) { cat ->
            CatItem(cat = cat, onClick)
        }
    }
}

@Preview
@Composable
private fun Preview() {
    CatList(cats = CatRepo.get(), onClick = {})
}