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
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolRiskConfigurationAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnUserPoolRiskConfigurationAttachmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolRiskConfigurationAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolRiskConfigurationAttachmentProps(props)
  )

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   */
  public open fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   */
  public open fun accountTakeoverRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   */
  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(AccountTakeoverRiskConfigurationTypeProperty::unwrap))
  }

  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2d693232dc81f90060219d90f0f03de79d833bbb55b26aa0ac11a65de8002d6")
  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
      Unit = accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(`value`))

  /**
   * The app client ID.
   */
  public open fun clientId(): String = unwrap(this).getClientId()

  /**
   * The app client ID.
   */
  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   */
  public open fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   */
  public open fun compromisedCredentialsRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   */
  public open
      fun compromisedCredentialsRiskConfiguration(`value`: CompromisedCredentialsRiskConfigurationTypeProperty) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
  }

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration to override the risk decision.
   */
  public open fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  /**
   * The configuration to override the risk decision.
   */
  public open fun riskExceptionConfiguration(`value`: IResolvable) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration to override the risk decision.
   */
  public open fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(RiskExceptionConfigurationTypeProperty::unwrap))
  }

  /**
   * The configuration to override the risk decision.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ca2b19f1a4cca9563cf0441443606153b1460d769fb29c46a97b8e30b87f091")
  public open
      fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
      Unit = riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(`value`))

  /**
   * The user pool ID.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID.
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
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable)

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty)

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The app client ID.
     *
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     * @param clientId The app client ID. 
     */
    public fun clientId(clientId: String)

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable)

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty)

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable)

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty)

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     * @param userPoolId The user pool ID. 
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
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    override fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(AccountTakeoverRiskConfigurationTypeProperty::unwrap))
    }

    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    /**
     * The app client ID.
     *
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     * @param clientId The app client ID. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
    }

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(RiskExceptionConfigurationTypeProperty::unwrap))
    }

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     * @param riskExceptionConfiguration The configuration to override the risk decision. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     * @param userPoolId The user pool ID. 
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
   * Account takeover action type.
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
     * The action to take in response to the account takeover action. Valid values are as follows:.
     *
     * * `BLOCK` Choosing this action will block the request.
     * * `MFA_IF_CONFIGURED` Present an MFA challenge if user has configured it, else allow the
     * request.
     * * `MFA_REQUIRED` Present an MFA challenge if user has configured it, else block the request.
     * * `NO_ACTION` Allow the user to sign in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction)
     */
    public fun eventAction(): String

    /**
     * Flag specifying whether to send a notification.
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
       * @param eventAction The action to take in response to the account takeover action. Valid
       * values are as follows:. 
       * * `BLOCK` Choosing this action will block the request.
       * * `MFA_IF_CONFIGURED` Present an MFA challenge if user has configured it, else allow the
       * request.
       * * `MFA_REQUIRED` Present an MFA challenge if user has configured it, else block the
       * request.
       * * `NO_ACTION` Allow the user to sign in.
       */
      public fun eventAction(eventAction: String)

      /**
       * @param notify Flag specifying whether to send a notification. 
       */
      public fun notify(notify: Boolean)

      /**
       * @param notify Flag specifying whether to send a notification. 
       */
      public fun notify(notify: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.builder()

      /**
       * @param eventAction The action to take in response to the account takeover action. Valid
       * values are as follows:. 
       * * `BLOCK` Choosing this action will block the request.
       * * `MFA_IF_CONFIGURED` Present an MFA challenge if user has configured it, else allow the
       * request.
       * * `MFA_REQUIRED` Present an MFA challenge if user has configured it, else block the
       * request.
       * * `NO_ACTION` Allow the user to sign in.
       */
      override fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
      }

      /**
       * @param notify Flag specifying whether to send a notification. 
       */
      override fun notify(notify: Boolean) {
        cdkBuilder.notify(notify)
      }

      /**
       * @param notify Flag specifying whether to send a notification. 
       */
      override fun notify(notify: IResolvable) {
        cdkBuilder.notify(notify.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty,
    ) : CdkObject(cdkObject), AccountTakeoverActionTypeProperty {
      /**
       * The action to take in response to the account takeover action. Valid values are as
       * follows:.
       *
       * * `BLOCK` Choosing this action will block the request.
       * * `MFA_IF_CONFIGURED` Present an MFA challenge if user has configured it, else allow the
       * request.
       * * `MFA_REQUIRED` Present an MFA challenge if user has configured it, else block the
       * request.
       * * `NO_ACTION` Allow the user to sign in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction)
       */
      override fun eventAction(): String = unwrap(this).getEventAction()

      /**
       * Flag specifying whether to send a notification.
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
   * Account takeover actions type.
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
     * Action to take for a high risk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-highaction)
     */
    public fun highAction(): Any? = unwrap(this).getHighAction()

    /**
     * Action to take for a low risk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-lowaction)
     */
    public fun lowAction(): Any? = unwrap(this).getLowAction()

    /**
     * Action to take for a medium risk.
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
       * @param highAction Action to take for a high risk.
       */
      public fun highAction(highAction: IResolvable)

      /**
       * @param highAction Action to take for a high risk.
       */
      public fun highAction(highAction: AccountTakeoverActionTypeProperty)

      /**
       * @param highAction Action to take for a high risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      public fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit)

      /**
       * @param lowAction Action to take for a low risk.
       */
      public fun lowAction(lowAction: IResolvable)

      /**
       * @param lowAction Action to take for a low risk.
       */
      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty)

      /**
       * @param lowAction Action to take for a low risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit)

      /**
       * @param mediumAction Action to take for a medium risk.
       */
      public fun mediumAction(mediumAction: IResolvable)

      /**
       * @param mediumAction Action to take for a medium risk.
       */
      public fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty)

      /**
       * @param mediumAction Action to take for a medium risk.
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
       * @param highAction Action to take for a high risk.
       */
      override fun highAction(highAction: IResolvable) {
        cdkBuilder.highAction(highAction.let(IResolvable::unwrap))
      }

      /**
       * @param highAction Action to take for a high risk.
       */
      override fun highAction(highAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.highAction(highAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      /**
       * @param highAction Action to take for a high risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      override fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit):
          Unit = highAction(AccountTakeoverActionTypeProperty(highAction))

      /**
       * @param lowAction Action to take for a low risk.
       */
      override fun lowAction(lowAction: IResolvable) {
        cdkBuilder.lowAction(lowAction.let(IResolvable::unwrap))
      }

      /**
       * @param lowAction Action to take for a low risk.
       */
      override fun lowAction(lowAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.lowAction(lowAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      /**
       * @param lowAction Action to take for a low risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      override fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit): Unit
          = lowAction(AccountTakeoverActionTypeProperty(lowAction))

      /**
       * @param mediumAction Action to take for a medium risk.
       */
      override fun mediumAction(mediumAction: IResolvable) {
        cdkBuilder.mediumAction(mediumAction.let(IResolvable::unwrap))
      }

      /**
       * @param mediumAction Action to take for a medium risk.
       */
      override fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.mediumAction(mediumAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      /**
       * @param mediumAction Action to take for a medium risk.
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
    ) : CdkObject(cdkObject), AccountTakeoverActionsTypeProperty {
      /**
       * Action to take for a high risk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-highaction)
       */
      override fun highAction(): Any? = unwrap(this).getHighAction()

      /**
       * Action to take for a low risk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype-lowaction)
       */
      override fun lowAction(): Any? = unwrap(this).getLowAction()

      /**
       * Action to take for a medium risk.
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
   * Configuration for mitigation actions and notification for different levels of risk detected for
   * a potential account takeover.
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
     * Account takeover risk configuration actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-actions)
     */
    public fun actions(): Any

    /**
     * The notify configuration used to construct email notifications.
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
       * @param actions Account takeover risk configuration actions. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions Account takeover risk configuration actions. 
       */
      public fun actions(actions: AccountTakeoverActionsTypeProperty)

      /**
       * @param actions Account takeover risk configuration actions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      public fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit)

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
       */
      public fun notifyConfiguration(notifyConfiguration: IResolvable)

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
       */
      public fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty)

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
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
       * @param actions Account takeover risk configuration actions. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions Account takeover risk configuration actions. 
       */
      override fun actions(actions: AccountTakeoverActionsTypeProperty) {
        cdkBuilder.actions(actions.let(AccountTakeoverActionsTypeProperty::unwrap))
      }

      /**
       * @param actions Account takeover risk configuration actions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      override fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit): Unit =
          actions(AccountTakeoverActionsTypeProperty(actions))

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
       */
      override fun notifyConfiguration(notifyConfiguration: IResolvable) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
       */
      override fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(NotifyConfigurationTypeProperty::unwrap))
      }

      /**
       * @param notifyConfiguration The notify configuration used to construct email notifications.
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
    ) : CdkObject(cdkObject), AccountTakeoverRiskConfigurationTypeProperty {
      /**
       * Account takeover risk configuration actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * The notify configuration used to construct email notifications.
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
   * The compromised credentials actions type.
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
     * The event action.
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
       * @param eventAction The event action. 
       */
      public fun eventAction(eventAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder()

      /**
       * @param eventAction The event action. 
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
    ) : CdkObject(cdkObject), CompromisedCredentialsActionsTypeProperty {
      /**
       * The event action.
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
   * The compromised credentials risk configuration type.
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
     * The compromised credentials risk configuration actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-actions)
     */
    public fun actions(): Any

    /**
     * Perform the action for these events.
     *
     * The default is to perform all events if no event filter is specified.
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
       * @param actions The compromised credentials risk configuration actions. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The compromised credentials risk configuration actions. 
       */
      public fun actions(actions: CompromisedCredentialsActionsTypeProperty)

      /**
       * @param actions The compromised credentials risk configuration actions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      public fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit)

      /**
       * @param eventFilter Perform the action for these events.
       * The default is to perform all events if no event filter is specified.
       */
      public fun eventFilter(eventFilter: List<String>)

      /**
       * @param eventFilter Perform the action for these events.
       * The default is to perform all events if no event filter is specified.
       */
      public fun eventFilter(vararg eventFilter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.builder()

      /**
       * @param actions The compromised credentials risk configuration actions. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions The compromised credentials risk configuration actions. 
       */
      override fun actions(actions: CompromisedCredentialsActionsTypeProperty) {
        cdkBuilder.actions(actions.let(CompromisedCredentialsActionsTypeProperty::unwrap))
      }

      /**
       * @param actions The compromised credentials risk configuration actions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      override fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit):
          Unit = actions(CompromisedCredentialsActionsTypeProperty(actions))

      /**
       * @param eventFilter Perform the action for these events.
       * The default is to perform all events if no event filter is specified.
       */
      override fun eventFilter(eventFilter: List<String>) {
        cdkBuilder.eventFilter(eventFilter)
      }

      /**
       * @param eventFilter Perform the action for these events.
       * The default is to perform all events if no event filter is specified.
       */
      override fun eventFilter(vararg eventFilter: String): Unit = eventFilter(eventFilter.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty,
    ) : CdkObject(cdkObject), CompromisedCredentialsRiskConfigurationTypeProperty {
      /**
       * The compromised credentials risk configuration actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * Perform the action for these events.
       *
       * The default is to perform all events if no event filter is specified.
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
   * The notify configuration type.
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
     * Email template used when a detected risk event is blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-blockemail)
     */
    public fun blockEmail(): Any? = unwrap(this).getBlockEmail()

    /**
     * The email address that is sending the email.
     *
     * The address must be either individually verified with Amazon Simple Email Service, or from a
     * domain that has been verified with Amazon SES.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from)
     */
    public fun from(): String? = unwrap(this).getFrom()

    /**
     * The multi-factor authentication (MFA) email template used when MFA is challenged as part of a
     * detected risk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-mfaemail)
     */
    public fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

    /**
     * The email template used when a detected risk event is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-noactionemail)
     */
    public fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

    /**
     * The destination to which the receiver of an email should reply to.
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
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      public fun blockEmail(blockEmail: IResolvable)

      /**
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      public fun blockEmail(blockEmail: NotifyEmailTypeProperty)

      /**
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      public fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param from The email address that is sending the email.
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       */
      public fun from(from: String)

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      public fun mfaEmail(mfaEmail: IResolvable)

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty)

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      public fun noActionEmail(noActionEmail: IResolvable)

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty)

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit)

      /**
       * @param replyTo The destination to which the receiver of an email should reply to.
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
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      override fun blockEmail(blockEmail: IResolvable) {
        cdkBuilder.blockEmail(blockEmail.let(IResolvable::unwrap))
      }

      /**
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      override fun blockEmail(blockEmail: NotifyEmailTypeProperty) {
        cdkBuilder.blockEmail(blockEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      /**
       * @param blockEmail Email template used when a detected risk event is blocked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      override fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          blockEmail(NotifyEmailTypeProperty(blockEmail))

      /**
       * @param from The email address that is sending the email.
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       */
      override fun from(from: String) {
        cdkBuilder.from(from)
      }

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      override fun mfaEmail(mfaEmail: IResolvable) {
        cdkBuilder.mfaEmail(mfaEmail.let(IResolvable::unwrap))
      }

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty) {
        cdkBuilder.mfaEmail(mfaEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      /**
       * @param mfaEmail The multi-factor authentication (MFA) email template used when MFA is
       * challenged as part of a detected risk.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          mfaEmail(NotifyEmailTypeProperty(mfaEmail))

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      override fun noActionEmail(noActionEmail: IResolvable) {
        cdkBuilder.noActionEmail(noActionEmail.let(IResolvable::unwrap))
      }

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty) {
        cdkBuilder.noActionEmail(noActionEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      /**
       * @param noActionEmail The email template used when a detected risk event is allowed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          noActionEmail(NotifyEmailTypeProperty(noActionEmail))

      /**
       * @param replyTo The destination to which the receiver of an email should reply to.
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
    ) : CdkObject(cdkObject), NotifyConfigurationTypeProperty {
      /**
       * Email template used when a detected risk event is blocked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-blockemail)
       */
      override fun blockEmail(): Any? = unwrap(this).getBlockEmail()

      /**
       * The email address that is sending the email.
       *
       * The address must be either individually verified with Amazon Simple Email Service, or from
       * a domain that has been verified with Amazon SES.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-from)
       */
      override fun from(): String? = unwrap(this).getFrom()

      /**
       * The multi-factor authentication (MFA) email template used when MFA is challenged as part of
       * a detected risk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-mfaemail)
       */
      override fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

      /**
       * The email template used when a detected risk event is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype-noactionemail)
       */
      override fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

      /**
       * The destination to which the receiver of an email should reply to.
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
   * The notify email type.
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
     * The email HTML body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody)
     */
    public fun htmlBody(): String? = unwrap(this).getHtmlBody()

    /**
     * The email subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject)
     */
    public fun subject(): String

    /**
     * The email text body.
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
       * @param htmlBody The email HTML body.
       */
      public fun htmlBody(htmlBody: String)

      /**
       * @param subject The email subject. 
       */
      public fun subject(subject: String)

      /**
       * @param textBody The email text body.
       */
      public fun textBody(textBody: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder()

      /**
       * @param htmlBody The email HTML body.
       */
      override fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
      }

      /**
       * @param subject The email subject. 
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      /**
       * @param textBody The email text body.
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
    ) : CdkObject(cdkObject), NotifyEmailTypeProperty {
      /**
       * The email HTML body.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-htmlbody)
       */
      override fun htmlBody(): String? = unwrap(this).getHtmlBody()

      /**
       * The email subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html#cfn-cognito-userpoolriskconfigurationattachment-notifyemailtype-subject)
       */
      override fun subject(): String = unwrap(this).getSubject()

      /**
       * The email text body.
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
   * The type of the configuration to override the risk decision.
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
     * Overrides the risk decision to always block the pre-authentication requests.
     *
     * The IP range is in CIDR notation, a compact representation of an IP address and its routing
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist)
     */
    public fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList() ?:
        emptyList()

    /**
     * Risk detection isn't performed on the IP addresses in this range list.
     *
     * The IP range is in CIDR notation.
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
       * @param blockedIpRangeList Overrides the risk decision to always block the
       * pre-authentication requests.
       * The IP range is in CIDR notation, a compact representation of an IP address and its routing
       * prefix.
       */
      public fun blockedIpRangeList(blockedIpRangeList: List<String>)

      /**
       * @param blockedIpRangeList Overrides the risk decision to always block the
       * pre-authentication requests.
       * The IP range is in CIDR notation, a compact representation of an IP address and its routing
       * prefix.
       */
      public fun blockedIpRangeList(vararg blockedIpRangeList: String)

      /**
       * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
       * list.
       * The IP range is in CIDR notation.
       */
      public fun skippedIpRangeList(skippedIpRangeList: List<String>)

      /**
       * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
       * list.
       * The IP range is in CIDR notation.
       */
      public fun skippedIpRangeList(vararg skippedIpRangeList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder()

      /**
       * @param blockedIpRangeList Overrides the risk decision to always block the
       * pre-authentication requests.
       * The IP range is in CIDR notation, a compact representation of an IP address and its routing
       * prefix.
       */
      override fun blockedIpRangeList(blockedIpRangeList: List<String>) {
        cdkBuilder.blockedIpRangeList(blockedIpRangeList)
      }

      /**
       * @param blockedIpRangeList Overrides the risk decision to always block the
       * pre-authentication requests.
       * The IP range is in CIDR notation, a compact representation of an IP address and its routing
       * prefix.
       */
      override fun blockedIpRangeList(vararg blockedIpRangeList: String): Unit =
          blockedIpRangeList(blockedIpRangeList.toList())

      /**
       * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
       * list.
       * The IP range is in CIDR notation.
       */
      override fun skippedIpRangeList(skippedIpRangeList: List<String>) {
        cdkBuilder.skippedIpRangeList(skippedIpRangeList)
      }

      /**
       * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
       * list.
       * The IP range is in CIDR notation.
       */
      override fun skippedIpRangeList(vararg skippedIpRangeList: String): Unit =
          skippedIpRangeList(skippedIpRangeList.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty,
    ) : CdkObject(cdkObject), RiskExceptionConfigurationTypeProperty {
      /**
       * Overrides the risk decision to always block the pre-authentication requests.
       *
       * The IP range is in CIDR notation, a compact representation of an IP address and its routing
       * prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist)
       */
      override fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList() ?:
          emptyList()

      /**
       * Risk detection isn't performed on the IP addresses in this range list.
       *
       * The IP range is in CIDR notation.
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
