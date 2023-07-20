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
public class CfnChannelAribDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AribDestinationSettingsProperty.Builder =
        CfnChannel.AribDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.AribDestinationSettingsProperty = cdkBuilder.build()
}
