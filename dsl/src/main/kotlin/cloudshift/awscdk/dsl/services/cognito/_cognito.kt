@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.AuthFlow
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs
import software.amazon.awscdk.services.cognito.BaseUrlOptions
import software.amazon.awscdk.services.cognito.BooleanAttribute
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import software.amazon.awscdk.services.cognito.CfnUserPoolProps
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomAttributeConfig
import software.amazon.awscdk.services.cognito.CustomAttributeProps
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.DateTimeAttribute
import software.amazon.awscdk.services.cognito.DeviceTracking
import software.amazon.awscdk.services.cognito.EmailSettings
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs
import software.amazon.awscdk.services.cognito.MfaSecondFactor
import software.amazon.awscdk.services.cognito.NumberAttribute
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints
import software.amazon.awscdk.services.cognito.NumberAttributeProps
import software.amazon.awscdk.services.cognito.OAuthFlows
import software.amazon.awscdk.services.cognito.OAuthSettings
import software.amazon.awscdk.services.cognito.OidcEndpoints
import software.amazon.awscdk.services.cognito.PasswordPolicy
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.ResourceServerScopeProps
import software.amazon.awscdk.services.cognito.SignInAliases
import software.amazon.awscdk.services.cognito.SignInUrlOptions
import software.amazon.awscdk.services.cognito.StandardAttribute
import software.amazon.awscdk.services.cognito.StandardAttributes
import software.amazon.awscdk.services.cognito.StandardAttributesMask
import software.amazon.awscdk.services.cognito.StringAttribute
import software.amazon.awscdk.services.cognito.StringAttributeConstraints
import software.amazon.awscdk.services.cognito.StringAttributeProps
import software.amazon.awscdk.services.cognito.UserInvitationConfig
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientOptions
import software.amazon.awscdk.services.cognito.UserPoolClientProps
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolDomainOptions
import software.amazon.awscdk.services.cognito.UserPoolDomainProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
import software.amazon.awscdk.services.cognito.UserPoolSESOptions
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.constructs.Construct

