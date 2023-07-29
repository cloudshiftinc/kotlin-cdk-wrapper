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

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps

/**
 * Properties for defining a `CfnSlackChannelConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.supportapp.*;
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
@CdkDslMarker
public class CfnSlackChannelConfigurationPropsDsl {
    private val cdkBuilder: CfnSlackChannelConfigurationProps.Builder =
        CfnSlackChannelConfigurationProps.builder()

    /**
     * @param channelId The channel ID in Slack. This ID identifies a channel within a Slack
     *   workspace.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /**
     * @param channelName The channel name in Slack. This is the channel where you invite the AWS
     *   Support App .
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
     *   configuration. The AWS Support App uses this role to perform AWS Support and Service Quotas
     *   actions on your behalf.
     */
    public fun channelRoleArn(channelRoleArn: String) {
        cdkBuilder.channelRoleArn(channelRoleArn)
    }

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     *   to your support cases.
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
        cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    /**
     * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
     *   to your support cases.
     */
    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
        cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    /**
     * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
     *   notifications. You can specify `none` , `all` , or `high` .
     */
    public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
        cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
    }

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     *   or reopened.
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
        cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    /**
     * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
     *   or reopened.
     */
    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
        cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    /** @param notifyOnResolveCase Whether to get notified when your support cases are resolved. */
    public fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
        cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    /** @param notifyOnResolveCase Whether to get notified when your support cases are resolved. */
    public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
        cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    /** @param teamId The team ID in Slack. This ID uniquely identifies a Slack workspace. */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    public fun build(): CfnSlackChannelConfigurationProps = cdkBuilder.build()
}
