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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action adds a header to the received email.
 *
 * For information about adding a header using a receipt rule, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-add-header.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * AddHeaderActionProperty addHeaderActionProperty = AddHeaderActionProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleAddHeaderActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.AddHeaderActionProperty.Builder =
        CfnReceiptRule.AddHeaderActionProperty.builder()

    /**
     * @param headerName The name of the header to add to the incoming message. The name must
     *   contain at least one character, and can contain up to 50 characters. It consists of
     *   alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     */
    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    /**
     * @param headerValue The content to include in the header. This value can contain up to 2048
     *   characters. It can't contain newline ( `\n` ) or carriage return ( `\r` ) characters.
     */
    public fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
    }

    public fun build(): CfnReceiptRule.AddHeaderActionProperty = cdkBuilder.build()
}
