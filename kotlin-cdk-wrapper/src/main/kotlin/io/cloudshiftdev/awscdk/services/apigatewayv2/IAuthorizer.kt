@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an Authorizer.
 */
public interface IAuthorizer : IResource {
  /**
   * Id of the Authorizer.
   */
  public fun authorizerId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IAuthorizer):
        IAuthorizer = CdkObjectWrappers.wrap(cdkObject) as IAuthorizer

    internal fun unwrap(wrapped: IAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IAuthorizer = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IAuthorizer
  }
}
