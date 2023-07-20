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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelDestinationPropertyDsl {
    private val cdkBuilder: CfnChannel.DestinationProperty.Builder =
        CfnChannel.DestinationProperty.builder()

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnChannel.DestinationProperty = cdkBuilder.build()
}
