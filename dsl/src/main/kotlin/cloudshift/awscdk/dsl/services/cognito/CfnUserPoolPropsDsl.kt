@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolPropsDsl {
    private val cdkBuilder: CfnUserPoolProps.Builder = CfnUserPoolProps.builder()

    private val _aliasAttributes: MutableList<String> = mutableListOf()

    private val _autoVerifiedAttributes: MutableList<String> = mutableListOf()

    private val _enabledMfas: MutableList<String> = mutableListOf()

    private val _schema: MutableList<Any> = mutableListOf()

    private val _usernameAttributes: MutableList<String> = mutableListOf()

    public fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
        cdkBuilder.accountRecoverySetting(accountRecoverySetting)
    }

    public fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty) {
        cdkBuilder.accountRecoverySetting(accountRecoverySetting)
    }

    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
        cdkBuilder.adminCreateUserConfig(adminCreateUserConfig)
    }

    public fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty) {
        cdkBuilder.adminCreateUserConfig(adminCreateUserConfig)
    }

    public fun aliasAttributes(vararg aliasAttributes: String) {
        _aliasAttributes.addAll(listOf(*aliasAttributes))
    }

    public fun aliasAttributes(aliasAttributes: Collection<String>) {
        _aliasAttributes.addAll(aliasAttributes)
    }

    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String) {
        _autoVerifiedAttributes.addAll(listOf(*autoVerifiedAttributes))
    }

    public fun autoVerifiedAttributes(autoVerifiedAttributes: Collection<String>) {
        _autoVerifiedAttributes.addAll(autoVerifiedAttributes)
    }

    public fun deletionProtection(deletionProtection: String) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun deviceConfiguration(deviceConfiguration: IResolvable) {
        cdkBuilder.deviceConfiguration(deviceConfiguration)
    }

    public fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty) {
        cdkBuilder.deviceConfiguration(deviceConfiguration)
    }

    public fun emailConfiguration(emailConfiguration: IResolvable) {
        cdkBuilder.emailConfiguration(emailConfiguration)
    }

    public fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty) {
        cdkBuilder.emailConfiguration(emailConfiguration)
    }

    public fun emailVerificationMessage(emailVerificationMessage: String) {
        cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    public fun emailVerificationSubject(emailVerificationSubject: String) {
        cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    public fun enabledMfas(vararg enabledMfas: String) {
        _enabledMfas.addAll(listOf(*enabledMfas))
    }

    public fun enabledMfas(enabledMfas: Collection<String>) {
        _enabledMfas.addAll(enabledMfas)
    }

    public fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    public fun mfaConfiguration(mfaConfiguration: String) {
        cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    public fun policies(policies: CfnUserPool.PoliciesProperty) {
        cdkBuilder.policies(policies)
    }

    public fun schema(vararg schema: Any) {
        _schema.addAll(listOf(*schema))
    }

    public fun schema(schema: Collection<Any>) {
        _schema.addAll(schema)
    }

    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    public fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
        cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    public fun smsConfiguration(smsConfiguration: IResolvable) {
        cdkBuilder.smsConfiguration(smsConfiguration)
    }

    public fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty) {
        cdkBuilder.smsConfiguration(smsConfiguration)
    }

    public fun smsVerificationMessage(smsVerificationMessage: String) {
        cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
        cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings)
    }

    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty) {
        cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings)
    }

    public fun userPoolAddOns(userPoolAddOns: IResolvable) {
        cdkBuilder.userPoolAddOns(userPoolAddOns)
    }

    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty) {
        cdkBuilder.userPoolAddOns(userPoolAddOns)
    }

    public fun userPoolName(userPoolName: String) {
        cdkBuilder.userPoolName(userPoolName)
    }

    public fun userPoolTags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.userPoolTags(builder.map)
    }

    public fun userPoolTags(userPoolTags: Any) {
        cdkBuilder.userPoolTags(userPoolTags)
    }

    public fun usernameAttributes(vararg usernameAttributes: String) {
        _usernameAttributes.addAll(listOf(*usernameAttributes))
    }

    public fun usernameAttributes(usernameAttributes: Collection<String>) {
        _usernameAttributes.addAll(usernameAttributes)
    }

    public fun usernameConfiguration(usernameConfiguration: IResolvable) {
        cdkBuilder.usernameConfiguration(usernameConfiguration)
    }

    public fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty) {
        cdkBuilder.usernameConfiguration(usernameConfiguration)
    }

    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
        cdkBuilder.verificationMessageTemplate(verificationMessageTemplate)
    }

    public fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty) {
        cdkBuilder.verificationMessageTemplate(verificationMessageTemplate)
    }

    public fun build(): CfnUserPoolProps {
        if (_aliasAttributes.isNotEmpty()) cdkBuilder.aliasAttributes(_aliasAttributes)
        if (_autoVerifiedAttributes.isNotEmpty()) {
            cdkBuilder.autoVerifiedAttributes(_autoVerifiedAttributes)
        }
        if (_enabledMfas.isNotEmpty()) cdkBuilder.enabledMfas(_enabledMfas)
        if (_schema.isNotEmpty()) cdkBuilder.schema(_schema)
        if (_usernameAttributes.isNotEmpty()) cdkBuilder.usernameAttributes(_usernameAttributes)
        return cdkBuilder.build()
    }
}
