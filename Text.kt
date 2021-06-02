fun main() = println(buildString(2000) { java.util.Random().apply {
	while (length < 1999) appendCodePoint(nextInt(0x11000))
} })
