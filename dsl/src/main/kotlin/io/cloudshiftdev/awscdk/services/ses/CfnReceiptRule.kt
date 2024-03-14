package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReceiptRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of an existing rule after which the new rule is placed.
   */
  public open fun after(): String? = unwrap(this).getAfter()

  /**
   * The name of an existing rule after which the new rule is placed.
   */
  public open fun after(`value`: String) {
    unwrap(this).setAfter(`value`)
  }

  /**
   *
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
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   */
  public open fun rule(): Any = unwrap(this).getRule()

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   */
  public open fun rule(`value`: IResolvable) {
    unwrap(this).setRule(`value`.let(IResolvable::unwrap))
  }

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   */
  public open fun rule(`value`: RuleProperty) {
    unwrap(this).setRule(`value`.let(RuleProperty::unwrap))
  }

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a76384e5dcab32725f75a952ba47ab4916c9cbed9c9c72a971ba8525237386f4")
  public open fun rule(`value`: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(`value`))

  /**
   * The name of the rule set where the receipt rule is added.
   */
  public open fun ruleSetName(): String = unwrap(this).getRuleSetName()

  /**
   * The name of the rule set where the receipt rule is added.
   */
  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnReceiptRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of an existing rule after which the new rule is placed.
     *
     * If this parameter is null, the new rule is inserted at the beginning of the rule list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
     * @param after The name of an existing rule after which the new rule is placed. 
     */
    public fun after(after: String)

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    public fun rule(rule: IResolvable)

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    public fun rule(rule: RuleProperty)

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b403cdfc8768d3f05c8e81b7694f70ccaa205d6434a849f7d762c120d77f3")
    public fun rule(rule: RuleProperty.Builder.() -> Unit)

    /**
     * The name of the rule set where the receipt rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
     * @param ruleSetName The name of the rule set where the receipt rule is added. 
     */
    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRule.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRule.Builder.create(scope, id)

    /**
     * The name of an existing rule after which the new rule is placed.
     *
     * If this parameter is null, the new rule is inserted at the beginning of the rule list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
     * @param after The name of an existing rule after which the new rule is placed. 
     */
    override fun after(after: String) {
      cdkBuilder.after(after)
    }

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable::unwrap))
    }

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    override fun rule(rule: RuleProperty) {
      cdkBuilder.rule(rule.let(RuleProperty::unwrap))
    }

    /**
     * A data structure that contains the specified rule's name, actions, recipients, domains,
     * enabled status, scan status, and TLS policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
     * @param rule A data structure that contains the specified rule's name, actions, recipients,
     * domains, enabled status, scan status, and TLS policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b403cdfc8768d3f05c8e81b7694f70ccaa205d6434a849f7d762c120d77f3")
    override fun rule(rule: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(rule))

    /**
     * The name of the rule set where the receipt rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
     * @param ruleSetName The name of the rule set where the receipt rule is added. 
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnReceiptRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReceiptRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReceiptRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule): CfnReceiptRule
        = CfnReceiptRule(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptRule): software.amazon.awscdk.services.ses.CfnReceiptRule
        = wrapped.cdkObject
  }

  public interface LambdaActionProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function.
     *
     * An example of an AWS Lambda function ARN is
     * `arn:aws:lambda:us-west-2:account-id:function:MyFunction` . For more information about AWS
     * Lambda, see the [AWS Lambda Developer
     * Guide](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
     */
    public fun functionArn(): String

    /**
     * The invocation type of the AWS Lambda function.
     *
     * An invocation type of `RequestResponse` means that the execution of the function immediately
     * results in a response, and a value of `Event` means that the function is invoked asynchronously.
     * The default value is `Event` . For information about AWS Lambda invocation types, see the [AWS
     * Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html) .
     *
     *
     * There is a 30-second timeout on `RequestResponse` invocations. You should use `Event`
     * invocation in most cases. Use `RequestResponse` only to make a mail flow decision, such as
     * whether to stop the receipt rule or the receipt rule set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
     */
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is
     * executed.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
     * SNS.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [LambdaActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. 
       * An example of an AWS Lambda function ARN is
       * `arn:aws:lambda:us-west-2:account-id:function:MyFunction` . For more information about AWS
       * Lambda, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html) .
       */
      public fun functionArn(functionArn: String)

      /**
       * @param invocationType The invocation type of the AWS Lambda function.
       * An invocation type of `RequestResponse` means that the execution of the function
       * immediately results in a response, and a value of `Event` means that the function is invoked
       * asynchronously. The default value is `Event` . For information about AWS Lambda invocation
       * types, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html) .
       *
       *
       * There is a 30-second timeout on `RequestResponse` invocations. You should use `Event`
       * invocation in most cases. Use `RequestResponse` only to make a mail flow decision, such as
       * whether to stop the receipt rule or the receipt rule set.
       */
      public fun invocationType(invocationType: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * Lambda action is executed.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.builder()

      /**
       * @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. 
       * An example of an AWS Lambda function ARN is
       * `arn:aws:lambda:us-west-2:account-id:function:MyFunction` . For more information about AWS
       * Lambda, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html) .
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      /**
       * @param invocationType The invocation type of the AWS Lambda function.
       * An invocation type of `RequestResponse` means that the execution of the function
       * immediately results in a response, and a value of `Event` means that the function is invoked
       * asynchronously. The default value is `Event` . For information about AWS Lambda invocation
       * types, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html) .
       *
       *
       * There is a 30-second timeout on `RequestResponse` invocations. You should use `Event`
       * invocation in most cases. Use `RequestResponse` only to make a mail flow decision, such as
       * whether to stop the receipt rule or the receipt rule set.
       */
      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * Lambda action is executed.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty,
    ) : CdkObject(cdkObject), LambdaActionProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS Lambda function.
       *
       * An example of an AWS Lambda function ARN is
       * `arn:aws:lambda:us-west-2:account-id:function:MyFunction` . For more information about AWS
       * Lambda, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * The invocation type of the AWS Lambda function.
       *
       * An invocation type of `RequestResponse` means that the execution of the function
       * immediately results in a response, and a value of `Event` means that the function is invoked
       * asynchronously. The default value is `Event` . For information about AWS Lambda invocation
       * types, see the [AWS Lambda Developer
       * Guide](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html) .
       *
       *
       * There is a 30-second timeout on `RequestResponse` invocations. You should use `Event`
       * invocation in most cases. Use `RequestResponse` only to make a mail flow decision, such as
       * whether to stop the receipt rule or the receipt rule set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
       */
      override fun invocationType(): String? = unwrap(this).getInvocationType()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is
       * executed.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty):
          LambdaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty
    }
  }

  public interface WorkmailActionProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization. Amazon WorkMail ARNs use
     * the following format:.
     *
     * `arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;`
     *
     * You can find the ID of your organization by using the
     * [ListOrganizations](https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html)
     * operation in Amazon WorkMail. Amazon WorkMail organization IDs begin with " `m-` ", followed by
     * a string of alphanumeric characters.
     *
     * For information about Amazon WorkMail organizations, see the [Amazon WorkMail Administrator
     * Guide](https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
     */
    public fun organizationArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is
     * called.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
     * SNS.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [WorkmailActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
       * Amazon WorkMail ARNs use the following format:. 
       * `arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;`
       *
       * You can find the ID of your organization by using the
       * [ListOrganizations](https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html)
       * operation in Amazon WorkMail. Amazon WorkMail organization IDs begin with " `m-` ", followed
       * by a string of alphanumeric characters.
       *
       * For information about Amazon WorkMail organizations, see the [Amazon WorkMail Administrator
       * Guide](https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html) .
       */
      public fun organizationArn(organizationArn: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * WorkMail action is called.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.builder()

      /**
       * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
       * Amazon WorkMail ARNs use the following format:. 
       * `arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;`
       *
       * You can find the ID of your organization by using the
       * [ListOrganizations](https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html)
       * operation in Amazon WorkMail. Amazon WorkMail organization IDs begin with " `m-` ", followed
       * by a string of alphanumeric characters.
       *
       * For information about Amazon WorkMail organizations, see the [Amazon WorkMail Administrator
       * Guide](https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html) .
       */
      override fun organizationArn(organizationArn: String) {
        cdkBuilder.organizationArn(organizationArn)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * WorkMail action is called.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty,
    ) : CdkObject(cdkObject), WorkmailActionProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon WorkMail organization. Amazon WorkMail ARNs
       * use the following format:.
       *
       * `arn:aws:workmail:&lt;region&gt;:&lt;awsAccountId&gt;:organization/&lt;workmailOrganizationId&gt;`
       *
       * You can find the ID of your organization by using the
       * [ListOrganizations](https://docs.aws.amazon.com/workmail/latest/APIReference/API_ListOrganizations.html)
       * operation in Amazon WorkMail. Amazon WorkMail organization IDs begin with " `m-` ", followed
       * by a string of alphanumeric characters.
       *
       * For information about Amazon WorkMail organizations, see the [Amazon WorkMail Administrator
       * Guide](https://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
       */
      override fun organizationArn(): String = unwrap(this).getOrganizationArn()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action
       * is called.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkmailActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty):
          WorkmailActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkmailActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty
    }
  }

  public interface AddHeaderActionProperty {
    /**
     * The name of the header to add to the incoming message.
     *
     * The name must contain at least one character, and can contain up to 50 characters. It
     * consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
     */
    public fun headerName(): String

    /**
     * The content to include in the header.
     *
     * This value can contain up to 2048 characters. It can't contain newline ( `\n` ) or carriage
     * return ( `\r` ) characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
     */
    public fun headerValue(): String

    /**
     * A builder for [AddHeaderActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerName The name of the header to add to the incoming message. 
       * The name must contain at least one character, and can contain up to 50 characters. It
       * consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
       */
      public fun headerName(headerName: String)

      /**
       * @param headerValue The content to include in the header. 
       * This value can contain up to 2048 characters. It can't contain newline ( `\n` ) or carriage
       * return ( `\r` ) characters.
       */
      public fun headerValue(headerValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty.builder()

      /**
       * @param headerName The name of the header to add to the incoming message. 
       * The name must contain at least one character, and can contain up to 50 characters. It
       * consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      /**
       * @param headerValue The content to include in the header. 
       * This value can contain up to 2048 characters. It can't contain newline ( `\n` ) or carriage
       * return ( `\r` ) characters.
       */
      override fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty,
    ) : CdkObject(cdkObject), AddHeaderActionProperty {
      /**
       * The name of the header to add to the incoming message.
       *
       * The name must contain at least one character, and can contain up to 50 characters. It
       * consists of alphanumeric (a–z, A–Z, 0–9) characters and dashes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()

      /**
       * The content to include in the header.
       *
       * This value can contain up to 2048 characters. It can't contain newline ( `\n` ) or carriage
       * return ( `\r` ) characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
       */
      override fun headerValue(): String = unwrap(this).getHeaderValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty):
          AddHeaderActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddHeaderActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty
    }
  }

  public interface S3ActionProperty {
    /**
     * The name of the Amazon S3 bucket for incoming email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
     */
    public fun bucketName(): String

    /**
     * The customer master key that Amazon SES should use to encrypt your emails before saving them
     * to the Amazon S3 bucket.
     *
     * You can use the default master key or a custom master key that you created in AWS KMS as
     * follows:
     *
     * * To use the default master key, provide an ARN in the form of
     * `arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses` . For example, if your AWS account
     * ID is 123456789012 and you want to use the default master key in the US West (Oregon) Region,
     * the ARN of the default master key would be `arn:aws:kms:us-west-2:123456789012:alias/aws/ses` .
     * If you use the default master key, you don't need to perform any extra steps to give Amazon SES
     * permission to use the key.
     * * To use a custom master key that you created in AWS KMS, provide the ARN of the master key
     * and ensure that you add a statement to your key's policy to give Amazon SES permission to use
     * it. For more information about giving permissions, see the [Amazon SES Developer
     * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
     *
     * For more information about key policies, see the [AWS KMS Developer
     * Guide](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html) . If you do not
     * specify a master key, Amazon SES does not encrypt your emails.
     *
     *
     * Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail is
     * submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side encryption.
     * This means that you must use the Amazon S3 encryption client to decrypt the email after
     * retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for
     * decryption. This encryption client is currently available with the [AWS SDK for
     * Java](https://docs.aws.amazon.com/sdk-for-java/) and [AWS SDK for
     * Ruby](https://docs.aws.amazon.com/sdk-for-ruby/) only. For more information about client-side
     * encryption using AWS KMS master keys, see the [Amazon S3 Developer
     * Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The key prefix of the Amazon S3 bucket.
     *
     * The key prefix is similar to a directory name that enables you to store similar data under
     * the same directory in a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
     */
    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    /**
     * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3 bucket.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
     * SNS.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [S3ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket for incoming email. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
       * before saving them to the Amazon S3 bucket.
       * You can use the default master key or a custom master key that you created in AWS KMS as
       * follows:
       *
       * * To use the default master key, provide an ARN in the form of
       * `arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses` . For example, if your AWS
       * account ID is 123456789012 and you want to use the default master key in the US West (Oregon)
       * Region, the ARN of the default master key would be
       * `arn:aws:kms:us-west-2:123456789012:alias/aws/ses` . If you use the default master key, you
       * don't need to perform any extra steps to give Amazon SES permission to use the key.
       * * To use a custom master key that you created in AWS KMS, provide the ARN of the master key
       * and ensure that you add a statement to your key's policy to give Amazon SES permission to use
       * it. For more information about giving permissions, see the [Amazon SES Developer
       * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
       *
       * For more information about key policies, see the [AWS KMS Developer
       * Guide](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html) . If you do not
       * specify a master key, Amazon SES does not encrypt your emails.
       *
       *
       * Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail
       * is submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side
       * encryption. This means that you must use the Amazon S3 encryption client to decrypt the email
       * after retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for
       * decryption. This encryption client is currently available with the [AWS SDK for
       * Java](https://docs.aws.amazon.com/sdk-for-java/) and [AWS SDK for
       * Ruby](https://docs.aws.amazon.com/sdk-for-ruby/) only. For more information about client-side
       * encryption using AWS KMS master keys, see the [Amazon S3 Developer
       * Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html) .
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
       * The key prefix is similar to a directory name that enables you to store similar data under
       * the same directory in a bucket.
       */
      public fun objectKeyPrefix(objectKeyPrefix: String)

      /**
       * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
       * Amazon S3 bucket.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket for incoming email. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
       * before saving them to the Amazon S3 bucket.
       * You can use the default master key or a custom master key that you created in AWS KMS as
       * follows:
       *
       * * To use the default master key, provide an ARN in the form of
       * `arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses` . For example, if your AWS
       * account ID is 123456789012 and you want to use the default master key in the US West (Oregon)
       * Region, the ARN of the default master key would be
       * `arn:aws:kms:us-west-2:123456789012:alias/aws/ses` . If you use the default master key, you
       * don't need to perform any extra steps to give Amazon SES permission to use the key.
       * * To use a custom master key that you created in AWS KMS, provide the ARN of the master key
       * and ensure that you add a statement to your key's policy to give Amazon SES permission to use
       * it. For more information about giving permissions, see the [Amazon SES Developer
       * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
       *
       * For more information about key policies, see the [AWS KMS Developer
       * Guide](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html) . If you do not
       * specify a master key, Amazon SES does not encrypt your emails.
       *
       *
       * Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail
       * is submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side
       * encryption. This means that you must use the Amazon S3 encryption client to decrypt the email
       * after retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for
       * decryption. This encryption client is currently available with the [AWS SDK for
       * Java](https://docs.aws.amazon.com/sdk-for-java/) and [AWS SDK for
       * Ruby](https://docs.aws.amazon.com/sdk-for-ruby/) only. For more information about client-side
       * encryption using AWS KMS master keys, see the [Amazon S3 Developer
       * Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html) .
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
       * The key prefix is similar to a directory name that enables you to store similar data under
       * the same directory in a bucket.
       */
      override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      /**
       * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
       * Amazon S3 bucket.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty,
    ) : CdkObject(cdkObject), S3ActionProperty {
      /**
       * The name of the Amazon S3 bucket for incoming email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The customer master key that Amazon SES should use to encrypt your emails before saving
       * them to the Amazon S3 bucket.
       *
       * You can use the default master key or a custom master key that you created in AWS KMS as
       * follows:
       *
       * * To use the default master key, provide an ARN in the form of
       * `arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses` . For example, if your AWS
       * account ID is 123456789012 and you want to use the default master key in the US West (Oregon)
       * Region, the ARN of the default master key would be
       * `arn:aws:kms:us-west-2:123456789012:alias/aws/ses` . If you use the default master key, you
       * don't need to perform any extra steps to give Amazon SES permission to use the key.
       * * To use a custom master key that you created in AWS KMS, provide the ARN of the master key
       * and ensure that you add a statement to your key's policy to give Amazon SES permission to use
       * it. For more information about giving permissions, see the [Amazon SES Developer
       * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
       *
       * For more information about key policies, see the [AWS KMS Developer
       * Guide](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html) . If you do not
       * specify a master key, Amazon SES does not encrypt your emails.
       *
       *
       * Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail
       * is submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side
       * encryption. This means that you must use the Amazon S3 encryption client to decrypt the email
       * after retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for
       * decryption. This encryption client is currently available with the [AWS SDK for
       * Java](https://docs.aws.amazon.com/sdk-for-java/) and [AWS SDK for
       * Ruby](https://docs.aws.amazon.com/sdk-for-ruby/) only. For more information about client-side
       * encryption using AWS KMS master keys, see the [Amazon S3 Developer
       * Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html) .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The key prefix of the Amazon S3 bucket.
       *
       * The key prefix is similar to a directory name that enables you to store similar data under
       * the same directory in a bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
       */
      override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

      /**
       * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3
       * bucket.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty):
          S3ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty
    }
  }

  public interface BounceActionProperty {
    /**
     * Human-readable text to include in the bounce message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
     */
    public fun message(): String

    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address from which the bounce message is sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
     */
    public fun sender(): String

    /**
     * The SMTP reply code, as defined by [RFC
     * 5321](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5321) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
     */
    public fun smtpReplyCode(): String

    /**
     * The SMTP enhanced status code, as defined by [RFC
     * 3463](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3463) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
     */
    public fun statusCode(): String? = unwrap(this).getStatusCode()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is
     * taken.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
     * SNS.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [BounceActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param message Human-readable text to include in the bounce message. 
       */
      public fun message(message: String)

      /**
       * @param sender The email address of the sender of the bounced email. 
       * This is the address from which the bounce message is sent.
       */
      public fun sender(sender: String)

      /**
       * @param smtpReplyCode The SMTP reply code, as defined by [RFC
       * 5321](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5321) . 
       */
      public fun smtpReplyCode(smtpReplyCode: String)

      /**
       * @param statusCode The SMTP enhanced status code, as defined by [RFC
       * 3463](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3463) .
       */
      public fun statusCode(statusCode: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * bounce action is taken.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.builder()

      /**
       * @param message Human-readable text to include in the bounce message. 
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      /**
       * @param sender The email address of the sender of the bounced email. 
       * This is the address from which the bounce message is sent.
       */
      override fun sender(sender: String) {
        cdkBuilder.sender(sender)
      }

      /**
       * @param smtpReplyCode The SMTP reply code, as defined by [RFC
       * 5321](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5321) . 
       */
      override fun smtpReplyCode(smtpReplyCode: String) {
        cdkBuilder.smtpReplyCode(smtpReplyCode)
      }

      /**
       * @param statusCode The SMTP enhanced status code, as defined by [RFC
       * 3463](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3463) .
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * bounce action is taken.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty,
    ) : CdkObject(cdkObject), BounceActionProperty {
      /**
       * Human-readable text to include in the bounce message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
       */
      override fun message(): String = unwrap(this).getMessage()

      /**
       * The email address of the sender of the bounced email.
       *
       * This is the address from which the bounce message is sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
       */
      override fun sender(): String = unwrap(this).getSender()

      /**
       * The SMTP reply code, as defined by [RFC
       * 5321](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5321) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
       */
      override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

      /**
       * The SMTP enhanced status code, as defined by [RFC
       * 3463](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3463) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
       */
      override fun statusCode(): String? = unwrap(this).getStatusCode()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is
       * taken.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BounceActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty):
          BounceActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BounceActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty
    }
  }

  public interface RuleProperty {
    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
     */
    public fun actions(): Any? = unwrap(this).getActions()

    /**
     * If `true` , the receipt rule is active.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The name of the receipt rule. The name must meet the following requirements:.
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
     * periods (.).
     * * Start and end with a letter or number.
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * If this field is not specified, this rule matches all recipients on all verified domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
     */
    public fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

    /**
     * If `true` , then messages that this receipt rule applies to are scanned for spam and viruses.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
     */
    public fun scanEnabled(): Any? = unwrap(this).getScanEnabled()

    /**
     * Specifies whether Amazon SES should require that incoming email is delivered over a
     * connection encrypted with Transport Layer Security (TLS).
     *
     * If this parameter is set to `Require` , Amazon SES bounces emails that are not received over
     * TLS. The default is `Optional` .
     *
     * Valid Values: `Require | Optional`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
     */
    public fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      public fun actions(vararg actions: Any)

      /**
       * @param enabled If `true` , the receipt rule is active.
       * The default value is `false` .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If `true` , the receipt rule is active.
       * The default value is `false` .
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param name The name of the receipt rule. The name must meet the following requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * periods (.).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       */
      public fun name(name: String)

      /**
       * @param recipients The recipient domains and email addresses that the receipt rule applies
       * to.
       * If this field is not specified, this rule matches all recipients on all verified domains.
       */
      public fun recipients(recipients: List<String>)

      /**
       * @param recipients The recipient domains and email addresses that the receipt rule applies
       * to.
       * If this field is not specified, this rule matches all recipients on all verified domains.
       */
      public fun recipients(vararg recipients: String)

      /**
       * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned
       * for spam and viruses.
       * The default value is `false` .
       */
      public fun scanEnabled(scanEnabled: Boolean)

      /**
       * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned
       * for spam and viruses.
       * The default value is `false` .
       */
      public fun scanEnabled(scanEnabled: IResolvable)

      /**
       * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
       * delivered over a connection encrypted with Transport Layer Security (TLS).
       * If this parameter is set to `Require` , Amazon SES bounces emails that are not received
       * over TLS. The default is `Optional` .
       *
       * Valid Values: `Require | Optional`
       */
      public fun tlsPolicy(tlsPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty.builder()

      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions An ordered list of actions to perform on messages that match at least one of
       * the recipient email addresses or domains specified in the receipt rule.
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param enabled If `true` , the receipt rule is active.
       * The default value is `false` .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If `true` , the receipt rule is active.
       * The default value is `false` .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param name The name of the receipt rule. The name must meet the following requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * periods (.).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param recipients The recipient domains and email addresses that the receipt rule applies
       * to.
       * If this field is not specified, this rule matches all recipients on all verified domains.
       */
      override fun recipients(recipients: List<String>) {
        cdkBuilder.recipients(recipients)
      }

      /**
       * @param recipients The recipient domains and email addresses that the receipt rule applies
       * to.
       * If this field is not specified, this rule matches all recipients on all verified domains.
       */
      override fun recipients(vararg recipients: String): Unit = recipients(recipients.toList())

      /**
       * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned
       * for spam and viruses.
       * The default value is `false` .
       */
      override fun scanEnabled(scanEnabled: Boolean) {
        cdkBuilder.scanEnabled(scanEnabled)
      }

      /**
       * @param scanEnabled If `true` , then messages that this receipt rule applies to are scanned
       * for spam and viruses.
       * The default value is `false` .
       */
      override fun scanEnabled(scanEnabled: IResolvable) {
        cdkBuilder.scanEnabled(scanEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param tlsPolicy Specifies whether Amazon SES should require that incoming email is
       * delivered over a connection encrypted with Transport Layer Security (TLS).
       * If this parameter is set to `Require` , Amazon SES bounces emails that are not received
       * over TLS. The default is `Optional` .
       *
       * Valid Values: `Require | Optional`
       */
      override fun tlsPolicy(tlsPolicy: String) {
        cdkBuilder.tlsPolicy(tlsPolicy)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * An ordered list of actions to perform on messages that match at least one of the recipient
       * email addresses or domains specified in the receipt rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
       */
      override fun actions(): Any? = unwrap(this).getActions()

      /**
       * If `true` , the receipt rule is active.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The name of the receipt rule. The name must meet the following requirements:.
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), dashes (-), or
       * periods (.).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The recipient domains and email addresses that the receipt rule applies to.
       *
       * If this field is not specified, this rule matches all recipients on all verified domains.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
       */
      override fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

      /**
       * If `true` , then messages that this receipt rule applies to are scanned for spam and
       * viruses.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
       */
      override fun scanEnabled(): Any? = unwrap(this).getScanEnabled()

      /**
       * Specifies whether Amazon SES should require that incoming email is delivered over a
       * connection encrypted with Transport Layer Security (TLS).
       *
       * If this parameter is set to `Require` , Amazon SES bounces emails that are not received
       * over TLS. The default is `Optional` .
       *
       * Valid Values: `Require | Optional`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
       */
      override fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty
    }
  }

  public interface SNSActionProperty {
    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * UTF-8 is easier to use, but may not preserve all special characters when a message was
     * encoded with a different encoding format. Base64 preserves all special characters. The default
     * value is UTF-8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
     */
    public fun encoding(): String? = unwrap(this).getEncoding()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
     * SNS.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [SNSActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encoding The encoding to use for the email within the Amazon SNS notification.
       * UTF-8 is easier to use, but may not preserve all special characters when a message was
       * encoded with a different encoding format. Base64 preserves all special characters. The default
       * value is UTF-8.
       */
      public fun encoding(encoding: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty.builder()

      /**
       * @param encoding The encoding to use for the email within the Amazon SNS notification.
       * UTF-8 is easier to use, but may not preserve all special characters when a message was
       * encoded with a different encoding format. Base64 preserves all special characters. The default
       * value is UTF-8.
       */
      override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty,
    ) : CdkObject(cdkObject), SNSActionProperty {
      /**
       * The encoding to use for the email within the Amazon SNS notification.
       *
       * UTF-8 is easier to use, but may not preserve all special characters when a message was
       * encoded with a different encoding format. Base64 preserves all special characters. The default
       * value is UTF-8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
       */
      override fun encoding(): String? = unwrap(this).getEncoding()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
       * Amazon SNS.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SNSActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty):
          SNSActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty
    }
  }

  public interface StopActionProperty {
    /**
     * The scope of the StopAction.
     *
     * The only acceptable value is `RuleSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
     */
    public fun scope(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is
     * taken.
     *
     * You can find the ARN of a topic by using the
     * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
     * operation.
     *
     * For more information about Amazon SNS topics, see the [Amazon SNS Developer
     * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [StopActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scope The scope of the StopAction. 
       * The only acceptable value is `RuleSet` .
       */
      public fun scope(scope: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * stop action is taken.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty.builder()

      /**
       * @param scope The scope of the StopAction. 
       * The only acceptable value is `RuleSet` .
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
       * stop action is taken.
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty,
    ) : CdkObject(cdkObject), StopActionProperty {
      /**
       * The scope of the StopAction.
       *
       * The only acceptable value is `RuleSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
       */
      override fun scope(): String = unwrap(this).getScope()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is
       * taken.
       *
       * You can find the ARN of a topic by using the
       * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) Amazon SNS
       * operation.
       *
       * For more information about Amazon SNS topics, see the [Amazon SNS Developer
       * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StopActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty):
          StopActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StopActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty
    }
  }

  public interface ActionProperty {
    /**
     * Adds a header to the received email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
     */
    public fun addHeaderAction(): Any? = unwrap(this).getAddHeaderAction()

    /**
     * Rejects the received email by returning a bounce response to the sender and, optionally,
     * publishes a notification to Amazon Simple Notification Service (Amazon SNS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
     */
    public fun bounceAction(): Any? = unwrap(this).getBounceAction()

    /**
     * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
     */
    public fun lambdaAction(): Any? = unwrap(this).getLambdaAction()

    /**
     * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and,
     * optionally, publishes a notification to Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
     */
    public fun s3Action(): Any? = unwrap(this).getS3Action()

    /**
     * Publishes the email content within a notification to Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
     */
    public fun snsAction(): Any? = unwrap(this).getSnsAction()

    /**
     * Terminates the evaluation of the receipt rule set and optionally publishes a notification to
     * Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
     */
    public fun stopAction(): Any? = unwrap(this).getStopAction()

    /**
     * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
     */
    public fun workmailAction(): Any? = unwrap(this).getWorkmailAction()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      public fun addHeaderAction(addHeaderAction: IResolvable)

      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      public fun addHeaderAction(addHeaderAction: AddHeaderActionProperty)

      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9657342d5d725aa7477565fb4f7c62b6b32733c91f8ff2534f2413da365db9d9")
      public fun addHeaderAction(addHeaderAction: AddHeaderActionProperty.Builder.() -> Unit)

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      public fun bounceAction(bounceAction: IResolvable)

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      public fun bounceAction(bounceAction: BounceActionProperty)

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45943b0805b36445eee8feb6884a6b0e91f26389e796f71bca770b22ee55b580")
      public fun bounceAction(bounceAction: BounceActionProperty.Builder.() -> Unit)

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      public fun lambdaAction(lambdaAction: IResolvable)

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      public fun lambdaAction(lambdaAction: LambdaActionProperty)

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fa41d57bee605fca01822c760a8a9020105a2d44d39aeab7a79fa532090c8ff")
      public fun lambdaAction(lambdaAction: LambdaActionProperty.Builder.() -> Unit)

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      public fun s3Action(s3Action: IResolvable)

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      public fun s3Action(s3Action: S3ActionProperty)

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac64193bd062afbc8f65aa49e24738f9181901ef3701cba3ad6be486fc8126a1")
      public fun s3Action(s3Action: S3ActionProperty.Builder.() -> Unit)

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      public fun snsAction(snsAction: IResolvable)

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      public fun snsAction(snsAction: SNSActionProperty)

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3db4cb2bf27edbab1846c2a57b8d5375d014303e7a42a2b3f0faa2285c3c4320")
      public fun snsAction(snsAction: SNSActionProperty.Builder.() -> Unit)

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      public fun stopAction(stopAction: IResolvable)

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      public fun stopAction(stopAction: StopActionProperty)

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18fab212c7b1d1441244ab51c1bc3b8a8e1f85e7a9c4b2439f6847cc36b2f0de")
      public fun stopAction(stopAction: StopActionProperty.Builder.() -> Unit)

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      public fun workmailAction(workmailAction: IResolvable)

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      public fun workmailAction(workmailAction: WorkmailActionProperty)

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e6da27a29ffc59c66ab95ebaa1a29b810412f3740b2dbd633e4d4201903ad81")
      public fun workmailAction(workmailAction: WorkmailActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty.builder()

      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      override fun addHeaderAction(addHeaderAction: IResolvable) {
        cdkBuilder.addHeaderAction(addHeaderAction.let(IResolvable::unwrap))
      }

      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      override fun addHeaderAction(addHeaderAction: AddHeaderActionProperty) {
        cdkBuilder.addHeaderAction(addHeaderAction.let(AddHeaderActionProperty::unwrap))
      }

      /**
       * @param addHeaderAction Adds a header to the received email.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9657342d5d725aa7477565fb4f7c62b6b32733c91f8ff2534f2413da365db9d9")
      override fun addHeaderAction(addHeaderAction: AddHeaderActionProperty.Builder.() -> Unit):
          Unit = addHeaderAction(AddHeaderActionProperty(addHeaderAction))

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      override fun bounceAction(bounceAction: IResolvable) {
        cdkBuilder.bounceAction(bounceAction.let(IResolvable::unwrap))
      }

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      override fun bounceAction(bounceAction: BounceActionProperty) {
        cdkBuilder.bounceAction(bounceAction.let(BounceActionProperty::unwrap))
      }

      /**
       * @param bounceAction Rejects the received email by returning a bounce response to the sender
       * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45943b0805b36445eee8feb6884a6b0e91f26389e796f71bca770b22ee55b580")
      override fun bounceAction(bounceAction: BounceActionProperty.Builder.() -> Unit): Unit =
          bounceAction(BounceActionProperty(bounceAction))

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      override fun lambdaAction(lambdaAction: IResolvable) {
        cdkBuilder.lambdaAction(lambdaAction.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      override fun lambdaAction(lambdaAction: LambdaActionProperty) {
        cdkBuilder.lambdaAction(lambdaAction.let(LambdaActionProperty::unwrap))
      }

      /**
       * @param lambdaAction Calls an AWS Lambda function, and optionally, publishes a notification
       * to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fa41d57bee605fca01822c760a8a9020105a2d44d39aeab7a79fa532090c8ff")
      override fun lambdaAction(lambdaAction: LambdaActionProperty.Builder.() -> Unit): Unit =
          lambdaAction(LambdaActionProperty(lambdaAction))

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      override fun s3Action(s3Action: IResolvable) {
        cdkBuilder.s3Action(s3Action.let(IResolvable::unwrap))
      }

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      override fun s3Action(s3Action: S3ActionProperty) {
        cdkBuilder.s3Action(s3Action.let(S3ActionProperty::unwrap))
      }

      /**
       * @param s3Action Saves the received message to an Amazon Simple Storage Service (Amazon S3)
       * bucket and, optionally, publishes a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac64193bd062afbc8f65aa49e24738f9181901ef3701cba3ad6be486fc8126a1")
      override fun s3Action(s3Action: S3ActionProperty.Builder.() -> Unit): Unit =
          s3Action(S3ActionProperty(s3Action))

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      override fun snsAction(snsAction: IResolvable) {
        cdkBuilder.snsAction(snsAction.let(IResolvable::unwrap))
      }

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      override fun snsAction(snsAction: SNSActionProperty) {
        cdkBuilder.snsAction(snsAction.let(SNSActionProperty::unwrap))
      }

      /**
       * @param snsAction Publishes the email content within a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3db4cb2bf27edbab1846c2a57b8d5375d014303e7a42a2b3f0faa2285c3c4320")
      override fun snsAction(snsAction: SNSActionProperty.Builder.() -> Unit): Unit =
          snsAction(SNSActionProperty(snsAction))

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      override fun stopAction(stopAction: IResolvable) {
        cdkBuilder.stopAction(stopAction.let(IResolvable::unwrap))
      }

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      override fun stopAction(stopAction: StopActionProperty) {
        cdkBuilder.stopAction(stopAction.let(StopActionProperty::unwrap))
      }

      /**
       * @param stopAction Terminates the evaluation of the receipt rule set and optionally
       * publishes a notification to Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18fab212c7b1d1441244ab51c1bc3b8a8e1f85e7a9c4b2439f6847cc36b2f0de")
      override fun stopAction(stopAction: StopActionProperty.Builder.() -> Unit): Unit =
          stopAction(StopActionProperty(stopAction))

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      override fun workmailAction(workmailAction: IResolvable) {
        cdkBuilder.workmailAction(workmailAction.let(IResolvable::unwrap))
      }

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      override fun workmailAction(workmailAction: WorkmailActionProperty) {
        cdkBuilder.workmailAction(workmailAction.let(WorkmailActionProperty::unwrap))
      }

      /**
       * @param workmailAction Calls Amazon WorkMail and, optionally, publishes a notification to
       * Amazon Amazon SNS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e6da27a29ffc59c66ab95ebaa1a29b810412f3740b2dbd633e4d4201903ad81")
      override fun workmailAction(workmailAction: WorkmailActionProperty.Builder.() -> Unit): Unit =
          workmailAction(WorkmailActionProperty(workmailAction))

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * Adds a header to the received email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
       */
      override fun addHeaderAction(): Any? = unwrap(this).getAddHeaderAction()

      /**
       * Rejects the received email by returning a bounce response to the sender and, optionally,
       * publishes a notification to Amazon Simple Notification Service (Amazon SNS).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
       */
      override fun bounceAction(): Any? = unwrap(this).getBounceAction()

      /**
       * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
       */
      override fun lambdaAction(): Any? = unwrap(this).getLambdaAction()

      /**
       * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and,
       * optionally, publishes a notification to Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
       */
      override fun s3Action(): Any? = unwrap(this).getS3Action()

      /**
       * Publishes the email content within a notification to Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
       */
      override fun snsAction(): Any? = unwrap(this).getSnsAction()

      /**
       * Terminates the evaluation of the receipt rule set and optionally publishes a notification
       * to Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
       */
      override fun stopAction(): Any? = unwrap(this).getStopAction()

      /**
       * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
       */
      override fun workmailAction(): Any? = unwrap(this).getWorkmailAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty
    }
  }
}
