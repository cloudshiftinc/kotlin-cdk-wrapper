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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelHlsOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsOutputSettingsProperty.Builder =
        CfnChannel.HlsOutputSettingsProperty.builder()

    public fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
    }

    public fun hlsSettings(hlsSettings: IResolvable) {
        cdkBuilder.hlsSettings(hlsSettings)
    }

    public fun hlsSettings(hlsSettings: CfnChannel.HlsSettingsProperty) {
        cdkBuilder.hlsSettings(hlsSettings)
    }

    public fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
    }

    public fun segmentModifier(segmentModifier: String) {
        cdkBuilder.segmentModifier(segmentModifier)
    }

    public fun build(): CfnChannel.HlsOutputSettingsProperty = cdkBuilder.build()
}
