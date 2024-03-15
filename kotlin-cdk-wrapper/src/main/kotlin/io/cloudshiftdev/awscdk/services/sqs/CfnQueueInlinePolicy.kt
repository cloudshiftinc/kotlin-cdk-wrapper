@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SQS::QueueInlinePolicy` resource associates one Amazon SQS queue with one policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
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
public open class CfnQueueInlinePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A policy document that contains the permissions for the specified Amazon SQS queues.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * A policy document that contains the permissions for the specified Amazon SQS queues.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The URLs of the queues to which you want to add the policy.
   */
  public open fun queue(): String = unwrap(this).getQueue()

  /**
   * The URLs of the queues to which you want to add the policy.
   */
  public open fun queue(`value`: String) {
    unwrap(this).setQueue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sqs.CfnQueueInlinePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     * @param policyDocument A policy document that contains the permissions for the specified
     * Amazon SQS queues. 
     */
    public fun policyDocument(policyDocument: Any)

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
     * @param queue The URLs of the queues to which you want to add the policy. 
     */
    public fun queue(queue: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy.Builder.create(scope, id)

    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html#cfn-sqs-queueinlinepolicy-policydocument)
     * @param policyDocument A policy document that contains the permissions for the specified
     * Amazon SQS queues. 
     */
    override fun policyDocument(policyDocument: Any) {
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
     * @param queue The URLs of the queues to which you want to add the policy. 
     */
    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueueInlinePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueueInlinePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy):
        CfnQueueInlinePolicy = CfnQueueInlinePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnQueueInlinePolicy):
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy = wrapped.cdkObject
  }
}
