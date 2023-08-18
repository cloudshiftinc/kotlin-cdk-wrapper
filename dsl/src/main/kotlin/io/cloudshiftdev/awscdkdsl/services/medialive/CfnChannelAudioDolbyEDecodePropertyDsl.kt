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
 * AudioDolbyEDecodeProperty audioDolbyEDecodeProperty = AudioDolbyEDecodeProperty.builder()
 * .programSelection("programSelection")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiodolbyedecode.html)
 */
@CdkDslMarker
public class CfnChannelAudioDolbyEDecodePropertyDsl {
    private val cdkBuilder: CfnChannel.AudioDolbyEDecodeProperty.Builder =
        CfnChannel.AudioDolbyEDecodeProperty.builder()

    /** @param programSelection the value to be set. */
    public fun programSelection(programSelection: String) {
        cdkBuilder.programSelection(programSelection)
    }

    public fun build(): CfnChannel.AudioDolbyEDecodeProperty = cdkBuilder.build()
}
