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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * QueueSAMPTProperty queueSAMPTProperty = QueueSAMPTProperty.builder()
 * .queueName("queueName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-queuesampt.html)
 */
@CdkDslMarker
public class CfnFunctionQueueSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.QueueSAMPTProperty.Builder =
        CfnFunction.QueueSAMPTProperty.builder()

    /** @param queueName the value to be set. */
    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    public fun build(): CfnFunction.QueueSAMPTProperty = cdkBuilder.build()
}
