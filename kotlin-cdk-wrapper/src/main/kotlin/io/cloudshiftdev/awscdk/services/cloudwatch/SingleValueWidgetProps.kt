@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SingleValueWidgetProps : MetricWidgetProps {
  public fun end(): String? = unwrap(this).getEnd()

  public fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

  public fun metrics(): List<IMetric>

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  public fun sparkline(): Boolean? = unwrap(this).getSparkline()

  public fun start(): String? = unwrap(this).getStart()

  @CdkDslMarker
  public interface Builder {
    public fun end(end: String)

    public fun fullPrecision(fullPrecision: Boolean)

    public fun height(height: Number)

    public fun metrics(metrics: List<IMetric>)

    public fun metrics(vararg metrics: IMetric)

    public fun period(period: Duration)

    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    public fun region(region: String)

    public fun sparkline(sparkline: Boolean)

    public fun start(start: String)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.builder()

    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    override fun fullPrecision(fullPrecision: Boolean) {
      cdkBuilder.fullPrecision(fullPrecision)
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric::unwrap))
    }

    override fun metrics(vararg metrics: IMetric): Unit = metrics(metrics.toList())

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun periodToTimeRange(setPeriodToTimeRange: Boolean) {
      cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun sparkline(sparkline: Boolean) {
      cdkBuilder.sparkline(sparkline)
    }

    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps,
  ) : CdkObject(cdkObject), SingleValueWidgetProps {
    override fun end(): String? = unwrap(this).getEnd()

    override fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

    override fun height(): Number? = unwrap(this).getHeight()

    override fun metrics(): List<IMetric> = unwrap(this).getMetrics().map(IMetric::wrap)

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    override fun sparkline(): Boolean? = unwrap(this).getSparkline()

    override fun start(): String? = unwrap(this).getStart()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SingleValueWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps):
        SingleValueWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SingleValueWidgetProps):
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps
  }
}
