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
public class CfnChannelSmpteTtDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.SmpteTtDestinationSettingsProperty.Builder =
        CfnChannel.SmpteTtDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.SmpteTtDestinationSettingsProperty = cdkBuilder.build()
}
