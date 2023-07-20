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
public class CfnDecoderManifestNetworkInterfacesItemsPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder =
        CfnDecoderManifest.NetworkInterfacesItemsProperty.builder()

    public fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface)
    }

    public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface)
    }

    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    public fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface)
    }

    public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.NetworkInterfacesItemsProperty = cdkBuilder.build()
}
