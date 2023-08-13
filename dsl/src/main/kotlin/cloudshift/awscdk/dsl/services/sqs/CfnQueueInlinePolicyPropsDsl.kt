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
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps

/**
 * Properties for defining a `CfnQueueInlinePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Object policyDocument;
 * CfnQueueInlinePolicyProps cfnQueueInlinePolicyProps = CfnQueueInlinePolicyProps.builder()
 * .policyDocument(policyDocument)
 * .queue("queue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html)
 */
@CdkDslMarker
public class CfnQueueInlinePolicyPropsDsl {
    private val cdkBuilder: CfnQueueInlinePolicyProps.Builder = CfnQueueInlinePolicyProps.builder()

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SQS
     *   queue.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SQS
     *   queue.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param queue The URL of the SQS queue. */
    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnQueueInlinePolicyProps = cdkBuilder.build()
}
