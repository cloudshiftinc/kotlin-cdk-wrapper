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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ScatterPlotCategoricallyAggregatedFieldWellsProperty.Builder =
        CfnTemplate.ScatterPlotCategoricallyAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _label: MutableList<Any> = mutableListOf()

    private val _size: MutableList<Any> = mutableListOf()

    private val _xAxis: MutableList<Any> = mutableListOf()

    private val _yAxis: MutableList<Any> = mutableListOf()

    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    public fun label(vararg label: Any) {
        _label.addAll(listOf(*label))
    }

    public fun label(label: Collection<Any>) {
        _label.addAll(label)
    }

    public fun label(label: IResolvable) {
        cdkBuilder.label(label)
    }

    public fun size(vararg size: Any) {
        _size.addAll(listOf(*size))
    }

    public fun size(size: Collection<Any>) {
        _size.addAll(size)
    }

    public fun size(size: IResolvable) {
        cdkBuilder.size(size)
    }

    public fun xAxis(vararg xAxis: Any) {
        _xAxis.addAll(listOf(*xAxis))
    }

    public fun xAxis(xAxis: Collection<Any>) {
        _xAxis.addAll(xAxis)
    }

    public fun xAxis(xAxis: IResolvable) {
        cdkBuilder.xAxis(xAxis)
    }

    public fun yAxis(vararg yAxis: Any) {
        _yAxis.addAll(listOf(*yAxis))
    }

    public fun yAxis(yAxis: Collection<Any>) {
        _yAxis.addAll(yAxis)
    }

    public fun yAxis(yAxis: IResolvable) {
        cdkBuilder.yAxis(yAxis)
    }

    public fun build(): CfnTemplate.ScatterPlotCategoricallyAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_label.isNotEmpty()) cdkBuilder.label(_label)
        if (_size.isNotEmpty()) cdkBuilder.size(_size)
        if (_xAxis.isNotEmpty()) cdkBuilder.xAxis(_xAxis)
        if (_yAxis.isNotEmpty()) cdkBuilder.yAxis(_yAxis)
        return cdkBuilder.build()
    }
}
