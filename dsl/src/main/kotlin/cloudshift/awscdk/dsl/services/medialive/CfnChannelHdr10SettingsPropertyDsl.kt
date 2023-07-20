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
import kotlin.Number

@CdkDslMarker
public class CfnChannelHdr10SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Hdr10SettingsProperty.Builder =
        CfnChannel.Hdr10SettingsProperty.builder()

    public fun maxCll(maxCll: Number) {
        cdkBuilder.maxCll(maxCll)
    }

    public fun maxFall(maxFall: Number) {
        cdkBuilder.maxFall(maxFall)
    }

    public fun build(): CfnChannel.Hdr10SettingsProperty = cdkBuilder.build()
}
