package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class Metric internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Metric,
) : IMetric {
  public open fun account(): String? = unwrap(this).getAccount()

  public open fun attachTo(scope: IConstruct): Metric =
      unwrap(this).attachTo(scope.let(IConstruct::unwrap)).let(Metric::wrap)

  public open fun color(): String? = unwrap(this).getColor()

  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions,
  ): Alarm = unwrap(this).createAlarm(scope.let(Construct::unwrap), id,
      props.let(CreateAlarmOptions::unwrap)).let(Alarm::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e03736e112999f1b75773f76c5cb9dc73905e2afad3ba0d5d2a8408be21202b")
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions.Builder.() -> kotlin.Unit,
  ): Alarm = createAlarm(scope, id, CreateAlarmOptions(props))

  public open fun dimensions(): Map<String, Any> = unwrap(this).getDimensions() ?: emptyMap()

  public open fun label(): String? = unwrap(this).getLabel()

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun namespace(): String = unwrap(this).getNamespace()

  public open fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

  public open fun region(): String? = unwrap(this).getRegion()

  public open fun statistic(): String = unwrap(this).getStatistic()

  public override fun toMetricConfig(): MetricConfig =
      unwrap(this).toMetricConfig().let(MetricConfig::wrap)

  public open fun unit(): Unit? = unwrap(this).getUnit()?.let(Unit::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  public open fun with(props: MetricOptions): Metric =
      unwrap(this).with(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("00be48d01e7ef1ab64cd7aae56472e7f1164ef7162d11287c4b0702a8f908089")
  public open fun with(props: MetricOptions.Builder.() -> kotlin.Unit): Metric =
      with(MetricOptions(props))

  public interface Builder {
    public fun account(account: String)

    public fun color(color: String)

    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    public fun label(label: String)

    public fun metricName(metricName: String)

    public fun namespace(namespace: String)

    public fun period(period: Duration)

    public fun region(region: String)

    public fun statistic(statistic: String)

    public fun unit(unit: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Metric.Builder =
        software.amazon.awscdk.services.cloudwatch.Metric.Builder.create()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun unit(unit: Unit) {
      cdkBuilder.unit(unit.let(Unit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Metric = cdkBuilder.build()
  }

  public companion object {
    public open fun grantPutMetricData(grantee: IGrantable): Grant =
        software.amazon.awscdk.services.cloudwatch.Metric.grantPutMetricData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): Metric {
      val builderImpl = BuilderImpl()
      return Metric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Metric): Metric =
        Metric(cdkObject)

    internal fun unwrap(wrapped: Metric): software.amazon.awscdk.services.cloudwatch.Metric =
        wrapped.cdkObject
  }
}
