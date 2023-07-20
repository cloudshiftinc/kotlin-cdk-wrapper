@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateRadarChartAreaStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnTemplate.RadarChartAreaStyleSettingsProperty.Builder =
        CfnTemplate.RadarChartAreaStyleSettingsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
