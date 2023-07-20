@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnQuickConnect
import kotlin.String

@CdkDslMarker
public class CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl {
    private val cdkBuilder: CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder =
        CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.builder()

    public fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
    }

    public fun build(): CfnQuickConnect.PhoneNumberQuickConnectConfigProperty = cdkBuilder.build()
}
