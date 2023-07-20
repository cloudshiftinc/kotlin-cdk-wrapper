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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import kotlin.String

@CdkDslMarker
public class CfnDecoderManifestSignalDecodersItemsPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.SignalDecodersItemsProperty.Builder =
        CfnDecoderManifest.SignalDecodersItemsProperty.builder()

    public fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal)
    }

    public fun canSignal(canSignal: CfnDecoderManifest.CanSignalProperty) {
        cdkBuilder.canSignal(canSignal)
    }

    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    public fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal)
    }

    public fun obdSignal(obdSignal: CfnDecoderManifest.ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.SignalDecodersItemsProperty = cdkBuilder.build()
}
