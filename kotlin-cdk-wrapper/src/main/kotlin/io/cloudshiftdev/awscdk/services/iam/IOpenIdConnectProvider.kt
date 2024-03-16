@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM OpenID Connect provider.
 */
public interface IOpenIdConnectProvider : IResource {
  /**
   * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider.
   */
  public fun openIdConnectProviderArn(): String

  /**
   * The issuer for OIDC Provider.
   */
  public fun openIdConnectProviderIssuer(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IOpenIdConnectProvider):
        IOpenIdConnectProvider = CdkObjectWrappers.wrap(cdkObject) as IOpenIdConnectProvider

    internal fun unwrap(wrapped: IOpenIdConnectProvider):
        software.amazon.awscdk.services.iam.IOpenIdConnectProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IOpenIdConnectProvider
  }
}
