@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserPoolRiskConfigurationAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolRiskConfigurationAttachmentProps cfnUserPoolRiskConfigurationAttachmentProps =
 * CfnUserPoolRiskConfigurationAttachmentProps.builder()
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
public interface CfnUserPoolRiskConfigurationAttachmentProps {
  /**
   * The settings for automated responses and notification templates for adaptive authentication
   * with advanced security features.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
   */
  public fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  /**
   * The app client where this configuration is applied.
   *
   * When this parameter isn't present, the risk configuration applies to all user pool app clients
   * that don't have client-level settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
   */
  public fun clientId(): String

  /**
   * Settings for compromised-credentials actions and authentication types with advanced security
   * features in full-function `ENFORCED` mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
   */
  public fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  /**
   * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
   * address ranges.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
   */
  public fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  /**
   * The ID of the user pool that has the risk configuration applied.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolRiskConfigurationAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable)

    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty)

    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param clientId The app client where this configuration is applied. 
     * When this parameter isn't present, the risk configuration applies to all user pool app
     * clients that don't have client-level settings.
     */
    public fun clientId(clientId: String)

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable)

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty)

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable)

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty)

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param userPoolId The ID of the user pool that has the risk configuration applied. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.Builder
        =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.builder()

    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    override fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * @param accountTakeoverRiskConfiguration The settings for automated responses and notification
     * templates for adaptive authentication with advanced security features.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    /**
     * @param clientId The app client where this configuration is applied. 
     * When this parameter isn't present, the risk configuration applies to all user pool app
     * clients that don't have client-level settings.
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * @param compromisedCredentialsRiskConfiguration Settings for compromised-credentials actions
     * and authentication types with advanced security features in full-function `ENFORCED` mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Companion::unwrap))
    }

    /**
     * @param riskExceptionConfiguration Exceptions to the risk evaluation configuration, including
     * always-allow and always-block IP address ranges.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    /**
     * @param userPoolId The ID of the user pool that has the risk configuration applied. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolRiskConfigurationAttachmentProps {
    /**
     * The settings for automated responses and notification templates for adaptive authentication
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     */
    override fun accountTakeoverRiskConfiguration(): Any? =
        unwrap(this).getAccountTakeoverRiskConfiguration()

    /**
     * The app client where this configuration is applied.
     *
     * When this parameter isn't present, the risk configuration applies to all user pool app
     * clients that don't have client-level settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * Settings for compromised-credentials actions and authentication types with advanced security
     * features in full-function `ENFORCED` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     */
    override fun compromisedCredentialsRiskConfiguration(): Any? =
        unwrap(this).getCompromisedCredentialsRiskConfiguration()

    /**
     * Exceptions to the risk evaluation configuration, including always-allow and always-block IP
     * address ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     */
    override fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

    /**
     * The ID of the user pool that has the risk configuration applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolRiskConfigurationAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps):
        CfnUserPoolRiskConfigurationAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserPoolRiskConfigurationAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolRiskConfigurationAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
  }
}
