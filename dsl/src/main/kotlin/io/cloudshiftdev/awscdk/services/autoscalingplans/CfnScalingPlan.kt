package io.cloudshiftdev.awscdk.services.autoscalingplans

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

public open class CfnScalingPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationSource(): Any = unwrap(this).getApplicationSource()

  public open fun applicationSource(`value`: IResolvable) {
    unwrap(this).setApplicationSource(`value`.let(IResolvable::unwrap))
  }

  public open fun applicationSource(`value`: ApplicationSourceProperty) {
    unwrap(this).setApplicationSource(`value`.let(ApplicationSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08816efed08b8fd5398999854e4101af54fa8fc737993b68b8cea8033a1c7390")
  public open fun applicationSource(`value`: ApplicationSourceProperty.Builder.() -> Unit): Unit =
      applicationSource(ApplicationSourceProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrScalingPlanName(): String = unwrap(this).getAttrScalingPlanName()

  public open fun attrScalingPlanVersion(): String = unwrap(this).getAttrScalingPlanVersion()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun scalingInstructions(): Any = unwrap(this).getScalingInstructions()

  public open fun scalingInstructions(`value`: IResolvable) {
    unwrap(this).setScalingInstructions(`value`.let(IResolvable::unwrap))
  }

  public open fun scalingInstructions(__idx_ac66f0: List<Any>) {
    unwrap(this).setScalingInstructions(__idx_ac66f0)
  }

  public interface Builder {
    public fun applicationSource(applicationSource: IResolvable) {
    }

    public fun applicationSource(applicationSource: ApplicationSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c39acd531637587b5ce935b35b38315e0c2052909bebcd5ff5c0c8ddcdcaa0")
    public fun applicationSource(applicationSource: ApplicationSourceProperty.Builder.() -> Unit) {
    }

    public fun scalingInstructions(scalingInstructions: IResolvable) {
    }

    public fun scalingInstructions(scalingInstructions: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder
        = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder.create(scope, id)

    public override fun applicationSource(applicationSource: IResolvable) {
      cdkBuilder.applicationSource(applicationSource.let(IResolvable::unwrap))
    }

    public override fun applicationSource(applicationSource: ApplicationSourceProperty) {
      cdkBuilder.applicationSource(applicationSource.let(ApplicationSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c39acd531637587b5ce935b35b38315e0c2052909bebcd5ff5c0c8ddcdcaa0")
    public override
        fun applicationSource(applicationSource: ApplicationSourceProperty.Builder.() -> Unit): Unit
        = applicationSource(ApplicationSourceProperty(applicationSource))

    public override fun scalingInstructions(scalingInstructions: IResolvable) {
      cdkBuilder.scalingInstructions(scalingInstructions.let(IResolvable::unwrap))
    }

    public override fun scalingInstructions(scalingInstructions: List<Any>) {
      cdkBuilder.scalingInstructions(scalingInstructions)
    }

    public fun build(): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalingPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalingPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan):
        CfnScalingPlan = CfnScalingPlan(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPlan):
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan = wrapped.cdkObject
  }

  public interface TagFilterProperty {
    public fun key(): String

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty,
    ) : TagFilterProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty):
          TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingConfigurationProperty {
    public fun customizedScalingMetricSpecification(): Any? =
        unwrap(this).getCustomizedScalingMetricSpecification()

    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

    public fun predefinedScalingMetricSpecification(): Any? =
        unwrap(this).getPredefinedScalingMetricSpecification()

    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    public fun targetValue(): Number

    public interface Builder {
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
      }

      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a641c32153f8aa63fdd4d9171716567e8b16f69ba4187974f946cb0b0109c6")
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit) {
      }

      public fun disableScaleIn(disableScaleIn: Boolean) {
      }

      public fun disableScaleIn(disableScaleIn: IResolvable) {
      }

      public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
      }

      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
      }

      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fac0d076170342ac4ce2296263a6555e9c1b27f89f5da59fe390ae01ef90023")
      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit) {
      }

      public fun scaleInCooldown(scaleInCooldown: Number) {
      }

      public fun scaleOutCooldown(scaleOutCooldown: Number) {
      }

      public fun targetValue(targetValue: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.builder()

      public override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      public override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(CustomizedScalingMetricSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a641c32153f8aa63fdd4d9171716567e8b16f69ba4187974f946cb0b0109c6")
      public override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          customizedScalingMetricSpecification(CustomizedScalingMetricSpecificationProperty(customizedScalingMetricSpecification))

      public override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      public override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
      }

      public override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
      }

      public override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      public override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(PredefinedScalingMetricSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fac0d076170342ac4ce2296263a6555e9c1b27f89f5da59fe390ae01ef90023")
      public override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedScalingMetricSpecification(PredefinedScalingMetricSpecificationProperty(predefinedScalingMetricSpecification))

      public override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      public override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      public override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty,
    ) : TargetTrackingConfigurationProperty {
      public override fun customizedScalingMetricSpecification(): Any? =
          unwrap(this).getCustomizedScalingMetricSpecification()

      public override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      public override fun estimatedInstanceWarmup(): Number? =
          unwrap(this).getEstimatedInstanceWarmup()

      public override fun predefinedScalingMetricSpecification(): Any? =
          unwrap(this).getPredefinedScalingMetricSpecification()

      public override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      public override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      public override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty):
          TargetTrackingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingConfigurationProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomizedLoadMetricSpecificationProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun namespace(): String

    public fun statistic(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }

      public fun statistic(statistic: String) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.builder()

      public override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      public override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty,
    ) : CustomizedLoadMetricSpecificationProperty {
      public override fun dimensions(): Any? = unwrap(this).getDimensions()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun namespace(): String = unwrap(this).getNamespace()

      public override fun statistic(): String = unwrap(this).getStatistic()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedLoadMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty):
          CustomizedLoadMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedLoadMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomizedScalingMetricSpecificationProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun namespace(): String

    public fun statistic(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }

      public fun statistic(statistic: String) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.builder()

      public override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      public override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty,
    ) : CustomizedScalingMetricSpecificationProperty {
      public override fun dimensions(): Any? = unwrap(this).getDimensions()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun namespace(): String = unwrap(this).getNamespace()

      public override fun statistic(): String = unwrap(this).getStatistic()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedScalingMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty):
          CustomizedScalingMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedScalingMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationSourceProperty {
    public fun cloudFormationStackArn(): String? = unwrap(this).getCloudFormationStackArn()

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    public interface Builder {
      public fun cloudFormationStackArn(cloudFormationStackArn: String) {
      }

      public fun tagFilters(tagFilters: IResolvable) {
      }

      public fun tagFilters(tagFilters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.builder()

      public override fun cloudFormationStackArn(cloudFormationStackArn: String) {
        cdkBuilder.cloudFormationStackArn(cloudFormationStackArn)
      }

      public override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      public override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty,
    ) : ApplicationSourceProperty {
      public override fun cloudFormationStackArn(): String? =
          unwrap(this).getCloudFormationStackArn()

      public override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty):
          ApplicationSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSourceProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PredefinedScalingMetricSpecificationProperty {
    public fun predefinedScalingMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    public interface Builder {
      public fun predefinedScalingMetricType(predefinedScalingMetricType: String) {
      }

      public fun resourceLabel(resourceLabel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.builder()

      public override fun predefinedScalingMetricType(predefinedScalingMetricType: String) {
        cdkBuilder.predefinedScalingMetricType(predefinedScalingMetricType)
      }

      public override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty,
    ) : PredefinedScalingMetricSpecificationProperty {
      public override fun predefinedScalingMetricType(): String =
          unwrap(this).getPredefinedScalingMetricType()

      public override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedScalingMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty):
          PredefinedScalingMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedScalingMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingInstructionProperty {
    public fun customizedLoadMetricSpecification(): Any? =
        unwrap(this).getCustomizedLoadMetricSpecification()

    public fun disableDynamicScaling(): Any? = unwrap(this).getDisableDynamicScaling()

    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public fun predefinedLoadMetricSpecification(): Any? =
        unwrap(this).getPredefinedLoadMetricSpecification()

    public fun predictiveScalingMaxCapacityBehavior(): String? =
        unwrap(this).getPredictiveScalingMaxCapacityBehavior()

    public fun predictiveScalingMaxCapacityBuffer(): Number? =
        unwrap(this).getPredictiveScalingMaxCapacityBuffer()

    public fun predictiveScalingMode(): String? = unwrap(this).getPredictiveScalingMode()

    public fun resourceId(): String

    public fun scalableDimension(): String

    public fun scalingPolicyUpdateBehavior(): String? =
        unwrap(this).getScalingPolicyUpdateBehavior()

    public fun scheduledActionBufferTime(): Number? = unwrap(this).getScheduledActionBufferTime()

    public fun serviceNamespace(): String

    public fun targetTrackingConfigurations(): Any

    public interface Builder {
      public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
      }

      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb9662a50b6c7710f8bab7e3bba525aeb51f98fe8667fcc24e9ae392a673591")
      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit) {
      }

      public fun disableDynamicScaling(disableDynamicScaling: Boolean) {
      }

      public fun disableDynamicScaling(disableDynamicScaling: IResolvable) {
      }

      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }

      public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
      }

      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75e1476bf14827a88c82e804fdea5b28c70eea656be920d8f814a60708d13d0e")
      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit) {
      }

      public
          fun predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior: String) {
      }

      public fun predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer: Number) {
      }

      public fun predictiveScalingMode(predictiveScalingMode: String) {
      }

      public fun resourceId(resourceId: String) {
      }

      public fun scalableDimension(scalableDimension: String) {
      }

      public fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String) {
      }

      public fun scheduledActionBufferTime(scheduledActionBufferTime: Number) {
      }

      public fun serviceNamespace(serviceNamespace: String) {
      }

      public fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable) {
      }

      public fun targetTrackingConfigurations(targetTrackingConfigurations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.builder()

      public override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      public override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(CustomizedLoadMetricSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb9662a50b6c7710f8bab7e3bba525aeb51f98fe8667fcc24e9ae392a673591")
      public override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          customizedLoadMetricSpecification(CustomizedLoadMetricSpecificationProperty(customizedLoadMetricSpecification))

      public override fun disableDynamicScaling(disableDynamicScaling: Boolean) {
        cdkBuilder.disableDynamicScaling(disableDynamicScaling)
      }

      public override fun disableDynamicScaling(disableDynamicScaling: IResolvable) {
        cdkBuilder.disableDynamicScaling(disableDynamicScaling.let(IResolvable::unwrap))
      }

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      public override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(PredefinedLoadMetricSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75e1476bf14827a88c82e804fdea5b28c70eea656be920d8f814a60708d13d0e")
      public override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedLoadMetricSpecification(PredefinedLoadMetricSpecificationProperty(predefinedLoadMetricSpecification))

      public override
          fun predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior: String) {
        cdkBuilder.predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior)
      }

      public override
          fun predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer: Number) {
        cdkBuilder.predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer)
      }

      public override fun predictiveScalingMode(predictiveScalingMode: String) {
        cdkBuilder.predictiveScalingMode(predictiveScalingMode)
      }

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
      }

      public override fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String) {
        cdkBuilder.scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior)
      }

      public override fun scheduledActionBufferTime(scheduledActionBufferTime: Number) {
        cdkBuilder.scheduledActionBufferTime(scheduledActionBufferTime)
      }

      public override fun serviceNamespace(serviceNamespace: String) {
        cdkBuilder.serviceNamespace(serviceNamespace)
      }

      public override fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable) {
        cdkBuilder.targetTrackingConfigurations(targetTrackingConfigurations.let(IResolvable::unwrap))
      }

      public override fun targetTrackingConfigurations(targetTrackingConfigurations: List<Any>) {
        cdkBuilder.targetTrackingConfigurations(targetTrackingConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty,
    ) : ScalingInstructionProperty {
      public override fun customizedLoadMetricSpecification(): Any? =
          unwrap(this).getCustomizedLoadMetricSpecification()

      public override fun disableDynamicScaling(): Any? = unwrap(this).getDisableDynamicScaling()

      public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number = unwrap(this).getMinCapacity()

      public override fun predefinedLoadMetricSpecification(): Any? =
          unwrap(this).getPredefinedLoadMetricSpecification()

      public override fun predictiveScalingMaxCapacityBehavior(): String? =
          unwrap(this).getPredictiveScalingMaxCapacityBehavior()

      public override fun predictiveScalingMaxCapacityBuffer(): Number? =
          unwrap(this).getPredictiveScalingMaxCapacityBuffer()

      public override fun predictiveScalingMode(): String? = unwrap(this).getPredictiveScalingMode()

      public override fun resourceId(): String = unwrap(this).getResourceId()

      public override fun scalableDimension(): String = unwrap(this).getScalableDimension()

      public override fun scalingPolicyUpdateBehavior(): String? =
          unwrap(this).getScalingPolicyUpdateBehavior()

      public override fun scheduledActionBufferTime(): Number? =
          unwrap(this).getScheduledActionBufferTime()

      public override fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

      public override fun targetTrackingConfigurations(): Any =
          unwrap(this).getTargetTrackingConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingInstructionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty):
          ScalingInstructionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingInstructionProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PredefinedLoadMetricSpecificationProperty {
    public fun predefinedLoadMetricType(): String

    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    public interface Builder {
      public fun predefinedLoadMetricType(predefinedLoadMetricType: String) {
      }

      public fun resourceLabel(resourceLabel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.builder()

      public override fun predefinedLoadMetricType(predefinedLoadMetricType: String) {
        cdkBuilder.predefinedLoadMetricType(predefinedLoadMetricType)
      }

      public override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty,
    ) : PredefinedLoadMetricSpecificationProperty {
      public override fun predefinedLoadMetricType(): String =
          unwrap(this).getPredefinedLoadMetricType()

      public override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedLoadMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty):
          PredefinedLoadMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedLoadMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
