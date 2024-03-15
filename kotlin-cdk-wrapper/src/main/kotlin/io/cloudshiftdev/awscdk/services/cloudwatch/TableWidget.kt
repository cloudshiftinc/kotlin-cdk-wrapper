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
import kotlin.jvm.JvmName

public open class TableWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidget,
) : ConcreteWidget(cdkObject) {
  public open fun addMetric(metric: IMetric) {
    unwrap(this).addMetric(metric.let(IMetric::unwrap))
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

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
    @JvmName("0d1d3f693913c56730dceb4021b15b0595474b4852c19a105346bcd972a979a4")
    public fun summary(summary: TableSummaryProps.Builder.() -> Unit)

    public fun thresholds(thresholds: List<TableThreshold>)

    public fun thresholds(vararg thresholds: TableThreshold)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.TableWidget.Builder.create()

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
    @JvmName("0d1d3f693913c56730dceb4021b15b0595474b4852c19a105346bcd972a979a4")
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableWidget {
      val builderImpl = BuilderImpl()
      return TableWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidget):
        TableWidget = TableWidget(cdkObject)

    internal fun unwrap(wrapped: TableWidget):
        software.amazon.awscdk.services.cloudwatch.TableWidget = wrapped.cdkObject
  }
}
