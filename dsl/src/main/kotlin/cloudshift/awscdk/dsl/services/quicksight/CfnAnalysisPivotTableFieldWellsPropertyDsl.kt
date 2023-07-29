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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field wells for a pivot table visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottablefieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableFieldWellsProperty.Builder =
        CfnAnalysis.PivotTableFieldWellsProperty.builder()

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: IResolvable) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(
        pivotTableAggregatedFieldWells: CfnAnalysis.PivotTableAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.PivotTableFieldWellsProperty = cdkBuilder.build()
}
