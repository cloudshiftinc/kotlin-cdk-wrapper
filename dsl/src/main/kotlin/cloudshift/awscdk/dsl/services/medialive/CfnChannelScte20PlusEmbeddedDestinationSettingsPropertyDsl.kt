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

@CdkDslMarker
public class CfnChannelScte20PlusEmbeddedDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.Builder =
        CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty = cdkBuilder.build()
}
