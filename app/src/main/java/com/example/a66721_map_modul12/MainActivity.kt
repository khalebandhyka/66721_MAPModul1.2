package com.example.a66721_map_modul12

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a66721_map_modul12.ui.theme._66721_MAP_Modul12Theme
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MySootheApp() }
    }
}

// Step: Search bar - Modifiers
@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}

// Step: Align your body - Alignment
@Composable
fun AlignYourBodyElement(
    modifier: Modifier = Modifier
) {
    // Implement composable here
}

// Step: Favorite collection card - Material Surface
@Composable
fun FavoriteCollectionCard(
    modifier: Modifier = Modifier
) {
    // Implement composable here
}

// Step: Align your body row - Arrangements
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    // Implement composable here
}

// Step: Favorite collections grid - LazyGrid
@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    // Implement composable here
}

// Step: Home section - Slot APIs
@Composable
fun HomeSection(
    modifier: Modifier = Modifier
) {
    // Implement composable here
}

// Step: Home screen - Scrolling
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    // Implement composable here
}

// Step: Bottom navigation - Material
@Composable
private fun SootheBottomNavigation(modifier: Modifier = Modifier) {
    // Implement composable here
}

// Step: MySoothe App - Scaffold
@Composable
fun MySootheAppPortrait() {
    // Implement composable here
}

// Step: Bottom navigation - Material
@Composable
private fun SootheNavigationRail(modifier: Modifier = Modifier) {
    // Implement composable here
}

// Step: Landscape Mode
@Composable
fun MySootheAppLandscape(){
    // Implement composable here
}

// Step: MySoothe App
@Composable
fun MySootheApp(content: @Composable () -> Unit = {}) {
    Scaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            content()
        }
    }
}

private val alignYourBodyData = listOf(
    R.drawable.ab1_inversions to R.string.ab1_inversions,
    R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
    R.drawable.ab3_stretching to R.string.ab3_stretching,
    R.drawable.ab4_tabata to R.string.ab4_tabata,
    R.drawable.ab5_hiit to R.string.ab5_hiit,
    R.drawable.ab6_pre_natal_yoga to R.string.ab6_pre_natal_yoga
).map { DrawableStringPair(it.first, it.second) }

private val favoriteCollectionsData = listOf(
    R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
    R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
    R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
    R.drawable.fc4_self_massage to R.string.fc4_self_massage,
    R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down
).map { DrawableStringPair(it.first, it.second) }

private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun SearchBarPreview() {
    MySootheApp { SearchBar(Modifier.padding(8.dp)) }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyElementPreview() {
    MySootheApp {
        AlignYourBodyElement(
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionCardPreview() {
    MySootheApp {
        FavoriteCollectionCard(
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionsGridPreview() {
    MySootheApp { FavoriteCollectionsGrid() }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyRowPreview() {
    MySootheApp { AlignYourBodyRow() }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun HomeSectionPreview() {
    MySootheApp { HomeSection() }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun ScreenContentPreview() {
    MySootheApp { HomeScreen() }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun BottomNavigationPreview() {
    MySootheApp { SootheBottomNavigation(Modifier.padding(top = 24.dp)) }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun NavigationRailPreview() {
    MySootheApp { SootheNavigationRail() }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MySoothePortraitPreview() {
    MySootheAppPortrait()
}

@Preview(widthDp = 640, heightDp = 360)
@Composable
fun MySootheLandscapePreview() {
    MySootheAppLandscape()
}
