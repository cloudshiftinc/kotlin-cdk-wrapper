@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class UserPoolOperation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolOperation,
) : CdkObject(cdkObject) {
  public open fun operationName(): String = unwrap(this).getOperationName()

  public companion object {
    public val CREATE_AUTH_CHALLENGE: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.CREATE_AUTH_CHALLENGE)

    public val CUSTOM_EMAIL_SENDER: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.CUSTOM_EMAIL_SENDER)

    public val CUSTOM_MESSAGE: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.CUSTOM_MESSAGE)

    public val CUSTOM_SMS_SENDER: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.CUSTOM_SMS_SENDER)

    public val DEFINE_AUTH_CHALLENGE: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.DEFINE_AUTH_CHALLENGE)

    public val POST_AUTHENTICATION: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.POST_AUTHENTICATION)

    public val POST_CONFIRMATION: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.POST_CONFIRMATION)

    public val PRE_AUTHENTICATION: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.PRE_AUTHENTICATION)

    public val PRE_SIGN_UP: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.PRE_SIGN_UP)

    public val PRE_TOKEN_GENERATION: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.PRE_TOKEN_GENERATION)

    public val PRE_TOKEN_GENERATION_CONFIG: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.PRE_TOKEN_GENERATION_CONFIG)

    public val USER_MIGRATION: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.USER_MIGRATION)

    public val VERIFY_AUTH_CHALLENGE_RESPONSE: UserPoolOperation =
        UserPoolOperation.wrap(software.amazon.awscdk.services.cognito.UserPoolOperation.VERIFY_AUTH_CHALLENGE_RESPONSE)

    public fun of(name: String): UserPoolOperation =
        software.amazon.awscdk.services.cognito.UserPoolOperation.of(name).let(UserPoolOperation::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolOperation):
        UserPoolOperation = UserPoolOperation(cdkObject)

    internal fun unwrap(wrapped: UserPoolOperation):
        software.amazon.awscdk.services.cognito.UserPoolOperation = wrapped.cdkObject
  }
}