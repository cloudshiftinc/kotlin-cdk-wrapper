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
public class CfnChannelOutputLocationRefPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputLocationRefProperty.Builder =
        CfnChannel.OutputLocationRefProperty.builder()

    public fun destinationRefId(destinationRefId: String) {
        cdkBuilder.destinationRefId(destinationRefId)
    }

    public fun build(): CfnChannel.OutputLocationRefProperty = cdkBuilder.build()
}
