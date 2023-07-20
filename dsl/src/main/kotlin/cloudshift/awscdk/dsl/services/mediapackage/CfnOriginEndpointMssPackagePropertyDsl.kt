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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import kotlin.Number

@CdkDslMarker
public class CfnOriginEndpointMssPackagePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.MssPackageProperty.Builder =
        CfnOriginEndpoint.MssPackageProperty.builder()

    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryption(encryption: CfnOriginEndpoint.MssEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnOriginEndpoint.MssPackageProperty = cdkBuilder.build()
}
