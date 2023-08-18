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

package io.cloudshiftdev.awscdkdsl.services.ssmincidents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The SNS topic that's used by AWS Chatbot to notify the incidents chat channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * NotificationTargetItemProperty notificationTargetItemProperty =
 * NotificationTargetItemProperty.builder()
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-notificationtargetitem.html)
 */
@CdkDslMarker
public class CfnResponsePlanNotificationTargetItemPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.NotificationTargetItemProperty.Builder =
        CfnResponsePlan.NotificationTargetItemProperty.builder()

    /** @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic. */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnResponsePlan.NotificationTargetItemProperty = cdkBuilder.build()
}
