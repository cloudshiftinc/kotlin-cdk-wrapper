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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The option that determines the hierarchy of the fields that are defined during data preparation.
 *
 * These fields are available to use in any analysis that uses the data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PredefinedHierarchyProperty predefinedHierarchyProperty = PredefinedHierarchyProperty.builder()
 * .columns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .hierarchyId("hierarchyId")
 * // the properties below are optional
 * .drillDownFilters(List.of(DrillDownFilterProperty.builder()
 * .categoryFilter(CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .numericEqualityFilter(NumericEqualityDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .value(123)
 * .build())
 * .timeRangeFilter(TimeRangeDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .rangeMaximum("rangeMaximum")
 * .rangeMinimum("rangeMinimum")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-predefinedhierarchy.html)
 */
@CdkDslMarker
public class CfnDashboardPredefinedHierarchyPropertyDsl {
    private val cdkBuilder: CfnDashboard.PredefinedHierarchyProperty.Builder =
        CfnDashboard.PredefinedHierarchyProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _drillDownFilters: MutableList<Any> = mutableListOf()

    /** @param columns The list of columns that define the predefined hierarchy. */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /** @param columns The list of columns that define the predefined hierarchy. */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /** @param columns The list of columns that define the predefined hierarchy. */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the predefined
     *   hierarchy.
     */
    public fun drillDownFilters(vararg drillDownFilters: Any) {
        _drillDownFilters.addAll(listOf(*drillDownFilters))
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the predefined
     *   hierarchy.
     */
    public fun drillDownFilters(drillDownFilters: Collection<Any>) {
        _drillDownFilters.addAll(drillDownFilters)
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the predefined
     *   hierarchy.
     */
    public fun drillDownFilters(drillDownFilters: IResolvable) {
        cdkBuilder.drillDownFilters(drillDownFilters)
    }

    /** @param hierarchyId The hierarchy ID of the predefined hierarchy. */
    public fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
    }

    public fun build(): CfnDashboard.PredefinedHierarchyProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
        return cdkBuilder.build()
    }
}
