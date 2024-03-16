@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface which all VirtualRouter based classes MUST implement.
 */
public interface IVirtualRouter : IResource {
  /**
   * Add a single route to the router.
   *
   * @param id 
   * @param props 
   */
  public fun addRoute(id: String, props: RouteBaseProps): Route

  /**
   * Add a single route to the router.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
  public fun addRoute(id: String, props: RouteBaseProps.Builder.() -> Unit): Route

  /**
   * The Mesh which the VirtualRouter belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The Amazon Resource Name (ARN) for the VirtualRouter.
   */
  public fun virtualRouterArn(): String

  /**
   * The name of the VirtualRouter.
   */
  public fun virtualRouterName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter):
        IVirtualRouter = CdkObjectWrappers.wrap(cdkObject) as IVirtualRouter

    internal fun unwrap(wrapped: IVirtualRouter):
        software.amazon.awscdk.services.appmesh.IVirtualRouter = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.IVirtualRouter
  }
}
