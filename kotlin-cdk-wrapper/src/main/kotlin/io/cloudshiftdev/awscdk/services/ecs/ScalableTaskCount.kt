@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseScalableAttribute
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ServiceNamespace
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The scalable attribute representing task count.
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
public open class ScalableTaskCount internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ScalableTaskCount,
) : BaseScalableAttribute(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScalableTaskCountProps,
  ) :
      this(software.amazon.awscdk.services.ecs.ScalableTaskCount(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ScalableTaskCountProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScalableTaskCountProps.Builder.() -> Unit,
  ) : this(scope, id, ScalableTaskCountProps(props)
  )

  /**
   * Scales in or out to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps) {
    unwrap(this).scaleOnCpuUtilization(id, props.let(CpuUtilizationScalingProps::unwrap))
  }

  /**
   * Scales in or out to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b0fe97a66530c8ea82492ef2dba3720faeadcfdd86952e79b387ab72948d5282")
  public open fun scaleOnCpuUtilization(id: String,
      props: CpuUtilizationScalingProps.Builder.() -> Unit): Unit = scaleOnCpuUtilization(id,
      CpuUtilizationScalingProps(props))

  /**
   * Scales in or out to achieve a target memory utilization.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnMemoryUtilization(id: String, props: MemoryUtilizationScalingProps) {
    unwrap(this).scaleOnMemoryUtilization(id, props.let(MemoryUtilizationScalingProps::unwrap))
  }

  /**
   * Scales in or out to achieve a target memory utilization.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8fe81b9af4c74db1cfc1c70faf2860537e846c4252987bb4714f9c4624d1ccb6")
  public open fun scaleOnMemoryUtilization(id: String,
      props: MemoryUtilizationScalingProps.Builder.() -> Unit): Unit = scaleOnMemoryUtilization(id,
      MemoryUtilizationScalingProps(props))

  /**
   * Scales in or out based on a specified metric value.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps) {
    unwrap(this).scaleOnMetric(id, props.let(BasicStepScalingPolicyProps::unwrap))
  }

  /**
   * Scales in or out based on a specified metric value.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e74f42e2518084224b460cbad881860ea72b6ab3faa1091feca53f8977d619a")
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      Unit = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

  /**
   * Scales in or out to achieve a target Application Load Balancer request count per target.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnRequestCount(id: String, props: RequestCountScalingProps) {
    unwrap(this).scaleOnRequestCount(id, props.let(RequestCountScalingProps::unwrap))
  }

  /**
   * Scales in or out to achieve a target Application Load Balancer request count per target.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43eb0eba83107b69f66929703c7efc34bb018c9e8db893dec0247e8eccb5cced")
  public open fun scaleOnRequestCount(id: String,
      props: RequestCountScalingProps.Builder.() -> Unit): Unit = scaleOnRequestCount(id,
      RequestCountScalingProps(props))

  /**
   * Scales in or out based on a specified scheduled time.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnSchedule(id: String, props: ScalingSchedule) {
    unwrap(this).scaleOnSchedule(id, props.let(ScalingSchedule::unwrap))
  }

  /**
   * Scales in or out based on a specified scheduled time.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public open fun scaleOnSchedule(id: String, props: ScalingSchedule.Builder.() -> Unit): Unit =
      scaleOnSchedule(id, ScalingSchedule(props))

  /**
   * Scales in or out to achieve a target on a custom metric.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleToTrackCustomMetric(id: String, props: TrackCustomMetricProps) {
    unwrap(this).scaleToTrackCustomMetric(id, props.let(TrackCustomMetricProps::unwrap))
  }

  /**
   * Scales in or out to achieve a target on a custom metric.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f166d7a55dc654ba9669472e8bc6582b8727f77398e93ab0a297d7cd17a46f07")
  public open fun scaleToTrackCustomMetric(id: String,
      props: TrackCustomMetricProps.Builder.() -> Unit): Unit = scaleToTrackCustomMetric(id,
      TrackCustomMetricProps(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.ScalableTaskCount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Scalable dimension of the attribute.
     *
     * @param dimension Scalable dimension of the attribute. 
     */
    public fun dimension(dimension: String)

    /**
     * Maximum capacity to scale to.
     *
     * @param maxCapacity Maximum capacity to scale to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     *
     * @param minCapacity Minimum capacity to scale to. 
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * Resource ID of the attribute.
     *
     * @param resourceId Resource ID of the attribute. 
     */
    public fun resourceId(resourceId: String)

    /**
     * Role to use for scaling.
     *
     * @param role Role to use for scaling. 
     */
    public fun role(role: IRole)

    /**
     * Service namespace of the scalable attribute.
     *
     * @param serviceNamespace Service namespace of the scalable attribute. 
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ScalableTaskCount.Builder =
        software.amazon.awscdk.services.ecs.ScalableTaskCount.Builder.create(scope, id)

    /**
     * Scalable dimension of the attribute.
     *
     * @param dimension Scalable dimension of the attribute. 
     */
    override fun dimension(dimension: String) {
      cdkBuilder.dimension(dimension)
    }

    /**
     * Maximum capacity to scale to.
     *
     * @param maxCapacity Maximum capacity to scale to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * Minimum capacity to scale to.
     *
     * Default: 1
     *
     * @param minCapacity Minimum capacity to scale to. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * Resource ID of the attribute.
     *
     * @param resourceId Resource ID of the attribute. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * Role to use for scaling.
     *
     * @param role Role to use for scaling. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * Service namespace of the scalable attribute.
     *
     * @param serviceNamespace Service namespace of the scalable attribute. 
     */
    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ScalableTaskCount = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScalableTaskCount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScalableTaskCount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ScalableTaskCount):
        ScalableTaskCount = ScalableTaskCount(cdkObject)

    internal fun unwrap(wrapped: ScalableTaskCount):
        software.amazon.awscdk.services.ecs.ScalableTaskCount = wrapped.cdkObject
  }
}
