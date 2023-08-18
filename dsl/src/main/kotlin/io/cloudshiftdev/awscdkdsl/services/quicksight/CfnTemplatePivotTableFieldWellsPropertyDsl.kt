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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottablefieldwells.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableFieldWellsProperty.Builder =
        CfnTemplate.PivotTableFieldWellsProperty.builder()

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: IResolvable) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(
        pivotTableAggregatedFieldWells: CfnTemplate.PivotTableAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.PivotTableFieldWellsProperty = cdkBuilder.build()
}
