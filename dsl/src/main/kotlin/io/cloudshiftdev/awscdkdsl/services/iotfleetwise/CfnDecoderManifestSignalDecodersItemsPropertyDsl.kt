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
 * Information about a signal decoder.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * SignalDecodersItemsProperty signalDecodersItemsProperty = SignalDecodersItemsProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * .interfaceId("interfaceId")
 * .type("type")
 * // the properties below are optional
 * .canSignal(CanSignalProperty.builder()
 * .factor("factor")
 * .isBigEndian("isBigEndian")
 * .isSigned("isSigned")
 * .length("length")
 * .messageId("messageId")
 * .offset("offset")
 * .startBit("startBit")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .obdSignal(ObdSignalProperty.builder()
 * .byteLength("byteLength")
 * .offset("offset")
 * .pid("pid")
 * .pidResponseLength("pidResponseLength")
 * .scaling("scaling")
 * .serviceMode("serviceMode")
 * .startByte("startByte")
 * // the properties below are optional
 * .bitMaskLength("bitMaskLength")
 * .bitRightShift("bitRightShift")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html)
 */
@CdkDslMarker
public class CfnDecoderManifestSignalDecodersItemsPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.SignalDecodersItemsProperty.Builder =
        CfnDecoderManifest.SignalDecodersItemsProperty.builder()

    /**
     * @param canSignal (Optional) Information about a single controller area network (CAN) signal
     *   and the messages it receives and transmits.
     */
    public fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal)
    }

    /**
     * @param canSignal (Optional) Information about a single controller area network (CAN) signal
     *   and the messages it receives and transmits.
     */
    public fun canSignal(canSignal: CfnDecoderManifest.CanSignalProperty) {
        cdkBuilder.canSignal(canSignal)
    }

    /**
     * @param fullyQualifiedName The fully qualified name of a signal decoder as defined in a
     *   vehicle model.
     */
    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    /**
     * @param interfaceId The ID of a network interface that specifies what network protocol a
     *   vehicle follows.
     */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /**
     * @param obdSignal (Optional) Information about signal messages using the on-board diagnostics
     *   (OBD) II protocol in a vehicle.
     */
    public fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal)
    }

    /**
     * @param obdSignal (Optional) Information about signal messages using the on-board diagnostics
     *   (OBD) II protocol in a vehicle.
     */
    public fun obdSignal(obdSignal: CfnDecoderManifest.ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal)
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

    public fun build(): CfnDecoderManifest.SignalDecodersItemsProperty = cdkBuilder.build()
}
