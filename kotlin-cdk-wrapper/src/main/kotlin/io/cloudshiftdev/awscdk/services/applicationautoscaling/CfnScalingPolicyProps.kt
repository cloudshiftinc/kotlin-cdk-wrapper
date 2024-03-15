@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnScalingPolicyProps {
  public fun policyName(): String

  public fun policyType(): String

  public fun resourceId(): String? = unwrap(this).getResourceId()

  public fun scalableDimension(): String? = unwrap(this).getScalableDimension()

  public fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

  public fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

  public fun stepScalingPolicyConfiguration(): Any? =
      unwrap(this).getStepScalingPolicyConfiguration()

  public fun targetTrackingScalingPolicyConfiguration(): Any? =
      unwrap(this).getTargetTrackingScalingPolicyConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun policyName(policyName: String)

    public fun policyType(policyType: String)

    public fun resourceId(resourceId: String)

    public fun scalableDimension(scalableDimension: String)

    public fun scalingTargetId(scalingTargetId: String)

    public fun serviceNamespace(serviceNamespace: String)

    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable)

    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71fac3959c2671e86a61f305aff57438b0f425b2b8dd9ed953e52f32ed9f0c4b")
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit)

    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc54aad19adc8a5dfa48a678d72440787f5979b0e288efc6b04a7ab37c1c3849")
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.builder()

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    override fun scalingTargetId(scalingTargetId: String) {
      cdkBuilder.scalingTargetId(scalingTargetId)
    }

    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    override fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(IResolvable::unwrap))
    }

    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(CfnScalingPolicy.StepScalingPolicyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71fac3959c2671e86a61f305aff57438b0f425b2b8dd9ed953e52f32ed9f0c4b")
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        stepScalingPolicyConfiguration(CfnScalingPolicy.StepScalingPolicyConfigurationProperty(stepScalingPolicyConfiguration))

    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable::unwrap))
    }

    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc54aad19adc8a5dfa48a678d72440787f5979b0e288efc6b04a7ab37c1c3849")
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingScalingPolicyConfiguration(CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps,
  ) : CdkObject(cdkObject), CfnScalingPolicyProps {
    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun policyType(): String = unwrap(this).getPolicyType()

    override fun resourceId(): String? = unwrap(this).getResourceId()

    override fun scalableDimension(): String? = unwrap(this).getScalableDimension()

    override fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

    override fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

    override fun stepScalingPolicyConfiguration(): Any? =
        unwrap(this).getStepScalingPolicyConfiguration()

    override fun targetTrackingScalingPolicyConfiguration(): Any? =
        unwrap(this).getTargetTrackingScalingPolicyConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps):
        CfnScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
  }
}
