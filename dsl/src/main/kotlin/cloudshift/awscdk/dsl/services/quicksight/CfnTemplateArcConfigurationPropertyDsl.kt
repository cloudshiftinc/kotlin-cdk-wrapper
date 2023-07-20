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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateArcConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ArcConfigurationProperty.Builder =
        CfnTemplate.ArcConfigurationProperty.builder()

    public fun arcAngle(arcAngle: Number) {
        cdkBuilder.arcAngle(arcAngle)
    }

    public fun arcThickness(arcThickness: String) {
        cdkBuilder.arcThickness(arcThickness)
    }

    public fun build(): CfnTemplate.ArcConfigurationProperty = cdkBuilder.build()
}
