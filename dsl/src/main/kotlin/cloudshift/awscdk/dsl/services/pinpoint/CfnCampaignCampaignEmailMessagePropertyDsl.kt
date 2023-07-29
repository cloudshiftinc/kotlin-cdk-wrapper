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
 * Specifies the content and "From" address for an email message that's sent to recipients of a
 * campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CampaignEmailMessageProperty campaignEmailMessageProperty =
 * CampaignEmailMessageProperty.builder()
 * .body("body")
 * .fromAddress("fromAddress")
 * .htmlBody("htmlBody")
 * .title("title")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignemailmessage.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignEmailMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignEmailMessageProperty.Builder =
        CfnCampaign.CampaignEmailMessageProperty.builder()

    /**
     * @param body The body of the email for recipients whose email clients don't render HTML
     *   content.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param fromAddress The verified email address to send the email from. The default address is
     *   the `FromAddress` specified for the email channel for the application.
     */
    public fun fromAddress(fromAddress: String) {
        cdkBuilder.fromAddress(fromAddress)
    }

    /**
     * @param htmlBody The body of the email, in HTML format, for recipients whose email clients
     *   render HTML content.
     */
    public fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
    }

    /** @param title The subject line, or title, of the email. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnCampaign.CampaignEmailMessageProperty = cdkBuilder.build()
}
