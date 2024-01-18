/*
 * Copyright (c) 2012, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * JAX-RS Application class for this example.
 *
 * @author Martin Matula
 */
//@ApplicationPath("/api")
public class JaxRsApplication extends Application {
    private final Set<Class<?>> classes;

    public JaxRsApplication() {
        HashSet<Class<?>> c = new HashSet<Class<?>>();
        c.add(MyResource.class);
        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}