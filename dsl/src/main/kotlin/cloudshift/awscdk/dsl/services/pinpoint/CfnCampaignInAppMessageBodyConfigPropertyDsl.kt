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
 * Specifies the configuration of main body text of the in-app message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * InAppMessageBodyConfigProperty inAppMessageBodyConfigProperty =
 * InAppMessageBodyConfigProperty.builder()
 * .alignment("alignment")
 * .body("body")
 * .textColor("textColor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagebodyconfig.html)
 */
@CdkDslMarker
public class CfnCampaignInAppMessageBodyConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.InAppMessageBodyConfigProperty.Builder =
        CfnCampaign.InAppMessageBodyConfigProperty.builder()

    /**
     * @param alignment The text alignment of the main body text of the message. Acceptable values:
     *   `LEFT` , `CENTER` , `RIGHT` .
     */
    public fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
    }

    /** @param body The main body text of the message. */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param textColor The color of the body text, expressed as a string consisting of a hex color
     *   code (such as "#000000" for black).
     */
    public fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnCampaign.InAppMessageBodyConfigProperty = cdkBuilder.build()
}
