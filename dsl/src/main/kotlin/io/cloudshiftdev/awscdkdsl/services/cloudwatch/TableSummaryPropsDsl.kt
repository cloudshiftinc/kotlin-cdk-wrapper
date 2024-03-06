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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.TableSummaryColumn
import software.amazon.awscdk.services.cloudwatch.TableSummaryProps

/**
 * Properties for TableWidget's summary columns.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TableWidget.Builder.create()
 * // ...
 * .summary(TableSummaryProps.builder()
 * .columns(List.of(TableSummaryColumn.AVERAGE))
 * .hideNonSummaryColumns(true)
 * .sticky(true)
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class TableSummaryPropsDsl {
    private val cdkBuilder: TableSummaryProps.Builder = TableSummaryProps.builder()

    private val _columns: MutableList<TableSummaryColumn> = mutableListOf()

    /** @param columns Summary columns. */
    public fun columns(vararg columns: TableSummaryColumn) {
        _columns.addAll(listOf(*columns))
    }

    /** @param columns Summary columns. */
    public fun columns(columns: Collection<TableSummaryColumn>) {
        _columns.addAll(columns)
    }

    /**
     * @param hideNonSummaryColumns Prevent the columns of datapoints from being displayed, so that
     *   only the label and summary columns are displayed.
     */
    public fun hideNonSummaryColumns(hideNonSummaryColumns: Boolean) {
        cdkBuilder.hideNonSummaryColumns(hideNonSummaryColumns)
    }

    /**
     * @param sticky Make the summary columns sticky, so that they remain in view while scrolling.
     */
    public fun sticky(sticky: Boolean) {
        cdkBuilder.sticky(sticky)
    }

    public fun build(): TableSummaryProps {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
