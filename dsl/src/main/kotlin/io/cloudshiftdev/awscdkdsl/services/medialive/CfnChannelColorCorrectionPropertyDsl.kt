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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ColorCorrectionProperty colorCorrectionProperty = ColorCorrectionProperty.builder()
 * .inputColorSpace("inputColorSpace")
 * .outputColorSpace("outputColorSpace")
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-colorcorrection.html)
 */
@CdkDslMarker
public class CfnChannelColorCorrectionPropertyDsl {
    private val cdkBuilder: CfnChannel.ColorCorrectionProperty.Builder =
        CfnChannel.ColorCorrectionProperty.builder()

    /** @param inputColorSpace the value to be set. */
    public fun inputColorSpace(inputColorSpace: String) {
        cdkBuilder.inputColorSpace(inputColorSpace)
    }

    /** @param outputColorSpace the value to be set. */
    public fun outputColorSpace(outputColorSpace: String) {
        cdkBuilder.outputColorSpace(outputColorSpace)
    }

    /** @param uri the value to be set. */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnChannel.ColorCorrectionProperty = cdkBuilder.build()
}
