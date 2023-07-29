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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Selector for HLS audio rendition.
 *
 * The parent of this entity is AudioSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioHlsRenditionSelectionProperty audioHlsRenditionSelectionProperty =
 * AudioHlsRenditionSelectionProperty.builder()
 * .groupId("groupId")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiohlsrenditionselection.html)
 */
@CdkDslMarker
public class CfnChannelAudioHlsRenditionSelectionPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioHlsRenditionSelectionProperty.Builder =
        CfnChannel.AudioHlsRenditionSelectionProperty.builder()

    /**
     * @param groupId Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio
     *   rendition.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /** @param name Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnChannel.AudioHlsRenditionSelectionProperty = cdkBuilder.build()
}
