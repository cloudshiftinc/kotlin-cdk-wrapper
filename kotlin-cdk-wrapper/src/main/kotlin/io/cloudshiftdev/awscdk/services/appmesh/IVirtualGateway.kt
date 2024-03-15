@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IVirtualGateway : IResource {
  public fun addGatewayRoute(arg0: String, arg1: GatewayRouteBaseProps): GatewayRoute

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
  public fun addGatewayRoute(arg0: String, arg1: GatewayRouteBaseProps.Builder.() -> Unit):
      GatewayRoute

  public fun grantStreamAggregatedResources(arg0: IGrantable): Grant

  public fun mesh(): IMesh

  public fun virtualGatewayArn(): String

  public fun virtualGatewayName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualGateway,
  ) : CdkObject(cdkObject), IVirtualGateway {
    override fun addGatewayRoute(arg0: String, arg1: GatewayRouteBaseProps): GatewayRoute =
        unwrap(this).addGatewayRoute(arg0,
        arg1.let(GatewayRouteBaseProps::unwrap)).let(GatewayRoute::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
    override fun addGatewayRoute(arg0: String, arg1: GatewayRouteBaseProps.Builder.() -> Unit):
        GatewayRoute = addGatewayRoute(arg0, GatewayRouteBaseProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantStreamAggregatedResources(arg0: IGrantable): Grant =
        unwrap(this).grantStreamAggregatedResources(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun virtualGatewayArn(): String = unwrap(this).getVirtualGatewayArn()

    override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualGateway):
        IVirtualGateway = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualGateway):
        software.amazon.awscdk.services.appmesh.IVirtualGateway = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.IVirtualGateway
  }
}
