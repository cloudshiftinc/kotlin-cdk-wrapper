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
public class CfnQuickConnectUserQuickConnectConfigPropertyDsl {
    private val cdkBuilder: CfnQuickConnect.UserQuickConnectConfigProperty.Builder =
        CfnQuickConnect.UserQuickConnectConfigProperty.builder()

    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    public fun userArn(userArn: String) {
        cdkBuilder.userArn(userArn)
    }

    public fun build(): CfnQuickConnect.UserQuickConnectConfigProperty = cdkBuilder.build()
}
