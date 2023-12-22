import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.suspendCoroutine

fun main(): Unit = runBlocking {
    launch {
        print("1 ")
        print("2 ")
        print("3 ")
        suspendCoroutine<Unit> { }
        print("4 ")
        println("Done!")
    }
}