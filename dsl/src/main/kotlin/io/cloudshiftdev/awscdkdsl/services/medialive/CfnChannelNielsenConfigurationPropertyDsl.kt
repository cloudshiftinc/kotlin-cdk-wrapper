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
 * The settings to configure Nielsen watermarks.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * NielsenConfigurationProperty nielsenConfigurationProperty =
 * NielsenConfigurationProperty.builder()
 * .distributorId("distributorId")
 * .nielsenPcmToId3Tagging("nielsenPcmToId3Tagging")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsenconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelNielsenConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.NielsenConfigurationProperty.Builder =
        CfnChannel.NielsenConfigurationProperty.builder()

    /** @param distributorId Enter the Distributor ID assigned to your organization by Nielsen. */
    public fun distributorId(distributorId: String) {
        cdkBuilder.distributorId(distributorId)
    }

    /** @param nielsenPcmToId3Tagging Enables Nielsen PCM to ID3 tagging. */
    public fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String) {
        cdkBuilder.nielsenPcmToId3Tagging(nielsenPcmToId3Tagging)
    }

    public fun build(): CfnChannel.NielsenConfigurationProperty = cdkBuilder.build()
}
