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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnQuickConnect

/**
 * Contains information about a phone number for a quick connect.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * PhoneNumberQuickConnectConfigProperty phoneNumberQuickConnectConfigProperty =
 * PhoneNumberQuickConnectConfigProperty.builder()
 * .phoneNumber("phoneNumber")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-phonenumberquickconnectconfig.html)
 */
@CdkDslMarker
public class CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl {
    private val cdkBuilder: CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder =
        CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.builder()

    /** @param phoneNumber The phone number in E.164 format. */
    public fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
    }

    public fun build(): CfnQuickConnect.PhoneNumberQuickConnectConfigProperty = cdkBuilder.build()
}
