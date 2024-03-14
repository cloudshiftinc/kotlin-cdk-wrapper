package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

  public open fun accountRecoverySetting(`value`: IResolvable) {
    unwrap(this).setAccountRecoverySetting(`value`.let(IResolvable::unwrap))
  }

  public open fun accountRecoverySetting(`value`: AccountRecoverySettingProperty) {
    unwrap(this).setAccountRecoverySetting(`value`.let(AccountRecoverySettingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41869758d1479e39ad7853ac6413ee514612afc9860a9041b64a47dee3a233cd")
  public open
      fun accountRecoverySetting(`value`: AccountRecoverySettingProperty.Builder.() -> Unit): Unit =
      accountRecoverySetting(AccountRecoverySettingProperty(`value`))

  public open fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

  public open fun adminCreateUserConfig(`value`: IResolvable) {
    unwrap(this).setAdminCreateUserConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun adminCreateUserConfig(`value`: AdminCreateUserConfigProperty) {
    unwrap(this).setAdminCreateUserConfig(`value`.let(AdminCreateUserConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a26247a0a20ec4848afe270346c20b8a0d598576ae427ad07d74f7e102cf7f6e")
  public open fun adminCreateUserConfig(`value`: AdminCreateUserConfigProperty.Builder.() -> Unit):
      Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(`value`))

  public open fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

  public open fun aliasAttributes(`value`: List<String>) {
    unwrap(this).setAliasAttributes(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrProviderName(): String = unwrap(this).getAttrProviderName()

  public open fun attrProviderUrl(): String = unwrap(this).getAttrProviderUrl()

  public open fun attrUserPoolId(): String = unwrap(this).getAttrUserPoolId()

  public open fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes()
      ?: emptyList()

  public open fun autoVerifiedAttributes(`value`: List<String>) {
    unwrap(this).setAutoVerifiedAttributes(`value`)
  }

  public open fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

  public open fun deletionProtection(`value`: String) {
    unwrap(this).setDeletionProtection(`value`)
  }

  public open fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

  public open fun deviceConfiguration(`value`: IResolvable) {
    unwrap(this).setDeviceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun deviceConfiguration(`value`: DeviceConfigurationProperty) {
    unwrap(this).setDeviceConfiguration(`value`.let(DeviceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b35171bfbda008f4b6b9e661be8a69c0c4121d1ffa7951db3edc900d38625f2c")
  public open fun deviceConfiguration(`value`: DeviceConfigurationProperty.Builder.() -> Unit): Unit
      = deviceConfiguration(DeviceConfigurationProperty(`value`))

  public open fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

  public open fun emailConfiguration(`value`: IResolvable) {
    unwrap(this).setEmailConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun emailConfiguration(`value`: EmailConfigurationProperty) {
    unwrap(this).setEmailConfiguration(`value`.let(EmailConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e380aac4b166f086c05484321f9074512a3203c5bc32edb9c10ea216d01f4ebf")
  public open fun emailConfiguration(`value`: EmailConfigurationProperty.Builder.() -> Unit): Unit =
      emailConfiguration(EmailConfigurationProperty(`value`))

  public open fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

  public open fun emailVerificationMessage(`value`: String) {
    unwrap(this).setEmailVerificationMessage(`value`)
  }

  public open fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

  public open fun emailVerificationSubject(`value`: String) {
    unwrap(this).setEmailVerificationSubject(`value`)
  }

  public open fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

  public open fun enabledMfas(`value`: List<String>) {
    unwrap(this).setEnabledMfas(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  public open fun lambdaConfig(`value`: IResolvable) {
    unwrap(this).setLambdaConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaConfig(`value`: LambdaConfigProperty) {
    unwrap(this).setLambdaConfig(`value`.let(LambdaConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("746fcba026dd44cfc248dcc3a74bb75dec1927c844a55e0c3cb65e4935ef3654")
  public open fun lambdaConfig(`value`: LambdaConfigProperty.Builder.() -> Unit): Unit =
      lambdaConfig(LambdaConfigProperty(`value`))

  public open fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

  public open fun mfaConfiguration(`value`: String) {
    unwrap(this).setMfaConfiguration(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(`value`: PoliciesProperty) {
    unwrap(this).setPolicies(`value`.let(PoliciesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c8acea4f8e23426db34b7f27283cfb03e85ea58103fa10ce204a08d84d35d8da")
  public open fun policies(`value`: PoliciesProperty.Builder.() -> Unit): Unit =
      policies(PoliciesProperty(`value`))

  public open fun schema(): Any? = unwrap(this).getSchema()

  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  public open fun schema(__idx_ac66f0: List<Any>) {
    unwrap(this).setSchema(__idx_ac66f0)
  }

  public open fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

  public open fun smsAuthenticationMessage(`value`: String) {
    unwrap(this).setSmsAuthenticationMessage(`value`)
  }

  public open fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

  public open fun smsConfiguration(`value`: IResolvable) {
    unwrap(this).setSmsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun smsConfiguration(`value`: SmsConfigurationProperty) {
    unwrap(this).setSmsConfiguration(`value`.let(SmsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a50346460383087797abc34d738bc3deae588a86f4a5a46bf21193632e510438")
  public open fun smsConfiguration(`value`: SmsConfigurationProperty.Builder.() -> Unit): Unit =
      smsConfiguration(SmsConfigurationProperty(`value`))

  public open fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

  public open fun smsVerificationMessage(`value`: String) {
    unwrap(this).setSmsVerificationMessage(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun userAttributeUpdateSettings(): Any? =
      unwrap(this).getUserAttributeUpdateSettings()

  public open fun userAttributeUpdateSettings(`value`: IResolvable) {
    unwrap(this).setUserAttributeUpdateSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun userAttributeUpdateSettings(`value`: UserAttributeUpdateSettingsProperty) {
    unwrap(this).setUserAttributeUpdateSettings(`value`.let(UserAttributeUpdateSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e2d9507e58e9c57069f320b0d14c9b7b7d6feab509f57ffc2151b658768e3ac")
  public open
      fun userAttributeUpdateSettings(`value`: UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
      Unit = userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty(`value`))

  public open fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

  public open fun userPoolAddOns(`value`: IResolvable) {
    unwrap(this).setUserPoolAddOns(`value`.let(IResolvable::unwrap))
  }

  public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty) {
    unwrap(this).setUserPoolAddOns(`value`.let(UserPoolAddOnsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52b1b6a3af630a51f88af5dab8da0c8eafd9d71d75bf8939966599637d57e6e4")
  public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty.Builder.() -> Unit): Unit =
      userPoolAddOns(UserPoolAddOnsProperty(`value`))

  public open fun userPoolName(): String? = unwrap(this).getUserPoolName()

  public open fun userPoolName(`value`: String) {
    unwrap(this).setUserPoolName(`value`)
  }

  public open fun userPoolTagsRaw(): Any? = unwrap(this).getUserPoolTagsRaw()

  public open fun userPoolTagsRaw(`value`: Any) {
    unwrap(this).setUserPoolTagsRaw(`value`)
  }

  public open fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
      emptyList()

  public open fun usernameAttributes(`value`: List<String>) {
    unwrap(this).setUsernameAttributes(`value`)
  }

  public open fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

  public open fun usernameConfiguration(`value`: IResolvable) {
    unwrap(this).setUsernameConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun usernameConfiguration(`value`: UsernameConfigurationProperty) {
    unwrap(this).setUsernameConfiguration(`value`.let(UsernameConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4530461026528910b8f5a9c46b31dd9e2b7bd6245adf82505f50792d1e4e7a7")
  public open fun usernameConfiguration(`value`: UsernameConfigurationProperty.Builder.() -> Unit):
      Unit = usernameConfiguration(UsernameConfigurationProperty(`value`))

  public open fun verificationMessageTemplate(): Any? =
      unwrap(this).getVerificationMessageTemplate()

  public open fun verificationMessageTemplate(`value`: IResolvable) {
    unwrap(this).setVerificationMessageTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun verificationMessageTemplate(`value`: VerificationMessageTemplateProperty) {
    unwrap(this).setVerificationMessageTemplate(`value`.let(VerificationMessageTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a739849a2934daad512588221e8cd348c058e98865835fc2950debe0c51ff649")
  public open
      fun verificationMessageTemplate(`value`: VerificationMessageTemplateProperty.Builder.() -> Unit):
      Unit = verificationMessageTemplate(VerificationMessageTemplateProperty(`value`))

  public interface Builder {
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
    }

    public fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
    public
        fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit) {
    }

    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
    }

    public fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
    public
        fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit) {
    }

    public fun aliasAttributes(aliasAttributes: List<String>) {
    }

    public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
    }

    public fun deletionProtection(deletionProtection: String) {
    }

    public fun deviceConfiguration(deviceConfiguration: IResolvable) {
    }

    public fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
    public
        fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun emailConfiguration(emailConfiguration: IResolvable) {
    }

    public fun emailConfiguration(emailConfiguration: EmailConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
    public
        fun emailConfiguration(emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit) {
    }

    public fun emailVerificationMessage(emailVerificationMessage: String) {
    }

    public fun emailVerificationSubject(emailVerificationSubject: String) {
    }

    public fun enabledMfas(enabledMfas: List<String>) {
    }

    public fun lambdaConfig(lambdaConfig: IResolvable) {
    }

    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit) {
    }

    public fun mfaConfiguration(mfaConfiguration: String) {
    }

    public fun policies(policies: IResolvable) {
    }

    public fun policies(policies: PoliciesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
    public fun policies(policies: PoliciesProperty.Builder.() -> Unit) {
    }

    public fun schema(schema: IResolvable) {
    }

    public fun schema(schema: List<Any>) {
    }

    public fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
    }

    public fun smsConfiguration(smsConfiguration: IResolvable) {
    }

    public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
    public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit) {
    }

    public fun smsVerificationMessage(smsVerificationMessage: String) {
    }

    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
    }

    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit) {
    }

    public fun userPoolAddOns(userPoolAddOns: IResolvable) {
    }

    public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
    public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit) {
    }

    public fun userPoolName(userPoolName: String) {
    }

    public fun userPoolTags(userPoolTags: Any) {
    }

    public fun usernameAttributes(usernameAttributes: List<String>) {
    }

    public fun usernameConfiguration(usernameConfiguration: IResolvable) {
    }

    public fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
    public
        fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit) {
    }

    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
    }

    public
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
    public
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPool.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPool.Builder.create(scope, id)

    public override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable::unwrap))
    }

    public override
        fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(AccountRecoverySettingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
    public override
        fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit):
        Unit = accountRecoverySetting(AccountRecoverySettingProperty(accountRecoverySetting))

    public override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable::unwrap))
    }

    public override
        fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(AdminCreateUserConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
    public override
        fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit):
        Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(adminCreateUserConfig))

    public override fun aliasAttributes(aliasAttributes: List<String>) {
      cdkBuilder.aliasAttributes(aliasAttributes)
    }

    public override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
      cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
    }

    public override fun deletionProtection(deletionProtection: String) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun deviceConfiguration(deviceConfiguration: IResolvable) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable::unwrap))
    }

    public override fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(DeviceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
    public override
        fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit):
        Unit = deviceConfiguration(DeviceConfigurationProperty(deviceConfiguration))

    public override fun emailConfiguration(emailConfiguration: IResolvable) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable::unwrap))
    }

    public override fun emailConfiguration(emailConfiguration: EmailConfigurationProperty) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(EmailConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
    public override
        fun emailConfiguration(emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit):
        Unit = emailConfiguration(EmailConfigurationProperty(emailConfiguration))

    public override fun emailVerificationMessage(emailVerificationMessage: String) {
      cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    public override fun emailVerificationSubject(emailVerificationSubject: String) {
      cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    public override fun enabledMfas(enabledMfas: List<String>) {
      cdkBuilder.enabledMfas(enabledMfas)
    }

    public override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    public override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
    public override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
        lambdaConfig(LambdaConfigProperty(lambdaConfig))

    public override fun mfaConfiguration(mfaConfiguration: String) {
      cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    public override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    public override fun policies(policies: PoliciesProperty) {
      cdkBuilder.policies(policies.let(PoliciesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
    public override fun policies(policies: PoliciesProperty.Builder.() -> Unit): Unit =
        policies(PoliciesProperty(policies))

    public override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    public override fun schema(schema: List<Any>) {
      cdkBuilder.schema(schema)
    }

    public override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
      cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    public override fun smsConfiguration(smsConfiguration: IResolvable) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable::unwrap))
    }

    public override fun smsConfiguration(smsConfiguration: SmsConfigurationProperty) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(SmsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
    public override
        fun smsConfiguration(smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit): Unit =
        smsConfiguration(SmsConfigurationProperty(smsConfiguration))

    public override fun smsVerificationMessage(smsVerificationMessage: String) {
      cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    public override fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(IResolvable::unwrap))
    }

    public override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(UserAttributeUpdateSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
    public override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
        Unit =
        userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty(userAttributeUpdateSettings))

    public override fun userPoolAddOns(userPoolAddOns: IResolvable) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable::unwrap))
    }

    public override fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(UserPoolAddOnsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
    public override fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit):
        Unit = userPoolAddOns(UserPoolAddOnsProperty(userPoolAddOns))

    public override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    public override fun userPoolTags(userPoolTags: Any) {
      cdkBuilder.userPoolTags(userPoolTags)
    }

    public override fun usernameAttributes(usernameAttributes: List<String>) {
      cdkBuilder.usernameAttributes(usernameAttributes)
    }

    public override fun usernameConfiguration(usernameConfiguration: IResolvable) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(UsernameConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
    public override
        fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit):
        Unit = usernameConfiguration(UsernameConfigurationProperty(usernameConfiguration))

    public override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(IResolvable::unwrap))
    }

    public override
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(VerificationMessageTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
    public override
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit):
        Unit =
        verificationMessageTemplate(VerificationMessageTemplateProperty(verificationMessageTemplate))

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool): CfnUserPool =
        CfnUserPool(cdkObject)

    internal fun unwrap(wrapped: CfnUserPool): software.amazon.awscdk.services.cognito.CfnUserPool =
        wrapped.cdkObject
  }

  public interface CustomEmailSenderProperty {
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

    public interface Builder {
      public fun lambdaArn(lambdaArn: String) {
      }

      public fun lambdaVersion(lambdaVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.builder()

      public override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty,
    ) : CustomEmailSenderProperty {
      public override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      public override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomEmailSenderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty):
          CustomEmailSenderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomEmailSenderProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AdminCreateUserConfigProperty {
    public fun allowAdminCreateUserOnly(): Any? = unwrap(this).getAllowAdminCreateUserOnly()

    public fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

    public fun unusedAccountValidityDays(): Number? = unwrap(this).getUnusedAccountValidityDays()

    public interface Builder {
      public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
      }

      public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
      }

      public fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
      }

      public fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
      public
          fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit) {
      }

      public fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.builder()

      public override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
        cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
      }

      public override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
        cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly.let(IResolvable::unwrap))
      }

      public override fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
        cdkBuilder.inviteMessageTemplate(inviteMessageTemplate.let(IResolvable::unwrap))
      }

      public override
          fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty) {
        cdkBuilder.inviteMessageTemplate(inviteMessageTemplate.let(InviteMessageTemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
      public override
          fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit):
          Unit = inviteMessageTemplate(InviteMessageTemplateProperty(inviteMessageTemplate))

      public override fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
        cdkBuilder.unusedAccountValidityDays(unusedAccountValidityDays)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty,
    ) : AdminCreateUserConfigProperty {
      public override fun allowAdminCreateUserOnly(): Any? =
          unwrap(this).getAllowAdminCreateUserOnly()

      public override fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

      public override fun unusedAccountValidityDays(): Number? =
          unwrap(this).getUnusedAccountValidityDays()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AdminCreateUserConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty):
          AdminCreateUserConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdminCreateUserConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PasswordPolicyProperty {
    public fun minimumLength(): Number? = unwrap(this).getMinimumLength()

    public fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

    public fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

    public fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

    public fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

    public fun temporaryPasswordValidityDays(): Number? =
        unwrap(this).getTemporaryPasswordValidityDays()

    public interface Builder {
      public fun minimumLength(minimumLength: Number) {
      }

      public fun requireLowercase(requireLowercase: Boolean) {
      }

      public fun requireLowercase(requireLowercase: IResolvable) {
      }

      public fun requireNumbers(requireNumbers: Boolean) {
      }

      public fun requireNumbers(requireNumbers: IResolvable) {
      }

      public fun requireSymbols(requireSymbols: Boolean) {
      }

      public fun requireSymbols(requireSymbols: IResolvable) {
      }

      public fun requireUppercase(requireUppercase: Boolean) {
      }

      public fun requireUppercase(requireUppercase: IResolvable) {
      }

      public fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.builder()

      public override fun minimumLength(minimumLength: Number) {
        cdkBuilder.minimumLength(minimumLength)
      }

      public override fun requireLowercase(requireLowercase: Boolean) {
        cdkBuilder.requireLowercase(requireLowercase)
      }

      public override fun requireLowercase(requireLowercase: IResolvable) {
        cdkBuilder.requireLowercase(requireLowercase.let(IResolvable::unwrap))
      }

      public override fun requireNumbers(requireNumbers: Boolean) {
        cdkBuilder.requireNumbers(requireNumbers)
      }

      public override fun requireNumbers(requireNumbers: IResolvable) {
        cdkBuilder.requireNumbers(requireNumbers.let(IResolvable::unwrap))
      }

      public override fun requireSymbols(requireSymbols: Boolean) {
        cdkBuilder.requireSymbols(requireSymbols)
      }

      public override fun requireSymbols(requireSymbols: IResolvable) {
        cdkBuilder.requireSymbols(requireSymbols.let(IResolvable::unwrap))
      }

      public override fun requireUppercase(requireUppercase: Boolean) {
        cdkBuilder.requireUppercase(requireUppercase)
      }

      public override fun requireUppercase(requireUppercase: IResolvable) {
        cdkBuilder.requireUppercase(requireUppercase.let(IResolvable::unwrap))
      }

      public override fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
        cdkBuilder.temporaryPasswordValidityDays(temporaryPasswordValidityDays)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty,
    ) : PasswordPolicyProperty {
      public override fun minimumLength(): Number? = unwrap(this).getMinimumLength()

      public override fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

      public override fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

      public override fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

      public override fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

      public override fun temporaryPasswordValidityDays(): Number? =
          unwrap(this).getTemporaryPasswordValidityDays()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PasswordPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty):
          PasswordPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PasswordPolicyProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StringAttributeConstraintsProperty {
    public fun maxLength(): String? = unwrap(this).getMaxLength()

    public fun minLength(): String? = unwrap(this).getMinLength()

    public interface Builder {
      public fun maxLength(maxLength: String) {
      }

      public fun minLength(minLength: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.builder()

      public override fun maxLength(maxLength: String) {
        cdkBuilder.maxLength(maxLength)
      }

      public override fun minLength(minLength: String) {
        cdkBuilder.minLength(minLength)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty,
    ) : StringAttributeConstraintsProperty {
      public override fun maxLength(): String? = unwrap(this).getMaxLength()

      public override fun minLength(): String? = unwrap(this).getMinLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StringAttributeConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty):
          StringAttributeConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringAttributeConstraintsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeviceConfigurationProperty {
    public fun challengeRequiredOnNewDevice(): Any? = unwrap(this).getChallengeRequiredOnNewDevice()

    public fun deviceOnlyRememberedOnUserPrompt(): Any? =
        unwrap(this).getDeviceOnlyRememberedOnUserPrompt()

    public interface Builder {
      public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
      }

      public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
      }

      public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
      }

      public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.builder()

      public override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
      }

      public override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice.let(IResolvable::unwrap))
      }

      public override
          fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
      }

      public override
          fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty,
    ) : DeviceConfigurationProperty {
      public override fun challengeRequiredOnNewDevice(): Any? =
          unwrap(this).getChallengeRequiredOnNewDevice()

      public override fun deviceOnlyRememberedOnUserPrompt(): Any? =
          unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty):
          DeviceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PoliciesProperty {
    public fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()

    public interface Builder {
      public fun passwordPolicy(passwordPolicy: IResolvable) {
      }

      public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
      public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.builder()

      public override fun passwordPolicy(passwordPolicy: IResolvable) {
        cdkBuilder.passwordPolicy(passwordPolicy.let(IResolvable::unwrap))
      }

      public override fun passwordPolicy(passwordPolicy: PasswordPolicyProperty) {
        cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
      public override fun passwordPolicy(passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit):
          Unit = passwordPolicy(PasswordPolicyProperty(passwordPolicy))

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty,
    ) : PoliciesProperty {
      public override fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty):
          PoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PoliciesProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SchemaAttributeProperty {
    public fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

    public fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

    public fun mutable(): Any? = unwrap(this).getMutable()

    public fun name(): String? = unwrap(this).getName()

    public fun numberAttributeConstraints(): Any? = unwrap(this).getNumberAttributeConstraints()

    public fun required(): Any? = unwrap(this).getRequired()

    public fun stringAttributeConstraints(): Any? = unwrap(this).getStringAttributeConstraints()

    public interface Builder {
      public fun attributeDataType(attributeDataType: String) {
      }

      public fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
      }

      public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
      }

      public fun mutable(mutable: Boolean) {
      }

      public fun mutable(mutable: IResolvable) {
      }

      public fun name(name: String) {
      }

      public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
      }

      public
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
      public
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit) {
      }

      public fun required(required: Boolean) {
      }

      public fun required(required: IResolvable) {
      }

      public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
      }

      public
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
      public
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.builder()

      public override fun attributeDataType(attributeDataType: String) {
        cdkBuilder.attributeDataType(attributeDataType)
      }

      public override fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
      }

      public override fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute.let(IResolvable::unwrap))
      }

      public override fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
      }

      public override fun mutable(mutable: IResolvable) {
        cdkBuilder.mutable(mutable.let(IResolvable::unwrap))
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints.let(IResolvable::unwrap))
      }

      public override
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints.let(NumberAttributeConstraintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
      public override
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit):
          Unit =
          numberAttributeConstraints(NumberAttributeConstraintsProperty(numberAttributeConstraints))

      public override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      public override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public override fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints.let(IResolvable::unwrap))
      }

      public override
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints.let(StringAttributeConstraintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
      public override
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit):
          Unit =
          stringAttributeConstraints(StringAttributeConstraintsProperty(stringAttributeConstraints))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty,
    ) : SchemaAttributeProperty {
      public override fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

      public override fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

      public override fun mutable(): Any? = unwrap(this).getMutable()

      public override fun name(): String? = unwrap(this).getName()

      public override fun numberAttributeConstraints(): Any? =
          unwrap(this).getNumberAttributeConstraints()

      public override fun required(): Any? = unwrap(this).getRequired()

      public override fun stringAttributeConstraints(): Any? =
          unwrap(this).getStringAttributeConstraints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty):
          SchemaAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaAttributeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccountRecoverySettingProperty {
    public fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()

    public interface Builder {
      public fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
      }

      public fun recoveryMechanisms(recoveryMechanisms: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.builder()

      public override fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms.let(IResolvable::unwrap))
      }

      public override fun recoveryMechanisms(recoveryMechanisms: List<Any>) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty,
    ) : AccountRecoverySettingProperty {
      public override fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccountRecoverySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty):
          AccountRecoverySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountRecoverySettingProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NumberAttributeConstraintsProperty {
    public fun maxValue(): String? = unwrap(this).getMaxValue()

    public fun minValue(): String? = unwrap(this).getMinValue()

    public interface Builder {
      public fun maxValue(maxValue: String) {
      }

      public fun minValue(minValue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.builder()

      public override fun maxValue(maxValue: String) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: String) {
        cdkBuilder.minValue(minValue)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty,
    ) : NumberAttributeConstraintsProperty {
      public override fun maxValue(): String? = unwrap(this).getMaxValue()

      public override fun minValue(): String? = unwrap(this).getMinValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NumberAttributeConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty):
          NumberAttributeConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberAttributeConstraintsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SmsConfigurationProperty {
    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun snsCallerArn(): String? = unwrap(this).getSnsCallerArn()

    public fun snsRegion(): String? = unwrap(this).getSnsRegion()

    public interface Builder {
      public fun externalId(externalId: String) {
      }

      public fun snsCallerArn(snsCallerArn: String) {
      }

      public fun snsRegion(snsRegion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.builder()

      public override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      public override fun snsCallerArn(snsCallerArn: String) {
        cdkBuilder.snsCallerArn(snsCallerArn)
      }

      public override fun snsRegion(snsRegion: String) {
        cdkBuilder.snsRegion(snsRegion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty,
    ) : SmsConfigurationProperty {
      public override fun externalId(): String? = unwrap(this).getExternalId()

      public override fun snsCallerArn(): String? = unwrap(this).getSnsCallerArn()

      public override fun snsRegion(): String? = unwrap(this).getSnsRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SmsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty):
          SmsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomSMSSenderProperty {
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

    public interface Builder {
      public fun lambdaArn(lambdaArn: String) {
      }

      public fun lambdaVersion(lambdaVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.builder()

      public override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty,
    ) : CustomSMSSenderProperty {
      public override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      public override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomSMSSenderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty):
          CustomSMSSenderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomSMSSenderProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VerificationMessageTemplateProperty {
    public fun defaultEmailOption(): String? = unwrap(this).getDefaultEmailOption()

    public fun emailMessage(): String? = unwrap(this).getEmailMessage()

    public fun emailMessageByLink(): String? = unwrap(this).getEmailMessageByLink()

    public fun emailSubject(): String? = unwrap(this).getEmailSubject()

    public fun emailSubjectByLink(): String? = unwrap(this).getEmailSubjectByLink()

    public fun smsMessage(): String? = unwrap(this).getSmsMessage()

    public interface Builder {
      public fun defaultEmailOption(defaultEmailOption: String) {
      }

      public fun emailMessage(emailMessage: String) {
      }

      public fun emailMessageByLink(emailMessageByLink: String) {
      }

      public fun emailSubject(emailSubject: String) {
      }

      public fun emailSubjectByLink(emailSubjectByLink: String) {
      }

      public fun smsMessage(smsMessage: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.builder()

      public override fun defaultEmailOption(defaultEmailOption: String) {
        cdkBuilder.defaultEmailOption(defaultEmailOption)
      }

      public override fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
      }

      public override fun emailMessageByLink(emailMessageByLink: String) {
        cdkBuilder.emailMessageByLink(emailMessageByLink)
      }

      public override fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
      }

      public override fun emailSubjectByLink(emailSubjectByLink: String) {
        cdkBuilder.emailSubjectByLink(emailSubjectByLink)
      }

      public override fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty,
    ) : VerificationMessageTemplateProperty {
      public override fun defaultEmailOption(): String? = unwrap(this).getDefaultEmailOption()

      public override fun emailMessage(): String? = unwrap(this).getEmailMessage()

      public override fun emailMessageByLink(): String? = unwrap(this).getEmailMessageByLink()

      public override fun emailSubject(): String? = unwrap(this).getEmailSubject()

      public override fun emailSubjectByLink(): String? = unwrap(this).getEmailSubjectByLink()

      public override fun smsMessage(): String? = unwrap(this).getSmsMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VerificationMessageTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty):
          VerificationMessageTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerificationMessageTemplateProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EmailConfigurationProperty {
    public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    public fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

    public fun from(): String? = unwrap(this).getFrom()

    public fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    public interface Builder {
      public fun configurationSet(configurationSet: String) {
      }

      public fun emailSendingAccount(emailSendingAccount: String) {
      }

      public fun from(from: String) {
      }

      public fun replyToEmailAddress(replyToEmailAddress: String) {
      }

      public fun sourceArn(sourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.builder()

      public override fun configurationSet(configurationSet: String) {
        cdkBuilder.configurationSet(configurationSet)
      }

      public override fun emailSendingAccount(emailSendingAccount: String) {
        cdkBuilder.emailSendingAccount(emailSendingAccount)
      }

      public override fun from(from: String) {
        cdkBuilder.from(from)
      }

      public override fun replyToEmailAddress(replyToEmailAddress: String) {
        cdkBuilder.replyToEmailAddress(replyToEmailAddress)
      }

      public override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty,
    ) : EmailConfigurationProperty {
      public override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

      public override fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

      public override fun from(): String? = unwrap(this).getFrom()

      public override fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

      public override fun sourceArn(): String? = unwrap(this).getSourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty):
          EmailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface UsernameConfigurationProperty {
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    public interface Builder {
      public fun caseSensitive(caseSensitive: Boolean) {
      }

      public fun caseSensitive(caseSensitive: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.builder()

      public override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      public override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty,
    ) : UsernameConfigurationProperty {
      public override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UsernameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty):
          UsernameConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UsernameConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecoveryOptionProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun priority(): Number? = unwrap(this).getPriority()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun priority(priority: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty,
    ) : RecoveryOptionProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecoveryOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty):
          RecoveryOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecoveryOptionProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaConfigProperty {
    public fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

    public fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

    public fun customMessage(): String? = unwrap(this).getCustomMessage()

    public fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

    public fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

    public fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

    public fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

    public fun preSignUp(): String? = unwrap(this).getPreSignUp()

    public fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

    public fun preTokenGenerationConfig(): Any? = unwrap(this).getPreTokenGenerationConfig()

    public fun userMigration(): String? = unwrap(this).getUserMigration()

    public fun verifyAuthChallengeResponse(): String? =
        unwrap(this).getVerifyAuthChallengeResponse()

    public interface Builder {
      public fun createAuthChallenge(createAuthChallenge: String) {
      }

      public fun customEmailSender(customEmailSender: IResolvable) {
      }

      public fun customEmailSender(customEmailSender: CustomEmailSenderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
      public
          fun customEmailSender(customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit) {
      }

      public fun customMessage(customMessage: String) {
      }

      public fun customSmsSender(customSmsSender: IResolvable) {
      }

      public fun customSmsSender(customSmsSender: CustomSMSSenderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
      public fun customSmsSender(customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit) {
      }

      public fun defineAuthChallenge(defineAuthChallenge: String) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun postAuthentication(postAuthentication: String) {
      }

      public fun postConfirmation(postConfirmation: String) {
      }

      public fun preAuthentication(preAuthentication: String) {
      }

      public fun preSignUp(preSignUp: String) {
      }

      public fun preTokenGeneration(preTokenGeneration: String) {
      }

      public fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable) {
      }

      public
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
      public
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit) {
      }

      public fun userMigration(userMigration: String) {
      }

      public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.builder()

      public override fun createAuthChallenge(createAuthChallenge: String) {
        cdkBuilder.createAuthChallenge(createAuthChallenge)
      }

      public override fun customEmailSender(customEmailSender: IResolvable) {
        cdkBuilder.customEmailSender(customEmailSender.let(IResolvable::unwrap))
      }

      public override fun customEmailSender(customEmailSender: CustomEmailSenderProperty) {
        cdkBuilder.customEmailSender(customEmailSender.let(CustomEmailSenderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
      public override
          fun customEmailSender(customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit):
          Unit = customEmailSender(CustomEmailSenderProperty(customEmailSender))

      public override fun customMessage(customMessage: String) {
        cdkBuilder.customMessage(customMessage)
      }

      public override fun customSmsSender(customSmsSender: IResolvable) {
        cdkBuilder.customSmsSender(customSmsSender.let(IResolvable::unwrap))
      }

      public override fun customSmsSender(customSmsSender: CustomSMSSenderProperty) {
        cdkBuilder.customSmsSender(customSmsSender.let(CustomSMSSenderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
      public override
          fun customSmsSender(customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit): Unit =
          customSmsSender(CustomSMSSenderProperty(customSmsSender))

      public override fun defineAuthChallenge(defineAuthChallenge: String) {
        cdkBuilder.defineAuthChallenge(defineAuthChallenge)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun postAuthentication(postAuthentication: String) {
        cdkBuilder.postAuthentication(postAuthentication)
      }

      public override fun postConfirmation(postConfirmation: String) {
        cdkBuilder.postConfirmation(postConfirmation)
      }

      public override fun preAuthentication(preAuthentication: String) {
        cdkBuilder.preAuthentication(preAuthentication)
      }

      public override fun preSignUp(preSignUp: String) {
        cdkBuilder.preSignUp(preSignUp)
      }

      public override fun preTokenGeneration(preTokenGeneration: String) {
        cdkBuilder.preTokenGeneration(preTokenGeneration)
      }

      public override fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig.let(IResolvable::unwrap))
      }

      public override
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig.let(PreTokenGenerationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
      public override
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit):
          Unit =
          preTokenGenerationConfig(PreTokenGenerationConfigProperty(preTokenGenerationConfig))

      public override fun userMigration(userMigration: String) {
        cdkBuilder.userMigration(userMigration)
      }

      public override fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
        cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty,
    ) : LambdaConfigProperty {
      public override fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

      public override fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

      public override fun customMessage(): String? = unwrap(this).getCustomMessage()

      public override fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

      public override fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

      public override fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

      public override fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

      public override fun preSignUp(): String? = unwrap(this).getPreSignUp()

      public override fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

      public override fun preTokenGenerationConfig(): Any? =
          unwrap(this).getPreTokenGenerationConfig()

      public override fun userMigration(): String? = unwrap(this).getUserMigration()

      public override fun verifyAuthChallengeResponse(): String? =
          unwrap(this).getVerifyAuthChallengeResponse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty):
          LambdaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PreTokenGenerationConfigProperty {
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

    public interface Builder {
      public fun lambdaArn(lambdaArn: String) {
      }

      public fun lambdaVersion(lambdaVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty.builder()

      public override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty,
    ) : PreTokenGenerationConfigProperty {
      public override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      public override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PreTokenGenerationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty):
          PreTokenGenerationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PreTokenGenerationConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InviteMessageTemplateProperty {
    public fun emailMessage(): String? = unwrap(this).getEmailMessage()

    public fun emailSubject(): String? = unwrap(this).getEmailSubject()

    public fun smsMessage(): String? = unwrap(this).getSmsMessage()

    public interface Builder {
      public fun emailMessage(emailMessage: String) {
      }

      public fun emailSubject(emailSubject: String) {
      }

      public fun smsMessage(smsMessage: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.builder()

      public override fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
      }

      public override fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
      }

      public override fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty,
    ) : InviteMessageTemplateProperty {
      public override fun emailMessage(): String? = unwrap(this).getEmailMessage()

      public override fun emailSubject(): String? = unwrap(this).getEmailSubject()

      public override fun smsMessage(): String? = unwrap(this).getSmsMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InviteMessageTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty):
          InviteMessageTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InviteMessageTemplateProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserAttributeUpdateSettingsProperty {
    public fun attributesRequireVerificationBeforeUpdate(): List<String>

    public interface Builder {
      public
          fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty.builder()

      public override
          fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: List<String>) {
        cdkBuilder.attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty,
    ) : UserAttributeUpdateSettingsProperty {
      public override fun attributesRequireVerificationBeforeUpdate(): List<String> =
          unwrap(this).getAttributesRequireVerificationBeforeUpdate() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UserAttributeUpdateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty):
          UserAttributeUpdateSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAttributeUpdateSettingsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserPoolAddOnsProperty {
    public fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()

    public interface Builder {
      public fun advancedSecurityMode(advancedSecurityMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.builder()

      public override fun advancedSecurityMode(advancedSecurityMode: String) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty,
    ) : UserPoolAddOnsProperty {
      public override fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolAddOnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty):
          UserPoolAddOnsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPoolAddOnsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
