@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotfleetwise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

/**
 * (Optional) A list of information about available network interfaces.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * NetworkInterfacesItemsProperty networkInterfacesItemsProperty =
 * NetworkInterfacesItemsProperty.builder()
 * .interfaceId("interfaceId")
 * .type("type")
 * // the properties below are optional
 * .canInterface(CanInterfaceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .protocolName("protocolName")
 * .protocolVersion("protocolVersion")
 * .build())
 * .obdInterface(ObdInterfaceProperty.builder()
 * .name("name")
 * .requestMessageId("requestMessageId")
 * // the properties below are optional
 * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
 * .hasTransmissionEcu("hasTransmissionEcu")
 * .obdStandard("obdStandard")
 * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
 * .useExtendedIds("useExtendedIds")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html)
 */
@CdkDslMarker
public class CfnDecoderManifestNetworkInterfacesItemsPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder =
        CfnDecoderManifest.NetworkInterfacesItemsProperty.builder()

    /** @param canInterface the value to be set. */
    public fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface)
    }

    /** @param canInterface the value to be set. */
    public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface)
    }

    /** @param interfaceId the value to be set. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /** @param obdInterface the value to be set. */
    public fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface)
    }

    /** @param obdInterface the value to be set. */
    public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.NetworkInterfacesItemsProperty = cdkBuilder.build()
}
