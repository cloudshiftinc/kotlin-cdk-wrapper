@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * InstancesDistribution is a subproperty of MixedInstancesPolicy that describes an instances
 * distribution for an Auto Scaling group.
 *
 * The instances distribution specifies the distribution of On-Demand Instances
 * and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group
 * allocates
 * instance types to fulfill On-Demand and Spot capacities.
 *
 * For more information and example configurations, see Auto Scaling groups with multiple instance
 * types
 * and purchase options in the Amazon EC2 Auto Scaling User Guide:
 *
 * https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * LaunchTemplate launchTemplate1;
 * LaunchTemplate launchTemplate2;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
 * .instancesDistribution(InstancesDistribution.builder()
 * .onDemandPercentageAboveBaseCapacity(50)
 * .build())
 * .launchTemplate(launchTemplate1)
 * .launchTemplateOverrides(List.of(LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t3.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t3a.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t4g.micro")).launchTemplate(launchTemplate2).build()))
 * .build())
 * .build();
 * ```
 */
public interface InstancesDistribution {
  /**
   * Indicates how to allocate instance types to fulfill On-Demand capacity.
   *
   * The only valid value is prioritized,
   * which is also the default value.
   *
   * Default: OnDemandAllocationStrategy.PRIORITIZED
   */
  public fun onDemandAllocationStrategy(): OnDemandAllocationStrategy? =
      unwrap(this).getOnDemandAllocationStrategy()?.let(OnDemandAllocationStrategy::wrap)

  /**
   * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand
   * Instances.
   *
   * This
   * base portion is provisioned first as your group scales. Defaults to 0 if not specified. If you
   * specify weights
   * for the instance types in the overrides, set the value of OnDemandBaseCapacity in terms of the
   * number of
   * capacity units, and not the number of instances.
   *
   * Default: 0
   */
  public fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

  /**
   * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity
   * beyond OnDemandBaseCapacity.
   *
   * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot Instances).
   * Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
   *
   * Default: 100
   */
  public fun onDemandPercentageAboveBaseCapacity(): Number? =
      unwrap(this).getOnDemandPercentageAboveBaseCapacity()

  /**
   * If the allocation strategy is lowest-price, the Auto Scaling group launches instances using the
   * Spot pools with the lowest price, and evenly allocates your instances across the number of Spot
   * pools that you specify.
   *
   * Defaults to
   * lowest-price if not specified.
   *
   * If the allocation strategy is capacity-optimized (recommended), the Auto Scaling group launches
   * instances using Spot
   * pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
   * use capacity-optimized-prioritized
   * and set the order of instance types in the list of launch template overrides from highest to
   * lowest priority
   * (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities
   * on a best-effort basis but
   * optimizes for capacity first.
   *
   * Default: SpotAllocationStrategy.LOWEST_PRICE
   */
  public fun spotAllocationStrategy(): SpotAllocationStrategy? =
      unwrap(this).getSpotAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

  /**
   * The number of Spot Instance pools to use to allocate your Spot capacity.
   *
   * The Spot pools are determined from the different instance
   * types in the overrides. Valid only when the Spot allocation strategy is lowest-price. Value
   * must be in the range of 1 to 20.
   * Defaults to 2 if not specified.
   *
   * Default: 2
   */
  public fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

  /**
   * The maximum price per unit hour that you are willing to pay for a Spot Instance.
   *
   * If you leave the value at its default (empty),
   * Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
   * that you previously set, include
   * the property but specify an empty string ("") for the value.
   *
   * Default: "" - On-Demand price
   */
  public fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()

  /**
   * A builder for [InstancesDistribution]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param onDemandAllocationStrategy Indicates how to allocate instance types to fulfill
     * On-Demand capacity.
     * The only valid value is prioritized,
     * which is also the default value.
     */
    public fun onDemandAllocationStrategy(onDemandAllocationStrategy: OnDemandAllocationStrategy)

    /**
     * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group's capacity that must
     * be fulfilled by On-Demand Instances.
     * This
     * base portion is provisioned first as your group scales. Defaults to 0 if not specified. If
     * you specify weights
     * for the instance types in the overrides, set the value of OnDemandBaseCapacity in terms of
     * the number of
     * capacity units, and not the number of instances.
     */
    public fun onDemandBaseCapacity(onDemandBaseCapacity: Number)

    /**
     * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances
     * and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
     * Instances).
     * Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     */
    public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number)

    /**
     * @param spotAllocationStrategy If the allocation strategy is lowest-price, the Auto Scaling
     * group launches instances using the Spot pools with the lowest price, and evenly allocates your
     * instances across the number of Spot pools that you specify.
     * Defaults to
     * lowest-price if not specified.
     *
     * If the allocation strategy is capacity-optimized (recommended), the Auto Scaling group
     * launches instances using Spot
     * pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use capacity-optimized-prioritized
     * and set the order of instance types in the list of launch template overrides from highest to
     * lowest priority
     * (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities
     * on a best-effort basis but
     * optimizes for capacity first.
     */
    public fun spotAllocationStrategy(spotAllocationStrategy: SpotAllocationStrategy)

    /**
     * @param spotInstancePools The number of Spot Instance pools to use to allocate your Spot
     * capacity.
     * The Spot pools are determined from the different instance
     * types in the overrides. Valid only when the Spot allocation strategy is lowest-price. Value
     * must be in the range of 1 to 20.
     * Defaults to 2 if not specified.
     */
    public fun spotInstancePools(spotInstancePools: Number)

    /**
     * @param spotMaxPrice The maximum price per unit hour that you are willing to pay for a Spot
     * Instance.
     * If you leave the value at its default (empty),
     * Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include
     * the property but specify an empty string ("") for the value.
     */
    public fun spotMaxPrice(spotMaxPrice: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.InstancesDistribution.Builder =
        software.amazon.awscdk.services.autoscaling.InstancesDistribution.builder()

    /**
     * @param onDemandAllocationStrategy Indicates how to allocate instance types to fulfill
     * On-Demand capacity.
     * The only valid value is prioritized,
     * which is also the default value.
     */
    override
        fun onDemandAllocationStrategy(onDemandAllocationStrategy: OnDemandAllocationStrategy) {
      cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy.let(OnDemandAllocationStrategy.Companion::unwrap))
    }

    /**
     * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group's capacity that must
     * be fulfilled by On-Demand Instances.
     * This
     * base portion is provisioned first as your group scales. Defaults to 0 if not specified. If
     * you specify weights
     * for the instance types in the overrides, set the value of OnDemandBaseCapacity in terms of
     * the number of
     * capacity units, and not the number of instances.
     */
    override fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
      cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
    }

    /**
     * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances
     * and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
     * Instances).
     * Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     */
    override fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
      cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
    }

    /**
     * @param spotAllocationStrategy If the allocation strategy is lowest-price, the Auto Scaling
     * group launches instances using the Spot pools with the lowest price, and evenly allocates your
     * instances across the number of Spot pools that you specify.
     * Defaults to
     * lowest-price if not specified.
     *
     * If the allocation strategy is capacity-optimized (recommended), the Auto Scaling group
     * launches instances using Spot
     * pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use capacity-optimized-prioritized
     * and set the order of instance types in the list of launch template overrides from highest to
     * lowest priority
     * (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities
     * on a best-effort basis but
     * optimizes for capacity first.
     */
    override fun spotAllocationStrategy(spotAllocationStrategy: SpotAllocationStrategy) {
      cdkBuilder.spotAllocationStrategy(spotAllocationStrategy.let(SpotAllocationStrategy.Companion::unwrap))
    }

    /**
     * @param spotInstancePools The number of Spot Instance pools to use to allocate your Spot
     * capacity.
     * The Spot pools are determined from the different instance
     * types in the overrides. Valid only when the Spot allocation strategy is lowest-price. Value
     * must be in the range of 1 to 20.
     * Defaults to 2 if not specified.
     */
    override fun spotInstancePools(spotInstancePools: Number) {
      cdkBuilder.spotInstancePools(spotInstancePools)
    }

    /**
     * @param spotMaxPrice The maximum price per unit hour that you are willing to pay for a Spot
     * Instance.
     * If you leave the value at its default (empty),
     * Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include
     * the property but specify an empty string ("") for the value.
     */
    override fun spotMaxPrice(spotMaxPrice: String) {
      cdkBuilder.spotMaxPrice(spotMaxPrice)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.InstancesDistribution =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.InstancesDistribution,
  ) : CdkObject(cdkObject),
      InstancesDistribution {
    /**
     * Indicates how to allocate instance types to fulfill On-Demand capacity.
     *
     * The only valid value is prioritized,
     * which is also the default value.
     *
     * Default: OnDemandAllocationStrategy.PRIORITIZED
     */
    override fun onDemandAllocationStrategy(): OnDemandAllocationStrategy? =
        unwrap(this).getOnDemandAllocationStrategy()?.let(OnDemandAllocationStrategy::wrap)

    /**
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand
     * Instances.
     *
     * This
     * base portion is provisioned first as your group scales. Defaults to 0 if not specified. If
     * you specify weights
     * for the instance types in the overrides, set the value of OnDemandBaseCapacity in terms of
     * the number of
     * capacity units, and not the number of instances.
     *
     * Default: 0
     */
    override fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

    /**
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional
     * capacity beyond OnDemandBaseCapacity.
     *
     * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
     * Instances).
     * Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     *
     * Default: 100
     */
    override fun onDemandPercentageAboveBaseCapacity(): Number? =
        unwrap(this).getOnDemandPercentageAboveBaseCapacity()

    /**
     * If the allocation strategy is lowest-price, the Auto Scaling group launches instances using
     * the Spot pools with the lowest price, and evenly allocates your instances across the number of
     * Spot pools that you specify.
     *
     * Defaults to
     * lowest-price if not specified.
     *
     * If the allocation strategy is capacity-optimized (recommended), the Auto Scaling group
     * launches instances using Spot
     * pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use capacity-optimized-prioritized
     * and set the order of instance types in the list of launch template overrides from highest to
     * lowest priority
     * (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities
     * on a best-effort basis but
     * optimizes for capacity first.
     *
     * Default: SpotAllocationStrategy.LOWEST_PRICE
     */
    override fun spotAllocationStrategy(): SpotAllocationStrategy? =
        unwrap(this).getSpotAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

    /**
     * The number of Spot Instance pools to use to allocate your Spot capacity.
     *
     * The Spot pools are determined from the different instance
     * types in the overrides. Valid only when the Spot allocation strategy is lowest-price. Value
     * must be in the range of 1 to 20.
     * Defaults to 2 if not specified.
     *
     * Default: 2
     */
    override fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     *
     * If you leave the value at its default (empty),
     * Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include
     * the property but specify an empty string ("") for the value.
     *
     * Default: "" - On-Demand price
     */
    override fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstancesDistribution {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.InstancesDistribution):
        InstancesDistribution = CdkObjectWrappers.wrap(cdkObject) as? InstancesDistribution ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstancesDistribution):
        software.amazon.awscdk.services.autoscaling.InstancesDistribution = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.InstancesDistribution
  }
}
