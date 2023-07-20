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
public class CfnChannelTeletextDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.TeletextDestinationSettingsProperty.Builder =
        CfnChannel.TeletextDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.TeletextDestinationSettingsProperty = cdkBuilder.build()
}
