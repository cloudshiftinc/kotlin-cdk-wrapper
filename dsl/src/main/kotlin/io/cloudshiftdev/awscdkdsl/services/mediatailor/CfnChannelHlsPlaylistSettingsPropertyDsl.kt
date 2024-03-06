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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * HLS playlist configuration parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * HlsPlaylistSettingsProperty hlsPlaylistSettingsProperty = HlsPlaylistSettingsProperty.builder()
 * .adMarkupType(List.of("adMarkupType"))
 * .manifestWindowSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsPlaylistSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsPlaylistSettingsProperty.Builder =
        CfnChannel.HlsPlaylistSettingsProperty.builder()

    private val _adMarkupType: MutableList<String> = mutableListOf()

    /**
     * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup. Specify
     *   `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify `SCTE35_ENHANCED` to
     *   use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
     */
    public fun adMarkupType(vararg adMarkupType: String) {
        _adMarkupType.addAll(listOf(*adMarkupType))
    }

    /**
     * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup. Specify
     *   `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify `SCTE35_ENHANCED` to
     *   use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
     */
    public fun adMarkupType(adMarkupType: Collection<String>) {
        _adMarkupType.addAll(adMarkupType)
    }

    /**
     * @param manifestWindowSeconds The total duration (in seconds) of each manifest. Minimum value:
     *   `30` seconds. Maximum value: `3600` seconds.
     */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    public fun build(): CfnChannel.HlsPlaylistSettingsProperty {
        if (_adMarkupType.isNotEmpty()) cdkBuilder.adMarkupType(_adMarkupType)
        return cdkBuilder.build()
    }
}
