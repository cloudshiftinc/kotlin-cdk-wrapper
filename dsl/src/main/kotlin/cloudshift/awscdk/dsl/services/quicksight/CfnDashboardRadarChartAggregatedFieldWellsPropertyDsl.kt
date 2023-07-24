@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The aggregated field well configuration of a `RadarChartVisual` .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-radarchartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardRadarChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.RadarChartAggregatedFieldWellsProperty.Builder =
        CfnDashboard.RadarChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _color: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /**
     * @param category The aggregated field well categories of a radar chart.
     */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /**
     * @param category The aggregated field well categories of a radar chart.
     */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /**
     * @param category The aggregated field well categories of a radar chart.
     */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /**
     * @param color The color that are assigned to the aggregated field wells of a radar chart.
     */
    public fun color(vararg color: Any) {
        _color.addAll(listOf(*color))
    }

    /**
     * @param color The color that are assigned to the aggregated field wells of a radar chart.
     */
    public fun color(color: Collection<Any>) {
        _color.addAll(color)
    }

    /**
     * @param color The color that are assigned to the aggregated field wells of a radar chart.
     */
    public fun color(color: IResolvable) {
        cdkBuilder.color(color)
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The values that are assigned to the aggregated field wells of a radar chart.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.RadarChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_color.isNotEmpty()) cdkBuilder.color(_color)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
