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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisPieChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PieChartAggregatedFieldWellsProperty.Builder =
        CfnAnalysis.PieChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _smallMultiples: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    public fun smallMultiples(vararg smallMultiples: Any) {
        _smallMultiples.addAll(listOf(*smallMultiples))
    }

    public fun smallMultiples(smallMultiples: Collection<Any>) {
        _smallMultiples.addAll(smallMultiples)
    }

    public fun smallMultiples(smallMultiples: IResolvable) {
        cdkBuilder.smallMultiples(smallMultiples)
    }

    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnAnalysis.PieChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_smallMultiples.isNotEmpty()) cdkBuilder.smallMultiples(_smallMultiples)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
