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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the DVB Sub captions to extract from the input.
 *
 * The parent of this entity is CaptionSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * DvbSubSourceSettingsProperty dvbSubSourceSettingsProperty =
 * DvbSubSourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html)
 */
@CdkDslMarker
public class CfnChannelDvbSubSourceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbSubSourceSettingsProperty.Builder =
        CfnChannel.DvbSubSourceSettingsProperty.builder()

    /**
     * @param ocrLanguage If you will configure a WebVTT caption description that references this
     *   caption selector, use this field to provide the language to consider when translating the
     *   image-based source to text.
     */
    public fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
    }

    /**
     * @param pid When using DVB-Sub with burn-in or SMPTE-TT, use this PID for the source content.
     *   It is unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of
     *   selectors.
     */
    public fun pid(pid: Number) {
        cdkBuilder.pid(pid)
    }

    public fun build(): CfnChannel.DvbSubSourceSettingsProperty = cdkBuilder.build()
}
