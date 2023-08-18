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

    /** @param canSignal the value to be set. */
    public fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal)
    }

    /** @param canSignal the value to be set. */
    public fun canSignal(canSignal: CfnDecoderManifest.CanSignalProperty) {
        cdkBuilder.canSignal(canSignal)
    }

    /** @param fullyQualifiedName the value to be set. */
    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    /** @param interfaceId the value to be set. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.CanSignalDecoderProperty = cdkBuilder.build()
}
