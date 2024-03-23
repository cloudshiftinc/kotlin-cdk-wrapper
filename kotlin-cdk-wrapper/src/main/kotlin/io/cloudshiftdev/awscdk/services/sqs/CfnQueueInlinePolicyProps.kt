@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnQueueInlinePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Object policyDocument;
 * CfnQueueInlinePolicyProps cfnQueueInlinePolicyProps = CfnQueueInlinePolicyProps.builder()
 * .policyDocument(policyDocument)
 * .queue("queue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html)
 */
public interface CfnQueueInlinePolicyProps {
  /**
   * A policy document that contains the permissions for the specified Amazon SQS queues.
   *
   * For more information about Amazon SQS policies, see [Using custom policies with the Amazon SQS
   * access policy
   * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
   */
  public fun policyDocument(): Any

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
   */
  public fun queue(): String

  /**
   * A builder for [CfnQueueInlinePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument A policy document that contains the permissions for the specified
     * Amazon SQS queues. 
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param queue The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    public fun queue(queue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps.builder()

    /**
     * @param policyDocument A policy document that contains the permissions for the specified
     * Amazon SQS queues. 
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param queue The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps,
  ) : CdkObject(cdkObject), CfnQueueInlinePolicyProps {
    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

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
     */
    override fun queue(): String = unwrap(this).getQueue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueInlinePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps):
        CfnQueueInlinePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueueInlinePolicyProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueInlinePolicyProps):
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps
  }
}
