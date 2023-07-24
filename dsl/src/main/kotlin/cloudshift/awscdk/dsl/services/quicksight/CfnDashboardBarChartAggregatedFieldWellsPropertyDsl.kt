@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The aggregated field wells of a bar chart.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-barchartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardBarChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BarChartAggregatedFieldWellsProperty.Builder =
        CfnDashboard.BarChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _colors: MutableList<Any> = mutableListOf()

    private val _smallMultiples: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /**
     * @param category The category (y-axis) field well of a bar chart.
     */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /**
     * @param category The category (y-axis) field well of a bar chart.
     */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /**
     * @param category The category (y-axis) field well of a bar chart.
     */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /**
     * @param colors The color (group/color) field well of a bar chart.
     */
    public fun colors(vararg colors: Any) {
        _colors.addAll(listOf(*colors))
    }

    /**
     * @param colors The color (group/color) field well of a bar chart.
     */
    public fun colors(colors: Collection<Any>) {
        _colors.addAll(colors)
    }

    /**
     * @param colors The color (group/color) field well of a bar chart.
     */
    public fun colors(colors: IResolvable) {
        cdkBuilder.colors(colors)
    }

    /**
     * @param smallMultiples The small multiples field well of a bar chart.
     */
    public fun smallMultiples(vararg smallMultiples: Any) {
        _smallMultiples.addAll(listOf(*smallMultiples))
    }

    /**
     * @param smallMultiples The small multiples field well of a bar chart.
     */
    public fun smallMultiples(smallMultiples: Collection<Any>) {
        _smallMultiples.addAll(smallMultiples)
    }

    /**
     * @param smallMultiples The small multiples field well of a bar chart.
     */
    public fun smallMultiples(smallMultiples: IResolvable) {
        cdkBuilder.smallMultiples(smallMultiples)
    }

    /**
     * @param values The value field wells of a bar chart.
     * Values are aggregated by category.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The value field wells of a bar chart.
     * Values are aggregated by category.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The value field wells of a bar chart.
     * Values are aggregated by category.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.BarChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        if (_smallMultiples.isNotEmpty()) cdkBuilder.smallMultiples(_smallMultiples)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
