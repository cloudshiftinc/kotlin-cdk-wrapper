@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an API Gateway authorizer.
 */
public interface IAuthorizer {
  /**
   * The authorization type of this authorizer.
   */
  public fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  /**
   * The authorizer ID.
   */
  public fun authorizerId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer,
  ) : CdkObject(cdkObject), IAuthorizer {
    /**
     * The authorization type of this authorizer.
     */
    override fun authorizationType(): AuthorizationType? =
        unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

    /**
     * The authorizer ID.
     */
    override fun authorizerId(): String = unwrap(this).getAuthorizerId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer):
        IAuthorizer = CdkObjectWrappers.wrap(cdkObject) as? IAuthorizer ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuthorizer):
        software.amazon.awscdk.services.apigateway.IAuthorizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.IAuthorizer
  }
}
