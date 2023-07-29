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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps

/**
 * Properties for defining a `CfnQueuePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Object policyDocument;
 * CfnQueuePolicyProps cfnQueuePolicyProps = CfnQueuePolicyProps.builder()
 * .policyDocument(policyDocument)
 * .queues(List.of("queues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html)
 */
@CdkDslMarker
public class CfnQueuePolicyPropsDsl {
    private val cdkBuilder: CfnQueuePolicyProps.Builder = CfnQueuePolicyProps.builder()

    private val _queues: MutableList<String> = mutableListOf()

    /**
     * @param policyDocument A policy document that contains the permissions for the specified
     *   Amazon SQS queues. For more information about Amazon SQS policies, see
     *   [Using custom policies with the Amazon SQS access policy language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     *   in the *Amazon SQS Developer Guide* .
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * @param policyDocument A policy document that contains the permissions for the specified
     *   Amazon SQS queues. For more information about Amazon SQS policies, see
     *   [Using custom policies with the Amazon SQS access policy language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     *   in the *Amazon SQS Developer Guide* .
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param queues The URLs of the queues to which you want to add the policy. You can use the
     *   `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     *   function to specify an
     *   `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     *   resource.
     */
    public fun queues(vararg queues: String) {
        _queues.addAll(listOf(*queues))
    }

    /**
     * @param queues The URLs of the queues to which you want to add the policy. You can use the
     *   `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     *   function to specify an
     *   `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     *   resource.
     */
    public fun queues(queues: Collection<String>) {
        _queues.addAll(queues)
    }

    public fun build(): CfnQueuePolicyProps {
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        return cdkBuilder.build()
    }
}
