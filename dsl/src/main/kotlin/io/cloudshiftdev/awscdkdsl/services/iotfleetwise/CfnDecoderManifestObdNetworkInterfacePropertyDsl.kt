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
 * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * ObdNetworkInterfaceProperty obdNetworkInterfaceProperty = ObdNetworkInterfaceProperty.builder()
 * .interfaceId("interfaceId")
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
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html)
 */
@CdkDslMarker
public class CfnDecoderManifestObdNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.ObdNetworkInterfaceProperty.Builder =
        CfnDecoderManifest.ObdNetworkInterfaceProperty.builder()

    /** @param interfaceId The ID of the network interface. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /**
     * @param obdInterface (Optional) Information about a network interface specified by the
     *   On-board diagnostic (OBD) II protocol.
     */
    public fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface)
    }

    /**
     * @param obdInterface (Optional) Information about a network interface specified by the
     *   On-board diagnostic (OBD) II protocol.
     */
    public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface)
    }

    /**
     * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies a
     *   protocol that defines how data is communicated between electronic control units (ECUs).
     *   `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is communicated
     *   between ECUs.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.ObdNetworkInterfaceProperty = cdkBuilder.build()
}
