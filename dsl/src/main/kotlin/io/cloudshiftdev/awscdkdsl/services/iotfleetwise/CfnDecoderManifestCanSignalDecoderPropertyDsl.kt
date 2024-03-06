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
 * Information about signal decoder using the Controller Area Network (CAN) protocol.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CanSignalDecoderProperty canSignalDecoderProperty = CanSignalDecoderProperty.builder()
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
 * .fullyQualifiedName("fullyQualifiedName")
 * .interfaceId("interfaceId")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html)
 */
@CdkDslMarker
public class CfnDecoderManifestCanSignalDecoderPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.CanSignalDecoderProperty.Builder =
        CfnDecoderManifest.CanSignalDecoderProperty.builder()

    /**
     * @param canSignal Information about a single controller area network (CAN) signal and the
     *   messages it receives and transmits.
     */
    public fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal)
    }

    /**
     * @param canSignal Information about a single controller area network (CAN) signal and the
     *   messages it receives and transmits.
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
     * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies a
     *   protocol that defines how data is communicated between electronic control units (ECUs).
     *   `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is communicated
     *   between ECUs.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.CanSignalDecoderProperty = cdkBuilder.build()
}
