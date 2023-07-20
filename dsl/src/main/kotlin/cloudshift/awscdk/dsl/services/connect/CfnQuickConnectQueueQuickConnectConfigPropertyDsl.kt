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
public class CfnQuickConnectQueueQuickConnectConfigPropertyDsl {
    private val cdkBuilder: CfnQuickConnect.QueueQuickConnectConfigProperty.Builder =
        CfnQuickConnect.QueueQuickConnectConfigProperty.builder()

    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    public fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
    }

    public fun build(): CfnQuickConnect.QueueQuickConnectConfigProperty = cdkBuilder.build()
}
