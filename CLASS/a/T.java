public class T {
	private final ClassLoader classLoader;
	private final java.lang.Class<?> componentType;
	private T(ClassLoader loader, java.lang.Class<?> arrayComponentType)  {
		classLoader = loader;
		componentType = arrayComponentType;
	}
}
