@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.GraphWidgetProps
import software.amazon.awscdk.services.cloudwatch.GraphWidgetView
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.LegendPosition
import software.amazon.awscdk.services.cloudwatch.YAxisProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GraphWidgetPropsDsl {
    private val cdkBuilder: GraphWidgetProps.Builder = GraphWidgetProps.builder()

    private val _left: MutableList<IMetric> = mutableListOf()

    private val _leftAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

    private val _right: MutableList<IMetric> = mutableListOf()

    private val _rightAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun left(vararg left: IMetric) {
        _left.addAll(listOf(*left))
    }

    public fun left(left: Collection<IMetric>) {
        _left.addAll(left)
    }

    public fun leftAnnotations(leftAnnotations: HorizontalAnnotationDsl.() -> Unit) {
        _leftAnnotations.add(HorizontalAnnotationDsl().apply(leftAnnotations).build())
    }

    public fun leftAnnotations(leftAnnotations: Collection<HorizontalAnnotation>) {
        _leftAnnotations.addAll(leftAnnotations)
    }

    public fun leftYAxis(block: YAxisPropsDsl.() -> Unit = {}) {
        val builder = YAxisPropsDsl()
        builder.apply(block)
        cdkBuilder.leftYAxis(builder.build())
    }

    public fun leftYAxis(leftYAxis: YAxisProps) {
        cdkBuilder.leftYAxis(leftYAxis)
    }

    public fun legendPosition(legendPosition: LegendPosition) {
        cdkBuilder.legendPosition(legendPosition)
    }

    public fun liveData(liveData: Boolean) {
        cdkBuilder.liveData(liveData)
    }

    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun right(vararg right: IMetric) {
        _right.addAll(listOf(*right))
    }

    public fun right(right: Collection<IMetric>) {
        _right.addAll(right)
    }

    public fun rightAnnotations(rightAnnotations: HorizontalAnnotationDsl.() -> Unit) {
        _rightAnnotations.add(HorizontalAnnotationDsl().apply(rightAnnotations).build())
    }

    public fun rightAnnotations(rightAnnotations: Collection<HorizontalAnnotation>) {
        _rightAnnotations.addAll(rightAnnotations)
    }

    public fun rightYAxis(block: YAxisPropsDsl.() -> Unit = {}) {
        val builder = YAxisPropsDsl()
        builder.apply(block)
        cdkBuilder.rightYAxis(builder.build())
    }

    public fun rightYAxis(rightYAxis: YAxisProps) {
        cdkBuilder.rightYAxis(rightYAxis)
    }

    public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
        cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    public fun stacked(stacked: Boolean) {
        cdkBuilder.stacked(stacked)
    }

    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun view(view: GraphWidgetView) {
        cdkBuilder.view(view)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): GraphWidgetProps {
        if (_left.isNotEmpty()) cdkBuilder.left(_left)
        if (_leftAnnotations.isNotEmpty()) cdkBuilder.leftAnnotations(_leftAnnotations)
        if (_right.isNotEmpty()) cdkBuilder.right(_right)
        if (_rightAnnotations.isNotEmpty()) cdkBuilder.rightAnnotations(_rightAnnotations)
        return cdkBuilder.build()
    }
}
