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
 * The field wells of a radar chart visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-radarchartfieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateRadarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.RadarChartFieldWellsProperty.Builder =
        CfnTemplate.RadarChartFieldWellsProperty.builder()

    /** @param radarChartAggregatedFieldWells The aggregated field wells of a radar chart visual. */
    public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    /** @param radarChartAggregatedFieldWells The aggregated field wells of a radar chart visual. */
    public fun radarChartAggregatedFieldWells(
        radarChartAggregatedFieldWells: CfnTemplate.RadarChartAggregatedFieldWellsProperty
    ) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.RadarChartFieldWellsProperty = cdkBuilder.build()
}
