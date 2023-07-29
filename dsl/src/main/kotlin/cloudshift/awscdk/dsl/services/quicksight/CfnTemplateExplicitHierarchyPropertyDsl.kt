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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The option that determines the hierarchy of the fields that are built within a visual's field
 * wells.
 *
 * These fields can't be duplicated to other visuals.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ExplicitHierarchyProperty explicitHierarchyProperty = ExplicitHierarchyProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-explicithierarchy.html)
 */
@CdkDslMarker
public class CfnTemplateExplicitHierarchyPropertyDsl {
    private val cdkBuilder: CfnTemplate.ExplicitHierarchyProperty.Builder =
        CfnTemplate.ExplicitHierarchyProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _drillDownFilters: MutableList<Any> = mutableListOf()

    /** @param columns The list of columns that define the explicit hierarchy. */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /** @param columns The list of columns that define the explicit hierarchy. */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /** @param columns The list of columns that define the explicit hierarchy. */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the explicit
     *   hierarchy.
     */
    public fun drillDownFilters(vararg drillDownFilters: Any) {
        _drillDownFilters.addAll(listOf(*drillDownFilters))
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the explicit
     *   hierarchy.
     */
    public fun drillDownFilters(drillDownFilters: Collection<Any>) {
        _drillDownFilters.addAll(drillDownFilters)
    }

    /**
     * @param drillDownFilters The option that determines the drill down filters for the explicit
     *   hierarchy.
     */
    public fun drillDownFilters(drillDownFilters: IResolvable) {
        cdkBuilder.drillDownFilters(drillDownFilters)
    }

    /** @param hierarchyId The hierarchy ID of the explicit hierarchy. */
    public fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
    }

    public fun build(): CfnTemplate.ExplicitHierarchyProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
        return cdkBuilder.build()
    }
}
