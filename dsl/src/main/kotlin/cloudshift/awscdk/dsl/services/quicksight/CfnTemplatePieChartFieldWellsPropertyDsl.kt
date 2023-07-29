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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The field well configuration of a pie chart.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-piechartfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplatePieChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PieChartFieldWellsProperty.Builder =
        CfnTemplate.PieChartFieldWellsProperty.builder()

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(pieChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    /** @param pieChartAggregatedFieldWells The field well configuration of a pie chart. */
    public fun pieChartAggregatedFieldWells(
        pieChartAggregatedFieldWells: CfnTemplate.PieChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pieChartAggregatedFieldWells(pieChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.PieChartFieldWellsProperty = cdkBuilder.build()
}
