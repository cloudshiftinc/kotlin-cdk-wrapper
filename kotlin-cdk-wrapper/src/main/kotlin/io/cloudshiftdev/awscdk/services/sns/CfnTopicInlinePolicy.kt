@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

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
 * The `AWS::SNS::TopicInlinePolicy` resource associates one Amazon SNS topic with one policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicInlinePolicy cfnTopicInlinePolicy = CfnTopicInlinePolicy.Builder.create(this,
 * "MyCfnTopicInlinePolicy")
 * .policyDocument(policyDocument)
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html)
 */
public open class CfnTopicInlinePolicy(
  cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicInlinePolicyProps,
  ) :
      this(software.amazon.awscdk.services.sns.CfnTopicInlinePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTopicInlinePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicInlinePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTopicInlinePolicyProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A policy document that contains permissions to add to the specified Amazon SNS topic.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * A policy document that contains permissions to add to the specified Amazon SNS topic.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
   */
  public open fun topicArn(): String = unwrap(this).getTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
   */
  public open fun topicArn(`value`: String) {
    unwrap(this).setTopicArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.CfnTopicInlinePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A policy document that contains permissions to add to the specified Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
     * @param policyDocument A policy document that contains permissions to add to the specified
     * Amazon SNS topic. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-topicarn)
     * @param topicArn The Amazon Resource Name (ARN) of the topic to which you want to add the
     * policy. 
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicInlinePolicy.Builder =
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicy.Builder.create(scope, id)

    /**
     * A policy document that contains permissions to add to the specified Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
     * @param policyDocument A policy document that contains permissions to add to the specified
     * Amazon SNS topic. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-topicarn)
     * @param topicArn The Amazon Resource Name (ARN) of the topic to which you want to add the
     * policy. 
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicInlinePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicInlinePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicInlinePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicy):
        CfnTopicInlinePolicy = CfnTopicInlinePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTopicInlinePolicy):
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicy
  }
}
