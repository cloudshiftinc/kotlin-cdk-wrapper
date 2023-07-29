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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the contents of a message that's sent through a custom channel to recipients of a
 * campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CampaignCustomMessageProperty campaignCustomMessageProperty =
 * CampaignCustomMessageProperty.builder()
 * .data("data")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigncustommessage.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignCustomMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignCustomMessageProperty.Builder =
        CfnCampaign.CampaignCustomMessageProperty.builder()

    /**
     * @param data The raw, JSON-formatted string to use as the payload for the message. The maximum
     *   size is 5 KB.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    public fun build(): CfnCampaign.CampaignCustomMessageProperty = cdkBuilder.build()
}
