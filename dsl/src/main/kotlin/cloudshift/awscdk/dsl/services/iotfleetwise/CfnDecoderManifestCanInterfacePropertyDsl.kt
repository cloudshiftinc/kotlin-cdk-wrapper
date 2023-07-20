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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import kotlin.String

@CdkDslMarker
public class CfnDecoderManifestCanInterfacePropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.CanInterfaceProperty.Builder =
        CfnDecoderManifest.CanInterfaceProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun protocolName(protocolName: String) {
        cdkBuilder.protocolName(protocolName)
    }

    public fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    public fun build(): CfnDecoderManifest.CanInterfaceProperty = cdkBuilder.build()
}
