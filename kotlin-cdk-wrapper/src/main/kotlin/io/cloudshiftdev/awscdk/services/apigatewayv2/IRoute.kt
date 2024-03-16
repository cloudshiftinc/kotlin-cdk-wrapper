@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a route.
 */
public interface IRoute : IResource {
  /**
   * Id of the Route.
   */
  public fun routeId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IRoute): IRoute =
        CdkObjectWrappers.wrap(cdkObject) as IRoute

    internal fun unwrap(wrapped: IRoute): software.amazon.awscdk.services.apigatewayv2.IRoute =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IRoute
  }
}
