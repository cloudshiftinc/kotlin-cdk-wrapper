@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserPoolProps {
  public fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

  public fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

  public fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

  public fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes() ?:
      emptyList()

  public fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

  public fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

  public fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

  public fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

  public fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

  public fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  public fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun schema(): Any? = unwrap(this).getSchema()

  public fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

  public fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

  public fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

  public fun userAttributeUpdateSettings(): Any? = unwrap(this).getUserAttributeUpdateSettings()

  public fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

  public fun userPoolName(): String? = unwrap(this).getUserPoolName()

  public fun userPoolTags(): Any? = unwrap(this).getUserPoolTags()

  public fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
      emptyList()

  public fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

  public fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()

  @CdkDslMarker
  public interface Builder {
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable)

    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit)

    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable)

    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit)

    public fun aliasAttributes(aliasAttributes: List<String>)

    public fun aliasAttributes(vararg aliasAttributes: String)

    public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>)

    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String)

    public fun deletionProtection(deletionProtection: String)

    public fun deviceConfiguration(deviceConfiguration: IResolvable)

    public fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    public
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit)

    public fun emailConfiguration(emailConfiguration: IResolvable)

    public fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ab302803ade9b232feb3b22f11bbb0cd00b4239fc2acac9158d6e2b41c72e64")
    public
        fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit)

    public fun emailVerificationMessage(emailVerificationMessage: String)

    public fun emailVerificationSubject(emailVerificationSubject: String)

    public fun enabledMfas(enabledMfas: List<String>)

    public fun enabledMfas(vararg enabledMfas: String)

    public fun lambdaConfig(lambdaConfig: IResolvable)

    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit)

    public fun mfaConfiguration(mfaConfiguration: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: CfnUserPool.PoliciesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    public fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit)

    public fun schema(schema: IResolvable)

    public fun schema(schema: List<Any>)

    public fun schema(vararg schema: Any)

    public fun smsAuthenticationMessage(smsAuthenticationMessage: String)

    public fun smsConfiguration(smsConfiguration: IResolvable)

    public fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    public
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit)

    public fun smsVerificationMessage(smsVerificationMessage: String)

    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable)

    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94408e710349a962ce64783c9f093b3b03f8bc22695424bc56fa9ec354684c41")
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder.() -> Unit)

    public fun userPoolAddOns(userPoolAddOns: IResolvable)

    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit)

    public fun userPoolName(userPoolName: String)

    public fun userPoolTags(userPoolTags: Any)

    public fun usernameAttributes(usernameAttributes: List<String>)

    public fun usernameAttributes(vararg usernameAttributes: String)

    public fun usernameConfiguration(usernameConfiguration: IResolvable)

    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit)

    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable)

    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013e72971088221a7901816ff1cc9a02b7d294abd0f631b7d9bc30cb5c5116a")
    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolProps.builder()

    override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable::unwrap))
    }

    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(CfnUserPool.AccountRecoverySettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit):
        Unit =
        accountRecoverySetting(CfnUserPool.AccountRecoverySettingProperty(accountRecoverySetting))

    override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable::unwrap))
    }

    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(CfnUserPool.AdminCreateUserConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit):
        Unit =
        adminCreateUserConfig(CfnUserPool.AdminCreateUserConfigProperty(adminCreateUserConfig))

    override fun aliasAttributes(aliasAttributes: List<String>) {
      cdkBuilder.aliasAttributes(aliasAttributes)
    }

    override fun aliasAttributes(vararg aliasAttributes: String): Unit =
        aliasAttributes(aliasAttributes.toList())

    override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
      cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
    }

    override fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String): Unit =
        autoVerifiedAttributes(autoVerifiedAttributes.toList())

    override fun deletionProtection(deletionProtection: String) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deviceConfiguration(deviceConfiguration: IResolvable) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable::unwrap))
    }

    override fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(CfnUserPool.DeviceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    override
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit):
        Unit = deviceConfiguration(CfnUserPool.DeviceConfigurationProperty(deviceConfiguration))

    override fun emailConfiguration(emailConfiguration: IResolvable) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable::unwrap))
    }

    override fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(CfnUserPool.EmailConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ab302803ade9b232feb3b22f11bbb0cd00b4239fc2acac9158d6e2b41c72e64")
    override
        fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit):
        Unit = emailConfiguration(CfnUserPool.EmailConfigurationProperty(emailConfiguration))

    override fun emailVerificationMessage(emailVerificationMessage: String) {
      cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    override fun emailVerificationSubject(emailVerificationSubject: String) {
      cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    override fun enabledMfas(enabledMfas: List<String>) {
      cdkBuilder.enabledMfas(enabledMfas)
    }

    override fun enabledMfas(vararg enabledMfas: String): Unit = enabledMfas(enabledMfas.toList())

    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnUserPool.LambdaConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnUserPool.LambdaConfigProperty(lambdaConfig))

    override fun mfaConfiguration(mfaConfiguration: String) {
      cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: CfnUserPool.PoliciesProperty) {
      cdkBuilder.policies(policies.let(CfnUserPool.PoliciesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    override fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit): Unit =
        policies(CfnUserPool.PoliciesProperty(policies))

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: List<Any>) {
      cdkBuilder.schema(schema)
    }

    override fun schema(vararg schema: Any): Unit = schema(schema.toList())

    override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
      cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    override fun smsConfiguration(smsConfiguration: IResolvable) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable::unwrap))
    }

    override fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(CfnUserPool.SmsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    override
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit):
        Unit = smsConfiguration(CfnUserPool.SmsConfigurationProperty(smsConfiguration))

    override fun smsVerificationMessage(smsVerificationMessage: String) {
      cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    override fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(IResolvable::unwrap))
    }

    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(CfnUserPool.UserAttributeUpdateSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94408e710349a962ce64783c9f093b3b03f8bc22695424bc56fa9ec354684c41")
    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
        Unit =
        userAttributeUpdateSettings(CfnUserPool.UserAttributeUpdateSettingsProperty(userAttributeUpdateSettings))

    override fun userPoolAddOns(userPoolAddOns: IResolvable) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable::unwrap))
    }

    override fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(CfnUserPool.UserPoolAddOnsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    override
        fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit):
        Unit = userPoolAddOns(CfnUserPool.UserPoolAddOnsProperty(userPoolAddOns))

    override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    override fun userPoolTags(userPoolTags: Any) {
      cdkBuilder.userPoolTags(userPoolTags)
    }

    override fun usernameAttributes(usernameAttributes: List<String>) {
      cdkBuilder.usernameAttributes(usernameAttributes)
    }

    override fun usernameAttributes(vararg usernameAttributes: String): Unit =
        usernameAttributes(usernameAttributes.toList())

    override fun usernameConfiguration(usernameConfiguration: IResolvable) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable::unwrap))
    }

    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(CfnUserPool.UsernameConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit):
        Unit =
        usernameConfiguration(CfnUserPool.UsernameConfigurationProperty(usernameConfiguration))

    override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(IResolvable::unwrap))
    }

    override
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(CfnUserPool.VerificationMessageTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013e72971088221a7901816ff1cc9a02b7d294abd0f631b7d9bc30cb5c5116a")
    override
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit):
        Unit =
        verificationMessageTemplate(CfnUserPool.VerificationMessageTemplateProperty(verificationMessageTemplate))

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolProps,
  ) : CdkObject(cdkObject), CfnUserPoolProps {
    override fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

    override fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

    override fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

    override fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes()
        ?: emptyList()

    override fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

    override fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

    override fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

    override fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

    override fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

    override fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    override fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun schema(): Any? = unwrap(this).getSchema()

    override fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

    override fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

    override fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

    override fun userAttributeUpdateSettings(): Any? = unwrap(this).getUserAttributeUpdateSettings()

    override fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

    override fun userPoolName(): String? = unwrap(this).getUserPoolName()

    override fun userPoolTags(): Any? = unwrap(this).getUserPoolTags()

    override fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
        emptyList()

    override fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

    override fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolProps):
        CfnUserPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.CfnUserPoolProps
  }
}
