@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolRiskConfigurationAttachment` resource sets the risk configuration that
 * is used for Amazon Cognito advanced security features.
 *
 * You can specify risk configuration for a single client (with a specific `clientId` ) or for all
 * clients (by setting the `clientId` to `ALL` ). If you specify `ALL` , the default configuration is
 * used for every client that has had no risk configuration set previously. If you specify risk
 * configuration for a particular client, it no longer falls back to the `ALL` configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolRiskConfigurationAttachment cfnUserPoolRiskConfigurationAttachment =
 * CfnUserPoolRiskConfigurationAttachment.Builder.create(this,
 * "MyCfnUserPoolRiskConfigurationAttachment")
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty.builder()
 * .actions(AccountTakeoverActionsTypeProperty.builder()
 * .highAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .lowAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .mediumAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .build())
 * // the properties below are optional
 * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .blockEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .from("from")
 * .mfaEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .noActionEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .replyTo("replyTo")
 * .build())
 * .build())
 * .compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty.builder()
 * .actions(CompromisedCredentialsActionsTypeProperty.builder()
 * .eventAction("eventAction")
 * .build())
 * // the properties below are optional
 * .eventFilter(List.of("eventFilter"))
 * .build())
 * .riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty.builder()
 * .blockedIpRangeList(List.of("blockedIpRangeList"))
 * .skippedIpRangeList(List.of("skippedIpRangeList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html)
 */
public open class CfnUserPoolRiskConfigurationAttachment(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolRiskConfigurationAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolRiskConfigurationAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolRiskConfigurationAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolRiskConfigurationAttachmentProps(props)
  )

  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   */
  public open fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   */
  public open fun accountTakeoverRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   */
  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(AccountTakeoverRiskConfigurationTypeProperty.Companion::unwrap))
  }

  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2d693232dc81f90060219d90f0f03de79d833bbb55b26aa0ac11a65de8002d6")
  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
      Unit = accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(`value`))

  /**
   * The app client where this configuration is applied.
   */
  public open fun clientId(): String = unwrap(this).getClientId()

  /**
   * The app client where this configuration is applied.
   */
  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  /**
   * Settings for compromised-credentials actions and authentication types with advanced security
   * features in full-function `ENFORCED` mode.
   */
  public open fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  /**
   * Settings for compromised-credentials actions and authentication types with advanced security
   * features in full-function `ENFORCED` mode.
   */
  public open fun compromisedCredentialsRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings for compromised-credentials actions and authentication types with advanced security
   * features in full-function `ENFORCED` mode.
   */
  public open
      fun compromisedCredentialsRiskConfiguration(`value`: CompromisedCredentialsRiskConfigurationTypeProperty) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(CompromisedCredentialsRiskConfigurationTypeProperty.Companion::unwrap))
  }

  /**
   * Settings for compromised-credentials actions and authentication types with advanced security
   * features in full-function `ENFORCED` mode.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e29eeb48e5960f8d9dcf803c25650c686eb50039e88d6d55c7735e6f3c6cc394")
  public open
      fun compromisedCredentialsRiskConfiguration(`value`: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
      Unit =
      compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   */
  public open fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   */
  public open fun riskExceptionConfiguration(`value`: IResolvable) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   */
  public open fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(RiskExceptionConfigurationTypeProperty.Companion::unwrap))
  }

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ca2b19f1a4cca9563cf0441443606153b1460d769fb29c46a97b8e30b87f091")
  public open
      fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
      Unit = riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(`value`))

  /**
   * The ID of the user pool that has the risk configuration applied.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The ID of the user pool that has the risk configuration applied.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable)

    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty)

    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The app client where this configuration is applied.
     *
     * When this parameter isn't present, the risk configuration applies to all user pool app
     * clients that don't have client-level settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     * @param clientId The app client where this configuration is applied. 
     */
    public fun clientId(clientId: String)

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable)

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty)

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable)

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty)

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The ID of the user pool that has the risk configuration applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     * @param userPoolId The ID of the user pool that has the risk configuration applied. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder.create(scope,
        id)

    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    override fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(AccountTakeoverRiskConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    /**
     * The app client where this configuration is applied.
     *
     * When this parameter isn't present, the risk configuration applies to all user pool app
     * clients that don't have client-level settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     * @param clientId The app client where this configuration is applied. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CompromisedCredentialsRiskConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(RiskExceptionConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    /**
     * The ID of the user pool that has the risk configuration applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     * @param userPoolId The ID of the user pool that has the risk configuration applied. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolRiskConfigurationAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolRiskConfigurationAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment):
        CfnUserPoolRiskConfigurationAttachment = CfnUserPoolRiskConfigurationAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolRiskConfigurationAttachment):
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
        wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
  }

  /**
   * The automated response to a risk level for adaptive authentication in full-function, or
   * `ENFORCED` , mode.
   *
   * You can assign an action to each risk level that advanced security features evaluates.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AccountTakeoverActionTypeProperty accountTakeoverActionTypeProperty =
   * AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html)
   */
  public interface AccountTakeoverActionTypeProperty {
    /**
     * The action to take for the attempted account takeover action for the associated risk level.
     *
     * Valid values are as follows:
     *
     * * `BLOCK` : Block the request.
     * * `MFA_IF_CONFIGURED` : Present an MFA challenge if possible. MFA is possible if the user
     * pool has active MFA methods that the user can set up. For example, if the user pool only
     * supports SMS message MFA but the user doesn't have a phone number attribute, MFA setup isn't
     * possible. If MFA setup isn't possible, allow the request.
     * * `MFA_REQUIRED` : Present an MFA challenge if possible. Block the request if a user hasn't
     * set up MFA. To sign in with required MFA, users must have an email address or phone number
     * attribute, or a registered TOTP factor.
     * * `NO_ACTION` : Take no action. Permit sign-in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction)
     */
    public fun eventAction(): String

    /**
     * Determines whether Amazon Cognito sends a user a notification message when your user pools
     * assesses a user's session at the associated risk level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify)
     */
    public fun notify(): Any

    /**
     * A builder for [AccountTakeoverActionTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventAction The action to take for the attempted account takeover action for the
       * associated risk level. 
       * Valid values are as follows:
       *
       * * `BLOCK` : Block the request.
       * * `MFA_IF_CONFIGURED` : Present an MFA challenge if possible. MFA is possible if the user
       * pool has active MFA methods that the user can set up. For example, if the user pool only
       * supports SMS message MFA but the user doesn't have a phone number attribute, MFA setup isn't
       * possible. If MFA setup isn't possible, allow the request.
       * * `MFA_REQUIRED` : Present an MFA challenge if possible. Block the request if a user hasn't
       * set up MFA. To sign in with required MFA, users must have an email address or phone number
       * attribute, or a registered TOTP factor.
       * * `NO_ACTION` : Take no action. Permit sign-in.
       */
      public fun eventAction(eventAction: String)

      /**
       * @param notify Determines whether Amazon Cognito sends a user a notification message when
       * your user pools assesses a user's session at the associated risk level. 
       */
      public fun notify(notify: Boolean)

      /**
       * @param notify Determines whether Amazon Cognito sends a user a notification message when
       * your user pools assesses a user's session at the associated risk level. 
       */
      public fun notify(notify: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.builder()

      /**
       * @param eventAction The action to take for the attempted account takeover action for the
       * associated risk level. 
       * Valid values are as follows:
       *
       * * `BLOCK` : Block the request.
       * * `MFA_IF_CONFIGURED` : Present an MFA challenge if possible. MFA is possible if the user
       * pool has active MFA methods that the user can set up. For example, if the user pool only
       * supports SMS message MFA but the user doesn't have a phone number attribute, MFA setup isn't
       * possible. If MFA setup isn't possible, allow the request.
       * * `MFA_REQUIRED` : Present an MFA challenge if possible. Block the request if a user hasn't
       * set up MFA. To sign in with required MFA, users must have an email address or phone number
       * attribute, or a registered TOTP factor.
       * * `NO_ACTION` : Take no action. Permit sign-in.
       */
      override fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
      }

      /**
       * @param notify Determines whether Amazon Cognito sends a user a notification message when
       * your user pools assesses a user's session at the associated risk level. 
       */
      override fun notify(notify: Boolean) {
        cdkBuilder.notify(notify)
      }

      /**
       * @param notify Determines whether Amazon Cognito sends a user a notification message when
       * your user pools assesses a user's session at the associated risk level. 
       */
      override fun notify(notify: IResolvable) {
        cdkBuilder.notify(notify.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty,
    ) : CdkObject(cdkObject),
        AccountTakeoverActionTypeProperty {
      /**
       * The action to take for the attempted account takeover action for the associated risk level.
       *
       * Valid values are as follows:
       *
       * * `BLOCK` : Block the request.
       * * `MFA_IF_CONFIGURED` : Present an MFA challenge if possible. MFA is possible if the user
       * pool has active MFA methods that the user can set up. For example, if the user pool only
       * supports SMS message MFA but the user doesn't have a phone number attribute, MFA setup isn't
       * possible. If MFA setup isn't possible, allow the request.
       * * `MFA_REQUIRED` : Present an MFA challenge if possible. Block the request if a user hasn't
       * set up MFA. To sign in with required MFA, users must have an email address or phone number
       * attribute, or a registered TOTP factor.
       * * `NO_ACTION` : Take no action. Permit sign-in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction)
       */
      override fun eventAction(): String = unwrap(this).getEventAction()

      /**
       * Determines whether Amazon Cognito sends a user a notification message when your user pools
       * assesses a user's session at the associated risk level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify)
       */
      override fun notify(): Any = unwrap(this).getNotify()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverActionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty):
          AccountTakeoverActionTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccountTakeoverActionTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverActionTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
    }
  }

  /**
   * A list of account-takeover actions for each level of risk that Amazon Cognito might assess with
   * advanced security features.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AccountTakeoverActionsTypeProperty accountTakeoverActionsTypeProperty =
   * AccountTakeoverActionsTypeProperty.builder()
   * .highAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .lowAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .mediumAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html)
   */
  public interface AccountTakeoverActionsTypeProperty {
    /**
     * The action that you assign to a high-risk assessment by advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-highaction)
     */
    public fun highAction(): Any? = unwrap(this).getHighAction()

    /**
     * The action that you assign to a low-risk assessment by advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-lowaction)
     */
    public fun lowAction(): Any? = unwrap(this).getLowAction()

    /**
     * The action that you assign to a medium-risk assessment by advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-mediumaction)
     */
    public fun mediumAction(): Any? = unwrap(this).getMediumAction()

    /**
     * A builder for [AccountTakeoverActionsTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      public fun highAction(highAction: IResolvable)

      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      public fun highAction(highAction: AccountTakeoverActionTypeProperty)

      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      public fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit)

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      public fun lowAction(lowAction: IResolvable)

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty)

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit)

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      public fun mediumAction(mediumAction: IResolvable)

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      public fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty)

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0be028fa84e1ccf8a6615b4fb0fa99924be459f987b9f079eaf28bcdf633f50")
      public fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.builder()

      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      override fun highAction(highAction: IResolvable) {
        cdkBuilder.highAction(highAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      override fun highAction(highAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.highAction(highAction.let(AccountTakeoverActionTypeProperty.Companion::unwrap))
      }

      /**
       * @param highAction The action that you assign to a high-risk assessment by advanced security
       * features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      override fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit):
          Unit = highAction(AccountTakeoverActionTypeProperty(highAction))

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      override fun lowAction(lowAction: IResolvable) {
        cdkBuilder.lowAction(lowAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      override fun lowAction(lowAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.lowAction(lowAction.let(AccountTakeoverActionTypeProperty.Companion::unwrap))
      }

      /**
       * @param lowAction The action that you assign to a low-risk assessment by advanced security
       * features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      override fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit): Unit
          = lowAction(AccountTakeoverActionTypeProperty(lowAction))

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      override fun mediumAction(mediumAction: IResolvable) {
        cdkBuilder.mediumAction(mediumAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      override fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.mediumAction(mediumAction.let(AccountTakeoverActionTypeProperty.Companion::unwrap))
      }

      /**
       * @param mediumAction The action that you assign to a medium-risk assessment by advanced
       * security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0be028fa84e1ccf8a6615b4fb0fa99924be459f987b9f079eaf28bcdf633f50")
      override fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit):
          Unit = mediumAction(AccountTakeoverActionTypeProperty(mediumAction))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty,
    ) : CdkObject(cdkObject),
        AccountTakeoverActionsTypeProperty {
      /**
       * The action that you assign to a high-risk assessment by advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-highaction)
       */
      override fun highAction(): Any? = unwrap(this).getHighAction()

      /**
       * The action that you assign to a low-risk assessment by advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-lowaction)
       */
      override fun lowAction(): Any? = unwrap(this).getLowAction()

      /**
       * The action that you assign to a medium-risk assessment by advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-mediumaction)
       */
      override fun mediumAction(): Any? = unwrap(this).getMediumAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverActionsTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty):
          AccountTakeoverActionsTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccountTakeoverActionsTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverActionsTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
    }
  }

  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AccountTakeoverRiskConfigurationTypeProperty accountTakeoverRiskConfigurationTypeProperty =
   * AccountTakeoverRiskConfigurationTypeProperty.builder()
   * .actions(AccountTakeoverActionsTypeProperty.builder()
   * .highAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .lowAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .mediumAction(AccountTakeoverActionTypeProperty.builder()
   * .eventAction("eventAction")
   * .notify(false)
   * .build())
   * .build())
   * // the properties below are optional
   * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
   * .sourceArn("sourceArn")
   * // the properties below are optional
   * .blockEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .from("from")
   * .mfaEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .noActionEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .replyTo("replyTo")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html)
   */
  public interface AccountTakeoverRiskConfigurationTypeProperty {
    /**
     * A list of account-takeover actions for each level of risk that Amazon Cognito might assess
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-actions)
     */
    public fun actions(): Any

    /**
     * The settings for composing and sending an email message when advanced security features
     * assesses a risk level with adaptive authentication.
     *
     * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito sends
     * an email message using the method and template that you set with this data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-notifyconfiguration)
     */
    public fun notifyConfiguration(): Any? = unwrap(this).getNotifyConfiguration()

    /**
     * A builder for [AccountTakeoverRiskConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      public fun actions(actions: AccountTakeoverActionsTypeProperty)

      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      public fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit)

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      public fun notifyConfiguration(notifyConfiguration: IResolvable)

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      public fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty)

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92517bde806b2d8246e6e681dd7ac5e32a2ea81f8ffd5c47a0953c0292176731")
      public
          fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.builder()

      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      override fun actions(actions: AccountTakeoverActionsTypeProperty) {
        cdkBuilder.actions(actions.let(AccountTakeoverActionsTypeProperty.Companion::unwrap))
      }

      /**
       * @param actions A list of account-takeover actions for each level of risk that Amazon
       * Cognito might assess with advanced security features. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      override fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit): Unit =
          actions(AccountTakeoverActionsTypeProperty(actions))

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      override fun notifyConfiguration(notifyConfiguration: IResolvable) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      override fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(NotifyConfigurationTypeProperty.Companion::unwrap))
      }

      /**
       * @param notifyConfiguration The settings for composing and sending an email message when
       * advanced security features assesses a risk level with adaptive authentication.
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92517bde806b2d8246e6e681dd7ac5e32a2ea81f8ffd5c47a0953c0292176731")
      override
          fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty.Builder.() -> Unit):
          Unit = notifyConfiguration(NotifyConfigurationTypeProperty(notifyConfiguration))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty,
    ) : CdkObject(cdkObject),
        AccountTakeoverRiskConfigurationTypeProperty {
      /**
       * A list of account-takeover actions for each level of risk that Amazon Cognito might assess
       * with advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * The settings for composing and sending an email message when advanced security features
       * assesses a risk level with adaptive authentication.
       *
       * When you choose to notify users in `AccountTakeoverRiskConfiguration` , Amazon Cognito
       * sends an email message using the method and template that you set with this data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-notifyconfiguration)
       */
      override fun notifyConfiguration(): Any? = unwrap(this).getNotifyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverRiskConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty):
          AccountTakeoverRiskConfigurationTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccountTakeoverRiskConfigurationTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverRiskConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
    }
  }

  /**
   * Settings for user pool actions when Amazon Cognito detects compromised credentials with
   * advanced security features in full-function `ENFORCED` mode.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CompromisedCredentialsActionsTypeProperty compromisedCredentialsActionsTypeProperty =
   * CompromisedCredentialsActionsTypeProperty.builder()
   * .eventAction("eventAction")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html)
   */
  public interface CompromisedCredentialsActionsTypeProperty {
    /**
     * The action that Amazon Cognito takes when it detects compromised credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction)
     */
    public fun eventAction(): String

    /**
     * A builder for [CompromisedCredentialsActionsTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventAction The action that Amazon Cognito takes when it detects compromised
       * credentials. 
       */
      public fun eventAction(eventAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder()

      /**
       * @param eventAction The action that Amazon Cognito takes when it detects compromised
       * credentials. 
       */
      override fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty,
    ) : CdkObject(cdkObject),
        CompromisedCredentialsActionsTypeProperty {
      /**
       * The action that Amazon Cognito takes when it detects compromised credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction)
       */
      override fun eventAction(): String = unwrap(this).getEventAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CompromisedCredentialsActionsTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty):
          CompromisedCredentialsActionsTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CompromisedCredentialsActionsTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompromisedCredentialsActionsTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
    }
  }

  /**
   * Settings for compromised-credentials actions and authentication-event sources with advanced
   * security features in full-function `ENFORCED` mode.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CompromisedCredentialsRiskConfigurationTypeProperty
   * compromisedCredentialsRiskConfigurationTypeProperty =
   * CompromisedCredentialsRiskConfigurationTypeProperty.builder()
   * .actions(CompromisedCredentialsActionsTypeProperty.builder()
   * .eventAction("eventAction")
   * .build())
   * // the properties below are optional
   * .eventFilter(List.of("eventFilter"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html)
   */
  public interface CompromisedCredentialsRiskConfigurationTypeProperty {
    /**
     * Settings for the actions that you want your user pool to take when Amazon Cognito detects
     * compromised credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-actions)
     */
    public fun actions(): Any

    /**
     * Settings for the sign-in activity where you want to configure compromised-credentials
     * actions.
     *
     * Defaults to all events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter)
     */
    public fun eventFilter(): List<String> = unwrap(this).getEventFilter() ?: emptyList()

    /**
     * A builder for [CompromisedCredentialsRiskConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      public fun actions(actions: CompromisedCredentialsActionsTypeProperty)

      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      public fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit)

      /**
       * @param eventFilter Settings for the sign-in activity where you want to configure
       * compromised-credentials actions.
       * Defaults to all events.
       */
      public fun eventFilter(eventFilter: List<String>)

      /**
       * @param eventFilter Settings for the sign-in activity where you want to configure
       * compromised-credentials actions.
       * Defaults to all events.
       */
      public fun eventFilter(vararg eventFilter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.builder()

      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      override fun actions(actions: CompromisedCredentialsActionsTypeProperty) {
        cdkBuilder.actions(actions.let(CompromisedCredentialsActionsTypeProperty.Companion::unwrap))
      }

      /**
       * @param actions Settings for the actions that you want your user pool to take when Amazon
       * Cognito detects compromised credentials. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      override fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit):
          Unit = actions(CompromisedCredentialsActionsTypeProperty(actions))

      /**
       * @param eventFilter Settings for the sign-in activity where you want to configure
       * compromised-credentials actions.
       * Defaults to all events.
       */
      override fun eventFilter(eventFilter: List<String>) {
        cdkBuilder.eventFilter(eventFilter)
      }

      /**
       * @param eventFilter Settings for the sign-in activity where you want to configure
       * compromised-credentials actions.
       * Defaults to all events.
       */
      override fun eventFilter(vararg eventFilter: String): Unit = eventFilter(eventFilter.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty,
    ) : CdkObject(cdkObject),
        CompromisedCredentialsRiskConfigurationTypeProperty {
      /**
       * Settings for the actions that you want your user pool to take when Amazon Cognito detects
       * compromised credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * Settings for the sign-in activity where you want to configure compromised-credentials
       * actions.
       *
       * Defaults to all events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter)
       */
      override fun eventFilter(): List<String> = unwrap(this).getEventFilter() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CompromisedCredentialsRiskConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty):
          CompromisedCredentialsRiskConfigurationTypeProperty = CdkObjectWrappers.wrap(cdkObject)
          as? CompromisedCredentialsRiskConfigurationTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompromisedCredentialsRiskConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
    }
  }

  /**
   * The configuration for Amazon SES email messages that advanced security features sends to a user
   * when your adaptive authentication automated response has a *Notify* action.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * NotifyConfigurationTypeProperty notifyConfigurationTypeProperty =
   * NotifyConfigurationTypeProperty.builder()
   * .sourceArn("sourceArn")
   * // the properties below are optional
   * .blockEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .from("from")
   * .mfaEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .noActionEmail(NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build())
   * .replyTo("replyTo")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html)
   */
  public interface NotifyConfigurationTypeProperty {
    /**
     * The template for the email message that your user pool sends when a detected risk event is
     * blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-blockemail)
     */
    public fun blockEmail(): Any? = unwrap(this).getBlockEmail()

    /**
     * The email address that sends the email message.
     *
     * The address must be either individually verified with Amazon Simple Email Service, or from a
     * domain that has been verified with Amazon SES.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from)
     */
    public fun from(): String? = unwrap(this).getFrom()

    /**
     * The template for the email message that your user pool sends when MFA is challenged in
     * response to a detected risk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-mfaemail)
     */
    public fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

    /**
     * The template for the email message that your user pool sends when no action is taken in
     * response to a detected risk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-noactionemail)
     */
    public fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

    /**
     * The reply-to email address of an email template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto)
     */
    public fun replyTo(): String? = unwrap(this).getReplyTo()

    /**
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending
     * authorization policy.
     *
     * This identity permits Amazon Cognito to send for the email address specified in the `From`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn)
     */
    public fun sourceArn(): String

    /**
     * A builder for [NotifyConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      public fun blockEmail(blockEmail: IResolvable)

      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      public fun blockEmail(blockEmail: NotifyEmailTypeProperty)

      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      public fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param from The email address that sends the email message.
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       */
      public fun from(from: String)

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      public fun mfaEmail(mfaEmail: IResolvable)

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty)

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      public fun noActionEmail(noActionEmail: IResolvable)

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty)

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param replyTo The reply-to email address of an email template.
       */
      public fun replyTo(replyTo: String)

      /**
       * @param sourceArn The Amazon Resource Name (ARN) of the identity that is associated with the
       * sending authorization policy. 
       * This identity permits Amazon Cognito to send for the email address specified in the `From`
       * parameter.
       */
      public fun sourceArn(sourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.builder()

      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      override fun blockEmail(blockEmail: IResolvable) {
        cdkBuilder.blockEmail(blockEmail.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      override fun blockEmail(blockEmail: NotifyEmailTypeProperty) {
        cdkBuilder.blockEmail(blockEmail.let(NotifyEmailTypeProperty.Companion::unwrap))
      }

      /**
       * @param blockEmail The template for the email message that your user pool sends when a
       * detected risk event is blocked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      override fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          blockEmail(NotifyEmailTypeProperty(blockEmail))

      /**
       * @param from The email address that sends the email message.
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       */
      override fun from(from: String) {
        cdkBuilder.from(from)
      }

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      override fun mfaEmail(mfaEmail: IResolvable) {
        cdkBuilder.mfaEmail(mfaEmail.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty) {
        cdkBuilder.mfaEmail(mfaEmail.let(NotifyEmailTypeProperty.Companion::unwrap))
      }

      /**
       * @param mfaEmail The template for the email message that your user pool sends when MFA is
       * challenged in response to a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          mfaEmail(NotifyEmailTypeProperty(mfaEmail))

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      override fun noActionEmail(noActionEmail: IResolvable) {
        cdkBuilder.noActionEmail(noActionEmail.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty) {
        cdkBuilder.noActionEmail(noActionEmail.let(NotifyEmailTypeProperty.Companion::unwrap))
      }

      /**
       * @param noActionEmail The template for the email message that your user pool sends when no
       * action is taken in response to a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          noActionEmail(NotifyEmailTypeProperty(noActionEmail))

      /**
       * @param replyTo The reply-to email address of an email template.
       */
      override fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
      }

      /**
       * @param sourceArn The Amazon Resource Name (ARN) of the identity that is associated with the
       * sending authorization policy. 
       * This identity permits Amazon Cognito to send for the email address specified in the `From`
       * parameter.
       */
      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty,
    ) : CdkObject(cdkObject),
        NotifyConfigurationTypeProperty {
      /**
       * The template for the email message that your user pool sends when a detected risk event is
       * blocked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-blockemail)
       */
      override fun blockEmail(): Any? = unwrap(this).getBlockEmail()

      /**
       * The email address that sends the email message.
       *
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from)
       */
      override fun from(): String? = unwrap(this).getFrom()

      /**
       * The template for the email message that your user pool sends when MFA is challenged in
       * response to a detected risk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-mfaemail)
       */
      override fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

      /**
       * The template for the email message that your user pool sends when no action is taken in
       * response to a detected risk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-noactionemail)
       */
      override fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

      /**
       * The reply-to email address of an email template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-replyto)
       */
      override fun replyTo(): String? = unwrap(this).getReplyTo()

      /**
       * The Amazon Resource Name (ARN) of the identity that is associated with the sending
       * authorization policy.
       *
       * This identity permits Amazon Cognito to send for the email address specified in the `From`
       * parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-sourcearn)
       */
      override fun sourceArn(): String = unwrap(this).getSourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotifyConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty):
          NotifyConfigurationTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotifyConfigurationTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotifyConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
    }
  }

  /**
   * The template for email messages that advanced security features sends to a user when your
   * threat protection automated response has a *Notify* action.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * NotifyEmailTypeProperty notifyEmailTypeProperty = NotifyEmailTypeProperty.builder()
   * .subject("subject")
   * // the properties below are optional
   * .htmlBody("htmlBody")
   * .textBody("textBody")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html)
   */
  public interface NotifyEmailTypeProperty {
    /**
     * The body of an email notification formatted in HTML.
     *
     * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
     * respectively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody)
     */
    public fun htmlBody(): String? = unwrap(this).getHtmlBody()

    /**
     * The subject of the threat protection email notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject)
     */
    public fun subject(): String

    /**
     * The body of an email notification formatted in plaintext.
     *
     * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
     * respectively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody)
     */
    public fun textBody(): String? = unwrap(this).getTextBody()

    /**
     * A builder for [NotifyEmailTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param htmlBody The body of an email notification formatted in HTML.
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       */
      public fun htmlBody(htmlBody: String)

      /**
       * @param subject The subject of the threat protection email notification. 
       */
      public fun subject(subject: String)

      /**
       * @param textBody The body of an email notification formatted in plaintext.
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       */
      public fun textBody(textBody: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder()

      /**
       * @param htmlBody The body of an email notification formatted in HTML.
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       */
      override fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
      }

      /**
       * @param subject The subject of the threat protection email notification. 
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      /**
       * @param textBody The body of an email notification formatted in plaintext.
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       */
      override fun textBody(textBody: String) {
        cdkBuilder.textBody(textBody)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty,
    ) : CdkObject(cdkObject),
        NotifyEmailTypeProperty {
      /**
       * The body of an email notification formatted in HTML.
       *
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody)
       */
      override fun htmlBody(): String? = unwrap(this).getHtmlBody()

      /**
       * The subject of the threat protection email notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject)
       */
      override fun subject(): String = unwrap(this).getSubject()

      /**
       * The body of an email notification formatted in plaintext.
       *
       * Choose an `HtmlBody` or a `TextBody` to send an HTML-formatted or plaintext message,
       * respectively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-textbody)
       */
      override fun textBody(): String? = unwrap(this).getTextBody()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotifyEmailTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty):
          NotifyEmailTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? NotifyEmailTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotifyEmailTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
    }
  }

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   *
   * This data type is a request parameter of
   * [SetRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetRiskConfiguration.html)
   * and a response parameter of
   * [DescribeRiskConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeRiskConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * RiskExceptionConfigurationTypeProperty riskExceptionConfigurationTypeProperty =
   * RiskExceptionConfigurationTypeProperty.builder()
   * .blockedIpRangeList(List.of("blockedIpRangeList"))
   * .skippedIpRangeList(List.of("skippedIpRangeList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html)
   */
  public interface RiskExceptionConfigurationTypeProperty {
    /**
     * An always-block IP address list.
     *
     * Overrides the risk decision and always blocks authentication requests. This parameter is
     * displayed and set in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist)
     */
    public fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList() ?:
        emptyList()

    /**
     * An always-allow IP address list.
     *
     * Risk detection isn't performed on the IP addresses in this range list. This parameter is
     * displayed and set in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist)
     */
    public fun skippedIpRangeList(): List<String> = unwrap(this).getSkippedIpRangeList() ?:
        emptyList()

    /**
     * A builder for [RiskExceptionConfigurationTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockedIpRangeList An always-block IP address list.
       * Overrides the risk decision and always blocks authentication requests. This parameter is
       * displayed and set in CIDR notation.
       */
      public fun blockedIpRangeList(blockedIpRangeList: List<String>)

      /**
       * @param blockedIpRangeList An always-block IP address list.
       * Overrides the risk decision and always blocks authentication requests. This parameter is
       * displayed and set in CIDR notation.
       */
      public fun blockedIpRangeList(vararg blockedIpRangeList: String)

      /**
       * @param skippedIpRangeList An always-allow IP address list.
       * Risk detection isn't performed on the IP addresses in this range list. This parameter is
       * displayed and set in CIDR notation.
       */
      public fun skippedIpRangeList(skippedIpRangeList: List<String>)

      /**
       * @param skippedIpRangeList An always-allow IP address list.
       * Risk detection isn't performed on the IP addresses in this range list. This parameter is
       * displayed and set in CIDR notation.
       */
      public fun skippedIpRangeList(vararg skippedIpRangeList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder()

      /**
       * @param blockedIpRangeList An always-block IP address list.
       * Overrides the risk decision and always blocks authentication requests. This parameter is
       * displayed and set in CIDR notation.
       */
      override fun blockedIpRangeList(blockedIpRangeList: List<String>) {
        cdkBuilder.blockedIpRangeList(blockedIpRangeList)
      }

      /**
       * @param blockedIpRangeList An always-block IP address list.
       * Overrides the risk decision and always blocks authentication requests. This parameter is
       * displayed and set in CIDR notation.
       */
      override fun blockedIpRangeList(vararg blockedIpRangeList: String): Unit =
          blockedIpRangeList(blockedIpRangeList.toList())

      /**
       * @param skippedIpRangeList An always-allow IP address list.
       * Risk detection isn't performed on the IP addresses in this range list. This parameter is
       * displayed and set in CIDR notation.
       */
      override fun skippedIpRangeList(skippedIpRangeList: List<String>) {
        cdkBuilder.skippedIpRangeList(skippedIpRangeList)
      }

      /**
       * @param skippedIpRangeList An always-allow IP address list.
       * Risk detection isn't performed on the IP addresses in this range list. This parameter is
       * displayed and set in CIDR notation.
       */
      override fun skippedIpRangeList(vararg skippedIpRangeList: String): Unit =
          skippedIpRangeList(skippedIpRangeList.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty,
    ) : CdkObject(cdkObject),
        RiskExceptionConfigurationTypeProperty {
      /**
       * An always-block IP address list.
       *
       * Overrides the risk decision and always blocks authentication requests. This parameter is
       * displayed and set in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist)
       */
      override fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList() ?:
          emptyList()

      /**
       * An always-allow IP address list.
       *
       * Risk detection isn't performed on the IP addresses in this range list. This parameter is
       * displayed and set in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist)
       */
      override fun skippedIpRangeList(): List<String> = unwrap(this).getSkippedIpRangeList() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RiskExceptionConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty):
          RiskExceptionConfigurationTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RiskExceptionConfigurationTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RiskExceptionConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
    }
  }
}
