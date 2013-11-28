package com.github.cob.command;

import java.lang.reflect.Method;

/**
 * @author Richmond Steele
 * @since 11/27/13
 *        All rights Reserved
 *        Please read included LICENSE file
 */
public class RegisteredCommand
{
    private final Method method;
    private final Object clazz;

    public RegisteredCommand(Method method, Object clazz)
    {
        this.method = method;
        this.clazz = clazz;
    }

    public Method getMethod()
    {
        return method;
    }

    public Object getClazz()
    {
        return clazz;
    }
}
