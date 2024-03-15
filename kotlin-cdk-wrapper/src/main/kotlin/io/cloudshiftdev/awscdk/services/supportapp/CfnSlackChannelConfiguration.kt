@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::SupportApp::SlackChannelConfiguration` resource to specify your AWS account
 * when you configure the AWS Support App .
 *
 * This resource includes the following information:
 *
 * * The Slack channel name and ID
 * * The team ID in Slack
 * * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role
 * * Whether you want the AWS Support App to notify you when your support cases are created,
 * updated, resolved, or reopened
 * * The case severity that you want to get notified for
 *
 * For more information, see the following topics in the *AWS Support User Guide* :
 *
 * * [AWS Support App in
 * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html)
 * * [Creating AWS Support App in Slack resources with AWS
 * CloudFormation](https://docs.aws.amazon.com/awssupport/latest/user/creating-resources-with-cloudformation.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnSlackChannelConfiguration cfnSlackChannelConfiguration =
 * CfnSlackChannelConfiguration.Builder.create(this, "MyCfnSlackChannelConfiguration")
 * .channelId("channelId")
 * .channelRoleArn("channelRoleArn")
 * .notifyOnCaseSeverity("notifyOnCaseSeverity")
 * .teamId("teamId")
 * // the properties below are optional
 * .channelName("channelName")
 * .notifyOnAddCorrespondenceToCase(false)
 * .notifyOnCreateOrReopenCase(false)
 * .notifyOnResolveCase(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html)
 */
public open class CfnSlackChannelConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The channel ID in Slack.
   */
  public open fun channelId(): String = unwrap(this).getChannelId()

  /**
   * The channel ID in Slack.
   */
  public open fun channelId(`value`: String) {
    unwrap(this).setChannelId(`value`)
  }

  /**
   * The channel name in Slack.
   */
  public open fun channelName(): String? = unwrap(this).getChannelName()

  /**
   * The channel name in Slack.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
   */
  public open fun channelRoleArn(): String = unwrap(this).getChannelRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
   */
  public open fun channelRoleArn(`value`: String) {
    unwrap(this).setChannelRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   */
  public open fun notifyOnAddCorrespondenceToCase(): Any? =
      unwrap(this).getNotifyOnAddCorrespondenceToCase()

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   */
  public open fun notifyOnAddCorrespondenceToCase(`value`: Boolean) {
    unwrap(this).setNotifyOnAddCorrespondenceToCase(`value`)
  }

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   */
  public open fun notifyOnAddCorrespondenceToCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnAddCorrespondenceToCase(`value`.let(IResolvable::unwrap))
  }

  /**
   * The case severity for your support cases that you want to receive notifications.
   */
  public open fun notifyOnCaseSeverity(): String = unwrap(this).getNotifyOnCaseSeverity()

  /**
   * The case severity for your support cases that you want to receive notifications.
   */
  public open fun notifyOnCaseSeverity(`value`: String) {
    unwrap(this).setNotifyOnCaseSeverity(`value`)
  }

  /**
   * Whether to get notified when your support cases are created or reopened.
   */
  public open fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

  /**
   * Whether to get notified when your support cases are created or reopened.
   */
  public open fun notifyOnCreateOrReopenCase(`value`: Boolean) {
    unwrap(this).setNotifyOnCreateOrReopenCase(`value`)
  }

  /**
   * Whether to get notified when your support cases are created or reopened.
   */
  public open fun notifyOnCreateOrReopenCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnCreateOrReopenCase(`value`.let(IResolvable::unwrap))
  }

  /**
   * Whether to get notified when your support cases are resolved.
   */
  public open fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

  /**
   * Whether to get notified when your support cases are resolved.
   */
  public open fun notifyOnResolveCase(`value`: Boolean) {
    unwrap(this).setNotifyOnResolveCase(`value`)
  }

  /**
   * Whether to get notified when your support cases are resolved.
   */
  public open fun notifyOnResolveCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnResolveCase(`value`.let(IResolvable::unwrap))
  }

  /**
   * The team ID in Slack.
   */
  public open fun teamId(): String = unwrap(this).getTeamId()

  /**
   * The team ID in Slack.
   */
  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.supportapp.CfnSlackChannelConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The channel ID in Slack.
     *
     * This ID identifies a channel within a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelid)
     * @param channelId The channel ID in Slack. 
     */
    public fun channelId(channelId: String)

    /**
     * The channel name in Slack.
     *
     * This is the channel where you invite the AWS Support App .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelname)
     * @param channelName The channel name in Slack. 
     */
    public fun channelName(channelName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
     *
     * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
     * behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelrolearn)
     * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
     * configuration. 
     */
    public fun channelRoleArn(channelRoleArn: String)

    /**
     * Whether to get notified when a correspondence is added to your support cases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases. 
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean)

    /**
     * Whether to get notified when a correspondence is added to your support cases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases. 
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable)

    /**
     * The case severity for your support cases that you want to receive notifications.
     *
     * You can specify `none` , `all` , or `high` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncaseseverity)
     * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
     * notifications. 
     */
    public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String)

    /**
     * Whether to get notified when your support cases are created or reopened.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened. 
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean)

    /**
     * Whether to get notified when your support cases are created or reopened.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened. 
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable)

    /**
     * Whether to get notified when your support cases are resolved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
     */
    public fun notifyOnResolveCase(notifyOnResolveCase: Boolean)

    /**
     * Whether to get notified when your support cases are resolved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
     */
    public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable)

    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-teamid)
     * @param teamId The team ID in Slack. 
     */
    public fun teamId(teamId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.Builder.create(scope,
        id)

    /**
     * The channel ID in Slack.
     *
     * This ID identifies a channel within a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelid)
     * @param channelId The channel ID in Slack. 
     */
    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    /**
     * The channel name in Slack.
     *
     * This is the channel where you invite the AWS Support App .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelname)
     * @param channelName The channel name in Slack. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
     *
     * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
     * behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelrolearn)
     * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
     * configuration. 
     */
    override fun channelRoleArn(channelRoleArn: String) {
      cdkBuilder.channelRoleArn(channelRoleArn)
    }

    /**
     * Whether to get notified when a correspondence is added to your support cases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases. 
     */
    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    /**
     * Whether to get notified when a correspondence is added to your support cases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases. 
     */
    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase.let(IResolvable::unwrap))
    }

    /**
     * The case severity for your support cases that you want to receive notifications.
     *
     * You can specify `none` , `all` , or `high` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncaseseverity)
     * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
     * notifications. 
     */
    override fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
      cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
    }

    /**
     * Whether to get notified when your support cases are created or reopened.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened. 
     */
    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    /**
     * Whether to get notified when your support cases are created or reopened.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened. 
     */
    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase.let(IResolvable::unwrap))
    }

    /**
     * Whether to get notified when your support cases are resolved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
     */
    override fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    /**
     * Whether to get notified when your support cases are resolved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
     */
    override fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase.let(IResolvable::unwrap))
    }

    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-teamid)
     * @param teamId The team ID in Slack. 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSlackChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSlackChannelConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration):
        CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfiguration):
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration = wrapped.cdkObject
  }
}
