@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Identity providers supported by the UserPoolClient.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON,
 * UserPoolClientIdentityProvider.COGNITO))
 * .build());
 * ```
 */
public open class UserPoolClientIdentityProvider(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider,
) : CdkObject(cdkObject) {
  /**
   * The name of the identity provider as recognized by CloudFormation property
   * `SupportedIdentityProviders`.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val AMAZON: UserPoolClientIdentityProvider =
        UserPoolClientIdentityProvider.wrap(software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.AMAZON)

    public val APPLE: UserPoolClientIdentityProvider =
        UserPoolClientIdentityProvider.wrap(software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.APPLE)

    public val COGNITO: UserPoolClientIdentityProvider =
        UserPoolClientIdentityProvider.wrap(software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.COGNITO)

    public val FACEBOOK: UserPoolClientIdentityProvider =
        UserPoolClientIdentityProvider.wrap(software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.FACEBOOK)

    public val GOOGLE: UserPoolClientIdentityProvider =
        UserPoolClientIdentityProvider.wrap(software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.GOOGLE)

    public fun custom(name: String): UserPoolClientIdentityProvider =
        software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider.custom(name).let(UserPoolClientIdentityProvider::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider):
        UserPoolClientIdentityProvider = UserPoolClientIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientIdentityProvider):
        software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider = wrapped.cdkObject
        as software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider
  }
}
