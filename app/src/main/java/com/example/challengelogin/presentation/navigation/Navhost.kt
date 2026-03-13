import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.challengelogin.presentation.navigation.MainRoute

@Composable
fun CompleteNavigation() {
//    val backStack = rememberNavBackStack<NavKey>(MainRoute.Login)
//
//    NavDisplay(
//        // 1. Back stack to observe
//        backStack = backStack,
//
//        // 2. Back button handler
//        onBack = { entriesCount ->
//            repeat(entriesCount) {
//                backStack.removeLastOrNull()
//            }
//        },
//
//        // 3. Entry provider - keys to content
//        entryProvider = entryProvider {
//            entry<HomeScreen> {
//                HomeContent()
//            }
//            entry<ProductDetail> { key ->
//                ProductDetailContent(productId = key.productId)
//            }
//        },
//    )
}