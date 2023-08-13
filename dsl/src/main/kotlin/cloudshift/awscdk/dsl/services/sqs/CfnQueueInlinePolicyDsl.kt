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

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy
import software.constructs.Construct

/**
 * Schema for SQS QueueInlinePolicy.
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
     * A policy document that contains permissions to add to the specified SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains permissions to add to the specified SQS
     *   queue.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * A policy document that contains permissions to add to the specified SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains permissions to add to the specified SQS
     *   queue.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The URL of the SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-queue)
     *
     * @param queue The URL of the SQS queue.
     */
    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnQueueInlinePolicy = cdkBuilder.build()
}
