package uk.me.wilfred.wclock

/**
 * Builds the message shown on the home screen.
 *
 * Kept free of Android types so it can be covered by a fast JVM unit test.
 */
fun greeting(name: String): String = "Hello, $name!"
