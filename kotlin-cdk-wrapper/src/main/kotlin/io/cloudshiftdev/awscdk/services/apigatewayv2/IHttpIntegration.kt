@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents an Integration for an HTTP API.
 */
public interface IHttpIntegration : IIntegration {
  /**
   * The HTTP API associated with this integration.
   */
  public fun httpApi(): IHttpApi

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpIntegration):
        IHttpIntegration = CdkObjectWrappers.wrap(cdkObject) as IHttpIntegration

    internal fun unwrap(wrapped: IHttpIntegration):
        software.amazon.awscdk.services.apigatewayv2.IHttpIntegration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IHttpIntegration
  }
}
