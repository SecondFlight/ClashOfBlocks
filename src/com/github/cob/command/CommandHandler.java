package com.github.cob.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Richmond Steele
 * @since 11/27/13
 *        All rights Reserved
 *        Please read included LICENSE file
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandHandler
{
    String name();
    String[] aliases() default {};
    String description() default "";
    String usage() default "";
    String permission() default "";
    String noPermission() default "";
}