public object cognito {
  public inline fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}): AttributeMapping {
    val builder = AttributeMappingDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun authFlow(block: AuthFlowDsl.() -> Unit = {}): AuthFlow {
    val builder = AuthFlowDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun autoVerifiedAttrs(block: AutoVerifiedAttrsDsl.() -> Unit = {}):
      AutoVerifiedAttrs {
    val builder = AutoVerifiedAttrsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseUrlOptions(block: BaseUrlOptionsDsl.() -> Unit = {}): BaseUrlOptions {
    val builder = BaseUrlOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun booleanAttribute(block: BooleanAttributeDsl.() -> Unit = {}): BooleanAttribute {
    val builder = BooleanAttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIdentityPool(
    scope: Construct,
    id: String,
    block: CfnIdentityPoolDsl.() -> Unit = {},
  ): CfnIdentityPool {
    val builder = CfnIdentityPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolCognitoIdentityProviderProperty(block: CfnIdentityPoolCognitoIdentityProviderPropertyDsl.() -> Unit
      = {}): CfnIdentityPool.CognitoIdentityProviderProperty {
    val builder = CfnIdentityPoolCognitoIdentityProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolCognitoStreamsProperty(block: CfnIdentityPoolCognitoStreamsPropertyDsl.() -> Unit
      = {}): CfnIdentityPool.CognitoStreamsProperty {
    val builder = CfnIdentityPoolCognitoStreamsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIdentityPoolPrincipalTag(
    scope: Construct,
    id: String,
    block: CfnIdentityPoolPrincipalTagDsl.() -> Unit = {},
  ): CfnIdentityPoolPrincipalTag {
    val builder = CfnIdentityPoolPrincipalTagDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolPrincipalTagProps(block: CfnIdentityPoolPrincipalTagPropsDsl.() -> Unit =
      {}): CfnIdentityPoolPrincipalTagProps {
    val builder = CfnIdentityPoolPrincipalTagPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIdentityPoolProps(block: CfnIdentityPoolPropsDsl.() -> Unit = {}):
      CfnIdentityPoolProps {
    val builder = CfnIdentityPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolPushSyncProperty(block: CfnIdentityPoolPushSyncPropertyDsl.() -> Unit =
      {}): CfnIdentityPool.PushSyncProperty {
    val builder = CfnIdentityPoolPushSyncPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIdentityPoolRoleAttachment(
    scope: Construct,
    id: String,
    block: CfnIdentityPoolRoleAttachmentDsl.() -> Unit = {},
  ): CfnIdentityPoolRoleAttachment {
    val builder = CfnIdentityPoolRoleAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolRoleAttachmentMappingRuleProperty(block: CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl.() -> Unit
      = {}): CfnIdentityPoolRoleAttachment.MappingRuleProperty {
    val builder = CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolRoleAttachmentProps(block: CfnIdentityPoolRoleAttachmentPropsDsl.() -> Unit
      = {}): CfnIdentityPoolRoleAttachmentProps {
    val builder = CfnIdentityPoolRoleAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolRoleAttachmentRoleMappingProperty(block: CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl.() -> Unit
      = {}): CfnIdentityPoolRoleAttachment.RoleMappingProperty {
    val builder = CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnIdentityPoolRoleAttachmentRulesConfigurationTypeProperty(block: CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl.() -> Unit
      = {}): CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty {
    val builder = CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPool(
    scope: Construct,
    id: String,
    block: CfnUserPoolDsl.() -> Unit = {},
  ): CfnUserPool {
    val builder = CfnUserPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolAccountRecoverySettingProperty(block: CfnUserPoolAccountRecoverySettingPropertyDsl.() -> Unit
      = {}): CfnUserPool.AccountRecoverySettingProperty {
    val builder = CfnUserPoolAccountRecoverySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolAdminCreateUserConfigProperty(block: CfnUserPoolAdminCreateUserConfigPropertyDsl.() -> Unit
      = {}): CfnUserPool.AdminCreateUserConfigProperty {
    val builder = CfnUserPoolAdminCreateUserConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolClient(
    scope: Construct,
    id: String,
    block: CfnUserPoolClientDsl.() -> Unit = {},
  ): CfnUserPoolClient {
    val builder = CfnUserPoolClientDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolClientAnalyticsConfigurationProperty(block: CfnUserPoolClientAnalyticsConfigurationPropertyDsl.() -> Unit
      = {}): CfnUserPoolClient.AnalyticsConfigurationProperty {
    val builder = CfnUserPoolClientAnalyticsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolClientProps(block: CfnUserPoolClientPropsDsl.() -> Unit = {}):
      CfnUserPoolClientProps {
    val builder = CfnUserPoolClientPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolClientTokenValidityUnitsProperty(block: CfnUserPoolClientTokenValidityUnitsPropertyDsl.() -> Unit
      = {}): CfnUserPoolClient.TokenValidityUnitsProperty {
    val builder = CfnUserPoolClientTokenValidityUnitsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolCustomEmailSenderProperty(block: CfnUserPoolCustomEmailSenderPropertyDsl.() -> Unit
      = {}): CfnUserPool.CustomEmailSenderProperty {
    val builder = CfnUserPoolCustomEmailSenderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolCustomSMSSenderProperty(block: CfnUserPoolCustomSMSSenderPropertyDsl.() -> Unit
      = {}): CfnUserPool.CustomSMSSenderProperty {
    val builder = CfnUserPoolCustomSMSSenderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolDeviceConfigurationProperty(block: CfnUserPoolDeviceConfigurationPropertyDsl.() -> Unit
      = {}): CfnUserPool.DeviceConfigurationProperty {
    val builder = CfnUserPoolDeviceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolDomain(
    scope: Construct,
    id: String,
    block: CfnUserPoolDomainDsl.() -> Unit = {},
  ): CfnUserPoolDomain {
    val builder = CfnUserPoolDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolDomainCustomDomainConfigTypeProperty(block: CfnUserPoolDomainCustomDomainConfigTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolDomain.CustomDomainConfigTypeProperty {
    val builder = CfnUserPoolDomainCustomDomainConfigTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolDomainProps(block: CfnUserPoolDomainPropsDsl.() -> Unit = {}):
      CfnUserPoolDomainProps {
    val builder = CfnUserPoolDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolEmailConfigurationProperty(block: CfnUserPoolEmailConfigurationPropertyDsl.() -> Unit
      = {}): CfnUserPool.EmailConfigurationProperty {
    val builder = CfnUserPoolEmailConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolGroup(
    scope: Construct,
    id: String,
    block: CfnUserPoolGroupDsl.() -> Unit = {},
  ): CfnUserPoolGroup {
    val builder = CfnUserPoolGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolGroupProps(block: CfnUserPoolGroupPropsDsl.() -> Unit = {}):
      CfnUserPoolGroupProps {
    val builder = CfnUserPoolGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolIdentityProvider(
    scope: Construct,
    id: String,
    block: CfnUserPoolIdentityProviderDsl.() -> Unit = {},
  ): CfnUserPoolIdentityProvider {
    val builder = CfnUserPoolIdentityProviderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolIdentityProviderProps(block: CfnUserPoolIdentityProviderPropsDsl.() -> Unit =
      {}): CfnUserPoolIdentityProviderProps {
    val builder = CfnUserPoolIdentityProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolInviteMessageTemplateProperty(block: CfnUserPoolInviteMessageTemplatePropertyDsl.() -> Unit
      = {}): CfnUserPool.InviteMessageTemplateProperty {
    val builder = CfnUserPoolInviteMessageTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolLambdaConfigProperty(block: CfnUserPoolLambdaConfigPropertyDsl.() -> Unit =
      {}): CfnUserPool.LambdaConfigProperty {
    val builder = CfnUserPoolLambdaConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolNumberAttributeConstraintsProperty(block: CfnUserPoolNumberAttributeConstraintsPropertyDsl.() -> Unit
      = {}): CfnUserPool.NumberAttributeConstraintsProperty {
    val builder = CfnUserPoolNumberAttributeConstraintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolPasswordPolicyProperty(block: CfnUserPoolPasswordPolicyPropertyDsl.() -> Unit =
      {}): CfnUserPool.PasswordPolicyProperty {
    val builder = CfnUserPoolPasswordPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolPoliciesProperty(block: CfnUserPoolPoliciesPropertyDsl.() -> Unit =
      {}): CfnUserPool.PoliciesProperty {
    val builder = CfnUserPoolPoliciesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolProps(block: CfnUserPoolPropsDsl.() -> Unit = {}): CfnUserPoolProps {
    val builder = CfnUserPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRecoveryOptionProperty(block: CfnUserPoolRecoveryOptionPropertyDsl.() -> Unit =
      {}): CfnUserPool.RecoveryOptionProperty {
    val builder = CfnUserPoolRecoveryOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolResourceServer(
    scope: Construct,
    id: String,
    block: CfnUserPoolResourceServerDsl.() -> Unit = {},
  ): CfnUserPoolResourceServer {
    val builder = CfnUserPoolResourceServerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolResourceServerProps(block: CfnUserPoolResourceServerPropsDsl.() -> Unit = {}):
      CfnUserPoolResourceServerProps {
    val builder = CfnUserPoolResourceServerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolResourceServerResourceServerScopeTypeProperty(block: CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolResourceServer.ResourceServerScopeTypeProperty {
    val builder = CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolRiskConfigurationAttachment(
    scope: Construct,
    id: String,
    block: CfnUserPoolRiskConfigurationAttachmentDsl.() -> Unit = {},
  ): CfnUserPoolRiskConfigurationAttachment {
    val builder = CfnUserPoolRiskConfigurationAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty {
    val builder = CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty {
    val builder = CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty {
    val builder =
        CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty {
    val builder =
        CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl.() -> Unit
      = {}):
      CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty {
    val builder =
        CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty {
    val builder = CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentNotifyEmailTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty {
    val builder = CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentProps(block: CfnUserPoolRiskConfigurationAttachmentPropsDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachmentProps {
    val builder = CfnUserPoolRiskConfigurationAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypeProperty(block: CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty {
    val builder = CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolSchemaAttributeProperty(block: CfnUserPoolSchemaAttributePropertyDsl.() -> Unit
      = {}): CfnUserPool.SchemaAttributeProperty {
    val builder = CfnUserPoolSchemaAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolSmsConfigurationProperty(block: CfnUserPoolSmsConfigurationPropertyDsl.() -> Unit
      = {}): CfnUserPool.SmsConfigurationProperty {
    val builder = CfnUserPoolSmsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolStringAttributeConstraintsProperty(block: CfnUserPoolStringAttributeConstraintsPropertyDsl.() -> Unit
      = {}): CfnUserPool.StringAttributeConstraintsProperty {
    val builder = CfnUserPoolStringAttributeConstraintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolUICustomizationAttachment(
    scope: Construct,
    id: String,
    block: CfnUserPoolUICustomizationAttachmentDsl.() -> Unit = {},
  ): CfnUserPoolUICustomizationAttachment {
    val builder = CfnUserPoolUICustomizationAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUICustomizationAttachmentProps(block: CfnUserPoolUICustomizationAttachmentPropsDsl.() -> Unit
      = {}): CfnUserPoolUICustomizationAttachmentProps {
    val builder = CfnUserPoolUICustomizationAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolUser(
    scope: Construct,
    id: String,
    block: CfnUserPoolUserDsl.() -> Unit = {},
  ): CfnUserPoolUser {
    val builder = CfnUserPoolUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUserAttributeTypeProperty(block: CfnUserPoolUserAttributeTypePropertyDsl.() -> Unit
      = {}): CfnUserPoolUser.AttributeTypeProperty {
    val builder = CfnUserPoolUserAttributeTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUserAttributeUpdateSettingsProperty(block: CfnUserPoolUserAttributeUpdateSettingsPropertyDsl.() -> Unit
      = {}): CfnUserPool.UserAttributeUpdateSettingsProperty {
    val builder = CfnUserPoolUserAttributeUpdateSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUserPoolAddOnsProperty(block: CfnUserPoolUserPoolAddOnsPropertyDsl.() -> Unit =
      {}): CfnUserPool.UserPoolAddOnsProperty {
    val builder = CfnUserPoolUserPoolAddOnsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolUserProps(block: CfnUserPoolUserPropsDsl.() -> Unit = {}):
      CfnUserPoolUserProps {
    val builder = CfnUserPoolUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserPoolUserToGroupAttachment(
    scope: Construct,
    id: String,
    block: CfnUserPoolUserToGroupAttachmentDsl.() -> Unit = {},
  ): CfnUserPoolUserToGroupAttachment {
    val builder = CfnUserPoolUserToGroupAttachmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUserToGroupAttachmentProps(block: CfnUserPoolUserToGroupAttachmentPropsDsl.() -> Unit
      = {}): CfnUserPoolUserToGroupAttachmentProps {
    val builder = CfnUserPoolUserToGroupAttachmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolUsernameConfigurationProperty(block: CfnUserPoolUsernameConfigurationPropertyDsl.() -> Unit
      = {}): CfnUserPool.UsernameConfigurationProperty {
    val builder = CfnUserPoolUsernameConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserPoolVerificationMessageTemplateProperty(block: CfnUserPoolVerificationMessageTemplatePropertyDsl.() -> Unit
      = {}): CfnUserPool.VerificationMessageTemplateProperty {
    val builder = CfnUserPoolVerificationMessageTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cognitoDomainOptions(block: CognitoDomainOptionsDsl.() -> Unit = {}):
      CognitoDomainOptions {
    val builder = CognitoDomainOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customAttributeConfig(block: CustomAttributeConfigDsl.() -> Unit = {}):
      CustomAttributeConfig {
    val builder = CustomAttributeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customAttributeProps(block: CustomAttributePropsDsl.() -> Unit = {}):
      CustomAttributeProps {
    val builder = CustomAttributePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customDomainOptions(block: CustomDomainOptionsDsl.() -> Unit = {}):
      CustomDomainOptions {
    val builder = CustomDomainOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dateTimeAttribute(block: DateTimeAttributeDsl.() -> Unit = {}):
      DateTimeAttribute {
    val builder = DateTimeAttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deviceTracking(block: DeviceTrackingDsl.() -> Unit = {}): DeviceTracking {
    val builder = DeviceTrackingDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun emailSettings(block: EmailSettingsDsl.() -> Unit = {}): EmailSettings {
    val builder = EmailSettingsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun keepOriginalAttrs(block: KeepOriginalAttrsDsl.() -> Unit = {}):
      KeepOriginalAttrs {
    val builder = KeepOriginalAttrsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mfaSecondFactor(block: MfaSecondFactorDsl.() -> Unit = {}): MfaSecondFactor {
    val builder = MfaSecondFactorDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun numberAttribute(block: NumberAttributeDsl.() -> Unit = {}): NumberAttribute {
    val builder = NumberAttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun numberAttributeConstraints(block: NumberAttributeConstraintsDsl.() -> Unit =
      {}): NumberAttributeConstraints {
    val builder = NumberAttributeConstraintsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun numberAttributeProps(block: NumberAttributePropsDsl.() -> Unit = {}):
      NumberAttributeProps {
    val builder = NumberAttributePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun oAuthFlows(block: OAuthFlowsDsl.() -> Unit = {}): OAuthFlows {
    val builder = OAuthFlowsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun oAuthSettings(block: OAuthSettingsDsl.() -> Unit = {}): OAuthSettings {
    val builder = OAuthSettingsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun oidcEndpoints(block: OidcEndpointsDsl.() -> Unit = {}): OidcEndpoints {
    val builder = OidcEndpointsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun passwordPolicy(block: PasswordPolicyDsl.() -> Unit = {}): PasswordPolicy {
    val builder = PasswordPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceServerScope(block: ResourceServerScopeDsl.() -> Unit = {}):
      ResourceServerScope {
    val builder = ResourceServerScopeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceServerScopeProps(block: ResourceServerScopePropsDsl.() -> Unit = {}):
      ResourceServerScopeProps {
    val builder = ResourceServerScopePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun signInAliases(block: SignInAliasesDsl.() -> Unit = {}): SignInAliases {
    val builder = SignInAliasesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun signInUrlOptions(block: SignInUrlOptionsDsl.() -> Unit = {}): SignInUrlOptions {
    val builder = SignInUrlOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun standardAttribute(block: StandardAttributeDsl.() -> Unit = {}):
      StandardAttribute {
    val builder = StandardAttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun standardAttributes(block: StandardAttributesDsl.() -> Unit = {}):
      StandardAttributes {
    val builder = StandardAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun standardAttributesMask(block: StandardAttributesMaskDsl.() -> Unit = {}):
      StandardAttributesMask {
    val builder = StandardAttributesMaskDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringAttribute(block: StringAttributeDsl.() -> Unit = {}): StringAttribute {
    val builder = StringAttributeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringAttributeConstraints(block: StringAttributeConstraintsDsl.() -> Unit =
      {}): StringAttributeConstraints {
    val builder = StringAttributeConstraintsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringAttributeProps(block: StringAttributePropsDsl.() -> Unit = {}):
      StringAttributeProps {
    val builder = StringAttributePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userInvitationConfig(block: UserInvitationConfigDsl.() -> Unit = {}):
      UserInvitationConfig {
    val builder = UserInvitationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPool(
    scope: Construct,
    id: String,
    block: UserPoolDsl.() -> Unit = {},
  ): UserPool {
    val builder = UserPoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolClient(
    scope: Construct,
    id: String,
    block: UserPoolClientDsl.() -> Unit = {},
  ): UserPoolClient {
    val builder = UserPoolClientDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolClientOptions(block: UserPoolClientOptionsDsl.() -> Unit = {}):
      UserPoolClientOptions {
    val builder = UserPoolClientOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolClientProps(block: UserPoolClientPropsDsl.() -> Unit = {}):
      UserPoolClientProps {
    val builder = UserPoolClientPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolDomain(
    scope: Construct,
    id: String,
    block: UserPoolDomainDsl.() -> Unit = {},
  ): UserPoolDomain {
    val builder = UserPoolDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolDomainOptions(block: UserPoolDomainOptionsDsl.() -> Unit = {}):
      UserPoolDomainOptions {
    val builder = UserPoolDomainOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolDomainProps(block: UserPoolDomainPropsDsl.() -> Unit = {}):
      UserPoolDomainProps {
    val builder = UserPoolDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderAmazon(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderAmazonDsl.() -> Unit = {},
  ): UserPoolIdentityProviderAmazon {
    val builder = UserPoolIdentityProviderAmazonDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderAmazonProps(block: UserPoolIdentityProviderAmazonPropsDsl.() -> Unit
      = {}): UserPoolIdentityProviderAmazonProps {
    val builder = UserPoolIdentityProviderAmazonPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderApple(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderAppleDsl.() -> Unit = {},
  ): UserPoolIdentityProviderApple {
    val builder = UserPoolIdentityProviderAppleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderAppleProps(block: UserPoolIdentityProviderApplePropsDsl.() -> Unit
      = {}): UserPoolIdentityProviderAppleProps {
    val builder = UserPoolIdentityProviderApplePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderFacebook(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderFacebookDsl.() -> Unit = {},
  ): UserPoolIdentityProviderFacebook {
    val builder = UserPoolIdentityProviderFacebookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderFacebookProps(block: UserPoolIdentityProviderFacebookPropsDsl.() -> Unit
      = {}): UserPoolIdentityProviderFacebookProps {
    val builder = UserPoolIdentityProviderFacebookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderGoogle(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderGoogleDsl.() -> Unit = {},
  ): UserPoolIdentityProviderGoogle {
    val builder = UserPoolIdentityProviderGoogleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderGoogleProps(block: UserPoolIdentityProviderGooglePropsDsl.() -> Unit
      = {}): UserPoolIdentityProviderGoogleProps {
    val builder = UserPoolIdentityProviderGooglePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderOidc(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderOidcDsl.() -> Unit = {},
  ): UserPoolIdentityProviderOidc {
    val builder = UserPoolIdentityProviderOidcDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderOidcProps(block: UserPoolIdentityProviderOidcPropsDsl.() -> Unit =
      {}): UserPoolIdentityProviderOidcProps {
    val builder = UserPoolIdentityProviderOidcPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderProps(block: UserPoolIdentityProviderPropsDsl.() -> Unit
      = {}): UserPoolIdentityProviderProps {
    val builder = UserPoolIdentityProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolIdentityProviderSaml(
    scope: Construct,
    id: String,
    block: UserPoolIdentityProviderSamlDsl.() -> Unit = {},
  ): UserPoolIdentityProviderSaml {
    val builder = UserPoolIdentityProviderSamlDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun userPoolIdentityProviderSamlProps(block: UserPoolIdentityProviderSamlPropsDsl.() -> Unit =
      {}): UserPoolIdentityProviderSamlProps {
    val builder = UserPoolIdentityProviderSamlPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolProps(block: UserPoolPropsDsl.() -> Unit = {}): UserPoolProps {
    val builder = UserPoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolResourceServer(
    scope: Construct,
    id: String,
    block: UserPoolResourceServerDsl.() -> Unit = {},
  ): UserPoolResourceServer {
    val builder = UserPoolResourceServerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolResourceServerOptions(block: UserPoolResourceServerOptionsDsl.() -> Unit
      = {}): UserPoolResourceServerOptions {
    val builder = UserPoolResourceServerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolResourceServerProps(block: UserPoolResourceServerPropsDsl.() -> Unit =
      {}): UserPoolResourceServerProps {
    val builder = UserPoolResourceServerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolSESOptions(block: UserPoolSESOptionsDsl.() -> Unit = {}):
      UserPoolSESOptions {
    val builder = UserPoolSESOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolTriggers(block: UserPoolTriggersDsl.() -> Unit = {}): UserPoolTriggers {
    val builder = UserPoolTriggersDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userVerificationConfig(block: UserVerificationConfigDsl.() -> Unit = {}):
      UserVerificationConfig {
    val builder = UserVerificationConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
