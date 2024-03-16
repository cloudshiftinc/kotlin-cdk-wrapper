@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for which all GatewayRoute based classes MUST implement.
 */
public interface IGatewayRoute : IResource {
  /**
   * The Amazon Resource Name (ARN) for the GatewayRoute.
   */
  public fun gatewayRouteArn(): String

  /**
   * The name of the GatewayRoute.
   */
  public fun gatewayRouteName(): String

  /**
   * The VirtualGateway the GatewayRoute belongs to.
   */
  public fun virtualGateway(): IVirtualGateway

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IGatewayRoute):
        IGatewayRoute = CdkObjectWrappers.wrap(cdkObject) as IGatewayRoute

    internal fun unwrap(wrapped: IGatewayRoute):
        software.amazon.awscdk.services.appmesh.IGatewayRoute = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.IGatewayRoute
  }
}
