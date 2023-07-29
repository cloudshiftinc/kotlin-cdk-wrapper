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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field wells of a tree map.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-treemapfieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardTreeMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TreeMapFieldWellsProperty.Builder =
        CfnDashboard.TreeMapFieldWellsProperty.builder()

    /** @param treeMapAggregatedFieldWells The aggregated field wells of a tree map. */
    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    /** @param treeMapAggregatedFieldWells The aggregated field wells of a tree map. */
    public fun treeMapAggregatedFieldWells(
        treeMapAggregatedFieldWells: CfnDashboard.TreeMapAggregatedFieldWellsProperty
    ) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.TreeMapFieldWellsProperty = cdkBuilder.build()
}
