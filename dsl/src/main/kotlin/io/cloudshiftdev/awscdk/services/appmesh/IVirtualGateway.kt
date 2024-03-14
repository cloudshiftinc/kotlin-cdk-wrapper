package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  @Suppress("INAPPLICABLE_JVM_NAME")
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualGateway,
  ) : IVirtualGateway {
    /**
     * Utility method to add a new GatewayRoute to the VirtualGateway.
     *
     * @param id 
     * @param route 
     */
    override fun addGatewayRoute(id: String, route: GatewayRouteBaseProps): GatewayRoute =
        unwrap(this).addGatewayRoute(id,
        route.let(GatewayRouteBaseProps::unwrap)).let(GatewayRoute::wrap)

    /**
     * Utility method to add a new GatewayRoute to the VirtualGateway.
     *
     * @param id 
     * @param route 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
    override fun addGatewayRoute(id: String, route: GatewayRouteBaseProps.Builder.() -> Unit):
        GatewayRoute = addGatewayRoute(id, GatewayRouteBaseProps(route))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grants the given entity `appmesh:StreamAggregatedResources`.
     *
     * @param identity 
     */
    override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
        unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * The Mesh which the VirtualGateway belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The Amazon Resource Name (ARN) for the VirtualGateway.
     */
    override fun virtualGatewayArn(): String = unwrap(this).getVirtualGatewayArn()

    /**
     * Name of the VirtualGateway.
     */
    override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualGateway):
        IVirtualGateway = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualGateway):
        software.amazon.awscdk.services.appmesh.IVirtualGateway = (wrapped as Wrapper).cdkObject
  }
}
