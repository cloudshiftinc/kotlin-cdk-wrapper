@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScalingPolicyProps {
  public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

  public fun autoScalingGroupName(): String

  public fun cooldown(): String? = unwrap(this).getCooldown()

  public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

  public fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

  public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  public fun policyType(): String? = unwrap(this).getPolicyType()

  public fun predictiveScalingConfiguration(): Any? =
      unwrap(this).getPredictiveScalingConfiguration()

  public fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

  public fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

  public fun targetTrackingConfiguration(): Any? = unwrap(this).getTargetTrackingConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun adjustmentType(adjustmentType: String)

    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun cooldown(cooldown: String)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

    public fun metricAggregationType(metricAggregationType: String)

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    public fun policyType(policyType: String)

    public fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable)

    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab94936888fe70631b90b42e78e604c81cf705303f9135f846552afef85e6452")
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder.() -> Unit)

    public fun scalingAdjustment(scalingAdjustment: Number)

    public fun stepAdjustments(stepAdjustments: IResolvable)

    public fun stepAdjustments(stepAdjustments: List<Any>)

    public fun stepAdjustments(vararg stepAdjustments: Any)

    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7fc8a719a21938b06d0cbe381769126e7e6c3611c0a8f3f8c0e28042755a89")
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.builder()

    override fun adjustmentType(adjustmentType: String) {
      cdkBuilder.adjustmentType(adjustmentType)
    }

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    override fun metricAggregationType(metricAggregationType: String) {
      cdkBuilder.metricAggregationType(metricAggregationType)
    }

    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    override fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(CfnScalingPolicy.PredictiveScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab94936888fe70631b90b42e78e604c81cf705303f9135f846552afef85e6452")
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        predictiveScalingConfiguration(CfnScalingPolicy.PredictiveScalingConfigurationProperty(predictiveScalingConfiguration))

    override fun scalingAdjustment(scalingAdjustment: Number) {
      cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    override fun stepAdjustments(stepAdjustments: IResolvable) {
      cdkBuilder.stepAdjustments(stepAdjustments.let(IResolvable::unwrap))
    }

    override fun stepAdjustments(stepAdjustments: List<Any>) {
      cdkBuilder.stepAdjustments(stepAdjustments)
    }

    override fun stepAdjustments(vararg stepAdjustments: Any): Unit =
        stepAdjustments(stepAdjustments.toList())

    override fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(CfnScalingPolicy.TargetTrackingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7fc8a719a21938b06d0cbe381769126e7e6c3611c0a8f3f8c0e28042755a89")
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingConfiguration(CfnScalingPolicy.TargetTrackingConfigurationProperty(targetTrackingConfiguration))

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps,
  ) : CdkObject(cdkObject), CfnScalingPolicyProps {
    override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    override fun cooldown(): String? = unwrap(this).getCooldown()

    override fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

    override fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

    override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    override fun policyType(): String? = unwrap(this).getPolicyType()

    override fun predictiveScalingConfiguration(): Any? =
        unwrap(this).getPredictiveScalingConfiguration()

    override fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

    override fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

    override fun targetTrackingConfiguration(): Any? = unwrap(this).getTargetTrackingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps):
        CfnScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps
  }
}
