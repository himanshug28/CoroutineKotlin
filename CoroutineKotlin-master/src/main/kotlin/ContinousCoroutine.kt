import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Starting main function..")

    GlobalScope.launch {
        println(doSomething())
    }
    runBlocking {
        delay(4000L) // make sure to keep the JVM alive in order to wait for doSomething() to execute
    }
}

suspend fun doSomething() : String {
    delay(3000L) // simulate long running task
    return "Did something that was 3 seconds long"
}



