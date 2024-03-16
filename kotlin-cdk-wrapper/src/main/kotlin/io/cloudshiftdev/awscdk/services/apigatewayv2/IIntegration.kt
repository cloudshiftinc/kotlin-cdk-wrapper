@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an integration to an API Route.
 */
public interface IIntegration : IResource {
  /**
   * Id of the integration.
   */
  public fun integrationId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IIntegration):
        IIntegration = CdkObjectWrappers.wrap(cdkObject) as IIntegration

    internal fun unwrap(wrapped: IIntegration):
        software.amazon.awscdk.services.apigatewayv2.IIntegration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IIntegration
  }
}
