package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface ICluster : IResource {
  /**
   * The autoscaling group added to the cluster if capacity is associated to the cluster.
   */
  public fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  /**
   * The Amazon Resource Name (ARN) that identifies the cluster.
   */
  public fun clusterArn(): String

  /**
   * The name of the cluster.
   */
  public fun clusterName(): String

  /**
   * Manage the allowed network connections for the cluster with Security Groups.
   */
  public fun connections(): Connections

  /**
   * The AWS Cloud Map namespace to associate with the cluster.
   */
  public fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  /**
   * The execute command configuration for the cluster.
   */
  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  /**
   * Specifies whether the cluster has EC2 instance capacity.
   */
  public fun hasEc2Capacity(): Boolean

  /**
   * The VPC associated with the cluster.
   */
  public fun vpc(): IVpc

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ICluster,
  ) : ICluster {
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
     * The autoscaling group added to the cluster if capacity is associated to the cluster.
     */
    override fun autoscalingGroup(): IAutoScalingGroup? =
        unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * The name of the cluster.
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * Manage the allowed network connections for the cluster with Security Groups.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The AWS Cloud Map namespace to associate with the cluster.
     */
    override fun defaultCloudMapNamespace(): INamespace? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

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
     * The execute command configuration for the cluster.
     */
    override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    /**
     * Specifies whether the cluster has EC2 instance capacity.
     */
    override fun hasEc2Capacity(): Boolean = unwrap(this).getHasEc2Capacity()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The VPC associated with the cluster.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ICluster): ICluster =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.ecs.ICluster = (wrapped
        as Wrapper).cdkObject
  }
}
