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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * Parameters for Microsoft Smooth Streaming packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * MssPackageProperty mssPackageProperty = MssPackageProperty.builder()
 * .encryption(MssEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * .build())
 * .manifestWindowSeconds(123)
 * .segmentDurationSeconds(123)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html)
 */
@CdkDslMarker
public class CfnOriginEndpointMssPackagePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.MssPackageProperty.Builder =
        CfnOriginEndpoint.MssPackageProperty.builder()

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnOriginEndpoint.MssEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /** @param manifestWindowSeconds Time window (in seconds) contained in each manifest. */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments are
     *   rounded to the nearest multiple of the source fragment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /**
     * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
     */
    public fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection)
    }

    /**
     * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
     */
    public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnOriginEndpoint.MssPackageProperty = cdkBuilder.build()
}
