@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.ClientAttributes
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolResourceServer

public inline fun UserPool.addClient(id: String, block: UserPoolClientOptionsDsl.() -> Unit = {}):
    UserPoolClient {
  val builder = UserPoolClientOptionsDsl()
  builder.apply(block)
  return addClient(id, builder.build())
}

public inline fun UserPool.addDomain(id: String, block: UserPoolDomainOptionsDsl.() -> Unit = {}):
    UserPoolDomain {
  val builder = UserPoolDomainOptionsDsl()
  builder.apply(block)
  return addDomain(id, builder.build())
}

public inline fun UserPool.addResourceServer(id: String,
    block: UserPoolResourceServerOptionsDsl.() -> Unit = {}): UserPoolResourceServer {
  val builder = UserPoolResourceServerOptionsDsl()
  builder.apply(block)
  return addResourceServer(id, builder.build())
}

public inline
    fun CfnIdentityPool.setCognitoStreams(block: CfnIdentityPoolCognitoStreamsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnIdentityPoolCognitoStreamsPropertyDsl()
  builder.apply(block)
  return setCognitoStreams(builder.build())
}

public inline fun CfnIdentityPool.setPushSync(block: CfnIdentityPoolPushSyncPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnIdentityPoolPushSyncPropertyDsl()
  builder.apply(block)
  return setPushSync(builder.build())
}

public inline
    fun CfnUserPoolClient.setAnalyticsConfiguration(block: CfnUserPoolClientAnalyticsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolClientAnalyticsConfigurationPropertyDsl()
  builder.apply(block)
  return setAnalyticsConfiguration(builder.build())
}

public inline
    fun CfnUserPoolClient.setTokenValidityUnits(block: CfnUserPoolClientTokenValidityUnitsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolClientTokenValidityUnitsPropertyDsl()
  builder.apply(block)
  return setTokenValidityUnits(builder.build())
}

public inline
    fun CfnUserPoolRiskConfigurationAttachment.setAccountTakeoverRiskConfiguration(block: CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl.() -> Unit
    = {}) {
  val builder =
      CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl()
  builder.apply(block)
  return setAccountTakeoverRiskConfiguration(builder.build())
}

public inline
    fun CfnUserPoolRiskConfigurationAttachment.setCompromisedCredentialsRiskConfiguration(block: CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl.() -> Unit
    = {}) {
  val builder =
      CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl()
  builder.apply(block)
  return setCompromisedCredentialsRiskConfiguration(builder.build())
}

public inline
    fun CfnUserPoolRiskConfigurationAttachment.setRiskExceptionConfiguration(block: CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl()
  builder.apply(block)
  return setRiskExceptionConfiguration(builder.build())
}

public inline
    fun CfnUserPool.setAccountRecoverySetting(block: CfnUserPoolAccountRecoverySettingPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolAccountRecoverySettingPropertyDsl()
  builder.apply(block)
  return setAccountRecoverySetting(builder.build())
}

public inline
    fun CfnUserPool.setAdminCreateUserConfig(block: CfnUserPoolAdminCreateUserConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolAdminCreateUserConfigPropertyDsl()
  builder.apply(block)
  return setAdminCreateUserConfig(builder.build())
}

public inline
    fun CfnUserPool.setDeviceConfiguration(block: CfnUserPoolDeviceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolDeviceConfigurationPropertyDsl()
  builder.apply(block)
  return setDeviceConfiguration(builder.build())
}

public inline
    fun CfnUserPool.setEmailConfiguration(block: CfnUserPoolEmailConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolEmailConfigurationPropertyDsl()
  builder.apply(block)
  return setEmailConfiguration(builder.build())
}

public inline fun CfnUserPool.setLambdaConfig(block: CfnUserPoolLambdaConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnUserPoolLambdaConfigPropertyDsl()
  builder.apply(block)
  return setLambdaConfig(builder.build())
}

public inline fun CfnUserPool.setPolicies(block: CfnUserPoolPoliciesPropertyDsl.() -> Unit = {}) {
  val builder = CfnUserPoolPoliciesPropertyDsl()
  builder.apply(block)
  return setPolicies(builder.build())
}

public inline
    fun CfnUserPool.setSmsConfiguration(block: CfnUserPoolSmsConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnUserPoolSmsConfigurationPropertyDsl()
  builder.apply(block)
  return setSmsConfiguration(builder.build())
}

public inline
    fun CfnUserPool.setUserAttributeUpdateSettings(block: CfnUserPoolUserAttributeUpdateSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolUserAttributeUpdateSettingsPropertyDsl()
  builder.apply(block)
  return setUserAttributeUpdateSettings(builder.build())
}

public inline
    fun CfnUserPool.setUsernameConfiguration(block: CfnUserPoolUsernameConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolUsernameConfigurationPropertyDsl()
  builder.apply(block)
  return setUsernameConfiguration(builder.build())
}

public inline
    fun CfnUserPool.setUserPoolAddOns(block: CfnUserPoolUserPoolAddOnsPropertyDsl.() -> Unit = {}) {
  val builder = CfnUserPoolUserPoolAddOnsPropertyDsl()
  builder.apply(block)
  return setUserPoolAddOns(builder.build())
}

public inline
    fun CfnUserPool.setVerificationMessageTemplate(block: CfnUserPoolVerificationMessageTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolVerificationMessageTemplatePropertyDsl()
  builder.apply(block)
  return setVerificationMessageTemplate(builder.build())
}

public inline
    fun CfnUserPoolDomain.setCustomDomainConfig(block: CfnUserPoolDomainCustomDomainConfigTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnUserPoolDomainCustomDomainConfigTypePropertyDsl()
  builder.apply(block)
  return setCustomDomainConfig(builder.build())
}

public inline fun IUserPool.addClient(arg0: String, block: UserPoolClientOptionsDsl.() -> Unit =
    {}): UserPoolClient {
  val builder = UserPoolClientOptionsDsl()
  builder.apply(block)
  return addClient(arg0, builder.build())
}

public inline fun IUserPool.addDomain(arg0: String, block: UserPoolDomainOptionsDsl.() -> Unit =
    {}): UserPoolDomain {
  val builder = UserPoolDomainOptionsDsl()
  builder.apply(block)
  return addDomain(arg0, builder.build())
}

public inline fun IUserPool.addResourceServer(arg0: String,
    block: UserPoolResourceServerOptionsDsl.() -> Unit = {}): UserPoolResourceServer {
  val builder = UserPoolResourceServerOptionsDsl()
  builder.apply(block)
  return addResourceServer(arg0, builder.build())
}

public inline fun UserPoolDomain.baseUrl(block: BaseUrlOptionsDsl.() -> Unit = {}): String {
  val builder = BaseUrlOptionsDsl()
  builder.apply(block)
  return baseUrl(builder.build())
}

public inline fun UserPoolDomain.signInUrl(client: UserPoolClient,
    block: SignInUrlOptionsDsl.() -> Unit = {}): String {
  val builder = SignInUrlOptionsDsl()
  builder.apply(block)
  return signInUrl(client, builder.build())
}

public inline
    fun ClientAttributes.withStandardAttributes(block: StandardAttributesMaskDsl.() -> Unit = {}):
    ClientAttributes {
  val builder = StandardAttributesMaskDsl()
  builder.apply(block)
  return withStandardAttributes(builder.build())
}
