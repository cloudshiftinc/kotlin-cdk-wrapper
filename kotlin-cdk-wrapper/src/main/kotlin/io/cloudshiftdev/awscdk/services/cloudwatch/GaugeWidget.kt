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

public open class GaugeWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidget,
) : ConcreteWidget(cdkObject) {
  public open fun addMetric(metric: IMetric) {
    unwrap(this).addMetric(metric.let(IMetric::unwrap))
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun annotations(annotations: List<HorizontalAnnotation>)

    public fun annotations(vararg annotations: HorizontalAnnotation)

    public fun end(end: String)

    public fun height(height: Number)

    public fun leftYAxis(leftYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea22e824d60340f70a8c7b8af9dca98342321dd5906ff9f481b308e4fe2abe1")
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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GaugeWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.GaugeWidget.Builder.create()

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
    @JvmName("1ea22e824d60340f70a8c7b8af9dca98342321dd5906ff9f481b308e4fe2abe1")
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.GaugeWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GaugeWidget {
      val builderImpl = BuilderImpl()
      return GaugeWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidget):
        GaugeWidget = GaugeWidget(cdkObject)

    internal fun unwrap(wrapped: GaugeWidget):
        software.amazon.awscdk.services.cloudwatch.GaugeWidget = wrapped.cdkObject
  }
}
