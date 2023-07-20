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

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnJobTemplateHopDestinationPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.HopDestinationProperty.Builder =
        CfnJobTemplate.HopDestinationProperty.builder()

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun waitMinutes(waitMinutes: Number) {
        cdkBuilder.waitMinutes(waitMinutes)
    }

    public fun build(): CfnJobTemplate.HopDestinationProperty = cdkBuilder.build()
}
