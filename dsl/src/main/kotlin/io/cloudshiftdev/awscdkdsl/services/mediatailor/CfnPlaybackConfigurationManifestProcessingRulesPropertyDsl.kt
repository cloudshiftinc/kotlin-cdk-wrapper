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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * The configuration for manifest processing rules.
 *
 * Manifest processing rules enable customization of the personalized manifests created by
 * MediaTailor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * ManifestProcessingRulesProperty manifestProcessingRulesProperty =
 * ManifestProcessingRulesProperty.builder()
 * .adMarkerPassthrough(AdMarkerPassthroughProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-manifestprocessingrules.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl {
    private val cdkBuilder: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder =
        CfnPlaybackConfiguration.ManifestProcessingRulesProperty.builder()

    /**
     * @param adMarkerPassthrough For HLS, when set to `true` , MediaTailor passes through
     *   `EXT-X-CUE-IN` , `EXT-X-CUE-OUT` , and `EXT-X-SPLICEPOINT-SCTE35` ad markers from the
     *   origin manifest to the MediaTailor personalized manifest. No logic is applied to these ad
     *   markers. For example, if `EXT-X-CUE-OUT` has a value of `60` , but no ads are filled for
     *   that ad break, MediaTailor will not set the value to `0` .
     */
    public fun adMarkerPassthrough(adMarkerPassthrough: IResolvable) {
        cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
    }

    /**
     * @param adMarkerPassthrough For HLS, when set to `true` , MediaTailor passes through
     *   `EXT-X-CUE-IN` , `EXT-X-CUE-OUT` , and `EXT-X-SPLICEPOINT-SCTE35` ad markers from the
     *   origin manifest to the MediaTailor personalized manifest. No logic is applied to these ad
     *   markers. For example, if `EXT-X-CUE-OUT` has a value of `60` , but no ads are filled for
     *   that ad break, MediaTailor will not set the value to `0` .
     */
    public fun adMarkerPassthrough(
        adMarkerPassthrough: CfnPlaybackConfiguration.AdMarkerPassthroughProperty
    ) {
        cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
    }

    public fun build(): CfnPlaybackConfiguration.ManifestProcessingRulesProperty =
        cdkBuilder.build()
}
