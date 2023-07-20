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
public class CfnTemplateSimpleClusterMarkerPropertyDsl {
    private val cdkBuilder: CfnTemplate.SimpleClusterMarkerProperty.Builder =
        CfnTemplate.SimpleClusterMarkerProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnTemplate.SimpleClusterMarkerProperty = cdkBuilder.build()
}
