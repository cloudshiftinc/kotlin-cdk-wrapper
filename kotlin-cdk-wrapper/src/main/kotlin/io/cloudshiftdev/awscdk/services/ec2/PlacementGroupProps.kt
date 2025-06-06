@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Props for a PlacementGroup.
 *
 * Example:
 *
 * ```
 * InstanceType instanceType;
 * PlacementGroup pg = PlacementGroup.Builder.create(this, "test-pg")
 * .strategy(PlacementGroupStrategy.SPREAD)
 * .build();
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .placementGroup(pg)
 * .build();
 * ```
 */
public interface PlacementGroupProps {
  /**
   * The number of partitions.
   *
   * Valid only when Strategy is set to partition.
   *
   * Default: 0
   */
  public fun partitions(): Number? = unwrap(this).getPartitions()

  /**
   * the name of this placement group.
   *
   * Default: - generated by CFN
   */
  public fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

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

  /**
   * A builder for [PlacementGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param partitions The number of partitions.
     * Valid only when Strategy is set to partition.
     */
    public fun partitions(partitions: Number)

    /**
     * @param placementGroupName the name of this placement group.
     */
    public fun placementGroupName(placementGroupName: String)

    /**
     * @param spreadLevel Places instances on distinct hardware.
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
     */
    public fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel)

    /**
     * @param strategy Which strategy to use when launching instances.
     */
    public fun strategy(strategy: PlacementGroupStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PlacementGroupProps.Builder =
        software.amazon.awscdk.services.ec2.PlacementGroupProps.builder()

    /**
     * @param partitions The number of partitions.
     * Valid only when Strategy is set to partition.
     */
    override fun partitions(partitions: Number) {
      cdkBuilder.partitions(partitions)
    }

    /**
     * @param placementGroupName the name of this placement group.
     */
    override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    /**
     * @param spreadLevel Places instances on distinct hardware.
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
     */
    override fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
      cdkBuilder.spreadLevel(spreadLevel.let(PlacementGroupSpreadLevel.Companion::unwrap))
    }

    /**
     * @param strategy Which strategy to use when launching instances.
     */
    override fun strategy(strategy: PlacementGroupStrategy) {
      cdkBuilder.strategy(strategy.let(PlacementGroupStrategy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.PlacementGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupProps,
  ) : CdkObject(cdkObject),
      PlacementGroupProps {
    /**
     * The number of partitions.
     *
     * Valid only when Strategy is set to partition.
     *
     * Default: 0
     */
    override fun partitions(): Number? = unwrap(this).getPartitions()

    /**
     * the name of this placement group.
     *
     * Default: - generated by CFN
     */
    override fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

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
     * Which strategy to use when launching instances.
     *
     * Default: - `PlacementGroupStrategy.PARTITION` if `partitions` is defined, `CLUSTER` otherwise
     */
    override fun strategy(): PlacementGroupStrategy? =
        unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PlacementGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupProps):
        PlacementGroupProps = CdkObjectWrappers.wrap(cdkObject) as? PlacementGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PlacementGroupProps):
        software.amazon.awscdk.services.ec2.PlacementGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.PlacementGroupProps
  }
}
