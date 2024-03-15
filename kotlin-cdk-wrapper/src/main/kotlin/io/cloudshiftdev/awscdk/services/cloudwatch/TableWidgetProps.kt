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

public interface TableWidgetProps : MetricWidgetProps {
  public fun end(): String? = unwrap(this).getEnd()

  public fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

  public fun layout(): TableLayout? = unwrap(this).getLayout()?.let(TableLayout::wrap)

  public fun liveData(): Boolean? = unwrap(this).getLiveData()

  public fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?: emptyList()

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  public fun showUnitsInLabel(): Boolean? = unwrap(this).getShowUnitsInLabel()

  public fun start(): String? = unwrap(this).getStart()

  public fun statistic(): String? = unwrap(this).getStatistic()

  public fun summary(): TableSummaryProps? = unwrap(this).getSummary()?.let(TableSummaryProps::wrap)

  public fun thresholds(): List<TableThreshold> =
      unwrap(this).getThresholds()?.map(TableThreshold::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun end(end: String)

    public fun fullPrecision(fullPrecision: Boolean)

    public fun height(height: Number)

    public fun layout(layout: TableLayout)

    public fun liveData(liveData: Boolean)

    public fun metrics(metrics: List<IMetric>)

    public fun metrics(vararg metrics: IMetric)

    public fun period(period: Duration)

    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    public fun region(region: String)

    public fun showUnitsInLabel(showUnitsInLabel: Boolean)

    public fun start(start: String)

    public fun statistic(statistic: String)

    public fun summary(summary: TableSummaryProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd5e39ab14c8093d42b55a5f0c5c694bccdb427d8e1b2432b86d21c676b20b69")
    public fun summary(summary: TableSummaryProps.Builder.() -> Unit)

    public fun thresholds(thresholds: List<TableThreshold>)

    public fun thresholds(vararg thresholds: TableThreshold)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TableWidgetProps.builder()

    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    override fun fullPrecision(fullPrecision: Boolean) {
      cdkBuilder.fullPrecision(fullPrecision)
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun layout(layout: TableLayout) {
      cdkBuilder.layout(layout.let(TableLayout::unwrap))
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

    override fun showUnitsInLabel(showUnitsInLabel: Boolean) {
      cdkBuilder.showUnitsInLabel(showUnitsInLabel)
    }

    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun summary(summary: TableSummaryProps) {
      cdkBuilder.summary(summary.let(TableSummaryProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd5e39ab14c8093d42b55a5f0c5c694bccdb427d8e1b2432b86d21c676b20b69")
    override fun summary(summary: TableSummaryProps.Builder.() -> Unit): Unit =
        summary(TableSummaryProps(summary))

    override fun thresholds(thresholds: List<TableThreshold>) {
      cdkBuilder.thresholds(thresholds.map(TableThreshold::unwrap))
    }

    override fun thresholds(vararg thresholds: TableThreshold): Unit =
        thresholds(thresholds.toList())

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidgetProps,
  ) : CdkObject(cdkObject), TableWidgetProps {
    override fun end(): String? = unwrap(this).getEnd()

    override fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

    override fun height(): Number? = unwrap(this).getHeight()

    override fun layout(): TableLayout? = unwrap(this).getLayout()?.let(TableLayout::wrap)

    override fun liveData(): Boolean? = unwrap(this).getLiveData()

    override fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?:
        emptyList()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    override fun showUnitsInLabel(): Boolean? = unwrap(this).getShowUnitsInLabel()

    override fun start(): String? = unwrap(this).getStart()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun summary(): TableSummaryProps? =
        unwrap(this).getSummary()?.let(TableSummaryProps::wrap)

    override fun thresholds(): List<TableThreshold> =
        unwrap(this).getThresholds()?.map(TableThreshold::wrap) ?: emptyList()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidgetProps):
        TableWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableWidgetProps):
        software.amazon.awscdk.services.cloudwatch.TableWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TableWidgetProps
  }
}
