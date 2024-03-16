@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An authorizer for HTTP APIs.
 */
public interface IHttpAuthorizer : IAuthorizer {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer):
        IHttpAuthorizer = CdkObjectWrappers.wrap(cdkObject) as IHttpAuthorizer

    internal fun unwrap(wrapped: IHttpAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpAuthorizer
  }
}
