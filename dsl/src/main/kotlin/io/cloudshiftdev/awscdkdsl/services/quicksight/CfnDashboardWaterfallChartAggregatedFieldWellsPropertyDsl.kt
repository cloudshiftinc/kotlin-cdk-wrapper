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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field well configuration of a waterfall visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-waterfallchartaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardWaterfallChartAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.WaterfallChartAggregatedFieldWellsProperty.Builder =
        CfnDashboard.WaterfallChartAggregatedFieldWellsProperty.builder()

    private val _breakdowns: MutableList<Any> = mutableListOf()

    private val _categories: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param breakdowns The breakdown field wells of a waterfall visual. */
    public fun breakdowns(vararg breakdowns: Any) {
        _breakdowns.addAll(listOf(*breakdowns))
    }

    /** @param breakdowns The breakdown field wells of a waterfall visual. */
    public fun breakdowns(breakdowns: Collection<Any>) {
        _breakdowns.addAll(breakdowns)
    }

    /** @param breakdowns The breakdown field wells of a waterfall visual. */
    public fun breakdowns(breakdowns: IResolvable) {
        cdkBuilder.breakdowns(breakdowns)
    }

    /** @param categories The category field wells of a waterfall visual. */
    public fun categories(vararg categories: Any) {
        _categories.addAll(listOf(*categories))
    }

    /** @param categories The category field wells of a waterfall visual. */
    public fun categories(categories: Collection<Any>) {
        _categories.addAll(categories)
    }

    /** @param categories The category field wells of a waterfall visual. */
    public fun categories(categories: IResolvable) {
        cdkBuilder.categories(categories)
    }

    /** @param values The value field wells of a waterfall visual. */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /** @param values The value field wells of a waterfall visual. */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /** @param values The value field wells of a waterfall visual. */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.WaterfallChartAggregatedFieldWellsProperty {
        if (_breakdowns.isNotEmpty()) cdkBuilder.breakdowns(_breakdowns)
        if (_categories.isNotEmpty()) cdkBuilder.categories(_categories)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
