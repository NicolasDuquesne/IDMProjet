/*
 * generated by Xtext
 */
package istic.idm.project;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VideoGenUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return istic.idm.project.ui.internal.VideoGenActivator.getInstance().getInjector("istic.idm.project.VideoGen");
	}
	
}
