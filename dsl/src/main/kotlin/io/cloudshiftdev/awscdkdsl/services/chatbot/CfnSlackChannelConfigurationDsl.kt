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

package io.cloudshiftdev.awscdkdsl.services.chatbot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.constructs.Construct

/**
 * The `AWS::Chatbot::SlackChannelConfiguration` resource configures a Slack channel to allow users
 * to use AWS Chatbot with AWS CloudFormation templates.
 *
 * This resource requires some setup to be done in the AWS Chatbot console. To provide the required
 * Slack workspace ID, you must perform the initial authorization flow with Slack in the AWS Chatbot
 * console, then copy and paste the workspace ID from the console. For more details, see steps 1-4
 * in
 * [Setting Up AWS Chatbot with Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro)
 * in the *AWS Chatbot User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.chatbot.*;
 * CfnSlackChannelConfiguration cfnSlackChannelConfiguration =
 * CfnSlackChannelConfiguration.Builder.create(this, "MyCfnSlackChannelConfiguration")
 * .configurationName("configurationName")
 * .iamRoleArn("iamRoleArn")
 * .slackChannelId("slackChannelId")
 * .slackWorkspaceId("slackWorkspaceId")
 * // the properties below are optional
 * .guardrailPolicies(List.of("guardrailPolicies"))
 * .loggingLevel("loggingLevel")
 * .snsTopicArns(List.of("snsTopicArns"))
 * .userRoleRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html)
 */
@CdkDslMarker
public class CfnSlackChannelConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSlackChannelConfiguration.Builder =
        CfnSlackChannelConfiguration.Builder.create(scope, id)

    private val _guardrailPolicies: MutableList<String> = mutableListOf()

    private val _snsTopicArns: MutableList<String> = mutableListOf()

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
     *
     * @param configurationName The name of the configuration.
     */
    public fun configurationName(configurationName: String) {
        cdkBuilder.configurationName(configurationName)
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     *
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String) {
        _guardrailPolicies.addAll(listOf(*guardrailPolicies))
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     *
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     */
    public fun guardrailPolicies(guardrailPolicies: Collection<String>) {
        _guardrailPolicies.addAll(guardrailPolicies)
    }

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see
     * [IAM Policies for AWS Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn)
     *
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot .
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel)
     *
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     *   the log entries pushed to Amazon CloudWatch Logs.
     */
    public fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example,
     * `ABCBBLZZZ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
     *
     * @param slackChannelId The ID of the Slack channel.
     */
    public fun slackChannelId(slackChannelId: String) {
        cdkBuilder.slackChannelId(slackChannelId)
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot .
     *
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console. Then you can copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in
     * [Setting Up AWS Chatbot with Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro)
     * in the *AWS Chatbot User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
     *
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot .
     */
    public fun slackWorkspaceId(slackWorkspaceId: String) {
        cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     *
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(vararg snsTopicArns: String) {
        _snsTopicArns.addAll(listOf(*snsTopicArns))
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     *
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(snsTopicArns: Collection<String>) {
        _snsTopicArns.addAll(snsTopicArns)
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     *
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: Boolean) {
        cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     *
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: IResolvable) {
        cdkBuilder.userRoleRequired(userRoleRequired)
    }

    public fun build(): CfnSlackChannelConfiguration {
        if (_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
        if (_snsTopicArns.isNotEmpty()) cdkBuilder.snsTopicArns(_snsTopicArns)
        return cdkBuilder.build()
    }
}
