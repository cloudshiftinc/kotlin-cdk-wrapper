@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * A metric emitted by a service.
 *
 * The metric is a combination of a metric identifier (namespace, name and dimensions)
 * and an aggregation function (statistic, period and unit).
 *
 * It also contains metadata which is used only in graphs, such as color and label.
 * It makes sense to embed this in here, so that compound constructs can attach
 * that metadata to metrics they expose.
 *
 * This class does not represent a resource, so hence is not a construct. Instead,
 * Metric is an abstraction that makes it easy to specify metrics for use in both
 * alarms and graphs.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Metric minuteErrorRate = fn.metricErrors(MetricOptions.builder()
 * .statistic(Stats.AVERAGE)
 * .period(Duration.minutes(1))
 * .label("Lambda failure rate")
 * .build());
 * ```
 */
public open class Metric(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Metric,
) : CdkObject(cdkObject), IMetric {
  public constructor(props: MetricProps) :
      this(software.amazon.awscdk.services.cloudwatch.Metric(props.let(MetricProps.Companion::unwrap))
  )

  public constructor(props: MetricProps.Builder.() -> kotlin.Unit) : this(MetricProps(props)
  )

  /**
   * Account which this metric comes from.
   */
  public open fun account(): String? = unwrap(this).getAccount()

  /**
   * Attach the metric object to the given construct scope.
   *
   * Returns a Metric object that uses the account and region from the Stack
   * the given construct is defined in. If the metric is subsequently used
   * in a Dashboard or Alarm in a different Stack defined in a different
   * account or region, the appropriate 'region' and 'account' fields
   * will be added to it.
   *
   * If the scope we attach to is in an environment-agnostic stack,
   * nothing is done and the same Metric object is returned.
   *
   * @param scope 
   */
  public open fun attachTo(scope: IConstruct): Metric =
      unwrap(this).attachTo(scope.let(IConstruct.Companion::unwrap)).let(Metric::wrap)

  /**
   * The hex color code used when this metric is rendered on a graph.
   */
  public open fun color(): String? = unwrap(this).getColor()

  /**
   * Make a new Alarm for this metric.
   *
   * Combines both properties that may adjust the metric (aggregation) as well
   * as alarm properties.
   *
   * @param scope 
   * @param id 
   * @param props 
   */
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions,
  ): Alarm = unwrap(this).createAlarm(scope.let(Construct.Companion::unwrap), id,
      props.let(CreateAlarmOptions.Companion::unwrap)).let(Alarm::wrap)

  /**
   * Make a new Alarm for this metric.
   *
   * Combines both properties that may adjust the metric (aggregation) as well
   * as alarm properties.
   *
   * @param scope 
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e03736e112999f1b75773f76c5cb9dc73905e2afad3ba0d5d2a8408be21202b")
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions.Builder.() -> kotlin.Unit,
  ): Alarm = createAlarm(scope, id, CreateAlarmOptions(props))

  /**
   * Dimensions of this metric.
   */
  public open fun dimensions(): Map<String, Any> = unwrap(this).getDimensions() ?: emptyMap()

  /**
   * Label for this metric when added to a Graph in a Dashboard.
   */
  public open fun label(): String? = unwrap(this).getLabel()

  /**
   * Name of this metric.
   */
  public open fun metricName(): String = unwrap(this).getMetricName()

  /**
   * Namespace of this metric.
   */
  public open fun namespace(): String = unwrap(this).getNamespace()

  /**
   * Period of this metric.
   */
  public open fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

  /**
   * Region which this metric comes from.
   */
  public open fun region(): String? = unwrap(this).getRegion()

  /**
   * Statistic of this metric.
   */
  public open fun statistic(): String = unwrap(this).getStatistic()

  /**
   * Inspect the details of the metric object.
   */
  public override fun toMetricConfig(): MetricConfig =
      unwrap(this).toMetricConfig().let(MetricConfig::wrap)

  /**
   * Unit of the metric.
   */
  public open fun unit(): Unit? = unwrap(this).getUnit()?.let(Unit::wrap)

  /**
   * (deprecated) Warnings attached to this metric.
   *
   * * use warningsV2
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Warnings attached to this metric.
   */
  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  /**
   * Return a copy of Metric `with` properties changed.
   *
   * All properties except namespace and metricName can be changed.
   *
   * @param props The set of properties to change. 
   */
  public open fun with(props: MetricOptions): Metric =
      unwrap(this).with(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return a copy of Metric `with` properties changed.
   *
   * All properties except namespace and metricName can be changed.
   *
   * @param props The set of properties to change. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("00be48d01e7ef1ab64cd7aae56472e7f1164ef7162d11287c4b0702a8f908089")
  public open fun with(props: MetricOptions.Builder.() -> kotlin.Unit): Metric =
      with(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.Metric].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Account which this metric comes from.
     *
     * Default: - Deployment account.
     *
     * @param account Account which this metric comes from. 
     */
    public fun account(account: String)

    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is rendered
     * on a graph. The `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     *
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     * is rendered on a graph. The `Color` class has a set of standard colors that can be used here. 
     */
    public fun color(color: String)

    /**
     * Dimensions of the metric.
     *
     * Default: - No dimensions.
     *
     * @param dimensionsMap Dimensions of the metric. 
     */
    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    /**
     * Label for this metric when added to a Graph in a Dashboard.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend.
     *
     * Default: - No label
     *
     * @param label Label for this metric when added to a Graph in a Dashboard. 
     */
    public fun label(label: String)

    /**
     * Name of the metric.
     *
     * @param metricName Name of the metric. 
     */
    public fun metricName(metricName: String)

    /**
     * Namespace of the metric.
     *
     * @param namespace Namespace of the metric. 
     */
    public fun namespace(namespace: String)

    /**
     * The period over which the specified statistic is applied.
     *
     * Default: Duration.minutes(5)
     *
     * @param period The period over which the specified statistic is applied. 
     */
    public fun period(period: Duration)

    /**
     * Region which this metric comes from.
     *
     * Default: - Deployment region.
     *
     * @param region Region which this metric comes from. 
     */
    public fun region(region: String)

    /**
     * What function to use for aggregating.
     *
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     *
     * Default: Average
     *
     * @param statistic What function to use for aggregating. 
     */
    public fun statistic(statistic: String)

    /**
     * Unit used to filter the metric stream.
     *
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit,
     * which is recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     *
     * Default: - All metric datums in the given metric stream
     *
     * @param unit Unit used to filter the metric stream. 
     */
    public fun unit(unit: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Metric.Builder =
        software.amazon.awscdk.services.cloudwatch.Metric.Builder.create()

    /**
     * Account which this metric comes from.
     *
     * Default: - Deployment account.
     *
     * @param account Account which this metric comes from. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is rendered
     * on a graph. The `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     *
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     * is rendered on a graph. The `Color` class has a set of standard colors that can be used here. 
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * Dimensions of the metric.
     *
     * Default: - No dimensions.
     *
     * @param dimensionsMap Dimensions of the metric. 
     */
    override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    /**
     * Label for this metric when added to a Graph in a Dashboard.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the entire displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend.
     *
     * Default: - No label
     *
     * @param label Label for this metric when added to a Graph in a Dashboard. 
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * Name of the metric.
     *
     * @param metricName Name of the metric. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * Namespace of the metric.
     *
     * @param namespace Namespace of the metric. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The period over which the specified statistic is applied.
     *
     * Default: Duration.minutes(5)
     *
     * @param period The period over which the specified statistic is applied. 
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * Region which this metric comes from.
     *
     * Default: - Deployment region.
     *
     * @param region Region which this metric comes from. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * What function to use for aggregating.
     *
     * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
     *
     * Can be one of the following:
     *
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     *
     * Default: Average
     *
     * @param statistic What function to use for aggregating. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * Unit used to filter the metric stream.
     *
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit,
     * which is recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     *
     * Default: - All metric datums in the given metric stream
     *
     * @param unit Unit used to filter the metric stream. 
     */
    override fun unit(unit: Unit) {
      cdkBuilder.unit(unit.let(Unit.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Metric = cdkBuilder.build()
  }

  public companion object {
    public fun grantPutMetricData(grantee: IGrantable): Grant =
        software.amazon.awscdk.services.cloudwatch.Metric.grantPutMetricData(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): Metric {
      val builderImpl = BuilderImpl()
      return Metric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Metric): Metric =
        Metric(cdkObject)

    internal fun unwrap(wrapped: Metric): software.amazon.awscdk.services.cloudwatch.Metric =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudwatch.Metric
  }
}
