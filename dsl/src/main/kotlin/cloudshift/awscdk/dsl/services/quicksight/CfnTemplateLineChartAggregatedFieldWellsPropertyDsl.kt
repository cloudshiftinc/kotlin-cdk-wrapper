@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The field well configuration of a line chart.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-linechartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateLineChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineChartAggregatedFieldWellsProperty.Builder =
        CfnTemplate.LineChartAggregatedFieldWellsProperty.builder()

    private val _category: MutableList<Any> = mutableListOf()

    private val _colors: MutableList<Any> = mutableListOf()

    private val _smallMultiples: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /**
     * @param category The category field wells of a line chart. Values are grouped by category
     *   fields.
     */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /**
     * @param category The category field wells of a line chart. Values are grouped by category
     *   fields.
     */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /**
     * @param category The category field wells of a line chart. Values are grouped by category
     *   fields.
     */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /**
     * @param colors The color field wells of a line chart. Values are grouped by category fields.
     */
    public fun colors(vararg colors: Any) {
        _colors.addAll(listOf(*colors))
    }

    /**
     * @param colors The color field wells of a line chart. Values are grouped by category fields.
     */
    public fun colors(colors: Collection<Any>) {
        _colors.addAll(colors)
    }

    /**
     * @param colors The color field wells of a line chart. Values are grouped by category fields.
     */
    public fun colors(colors: IResolvable) {
        cdkBuilder.colors(colors)
    }

    /** @param smallMultiples The small multiples field well of a line chart. */
    public fun smallMultiples(vararg smallMultiples: Any) {
        _smallMultiples.addAll(listOf(*smallMultiples))
    }

    /** @param smallMultiples The small multiples field well of a line chart. */
    public fun smallMultiples(smallMultiples: Collection<Any>) {
        _smallMultiples.addAll(smallMultiples)
    }

    /** @param smallMultiples The small multiples field well of a line chart. */
    public fun smallMultiples(smallMultiples: IResolvable) {
        cdkBuilder.smallMultiples(smallMultiples)
    }

    /**
     * @param values The value field wells of a line chart. Values are aggregated based on
     *   categories.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The value field wells of a line chart. Values are aggregated based on
     *   categories.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The value field wells of a line chart. Values are aggregated based on
     *   categories.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnTemplate.LineChartAggregatedFieldWellsProperty {
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        if (_smallMultiples.isNotEmpty()) cdkBuilder.smallMultiples(_smallMultiples)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
