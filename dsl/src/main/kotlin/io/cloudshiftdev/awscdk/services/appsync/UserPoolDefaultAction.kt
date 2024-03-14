package io.cloudshiftdev.awscdk.services.appsync

public enum class UserPoolDefaultAction(
    private val cdkObject: software.amazon.awscdk.services.appsync.UserPoolDefaultAction,
) {
    ALLOW(software.amazon.awscdk.services.appsync.UserPoolDefaultAction.ALLOW),
    DENY(software.amazon.awscdk.services.appsync.UserPoolDefaultAction.DENY),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.UserPoolDefaultAction
        ): UserPoolDefaultAction =
            when (cdkObject) {
                software.amazon.awscdk.services.appsync.UserPoolDefaultAction.ALLOW ->
                    UserPoolDefaultAction.ALLOW
                software.amazon.awscdk.services.appsync.UserPoolDefaultAction.DENY ->
                    UserPoolDefaultAction.DENY
            }

        internal fun unwrap(
            wrapped: UserPoolDefaultAction
        ): software.amazon.awscdk.services.appsync.UserPoolDefaultAction = wrapped.cdkObject
    }
}
