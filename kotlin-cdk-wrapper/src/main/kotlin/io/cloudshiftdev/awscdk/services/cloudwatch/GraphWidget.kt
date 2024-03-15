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

public open class GraphWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidget,
) : ConcreteWidget(cdkObject) {
  public open fun addLeftMetric(metric: IMetric) {
    unwrap(this).addLeftMetric(metric.let(IMetric::unwrap))
  }

  public open fun addRightMetric(metric: IMetric) {
    unwrap(this).addRightMetric(metric.let(IMetric::unwrap))
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun end(end: String)

    public fun height(height: Number)

    public fun left(left: List<IMetric>)

    public fun left(vararg left: IMetric)

    public fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>)

    public fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation)

    public fun leftYAxis(leftYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de98d0f558956685b3826a295ae66d1a1fb7ed3966fdfee85417fb1fc772a647")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    public fun legendPosition(legendPosition: LegendPosition)

    public fun liveData(liveData: Boolean)

    public fun period(period: Duration)

    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    public fun region(region: String)

    public fun right(right: List<IMetric>)

    public fun right(vararg right: IMetric)

    public fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>)

    public fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation)

    public fun rightYAxis(rightYAxis: YAxisProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4295955974761de35843a74a556d469a3ef060f5547b581339c5e4d9e3c62e7")
    public fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit)

    public fun stacked(stacked: Boolean)

    public fun start(start: String)

    public fun statistic(statistic: String)

    public fun title(title: String)

    public fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>)

    public fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation)

    public fun view(view: GraphWidgetView)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GraphWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.GraphWidget.Builder.create()

    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun left(left: List<IMetric>) {
      cdkBuilder.left(left.map(IMetric::unwrap))
    }

    override fun left(vararg left: IMetric): Unit = left(left.toList())

    override fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.leftAnnotations(leftAnnotations.map(HorizontalAnnotation::unwrap))
    }

    override fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation): Unit =
        leftAnnotations(leftAnnotations.toList())

    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de98d0f558956685b3826a295ae66d1a1fb7ed3966fdfee85417fb1fc772a647")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    override fun legendPosition(legendPosition: LegendPosition) {
      cdkBuilder.legendPosition(legendPosition.let(LegendPosition::unwrap))
    }

    override fun liveData(liveData: Boolean) {
      cdkBuilder.liveData(liveData)
    }

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun periodToTimeRange(setPeriodToTimeRange: Boolean) {
      cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun right(right: List<IMetric>) {
      cdkBuilder.right(right.map(IMetric::unwrap))
    }

    override fun right(vararg right: IMetric): Unit = right(right.toList())

    override fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.rightAnnotations(rightAnnotations.map(HorizontalAnnotation::unwrap))
    }

    override fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation): Unit =
        rightAnnotations(rightAnnotations.toList())

    override fun rightYAxis(rightYAxis: YAxisProps) {
      cdkBuilder.rightYAxis(rightYAxis.let(YAxisProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4295955974761de35843a74a556d469a3ef060f5547b581339c5e4d9e3c62e7")
    override fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit): Unit =
        rightYAxis(YAxisProps(rightYAxis))

    override fun stacked(stacked: Boolean) {
      cdkBuilder.stacked(stacked)
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

    override fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>) {
      cdkBuilder.verticalAnnotations(verticalAnnotations.map(VerticalAnnotation::unwrap))
    }

    override fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation): Unit =
        verticalAnnotations(verticalAnnotations.toList())

    override fun view(view: GraphWidgetView) {
      cdkBuilder.view(view.let(GraphWidgetView::unwrap))
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.GraphWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphWidget {
      val builderImpl = BuilderImpl()
      return GraphWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidget):
        GraphWidget = GraphWidget(cdkObject)

    internal fun unwrap(wrapped: GraphWidget):
        software.amazon.awscdk.services.cloudwatch.GraphWidget = wrapped.cdkObject
  }
}
