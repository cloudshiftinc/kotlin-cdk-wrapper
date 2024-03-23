@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnQueuePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Object policyDocument;
 * CfnQueuePolicyProps cfnQueuePolicyProps = CfnQueuePolicyProps.builder()
 * .policyDocument(policyDocument)
 * .queues(List.of("queues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html)
 */
public interface CfnQueuePolicyProps {
  /**
   * A policy document that contains the permissions for the specified Amazon SQS queues.
   *
   * For more information about Amazon SQS policies, see [Using custom policies with the Amazon SQS
   * access policy
   * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-policydocument)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-queues)
   */
  public fun queues(): List<String>

  /**
   * A builder for [CfnQueuePolicyProps]
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
     * @param queues The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    public fun queues(queues: List<String>)

    /**
     * @param queues The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    public fun queues(vararg queues: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.builder()

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
     * @param queues The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    /**
     * @param queues The URLs of the queues to which you want to add the policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SQS::Queue](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)`
     * resource.
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueuePolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps,
  ) : CdkObject(cdkObject), CfnQueuePolicyProps {
    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-policydocument)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-queues)
     */
    override fun queues(): List<String> = unwrap(this).getQueues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueuePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps):
        CfnQueuePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueuePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueuePolicyProps):
        software.amazon.awscdk.services.sqs.CfnQueuePolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
  }
}
