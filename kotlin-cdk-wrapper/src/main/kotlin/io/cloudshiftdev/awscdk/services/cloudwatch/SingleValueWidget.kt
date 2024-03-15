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

public open class SingleValueWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidget,
) : ConcreteWidget(cdkObject) {
  public override fun toJson(): List<Any> = unwrap(this).toJson()

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SingleValueWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.SingleValueWidget.Builder.create()

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
        software.amazon.awscdk.services.cloudwatch.SingleValueWidget = wrapped.cdkObject
  }
}
