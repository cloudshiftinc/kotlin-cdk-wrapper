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
public class CfnTemplateGeospatialMapStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialMapStyleOptionsProperty.Builder =
        CfnTemplate.GeospatialMapStyleOptionsProperty.builder()

    public fun baseMapStyle(baseMapStyle: String) {
        cdkBuilder.baseMapStyle(baseMapStyle)
    }

    public fun build(): CfnTemplate.GeospatialMapStyleOptionsProperty = cdkBuilder.build()
}
