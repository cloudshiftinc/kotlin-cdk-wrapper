package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class UserPoolClientIdentityProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider,
) : CdkObject(cdkObject) {
  /**
   * The name of the identity provider as recognized by CloudFormation property
   * `SupportedIdentityProviders`.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public fun custom(name: String): UserPoolClientIdentityProvider =
        software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.custom(name).let(UserPoolClientIdentityProvider::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider):
        UserPoolClientIdentityProvider = UserPoolClientIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientIdentityProvider):
        software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider = wrapped.cdkObject
  }
}
