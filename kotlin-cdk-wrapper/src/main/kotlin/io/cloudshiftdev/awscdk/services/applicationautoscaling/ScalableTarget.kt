@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScalableTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.ScalableTarget,
) : Resource(cdkObject), IScalableTarget {
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public override fun scalableTargetId(): String = unwrap(this).getScalableTargetId()

  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps): StepScalingPolicy =
      unwrap(this).scaleOnMetric(id,
      props.let(BasicStepScalingPolicyProps::unwrap)).let(StepScalingPolicy::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("193d1ed3a5b25b3149e2c4067608c34da946c05963716db27c25dc573465ce60")
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      StepScalingPolicy = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

  public open fun scaleOnSchedule(id: String, action: ScalingSchedule) {
    unwrap(this).scaleOnSchedule(id, action.let(ScalingSchedule::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public open fun scaleOnSchedule(id: String, action: ScalingSchedule.Builder.() -> Unit): Unit =
      scaleOnSchedule(id, ScalingSchedule(action))

  public open fun scaleToTrackMetric(id: String, props: BasicTargetTrackingScalingPolicyProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleToTrackMetric(id,
      props.let(BasicTargetTrackingScalingPolicyProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc03770438dd3c85834667ceb73e2dd9e0a3151f3d610632fef5e6d4c52c759a")
  public open fun scaleToTrackMetric(id: String,
      props: BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit): TargetTrackingScalingPolicy
      = scaleToTrackMetric(id, BasicTargetTrackingScalingPolicyProps(props))

  @CdkDslMarker
  public interface Builder {
    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun resourceId(resourceId: String)

    public fun role(role: IRole)

    public fun scalableDimension(scalableDimension: String)

    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.Builder.create(scope,
        id)

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

    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalableTarget =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromScalableTargetId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      scalableTargetId: String,
    ): IScalableTarget =
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.fromScalableTargetId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, scalableTargetId).let(IScalableTarget::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScalableTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScalableTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget):
        ScalableTarget = ScalableTarget(cdkObject)

    internal fun unwrap(wrapped: ScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget = wrapped.cdkObject
  }
}
