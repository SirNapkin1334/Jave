public class test {

	//public void heck() {
	//	System.out.println("heck");
	//}
	
	public String getId() { return "heck"; }

}

interface Extension {

	/**
	 * Get this extension's unique ID. Namespacing with periods is recommended.
	 * <p>
	 * It must follow Java Package name formatting, i.e. {@code moderation.global}
	 *
	 * @return this extension's unique id
	 */
	String getId();

//	/**
//	 * A list of commands that this extension has.
//	 * <p>
//	 * Override this class if your extension has Commands.
//	 *
//	 * @return this extension's commands
//	 * @see    Command
//	 */
//	@NotNull
//	default Set<Command> getCommands() {
//		return new HashSet<>();
//	}

//	/**
//	 * A list of event listeners this command has. Not actual listeners per se, but
//	 * rather a list of {@link Consumer}<{@link Event}>, which will be registered when
//	 * the class is loaded.
//	 * <p>
//	 * Override this class if your extension has "listeners".
//	 *
//	 * @return this extension's "listeners"
//	 */
//	@NotNull
//	default Set<Consumer<Event>> getListeners() {
//		return new HashSet<>();
//	}

}

