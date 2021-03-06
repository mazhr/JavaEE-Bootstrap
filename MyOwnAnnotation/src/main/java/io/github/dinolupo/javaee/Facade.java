/**
 * 
 */
package io.github.dinolupo.javaee;

/**
 * @author dinolupo.github.io
 *
 */
public class Facade {

	@MyInject(MyInject.DayTime.EVENING)
	private Service service;

	public void invokeService(){
		service.serve();
	}

	String somethingElse;

	@Override
	public String toString() {
		return "Facade{" +
				"service=" + service +
				", somethingElse='" + somethingElse + '\'' +
				'}';
	}
}

