package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueuePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The provider-assigned unique ID for this managed resource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

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
  public open fun queues(): List<String> = unwrap(this).getQueues()

  /**
   * The URLs of the queues to which you want to add the policy.
   */
  public open fun queues(`value`: List<String>) {
    unwrap(this).setQueues(`value`)
  }

  /**
   * The URLs of the queues to which you want to add the policy.
   */
  public open fun queues(vararg `value`: String): Unit = queues(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sqs.CfnQueuePolicy].
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-policydocument)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-queues)
     * @param queues The URLs of the queues to which you want to add the policy. 
     */
    public fun queues(queues: List<String>)

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
     * @param queues The URLs of the queues to which you want to add the policy. 
     */
    public fun queues(vararg queues: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueuePolicy.Builder =
        software.amazon.awscdk.services.sqs.CfnQueuePolicy.Builder.create(scope, id)

    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues.
     *
     * For more information about Amazon SQS policies, see [Using custom policies with the Amazon
     * SQS access policy
     * language](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-policydocument)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-queues)
     * @param queues The URLs of the queues to which you want to add the policy. 
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html#cfn-sqs-queuepolicy-queues)
     * @param queues The URLs of the queues to which you want to add the policy. 
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueuePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sqs.CfnQueuePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueuePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueuePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicy): CfnQueuePolicy
        = CfnQueuePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnQueuePolicy): software.amazon.awscdk.services.sqs.CfnQueuePolicy
        = wrapped.cdkObject
  }
}
