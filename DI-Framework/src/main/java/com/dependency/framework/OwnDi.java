package com.dependency.framework;

import com.dependency.framework.module.IModule;

/**
 * It initializes the configuration (based on the configuration module).
 * The configuration means, that it binds the interfaces to their implementations.
 *
 * @author nilesh
 *
 */
public final class OwnDi {

	private OwnDi() {
		
	}
	
    public static OwnDiFramework getFramework(final IModule module) {
        module.configure();
        return new OwnDiFramework(module);
    }
}