fun main() {
}

fun r() {
	"".repeat(10)
}

fun r_() {
	""().repeat(10)
}

fun r__() {
	("" as java.lang.String).repeat(10)
}

private inline operator fun String.invoke() = this as java.lang.String

@JvmField val t: suspend Integer.() -> Unit = {}
