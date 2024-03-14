package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMicrosoftTeamsChannelConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Amazon Resource Name (ARN) of the configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the configuration.
   */
  public open fun configurationName(): String = unwrap(this).getConfigurationName()

  /**
   * The name of the configuration.
   */
  public open fun configurationName(`value`: String) {
    unwrap(this).setConfigurationName(`value`)
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
      emptyList()

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(`value`: List<String>) {
    unwrap(this).setGuardrailPolicies(`value`)
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(vararg `value`: String): Unit =
      guardrailPolicies(`value`.toList())

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   */
  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
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
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public open fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  /**
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public open fun loggingLevel(`value`: String) {
    unwrap(this).setLoggingLevel(`value`)
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(`value`: List<String>) {
    unwrap(this).setSnsTopicArns(`value`)
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(vararg `value`: String): Unit = snsTopicArns(`value`.toList())

  /**
   * The ID of the Microsoft Team authorized with AWS Chatbot .
   */
  public open fun teamId(): String = unwrap(this).getTeamId()

  /**
   * The ID of the Microsoft Team authorized with AWS Chatbot .
   */
  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  /**
   * The id of the Microsoft Teams channel.
   */
  public open fun teamsChannelId(): String = unwrap(this).getTeamsChannelId()

  /**
   * The id of the Microsoft Teams channel.
   */
  public open fun teamsChannelId(`value`: String) {
    unwrap(this).setTeamsChannelId(`value`)
  }

  /**
   * The ID of the Microsoft Teams tenant.
   */
  public open fun teamsTenantId(): String = unwrap(this).getTeamsTenantId()

  /**
   * The ID of the Microsoft Teams tenant.
   */
  public open fun teamsTenantId(`value`: String) {
    unwrap(this).setTeamsTenantId(`value`)
  }

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(`value`: Boolean) {
    unwrap(this).setUserRoleRequired(`value`)
  }

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(`value`: IResolvable) {
    unwrap(this).setUserRoleRequired(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
     * @param configurationName The name of the configuration. 
     */
    public fun configurationName(configurationName: String)

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    public fun guardrailPolicies(guardrailPolicies: List<String>)

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String)

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs. 
     */
    public fun loggingLevel(loggingLevel: String)

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    public fun snsTopicArns(snsTopicArns: List<String>)

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    public fun snsTopicArns(vararg snsTopicArns: String)

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot .
     *
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the team ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
     * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . 
     */
    public fun teamId(teamId: String)

    /**
     * The id of the Microsoft Teams channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
     * @param teamsChannelId The id of the Microsoft Teams channel. 
     */
    public fun teamsChannelId(teamsChannelId: String)

    /**
     * The ID of the Microsoft Teams tenant.
     *
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     */
    public fun teamsTenantId(teamsTenantId: String)

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    public fun userRoleRequired(userRoleRequired: Boolean)

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration.Builder.create(scope,
        id)

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
     * @param configurationName The name of the configuration. 
     */
    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    override fun guardrailPolicies(vararg guardrailPolicies: String): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     */
    override fun iamRoleArn(iamRoleArn: String) {
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs. 
     */
    override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot .
     *
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the team ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
     * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * The id of the Microsoft Teams channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
     * @param teamsChannelId The id of the Microsoft Teams channel. 
     */
    override fun teamsChannelId(teamsChannelId: String) {
      cdkBuilder.teamsChannelId(teamsChannelId)
    }

    /**
     * The ID of the Microsoft Teams tenant.
     *
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     */
    override fun teamsTenantId(teamsTenantId: String) {
      cdkBuilder.teamsTenantId(teamsTenantId)
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    override fun userRoleRequired(userRoleRequired: IResolvable) {
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMicrosoftTeamsChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMicrosoftTeamsChannelConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration):
        CfnMicrosoftTeamsChannelConfiguration = CfnMicrosoftTeamsChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftTeamsChannelConfiguration):
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration =
        wrapped.cdkObject
  }
}
