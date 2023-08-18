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
 * ObdSignalDecoderProperty obdSignalDecoderProperty = ObdSignalDecoderProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * .interfaceId("interfaceId")
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
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html)
 */
@CdkDslMarker
public class CfnDecoderManifestObdSignalDecoderPropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.ObdSignalDecoderProperty.Builder =
        CfnDecoderManifest.ObdSignalDecoderProperty.builder()

    /** @param fullyQualifiedName the value to be set. */
    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    /** @param interfaceId the value to be set. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /** @param obdSignal the value to be set. */
    public fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal)
    }

    /** @param obdSignal the value to be set. */
    public fun obdSignal(obdSignal: CfnDecoderManifest.ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.ObdSignalDecoderProperty = cdkBuilder.build()
}
