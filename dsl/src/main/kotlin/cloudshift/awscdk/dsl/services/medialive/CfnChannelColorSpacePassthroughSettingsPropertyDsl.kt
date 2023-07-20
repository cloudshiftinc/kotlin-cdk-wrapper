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
public class CfnChannelColorSpacePassthroughSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ColorSpacePassthroughSettingsProperty.Builder =
        CfnChannel.ColorSpacePassthroughSettingsProperty.builder()

    public fun build(): CfnChannel.ColorSpacePassthroughSettingsProperty = cdkBuilder.build()
}
