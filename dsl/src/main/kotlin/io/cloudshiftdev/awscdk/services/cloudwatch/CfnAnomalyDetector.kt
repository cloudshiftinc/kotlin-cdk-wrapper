package io.cloudshiftdev.awscdk.services.cloudwatch

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

public open class CfnAnomalyDetector internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: ConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ecde87249982495323c64a43b0ce11c5c49b2874eef0ff27f36796b9571aa65")
  public open fun configuration(`value`: ConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ConfigurationProperty(`value`))

  public open fun dimensions(): Any? = unwrap(this).getDimensions()

  public open fun dimensions(`value`: IResolvable) {
    unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
  }

  public open fun dimensions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDimensions(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

  public open fun metricMathAnomalyDetector(`value`: IResolvable) {
    unwrap(this).setMetricMathAnomalyDetector(`value`.let(IResolvable::unwrap))
  }

  public open fun metricMathAnomalyDetector(`value`: MetricMathAnomalyDetectorProperty) {
    unwrap(this).setMetricMathAnomalyDetector(`value`.let(MetricMathAnomalyDetectorProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd56d86585f6556e025836972f70b3ca90dc63c4a785f604483a2a80ec8c8ebd")
  public open
      fun metricMathAnomalyDetector(`value`: MetricMathAnomalyDetectorProperty.Builder.() -> Unit):
      Unit = metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty(`value`))

  public open fun metricName(): String? = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun namespace(): String? = unwrap(this).getNamespace()

  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  public open fun singleMetricAnomalyDetector(): Any? =
      unwrap(this).getSingleMetricAnomalyDetector()

  public open fun singleMetricAnomalyDetector(`value`: IResolvable) {
    unwrap(this).setSingleMetricAnomalyDetector(`value`.let(IResolvable::unwrap))
  }

  public open fun singleMetricAnomalyDetector(`value`: SingleMetricAnomalyDetectorProperty) {
    unwrap(this).setSingleMetricAnomalyDetector(`value`.let(SingleMetricAnomalyDetectorProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db6e36234d42aa5c13397d6e8ae73f4a53df5c236a0e211b002eb47af4a40036")
  public open
      fun singleMetricAnomalyDetector(`value`: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit):
      Unit = singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty(`value`))

  public open fun stat(): String? = unwrap(this).getStat()

  public open fun stat(`value`: String) {
    unwrap(this).setStat(`value`)
  }

  public interface Builder {
    public fun configuration(configuration: IResolvable) {
    }

    public fun configuration(configuration: ConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("797cce49dc543cfe5e3f9e833b9c2ad1c909f309227adc72f42b6e6222575c75")
    public fun configuration(configuration: ConfigurationProperty.Builder.() -> Unit) {
    }

    public fun dimensions(dimensions: IResolvable) {
    }

    public fun dimensions(dimensions: List<Any>) {
    }

    public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
    }

    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc259d6444ba8391f78b1aa77a7f081024cf6ee5c02ba0fcc16e3f778afaa600")
    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty.Builder.() -> Unit) {
    }

    public fun metricName(metricName: String) {
    }

    public fun namespace(namespace: String) {
    }

    public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
    }

    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ae06367673102e5f23ee5bca9b43e8d18819a21025ef41618bb5e3d12d2353")
    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit) {
    }

    public fun stat(stat: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.Builder.create(scope, id)

    public override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    public override fun configuration(configuration: ConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("797cce49dc543cfe5e3f9e833b9c2ad1c909f309227adc72f42b6e6222575c75")
    public override fun configuration(configuration: ConfigurationProperty.Builder.() -> Unit): Unit
        = configuration(ConfigurationProperty(configuration))

    public override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    public override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    public override fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(IResolvable::unwrap))
    }

    public override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(MetricMathAnomalyDetectorProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc259d6444ba8391f78b1aa77a7f081024cf6ee5c02ba0fcc16e3f778afaa600")
    public override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: MetricMathAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty(metricMathAnomalyDetector))

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public override fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(IResolvable::unwrap))
    }

    public override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(SingleMetricAnomalyDetectorProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ae06367673102e5f23ee5bca9b43e8d18819a21025ef41618bb5e3d12d2353")
    public override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: SingleMetricAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty(singleMetricAnomalyDetector))

    public override fun stat(stat: String) {
      cdkBuilder.stat(stat)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalyDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalyDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector):
        CfnAnomalyDetector = CfnAnomalyDetector(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetector):
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector = wrapped.cdkObject
  }

  public interface MetricDataQueryProperty {
    public fun accountId(): String? = unwrap(this).getAccountId()

    public fun expression(): String? = unwrap(this).getExpression()

    public fun id(): String

    public fun label(): String? = unwrap(this).getLabel()

    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    public fun period(): Number? = unwrap(this).getPeriod()

    public fun returnData(): Any? = unwrap(this).getReturnData()

    public interface Builder {
      public fun accountId(accountId: String) {
      }

      public fun expression(expression: String) {
      }

      public fun id(id: String) {
      }

      public fun label(label: String) {
      }

      public fun metricStat(metricStat: IResolvable) {
      }

      public fun metricStat(metricStat: MetricStatProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b15486ff93bfa529642e3e885e2223c2807ed9b7fc6975b10a8e05734cbd12cd")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit) {
      }

      public fun period(period: Number) {
      }

      public fun returnData(returnData: Boolean) {
      }

      public fun returnData(returnData: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty.builder()

      public override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun label(label: String) {
        cdkBuilder.label(label)
      }

      public override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable::unwrap))
      }

      public override fun metricStat(metricStat: MetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(MetricStatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b15486ff93bfa529642e3e885e2223c2807ed9b7fc6975b10a8e05734cbd12cd")
      public override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      public override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      public override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      public override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty,
    ) : MetricDataQueryProperty {
      public override fun accountId(): String? = unwrap(this).getAccountId()

      public override fun expression(): String? = unwrap(this).getExpression()

      public override fun id(): String = unwrap(this).getId()

      public override fun label(): String? = unwrap(this).getLabel()

      public override fun metricStat(): Any? = unwrap(this).getMetricStat()

      public override fun period(): Number? = unwrap(this).getPeriod()

      public override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty):
          MetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricDataQueryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleMetricAnomalyDetectorProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun stat(): String? = unwrap(this).getStat()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }

      public fun stat(stat: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.builder()

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

      public override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty,
    ) : SingleMetricAnomalyDetectorProperty {
      public override fun dimensions(): Any? = unwrap(this).getDimensions()

      public override fun metricName(): String? = unwrap(this).getMetricName()

      public override fun namespace(): String? = unwrap(this).getNamespace()

      public override fun stat(): String? = unwrap(this).getStat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SingleMetricAnomalyDetectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty):
          SingleMetricAnomalyDetectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleMetricAnomalyDetectorProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricStatProperty {
    public fun metric(): Any

    public fun period(): Number

    public fun stat(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun metric(metric: IResolvable) {
      }

      public fun metric(metric: MetricProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("081c7eab5b33fe49cd3958a08060052a45aeca231d05a19eb3bbd383cc9628d3")
      public fun metric(metric: MetricProperty.Builder.() -> Unit) {
      }

      public fun period(period: Number) {
      }

      public fun stat(stat: String) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty.builder()

      public override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      public override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("081c7eab5b33fe49cd3958a08060052a45aeca231d05a19eb3bbd383cc9628d3")
      public override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      public override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      public override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty,
    ) : MetricStatProperty {
      public override fun metric(): Any = unwrap(this).getMetric()

      public override fun period(): Number = unwrap(this).getPeriod()

      public override fun stat(): String = unwrap(this).getStat()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty):
          MetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricStatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DimensionProperty {
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
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty,
    ) : DimensionProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MetricMathAnomalyDetectorProperty {
    public fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()

    public interface Builder {
      public fun metricDataQueries(metricDataQueries: IResolvable) {
      }

      public fun metricDataQueries(metricDataQueries: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.builder()

      public override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      public override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty,
    ) : MetricMathAnomalyDetectorProperty {
      public override fun metricDataQueries(): Any? = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetricMathAnomalyDetectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty):
          MetricMathAnomalyDetectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricMathAnomalyDetectorProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationProperty {
    public fun excludedTimeRanges(): Any? = unwrap(this).getExcludedTimeRanges()

    public fun metricTimeZone(): String? = unwrap(this).getMetricTimeZone()

    public interface Builder {
      public fun excludedTimeRanges(excludedTimeRanges: IResolvable) {
      }

      public fun excludedTimeRanges(excludedTimeRanges: List<Any>) {
      }

      public fun metricTimeZone(metricTimeZone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty.builder()

      public override fun excludedTimeRanges(excludedTimeRanges: IResolvable) {
        cdkBuilder.excludedTimeRanges(excludedTimeRanges.let(IResolvable::unwrap))
      }

      public override fun excludedTimeRanges(excludedTimeRanges: List<Any>) {
        cdkBuilder.excludedTimeRanges(excludedTimeRanges)
      }

      public override fun metricTimeZone(metricTimeZone: String) {
        cdkBuilder.metricTimeZone(metricTimeZone)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty,
    ) : ConfigurationProperty {
      public override fun excludedTimeRanges(): Any? = unwrap(this).getExcludedTimeRanges()

      public override fun metricTimeZone(): String? = unwrap(this).getMetricTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun metricName(): String

    public fun namespace(): String

    public interface Builder {
      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty,
    ) : MetricProperty {
      public override fun dimensions(): Any? = unwrap(this).getDimensions()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RangeProperty {
    public fun endTime(): String

    public fun startTime(): String

    public interface Builder {
      public fun endTime(endTime: String) {
      }

      public fun startTime(startTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty.builder()

      public override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      public override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty,
    ) : RangeProperty {
      public override fun endTime(): String = unwrap(this).getEndTime()

      public override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty):
          RangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
