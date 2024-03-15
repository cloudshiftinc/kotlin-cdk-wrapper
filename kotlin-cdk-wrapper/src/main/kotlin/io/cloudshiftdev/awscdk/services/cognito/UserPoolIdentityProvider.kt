@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * User pool third-party identity providers.
 */
public open class UserPoolIdentityProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProvider,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromProviderName(
      scope: Construct,
      id: String,
      providerName: String,
    ): IUserPoolIdentityProvider =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProvider.fromProviderName(scope.let(Construct::unwrap),
        id, providerName).let(IUserPoolIdentityProvider::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProvider):
        UserPoolIdentityProvider = UserPoolIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProvider = wrapped.cdkObject
  }
}
