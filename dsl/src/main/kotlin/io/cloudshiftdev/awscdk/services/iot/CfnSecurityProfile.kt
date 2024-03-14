package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalMetricsToRetainV2(): Any? =
      unwrap(this).getAdditionalMetricsToRetainV2()

  public open fun additionalMetricsToRetainV2(`value`: IResolvable) {
    unwrap(this).setAdditionalMetricsToRetainV2(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalMetricsToRetainV2(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalMetricsToRetainV2(__idx_ac66f0)
  }

  public open fun alertTargets(): Any? = unwrap(this).getAlertTargets()

  public open fun alertTargets(`value`: IResolvable) {
    unwrap(this).setAlertTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun alertTargets(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setAlertTargets(__item_ac66f0)
  }

  public open fun attrSecurityProfileArn(): String = unwrap(this).getAttrSecurityProfileArn()

  public open fun behaviors(): Any? = unwrap(this).getBehaviors()

  public open fun behaviors(`value`: IResolvable) {
    unwrap(this).setBehaviors(`value`.let(IResolvable::unwrap))
  }

  public open fun behaviors(__idx_ac66f0: List<Any>) {
    unwrap(this).setBehaviors(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

  public open fun metricsExportConfig(`value`: IResolvable) {
    unwrap(this).setMetricsExportConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun metricsExportConfig(`value`: MetricsExportConfigProperty) {
    unwrap(this).setMetricsExportConfig(`value`.let(MetricsExportConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7651716e3815530ad69fa0c2afcf79ae76517774102ef9eae1a7f0087cd980ed")
  public open fun metricsExportConfig(`value`: MetricsExportConfigProperty.Builder.() -> Unit): Unit
      = metricsExportConfig(MetricsExportConfigProperty(`value`))

  public open fun securityProfileDescription(): String? =
      unwrap(this).getSecurityProfileDescription()

  public open fun securityProfileDescription(`value`: String) {
    unwrap(this).setSecurityProfileDescription(`value`)
  }

  public open fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

  public open fun securityProfileName(`value`: String) {
    unwrap(this).setSecurityProfileName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()

  public open fun targetArns(`value`: List<String>) {
    unwrap(this).setTargetArns(`value`)
  }

  public interface Builder {
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable)

    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>)

    public fun alertTargets(alertTargets: IResolvable)

    public fun alertTargets(alertTargets: Map<String, Any>)

    public fun behaviors(behaviors: IResolvable)

    public fun behaviors(behaviors: List<Any>)

    public fun metricsExportConfig(metricsExportConfig: IResolvable)

    public fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cbc29ffb850f6001e77db0596c11a4d7ad56587a1ae37ee40a9e2345b81d962")
    public
        fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty.Builder.() -> Unit)

    public fun securityProfileDescription(securityProfileDescription: String)

    public fun securityProfileName(securityProfileName: String)

    public fun tags(tags: List<CfnTag>)

    public fun targetArns(targetArns: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSecurityProfile.Builder =
        software.amazon.awscdk.services.iot.CfnSecurityProfile.Builder.create(scope, id)

    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2.let(IResolvable::unwrap))
    }

    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
    }

    override fun alertTargets(alertTargets: IResolvable) {
      cdkBuilder.alertTargets(alertTargets.let(IResolvable::unwrap))
    }

    override fun alertTargets(alertTargets: Map<String, Any>) {
      cdkBuilder.alertTargets(alertTargets)
    }

    override fun behaviors(behaviors: IResolvable) {
      cdkBuilder.behaviors(behaviors.let(IResolvable::unwrap))
    }

    override fun behaviors(behaviors: List<Any>) {
      cdkBuilder.behaviors(behaviors)
    }

    override fun metricsExportConfig(metricsExportConfig: IResolvable) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(IResolvable::unwrap))
    }

    override fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(MetricsExportConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cbc29ffb850f6001e77db0596c11a4d7ad56587a1ae37ee40a9e2345b81d962")
    override
        fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty.Builder.() -> Unit):
        Unit = metricsExportConfig(MetricsExportConfigProperty(metricsExportConfig))

    override fun securityProfileDescription(securityProfileDescription: String) {
      cdkBuilder.securityProfileDescription(securityProfileDescription)
    }

    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile):
        CfnSecurityProfile = CfnSecurityProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfile):
        software.amazon.awscdk.services.iot.CfnSecurityProfile = wrapped.cdkObject
  }

  public interface MetricToRetainProperty {
    public fun exportMetric(): Any? = unwrap(this).getExportMetric()

    public fun metric(): String

    public fun metricDimension(): Any? = unwrap(this).getMetricDimension()

    public interface Builder {
      public fun exportMetric(exportMetric: Boolean)

      public fun exportMetric(exportMetric: IResolvable)

      public fun metric(metric: String)

      public fun metricDimension(metricDimension: IResolvable)

      public fun metricDimension(metricDimension: MetricDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42fbcc014135a946c198cee5e55192f746f1dab620d0f495364fd034d5a9fee")
      public fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty.builder()

      override fun exportMetric(exportMetric: Boolean) {
        cdkBuilder.exportMetric(exportMetric)
      }

      override fun exportMetric(exportMetric: IResolvable) {
        cdkBuilder.exportMetric(exportMetric.let(IResolvable::unwrap))
      }

      override fun metric(metric: String) {
        cdkBuilder.metric(metric)
      }

      override fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension.let(IResolvable::unwrap))
      }

      override fun metricDimension(metricDimension: MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension.let(MetricDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42fbcc014135a946c198cee5e55192f746f1dab620d0f495364fd034d5a9fee")
      override fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit):
          Unit = metricDimension(MetricDimensionProperty(metricDimension))

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty,
    ) : MetricToRetainProperty {
      override fun exportMetric(): Any? = unwrap(this).getExportMetric()

      override fun metric(): String = unwrap(this).getMetric()

      override fun metricDimension(): Any? = unwrap(this).getMetricDimension()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricToRetainProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty):
          MetricToRetainProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricToRetainProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MetricsExportConfigProperty {
    public fun mqttTopic(): String

    public fun roleArn(): String

    public interface Builder {
      public fun mqttTopic(mqttTopic: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty.builder()

      override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty,
    ) : MetricsExportConfigProperty {
      override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty):
          MetricsExportConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsExportConfigProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MachineLearningDetectionConfigProperty {
    public fun confidenceLevel(): String? = unwrap(this).getConfidenceLevel()

    public interface Builder {
      public fun confidenceLevel(confidenceLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.builder()

      override fun confidenceLevel(confidenceLevel: String) {
        cdkBuilder.confidenceLevel(confidenceLevel)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty,
    ) : MachineLearningDetectionConfigProperty {
      override fun confidenceLevel(): String? = unwrap(this).getConfidenceLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MachineLearningDetectionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty):
          MachineLearningDetectionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MachineLearningDetectionConfigProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatisticalThresholdProperty {
    public fun statistic(): String? = unwrap(this).getStatistic()

    public interface Builder {
      public fun statistic(statistic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty.builder()

      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty,
    ) : StatisticalThresholdProperty {
      override fun statistic(): String? = unwrap(this).getStatistic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticalThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty):
          StatisticalThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticalThresholdProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BehaviorProperty {
    public fun criteria(): Any? = unwrap(this).getCriteria()

    public fun exportMetric(): Any? = unwrap(this).getExportMetric()

    public fun metric(): String? = unwrap(this).getMetric()

    public fun metricDimension(): Any? = unwrap(this).getMetricDimension()

    public fun name(): String

    public fun suppressAlerts(): Any? = unwrap(this).getSuppressAlerts()

    public interface Builder {
      public fun criteria(criteria: IResolvable)

      public fun criteria(criteria: BehaviorCriteriaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923295a66c6b757449cc7bbeccf2bc2b5809f43996a2f210cfa2621272a0a723")
      public fun criteria(criteria: BehaviorCriteriaProperty.Builder.() -> Unit)

      public fun exportMetric(exportMetric: Boolean)

      public fun exportMetric(exportMetric: IResolvable)

      public fun metric(metric: String)

      public fun metricDimension(metricDimension: IResolvable)

      public fun metricDimension(metricDimension: MetricDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("868af0845e1172ec28d523bceb97a29abc045a639a9b0846a7e8318b271c74e2")
      public fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun suppressAlerts(suppressAlerts: Boolean)

      public fun suppressAlerts(suppressAlerts: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty.builder()

      override fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
      }

      override fun criteria(criteria: BehaviorCriteriaProperty) {
        cdkBuilder.criteria(criteria.let(BehaviorCriteriaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923295a66c6b757449cc7bbeccf2bc2b5809f43996a2f210cfa2621272a0a723")
      override fun criteria(criteria: BehaviorCriteriaProperty.Builder.() -> Unit): Unit =
          criteria(BehaviorCriteriaProperty(criteria))

      override fun exportMetric(exportMetric: Boolean) {
        cdkBuilder.exportMetric(exportMetric)
      }

      override fun exportMetric(exportMetric: IResolvable) {
        cdkBuilder.exportMetric(exportMetric.let(IResolvable::unwrap))
      }

      override fun metric(metric: String) {
        cdkBuilder.metric(metric)
      }

      override fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension.let(IResolvable::unwrap))
      }

      override fun metricDimension(metricDimension: MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension.let(MetricDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("868af0845e1172ec28d523bceb97a29abc045a639a9b0846a7e8318b271c74e2")
      override fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit):
          Unit = metricDimension(MetricDimensionProperty(metricDimension))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun suppressAlerts(suppressAlerts: Boolean) {
        cdkBuilder.suppressAlerts(suppressAlerts)
      }

      override fun suppressAlerts(suppressAlerts: IResolvable) {
        cdkBuilder.suppressAlerts(suppressAlerts.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty,
    ) : BehaviorProperty {
      override fun criteria(): Any? = unwrap(this).getCriteria()

      override fun exportMetric(): Any? = unwrap(this).getExportMetric()

      override fun metric(): String? = unwrap(this).getMetric()

      override fun metricDimension(): Any? = unwrap(this).getMetricDimension()

      override fun name(): String = unwrap(this).getName()

      override fun suppressAlerts(): Any? = unwrap(this).getSuppressAlerts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty):
          BehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BehaviorProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun dimensionName(): String

    public fun `operator`(): String? = unwrap(this).getOperator()

    public interface Builder {
      public fun dimensionName(dimensionName: String)

      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.builder()

      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      override fun dimensionName(): String = unwrap(this).getDimensionName()

      override fun `operator`(): String? = unwrap(this).getOperator()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MetricValueProperty {
    public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

    public fun count(): String? = unwrap(this).getCount()

    public fun number(): Number? = unwrap(this).getNumber()

    public fun numbers(): Any? = unwrap(this).getNumbers()

    public fun ports(): Any? = unwrap(this).getPorts()

    public fun strings(): List<String> = unwrap(this).getStrings() ?: emptyList()

    public interface Builder {
      public fun cidrs(cidrs: List<String>)

      public fun count(count: String)

      public fun number(number: Number)

      public fun numbers(numbers: IResolvable)

      public fun numbers(numbers: List<Number>)

      public fun ports(ports: IResolvable)

      public fun ports(ports: List<Number>)

      public fun strings(strings: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty.builder()

      override fun cidrs(cidrs: List<String>) {
        cdkBuilder.cidrs(cidrs)
      }

      override fun count(count: String) {
        cdkBuilder.count(count)
      }

      override fun number(number: Number) {
        cdkBuilder.number(number)
      }

      override fun numbers(numbers: IResolvable) {
        cdkBuilder.numbers(numbers.let(IResolvable::unwrap))
      }

      override fun numbers(numbers: List<Number>) {
        cdkBuilder.numbers(numbers)
      }

      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable::unwrap))
      }

      override fun ports(ports: List<Number>) {
        cdkBuilder.ports(ports)
      }

      override fun strings(strings: List<String>) {
        cdkBuilder.strings(strings)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty,
    ) : MetricValueProperty {
      override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

      override fun count(): String? = unwrap(this).getCount()

      override fun number(): Number? = unwrap(this).getNumber()

      override fun numbers(): Any? = unwrap(this).getNumbers()

      override fun ports(): Any? = unwrap(this).getPorts()

      override fun strings(): List<String> = unwrap(this).getStrings() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty):
          MetricValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricValueProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BehaviorCriteriaProperty {
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    public fun consecutiveDatapointsToAlarm(): Number? =
        unwrap(this).getConsecutiveDatapointsToAlarm()

    public fun consecutiveDatapointsToClear(): Number? =
        unwrap(this).getConsecutiveDatapointsToClear()

    public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    public fun mlDetectionConfig(): Any? = unwrap(this).getMlDetectionConfig()

    public fun statisticalThreshold(): Any? = unwrap(this).getStatisticalThreshold()

    public fun `value`(): Any? = unwrap(this).getValue()

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number)

      public fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number)

      public fun durationSeconds(durationSeconds: Number)

      public fun mlDetectionConfig(mlDetectionConfig: IResolvable)

      public fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cd2d5111c19a294521ca6163251ee244151a8a4140303c76b7200049648cc8e")
      public
          fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty.Builder.() -> Unit)

      public fun statisticalThreshold(statisticalThreshold: IResolvable)

      public fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48bd43ae4d94c9effa2f5e601060c3ae79f58c795c643f724d9d70185de348f2")
      public
          fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty.Builder.() -> Unit)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: MetricValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16cdb95a8068773e469f1bd6dddbcef70a331a68cb980a342cb7ee6d137f5cf3")
      public fun `value`(`value`: MetricValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number) {
        cdkBuilder.consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm)
      }

      override fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number) {
        cdkBuilder.consecutiveDatapointsToClear(consecutiveDatapointsToClear)
      }

      override fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
      }

      override fun mlDetectionConfig(mlDetectionConfig: IResolvable) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig.let(IResolvable::unwrap))
      }

      override fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig.let(MachineLearningDetectionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cd2d5111c19a294521ca6163251ee244151a8a4140303c76b7200049648cc8e")
      override
          fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty.Builder.() -> Unit):
          Unit = mlDetectionConfig(MachineLearningDetectionConfigProperty(mlDetectionConfig))

      override fun statisticalThreshold(statisticalThreshold: IResolvable) {
        cdkBuilder.statisticalThreshold(statisticalThreshold.let(IResolvable::unwrap))
      }

      override fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty) {
        cdkBuilder.statisticalThreshold(statisticalThreshold.let(StatisticalThresholdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48bd43ae4d94c9effa2f5e601060c3ae79f58c795c643f724d9d70185de348f2")
      override
          fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty.Builder.() -> Unit):
          Unit = statisticalThreshold(StatisticalThresholdProperty(statisticalThreshold))

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: MetricValueProperty) {
        cdkBuilder.`value`(`value`.let(MetricValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16cdb95a8068773e469f1bd6dddbcef70a331a68cb980a342cb7ee6d137f5cf3")
      override fun `value`(`value`: MetricValueProperty.Builder.() -> Unit): Unit =
          `value`(MetricValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty,
    ) : BehaviorCriteriaProperty {
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      override fun consecutiveDatapointsToAlarm(): Number? =
          unwrap(this).getConsecutiveDatapointsToAlarm()

      override fun consecutiveDatapointsToClear(): Number? =
          unwrap(this).getConsecutiveDatapointsToClear()

      override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

      override fun mlDetectionConfig(): Any? = unwrap(this).getMlDetectionConfig()

      override fun statisticalThreshold(): Any? = unwrap(this).getStatisticalThreshold()

      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty):
          BehaviorCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BehaviorCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AlertTargetProperty {
    public fun alertTargetArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun alertTargetArn(alertTargetArn: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.builder()

      override fun alertTargetArn(alertTargetArn: String) {
        cdkBuilder.alertTargetArn(alertTargetArn)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty,
    ) : AlertTargetProperty {
      override fun alertTargetArn(): String = unwrap(this).getAlertTargetArn()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlertTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty):
          AlertTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlertTargetProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
