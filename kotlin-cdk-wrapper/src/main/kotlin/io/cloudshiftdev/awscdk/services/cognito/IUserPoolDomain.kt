@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a user pool domain.
 */
public interface IUserPoolDomain : IResource {
  /**
   * The domain that was specified to be created.
   *
   * If `customDomain` was selected, this holds the full domain name that was specified.
   * If the `cognitoDomain` was used, it contains the prefix to the Cognito hosted domain.
   */
  public fun domainName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolDomain):
        IUserPoolDomain = CdkObjectWrappers.wrap(cdkObject) as IUserPoolDomain

    internal fun unwrap(wrapped: IUserPoolDomain):
        software.amazon.awscdk.services.cognito.IUserPoolDomain = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.IUserPoolDomain
  }
}
