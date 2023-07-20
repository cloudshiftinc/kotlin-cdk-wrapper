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
public class CfnChannelEmbeddedPlusScte20DestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.Builder =
        CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.builder()

    public fun build(): CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty = cdkBuilder.build()
}
