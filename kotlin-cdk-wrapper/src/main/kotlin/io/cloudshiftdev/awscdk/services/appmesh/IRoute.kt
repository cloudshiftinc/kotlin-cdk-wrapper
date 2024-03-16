@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for which all Route based classes MUST implement.
 */
public interface IRoute : IResource {
  /**
   * The Amazon Resource Name (ARN) for the route.
   */
  public fun routeArn(): String

  /**
   * The name of the route.
   */
  public fun routeName(): String

  /**
   * The VirtualRouter the Route belongs to.
   */
  public fun virtualRouter(): IVirtualRouter

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IRoute): IRoute =
        CdkObjectWrappers.wrap(cdkObject) as IRoute

    internal fun unwrap(wrapped: IRoute): software.amazon.awscdk.services.appmesh.IRoute = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IRoute
  }
}
