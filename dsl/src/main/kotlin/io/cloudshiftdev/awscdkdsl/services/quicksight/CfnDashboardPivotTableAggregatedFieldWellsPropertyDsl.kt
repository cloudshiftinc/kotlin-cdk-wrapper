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
 * The aggregated field well for the pivot table.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottableaggregatedfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableAggregatedFieldWellsProperty.Builder =
        CfnDashboard.PivotTableAggregatedFieldWellsProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _rows: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /**
     * @param columns The columns field well for a pivot table. Values are grouped by columns
     *   fields.
     */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /**
     * @param columns The columns field well for a pivot table. Values are grouped by columns
     *   fields.
     */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /**
     * @param columns The columns field well for a pivot table. Values are grouped by columns
     *   fields.
     */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    /** @param rows The rows field well for a pivot table. Values are grouped by rows fields. */
    public fun rows(vararg rows: Any) {
        _rows.addAll(listOf(*rows))
    }

    /** @param rows The rows field well for a pivot table. Values are grouped by rows fields. */
    public fun rows(rows: Collection<Any>) {
        _rows.addAll(rows)
    }

    /** @param rows The rows field well for a pivot table. Values are grouped by rows fields. */
    public fun rows(rows: IResolvable) {
        cdkBuilder.rows(rows)
    }

    /**
     * @param values The values field well for a pivot table. Values are aggregated based on rows
     *   and columns fields.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The values field well for a pivot table. Values are aggregated based on rows
     *   and columns fields.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The values field well for a pivot table. Values are aggregated based on rows
     *   and columns fields.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.PivotTableAggregatedFieldWellsProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_rows.isNotEmpty()) cdkBuilder.rows(_rows)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
