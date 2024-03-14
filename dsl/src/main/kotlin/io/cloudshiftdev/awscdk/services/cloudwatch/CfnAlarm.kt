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

public open class CfnAlarm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm,
) : CfnResource(cdkObject), IInspectable {
  public open fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  public open fun actionsEnabled(`value`: Boolean) {
    unwrap(this).setActionsEnabled(`value`)
  }

  public open fun actionsEnabled(`value`: IResolvable) {
    unwrap(this).setActionsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  public open fun alarmActions(`value`: List<String>) {
    unwrap(this).setAlarmActions(`value`)
  }

  public open fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public open fun alarmDescription(`value`: String) {
    unwrap(this).setAlarmDescription(`value`)
  }

  public open fun alarmName(): String? = unwrap(this).getAlarmName()

  public open fun alarmName(`value`: String) {
    unwrap(this).setAlarmName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

  public open fun comparisonOperator(`value`: String) {
    unwrap(this).setComparisonOperator(`value`)
  }

  public open fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public open fun datapointsToAlarm(`value`: Number) {
    unwrap(this).setDatapointsToAlarm(`value`)
  }

  public open fun dimensions(): Any? = unwrap(this).getDimensions()

  public open fun dimensions(`value`: IResolvable) {
    unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
  }

  public open fun dimensions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDimensions(__idx_ac66f0)
  }

  public open fun evaluateLowSampleCountPercentile(): String? =
      unwrap(this).getEvaluateLowSampleCountPercentile()

  public open fun evaluateLowSampleCountPercentile(`value`: String) {
    unwrap(this).setEvaluateLowSampleCountPercentile(`value`)
  }

  public open fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

  public open fun evaluationPeriods(`value`: Number) {
    unwrap(this).setEvaluationPeriods(`value`)
  }

  public open fun extendedStatistic(): String? = unwrap(this).getExtendedStatistic()

  public open fun extendedStatistic(`value`: String) {
    unwrap(this).setExtendedStatistic(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun insufficientDataActions(): List<String> =
      unwrap(this).getInsufficientDataActions() ?: emptyList()

  public open fun insufficientDataActions(`value`: List<String>) {
    unwrap(this).setInsufficientDataActions(`value`)
  }

  public open fun metricName(): String? = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun metrics(): Any? = unwrap(this).getMetrics()

  public open fun metrics(`value`: IResolvable) {
    unwrap(this).setMetrics(`value`.let(IResolvable::unwrap))
  }

  public open fun metrics(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetrics(__idx_ac66f0)
  }

  public open fun namespace(): String? = unwrap(this).getNamespace()

  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  public open fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  public open fun okActions(`value`: List<String>) {
    unwrap(this).setOkActions(`value`)
  }

  public open fun period(): Number? = unwrap(this).getPeriod()

  public open fun period(`value`: Number) {
    unwrap(this).setPeriod(`value`)
  }

  public open fun statistic(): String? = unwrap(this).getStatistic()

  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  public open fun threshold(): Number? = unwrap(this).getThreshold()

  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  public open fun thresholdMetricId(): String? = unwrap(this).getThresholdMetricId()

  public open fun thresholdMetricId(`value`: String) {
    unwrap(this).setThresholdMetricId(`value`)
  }

  public open fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  public open fun treatMissingData(`value`: String) {
    unwrap(this).setTreatMissingData(`value`)
  }

  public open fun unit(): String? = unwrap(this).getUnit()

  public open fun unit(`value`: String) {
    unwrap(this).setUnit(`value`)
  }

  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsEnabled(actionsEnabled: IResolvable)

    public fun alarmActions(alarmActions: List<String>)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun comparisonOperator(comparisonOperator: String)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun dimensions(dimensions: IResolvable)

    public fun dimensions(dimensions: List<Any>)

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun extendedStatistic(extendedStatistic: String)

    public fun insufficientDataActions(insufficientDataActions: List<String>)

    public fun metricName(metricName: String)

    public fun metrics(metrics: IResolvable)

    public fun metrics(metrics: List<Any>)

    public fun namespace(namespace: String)

    public fun okActions(okActions: List<String>)

    public fun period(period: Number)

    public fun statistic(statistic: String)

    public fun threshold(threshold: Number)

    public fun thresholdMetricId(thresholdMetricId: String)

    public fun treatMissingData(treatMissingData: String)

    public fun unit(unit: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnAlarm.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAlarm.Builder.create(scope, id)

    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
    }

    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
    }

    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    override fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
      cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    override fun extendedStatistic(extendedStatistic: String) {
      cdkBuilder.extendedStatistic(extendedStatistic)
    }

    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
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

    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun thresholdMetricId(thresholdMetricId: String) {
      cdkBuilder.thresholdMetricId(thresholdMetricId)
    }

    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm): CfnAlarm =
        CfnAlarm(cdkObject)

    internal fun unwrap(wrapped: CfnAlarm): software.amazon.awscdk.services.cloudwatch.CfnAlarm =
        wrapped.cdkObject
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
      public fun accountId(accountId: String)

      public fun expression(expression: String)

      public fun id(id: String)

      public fun label(label: String)

      public fun metricStat(metricStat: IResolvable)

      public fun metricStat(metricStat: MetricStatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35ff4c30a5382088d4e276f1dbe5523064d9a89a90d32bbdf22fed7a8efb9743")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

      public fun period(period: Number)

      public fun returnData(returnData: Boolean)

      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.builder()

      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

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

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35ff4c30a5382088d4e276f1dbe5523064d9a89a90d32bbdf22fed7a8efb9743")
      override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty,
    ) : MetricDataQueryProperty {
      override fun accountId(): String? = unwrap(this).getAccountId()

      override fun expression(): String? = unwrap(this).getExpression()

      override fun id(): String = unwrap(this).getId()

      override fun label(): String? = unwrap(this).getLabel()

      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      override fun period(): Number? = unwrap(this).getPeriod()

      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty):
          MetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DimensionProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty,
    ) : DimensionProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricStatProperty {
    public fun metric(): Any

    public fun period(): Number

    public fun stat(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun metric(metric: IResolvable)

      public fun metric(metric: MetricProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fc27b440a87875b0db87fe50953a4e80fe02929afedc911ebb790e48307db7e")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      public fun period(period: Number)

      public fun stat(stat: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.builder()

      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fc27b440a87875b0db87fe50953a4e80fe02929afedc911ebb790e48307db7e")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty,
    ) : MetricStatProperty {
      override fun metric(): Any = unwrap(this).getMetric()

      override fun period(): Number = unwrap(this).getPeriod()

      override fun stat(): String = unwrap(this).getStat()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty):
          MetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricProperty {
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
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder =
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty,
    ) : MetricProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun metricName(): String? = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
