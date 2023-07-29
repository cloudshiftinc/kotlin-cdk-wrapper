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
 * The field wells of a `BarChartVisual` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-barchartfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateBarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.BarChartFieldWellsProperty.Builder =
        CfnTemplate.BarChartFieldWellsProperty.builder()

    /** @param barChartAggregatedFieldWells The aggregated field wells of a bar chart. */
    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    /** @param barChartAggregatedFieldWells The aggregated field wells of a bar chart. */
    public fun barChartAggregatedFieldWells(
        barChartAggregatedFieldWells: CfnTemplate.BarChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.BarChartFieldWellsProperty = cdkBuilder.build()
}
