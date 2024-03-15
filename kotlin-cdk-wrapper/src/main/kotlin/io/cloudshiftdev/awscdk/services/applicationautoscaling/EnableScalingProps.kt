@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Properties for enabling Application Auto Scaling.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .desiredCount(1)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .build();
 * ScalableTaskCount scalableTarget =
 * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
 * .minCapacity(1)
 * .maxCapacity(20)
 * .build());
 * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * scalableTarget.scaleOnMemoryUtilization("MemoryScaling", MemoryUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * ```
 */
public interface EnableScalingProps {
  /**
   * Maximum capacity to scale to.
   */
  public fun maxCapacity(): Number

  /**
   * Minimum capacity to scale to.
   *
   * Default: 1
   */
  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  /**
   * A builder for [EnableScalingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity Minimum capacity to scale to.
     */
    public fun minCapacity(minCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.builder()

    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity Minimum capacity to scale to.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps,
  ) : CdkObject(cdkObject), EnableScalingProps {
    /**
     * Maximum capacity to scale to.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnableScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps):
        EnableScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableScalingProps):
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps
  }
}
