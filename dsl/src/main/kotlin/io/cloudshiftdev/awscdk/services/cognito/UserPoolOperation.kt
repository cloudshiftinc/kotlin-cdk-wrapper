package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String

public open class UserPoolOperation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolOperation,
) {
    /** The key to use in `CfnUserPool.LambdaConfigProperty`. */
    public open fun operationName(): String = unwrap(this).getOperationName()

    public companion object {
        public fun of(name: String): UserPoolOperation =
            software.amazon.awscdk.services.cognito.UserPoolOperation.of(name)
                .let(UserPoolOperation::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.UserPoolOperation
        ): UserPoolOperation = UserPoolOperation(cdkObject)

        internal fun unwrap(
            wrapped: UserPoolOperation
        ): software.amazon.awscdk.services.cognito.UserPoolOperation = wrapped.cdkObject
    }
}
