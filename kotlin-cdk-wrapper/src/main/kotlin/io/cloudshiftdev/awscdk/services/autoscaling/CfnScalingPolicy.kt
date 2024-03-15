@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScalingPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

  public open fun adjustmentType(`value`: String) {
    unwrap(this).setAdjustmentType(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrPolicyName(): String = unwrap(this).getAttrPolicyName()

  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  public open fun cooldown(): String? = unwrap(this).getCooldown()

  public open fun cooldown(`value`: String) {
    unwrap(this).setCooldown(`value`)
  }

  public open fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

  public open fun estimatedInstanceWarmup(`value`: Number) {
    unwrap(this).setEstimatedInstanceWarmup(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

  public open fun metricAggregationType(`value`: String) {
    unwrap(this).setMetricAggregationType(`value`)
  }

  public open fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  public open fun minAdjustmentMagnitude(`value`: Number) {
    unwrap(this).setMinAdjustmentMagnitude(`value`)
  }

  public open fun policyType(): String? = unwrap(this).getPolicyType()

  public open fun policyType(`value`: String) {
    unwrap(this).setPolicyType(`value`)
  }

  public open fun predictiveScalingConfiguration(): Any? =
      unwrap(this).getPredictiveScalingConfiguration()

  public open fun predictiveScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setPredictiveScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun predictiveScalingConfiguration(`value`: PredictiveScalingConfigurationProperty) {
    unwrap(this).setPredictiveScalingConfiguration(`value`.let(PredictiveScalingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97901d400c2c8ce5d49a4d2ab41c91526242b02cb2aca0abb7e0fefea2ce16a6")
  public open
      fun predictiveScalingConfiguration(`value`: PredictiveScalingConfigurationProperty.Builder.() -> Unit):
      Unit = predictiveScalingConfiguration(PredictiveScalingConfigurationProperty(`value`))

  public open fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

  public open fun scalingAdjustment(`value`: Number) {
    unwrap(this).setScalingAdjustment(`value`)
  }

  public open fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

  public open fun stepAdjustments(`value`: IResolvable) {
    unwrap(this).setStepAdjustments(`value`.let(IResolvable::unwrap))
  }

  public open fun stepAdjustments(__idx_ac66f0: List<Any>) {
    unwrap(this).setStepAdjustments(__idx_ac66f0)
  }

  public open fun stepAdjustments(vararg __idx_ac66f0: Any): Unit =
      stepAdjustments(__idx_ac66f0.toList())

  public open fun targetTrackingConfiguration(): Any? =
      unwrap(this).getTargetTrackingConfiguration()

  public open fun targetTrackingConfiguration(`value`: IResolvable) {
    unwrap(this).setTargetTrackingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun targetTrackingConfiguration(`value`: TargetTrackingConfigurationProperty) {
    unwrap(this).setTargetTrackingConfiguration(`value`.let(TargetTrackingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ab4aa1cee9d8f70aacc692ff6ab507a78ba771cf450147958c30b83f58f180a")
  public open
      fun targetTrackingConfiguration(`value`: TargetTrackingConfigurationProperty.Builder.() -> Unit):
      Unit = targetTrackingConfiguration(TargetTrackingConfigurationProperty(`value`))

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
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df515687985a1b0d75a0c7b985ee0b0e126b753fb4edc1ae20d56f9ece23d6da")
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty.Builder.() -> Unit)

    public fun scalingAdjustment(scalingAdjustment: Number)

    public fun stepAdjustments(stepAdjustments: IResolvable)

    public fun stepAdjustments(stepAdjustments: List<Any>)

    public fun stepAdjustments(vararg stepAdjustments: Any)

    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("724ced6e567fa25d80fb5b723a9a990a7e73ab2b762cb275319b42df5c51f868")
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.Builder.create(scope, id)

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
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(PredictiveScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df515687985a1b0d75a0c7b985ee0b0e126b753fb4edc1ae20d56f9ece23d6da")
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        predictiveScalingConfiguration(PredictiveScalingConfigurationProperty(predictiveScalingConfiguration))

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
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(TargetTrackingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("724ced6e567fa25d80fb5b723a9a990a7e73ab2b762cb275319b42df5c51f868")
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingConfiguration(TargetTrackingConfigurationProperty(targetTrackingConfiguration))

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy):
        CfnScalingPolicy = CfnScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicy):
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy = wrapped.cdkObject
  }

  public interface PredefinedMetricSpecificationProperty {
    public fun predefinedMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    @CdkDslMarker
    public interface Builder {
      public fun predefinedMetricType(predefinedMetricType: String)

      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder()

      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), PredefinedMetricSpecificationProperty {
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty):
          PredefinedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingConfigurationProperty {
    public fun maxCapacityBreachBehavior(): String? = unwrap(this).getMaxCapacityBreachBehavior()

    public fun maxCapacityBuffer(): Number? = unwrap(this).getMaxCapacityBuffer()

    public fun metricSpecifications(): Any

    public fun mode(): String? = unwrap(this).getMode()

    public fun schedulingBufferTime(): Number? = unwrap(this).getSchedulingBufferTime()

    @CdkDslMarker
    public interface Builder {
      public fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String)

      public fun maxCapacityBuffer(maxCapacityBuffer: Number)

      public fun metricSpecifications(metricSpecifications: IResolvable)

      public fun metricSpecifications(metricSpecifications: List<Any>)

      public fun metricSpecifications(vararg metricSpecifications: Any)

      public fun mode(mode: String)

      public fun schedulingBufferTime(schedulingBufferTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.builder()

      override fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String) {
        cdkBuilder.maxCapacityBreachBehavior(maxCapacityBreachBehavior)
      }

      override fun maxCapacityBuffer(maxCapacityBuffer: Number) {
        cdkBuilder.maxCapacityBuffer(maxCapacityBuffer)
      }

      override fun metricSpecifications(metricSpecifications: IResolvable) {
        cdkBuilder.metricSpecifications(metricSpecifications.let(IResolvable::unwrap))
      }

      override fun metricSpecifications(metricSpecifications: List<Any>) {
        cdkBuilder.metricSpecifications(metricSpecifications)
      }

      override fun metricSpecifications(vararg metricSpecifications: Any): Unit =
          metricSpecifications(metricSpecifications.toList())

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun schedulingBufferTime(schedulingBufferTime: Number) {
        cdkBuilder.schedulingBufferTime(schedulingBufferTime)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty,
    ) : CdkObject(cdkObject), PredictiveScalingConfigurationProperty {
      override fun maxCapacityBreachBehavior(): String? =
          unwrap(this).getMaxCapacityBreachBehavior()

      override fun maxCapacityBuffer(): Number? = unwrap(this).getMaxCapacityBuffer()

      override fun metricSpecifications(): Any = unwrap(this).getMetricSpecifications()

      override fun mode(): String? = unwrap(this).getMode()

      override fun schedulingBufferTime(): Number? = unwrap(this).getSchedulingBufferTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty):
          PredictiveScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingConfigurationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
    }
  }

  public interface MetricProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun namespace(): String

    @CdkDslMarker
    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty.Builder =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty,
    ) : CdkObject(cdkObject), MetricProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty
    }
  }

  public interface PredictiveScalingPredefinedLoadMetricProperty {
    public fun predefinedMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    @CdkDslMarker
    public interface Builder {
      public fun predefinedMetricType(predefinedMetricType: String)

      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.builder()

      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedLoadMetricProperty {
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedLoadMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty):
          PredictiveScalingPredefinedLoadMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedLoadMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
    }
  }

  public interface TargetTrackingConfigurationProperty {
    public fun customizedMetricSpecification(): Any? =
        unwrap(this).getCustomizedMetricSpecification()

    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    public fun predefinedMetricSpecification(): Any? =
        unwrap(this).getPredefinedMetricSpecification()

    public fun targetValue(): Number

    @CdkDslMarker
    public interface Builder {
      public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable)

      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83dd031259827e7824397d7cebd1c1b86c5ebb6853125782ef749e24dc2a8873")
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit)

      public fun disableScaleIn(disableScaleIn: Boolean)

      public fun disableScaleIn(disableScaleIn: IResolvable)

      public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable)

      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e88284f33083fc80bec682feb058834859f43bacfa566a36af4b217680ddb7")
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit)

      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.builder()

      override fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(CustomizedMetricSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83dd031259827e7824397d7cebd1c1b86c5ebb6853125782ef749e24dc2a8873")
      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          customizedMetricSpecification(CustomizedMetricSpecificationProperty(customizedMetricSpecification))

      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
      }

      override fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(PredefinedMetricSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e88284f33083fc80bec682feb058834859f43bacfa566a36af4b217680ddb7")
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricSpecification(PredefinedMetricSpecificationProperty(predefinedMetricSpecification))

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty,
    ) : CdkObject(cdkObject), TargetTrackingConfigurationProperty {
      override fun customizedMetricSpecification(): Any? =
          unwrap(this).getCustomizedMetricSpecification()

      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      override fun predefinedMetricSpecification(): Any? =
          unwrap(this).getPredefinedMetricSpecification()

      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty):
          TargetTrackingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingConfigurationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
    }
  }

  public interface MetricStatProperty {
    public fun metric(): Any

    public fun stat(): String

    public fun unit(): String? = unwrap(this).getUnit()

    @CdkDslMarker
    public interface Builder {
      public fun metric(metric: IResolvable)

      public fun metric(metric: MetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02e2e53201330f186b1c6d129c240294222496d09fb3c522376d60fa73d64964")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      public fun stat(stat: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty.Builder =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty.builder()

      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02e2e53201330f186b1c6d129c240294222496d09fb3c522376d60fa73d64964")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty,
    ) : CdkObject(cdkObject), MetricStatProperty {
      override fun metric(): Any = unwrap(this).getMetric()

      override fun stat(): String = unwrap(this).getStat()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty):
          MetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty
    }
  }

  public interface StepAdjustmentProperty {
    public fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

    public fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

    public fun scalingAdjustment(): Number

    @CdkDslMarker
    public interface Builder {
      public fun metricIntervalLowerBound(metricIntervalLowerBound: Number)

      public fun metricIntervalUpperBound(metricIntervalUpperBound: Number)

      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.builder()

      override fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
        cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
      }

      override fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
        cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
      }

      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty,
    ) : CdkObject(cdkObject), StepAdjustmentProperty {
      override fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

      override fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepAdjustmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty):
          StepAdjustmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepAdjustmentProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty
    }
  }

  public interface PredictiveScalingPredefinedScalingMetricProperty {
    public fun predefinedMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    @CdkDslMarker
    public interface Builder {
      public fun predefinedMetricType(predefinedMetricType: String)

      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.builder()

      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedScalingMetricProperty {
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedScalingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty):
          PredictiveScalingPredefinedScalingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedScalingMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
    }
  }

  public interface PredictiveScalingCustomizedCapacityMetricProperty {
    public fun metricDataQueries(): Any

    @CdkDslMarker
    public interface Builder {
      public fun metricDataQueries(metricDataQueries: IResolvable)

      public fun metricDataQueries(metricDataQueries: List<Any>)

      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.builder()

      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedCapacityMetricProperty {
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedCapacityMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty):
          PredictiveScalingCustomizedCapacityMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedCapacityMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
    }
  }

  public interface PredictiveScalingMetricSpecificationProperty {
    public fun customizedCapacityMetricSpecification(): Any? =
        unwrap(this).getCustomizedCapacityMetricSpecification()

    public fun customizedLoadMetricSpecification(): Any? =
        unwrap(this).getCustomizedLoadMetricSpecification()

    public fun customizedScalingMetricSpecification(): Any? =
        unwrap(this).getCustomizedScalingMetricSpecification()

    public fun predefinedLoadMetricSpecification(): Any? =
        unwrap(this).getPredefinedLoadMetricSpecification()

    public fun predefinedMetricPairSpecification(): Any? =
        unwrap(this).getPredefinedMetricPairSpecification()

    public fun predefinedScalingMetricSpecification(): Any? =
        unwrap(this).getPredefinedScalingMetricSpecification()

    public fun targetValue(): Number

    @CdkDslMarker
    public interface Builder {
      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable)

      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576825e68ad5c44bf88fbc5865ff958e76c17dfcb07ffe704e92d3e00535a5da")
      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty.Builder.() -> Unit)

      public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable)

      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c43aaf6eba755c957c78045e5a3615cdbaab0b207ed862c19dfdc2db186a0680")
      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit)

      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable)

      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc0decdd0c5a06475fdec6a82987d218c1ab1dcbfdb4d137a053f6414f359af")
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty.Builder.() -> Unit)

      public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable)

      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4be592dea838fd0cf6431d144f8e90aeec0ebce2f64591cd563ff1b8f1c6f")
      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty.Builder.() -> Unit)

      public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable)

      public
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd9691cb9834b6e49475da172e8452248c66494e725217bddac0c76b041f89af")
      public
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty.Builder.() -> Unit)

      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable)

      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6af039d4f8ed0dd8a79430c288494b7aea540bf320cd40247f8ba956c924827")
      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty.Builder.() -> Unit)

      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder()

      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification.let(PredictiveScalingCustomizedCapacityMetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576825e68ad5c44bf88fbc5865ff958e76c17dfcb07ffe704e92d3e00535a5da")
      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty.Builder.() -> Unit):
          Unit =
          customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty(customizedCapacityMetricSpecification))

      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(PredictiveScalingCustomizedLoadMetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c43aaf6eba755c957c78045e5a3615cdbaab0b207ed862c19dfdc2db186a0680")
      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit):
          Unit =
          customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty(customizedLoadMetricSpecification))

      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(PredictiveScalingCustomizedScalingMetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc0decdd0c5a06475fdec6a82987d218c1ab1dcbfdb4d137a053f6414f359af")
      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty.Builder.() -> Unit):
          Unit =
          customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty(customizedScalingMetricSpecification))

      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(PredictiveScalingPredefinedLoadMetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4be592dea838fd0cf6431d144f8e90aeec0ebce2f64591cd563ff1b8f1c6f")
      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty.Builder.() -> Unit):
          Unit =
          predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty(predefinedLoadMetricSpecification))

      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification.let(IResolvable::unwrap))
      }

      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification.let(PredictiveScalingPredefinedMetricPairProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd9691cb9834b6e49475da172e8452248c66494e725217bddac0c76b041f89af")
      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty(predefinedMetricPairSpecification))

      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(PredictiveScalingPredefinedScalingMetricProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6af039d4f8ed0dd8a79430c288494b7aea540bf320cd40247f8ba956c924827")
      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty.Builder.() -> Unit):
          Unit =
          predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty(predefinedScalingMetricSpecification))

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty,
    ) : CdkObject(cdkObject), PredictiveScalingMetricSpecificationProperty {
      override fun customizedCapacityMetricSpecification(): Any? =
          unwrap(this).getCustomizedCapacityMetricSpecification()

      override fun customizedLoadMetricSpecification(): Any? =
          unwrap(this).getCustomizedLoadMetricSpecification()

      override fun customizedScalingMetricSpecification(): Any? =
          unwrap(this).getCustomizedScalingMetricSpecification()

      override fun predefinedLoadMetricSpecification(): Any? =
          unwrap(this).getPredefinedLoadMetricSpecification()

      override fun predefinedMetricPairSpecification(): Any? =
          unwrap(this).getPredefinedMetricPairSpecification()

      override fun predefinedScalingMetricSpecification(): Any? =
          unwrap(this).getPredefinedScalingMetricSpecification()

      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty):
          PredictiveScalingMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingCustomizedLoadMetricProperty {
    public fun metricDataQueries(): Any

    @CdkDslMarker
    public interface Builder {
      public fun metricDataQueries(metricDataQueries: IResolvable)

      public fun metricDataQueries(metricDataQueries: List<Any>)

      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.builder()

      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedLoadMetricProperty {
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedLoadMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty):
          PredictiveScalingCustomizedLoadMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedLoadMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
    }
  }

  public interface PredictiveScalingPredefinedMetricPairProperty {
    public fun predefinedMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    @CdkDslMarker
    public interface Builder {
      public fun predefinedMetricType(predefinedMetricType: String)

      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.builder()

      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedMetricPairProperty {
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedMetricPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty):
          PredictiveScalingPredefinedMetricPairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedMetricPairProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
    }
  }

  public interface MetricDataQueryProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun id(): String

    public fun label(): String? = unwrap(this).getLabel()

    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    public fun returnData(): Any? = unwrap(this).getReturnData()

    @CdkDslMarker
    public interface Builder {
      public fun expression(expression: String)

      public fun id(id: String)

      public fun label(label: String)

      public fun metricStat(metricStat: IResolvable)

      public fun metricStat(metricStat: MetricStatProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad7379b19e59aad13eae5a77bc24a5686a03816ddbcf207d55a39aac5ecbc5e")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

      public fun returnData(returnData: Boolean)

      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable::unwrap))
      }

      override fun metricStat(metricStat: MetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(MetricStatProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad7379b19e59aad13eae5a77bc24a5686a03816ddbcf207d55a39aac5ecbc5e")
      override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty,
    ) : CdkObject(cdkObject), MetricDataQueryProperty {
      override fun expression(): String? = unwrap(this).getExpression()

      override fun id(): String = unwrap(this).getId()

      override fun label(): String? = unwrap(this).getLabel()

      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty):
          MetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty
    }
  }

  public interface CustomizedMetricSpecificationProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun namespace(): String

    public fun statistic(): String

    public fun unit(): String? = unwrap(this).getUnit()

    @CdkDslMarker
    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)

      public fun statistic(statistic: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), CustomizedMetricSpecificationProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String = unwrap(this).getNamespace()

      override fun statistic(): String = unwrap(this).getStatistic()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty):
          CustomizedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingCustomizedScalingMetricProperty {
    public fun metricDataQueries(): Any

    @CdkDslMarker
    public interface Builder {
      public fun metricDataQueries(metricDataQueries: IResolvable)

      public fun metricDataQueries(metricDataQueries: List<Any>)

      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.builder()

      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedScalingMetricProperty {
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedScalingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty):
          PredictiveScalingCustomizedScalingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedScalingMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
    }
  }

  public interface MetricDimensionProperty {
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty
    }
  }
}
