package com.dependency.framework.module;

/**
 * Module interface to configure dependency injection mapping.
 *
 * @author nilesh
 *
 */
public interface IModule {

    void configure();

    <T> Class<? extends T> getMapping(Class<T> type);
}
