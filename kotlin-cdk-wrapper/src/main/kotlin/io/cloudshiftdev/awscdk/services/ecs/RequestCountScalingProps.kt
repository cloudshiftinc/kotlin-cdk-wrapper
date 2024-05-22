@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The properties for enabling scaling based on Application Load Balancer (ALB) request counts.
 *
 * Example:
 *
 * ```
 * ApplicationTargetGroup target;
 * BaseService service;
 * ScalableTaskCount scaling =
 * service.autoScaleTaskCount(EnableScalingProps.builder().maxCapacity(10).build());
 * scaling.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
 * .targetUtilizationPercent(50)
 * .build());
 * scaling.scaleOnRequestCount("RequestScaling", RequestCountScalingProps.builder()
 * .requestsPerTarget(10000)
 * .targetGroup(target)
 * .build());
 * ```
 */
public interface RequestCountScalingProps : BaseTargetTrackingProps {
  /**
   * The number of ALB requests per target.
   */
  public fun requestsPerTarget(): Number

  /**
   * The ALB target group name.
   */
  public fun targetGroup(): ApplicationTargetGroup

  /**
   * A builder for [RequestCountScalingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String)

    /**
     * @param requestsPerTarget The number of ALB requests per target. 
     */
    public fun requestsPerTarget(requestsPerTarget: Number)

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration)

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    /**
     * @param targetGroup The ALB target group name. 
     */
    public fun targetGroup(targetGroup: ApplicationTargetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder =
        software.amazon.awscdk.services.ecs.RequestCountScalingProps.builder()

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param policyName A name for the scaling policy.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param requestsPerTarget The number of ALB requests per target. 
     */
    override fun requestsPerTarget(requestsPerTarget: Number) {
      cdkBuilder.requestsPerTarget(requestsPerTarget)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param targetGroup The ALB target group name. 
     */
    override fun targetGroup(targetGroup: ApplicationTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(ApplicationTargetGroup.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RequestCountScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.RequestCountScalingProps,
  ) : CdkObject(cdkObject), RequestCountScalingProps {
    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * The number of ALB requests per target.
     */
    override fun requestsPerTarget(): Number = unwrap(this).getRequestsPerTarget()

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    /**
     * The ALB target group name.
     */
    override fun targetGroup(): ApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestCountScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RequestCountScalingProps):
        RequestCountScalingProps = CdkObjectWrappers.wrap(cdkObject) as? RequestCountScalingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestCountScalingProps):
        software.amazon.awscdk.services.ecs.RequestCountScalingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.RequestCountScalingProps
  }
}
