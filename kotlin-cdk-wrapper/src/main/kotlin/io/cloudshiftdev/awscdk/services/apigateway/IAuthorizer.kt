@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IAuthorizer {
  public fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  public fun authorizerId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer,
  ) : CdkObject(cdkObject), IAuthorizer {
    override fun authorizationType(): AuthorizationType? =
        unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

    override fun authorizerId(): String = unwrap(this).getAuthorizerId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer):
        IAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuthorizer):
        software.amazon.awscdk.services.apigateway.IAuthorizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.IAuthorizer
  }
}
