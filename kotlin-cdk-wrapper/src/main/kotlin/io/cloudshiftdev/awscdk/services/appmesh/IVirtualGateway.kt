@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface which all Virtual Gateway based classes must implement.
 */
public interface IVirtualGateway : IResource {
  /**
   * Utility method to add a new GatewayRoute to the VirtualGateway.
   *
   * @param id 
   * @param route 
   */
  public fun addGatewayRoute(id: String, route: GatewayRouteBaseProps): GatewayRoute

  /**
   * Utility method to add a new GatewayRoute to the VirtualGateway.
   *
   * @param id 
   * @param route 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
  public fun addGatewayRoute(id: String, route: GatewayRouteBaseProps.Builder.() -> Unit):
      GatewayRoute

  /**
   * Grants the given entity `appmesh:StreamAggregatedResources`.
   *
   * @param identity 
   */
  public fun grantStreamAggregatedResources(identity: IGrantable): Grant

  /**
   * The Mesh which the VirtualGateway belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The Amazon Resource Name (ARN) for the VirtualGateway.
   */
  public fun virtualGatewayArn(): String

  /**
   * Name of the VirtualGateway.
   */
  public fun virtualGatewayName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualGateway):
        IVirtualGateway = CdkObjectWrappers.wrap(cdkObject) as IVirtualGateway

    internal fun unwrap(wrapped: IVirtualGateway):
        software.amazon.awscdk.services.appmesh.IVirtualGateway = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.IVirtualGateway
  }
}
