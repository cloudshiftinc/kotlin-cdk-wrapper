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

public interface GraphWidgetProps : MetricWidgetProps {
  public fun end(): String? = unwrap(this).getEnd()

  public fun left(): List<IMetric> = unwrap(this).getLeft()?.map(IMetric::wrap) ?: emptyList()

  public fun leftAnnotations(): List<HorizontalAnnotation> =
      unwrap(this).getLeftAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

  public fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

  public fun legendPosition(): LegendPosition? =
      unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

  public fun liveData(): Boolean? = unwrap(this).getLiveData()

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun right(): List<IMetric> = unwrap(this).getRight()?.map(IMetric::wrap) ?: emptyList()

  public fun rightAnnotations(): List<HorizontalAnnotation> =
      unwrap(this).getRightAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

  public fun rightYAxis(): YAxisProps? = unwrap(this).getRightYAxis()?.let(YAxisProps::wrap)

  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  public fun stacked(): Boolean? = unwrap(this).getStacked()

  public fun start(): String? = unwrap(this).getStart()

  public fun statistic(): String? = unwrap(this).getStatistic()

  public fun verticalAnnotations(): List<VerticalAnnotation> =
      unwrap(this).getVerticalAnnotations()?.map(VerticalAnnotation::wrap) ?: emptyList()

  public fun view(): GraphWidgetView? = unwrap(this).getView()?.let(GraphWidgetView::wrap)

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
    @JvmName("e84dfccb1c274353d893bc130703bda6986106d638e9111dc7666768835289a7")
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
    @JvmName("8c999ebdf3b6a0aebe290caad08460c69c24858ce9c5601d3cb8880b87e3008b")
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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.builder()

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
    @JvmName("e84dfccb1c274353d893bc130703bda6986106d638e9111dc7666768835289a7")
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
    @JvmName("8c999ebdf3b6a0aebe290caad08460c69c24858ce9c5601d3cb8880b87e3008b")
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.GraphWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps,
  ) : CdkObject(cdkObject), GraphWidgetProps {
    override fun end(): String? = unwrap(this).getEnd()

    override fun height(): Number? = unwrap(this).getHeight()

    override fun left(): List<IMetric> = unwrap(this).getLeft()?.map(IMetric::wrap) ?: emptyList()

    override fun leftAnnotations(): List<HorizontalAnnotation> =
        unwrap(this).getLeftAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

    override fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

    override fun legendPosition(): LegendPosition? =
        unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

    override fun liveData(): Boolean? = unwrap(this).getLiveData()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun right(): List<IMetric> = unwrap(this).getRight()?.map(IMetric::wrap) ?: emptyList()

    override fun rightAnnotations(): List<HorizontalAnnotation> =
        unwrap(this).getRightAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

    override fun rightYAxis(): YAxisProps? = unwrap(this).getRightYAxis()?.let(YAxisProps::wrap)

    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    override fun stacked(): Boolean? = unwrap(this).getStacked()

    override fun start(): String? = unwrap(this).getStart()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun title(): String? = unwrap(this).getTitle()

    override fun verticalAnnotations(): List<VerticalAnnotation> =
        unwrap(this).getVerticalAnnotations()?.map(VerticalAnnotation::wrap) ?: emptyList()

    override fun view(): GraphWidgetView? = unwrap(this).getView()?.let(GraphWidgetView::wrap)

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps):
        GraphWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphWidgetProps):
        software.amazon.awscdk.services.cloudwatch.GraphWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.GraphWidgetProps
  }
}
