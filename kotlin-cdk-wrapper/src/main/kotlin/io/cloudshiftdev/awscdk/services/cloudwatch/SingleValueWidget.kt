@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A dashboard widget that displays the most recent value for every metric.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(SingleValueWidget.Builder.create()
 * .metrics(List.of())
 * .period(Duration.minutes(15))
 * .build());
 * ```
 */
public open class SingleValueWidget(
  cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidget,
) : ConcreteWidget(cdkObject) {
  public constructor(props: SingleValueWidgetProps) :
      this(software.amazon.awscdk.services.cloudwatch.SingleValueWidget(props.let(SingleValueWidgetProps.Companion::unwrap))
  )

  public constructor(props: SingleValueWidgetProps.Builder.() -> Unit) :
      this(SingleValueWidgetProps(props)
  )

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.SingleValueWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID where the metrics are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the metrics are located. 
     */
    public fun accountId(accountId: String)

    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard. 
     */
    public fun end(end: String)

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     *
     * @param fullPrecision Whether to show as many digits as can fit, before rounding. 
     */
    public fun fullPrecision(fullPrecision: Boolean)

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display. 
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display. 
     */
    public fun metrics(vararg metrics: IMetric)

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     *
     * @param period The default period for all metrics in this widget. 
     */
    public fun period(period: Duration)

    /**
     * Whether to show the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. 
     */
    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    public fun region(region: String)

    /**
     * Whether to show a graph below the value illustrating the value for the whole time range.
     *
     * Cannot be used in combination with `setPeriodToTimeRange`
     *
     * Default: false
     *
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     * time range. 
     */
    public fun sparkline(sparkline: Boolean)

    /**
     * The start of the time range to use for each widget independently from those of the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard. 
     */
    public fun start(start: String)

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    public fun title(title: String)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SingleValueWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.SingleValueWidget.Builder.create()

    /**
     * The AWS account ID where the metrics are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the metrics are located. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard. 
     */
    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     *
     * @param fullPrecision Whether to show as many digits as can fit, before rounding. 
     */
    override fun fullPrecision(fullPrecision: Boolean) {
      cdkBuilder.fullPrecision(fullPrecision)
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display. 
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric.Companion::unwrap))
    }

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display. 
     */
    override fun metrics(vararg metrics: IMetric): Unit = metrics(metrics.toList())

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     *
     * @param period The default period for all metrics in this widget. 
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * Whether to show the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. 
     */
    override fun periodToTimeRange(setPeriodToTimeRange: Boolean) {
      cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * Whether to show a graph below the value illustrating the value for the whole time range.
     *
     * Cannot be used in combination with `setPeriodToTimeRange`
     *
     * Default: false
     *
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     * time range. 
     */
    override fun sparkline(sparkline: Boolean) {
      cdkBuilder.sparkline(sparkline)
    }

    /**
     * The start of the time range to use for each widget independently from those of the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard. 
     */
    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SingleValueWidget =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SingleValueWidget {
      val builderImpl = BuilderImpl()
      return SingleValueWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidget):
        SingleValueWidget = SingleValueWidget(cdkObject)

    internal fun unwrap(wrapped: SingleValueWidget):
        software.amazon.awscdk.services.cloudwatch.SingleValueWidget = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.SingleValueWidget
  }
}
