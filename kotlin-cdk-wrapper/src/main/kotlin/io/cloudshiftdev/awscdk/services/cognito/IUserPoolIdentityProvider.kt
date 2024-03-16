@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a UserPoolIdentityProvider.
 */
public interface IUserPoolIdentityProvider : IResource {
  /**
   * The primary identifier of this identity provider.
   */
  public fun providerName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider):
        IUserPoolIdentityProvider = CdkObjectWrappers.wrap(cdkObject) as IUserPoolIdentityProvider

    internal fun unwrap(wrapped: IUserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.IUserPoolIdentityProvider
  }
}
