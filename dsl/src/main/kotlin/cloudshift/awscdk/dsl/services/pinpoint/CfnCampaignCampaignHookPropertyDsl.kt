@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String

/**
 * Specifies settings for invoking an Lambda function that customizes a segment for a campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CampaignHookProperty campaignHookProperty = CampaignHookProperty.builder()
 * .lambdaFunctionName("lambdaFunctionName")
 * .mode("mode")
 * .webUrl("webUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignhook.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignHookPropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignHookProperty.Builder =
        CfnCampaign.CampaignHookProperty.builder()

    /**
     * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function that
     * Amazon Pinpoint invokes to customize a segment for a campaign.
     */
    public fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
    }

    /**
     * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values
     * are:.
     * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
     * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
     * custom channel. This functionality is not supported anymore. To send a campaign through a custom
     * channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of the
     * campaign.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
     */
    public fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
    }

    public fun build(): CfnCampaign.CampaignHookProperty = cdkBuilder.build()
}
