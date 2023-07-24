@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field wells of a tree map.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-treemapfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisTreeMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TreeMapFieldWellsProperty.Builder =
        CfnAnalysis.TreeMapFieldWellsProperty.builder()

    /**
     * @param treeMapAggregatedFieldWells The aggregated field wells of a tree map.
     */
    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    /**
     * @param treeMapAggregatedFieldWells The aggregated field wells of a tree map.
     */
    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: CfnAnalysis.TreeMapAggregatedFieldWellsProperty) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.TreeMapFieldWellsProperty = cdkBuilder.build()
}
