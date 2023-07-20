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
public class CfnDecoderManifestCanSignalPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.CanSignalProperty.Builder =
        CfnDecoderManifest.CanSignalProperty.builder()

    public fun factor(factor: String) {
        cdkBuilder.factor(factor)
    }

    public fun isBigEndian(isBigEndian: String) {
        cdkBuilder.isBigEndian(isBigEndian)
    }

    public fun isSigned(isSigned: String) {
        cdkBuilder.isSigned(isSigned)
    }

    public fun length(length: String) {
        cdkBuilder.length(length)
    }

    public fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun offset(offset: String) {
        cdkBuilder.offset(offset)
    }

    public fun startBit(startBit: String) {
        cdkBuilder.startBit(startBit)
    }

    public fun build(): CfnDecoderManifest.CanSignalProperty = cdkBuilder.build()
}
