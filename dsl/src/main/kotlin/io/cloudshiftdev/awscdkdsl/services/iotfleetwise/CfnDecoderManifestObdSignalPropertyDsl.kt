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
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

/**
 * Information about signal messages using the on-board diagnostics (OBD) II protocol in a vehicle.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * ObdSignalProperty obdSignalProperty = ObdSignalProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html)
 */
@CdkDslMarker
public class CfnDecoderManifestObdSignalPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.ObdSignalProperty.Builder =
        CfnDecoderManifest.ObdSignalProperty.builder()

    /** @param bitMaskLength (Optional) The number of bits to mask in a message. */
    public fun bitMaskLength(bitMaskLength: String) {
        cdkBuilder.bitMaskLength(bitMaskLength)
    }

    /** @param bitRightShift (Optional) The number of positions to shift bits in the message. */
    public fun bitRightShift(bitRightShift: String) {
        cdkBuilder.bitRightShift(bitRightShift)
    }

    /** @param byteLength The length of a message. */
    public fun byteLength(byteLength: String) {
        cdkBuilder.byteLength(byteLength)
    }

    /**
     * @param offset The offset used to calculate the signal value. Combined with scaling, the
     *   calculation is `value = raw_value * scaling + offset` .
     */
    public fun offset(offset: String) {
        cdkBuilder.offset(offset)
    }

    /** @param pid The diagnostic code used to request data from a vehicle for this signal. */
    public fun pid(pid: String) {
        cdkBuilder.pid(pid)
    }

    /** @param pidResponseLength The length of the requested data. */
    public fun pidResponseLength(pidResponseLength: String) {
        cdkBuilder.pidResponseLength(pidResponseLength)
    }

    /** @param scaling A multiplier used to decode the message. */
    public fun scaling(scaling: String) {
        cdkBuilder.scaling(scaling)
    }

    /** @param serviceMode The mode of operation (diagnostic service) in a message. */
    public fun serviceMode(serviceMode: String) {
        cdkBuilder.serviceMode(serviceMode)
    }

    /** @param startByte Indicates the beginning of the message. */
    public fun startByte(startByte: String) {
        cdkBuilder.startByte(startByte)
    }

    public fun build(): CfnDecoderManifest.ObdSignalProperty = cdkBuilder.build()
}
