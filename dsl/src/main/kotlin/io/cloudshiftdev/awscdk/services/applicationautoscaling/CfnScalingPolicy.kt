package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScalingPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyName(): String = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  public open fun policyType(): String = unwrap(this).getPolicyType()

  public open fun policyType(`value`: String) {
    unwrap(this).setPolicyType(`value`)
  }

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun scalableDimension(): String? = unwrap(this).getScalableDimension()

  public open fun scalableDimension(`value`: String) {
    unwrap(this).setScalableDimension(`value`)
  }

  public open fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

  public open fun scalingTargetId(`value`: String) {
    unwrap(this).setScalingTargetId(`value`)
  }

  public open fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

  public open fun serviceNamespace(`value`: String) {
    unwrap(this).setServiceNamespace(`value`)
  }

  public open fun stepScalingPolicyConfiguration(): Any? =
      unwrap(this).getStepScalingPolicyConfiguration()

  public open fun stepScalingPolicyConfiguration(`value`: IResolvable) {
    unwrap(this).setStepScalingPolicyConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun stepScalingPolicyConfiguration(`value`: StepScalingPolicyConfigurationProperty) {
    unwrap(this).setStepScalingPolicyConfiguration(`value`.let(StepScalingPolicyConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2df0af46892172e27dec0b892edddd5997339da20decaa56018eea5abeb90f6c")
  public open
      fun stepScalingPolicyConfiguration(`value`: StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
      Unit = stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty(`value`))

  public open fun targetTrackingScalingPolicyConfiguration(): Any? =
      unwrap(this).getTargetTrackingScalingPolicyConfiguration()

  public open fun targetTrackingScalingPolicyConfiguration(`value`: IResolvable) {
    unwrap(this).setTargetTrackingScalingPolicyConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun targetTrackingScalingPolicyConfiguration(`value`: TargetTrackingScalingPolicyConfigurationProperty) {
    unwrap(this).setTargetTrackingScalingPolicyConfiguration(`value`.let(TargetTrackingScalingPolicyConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74ed5148a1eadf12fcbce08abc20a4d1a727bbdd42219b76e6deac4420c304ef")
  public open
      fun targetTrackingScalingPolicyConfiguration(`value`: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
      Unit =
      targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(`value`))

  public interface Builder {
    public fun policyName(policyName: String)

    public fun policyType(policyType: String)

    public fun resourceId(resourceId: String)

    public fun scalableDimension(scalableDimension: String)

    public fun scalingTargetId(scalingTargetId: String)

    public fun serviceNamespace(serviceNamespace: String)

    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable)

    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4233461c421591e47c223b679b39f21d2831ceb9981e55c0db6210e958ba422")
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty.Builder.() -> Unit)

    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bb01833b031a51b7934bf5f38185ed693f8bf70cbf1dc28a15524df83ee436b")
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.Builder.create(scope,
        id)

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
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(StepScalingPolicyConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4233461c421591e47c223b679b39f21d2831ceb9981e55c0db6210e958ba422")
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty(stepScalingPolicyConfiguration))

    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable::unwrap))
    }

    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bb01833b031a51b7934bf5f38185ed693f8bf70cbf1dc28a15524df83ee436b")
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalingPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy):
        CfnScalingPolicy = CfnScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicy):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy = wrapped.cdkObject
  }

  public interface PredefinedMetricSpecificationProperty {
    public fun predefinedMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    public interface Builder {
      public fun predefinedMetricType(predefinedMetricType: String)

      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder()

      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty,
    ) : PredefinedMetricSpecificationProperty {
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty):
          PredefinedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedMetricSpecificationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingMetricStatProperty {
    public fun metric(): Any? = unwrap(this).getMetric()

    public fun stat(): String? = unwrap(this).getStat()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun metric(metric: IResolvable)

      public fun metric(metric: TargetTrackingMetricProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a4e1aa6ba488e4ff61ccab0feebf5b3aadf6fb5a9a2d56771735f9dcdfed9")
      public fun metric(metric: TargetTrackingMetricProperty.Builder.() -> Unit)

      public fun stat(stat: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty.builder()

      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      override fun metric(metric: TargetTrackingMetricProperty) {
        cdkBuilder.metric(metric.let(TargetTrackingMetricProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a4e1aa6ba488e4ff61ccab0feebf5b3aadf6fb5a9a2d56771735f9dcdfed9")
      override fun metric(metric: TargetTrackingMetricProperty.Builder.() -> Unit): Unit =
          metric(TargetTrackingMetricProperty(metric))

      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty,
    ) : TargetTrackingMetricStatProperty {
      override fun metric(): Any? = unwrap(this).getMetric()

      override fun stat(): String? = unwrap(this).getStat()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingMetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty):
          TargetTrackingMetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricStatProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StepAdjustmentProperty {
    public fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

    public fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

    public fun scalingAdjustment(): Number

    public interface Builder {
      public fun metricIntervalLowerBound(metricIntervalLowerBound: Number)

      public fun metricIntervalUpperBound(metricIntervalUpperBound: Number)

      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.builder()

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
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty,
    ) : StepAdjustmentProperty {
      override fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

      override fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StepAdjustmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty):
          StepAdjustmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepAdjustmentProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingMetricDimensionProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty,
    ) : TargetTrackingMetricDimensionProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingMetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty):
          TargetTrackingMetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricDimensionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StepScalingPolicyConfigurationProperty {
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    public fun cooldown(): Number? = unwrap(this).getCooldown()

    public fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

    public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    public fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

    public interface Builder {
      public fun adjustmentType(adjustmentType: String)

      public fun cooldown(cooldown: Number)

      public fun metricAggregationType(metricAggregationType: String)

      public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

      public fun stepAdjustments(stepAdjustments: IResolvable)

      public fun stepAdjustments(stepAdjustments: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.builder()

      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      override fun cooldown(cooldown: Number) {
        cdkBuilder.cooldown(cooldown)
      }

      override fun metricAggregationType(metricAggregationType: String) {
        cdkBuilder.metricAggregationType(metricAggregationType)
      }

      override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
      }

      override fun stepAdjustments(stepAdjustments: IResolvable) {
        cdkBuilder.stepAdjustments(stepAdjustments.let(IResolvable::unwrap))
      }

      override fun stepAdjustments(stepAdjustments: List<Any>) {
        cdkBuilder.stepAdjustments(stepAdjustments)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty,
    ) : StepScalingPolicyConfigurationProperty {
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      override fun cooldown(): Number? = unwrap(this).getCooldown()

      override fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

      override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

      override fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StepScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty):
          StepScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomizedMetricSpecificationProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun metrics(): Any? = unwrap(this).getMetrics()

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun statistic(): String? = unwrap(this).getStatistic()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun metricName(metricName: String)

      public fun metrics(metrics: IResolvable)

      public fun metrics(metrics: List<Any>)

      public fun namespace(namespace: String)

      public fun statistic(statistic: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun metrics(metrics: IResolvable) {
        cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
      }

      override fun metrics(metrics: List<Any>) {
        cdkBuilder.metrics(metrics)
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
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty,
    ) : CustomizedMetricSpecificationProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String? = unwrap(this).getMetricName()

      override fun metrics(): Any? = unwrap(this).getMetrics()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun statistic(): String? = unwrap(this).getStatistic()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty):
          CustomizedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedMetricSpecificationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingMetricDataQueryProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun id(): String? = unwrap(this).getId()

    public fun label(): String? = unwrap(this).getLabel()

    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    public fun returnData(): Any? = unwrap(this).getReturnData()

    public interface Builder {
      public fun expression(expression: String)

      public fun id(id: String)

      public fun label(label: String)

      public fun metricStat(metricStat: IResolvable)

      public fun metricStat(metricStat: TargetTrackingMetricStatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("212adca6a74036f0fadf8d3aab1a9cd434f87243e7be7d72832b6caf3cc86131")
      public fun metricStat(metricStat: TargetTrackingMetricStatProperty.Builder.() -> Unit)

      public fun returnData(returnData: Boolean)

      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.builder()

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

      override fun metricStat(metricStat: TargetTrackingMetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(TargetTrackingMetricStatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("212adca6a74036f0fadf8d3aab1a9cd434f87243e7be7d72832b6caf3cc86131")
      override fun metricStat(metricStat: TargetTrackingMetricStatProperty.Builder.() -> Unit): Unit
          = metricStat(TargetTrackingMetricStatProperty(metricStat))

      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty,
    ) : TargetTrackingMetricDataQueryProperty {
      override fun expression(): String? = unwrap(this).getExpression()

      override fun id(): String? = unwrap(this).getId()

      override fun label(): String? = unwrap(this).getLabel()

      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingMetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty):
          TargetTrackingMetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricDataQueryProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingScalingPolicyConfigurationProperty {
    public fun customizedMetricSpecification(): Any? =
        unwrap(this).getCustomizedMetricSpecification()

    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    public fun predefinedMetricSpecification(): Any? =
        unwrap(this).getPredefinedMetricSpecification()

    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    public fun targetValue(): Number

    public interface Builder {
      public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable)

      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fe2d38cab95b93f60665ae50eacec48c022280a20a01316669b2fe3c29e9e41")
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit)

      public fun disableScaleIn(disableScaleIn: Boolean)

      public fun disableScaleIn(disableScaleIn: IResolvable)

      public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable)

      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e620e4bb9d79b0fdbbba8341f5cd87f28064dcd828e54b89de06cfc98c2c766a")
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit)

      public fun scaleInCooldown(scaleInCooldown: Number)

      public fun scaleOutCooldown(scaleOutCooldown: Number)

      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder()

      override fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(IResolvable::unwrap))
      }

      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(CustomizedMetricSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fe2d38cab95b93f60665ae50eacec48c022280a20a01316669b2fe3c29e9e41")
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

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e620e4bb9d79b0fdbbba8341f5cd87f28064dcd828e54b89de06cfc98c2c766a")
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricSpecification(PredefinedMetricSpecificationProperty(predefinedMetricSpecification))

      override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty,
    ) : TargetTrackingScalingPolicyConfigurationProperty {
      override fun customizedMetricSpecification(): Any? =
          unwrap(this).getCustomizedMetricSpecification()

      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      override fun predefinedMetricSpecification(): Any? =
          unwrap(this).getPredefinedMetricSpecification()

      override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingMetricProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun namespace(): String? = unwrap(this).getNamespace()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty,
    ) : TargetTrackingMetricProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String? = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty):
          TargetTrackingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
