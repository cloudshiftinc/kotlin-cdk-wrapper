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

package io.cloudshiftdev.awscdkdsl.services.sqs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy
import software.constructs.Construct

/**
 * The `AWS::SQS::QueueInlinePolicy` resource associates one Amazon SQS queue with one policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Object policyDocument;
 * CfnQueueInlinePolicy cfnQueueInlinePolicy = CfnQueueInlinePolicy.Builder.create(this,
 * "MyCfnQueueInlinePolicy")
 * .policyDocument(policyDocument)
 * .queue("queue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html)
 */
@CdkDslMarker
public class CfnQueueInlinePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnQueueInlinePolicy.Builder =
        CfnQueueInlinePolicy.Builder.create(scope, id)

    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see
     * [Using custom policies with the Amazon SQS access policy language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains the permissions for the specified
     *   Amazon SQS queues.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see
     * [Using custom policies with the Amazon SQS access policy language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains the permissions for the specified
     *   Amazon SQS queues.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The URLs of the queues to which you want to add the policy.
     *
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-queue)
     *
     * @param queue The URLs of the queues to which you want to add the policy.
     */
    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnQueueInlinePolicy = cdkBuilder.build()
}
