@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String

/**
 * Determines where your instances are placed on the underlying hardware according to the specified
 * PlacementGroupStrategy.
 *
 * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
 */
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup):
        IPlacementGroup = CdkObjectWrappers.wrap(cdkObject) as IPlacementGroup

    internal fun unwrap(wrapped: IPlacementGroup):
        software.amazon.awscdk.services.ec2.IPlacementGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.IPlacementGroup
  }
}
