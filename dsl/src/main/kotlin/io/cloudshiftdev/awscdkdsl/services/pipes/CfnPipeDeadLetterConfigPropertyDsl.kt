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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * A `DeadLetterConfig` object that contains information about a dead-letter queue configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-deadletterconfig.html)
 */
@CdkDslMarker
public class CfnPipeDeadLetterConfigPropertyDsl {
    private val cdkBuilder: CfnPipe.DeadLetterConfigProperty.Builder =
        CfnPipe.DeadLetterConfigProperty.builder()

    /**
     * @param arn The ARN of the specified target for the dead-letter queue. For Amazon Kinesis
     *   stream and Amazon DynamoDB stream sources, specify either an Amazon SNS topic or Amazon SQS
     *   queue ARN.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnPipe.DeadLetterConfigProperty = cdkBuilder.build()
}
