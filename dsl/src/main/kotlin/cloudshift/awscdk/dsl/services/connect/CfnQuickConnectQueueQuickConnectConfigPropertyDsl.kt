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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnQuickConnect

/**
 * Contains information about a queue for a quick connect.
 *
 * The flow must be of type Transfer to Queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * QueueQuickConnectConfigProperty queueQuickConnectConfigProperty =
 * QueueQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .queueArn("queueArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html)
 */
@CdkDslMarker
public class CfnQuickConnectQueueQuickConnectConfigPropertyDsl {
    private val cdkBuilder: CfnQuickConnect.QueueQuickConnectConfigProperty.Builder =
        CfnQuickConnect.QueueQuickConnectConfigProperty.builder()

    /** @param contactFlowArn The Amazon Resource Name (ARN) of the flow. */
    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    /** @param queueArn The Amazon Resource Name (ARN) of the queue. */
    public fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
    }

    public fun build(): CfnQuickConnect.QueueQuickConnectConfigProperty = cdkBuilder.build()
}
