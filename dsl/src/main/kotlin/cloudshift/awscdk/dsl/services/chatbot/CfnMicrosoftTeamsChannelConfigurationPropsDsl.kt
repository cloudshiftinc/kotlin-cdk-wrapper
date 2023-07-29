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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps

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
@CdkDslMarker
public class CfnMicrosoftTeamsChannelConfigurationPropsDsl {
    private val cdkBuilder: CfnMicrosoftTeamsChannelConfigurationProps.Builder =
        CfnMicrosoftTeamsChannelConfigurationProps.builder()

    private val _guardrailPolicies: MutableList<String> = mutableListOf()

    private val _snsTopicArns: MutableList<String> = mutableListOf()

    /** @param configurationName The name of the configuration. */
    public fun configurationName(configurationName: String) {
        cdkBuilder.configurationName(configurationName)
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     *   The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String) {
        _guardrailPolicies.addAll(listOf(*guardrailPolicies))
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     *   The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(guardrailPolicies: Collection<String>) {
        _guardrailPolicies.addAll(guardrailPolicies)
    }

    /**
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . This
     *   is a user-defined role that AWS Chatbot will assume. This is not the service-linked role.
     *   For more information, see
     *   [IAM Policies for AWS Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html)
     *   .
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     *   the log entries pushed to Amazon CloudWatch Logs. Logging levels include `ERROR` , `INFO` ,
     *   or `NONE` .
     */
    public fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(vararg snsTopicArns: String) {
        _snsTopicArns.addAll(listOf(*snsTopicArns))
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(snsTopicArns: Collection<String>) {
        _snsTopicArns.addAll(snsTopicArns)
    }

    /**
     * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . To get the team ID,
     *   you must perform the initial authorization flow with Microsoft Teams in the AWS Chatbot
     *   console. Then you can copy and paste the team ID from the console. For more details, see
     *   steps 1-4 in
     *   [Get started with Microsoft Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     *   in the *AWS Chatbot Administrator Guide* .
     */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    /**
     * @param teamsChannelId The ID of the Microsoft Teams channel. To get the channel ID, open
     *   Microsoft Teams, right click on the channel name in the left pane, then choose Copy. An
     *   example of the channel ID syntax is: `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2`
     *   .
     */
    public fun teamsChannelId(teamsChannelId: String) {
        cdkBuilder.teamsChannelId(teamsChannelId)
    }

    /**
     * @param teamsTenantId The ID of the Microsoft Teams tenant. To get the tenant ID, you must
     *   perform the initial authorization flow with Microsoft Teams in the AWS Chatbot console.
     *   Then you can copy and paste the tenant ID from the console. For more details, see steps 1-4
     *   in
     *   [Get started with Microsoft Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     *   in the *AWS Chatbot Administrator Guide* .
     */
    public fun teamsTenantId(teamsTenantId: String) {
        cdkBuilder.teamsTenantId(teamsTenantId)
    }

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: Boolean) {
        cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: IResolvable) {
        cdkBuilder.userRoleRequired(userRoleRequired)
    }

    public fun build(): CfnMicrosoftTeamsChannelConfigurationProps {
        if (_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
        if (_snsTopicArns.isNotEmpty()) cdkBuilder.snsTopicArns(_snsTopicArns)
        return cdkBuilder.build()
    }
}
