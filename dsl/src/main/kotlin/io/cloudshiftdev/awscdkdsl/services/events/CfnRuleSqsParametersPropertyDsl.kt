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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

/**
 * This structure includes the custom parameter to be used when the target is an SQS FIFO queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * SqsParametersProperty sqsParametersProperty = SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html)
 */
@CdkDslMarker
public class CfnRuleSqsParametersPropertyDsl {
    private val cdkBuilder: CfnRule.SqsParametersProperty.Builder =
        CfnRule.SqsParametersProperty.builder()

    /** @param messageGroupId The FIFO message group ID to use as the target. */
    public fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
    }

    public fun build(): CfnRule.SqsParametersProperty = cdkBuilder.build()
}
