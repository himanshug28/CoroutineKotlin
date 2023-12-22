import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    // demo() // this alone wouldn't compile... Error:() Kotlin: Suspend function 'demo' should be called only from a coroutine or another suspend function
    // whereas the following works as intended:
    runBlocking {
        demo()
    } // it also waits until demo()-call is finished which wouldn't happen if you use launch
}

fun demo() {
    TODO("Not yet implemented")
}
