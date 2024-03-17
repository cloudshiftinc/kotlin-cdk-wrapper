@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSlackChannelConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnSlackChannelConfigurationProps cfnSlackChannelConfigurationProps =
 * CfnSlackChannelConfigurationProps.builder()
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
public interface CfnSlackChannelConfigurationProps {
  /**
   * The channel ID in Slack.
   *
   * This ID identifies a channel within a Slack workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelid)
   */
  public fun channelId(): String

  /**
   * The channel name in Slack.
   *
   * This is the channel where you invite the AWS Support App .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelname)
   */
  public fun channelName(): String? = unwrap(this).getChannelName()

  /**
   * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
   *
   * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
   * behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelrolearn)
   */
  public fun channelRoleArn(): String

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
   */
  public fun notifyOnAddCorrespondenceToCase(): Any? =
      unwrap(this).getNotifyOnAddCorrespondenceToCase()

  /**
   * The case severity for your support cases that you want to receive notifications.
   *
   * You can specify `none` , `all` , or `high` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncaseseverity)
   */
  public fun notifyOnCaseSeverity(): String

  /**
   * Whether to get notified when your support cases are created or reopened.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
   */
  public fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

  /**
   * Whether to get notified when your support cases are resolved.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
   */
  public fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

  /**
   * The team ID in Slack.
   *
   * This ID uniquely identifies a Slack workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-teamid)
   */
  public fun teamId(): String

  /**
   * A builder for [CfnSlackChannelConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelId The channel ID in Slack. 
     * This ID identifies a channel within a Slack workspace.
     */
    public fun channelId(channelId: String)

    /**
     * @param channelName The channel name in Slack.
     * This is the channel where you invite the AWS Support App .
     */
    public fun channelName(channelName: String)

    /**
     * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
     * configuration. 
     * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
     * behalf.
     */
    public fun channelRoleArn(channelRoleArn: String)

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases.
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean)

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases.
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable)

    /**
     * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
     * notifications. 
     * You can specify `none` , `all` , or `high` .
     */
    public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String)

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened.
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean)

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened.
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable)

    /**
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved.
     */
    public fun notifyOnResolveCase(notifyOnResolveCase: Boolean)

    /**
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved.
     */
    public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable)

    /**
     * @param teamId The team ID in Slack. 
     * This ID uniquely identifies a Slack workspace.
     */
    public fun teamId(teamId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps.builder()

    /**
     * @param channelId The channel ID in Slack. 
     * This ID identifies a channel within a Slack workspace.
     */
    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    /**
     * @param channelName The channel name in Slack.
     * This is the channel where you invite the AWS Support App .
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
     * configuration. 
     * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
     * behalf.
     */
    override fun channelRoleArn(channelRoleArn: String) {
      cdkBuilder.channelRoleArn(channelRoleArn)
    }

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases.
     */
    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     * to your support cases.
     */
    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase.let(IResolvable::unwrap))
    }

    /**
     * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
     * notifications. 
     * You can specify `none` , `all` , or `high` .
     */
    override fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
      cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
    }

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened.
     */
    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     * or reopened.
     */
    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase.let(IResolvable::unwrap))
    }

    /**
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved.
     */
    override fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    /**
     * @param notifyOnResolveCase Whether to get notified when your support cases are resolved.
     */
    override fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase.let(IResolvable::unwrap))
    }

    /**
     * @param teamId The team ID in Slack. 
     * This ID uniquely identifies a Slack workspace.
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps,
  ) : CdkObject(cdkObject), CfnSlackChannelConfigurationProps {
    /**
     * The channel ID in Slack.
     *
     * This ID identifies a channel within a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelid)
     */
    override fun channelId(): String = unwrap(this).getChannelId()

    /**
     * The channel name in Slack.
     *
     * This is the channel where you invite the AWS Support App .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelname)
     */
    override fun channelName(): String? = unwrap(this).getChannelName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
     *
     * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
     * behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelrolearn)
     */
    override fun channelRoleArn(): String = unwrap(this).getChannelRoleArn()

    /**
     * Whether to get notified when a correspondence is added to your support cases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
     */
    override fun notifyOnAddCorrespondenceToCase(): Any? =
        unwrap(this).getNotifyOnAddCorrespondenceToCase()

    /**
     * The case severity for your support cases that you want to receive notifications.
     *
     * You can specify `none` , `all` , or `high` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncaseseverity)
     */
    override fun notifyOnCaseSeverity(): String = unwrap(this).getNotifyOnCaseSeverity()

    /**
     * Whether to get notified when your support cases are created or reopened.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
     */
    override fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

    /**
     * Whether to get notified when your support cases are resolved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
     */
    override fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

    /**
     * The team ID in Slack.
     *
     * This ID uniquely identifies a Slack workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-teamid)
     */
    override fun teamId(): String = unwrap(this).getTeamId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSlackChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps):
        CfnSlackChannelConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSlackChannelConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfigurationProps):
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
  }
}
