public class Type<T> {
	public static final void main(final String[] args) {
		final Type<String> t = new Type<>("deez cheeze");
		System.out.println(t.t);
	}

	public final T t;

	public Type(final T t) {
		this.t = t;
	}

}
