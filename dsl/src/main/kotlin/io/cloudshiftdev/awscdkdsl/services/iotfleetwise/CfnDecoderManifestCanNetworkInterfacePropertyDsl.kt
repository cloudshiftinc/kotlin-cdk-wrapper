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
 * Represents a node and its specifications in an in-vehicle communication network.
 *
 * All signal decoders must be associated with a network node.
 *
 * To return this information about all the network interfaces specified in a decoder manifest, use
 * the
 * [ListDecoderManifestNetworkInterfaces](https://docs.aws.amazon.com/iot-fleetwise/latest/APIReference/API_ListDecoderManifestNetworkInterfaces.html)
 * in the *AWS IoT FleetWise API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CanNetworkInterfaceProperty canNetworkInterfaceProperty = CanNetworkInterfaceProperty.builder()
 * .canInterface(CanInterfaceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .protocolName("protocolName")
 * .protocolVersion("protocolVersion")
 * .build())
 * .interfaceId("interfaceId")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html)
 */
@CdkDslMarker
public class CfnDecoderManifestCanNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.CanNetworkInterfaceProperty.Builder =
        CfnDecoderManifest.CanNetworkInterfaceProperty.builder()

    /**
     * @param canInterface Information about a network interface specified by the Controller Area
     *   Network (CAN) protocol.
     */
    public fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface)
    }

    /**
     * @param canInterface Information about a network interface specified by the Controller Area
     *   Network (CAN) protocol.
     */
    public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface)
    }

    /** @param interfaceId The ID of the network interface. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
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

    public fun build(): CfnDecoderManifest.CanNetworkInterfaceProperty = cdkBuilder.build()
}
