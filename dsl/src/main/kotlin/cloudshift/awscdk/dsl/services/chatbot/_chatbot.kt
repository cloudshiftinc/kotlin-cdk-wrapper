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

package cloudshift.awscdk.dsl.services.chatbot

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.constructs.Construct

public object chatbot {
    /**
     * The `AWS::Chatbot::MicrosoftTeamsChannelConfiguration` resource configures a Microsoft Teams
     * channel to allow users to use AWS Chatbot with AWS CloudFormation templates.
     *
     * This resource requires some setup to be done in the AWS Chatbot console. To provide the
     * required Microsoft Teams team and tenant IDs, you must perform the initial authorization flow
     * with Microsoft Teams in the AWS Chatbot console, then copy and paste the IDs from the
     * console. For more details, see steps 1-4 in
     * [Setting Up AWS Chatbot with Microsoft Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.chatbot.*;
     * CfnMicrosoftTeamsChannelConfiguration cfnMicrosoftTeamsChannelConfiguration =
     * CfnMicrosoftTeamsChannelConfiguration.Builder.create(this,
     * "MyCfnMicrosoftTeamsChannelConfiguration")
     * .configurationName("configurationName")
     * .iamRoleArn("iamRoleArn")
     * .teamId("teamId")
     * .teamsChannelId("teamsChannelId")
     * .teamsTenantId("teamsTenantId")
     * // the properties below are optional
     * .guardrailPolicies(List.of("guardrailPolicies"))
     * .loggingLevel("loggingLevel")
     * .snsTopicArns(List.of("snsTopicArns"))
     * .userRoleRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html)
     */
    public inline fun cfnMicrosoftTeamsChannelConfiguration(
        scope: Construct,
        id: String,
        block: CfnMicrosoftTeamsChannelConfigurationDsl.() -> Unit = {},
    ): CfnMicrosoftTeamsChannelConfiguration {
        val builder = CfnMicrosoftTeamsChannelConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMicrosoftTeamsChannelConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.chatbot.*;
     * CfnMicrosoftTeamsChannelConfigurationProps cfnMicrosoftTeamsChannelConfigurationProps =
     * CfnMicrosoftTeamsChannelConfigurationProps.builder()
     * .configurationName("configurationName")
     * .iamRoleArn("iamRoleArn")
     * .teamId("teamId")
     * .teamsChannelId("teamsChannelId")
     * .teamsTenantId("teamsTenantId")
     * // the properties below are optional
     * .guardrailPolicies(List.of("guardrailPolicies"))
     * .loggingLevel("loggingLevel")
     * .snsTopicArns(List.of("snsTopicArns"))
     * .userRoleRequired(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html)
     */
    public inline fun cfnMicrosoftTeamsChannelConfigurationProps(
        block: CfnMicrosoftTeamsChannelConfigurationPropsDsl.() -> Unit = {}
    ): CfnMicrosoftTeamsChannelConfigurationProps {
        val builder = CfnMicrosoftTeamsChannelConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Chatbot::SlackChannelConfiguration` resource configures a Slack channel to allow
     * users to use AWS Chatbot with AWS CloudFormation templates.
     *
     * This resource requires some setup to be done in the AWS Chatbot console. To provide the
     * required Slack workspace ID, you must perform the initial authorization flow with Slack in
     * the AWS Chatbot console, then copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in
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
    public inline fun cfnSlackChannelConfiguration(
        scope: Construct,
        id: String,
        block: CfnSlackChannelConfigurationDsl.() -> Unit = {},
    ): CfnSlackChannelConfiguration {
        val builder = CfnSlackChannelConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSlackChannelConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.chatbot.*;
     * CfnSlackChannelConfigurationProps cfnSlackChannelConfigurationProps =
     * CfnSlackChannelConfigurationProps.builder()
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
    public inline fun cfnSlackChannelConfigurationProps(
        block: CfnSlackChannelConfigurationPropsDsl.() -> Unit = {}
    ): CfnSlackChannelConfigurationProps {
        val builder = CfnSlackChannelConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new Slack channel configuration.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.chatbot.*;
     * Project project;
     * SlackChannelConfiguration target = SlackChannelConfiguration.Builder.create(this,
     * "MySlackChannel")
     * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
     * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
     * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
     * .build();
     * INotificationRule rule = project.notifyOnBuildSucceeded("NotifyOnBuildSucceeded", target);
     * ```
     */
    public inline fun slackChannelConfiguration(
        scope: Construct,
        id: String,
        block: SlackChannelConfigurationDsl.() -> Unit = {},
    ): SlackChannelConfiguration {
        val builder = SlackChannelConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new Slack channel configuration.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.chatbot.*;
     * Project project;
     * SlackChannelConfiguration target = SlackChannelConfiguration.Builder.create(this,
     * "MySlackChannel")
     * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
     * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
     * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
     * .build();
     * INotificationRule rule = project.notifyOnBuildSucceeded("NotifyOnBuildSucceeded", target);
     * ```
     */
    public inline fun slackChannelConfigurationProps(
        block: SlackChannelConfigurationPropsDsl.() -> Unit = {}
    ): SlackChannelConfigurationProps {
        val builder = SlackChannelConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
