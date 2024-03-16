@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.List

/**
 * A ManagedComputeEnvironment that uses ECS orchestration on EC2 instances.
 */
public interface IManagedEc2EcsComputeEnvironment : IManagedComputeEnvironment {
  /**
   * Add an instance class to this compute environment.
   *
   * @param instanceClass 
   */
  public fun addInstanceClass(instanceClass: InstanceClass)

  /**
   * Add an instance type to this compute environment.
   *
   * @param instanceType 
   */
  public fun addInstanceType(instanceType: InstanceType)

  /**
   * The allocation strategy to use if not enough instances of the best fitting instance type can be
   * allocated.
   *
   * Default: - `BEST_FIT_PROGRESSIVE` if not using Spot instances,
   * `SPOT_CAPACITY_OPTIMIZED` if using Spot instances.
   */
  public fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  /**
   * Configure which AMIs this Compute Environment can launch.
   *
   * Leave this `undefined` to allow Batch to choose the latest AMIs it supports for each instance
   * that it launches.
   *
   * Default: - ECS_AL2 compatible AMI ids for non-GPU instances, ECS_AL2_NVIDIA compatible AMI ids
   * for GPU instances
   */
  public fun images(): List<EcsMachineImage> = unwrap(this).getImages()?.map(EcsMachineImage::wrap)
      ?: emptyList()

  /**
   * The instance classes that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   * Batch will automatically choose the size.
   */
  public fun instanceClasses(): List<InstanceClass>

  /**
   * The execution Role that instances launched by this Compute Environment will use.
   *
   * Default: - a role will be created
   */
  public fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

  /**
   * The instance types that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   */
  public fun instanceTypes(): List<InstanceType>

  /**
   * The Launch Template that this Compute Environment will use to provision EC2 Instances.
   *
   * *Note*: if `securityGroups` is specified on both your
   * launch template and this Compute Environment, **the
   * `securityGroup`s on the Compute Environment override the
   * ones on the launch template.
   *
   * Default: no launch template
   */
  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  /**
   * The minimum vCPUs that an environment should maintain, even if the compute environment is
   * DISABLED.
   *
   * Default: 0
   */
  public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

  /**
   * The EC2 placement group to associate with your compute resources.
   *
   * If you intend to submit multi-node parallel jobs to this Compute Environment,
   * you should consider creating a cluster placement group and associate it with your compute
   * resources.
   * This keeps your multi-node parallel job on a logical grouping of instances
   * within a single Availability Zone with high network flow potential.
   *
   * Default: - no placement group
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
   */
  public fun placementGroup(): IPlacementGroup? =
      unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

  /**
   * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price
   * for that instance type before instances are launched.
   *
   * For example, if your maximum percentage is 20%, the Spot price must be
   * less than 20% of the current On-Demand price for that Instance.
   * You always pay the lowest market price and never more than your maximum percentage.
   * For most use cases, Batch recommends leaving this field empty.
   *
   * Default: - 100%
   */
  public fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  /**
   * The service-linked role that Spot Fleet needs to launch instances on your behalf.
   *
   * Default: - a new Role will be created
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html)
   */
  public fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

  /**
   * Whether or not to use batch's optimal instance type.
   *
   * The optimal instance type is equivalent to adding the
   * C4, M4, and R4 instance classes. You can specify other instance classes
   * (of the same architecture) in addition to the optimal instance classes.
   *
   * Default: true
   */
  public fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment):
        IManagedEc2EcsComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as
        IManagedEc2EcsComputeEnvironment

    internal fun unwrap(wrapped: IManagedEc2EcsComputeEnvironment):
        software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment
  }
}
