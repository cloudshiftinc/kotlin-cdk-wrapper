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
public class CfnTemplateWaterfallChartOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.WaterfallChartOptionsProperty.Builder =
        CfnTemplate.WaterfallChartOptionsProperty.builder()

    public fun totalBarLabel(totalBarLabel: String) {
        cdkBuilder.totalBarLabel(totalBarLabel)
    }

    public fun build(): CfnTemplate.WaterfallChartOptionsProperty = cdkBuilder.build()
}
