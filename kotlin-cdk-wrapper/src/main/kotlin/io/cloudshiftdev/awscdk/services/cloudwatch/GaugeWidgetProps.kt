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
import kotlin.jvm.JvmName

public interface GaugeWidgetProps : MetricWidgetProps {
  public fun annotations(): List<HorizontalAnnotation> =
      unwrap(this).getAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

  public fun end(): String? = unwrap(this).getEnd()

  public fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

  public fun legendPosition(): LegendPosition? =
      unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

  public fun liveData(): Boolean? = unwrap(this).getLiveData()

  public fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?: emptyList()

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  public fun start(): String? = unwrap(this).getStart()

  public fun statistic(): String? = unwrap(this).getStatistic()

  @CdkDslMarker
  public interface Builder {
    public fun annotations(annotations: List<HorizontalAnnotation>)

    public fun annotations(vararg annotations: HorizontalAnnotation)

    public fun end(end: String)

    public fun height(height: Number)

    public fun leftYAxis(leftYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d90cd2f33f01b72a99f5849cd8ea0b62f456c38520983609ad71e7f48b87966")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    public fun legendPosition(legendPosition: LegendPosition)

    public fun liveData(liveData: Boolean)

    public fun metrics(metrics: List<IMetric>)

    public fun metrics(vararg metrics: IMetric)

    public fun period(period: Duration)

    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    public fun region(region: String)

    public fun start(start: String)

    public fun statistic(statistic: String)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps.builder()

    override fun annotations(annotations: List<HorizontalAnnotation>) {
      cdkBuilder.annotations(annotations.map(HorizontalAnnotation::unwrap))
    }

    override fun annotations(vararg annotations: HorizontalAnnotation): Unit =
        annotations(annotations.toList())

    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d90cd2f33f01b72a99f5849cd8ea0b62f456c38520983609ad71e7f48b87966")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    override fun legendPosition(legendPosition: LegendPosition) {
      cdkBuilder.legendPosition(legendPosition.let(LegendPosition::unwrap))
    }

    override fun liveData(liveData: Boolean) {
      cdkBuilder.liveData(liveData)
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

    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps,
  ) : CdkObject(cdkObject), GaugeWidgetProps {
    override fun annotations(): List<HorizontalAnnotation> =
        unwrap(this).getAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

    override fun end(): String? = unwrap(this).getEnd()

    override fun height(): Number? = unwrap(this).getHeight()

    override fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

    override fun legendPosition(): LegendPosition? =
        unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

    override fun liveData(): Boolean? = unwrap(this).getLiveData()

    override fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?:
        emptyList()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    override fun start(): String? = unwrap(this).getStart()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GaugeWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps):
        GaugeWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GaugeWidgetProps):
        software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps
  }
}
