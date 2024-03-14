package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String

public interface IPlacementGroup : IResource {
  /**
   * The number of partitions.
   *
   * Valid only when Strategy is set to PARTITION.
   *
   * Default: 0
   */
  public fun partitions(): Number? = unwrap(this).getPartitions()

  /**
   * The name of this placement group.
   */
  public fun placementGroupName(): String

  /**
   * Places instances on distinct hardware.
   *
   * Spread placement groups are recommended for applications
   * that have a small number of critical instances that should be kept separate from each other.
   * Launching instances in a spread level placement group reduces the risk of simultaneous failures
   * that might occur when instances share the same equipment.
   * Spread level placement groups provide access to distinct hardware,
   * and are therefore suitable for mixing instance types or launching instances over time.
   * If you start or launch an instance in a spread placement group and there is insufficient
   * unique hardware to fulfill the request, the request fails. Amazon EC2 makes more distinct
   * hardware
   * available over time, so you can try your request again later.
   * Placement groups can spread instances across racks or hosts.
   * You can use host level spread placement groups only with AWS Outposts.
   *
   * Default: - no spread level
   */
  public fun spreadLevel(): PlacementGroupSpreadLevel? =
      unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

  /**
   * Which strategy to use when launching instances.
   *
   * Default: - `PlacementGroupStrategy.PARTITION` if `partitions` is defined, `CLUSTER` otherwise
   */
  public fun strategy(): PlacementGroupStrategy? =
      unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup,
  ) : CdkObject(cdkObject), IPlacementGroup {
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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The number of partitions.
     *
     * Valid only when Strategy is set to PARTITION.
     *
     * Default: 0
     */
    override fun partitions(): Number? = unwrap(this).getPartitions()

    /**
     * The name of this placement group.
     */
    override fun placementGroupName(): String = unwrap(this).getPlacementGroupName()

    /**
     * Places instances on distinct hardware.
     *
     * Spread placement groups are recommended for applications
     * that have a small number of critical instances that should be kept separate from each other.
     * Launching instances in a spread level placement group reduces the risk of simultaneous
     * failures
     * that might occur when instances share the same equipment.
     * Spread level placement groups provide access to distinct hardware,
     * and are therefore suitable for mixing instance types or launching instances over time.
     * If you start or launch an instance in a spread placement group and there is insufficient
     * unique hardware to fulfill the request, the request fails. Amazon EC2 makes more distinct
     * hardware
     * available over time, so you can try your request again later.
     * Placement groups can spread instances across racks or hosts.
     * You can use host level spread placement groups only with AWS Outposts.
     *
     * Default: - no spread level
     */
    override fun spreadLevel(): PlacementGroupSpreadLevel? =
        unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * Which strategy to use when launching instances.
     *
     * Default: - `PlacementGroupStrategy.PARTITION` if `partitions` is defined, `CLUSTER` otherwise
     */
    override fun strategy(): PlacementGroupStrategy? =
        unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup):
        IPlacementGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPlacementGroup):
        software.amazon.awscdk.services.ec2.IPlacementGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.IPlacementGroup
  }
}
