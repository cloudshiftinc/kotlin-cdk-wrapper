package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseScalableAttribute
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ServiceNamespace
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScalableTaskCount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ScalableTaskCount,
) : BaseScalableAttribute(cdkObject) {
  public open fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps) {
    unwrap(this).scaleOnCpuUtilization(id, props.let(CpuUtilizationScalingProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b0fe97a66530c8ea82492ef2dba3720faeadcfdd86952e79b387ab72948d5282")
  public open fun scaleOnCpuUtilization(id: String,
      props: CpuUtilizationScalingProps.Builder.() -> Unit): Unit = scaleOnCpuUtilization(id,
      CpuUtilizationScalingProps(props))

  public open fun scaleOnMemoryUtilization(id: String, props: MemoryUtilizationScalingProps) {
    unwrap(this).scaleOnMemoryUtilization(id, props.let(MemoryUtilizationScalingProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8fe81b9af4c74db1cfc1c70faf2860537e846c4252987bb4714f9c4624d1ccb6")
  public open fun scaleOnMemoryUtilization(id: String,
      props: MemoryUtilizationScalingProps.Builder.() -> Unit): Unit = scaleOnMemoryUtilization(id,
      MemoryUtilizationScalingProps(props))

  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps) {
    unwrap(this).scaleOnMetric(id, props.let(BasicStepScalingPolicyProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e74f42e2518084224b460cbad881860ea72b6ab3faa1091feca53f8977d619a")
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      Unit = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

  public open fun scaleOnRequestCount(id: String, props: RequestCountScalingProps) {
    unwrap(this).scaleOnRequestCount(id, props.let(RequestCountScalingProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43eb0eba83107b69f66929703c7efc34bb018c9e8db893dec0247e8eccb5cced")
  public open fun scaleOnRequestCount(id: String,
      props: RequestCountScalingProps.Builder.() -> Unit): Unit = scaleOnRequestCount(id,
      RequestCountScalingProps(props))

  public open fun scaleOnSchedule(id: String, props: ScalingSchedule) {
    unwrap(this).scaleOnSchedule(id, props.let(ScalingSchedule::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public open fun scaleOnSchedule(id: String, props: ScalingSchedule.Builder.() -> Unit): Unit =
      scaleOnSchedule(id, ScalingSchedule(props))

  public open fun scaleToTrackCustomMetric(id: String, props: TrackCustomMetricProps) {
    unwrap(this).scaleToTrackCustomMetric(id, props.let(TrackCustomMetricProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f166d7a55dc654ba9669472e8bc6582b8727f77398e93ab0a297d7cd17a46f07")
  public open fun scaleToTrackCustomMetric(id: String,
      props: TrackCustomMetricProps.Builder.() -> Unit): Unit = scaleToTrackCustomMetric(id,
      TrackCustomMetricProps(props))

  public interface Builder {
    public fun dimension(dimension: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun resourceId(resourceId: String)

    public fun role(role: IRole)

    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ScalableTaskCount.Builder =
        software.amazon.awscdk.services.ecs.ScalableTaskCount.Builder.create(scope, id)

    override fun dimension(dimension: String) {
      cdkBuilder.dimension(dimension)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ScalableTaskCount = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
