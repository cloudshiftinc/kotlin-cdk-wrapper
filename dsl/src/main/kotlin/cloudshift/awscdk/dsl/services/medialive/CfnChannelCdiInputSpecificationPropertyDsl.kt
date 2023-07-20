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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelCdiInputSpecificationPropertyDsl {
    private val cdkBuilder: CfnChannel.CdiInputSpecificationProperty.Builder =
        CfnChannel.CdiInputSpecificationProperty.builder()

    public fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
    }

    public fun build(): CfnChannel.CdiInputSpecificationProperty = cdkBuilder.build()
}
