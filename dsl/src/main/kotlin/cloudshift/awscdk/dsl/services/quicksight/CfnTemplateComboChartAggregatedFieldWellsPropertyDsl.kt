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
 * The aggregated field wells of a combo chart.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-combochartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateComboChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ComboChartAggregatedFieldWellsProperty.Builder =
        CfnTemplate.ComboChartAggregatedFieldWellsProperty.builder()

    private val _barValues: MutableList<Any> = mutableListOf()

    private val _category: MutableList<Any> = mutableListOf()

    private val _colors: MutableList<Any> = mutableListOf()

    private val _lineValues: MutableList<Any> = mutableListOf()

    /** @param barValues The aggregated `BarValues` field well of a combo chart. */
    public fun barValues(vararg barValues: Any) {
        _barValues.addAll(listOf(*barValues))
    }

    /** @param barValues The aggregated `BarValues` field well of a combo chart. */
    public fun barValues(barValues: Collection<Any>) {
        _barValues.addAll(barValues)
    }

    /** @param barValues The aggregated `BarValues` field well of a combo chart. */
    public fun barValues(barValues: IResolvable) {
        cdkBuilder.barValues(barValues)
    }

    /** @param category The aggregated category field wells of a combo chart. */
    public fun category(vararg category: Any) {
        _category.addAll(listOf(*category))
    }

    /** @param category The aggregated category field wells of a combo chart. */
    public fun category(category: Collection<Any>) {
        _category.addAll(category)
    }

    /** @param category The aggregated category field wells of a combo chart. */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /** @param colors The aggregated colors field well of a combo chart. */
    public fun colors(vararg colors: Any) {
        _colors.addAll(listOf(*colors))
    }

    /** @param colors The aggregated colors field well of a combo chart. */
    public fun colors(colors: Collection<Any>) {
        _colors.addAll(colors)
    }

    /** @param colors The aggregated colors field well of a combo chart. */
    public fun colors(colors: IResolvable) {
        cdkBuilder.colors(colors)
    }

    /** @param lineValues The aggregated `LineValues` field well of a combo chart. */
    public fun lineValues(vararg lineValues: Any) {
        _lineValues.addAll(listOf(*lineValues))
    }

    /** @param lineValues The aggregated `LineValues` field well of a combo chart. */
    public fun lineValues(lineValues: Collection<Any>) {
        _lineValues.addAll(lineValues)
    }

    /** @param lineValues The aggregated `LineValues` field well of a combo chart. */
    public fun lineValues(lineValues: IResolvable) {
        cdkBuilder.lineValues(lineValues)
    }

    public fun build(): CfnTemplate.ComboChartAggregatedFieldWellsProperty {
        if (_barValues.isNotEmpty()) cdkBuilder.barValues(_barValues)
        if (_category.isNotEmpty()) cdkBuilder.category(_category)
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        if (_lineValues.isNotEmpty()) cdkBuilder.lineValues(_lineValues)
        return cdkBuilder.build()
    }
}
