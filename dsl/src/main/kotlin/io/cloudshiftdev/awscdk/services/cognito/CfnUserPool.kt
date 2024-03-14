package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPool
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     */
    public open fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     */
    public open fun accountRecoverySetting(`value`: IResolvable) {
        unwrap(this).setAccountRecoverySetting(`value`.let(IResolvable::unwrap))
    }

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     */
    public open fun accountRecoverySetting(`value`: AccountRecoverySettingProperty) {
        unwrap(this).setAccountRecoverySetting(`value`.let(AccountRecoverySettingProperty::unwrap))
    }

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41869758d1479e39ad7853ac6413ee514612afc9860a9041b64a47dee3a233cd")
    public open fun accountRecoverySetting(
        `value`: AccountRecoverySettingProperty.Builder.() -> Unit
    ): Unit = accountRecoverySetting(AccountRecoverySettingProperty(`value`))

    /** The configuration for creating a new user profile. */
    public open fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

    /** The configuration for creating a new user profile. */
    public open fun adminCreateUserConfig(`value`: IResolvable) {
        unwrap(this).setAdminCreateUserConfig(`value`.let(IResolvable::unwrap))
    }

    /** The configuration for creating a new user profile. */
    public open fun adminCreateUserConfig(`value`: AdminCreateUserConfigProperty) {
        unwrap(this).setAdminCreateUserConfig(`value`.let(AdminCreateUserConfigProperty::unwrap))
    }

    /** The configuration for creating a new user profile. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a26247a0a20ec4848afe270346c20b8a0d598576ae427ad07d74f7e102cf7f6e")
    public open fun adminCreateUserConfig(
        `value`: AdminCreateUserConfigProperty.Builder.() -> Unit
    ): Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(`value`))

    /**
     * Attributes supported as an alias for this user pool.
     *
     * Possible values: *phone_number* , *email* , or *preferred_username* .
     */
    public open fun aliasAttributes(): List<String> =
        unwrap(this).getAliasAttributes() ?: emptyList()

    /**
     * Attributes supported as an alias for this user pool.
     *
     * Possible values: *phone_number* , *email* , or *preferred_username* .
     */
    public open fun aliasAttributes(`value`: List<String>) {
        unwrap(this).setAliasAttributes(`value`)
    }

    /**
     * Attributes supported as an alias for this user pool.
     *
     * Possible values: *phone_number* , *email* , or *preferred_username* .
     */
    public open fun aliasAttributes(vararg `value`: String): Unit =
        aliasAttributes(`value`.toList())

    /**
     * The Amazon Resource Name (ARN) of the user pool, such as
     * `arn:aws:cognito-idp:us-east-1:123412341234:userpool/us-east-1_123412341` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The provider name of the Amazon Cognito user pool, specified as a `String` . */
    public open fun attrProviderName(): String = unwrap(this).getAttrProviderName()

    /** The URL of the provider of the Amazon Cognito user pool, specified as a `String` . */
    public open fun attrProviderUrl(): String = unwrap(this).getAttrProviderUrl()

    /** The ID of the user pool. */
    public open fun attrUserPoolId(): String = unwrap(this).getAttrUserPoolId()

    /** The attributes to be auto-verified. */
    public open fun autoVerifiedAttributes(): List<String> =
        unwrap(this).getAutoVerifiedAttributes() ?: emptyList()

    /** The attributes to be auto-verified. */
    public open fun autoVerifiedAttributes(`value`: List<String>) {
        unwrap(this).setAutoVerifiedAttributes(`value`)
    }

    /** The attributes to be auto-verified. */
    public open fun autoVerifiedAttributes(vararg `value`: String): Unit =
        autoVerifiedAttributes(`value`.toList())

    /** When active, `DeletionProtection` prevents accidental deletion of your user pool. */
    public open fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

    /** When active, `DeletionProtection` prevents accidental deletion of your user pool. */
    public open fun deletionProtection(`value`: String) {
        unwrap(this).setDeletionProtection(`value`)
    }

    /** The device-remembering configuration for a user pool. */
    public open fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

    /** The device-remembering configuration for a user pool. */
    public open fun deviceConfiguration(`value`: IResolvable) {
        unwrap(this).setDeviceConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** The device-remembering configuration for a user pool. */
    public open fun deviceConfiguration(`value`: DeviceConfigurationProperty) {
        unwrap(this).setDeviceConfiguration(`value`.let(DeviceConfigurationProperty::unwrap))
    }

    /** The device-remembering configuration for a user pool. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b35171bfbda008f4b6b9e661be8a69c0c4121d1ffa7951db3edc900d38625f2c")
    public open fun deviceConfiguration(
        `value`: DeviceConfigurationProperty.Builder.() -> Unit
    ): Unit = deviceConfiguration(DeviceConfigurationProperty(`value`))

    /** The email configuration of your user pool. */
    public open fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

    /** The email configuration of your user pool. */
    public open fun emailConfiguration(`value`: IResolvable) {
        unwrap(this).setEmailConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** The email configuration of your user pool. */
    public open fun emailConfiguration(`value`: EmailConfigurationProperty) {
        unwrap(this).setEmailConfiguration(`value`.let(EmailConfigurationProperty::unwrap))
    }

    /** The email configuration of your user pool. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e380aac4b166f086c05484321f9074512a3203c5bc32edb9c10ea216d01f4ebf")
    public open fun emailConfiguration(
        `value`: EmailConfigurationProperty.Builder.() -> Unit
    ): Unit = emailConfiguration(EmailConfigurationProperty(`value`))

    /** This parameter is no longer used. */
    public open fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

    /** This parameter is no longer used. */
    public open fun emailVerificationMessage(`value`: String) {
        unwrap(this).setEmailVerificationMessage(`value`)
    }

    /** This parameter is no longer used. */
    public open fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

    /** This parameter is no longer used. */
    public open fun emailVerificationSubject(`value`: String) {
        unwrap(this).setEmailVerificationSubject(`value`)
    }

    /** Enables MFA on a specified user pool. */
    public open fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

    /** Enables MFA on a specified user pool. */
    public open fun enabledMfas(`value`: List<String>) {
        unwrap(this).setEnabledMfas(`value`)
    }

    /** Enables MFA on a specified user pool. */
    public open fun enabledMfas(vararg `value`: String): Unit = enabledMfas(`value`.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The Lambda trigger configuration information for the new user pool. */
    public open fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    /** The Lambda trigger configuration information for the new user pool. */
    public open fun lambdaConfig(`value`: IResolvable) {
        unwrap(this).setLambdaConfig(`value`.let(IResolvable::unwrap))
    }

    /** The Lambda trigger configuration information for the new user pool. */
    public open fun lambdaConfig(`value`: LambdaConfigProperty) {
        unwrap(this).setLambdaConfig(`value`.let(LambdaConfigProperty::unwrap))
    }

    /** The Lambda trigger configuration information for the new user pool. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("746fcba026dd44cfc248dcc3a74bb75dec1927c844a55e0c3cb65e4935ef3654")
    public open fun lambdaConfig(`value`: LambdaConfigProperty.Builder.() -> Unit): Unit =
        lambdaConfig(LambdaConfigProperty(`value`))

    /**
     * The multi-factor authentication (MFA) configuration.
     *
     * Valid values include:.
     */
    public open fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

    /**
     * The multi-factor authentication (MFA) configuration.
     *
     * Valid values include:.
     */
    public open fun mfaConfiguration(`value`: String) {
        unwrap(this).setMfaConfiguration(`value`)
    }

    /** The policy associated with a user pool. */
    public open fun policies(): Any? = unwrap(this).getPolicies()

    /** The policy associated with a user pool. */
    public open fun policies(`value`: IResolvable) {
        unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
    }

    /** The policy associated with a user pool. */
    public open fun policies(`value`: PoliciesProperty) {
        unwrap(this).setPolicies(`value`.let(PoliciesProperty::unwrap))
    }

    /** The policy associated with a user pool. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8acea4f8e23426db34b7f27283cfb03e85ea58103fa10ce204a08d84d35d8da")
    public open fun policies(`value`: PoliciesProperty.Builder.() -> Unit): Unit =
        policies(PoliciesProperty(`value`))

    /**
     * The schema attributes for the new user pool.
     *
     * These attributes can be standard or custom attributes.
     */
    public open fun schema(): Any? = unwrap(this).getSchema()

    /**
     * The schema attributes for the new user pool.
     *
     * These attributes can be standard or custom attributes.
     */
    public open fun schema(`value`: IResolvable) {
        unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
    }

    /**
     * The schema attributes for the new user pool.
     *
     * These attributes can be standard or custom attributes.
     */
    public open fun schema(__idx_ac66f0: List<Any>) {
        unwrap(this).setSchema(__idx_ac66f0)
    }

    /**
     * The schema attributes for the new user pool.
     *
     * These attributes can be standard or custom attributes.
     */
    public open fun schema(vararg __idx_ac66f0: Any): Unit = schema(__idx_ac66f0.toList())

    /** A string representing the SMS authentication message. */
    public open fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

    /** A string representing the SMS authentication message. */
    public open fun smsAuthenticationMessage(`value`: String) {
        unwrap(this).setSmsAuthenticationMessage(`value`)
    }

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     */
    public open fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     */
    public open fun smsConfiguration(`value`: IResolvable) {
        unwrap(this).setSmsConfiguration(`value`.let(IResolvable::unwrap))
    }

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     */
    public open fun smsConfiguration(`value`: SmsConfigurationProperty) {
        unwrap(this).setSmsConfiguration(`value`.let(SmsConfigurationProperty::unwrap))
    }

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a50346460383087797abc34d738bc3deae588a86f4a5a46bf21193632e510438")
    public open fun smsConfiguration(`value`: SmsConfigurationProperty.Builder.() -> Unit): Unit =
        smsConfiguration(SmsConfigurationProperty(`value`))

    /** This parameter is no longer used. */
    public open fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

    /** This parameter is no longer used. */
    public open fun smsVerificationMessage(`value`: String) {
        unwrap(this).setSmsVerificationMessage(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The settings for updates to user attributes. */
    public open fun userAttributeUpdateSettings(): Any? =
        unwrap(this).getUserAttributeUpdateSettings()

    /** The settings for updates to user attributes. */
    public open fun userAttributeUpdateSettings(`value`: IResolvable) {
        unwrap(this).setUserAttributeUpdateSettings(`value`.let(IResolvable::unwrap))
    }

    /** The settings for updates to user attributes. */
    public open fun userAttributeUpdateSettings(`value`: UserAttributeUpdateSettingsProperty) {
        unwrap(this)
            .setUserAttributeUpdateSettings(
                `value`.let(UserAttributeUpdateSettingsProperty::unwrap)
            )
    }

    /** The settings for updates to user attributes. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2d9507e58e9c57069f320b0d14c9b7b7d6feab509f57ffc2151b658768e3ac")
    public open fun userAttributeUpdateSettings(
        `value`: UserAttributeUpdateSettingsProperty.Builder.() -> Unit
    ): Unit = userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty(`value`))

    /** User pool add-ons. */
    public open fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

    /** User pool add-ons. */
    public open fun userPoolAddOns(`value`: IResolvable) {
        unwrap(this).setUserPoolAddOns(`value`.let(IResolvable::unwrap))
    }

    /** User pool add-ons. */
    public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty) {
        unwrap(this).setUserPoolAddOns(`value`.let(UserPoolAddOnsProperty::unwrap))
    }

    /** User pool add-ons. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52b1b6a3af630a51f88af5dab8da0c8eafd9d71d75bf8939966599637d57e6e4")
    public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty.Builder.() -> Unit): Unit =
        userPoolAddOns(UserPoolAddOnsProperty(`value`))

    /** A string used to name the user pool. */
    public open fun userPoolName(): String? = unwrap(this).getUserPoolName()

    /** A string used to name the user pool. */
    public open fun userPoolName(`value`: String) {
        unwrap(this).setUserPoolName(`value`)
    }

    /** The tag keys and values to assign to the user pool. */
    public open fun userPoolTagsRaw(): Any? = unwrap(this).getUserPoolTagsRaw()

    /** The tag keys and values to assign to the user pool. */
    public open fun userPoolTagsRaw(`value`: Any) {
        unwrap(this).setUserPoolTagsRaw(`value`)
    }

    /**
     * Determines whether email addresses or phone numbers can be specified as user names when a
     * user signs up.
     */
    public open fun usernameAttributes(): List<String> =
        unwrap(this).getUsernameAttributes() ?: emptyList()

    /**
     * Determines whether email addresses or phone numbers can be specified as user names when a
     * user signs up.
     */
    public open fun usernameAttributes(`value`: List<String>) {
        unwrap(this).setUsernameAttributes(`value`)
    }

    /**
     * Determines whether email addresses or phone numbers can be specified as user names when a
     * user signs up.
     */
    public open fun usernameAttributes(vararg `value`: String): Unit =
        usernameAttributes(`value`.toList())

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     */
    public open fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     */
    public open fun usernameConfiguration(`value`: IResolvable) {
        unwrap(this).setUsernameConfiguration(`value`.let(IResolvable::unwrap))
    }

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     */
    public open fun usernameConfiguration(`value`: UsernameConfigurationProperty) {
        unwrap(this).setUsernameConfiguration(`value`.let(UsernameConfigurationProperty::unwrap))
    }

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4530461026528910b8f5a9c46b31dd9e2b7bd6245adf82505f50792d1e4e7a7")
    public open fun usernameConfiguration(
        `value`: UsernameConfigurationProperty.Builder.() -> Unit
    ): Unit = usernameConfiguration(UsernameConfigurationProperty(`value`))

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     */
    public open fun verificationMessageTemplate(): Any? =
        unwrap(this).getVerificationMessageTemplate()

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     */
    public open fun verificationMessageTemplate(`value`: IResolvable) {
        unwrap(this).setVerificationMessageTemplate(`value`.let(IResolvable::unwrap))
    }

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     */
    public open fun verificationMessageTemplate(`value`: VerificationMessageTemplateProperty) {
        unwrap(this)
            .setVerificationMessageTemplate(
                `value`.let(VerificationMessageTemplateProperty::unwrap)
            )
    }

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a739849a2934daad512588221e8cd348c058e98865835fc2950debe0c51ff649")
    public open fun verificationMessageTemplate(
        `value`: VerificationMessageTemplateProperty.Builder.() -> Unit
    ): Unit = verificationMessageTemplate(VerificationMessageTemplateProperty(`value`))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPool]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        public fun accountRecoverySetting(accountRecoverySetting: IResolvable)

        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        public fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty)

        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
        public fun accountRecoverySetting(
            accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit
        )

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable)

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        public fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty)

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
        public fun adminCreateUserConfig(
            adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit
        )

        /**
         * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
         * *email* , or *preferred_username* .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * @param aliasAttributes Attributes supported as an alias for this user pool. Possible
         *   values: *phone_number* , *email* , or *preferred_username* .
         */
        public fun aliasAttributes(aliasAttributes: List<String>)

        /**
         * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
         * *email* , or *preferred_username* .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * @param aliasAttributes Attributes supported as an alias for this user pool. Possible
         *   values: *phone_number* , *email* , or *preferred_username* .
         */
        public fun aliasAttributes(vararg aliasAttributes: String)

        /**
         * The attributes to be auto-verified.
         *
         * Possible values: *email* , *phone_number* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * @param autoVerifiedAttributes The attributes to be auto-verified.
         */
        public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>)

        /**
         * The attributes to be auto-verified.
         *
         * Possible values: *email* , *phone_number* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * @param autoVerifiedAttributes The attributes to be auto-verified.
         */
        public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String)

        /**
         * When active, `DeletionProtection` prevents accidental deletion of your user pool.
         *
         * Before you can delete a user pool that you have protected against deletion, you must
         * deactivate this feature.
         *
         * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
         * Cognito returns an `InvalidParameterException` error. To delete a protected user pool,
         * send a new `DeleteUserPool` request after you deactivate deletion protection in an
         * `UpdateUserPool` API request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
         *
         * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion
         *   of your user pool.
         */
        public fun deletionProtection(deletionProtection: String)

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        public fun deviceConfiguration(deviceConfiguration: IResolvable)

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        public fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty)

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
        public fun deviceConfiguration(
            deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        public fun emailConfiguration(emailConfiguration: IResolvable)

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        public fun emailConfiguration(emailConfiguration: EmailConfigurationProperty)

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
        public fun emailConfiguration(
            emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit
        )

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
         *
         * @param emailVerificationMessage This parameter is no longer used.
         */
        public fun emailVerificationMessage(emailVerificationMessage: String)

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
         *
         * @param emailVerificationSubject This parameter is no longer used.
         */
        public fun emailVerificationSubject(emailVerificationSubject: String)

        /**
         * Enables MFA on a specified user pool.
         *
         * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
         * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
         * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of
         * the following values:
         * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
         *   configuration is provided.
         * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
         *
         * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
         *
         * @param enabledMfas Enables MFA on a specified user pool.
         */
        public fun enabledMfas(enabledMfas: List<String>)

        /**
         * Enables MFA on a specified user pool.
         *
         * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
         * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
         * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of
         * the following values:
         * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
         *   configuration is provided.
         * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
         *
         * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
         *
         * @param enabledMfas Enables MFA on a specified user pool.
         */
        public fun enabledMfas(vararg enabledMfas: String)

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        public fun lambdaConfig(lambdaConfig: IResolvable)

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        public fun lambdaConfig(lambdaConfig: LambdaConfigProperty)

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
        public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit)

        /**
         * The multi-factor authentication (MFA) configuration. Valid values include:.
         * * `OFF` MFA won't be used for any users.
         * * `ON` MFA is required for all users to sign in.
         * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor
         *   activated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
         *
         * @param mfaConfiguration The multi-factor authentication (MFA) configuration. Valid values
         *   include:.
         */
        public fun mfaConfiguration(mfaConfiguration: String)

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        public fun policies(policies: IResolvable)

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        public fun policies(policies: PoliciesProperty)

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
        public fun policies(policies: PoliciesProperty.Builder.() -> Unit)

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        public fun schema(schema: IResolvable)

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        public fun schema(schema: List<Any>)

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        public fun schema(vararg schema: Any)

        /**
         * A string representing the SMS authentication message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
         *
         * @param smsAuthenticationMessage A string representing the SMS authentication message.
         */
        public fun smsAuthenticationMessage(smsAuthenticationMessage: String)

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        public fun smsConfiguration(smsConfiguration: IResolvable)

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty)

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
        public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit)

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
         *
         * @param smsVerificationMessage This parameter is no longer used.
         */
        public fun smsVerificationMessage(smsVerificationMessage: String)

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable)

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        public fun userAttributeUpdateSettings(
            userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty
        )

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
        public fun userAttributeUpdateSettings(
            userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit
        )

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        public fun userPoolAddOns(userPoolAddOns: IResolvable)

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty)

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
        public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit)

        /**
         * A string used to name the user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
         *
         * @param userPoolName A string used to name the user pool.
         */
        public fun userPoolName(userPoolName: String)

        /**
         * The tag keys and values to assign to the user pool.
         *
         * A tag is a label that you can use to categorize and manage user pools in different ways,
         * such as by purpose, owner, environment, or other criteria.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
         *
         * @param userPoolTags The tag keys and values to assign to the user pool.
         */
        public fun userPoolTags(userPoolTags: Any)

        /**
         * Determines whether email addresses or phone numbers can be specified as user names when a
         * user signs up.
         *
         * Possible values: `phone_number` or `email` .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * @param usernameAttributes Determines whether email addresses or phone numbers can be
         *   specified as user names when a user signs up.
         */
        public fun usernameAttributes(usernameAttributes: List<String>)

        /**
         * Determines whether email addresses or phone numbers can be specified as user names when a
         * user signs up.
         *
         * Possible values: `phone_number` or `email` .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * @param usernameAttributes Determines whether email addresses or phone numbers can be
         *   specified as user names when a user signs up.
         */
        public fun usernameAttributes(vararg usernameAttributes: String)

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        public fun usernameConfiguration(usernameConfiguration: IResolvable)

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        public fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty)

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
        public fun usernameConfiguration(
            usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable)

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        public fun verificationMessageTemplate(
            verificationMessageTemplate: VerificationMessageTemplateProperty
        )

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
        public fun verificationMessageTemplate(
            verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPool.Builder =
            software.amazon.awscdk.services.cognito.CfnUserPool.Builder.create(scope, id)

        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
            cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable::unwrap))
        }

        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        override fun accountRecoverySetting(
            accountRecoverySetting: AccountRecoverySettingProperty
        ) {
            cdkBuilder.accountRecoverySetting(
                accountRecoverySetting.let(AccountRecoverySettingProperty::unwrap)
            )
        }

        /**
         * Use this setting to define which verified available method a user can use to recover
         * their password when they call `ForgotPassword` .
         *
         * It allows you to define a preferred method when a user has more than one method
         * available. With this setting, SMS does not qualify for a valid password recovery
         * mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito
         * uses the legacy behavior to determine the recovery method where SMS is preferred over
         * email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
         *
         * @param accountRecoverySetting Use this setting to define which verified available method
         *   a user can use to recover their password when they call `ForgotPassword` .
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
        override fun accountRecoverySetting(
            accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit
        ): Unit = accountRecoverySetting(AccountRecoverySettingProperty(accountRecoverySetting))

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
            cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable::unwrap))
        }

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        override fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty) {
            cdkBuilder.adminCreateUserConfig(
                adminCreateUserConfig.let(AdminCreateUserConfigProperty::unwrap)
            )
        }

        /**
         * The configuration for creating a new user profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * @param adminCreateUserConfig The configuration for creating a new user profile.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
        override fun adminCreateUserConfig(
            adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit
        ): Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(adminCreateUserConfig))

        /**
         * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
         * *email* , or *preferred_username* .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * @param aliasAttributes Attributes supported as an alias for this user pool. Possible
         *   values: *phone_number* , *email* , or *preferred_username* .
         */
        override fun aliasAttributes(aliasAttributes: List<String>) {
            cdkBuilder.aliasAttributes(aliasAttributes)
        }

        /**
         * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
         * *email* , or *preferred_username* .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * @param aliasAttributes Attributes supported as an alias for this user pool. Possible
         *   values: *phone_number* , *email* , or *preferred_username* .
         */
        override fun aliasAttributes(vararg aliasAttributes: String): Unit =
            aliasAttributes(aliasAttributes.toList())

        /**
         * The attributes to be auto-verified.
         *
         * Possible values: *email* , *phone_number* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * @param autoVerifiedAttributes The attributes to be auto-verified.
         */
        override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
            cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
        }

        /**
         * The attributes to be auto-verified.
         *
         * Possible values: *email* , *phone_number* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * @param autoVerifiedAttributes The attributes to be auto-verified.
         */
        override fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String): Unit =
            autoVerifiedAttributes(autoVerifiedAttributes.toList())

        /**
         * When active, `DeletionProtection` prevents accidental deletion of your user pool.
         *
         * Before you can delete a user pool that you have protected against deletion, you must
         * deactivate this feature.
         *
         * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
         * Cognito returns an `InvalidParameterException` error. To delete a protected user pool,
         * send a new `DeleteUserPool` request after you deactivate deletion protection in an
         * `UpdateUserPool` API request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
         *
         * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion
         *   of your user pool.
         */
        override fun deletionProtection(deletionProtection: String) {
            cdkBuilder.deletionProtection(deletionProtection)
        }

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        override fun deviceConfiguration(deviceConfiguration: IResolvable) {
            cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable::unwrap))
        }

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        override fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty) {
            cdkBuilder.deviceConfiguration(
                deviceConfiguration.let(DeviceConfigurationProperty::unwrap)
            )
        }

        /**
         * The device-remembering configuration for a user pool.
         *
         * A null value indicates that you have deactivated device remembering in your user pool.
         *
         * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon
         * Cognito device-remembering feature.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * @param deviceConfiguration The device-remembering configuration for a user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
        override fun deviceConfiguration(
            deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit
        ): Unit = deviceConfiguration(DeviceConfigurationProperty(deviceConfiguration))

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        override fun emailConfiguration(emailConfiguration: IResolvable) {
            cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable::unwrap))
        }

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        override fun emailConfiguration(emailConfiguration: EmailConfigurationProperty) {
            cdkBuilder.emailConfiguration(
                emailConfiguration.let(EmailConfigurationProperty::unwrap)
            )
        }

        /**
         * The email configuration of your user pool.
         *
         * The email configuration type sets your preferred sending method, AWS Region, and sender
         * for messages from your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * @param emailConfiguration The email configuration of your user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
        override fun emailConfiguration(
            emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit
        ): Unit = emailConfiguration(EmailConfigurationProperty(emailConfiguration))

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
         *
         * @param emailVerificationMessage This parameter is no longer used.
         */
        override fun emailVerificationMessage(emailVerificationMessage: String) {
            cdkBuilder.emailVerificationMessage(emailVerificationMessage)
        }

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
         *
         * @param emailVerificationSubject This parameter is no longer used.
         */
        override fun emailVerificationSubject(emailVerificationSubject: String) {
            cdkBuilder.emailVerificationSubject(emailVerificationSubject)
        }

        /**
         * Enables MFA on a specified user pool.
         *
         * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
         * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
         * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of
         * the following values:
         * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
         *   configuration is provided.
         * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
         *
         * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
         *
         * @param enabledMfas Enables MFA on a specified user pool.
         */
        override fun enabledMfas(enabledMfas: List<String>) {
            cdkBuilder.enabledMfas(enabledMfas)
        }

        /**
         * Enables MFA on a specified user pool.
         *
         * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
         * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
         * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of
         * the following values:
         * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
         *   configuration is provided.
         * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
         *
         * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
         *
         * @param enabledMfas Enables MFA on a specified user pool.
         */
        override fun enabledMfas(vararg enabledMfas: String): Unit =
            enabledMfas(enabledMfas.toList())

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        override fun lambdaConfig(lambdaConfig: IResolvable) {
            cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
        }

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
            cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty::unwrap))
        }

        /**
         * The Lambda trigger configuration information for the new user pool.
         *
         * In a push model, event sources (such as Amazon S3 and custom applications) need
         * permission to invoke a function. So you must make an extra call to add permission for
         * these event sources to invoke your Lambda function.
         *
         * For more information on using the Lambda API to add permission, see
         * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
         *
         * For adding permission using the AWS CLI , see
         * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
        override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
            lambdaConfig(LambdaConfigProperty(lambdaConfig))

        /**
         * The multi-factor authentication (MFA) configuration. Valid values include:.
         * * `OFF` MFA won't be used for any users.
         * * `ON` MFA is required for all users to sign in.
         * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor
         *   activated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
         *
         * @param mfaConfiguration The multi-factor authentication (MFA) configuration. Valid values
         *   include:.
         */
        override fun mfaConfiguration(mfaConfiguration: String) {
            cdkBuilder.mfaConfiguration(mfaConfiguration)
        }

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        override fun policies(policies: IResolvable) {
            cdkBuilder.policies(policies.let(IResolvable::unwrap))
        }

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        override fun policies(policies: PoliciesProperty) {
            cdkBuilder.policies(policies.let(PoliciesProperty::unwrap))
        }

        /**
         * The policy associated with a user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * @param policies The policy associated with a user pool.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
        override fun policies(policies: PoliciesProperty.Builder.() -> Unit): Unit =
            policies(PoliciesProperty(policies))

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        override fun schema(schema: IResolvable) {
            cdkBuilder.schema(schema.let(IResolvable::unwrap))
        }

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        override fun schema(schema: List<Any>) {
            cdkBuilder.schema(schema)
        }

        /**
         * The schema attributes for the new user pool. These attributes can be standard or custom
         * attributes.
         *
         * During a user pool update, you can add new schema attributes but you cannot modify or
         * delete an existing schema attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * @param schema The schema attributes for the new user pool. These attributes can be
         *   standard or custom attributes.
         */
        override fun schema(vararg schema: Any): Unit = schema(schema.toList())

        /**
         * A string representing the SMS authentication message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
         *
         * @param smsAuthenticationMessage A string representing the SMS authentication message.
         */
        override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
            cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
        }

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        override fun smsConfiguration(smsConfiguration: IResolvable) {
            cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable::unwrap))
        }

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        override fun smsConfiguration(smsConfiguration: SmsConfigurationProperty) {
            cdkBuilder.smsConfiguration(smsConfiguration.let(SmsConfigurationProperty::unwrap))
        }

        /**
         * The SMS configuration with the settings that your Amazon Cognito user pool must use to
         * send an SMS message from your AWS account through Amazon Simple Notification Service.
         *
         * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito
         * user pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito
         *   user pool must use to send an SMS message from your AWS account through Amazon Simple
         *   Notification Service.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
        override fun smsConfiguration(
            smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit
        ): Unit = smsConfiguration(SmsConfigurationProperty(smsConfiguration))

        /**
         * This parameter is no longer used.
         *
         * See
         * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
         *
         * @param smsVerificationMessage This parameter is no longer used.
         */
        override fun smsVerificationMessage(smsVerificationMessage: String) {
            cdkBuilder.smsVerificationMessage(smsVerificationMessage)
        }

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        override fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
            cdkBuilder.userAttributeUpdateSettings(
                userAttributeUpdateSettings.let(IResolvable::unwrap)
            )
        }

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        override fun userAttributeUpdateSettings(
            userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty
        ) {
            cdkBuilder.userAttributeUpdateSettings(
                userAttributeUpdateSettings.let(UserAttributeUpdateSettingsProperty::unwrap)
            )
        }

        /**
         * The settings for updates to user attributes.
         *
         * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a
         * user-pool setting that tells Amazon Cognito how to handle changes to the value of your
         * users' email address and phone number attributes. For more information, see
         * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
         *
         * @param userAttributeUpdateSettings The settings for updates to user attributes.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
        override fun userAttributeUpdateSettings(
            userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit
        ): Unit =
            userAttributeUpdateSettings(
                UserAttributeUpdateSettingsProperty(userAttributeUpdateSettings)
            )

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        override fun userPoolAddOns(userPoolAddOns: IResolvable) {
            cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable::unwrap))
        }

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        override fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty) {
            cdkBuilder.userPoolAddOns(userPoolAddOns.let(UserPoolAddOnsProperty::unwrap))
        }

        /**
         * User pool add-ons.
         *
         * Contains settings for activation of advanced security features. To log user security
         * information but take no action, set to `AUDIT` . To configure automatic security
         * responses to risky traffic to your user pool, set to `ENFORCED` .
         *
         * For more information, see
         * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
         *
         * @param userPoolAddOns User pool add-ons.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
        override fun userPoolAddOns(
            userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit
        ): Unit = userPoolAddOns(UserPoolAddOnsProperty(userPoolAddOns))

        /**
         * A string used to name the user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
         *
         * @param userPoolName A string used to name the user pool.
         */
        override fun userPoolName(userPoolName: String) {
            cdkBuilder.userPoolName(userPoolName)
        }

        /**
         * The tag keys and values to assign to the user pool.
         *
         * A tag is a label that you can use to categorize and manage user pools in different ways,
         * such as by purpose, owner, environment, or other criteria.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
         *
         * @param userPoolTags The tag keys and values to assign to the user pool.
         */
        override fun userPoolTags(userPoolTags: Any) {
            cdkBuilder.userPoolTags(userPoolTags)
        }

        /**
         * Determines whether email addresses or phone numbers can be specified as user names when a
         * user signs up.
         *
         * Possible values: `phone_number` or `email` .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * @param usernameAttributes Determines whether email addresses or phone numbers can be
         *   specified as user names when a user signs up.
         */
        override fun usernameAttributes(usernameAttributes: List<String>) {
            cdkBuilder.usernameAttributes(usernameAttributes)
        }

        /**
         * Determines whether email addresses or phone numbers can be specified as user names when a
         * user signs up.
         *
         * Possible values: `phone_number` or `email` .
         *
         * This user pool property cannot be updated.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * @param usernameAttributes Determines whether email addresses or phone numbers can be
         *   specified as user names when a user signs up.
         */
        override fun usernameAttributes(vararg usernameAttributes: String): Unit =
            usernameAttributes(usernameAttributes.toList())

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        override fun usernameConfiguration(usernameConfiguration: IResolvable) {
            cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable::unwrap))
        }

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        override fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty) {
            cdkBuilder.usernameConfiguration(
                usernameConfiguration.let(UsernameConfigurationProperty::unwrap)
            )
        }

        /**
         * You can choose to set case sensitivity on the username input for the selected sign-in
         * option.
         *
         * For example, when this is set to `False` , users will be able to sign in using either
         * "username" or "Username". This configuration is immutable once it has been set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
         *
         * @param usernameConfiguration You can choose to set case sensitivity on the username input
         *   for the selected sign-in option.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
        override fun usernameConfiguration(
            usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit
        ): Unit = usernameConfiguration(UsernameConfigurationProperty(usernameConfiguration))

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
            cdkBuilder.verificationMessageTemplate(
                verificationMessageTemplate.let(IResolvable::unwrap)
            )
        }

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        override fun verificationMessageTemplate(
            verificationMessageTemplate: VerificationMessageTemplateProperty
        ) {
            cdkBuilder.verificationMessageTemplate(
                verificationMessageTemplate.let(VerificationMessageTemplateProperty::unwrap)
            )
        }

        /**
         * The template for the verification message that the user sees when the app requests
         * permission to access the user's information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
         *
         * @param verificationMessageTemplate The template for the verification message that the
         *   user sees when the app requests permission to access the user's information.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
        override fun verificationMessageTemplate(
            verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit
        ): Unit =
            verificationMessageTemplate(
                VerificationMessageTemplateProperty(verificationMessageTemplate)
            )

        public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnUserPool {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnUserPool(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool
        ): CfnUserPool = CfnUserPool(cdkObject)

        internal fun unwrap(
            wrapped: CfnUserPool
        ): software.amazon.awscdk.services.cognito.CfnUserPool = wrapped.cdkObject
    }

    public interface CustomEmailSenderProperty {
        /**
         * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito triggers to
         * send email notifications to users.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaarn)
         */
        public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

        /**
         * The Lambda version represents the signature of the "request" attribute in the "event"
         * information that Amazon Cognito passes to your custom email sender AWS Lambda function.
         *
         * The only supported value is `V1_0` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaversion)
         */
        public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

        /** A builder for [CustomEmailSenderProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that
             *   Amazon Cognito triggers to send email notifications to users.
             */
            public fun lambdaArn(lambdaArn: String)

            /**
             * @param lambdaVersion The Lambda version represents the signature of the "request"
             *   attribute in the "event" information that Amazon Cognito passes to your custom
             *   email sender AWS Lambda function. The only supported value is `V1_0` .
             */
            public fun lambdaVersion(lambdaVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty
                    .builder()

            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that
             *   Amazon Cognito triggers to send email notifications to users.
             */
            override fun lambdaArn(lambdaArn: String) {
                cdkBuilder.lambdaArn(lambdaArn)
            }

            /**
             * @param lambdaVersion The Lambda version represents the signature of the "request"
             *   attribute in the "event" information that Amazon Cognito passes to your custom
             *   email sender AWS Lambda function. The only supported value is `V1_0` .
             */
            override fun lambdaVersion(lambdaVersion: String) {
                cdkBuilder.lambdaVersion(lambdaVersion)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty,
        ) : CustomEmailSenderProperty {
            /**
             * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito
             * triggers to send email notifications to users.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaarn)
             */
            override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

            /**
             * The Lambda version represents the signature of the "request" attribute in the "event"
             * information that Amazon Cognito passes to your custom email sender AWS Lambda
             * function.
             *
             * The only supported value is `V1_0` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaversion)
             */
            override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CustomEmailSenderProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty
            ): CustomEmailSenderProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CustomEmailSenderProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AdminCreateUserConfigProperty {
        /**
         * Set to `True` if only the administrator is allowed to create user profiles.
         *
         * Set to `False` if users can sign themselves up via an app.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
         */
        public fun allowAdminCreateUserOnly(): Any? = unwrap(this).getAllowAdminCreateUserOnly()

        /**
         * The message template to be used for the welcome message to new users.
         *
         * See also
         * [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
         */
        public fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

        /**
         * The user account expiration limit, in days, after which a new account that hasn't signed
         * in is no longer usable.
         *
         * To reset the account after that time limit, you must call `AdminCreateUser` again,
         * specifying `"RESEND"` for the `MessageAction` parameter. The default value for this
         * parameter is 7.
         *
         * If you set a value for `TemporaryPasswordValidityDays` in `PasswordPolicy` , that value
         * will be used, and `UnusedAccountValidityDays` will be no longer be an available parameter
         * for that user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
         */
        public fun unusedAccountValidityDays(): Number? =
            unwrap(this).getUnusedAccountValidityDays()

        /** A builder for [AdminCreateUserConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to
             *   create user profiles. Set to `False` if users can sign themselves up via an app.
             */
            public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean)

            /**
             * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to
             *   create user profiles. Set to `False` if users can sign themselves up via an app.
             */
            public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable)

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            public fun inviteMessageTemplate(inviteMessageTemplate: IResolvable)

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            public fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty)

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
            public fun inviteMessageTemplate(
                inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit
            )

            /**
             * @param unusedAccountValidityDays The user account expiration limit, in days, after
             *   which a new account that hasn't signed in is no longer usable. To reset the account
             *   after that time limit, you must call `AdminCreateUser` again, specifying `"RESEND"`
             *   for the `MessageAction` parameter. The default value for this parameter is 7.
             *
             * If you set a value for `TemporaryPasswordValidityDays` in `PasswordPolicy` , that
             * value will be used, and `UnusedAccountValidityDays` will be no longer be an available
             * parameter for that user pool.
             */
            public fun unusedAccountValidityDays(unusedAccountValidityDays: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty
                    .builder()

            /**
             * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to
             *   create user profiles. Set to `False` if users can sign themselves up via an app.
             */
            override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
                cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
            }

            /**
             * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to
             *   create user profiles. Set to `False` if users can sign themselves up via an app.
             */
            override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
                cdkBuilder.allowAdminCreateUserOnly(
                    allowAdminCreateUserOnly.let(IResolvable::unwrap)
                )
            }

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            override fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
                cdkBuilder.inviteMessageTemplate(inviteMessageTemplate.let(IResolvable::unwrap))
            }

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            override fun inviteMessageTemplate(
                inviteMessageTemplate: InviteMessageTemplateProperty
            ) {
                cdkBuilder.inviteMessageTemplate(
                    inviteMessageTemplate.let(InviteMessageTemplateProperty::unwrap)
                )
            }

            /**
             * @param inviteMessageTemplate The message template to be used for the welcome message
             *   to new users. See also
             *   [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
            override fun inviteMessageTemplate(
                inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit
            ): Unit = inviteMessageTemplate(InviteMessageTemplateProperty(inviteMessageTemplate))

            /**
             * @param unusedAccountValidityDays The user account expiration limit, in days, after
             *   which a new account that hasn't signed in is no longer usable. To reset the account
             *   after that time limit, you must call `AdminCreateUser` again, specifying `"RESEND"`
             *   for the `MessageAction` parameter. The default value for this parameter is 7.
             *
             * If you set a value for `TemporaryPasswordValidityDays` in `PasswordPolicy` , that
             * value will be used, and `UnusedAccountValidityDays` will be no longer be an available
             * parameter for that user pool.
             */
            override fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
                cdkBuilder.unusedAccountValidityDays(unusedAccountValidityDays)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty,
        ) : AdminCreateUserConfigProperty {
            /**
             * Set to `True` if only the administrator is allowed to create user profiles.
             *
             * Set to `False` if users can sign themselves up via an app.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
             */
            override fun allowAdminCreateUserOnly(): Any? =
                unwrap(this).getAllowAdminCreateUserOnly()

            /**
             * The message template to be used for the welcome message to new users.
             *
             * See also
             * [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
             */
            override fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

            /**
             * The user account expiration limit, in days, after which a new account that hasn't
             * signed in is no longer usable.
             *
             * To reset the account after that time limit, you must call `AdminCreateUser` again,
             * specifying `"RESEND"` for the `MessageAction` parameter. The default value for this
             * parameter is 7.
             *
             * If you set a value for `TemporaryPasswordValidityDays` in `PasswordPolicy` , that
             * value will be used, and `UnusedAccountValidityDays` will be no longer be an available
             * parameter for that user pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
             */
            override fun unusedAccountValidityDays(): Number? =
                unwrap(this).getUnusedAccountValidityDays()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AdminCreateUserConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty
            ): AdminCreateUserConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AdminCreateUserConfigProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PasswordPolicyProperty {
        /**
         * The minimum length of the password in the policy that you have set.
         *
         * This value can't be less than 6.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
         */
        public fun minimumLength(): Number? = unwrap(this).getMinimumLength()

        /**
         * In the password policy that you have set, refers to whether you have required users to
         * use at least one lowercase letter in their password.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
         */
        public fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

        /**
         * In the password policy that you have set, refers to whether you have required users to
         * use at least one number in their password.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
         */
        public fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

        /**
         * In the password policy that you have set, refers to whether you have required users to
         * use at least one symbol in their password.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
         */
        public fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

        /**
         * In the password policy that you have set, refers to whether you have required users to
         * use at least one uppercase letter in their password.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
         */
        public fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

        /**
         * The number of days a temporary password is valid in the password policy.
         *
         * If the user doesn't sign in during this time, an administrator must reset their password.
         * Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it as a null value
         * and sets `TemporaryPasswordValidityDays` to its default value.
         *
         * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a
         * value for the legacy `UnusedAccountValidityDays` parameter in that user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays)
         */
        public fun temporaryPasswordValidityDays(): Number? =
            unwrap(this).getTemporaryPasswordValidityDays()

        /** A builder for [PasswordPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param minimumLength The minimum length of the password in the policy that you have
             *   set. This value can't be less than 6.
             */
            public fun minimumLength(minimumLength: Number)

            /**
             * @param requireLowercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one lowercase letter in their password.
             */
            public fun requireLowercase(requireLowercase: Boolean)

            /**
             * @param requireLowercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one lowercase letter in their password.
             */
            public fun requireLowercase(requireLowercase: IResolvable)

            /**
             * @param requireNumbers In the password policy that you have set, refers to whether you
             *   have required users to use at least one number in their password.
             */
            public fun requireNumbers(requireNumbers: Boolean)

            /**
             * @param requireNumbers In the password policy that you have set, refers to whether you
             *   have required users to use at least one number in their password.
             */
            public fun requireNumbers(requireNumbers: IResolvable)

            /**
             * @param requireSymbols In the password policy that you have set, refers to whether you
             *   have required users to use at least one symbol in their password.
             */
            public fun requireSymbols(requireSymbols: Boolean)

            /**
             * @param requireSymbols In the password policy that you have set, refers to whether you
             *   have required users to use at least one symbol in their password.
             */
            public fun requireSymbols(requireSymbols: IResolvable)

            /**
             * @param requireUppercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one uppercase letter in their password.
             */
            public fun requireUppercase(requireUppercase: Boolean)

            /**
             * @param requireUppercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one uppercase letter in their password.
             */
            public fun requireUppercase(requireUppercase: IResolvable)

            /**
             * @param temporaryPasswordValidityDays The number of days a temporary password is valid
             *   in the password policy. If the user doesn't sign in during this time, an
             *   administrator must reset their password. Defaults to `7` . If you submit a value of
             *   `0` , Amazon Cognito treats it as a null value and sets
             *   `TemporaryPasswordValidityDays` to its default value.
             *
             * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a
             * value for the legacy `UnusedAccountValidityDays` parameter in that user pool.
             */
            public fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.builder()

            /**
             * @param minimumLength The minimum length of the password in the policy that you have
             *   set. This value can't be less than 6.
             */
            override fun minimumLength(minimumLength: Number) {
                cdkBuilder.minimumLength(minimumLength)
            }

            /**
             * @param requireLowercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one lowercase letter in their password.
             */
            override fun requireLowercase(requireLowercase: Boolean) {
                cdkBuilder.requireLowercase(requireLowercase)
            }

            /**
             * @param requireLowercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one lowercase letter in their password.
             */
            override fun requireLowercase(requireLowercase: IResolvable) {
                cdkBuilder.requireLowercase(requireLowercase.let(IResolvable::unwrap))
            }

            /**
             * @param requireNumbers In the password policy that you have set, refers to whether you
             *   have required users to use at least one number in their password.
             */
            override fun requireNumbers(requireNumbers: Boolean) {
                cdkBuilder.requireNumbers(requireNumbers)
            }

            /**
             * @param requireNumbers In the password policy that you have set, refers to whether you
             *   have required users to use at least one number in their password.
             */
            override fun requireNumbers(requireNumbers: IResolvable) {
                cdkBuilder.requireNumbers(requireNumbers.let(IResolvable::unwrap))
            }

            /**
             * @param requireSymbols In the password policy that you have set, refers to whether you
             *   have required users to use at least one symbol in their password.
             */
            override fun requireSymbols(requireSymbols: Boolean) {
                cdkBuilder.requireSymbols(requireSymbols)
            }

            /**
             * @param requireSymbols In the password policy that you have set, refers to whether you
             *   have required users to use at least one symbol in their password.
             */
            override fun requireSymbols(requireSymbols: IResolvable) {
                cdkBuilder.requireSymbols(requireSymbols.let(IResolvable::unwrap))
            }

            /**
             * @param requireUppercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one uppercase letter in their password.
             */
            override fun requireUppercase(requireUppercase: Boolean) {
                cdkBuilder.requireUppercase(requireUppercase)
            }

            /**
             * @param requireUppercase In the password policy that you have set, refers to whether
             *   you have required users to use at least one uppercase letter in their password.
             */
            override fun requireUppercase(requireUppercase: IResolvable) {
                cdkBuilder.requireUppercase(requireUppercase.let(IResolvable::unwrap))
            }

            /**
             * @param temporaryPasswordValidityDays The number of days a temporary password is valid
             *   in the password policy. If the user doesn't sign in during this time, an
             *   administrator must reset their password. Defaults to `7` . If you submit a value of
             *   `0` , Amazon Cognito treats it as a null value and sets
             *   `TemporaryPasswordValidityDays` to its default value.
             *
             * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a
             * value for the legacy `UnusedAccountValidityDays` parameter in that user pool.
             */
            override fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
                cdkBuilder.temporaryPasswordValidityDays(temporaryPasswordValidityDays)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty,
        ) : PasswordPolicyProperty {
            /**
             * The minimum length of the password in the policy that you have set.
             *
             * This value can't be less than 6.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
             */
            override fun minimumLength(): Number? = unwrap(this).getMinimumLength()

            /**
             * In the password policy that you have set, refers to whether you have required users
             * to use at least one lowercase letter in their password.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
             */
            override fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

            /**
             * In the password policy that you have set, refers to whether you have required users
             * to use at least one number in their password.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
             */
            override fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

            /**
             * In the password policy that you have set, refers to whether you have required users
             * to use at least one symbol in their password.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
             */
            override fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

            /**
             * In the password policy that you have set, refers to whether you have required users
             * to use at least one uppercase letter in their password.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
             */
            override fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

            /**
             * The number of days a temporary password is valid in the password policy.
             *
             * If the user doesn't sign in during this time, an administrator must reset their
             * password. Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it
             * as a null value and sets `TemporaryPasswordValidityDays` to its default value.
             *
             * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a
             * value for the legacy `UnusedAccountValidityDays` parameter in that user pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays)
             */
            override fun temporaryPasswordValidityDays(): Number? =
                unwrap(this).getTemporaryPasswordValidityDays()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PasswordPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty
            ): PasswordPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PasswordPolicyProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StringAttributeConstraintsProperty {
        /**
         * The maximum length.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
         */
        public fun maxLength(): String? = unwrap(this).getMaxLength()

        /**
         * The minimum length.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
         */
        public fun minLength(): String? = unwrap(this).getMinLength()

        /** A builder for [StringAttributeConstraintsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param maxLength The maximum length. */
            public fun maxLength(maxLength: String)

            /** @param minLength The minimum length. */
            public fun minLength(minLength: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool
                    .StringAttributeConstraintsProperty
                    .builder()

            /** @param maxLength The maximum length. */
            override fun maxLength(maxLength: String) {
                cdkBuilder.maxLength(maxLength)
            }

            /** @param minLength The minimum length. */
            override fun minLength(minLength: String) {
                cdkBuilder.minLength(minLength)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty,
        ) : StringAttributeConstraintsProperty {
            /**
             * The maximum length.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
             */
            override fun maxLength(): String? = unwrap(this).getMaxLength()

            /**
             * The minimum length.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
             */
            override fun minLength(): String? = unwrap(this).getMinLength()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): StringAttributeConstraintsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty
            ): StringAttributeConstraintsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StringAttributeConstraintsProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DeviceConfigurationProperty {
        /**
         * When true, a remembered device can sign in with device authentication instead of SMS and
         * time-based one-time password (TOTP) factors for multi-factor authentication (MFA).
         *
         * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
         * that have not been confirmed or remembered must still provide a second factor in a user
         * pool that requires MFA.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
         */
        public fun challengeRequiredOnNewDevice(): Any? =
            unwrap(this).getChallengeRequiredOnNewDevice()

        /**
         * When true, Amazon Cognito doesn't automatically remember a user's device when your app
         * sends a
         * [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
         * API request. In your app, create a prompt for your user to choose whether they want to
         * remember their device. Return the user's choice in an
         * [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
         * API request.
         *
         * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
         * devices that you register in a `ConfirmDevice` API request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
         */
        public fun deviceOnlyRememberedOnUserPrompt(): Any? =
            unwrap(this).getDeviceOnlyRememberedOnUserPrompt()

        /** A builder for [DeviceConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with
             *   device authentication instead of SMS and time-based one-time password (TOTP)
             *   factors for multi-factor authentication (MFA).
             *
             * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
             * that have not been confirmed or remembered must still provide a second factor in a
             * user pool that requires MFA.
             */
            public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean)

            /**
             * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with
             *   device authentication instead of SMS and time-based one-time password (TOTP)
             *   factors for multi-factor authentication (MFA).
             *
             * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
             * that have not been confirmed or remembered must still provide a second factor in a
             * user pool that requires MFA.
             */
            public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable)

            /**
             * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't
             *   automatically remember a user's device when your app sends a
             *   [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
             *   API request. In your app, create a prompt for your user to choose whether they want
             *   to remember their device. Return the user's choice in an
             *   [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
             *   API request. When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito
             *   immediately remembers devices that you register in a `ConfirmDevice` API request.
             */
            public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean)

            /**
             * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't
             *   automatically remember a user's device when your app sends a
             *   [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
             *   API request. In your app, create a prompt for your user to choose whether they want
             *   to remember their device. Return the user's choice in an
             *   [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
             *   API request. When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito
             *   immediately remembers devices that you register in a `ConfirmDevice` API request.
             */
            public fun deviceOnlyRememberedOnUserPrompt(
                deviceOnlyRememberedOnUserPrompt: IResolvable
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty
                    .builder()

            /**
             * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with
             *   device authentication instead of SMS and time-based one-time password (TOTP)
             *   factors for multi-factor authentication (MFA).
             *
             * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
             * that have not been confirmed or remembered must still provide a second factor in a
             * user pool that requires MFA.
             */
            override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
                cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
            }

            /**
             * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with
             *   device authentication instead of SMS and time-based one-time password (TOTP)
             *   factors for multi-factor authentication (MFA).
             *
             * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
             * that have not been confirmed or remembered must still provide a second factor in a
             * user pool that requires MFA.
             */
            override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
                cdkBuilder.challengeRequiredOnNewDevice(
                    challengeRequiredOnNewDevice.let(IResolvable::unwrap)
                )
            }

            /**
             * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't
             *   automatically remember a user's device when your app sends a
             *   [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
             *   API request. In your app, create a prompt for your user to choose whether they want
             *   to remember their device. Return the user's choice in an
             *   [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
             *   API request. When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito
             *   immediately remembers devices that you register in a `ConfirmDevice` API request.
             */
            override fun deviceOnlyRememberedOnUserPrompt(
                deviceOnlyRememberedOnUserPrompt: Boolean
            ) {
                cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
            }

            /**
             * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't
             *   automatically remember a user's device when your app sends a
             *   [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
             *   API request. In your app, create a prompt for your user to choose whether they want
             *   to remember their device. Return the user's choice in an
             *   [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
             *   API request. When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito
             *   immediately remembers devices that you register in a `ConfirmDevice` API request.
             */
            override fun deviceOnlyRememberedOnUserPrompt(
                deviceOnlyRememberedOnUserPrompt: IResolvable
            ) {
                cdkBuilder.deviceOnlyRememberedOnUserPrompt(
                    deviceOnlyRememberedOnUserPrompt.let(IResolvable::unwrap)
                )
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty,
        ) : DeviceConfigurationProperty {
            /**
             * When true, a remembered device can sign in with device authentication instead of SMS
             * and time-based one-time password (TOTP) factors for multi-factor authentication
             * (MFA).
             *
             * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices
             * that have not been confirmed or remembered must still provide a second factor in a
             * user pool that requires MFA.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
             */
            override fun challengeRequiredOnNewDevice(): Any? =
                unwrap(this).getChallengeRequiredOnNewDevice()

            /**
             * When true, Amazon Cognito doesn't automatically remember a user's device when your
             * app sends a
             * [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
             * API request. In your app, create a prompt for your user to choose whether they want
             * to remember their device. Return the user's choice in an
             * [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
             * API request.
             *
             * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately
             * remembers devices that you register in a `ConfirmDevice` API request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
             */
            override fun deviceOnlyRememberedOnUserPrompt(): Any? =
                unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DeviceConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty
            ): DeviceConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DeviceConfigurationProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PoliciesProperty {
        /**
         * The password policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
         */
        public fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()

        /** A builder for [PoliciesProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param passwordPolicy The password policy. */
            public fun passwordPolicy(passwordPolicy: IResolvable)

            /** @param passwordPolicy The password policy. */
            public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty)

            /** @param passwordPolicy The password policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
            public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.builder()

            /** @param passwordPolicy The password policy. */
            override fun passwordPolicy(passwordPolicy: IResolvable) {
                cdkBuilder.passwordPolicy(passwordPolicy.let(IResolvable::unwrap))
            }

            /** @param passwordPolicy The password policy. */
            override fun passwordPolicy(passwordPolicy: PasswordPolicyProperty) {
                cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicyProperty::unwrap))
            }

            /** @param passwordPolicy The password policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
            override fun passwordPolicy(
                passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit
            ): Unit = passwordPolicy(PasswordPolicyProperty(passwordPolicy))

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty,
        ) : PoliciesProperty {
            /**
             * The password policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
             */
            override fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PoliciesProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty
            ): PoliciesProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PoliciesProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SchemaAttributeProperty {
        /**
         * The data format of the values for your attribute.
         *
         * When you choose an `AttributeDataType` , Amazon Cognito validates the input against the
         * data type. A custom attribute value in your user's ID token is always a string, for
         * example `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
         */
        public fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

        /**
         * We recommend that you use
         * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
         * in the user pool client to control how attributes can be mutated for new use cases
         * instead of using `DeveloperOnlyAttribute` .
         *
         * Specifies whether the attribute type is developer only. This attribute can only be
         * modified by an administrator. Users will not be able to modify this attribute using their
         * access token.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
         */
        public fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

        /**
         * Specifies whether the value of the attribute can be changed.
         *
         * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
         * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in
         * to your application through an IdP. If an attribute is immutable, Amazon Cognito throws
         * an error when it attempts to update the attribute. For more information, see
         * [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
         */
        public fun mutable(): Any? = unwrap(this).getMutable()

        /**
         * The name of your user pool attribute.
         *
         * When you create or update a user pool, adding a schema attribute creates a custom or
         * developer-only attribute. When you add an attribute with a `Name` value of `MyAttribute`
         * , Amazon Cognito creates the custom attribute `custom:MyAttribute` . When
         * `DeveloperOnlyAttribute` is `true` , Amazon Cognito creates your attribute as
         * `dev:MyAttribute` . In an operation that describes a user pool, Amazon Cognito returns
         * this value as `value` for standard attributes, `custom:value` for custom attributes, and
         * `dev:value` for developer-only attributes..
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * Specifies the constraints for an attribute of the number type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
         */
        public fun numberAttributeConstraints(): Any? = unwrap(this).getNumberAttributeConstraints()

        /**
         * Specifies whether a user pool attribute is required.
         *
         * If the attribute is required and the user doesn't provide a value, registration or
         * sign-in will fail.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
         */
        public fun required(): Any? = unwrap(this).getRequired()

        /**
         * Specifies the constraints for an attribute of the string type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
         */
        public fun stringAttributeConstraints(): Any? = unwrap(this).getStringAttributeConstraints()

        /** A builder for [SchemaAttributeProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param attributeDataType The data format of the values for your attribute. When you
             *   choose an `AttributeDataType` , Amazon Cognito validates the input against the data
             *   type. A custom attribute value in your user's ID token is always a string, for
             *   example `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
             */
            public fun attributeDataType(attributeDataType: String)

            /**
             * @param developerOnlyAttribute We recommend that you use
             *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
             *   in the user pool client to control how attributes can be mutated for new use cases
             *   instead of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is
             *   developer only. This attribute can only be modified by an administrator. Users will
             *   not be able to modify this attribute using their access token.
             */
            public fun developerOnlyAttribute(developerOnlyAttribute: Boolean)

            /**
             * @param developerOnlyAttribute We recommend that you use
             *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
             *   in the user pool client to control how attributes can be mutated for new use cases
             *   instead of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is
             *   developer only. This attribute can only be modified by an administrator. Users will
             *   not be able to modify this attribute using their access token.
             */
            public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable)

            /**
             * @param mutable Specifies whether the value of the attribute can be changed. Any user
             *   pool attribute whose value you map from an IdP attribute must be mutable, with a
             *   parameter value of `true` . Amazon Cognito updates mapped attributes when users
             *   sign in to your application through an IdP. If an attribute is immutable, Amazon
             *   Cognito throws an error when it attempts to update the attribute. For more
             *   information, see
             *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
             *   .
             */
            public fun mutable(mutable: Boolean)

            /**
             * @param mutable Specifies whether the value of the attribute can be changed. Any user
             *   pool attribute whose value you map from an IdP attribute must be mutable, with a
             *   parameter value of `true` . Amazon Cognito updates mapped attributes when users
             *   sign in to your application through an IdP. If an attribute is immutable, Amazon
             *   Cognito throws an error when it attempts to update the attribute. For more
             *   information, see
             *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
             *   .
             */
            public fun mutable(mutable: IResolvable)

            /**
             * @param name The name of your user pool attribute. When you create or update a user
             *   pool, adding a schema attribute creates a custom or developer-only attribute. When
             *   you add an attribute with a `Name` value of `MyAttribute` , Amazon Cognito creates
             *   the custom attribute `custom:MyAttribute` . When `DeveloperOnlyAttribute` is `true`
             *   , Amazon Cognito creates your attribute as `dev:MyAttribute` . In an operation that
             *   describes a user pool, Amazon Cognito returns this value as `value` for standard
             *   attributes, `custom:value` for custom attributes, and `dev:value` for
             *   developer-only attributes..
             */
            public fun name(name: String)

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable)

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            public fun numberAttributeConstraints(
                numberAttributeConstraints: NumberAttributeConstraintsProperty
            )

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
            public fun numberAttributeConstraints(
                numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit
            )

            /**
             * @param required Specifies whether a user pool attribute is required. If the attribute
             *   is required and the user doesn't provide a value, registration or sign-in will
             *   fail.
             */
            public fun required(required: Boolean)

            /**
             * @param required Specifies whether a user pool attribute is required. If the attribute
             *   is required and the user doesn't provide a value, registration or sign-in will
             *   fail.
             */
            public fun required(required: IResolvable)

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable)

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            public fun stringAttributeConstraints(
                stringAttributeConstraints: StringAttributeConstraintsProperty
            )

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
            public fun stringAttributeConstraints(
                stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty
                    .builder()

            /**
             * @param attributeDataType The data format of the values for your attribute. When you
             *   choose an `AttributeDataType` , Amazon Cognito validates the input against the data
             *   type. A custom attribute value in your user's ID token is always a string, for
             *   example `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
             */
            override fun attributeDataType(attributeDataType: String) {
                cdkBuilder.attributeDataType(attributeDataType)
            }

            /**
             * @param developerOnlyAttribute We recommend that you use
             *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
             *   in the user pool client to control how attributes can be mutated for new use cases
             *   instead of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is
             *   developer only. This attribute can only be modified by an administrator. Users will
             *   not be able to modify this attribute using their access token.
             */
            override fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
                cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
            }

            /**
             * @param developerOnlyAttribute We recommend that you use
             *   [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
             *   in the user pool client to control how attributes can be mutated for new use cases
             *   instead of using `DeveloperOnlyAttribute` . Specifies whether the attribute type is
             *   developer only. This attribute can only be modified by an administrator. Users will
             *   not be able to modify this attribute using their access token.
             */
            override fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
                cdkBuilder.developerOnlyAttribute(developerOnlyAttribute.let(IResolvable::unwrap))
            }

            /**
             * @param mutable Specifies whether the value of the attribute can be changed. Any user
             *   pool attribute whose value you map from an IdP attribute must be mutable, with a
             *   parameter value of `true` . Amazon Cognito updates mapped attributes when users
             *   sign in to your application through an IdP. If an attribute is immutable, Amazon
             *   Cognito throws an error when it attempts to update the attribute. For more
             *   information, see
             *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
             *   .
             */
            override fun mutable(mutable: Boolean) {
                cdkBuilder.mutable(mutable)
            }

            /**
             * @param mutable Specifies whether the value of the attribute can be changed. Any user
             *   pool attribute whose value you map from an IdP attribute must be mutable, with a
             *   parameter value of `true` . Amazon Cognito updates mapped attributes when users
             *   sign in to your application through an IdP. If an attribute is immutable, Amazon
             *   Cognito throws an error when it attempts to update the attribute. For more
             *   information, see
             *   [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
             *   .
             */
            override fun mutable(mutable: IResolvable) {
                cdkBuilder.mutable(mutable.let(IResolvable::unwrap))
            }

            /**
             * @param name The name of your user pool attribute. When you create or update a user
             *   pool, adding a schema attribute creates a custom or developer-only attribute. When
             *   you add an attribute with a `Name` value of `MyAttribute` , Amazon Cognito creates
             *   the custom attribute `custom:MyAttribute` . When `DeveloperOnlyAttribute` is `true`
             *   , Amazon Cognito creates your attribute as `dev:MyAttribute` . In an operation that
             *   describes a user pool, Amazon Cognito returns this value as `value` for standard
             *   attributes, `custom:value` for custom attributes, and `dev:value` for
             *   developer-only attributes..
             */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            override fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
                cdkBuilder.numberAttributeConstraints(
                    numberAttributeConstraints.let(IResolvable::unwrap)
                )
            }

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            override fun numberAttributeConstraints(
                numberAttributeConstraints: NumberAttributeConstraintsProperty
            ) {
                cdkBuilder.numberAttributeConstraints(
                    numberAttributeConstraints.let(NumberAttributeConstraintsProperty::unwrap)
                )
            }

            /**
             * @param numberAttributeConstraints Specifies the constraints for an attribute of the
             *   number type.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
            override fun numberAttributeConstraints(
                numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit
            ): Unit =
                numberAttributeConstraints(
                    NumberAttributeConstraintsProperty(numberAttributeConstraints)
                )

            /**
             * @param required Specifies whether a user pool attribute is required. If the attribute
             *   is required and the user doesn't provide a value, registration or sign-in will
             *   fail.
             */
            override fun required(required: Boolean) {
                cdkBuilder.required(required)
            }

            /**
             * @param required Specifies whether a user pool attribute is required. If the attribute
             *   is required and the user doesn't provide a value, registration or sign-in will
             *   fail.
             */
            override fun required(required: IResolvable) {
                cdkBuilder.required(required.let(IResolvable::unwrap))
            }

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            override fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
                cdkBuilder.stringAttributeConstraints(
                    stringAttributeConstraints.let(IResolvable::unwrap)
                )
            }

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            override fun stringAttributeConstraints(
                stringAttributeConstraints: StringAttributeConstraintsProperty
            ) {
                cdkBuilder.stringAttributeConstraints(
                    stringAttributeConstraints.let(StringAttributeConstraintsProperty::unwrap)
                )
            }

            /**
             * @param stringAttributeConstraints Specifies the constraints for an attribute of the
             *   string type.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
            override fun stringAttributeConstraints(
                stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit
            ): Unit =
                stringAttributeConstraints(
                    StringAttributeConstraintsProperty(stringAttributeConstraints)
                )

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty,
        ) : SchemaAttributeProperty {
            /**
             * The data format of the values for your attribute.
             *
             * When you choose an `AttributeDataType` , Amazon Cognito validates the input against
             * the data type. A custom attribute value in your user's ID token is always a string,
             * for example `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
             */
            override fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

            /**
             * We recommend that you use
             * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
             * in the user pool client to control how attributes can be mutated for new use cases
             * instead of using `DeveloperOnlyAttribute` .
             *
             * Specifies whether the attribute type is developer only. This attribute can only be
             * modified by an administrator. Users will not be able to modify this attribute using
             * their access token.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
             */
            override fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

            /**
             * Specifies whether the value of the attribute can be changed.
             *
             * Any user pool attribute whose value you map from an IdP attribute must be mutable,
             * with a parameter value of `true` . Amazon Cognito updates mapped attributes when
             * users sign in to your application through an IdP. If an attribute is immutable,
             * Amazon Cognito throws an error when it attempts to update the attribute. For more
             * information, see
             * [Specifying Identity Provider Attribute Mappings for Your User Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
             */
            override fun mutable(): Any? = unwrap(this).getMutable()

            /**
             * The name of your user pool attribute.
             *
             * When you create or update a user pool, adding a schema attribute creates a custom or
             * developer-only attribute. When you add an attribute with a `Name` value of
             * `MyAttribute` , Amazon Cognito creates the custom attribute `custom:MyAttribute` .
             * When `DeveloperOnlyAttribute` is `true` , Amazon Cognito creates your attribute as
             * `dev:MyAttribute` . In an operation that describes a user pool, Amazon Cognito
             * returns this value as `value` for standard attributes, `custom:value` for custom
             * attributes, and `dev:value` for developer-only attributes..
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * Specifies the constraints for an attribute of the number type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
             */
            override fun numberAttributeConstraints(): Any? =
                unwrap(this).getNumberAttributeConstraints()

            /**
             * Specifies whether a user pool attribute is required.
             *
             * If the attribute is required and the user doesn't provide a value, registration or
             * sign-in will fail.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
             */
            override fun required(): Any? = unwrap(this).getRequired()

            /**
             * Specifies the constraints for an attribute of the string type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
             */
            override fun stringAttributeConstraints(): Any? =
                unwrap(this).getStringAttributeConstraints()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SchemaAttributeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty
            ): SchemaAttributeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SchemaAttributeProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AccountRecoverySettingProperty {
        /**
         * The list of `RecoveryOptionTypes` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms)
         */
        public fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()

        /** A builder for [AccountRecoverySettingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            public fun recoveryMechanisms(recoveryMechanisms: IResolvable)

            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            public fun recoveryMechanisms(recoveryMechanisms: List<Any>)

            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            public fun recoveryMechanisms(vararg recoveryMechanisms: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty
                    .builder()

            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            override fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
                cdkBuilder.recoveryMechanisms(recoveryMechanisms.let(IResolvable::unwrap))
            }

            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            override fun recoveryMechanisms(recoveryMechanisms: List<Any>) {
                cdkBuilder.recoveryMechanisms(recoveryMechanisms)
            }

            /** @param recoveryMechanisms The list of `RecoveryOptionTypes` . */
            override fun recoveryMechanisms(vararg recoveryMechanisms: Any): Unit =
                recoveryMechanisms(recoveryMechanisms.toList())

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty,
        ) : AccountRecoverySettingProperty {
            /**
             * The list of `RecoveryOptionTypes` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms)
             */
            override fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AccountRecoverySettingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty
            ): AccountRecoverySettingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AccountRecoverySettingProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface NumberAttributeConstraintsProperty {
        /**
         * The maximum value of an attribute that is of the number data type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
         */
        public fun maxValue(): String? = unwrap(this).getMaxValue()

        /**
         * The minimum value of an attribute that is of the number data type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
         */
        public fun minValue(): String? = unwrap(this).getMinValue()

        /** A builder for [NumberAttributeConstraintsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param maxValue The maximum value of an attribute that is of the number data type.
             */
            public fun maxValue(maxValue: String)

            /**
             * @param minValue The minimum value of an attribute that is of the number data type.
             */
            public fun minValue(minValue: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool
                    .NumberAttributeConstraintsProperty
                    .builder()

            /**
             * @param maxValue The maximum value of an attribute that is of the number data type.
             */
            override fun maxValue(maxValue: String) {
                cdkBuilder.maxValue(maxValue)
            }

            /**
             * @param minValue The minimum value of an attribute that is of the number data type.
             */
            override fun minValue(minValue: String) {
                cdkBuilder.minValue(minValue)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty,
        ) : NumberAttributeConstraintsProperty {
            /**
             * The maximum value of an attribute that is of the number data type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
             */
            override fun maxValue(): String? = unwrap(this).getMaxValue()

            /**
             * The minimum value of an attribute that is of the number data type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
             */
            override fun minValue(): String? = unwrap(this).getMinValue()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): NumberAttributeConstraintsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty
            ): NumberAttributeConstraintsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: NumberAttributeConstraintsProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SmsConfigurationProperty {
        /**
         * The external ID is a value.
         *
         * We recommend you use `ExternalId` to add security to your IAM role, which is used to call
         * Amazon SNS to send SMS messages for your user pool. If you provide an `ExternalId` , the
         * Cognito User Pool uses it when attempting to assume your IAM role. You can also set your
         * roles trust policy to require the `ExternalID` . If you use the Cognito Management
         * Console to create a role for SMS MFA, Cognito creates a role with the required
         * permissions and a trust policy that uses `ExternalId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
         */
        public fun externalId(): String? = unwrap(this).getExternalId()

        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS caller.
         *
         * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
         * SMS messages. SMS messages are subject to a
         * [spending limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
         */
        public fun snsCallerArn(): String? = unwrap(this).getSnsCallerArn()

        /**
         * The AWS Region to use with Amazon SNS integration.
         *
         * You can choose the same Region as your user pool, or a supported *Legacy Amazon SNS
         * alternate Region* .
         *
         * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS
         * configuration in the Asia Pacific (Tokyo) Region. For more information, see
         * [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snsregion)
         */
        public fun snsRegion(): String? = unwrap(this).getSnsRegion()

        /** A builder for [SmsConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param externalId The external ID is a value. We recommend you use `ExternalId` to
             *   add security to your IAM role, which is used to call Amazon SNS to send SMS
             *   messages for your user pool. If you provide an `ExternalId` , the Cognito User Pool
             *   uses it when attempting to assume your IAM role. You can also set your roles trust
             *   policy to require the `ExternalID` . If you use the Cognito Management Console to
             *   create a role for SMS MFA, Cognito creates a role with the required permissions and
             *   a trust policy that uses `ExternalId` .
             */
            public fun externalId(externalId: String)

            /**
             * @param snsCallerArn The Amazon Resource Name (ARN) of the Amazon SNS caller. This is
             *   the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
             *   SMS messages. SMS messages are subject to a
             *   [spending limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
             *   .
             */
            public fun snsCallerArn(snsCallerArn: String)

            /**
             * @param snsRegion The AWS Region to use with Amazon SNS integration. You can choose
             *   the same Region as your user pool, or a supported *Legacy Amazon SNS alternate
             *   Region* .
             *
             * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon
             * SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see
             * [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
             * .
             */
            public fun snsRegion(snsRegion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty
                    .builder()

            /**
             * @param externalId The external ID is a value. We recommend you use `ExternalId` to
             *   add security to your IAM role, which is used to call Amazon SNS to send SMS
             *   messages for your user pool. If you provide an `ExternalId` , the Cognito User Pool
             *   uses it when attempting to assume your IAM role. You can also set your roles trust
             *   policy to require the `ExternalID` . If you use the Cognito Management Console to
             *   create a role for SMS MFA, Cognito creates a role with the required permissions and
             *   a trust policy that uses `ExternalId` .
             */
            override fun externalId(externalId: String) {
                cdkBuilder.externalId(externalId)
            }

            /**
             * @param snsCallerArn The Amazon Resource Name (ARN) of the Amazon SNS caller. This is
             *   the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
             *   SMS messages. SMS messages are subject to a
             *   [spending limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
             *   .
             */
            override fun snsCallerArn(snsCallerArn: String) {
                cdkBuilder.snsCallerArn(snsCallerArn)
            }

            /**
             * @param snsRegion The AWS Region to use with Amazon SNS integration. You can choose
             *   the same Region as your user pool, or a supported *Legacy Amazon SNS alternate
             *   Region* .
             *
             * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon
             * SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see
             * [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
             * .
             */
            override fun snsRegion(snsRegion: String) {
                cdkBuilder.snsRegion(snsRegion)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty,
        ) : SmsConfigurationProperty {
            /**
             * The external ID is a value.
             *
             * We recommend you use `ExternalId` to add security to your IAM role, which is used to
             * call Amazon SNS to send SMS messages for your user pool. If you provide an
             * `ExternalId` , the Cognito User Pool uses it when attempting to assume your IAM role.
             * You can also set your roles trust policy to require the `ExternalID` . If you use the
             * Cognito Management Console to create a role for SMS MFA, Cognito creates a role with
             * the required permissions and a trust policy that uses `ExternalId` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
             */
            override fun externalId(): String? = unwrap(this).getExternalId()

            /**
             * The Amazon Resource Name (ARN) of the Amazon SNS caller.
             *
             * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to
             * send SMS messages. SMS messages are subject to a
             * [spending limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
             */
            override fun snsCallerArn(): String? = unwrap(this).getSnsCallerArn()

            /**
             * The AWS Region to use with Amazon SNS integration.
             *
             * You can choose the same Region as your user pool, or a supported *Legacy Amazon SNS
             * alternate Region* .
             *
             * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon
             * SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see
             * [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snsregion)
             */
            override fun snsRegion(): String? = unwrap(this).getSnsRegion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SmsConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty
            ): SmsConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SmsConfigurationProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CustomSMSSenderProperty {
        /**
         * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito triggers to
         * send SMS notifications to users.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaarn)
         */
        public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

        /**
         * The Lambda version represents the signature of the "request" attribute in the "event"
         * information Amazon Cognito passes to your custom SMS sender Lambda function.
         *
         * The only supported value is `V1_0` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaversion)
         */
        public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

        /** A builder for [CustomSMSSenderProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that
             *   Amazon Cognito triggers to send SMS notifications to users.
             */
            public fun lambdaArn(lambdaArn: String)

            /**
             * @param lambdaVersion The Lambda version represents the signature of the "request"
             *   attribute in the "event" information Amazon Cognito passes to your custom SMS
             *   sender Lambda function. The only supported value is `V1_0` .
             */
            public fun lambdaVersion(lambdaVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty
                    .builder()

            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that
             *   Amazon Cognito triggers to send SMS notifications to users.
             */
            override fun lambdaArn(lambdaArn: String) {
                cdkBuilder.lambdaArn(lambdaArn)
            }

            /**
             * @param lambdaVersion The Lambda version represents the signature of the "request"
             *   attribute in the "event" information Amazon Cognito passes to your custom SMS
             *   sender Lambda function. The only supported value is `V1_0` .
             */
            override fun lambdaVersion(lambdaVersion: String) {
                cdkBuilder.lambdaVersion(lambdaVersion)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty,
        ) : CustomSMSSenderProperty {
            /**
             * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito
             * triggers to send SMS notifications to users.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaarn)
             */
            override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

            /**
             * The Lambda version represents the signature of the "request" attribute in the "event"
             * information Amazon Cognito passes to your custom SMS sender Lambda function.
             *
             * The only supported value is `V1_0` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaversion)
             */
            override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CustomSMSSenderProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty
            ): CustomSMSSenderProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CustomSMSSenderProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VerificationMessageTemplateProperty {
        /**
         * The default email option.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption)
         */
        public fun defaultEmailOption(): String? = unwrap(this).getDefaultEmailOption()

        /**
         * The template for email messages that Amazon Cognito sends to your users.
         *
         * You can set an `EmailMessage` template only if the value of
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` . When your
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage)
         */
        public fun emailMessage(): String? = unwrap(this).getEmailMessage()

        /**
         * The email message template for sending a confirmation link to the user.
         *
         * You can set an `EmailMessageByLink` template only if the value of
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` . When your
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink)
         */
        public fun emailMessageByLink(): String? = unwrap(this).getEmailMessageByLink()

        /**
         * The subject line for the email message template.
         *
         * You can set an `EmailSubject` template only if the value of
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` . When your
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject)
         */
        public fun emailSubject(): String? = unwrap(this).getEmailSubject()

        /**
         * The subject line for the email message template for sending a confirmation link to the
         * user.
         *
         * You can set an `EmailSubjectByLink` template only if the value of
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` . When your
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink)
         */
        public fun emailSubjectByLink(): String? = unwrap(this).getEmailSubjectByLink()

        /**
         * The template for SMS messages that Amazon Cognito sends to your users.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage)
         */
        public fun smsMessage(): String? = unwrap(this).getSmsMessage()

        /** A builder for [VerificationMessageTemplateProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param defaultEmailOption The default email option. */
            public fun defaultEmailOption(defaultEmailOption: String)

            /**
             * @param emailMessage The template for email messages that Amazon Cognito sends to your
             *   users. You can set an `EmailMessage` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            public fun emailMessage(emailMessage: String)

            /**
             * @param emailMessageByLink The email message template for sending a confirmation link
             *   to the user. You can set an `EmailMessageByLink` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            public fun emailMessageByLink(emailMessageByLink: String)

            /**
             * @param emailSubject The subject line for the email message template. You can set an
             *   `EmailSubject` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            public fun emailSubject(emailSubject: String)

            /**
             * @param emailSubjectByLink The subject line for the email message template for sending
             *   a confirmation link to the user. You can set an `EmailSubjectByLink` template only
             *   if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            public fun emailSubjectByLink(emailSubjectByLink: String)

            /**
             * @param smsMessage The template for SMS messages that Amazon Cognito sends to your
             *   users.
             */
            public fun smsMessage(smsMessage: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool
                    .VerificationMessageTemplateProperty
                    .builder()

            /** @param defaultEmailOption The default email option. */
            override fun defaultEmailOption(defaultEmailOption: String) {
                cdkBuilder.defaultEmailOption(defaultEmailOption)
            }

            /**
             * @param emailMessage The template for email messages that Amazon Cognito sends to your
             *   users. You can set an `EmailMessage` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            override fun emailMessage(emailMessage: String) {
                cdkBuilder.emailMessage(emailMessage)
            }

            /**
             * @param emailMessageByLink The email message template for sending a confirmation link
             *   to the user. You can set an `EmailMessageByLink` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            override fun emailMessageByLink(emailMessageByLink: String) {
                cdkBuilder.emailMessageByLink(emailMessageByLink)
            }

            /**
             * @param emailSubject The subject line for the email message template. You can set an
             *   `EmailSubject` template only if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            override fun emailSubject(emailSubject: String) {
                cdkBuilder.emailSubject(emailSubject)
            }

            /**
             * @param emailSubjectByLink The subject line for the email message template for sending
             *   a confirmation link to the user. You can set an `EmailSubjectByLink` template only
             *   if the value of
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` . When your
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             *   configuration.
             */
            override fun emailSubjectByLink(emailSubjectByLink: String) {
                cdkBuilder.emailSubjectByLink(emailSubjectByLink)
            }

            /**
             * @param smsMessage The template for SMS messages that Amazon Cognito sends to your
             *   users.
             */
            override fun smsMessage(smsMessage: String) {
                cdkBuilder.smsMessage(smsMessage)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty,
        ) : VerificationMessageTemplateProperty {
            /**
             * The default email option.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-defaultemailoption)
             */
            override fun defaultEmailOption(): String? = unwrap(this).getDefaultEmailOption()

            /**
             * The template for email messages that Amazon Cognito sends to your users.
             *
             * You can set an `EmailMessage` template only if the value of
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` . When your
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessage)
             */
            override fun emailMessage(): String? = unwrap(this).getEmailMessage()

            /**
             * The email message template for sending a confirmation link to the user.
             *
             * You can set an `EmailMessageByLink` template only if the value of
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` . When your
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailmessagebylink)
             */
            override fun emailMessageByLink(): String? = unwrap(this).getEmailMessageByLink()

            /**
             * The subject line for the email message template.
             *
             * You can set an `EmailSubject` template only if the value of
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` . When your
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject)
             */
            override fun emailSubject(): String? = unwrap(this).getEmailSubject()

            /**
             * The subject line for the email message template for sending a confirmation link to
             * the user.
             *
             * You can set an `EmailSubjectByLink` template only if the value of
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` . When your
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES
             * configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubjectbylink)
             */
            override fun emailSubjectByLink(): String? = unwrap(this).getEmailSubjectByLink()

            /**
             * The template for SMS messages that Amazon Cognito sends to your users.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-smsmessage)
             */
            override fun smsMessage(): String? = unwrap(this).getSmsMessage()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VerificationMessageTemplateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty
            ): VerificationMessageTemplateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VerificationMessageTemplateProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EmailConfigurationProperty {
        /**
         * The set of configuration rules that can be applied to emails sent using Amazon SES.
         *
         * A configuration set is applied to an email by including a reference to the configuration
         * set in the headers of the email. Once applied, all of the rules in that configuration set
         * are applied to the email. Configuration sets can be used to apply the following types of
         * rules to emails:
         * * Event publishing – Amazon SES can track the number of send, delivery, open, click,
         *   bounce, and complaint events for each email sent. Use event publishing to send
         *   information about these events to other AWS services such as SNS and CloudWatch.
         * * IP pool management – When leasing dedicated IP addresses with Amazon SES, you can
         *   create groups of IP addresses, called dedicated IP pools. You can then associate the
         *   dedicated IP pools with configuration sets.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
         */
        public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

        /**
         * Specifies whether Amazon Cognito uses its built-in functionality to send your users email
         * messages, or uses your Amazon Simple Email Service email configuration.
         *
         * Specify one of the following values:
         * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in email
         *   functionality. When you use the default option, Amazon Cognito allows only a limited
         *   number of emails each day for your user pool. For typical production environments, the
         *   default email limit is less than the required delivery volume. To achieve a higher
         *   delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
         *
         * To look up the email delivery limit for the default option, see
         * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in the
         * *Amazon Cognito Developer Guide* .
         *
         * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the FROM
         * address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address
         * for the `SourceArn` parameter.
         * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
         *   configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your
         *   verified email address. When you use this option, the email delivery limits are the
         *   same limits that apply to your Amazon SES verified email address in your AWS account .
         *
         * If you use this option, provide the ARN of an Amazon SES verified email address for the
         * `SourceArn` parameter.
         *
         * Before Amazon Cognito can email your users, it requires additional permissions to call
         * Amazon SES on your behalf. When you update your user pool with this option, Amazon
         * Cognito creates a *service-linked role* , which is a type of role in your AWS account .
         * This role contains the permissions that allow you to access Amazon SES and send email
         * messages from your email address. For more information about the service-linked role that
         * Amazon Cognito creates, see
         * [Using Service-Linked Roles for Amazon Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
         * in the *Amazon Cognito Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount)
         */
        public fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

        /**
         * Identifies either the sender's email address or the sender's name with their email
         * address.
         *
         * For example, `testuser&#64;example.com` or `Test User &lt;testuser&#64;example.com&gt;` .
         * This address appears before the body of the email.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-from)
         */
        public fun from(): String? = unwrap(this).getFrom()

        /**
         * The destination to which the receiver of the email should reply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
         */
        public fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

        /**
         * The ARN of a verified email address or an address from a verified domain in Amazon SES.
         *
         * You can set a `SourceArn` email from a verified domain only with an API request. You can
         * set a verified email address, but not an address in a verified domain, in the Amazon
         * Cognito console. Amazon Cognito uses the email address that you provide in one of the
         * following ways, depending on the value that you specify for the `EmailSendingAccount`
         * parameter:
         * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom FROM
         *   address when it emails your users using its built-in email account.
         * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
         *   calling Amazon SES on your behalf.
         *
         * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of
         * your user pool. Typically, the Region in the `SourceArn` and the user pool Region are the
         * same. For more information, see
         * [Amazon SES email configuration regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
         * in the
         * [Amazon Cognito Developer Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
         */
        public fun sourceArn(): String? = unwrap(this).getSourceArn()

        /** A builder for [EmailConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param configurationSet The set of configuration rules that can be applied to emails
             *   sent using Amazon SES. A configuration set is applied to an email by including a
             *   reference to the configuration set in the headers of the email. Once applied, all
             *   of the rules in that configuration set are applied to the email. Configuration sets
             *   can be used to apply the following types of rules to emails:
             * * Event publishing – Amazon SES can track the number of send, delivery, open, click,
             *   bounce, and complaint events for each email sent. Use event publishing to send
             *   information about these events to other AWS services such as SNS and CloudWatch.
             * * IP pool management – When leasing dedicated IP addresses with Amazon SES, you can
             *   create groups of IP addresses, called dedicated IP pools. You can then associate
             *   the dedicated IP pools with configuration sets.
             */
            public fun configurationSet(configurationSet: String)

            /**
             * @param emailSendingAccount Specifies whether Amazon Cognito uses its built-in
             *   functionality to send your users email messages, or uses your Amazon Simple Email
             *   Service email configuration. Specify one of the following values:
             * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in
             *   email functionality. When you use the default option, Amazon Cognito allows only a
             *   limited number of emails each day for your user pool. For typical production
             *   environments, the default email limit is less than the required delivery volume. To
             *   achieve a higher delivery volume, specify DEVELOPER to use your Amazon SES email
             *   configuration.
             *
             * To look up the email delivery limit for the default option, see
             * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in
             * the *Amazon Cognito Developer Guide* .
             *
             * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the
             * FROM address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email
             * address for the `SourceArn` parameter.
             * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
             *   configuration. Amazon Cognito calls Amazon SES on your behalf to send email from
             *   your verified email address. When you use this option, the email delivery limits
             *   are the same limits that apply to your Amazon SES verified email address in your
             *   AWS account .
             *
             * If you use this option, provide the ARN of an Amazon SES verified email address for
             * the `SourceArn` parameter.
             *
             * Before Amazon Cognito can email your users, it requires additional permissions to
             * call Amazon SES on your behalf. When you update your user pool with this option,
             * Amazon Cognito creates a *service-linked role* , which is a type of role in your AWS
             * account . This role contains the permissions that allow you to access Amazon SES and
             * send email messages from your email address. For more information about the
             * service-linked role that Amazon Cognito creates, see
             * [Using Service-Linked Roles for Amazon Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
             * in the *Amazon Cognito Developer Guide* .
             */
            public fun emailSendingAccount(emailSendingAccount: String)

            /**
             * @param from Identifies either the sender's email address or the sender's name with
             *   their email address. For example, `testuser&#64;example.com` or `Test User
             *   &lt;testuser&#64;example.com&gt;` . This address appears before the body of the
             *   email.
             */
            public fun from(from: String)

            /**
             * @param replyToEmailAddress The destination to which the receiver of the email should
             *   reply.
             */
            public fun replyToEmailAddress(replyToEmailAddress: String)

            /**
             * @param sourceArn The ARN of a verified email address or an address from a verified
             *   domain in Amazon SES. You can set a `SourceArn` email from a verified domain only
             *   with an API request. You can set a verified email address, but not an address in a
             *   verified domain, in the Amazon Cognito console. Amazon Cognito uses the email
             *   address that you provide in one of the following ways, depending on the value that
             *   you specify for the `EmailSendingAccount` parameter:
             * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom
             *   FROM address when it emails your users using its built-in email account.
             * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
             *   calling Amazon SES on your behalf.
             *
             * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of
             * your user pool. Typically, the Region in the `SourceArn` and the user pool Region are
             * the same. For more information, see
             * [Amazon SES email configuration regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
             * in the
             * [Amazon Cognito Developer Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
             * .
             */
            public fun sourceArn(sourceArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty
                    .builder()

            /**
             * @param configurationSet The set of configuration rules that can be applied to emails
             *   sent using Amazon SES. A configuration set is applied to an email by including a
             *   reference to the configuration set in the headers of the email. Once applied, all
             *   of the rules in that configuration set are applied to the email. Configuration sets
             *   can be used to apply the following types of rules to emails:
             * * Event publishing – Amazon SES can track the number of send, delivery, open, click,
             *   bounce, and complaint events for each email sent. Use event publishing to send
             *   information about these events to other AWS services such as SNS and CloudWatch.
             * * IP pool management – When leasing dedicated IP addresses with Amazon SES, you can
             *   create groups of IP addresses, called dedicated IP pools. You can then associate
             *   the dedicated IP pools with configuration sets.
             */
            override fun configurationSet(configurationSet: String) {
                cdkBuilder.configurationSet(configurationSet)
            }

            /**
             * @param emailSendingAccount Specifies whether Amazon Cognito uses its built-in
             *   functionality to send your users email messages, or uses your Amazon Simple Email
             *   Service email configuration. Specify one of the following values:
             * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in
             *   email functionality. When you use the default option, Amazon Cognito allows only a
             *   limited number of emails each day for your user pool. For typical production
             *   environments, the default email limit is less than the required delivery volume. To
             *   achieve a higher delivery volume, specify DEVELOPER to use your Amazon SES email
             *   configuration.
             *
             * To look up the email delivery limit for the default option, see
             * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in
             * the *Amazon Cognito Developer Guide* .
             *
             * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the
             * FROM address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email
             * address for the `SourceArn` parameter.
             * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
             *   configuration. Amazon Cognito calls Amazon SES on your behalf to send email from
             *   your verified email address. When you use this option, the email delivery limits
             *   are the same limits that apply to your Amazon SES verified email address in your
             *   AWS account .
             *
             * If you use this option, provide the ARN of an Amazon SES verified email address for
             * the `SourceArn` parameter.
             *
             * Before Amazon Cognito can email your users, it requires additional permissions to
             * call Amazon SES on your behalf. When you update your user pool with this option,
             * Amazon Cognito creates a *service-linked role* , which is a type of role in your AWS
             * account . This role contains the permissions that allow you to access Amazon SES and
             * send email messages from your email address. For more information about the
             * service-linked role that Amazon Cognito creates, see
             * [Using Service-Linked Roles for Amazon Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
             * in the *Amazon Cognito Developer Guide* .
             */
            override fun emailSendingAccount(emailSendingAccount: String) {
                cdkBuilder.emailSendingAccount(emailSendingAccount)
            }

            /**
             * @param from Identifies either the sender's email address or the sender's name with
             *   their email address. For example, `testuser&#64;example.com` or `Test User
             *   &lt;testuser&#64;example.com&gt;` . This address appears before the body of the
             *   email.
             */
            override fun from(from: String) {
                cdkBuilder.from(from)
            }

            /**
             * @param replyToEmailAddress The destination to which the receiver of the email should
             *   reply.
             */
            override fun replyToEmailAddress(replyToEmailAddress: String) {
                cdkBuilder.replyToEmailAddress(replyToEmailAddress)
            }

            /**
             * @param sourceArn The ARN of a verified email address or an address from a verified
             *   domain in Amazon SES. You can set a `SourceArn` email from a verified domain only
             *   with an API request. You can set a verified email address, but not an address in a
             *   verified domain, in the Amazon Cognito console. Amazon Cognito uses the email
             *   address that you provide in one of the following ways, depending on the value that
             *   you specify for the `EmailSendingAccount` parameter:
             * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom
             *   FROM address when it emails your users using its built-in email account.
             * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
             *   calling Amazon SES on your behalf.
             *
             * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of
             * your user pool. Typically, the Region in the `SourceArn` and the user pool Region are
             * the same. For more information, see
             * [Amazon SES email configuration regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
             * in the
             * [Amazon Cognito Developer Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
             * .
             */
            override fun sourceArn(sourceArn: String) {
                cdkBuilder.sourceArn(sourceArn)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty,
        ) : EmailConfigurationProperty {
            /**
             * The set of configuration rules that can be applied to emails sent using Amazon SES.
             *
             * A configuration set is applied to an email by including a reference to the
             * configuration set in the headers of the email. Once applied, all of the rules in that
             * configuration set are applied to the email. Configuration sets can be used to apply
             * the following types of rules to emails:
             * * Event publishing – Amazon SES can track the number of send, delivery, open, click,
             *   bounce, and complaint events for each email sent. Use event publishing to send
             *   information about these events to other AWS services such as SNS and CloudWatch.
             * * IP pool management – When leasing dedicated IP addresses with Amazon SES, you can
             *   create groups of IP addresses, called dedicated IP pools. You can then associate
             *   the dedicated IP pools with configuration sets.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
             */
            override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

            /**
             * Specifies whether Amazon Cognito uses its built-in functionality to send your users
             * email messages, or uses your Amazon Simple Email Service email configuration.
             *
             * Specify one of the following values:
             * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in
             *   email functionality. When you use the default option, Amazon Cognito allows only a
             *   limited number of emails each day for your user pool. For typical production
             *   environments, the default email limit is less than the required delivery volume. To
             *   achieve a higher delivery volume, specify DEVELOPER to use your Amazon SES email
             *   configuration.
             *
             * To look up the email delivery limit for the default option, see
             * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in
             * the *Amazon Cognito Developer Guide* .
             *
             * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the
             * FROM address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email
             * address for the `SourceArn` parameter.
             * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
             *   configuration. Amazon Cognito calls Amazon SES on your behalf to send email from
             *   your verified email address. When you use this option, the email delivery limits
             *   are the same limits that apply to your Amazon SES verified email address in your
             *   AWS account .
             *
             * If you use this option, provide the ARN of an Amazon SES verified email address for
             * the `SourceArn` parameter.
             *
             * Before Amazon Cognito can email your users, it requires additional permissions to
             * call Amazon SES on your behalf. When you update your user pool with this option,
             * Amazon Cognito creates a *service-linked role* , which is a type of role in your AWS
             * account . This role contains the permissions that allow you to access Amazon SES and
             * send email messages from your email address. For more information about the
             * service-linked role that Amazon Cognito creates, see
             * [Using Service-Linked Roles for Amazon Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
             * in the *Amazon Cognito Developer Guide* .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount)
             */
            override fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

            /**
             * Identifies either the sender's email address or the sender's name with their email
             * address.
             *
             * For example, `testuser&#64;example.com` or `Test User
             * &lt;testuser&#64;example.com&gt;` . This address appears before the body of the
             * email.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-from)
             */
            override fun from(): String? = unwrap(this).getFrom()

            /**
             * The destination to which the receiver of the email should reply.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
             */
            override fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

            /**
             * The ARN of a verified email address or an address from a verified domain in Amazon
             * SES.
             *
             * You can set a `SourceArn` email from a verified domain only with an API request. You
             * can set a verified email address, but not an address in a verified domain, in the
             * Amazon Cognito console. Amazon Cognito uses the email address that you provide in one
             * of the following ways, depending on the value that you specify for the
             * `EmailSendingAccount` parameter:
             * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom
             *   FROM address when it emails your users using its built-in email account.
             * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
             *   calling Amazon SES on your behalf.
             *
             * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of
             * your user pool. Typically, the Region in the `SourceArn` and the user pool Region are
             * the same. For more information, see
             * [Amazon SES email configuration regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
             * in the
             * [Amazon Cognito Developer Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
             */
            override fun sourceArn(): String? = unwrap(this).getSourceArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EmailConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty
            ): EmailConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EmailConfigurationProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface UsernameConfigurationProperty {
        /**
         * Specifies whether user name case sensitivity will be applied for all users in the user
         * pool through Amazon Cognito APIs.
         *
         * For most use cases, set case sensitivity to `False` (case insensitive) as a best
         * practice. When usernames and email addresses are case insensitive, users can sign in as
         * the same user when they enter a different capitalization of their user name.
         *
         * Valid values include:
         * * **True** - Enables case sensitivity for all username input. When this option is set to
         *   `True` , users must sign in using the exact capitalization of their given username,
         *   such as “UserName”. This is the default value.
         * * **False** - Enables case insensitivity for all username input. For example, when this
         *   option is set to `False` , users can sign in using `username` , `USERNAME` , or
         *   `UserName` . This option also enables both `preferred_username` and `email` alias to be
         *   case insensitive, in addition to the `username` attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive)
         */
        public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

        /** A builder for [UsernameConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param caseSensitive Specifies whether user name case sensitivity will be applied for
             *   all users in the user pool through Amazon Cognito APIs. For most use cases, set
             *   case sensitivity to `False` (case insensitive) as a best practice. When usernames
             *   and email addresses are case insensitive, users can sign in as the same user when
             *   they enter a different capitalization of their user name.
             *
             * Valid values include:
             * * **True** - Enables case sensitivity for all username input. When this option is set
             *   to `True` , users must sign in using the exact capitalization of their given
             *   username, such as “UserName”. This is the default value.
             * * **False** - Enables case insensitivity for all username input. For example, when
             *   this option is set to `False` , users can sign in using `username` , `USERNAME` ,
             *   or `UserName` . This option also enables both `preferred_username` and `email`
             *   alias to be case insensitive, in addition to the `username` attribute.
             */
            public fun caseSensitive(caseSensitive: Boolean)

            /**
             * @param caseSensitive Specifies whether user name case sensitivity will be applied for
             *   all users in the user pool through Amazon Cognito APIs. For most use cases, set
             *   case sensitivity to `False` (case insensitive) as a best practice. When usernames
             *   and email addresses are case insensitive, users can sign in as the same user when
             *   they enter a different capitalization of their user name.
             *
             * Valid values include:
             * * **True** - Enables case sensitivity for all username input. When this option is set
             *   to `True` , users must sign in using the exact capitalization of their given
             *   username, such as “UserName”. This is the default value.
             * * **False** - Enables case insensitivity for all username input. For example, when
             *   this option is set to `False` , users can sign in using `username` , `USERNAME` ,
             *   or `UserName` . This option also enables both `preferred_username` and `email`
             *   alias to be case insensitive, in addition to the `username` attribute.
             */
            public fun caseSensitive(caseSensitive: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty
                    .builder()

            /**
             * @param caseSensitive Specifies whether user name case sensitivity will be applied for
             *   all users in the user pool through Amazon Cognito APIs. For most use cases, set
             *   case sensitivity to `False` (case insensitive) as a best practice. When usernames
             *   and email addresses are case insensitive, users can sign in as the same user when
             *   they enter a different capitalization of their user name.
             *
             * Valid values include:
             * * **True** - Enables case sensitivity for all username input. When this option is set
             *   to `True` , users must sign in using the exact capitalization of their given
             *   username, such as “UserName”. This is the default value.
             * * **False** - Enables case insensitivity for all username input. For example, when
             *   this option is set to `False` , users can sign in using `username` , `USERNAME` ,
             *   or `UserName` . This option also enables both `preferred_username` and `email`
             *   alias to be case insensitive, in addition to the `username` attribute.
             */
            override fun caseSensitive(caseSensitive: Boolean) {
                cdkBuilder.caseSensitive(caseSensitive)
            }

            /**
             * @param caseSensitive Specifies whether user name case sensitivity will be applied for
             *   all users in the user pool through Amazon Cognito APIs. For most use cases, set
             *   case sensitivity to `False` (case insensitive) as a best practice. When usernames
             *   and email addresses are case insensitive, users can sign in as the same user when
             *   they enter a different capitalization of their user name.
             *
             * Valid values include:
             * * **True** - Enables case sensitivity for all username input. When this option is set
             *   to `True` , users must sign in using the exact capitalization of their given
             *   username, such as “UserName”. This is the default value.
             * * **False** - Enables case insensitivity for all username input. For example, when
             *   this option is set to `False` , users can sign in using `username` , `USERNAME` ,
             *   or `UserName` . This option also enables both `preferred_username` and `email`
             *   alias to be case insensitive, in addition to the `username` attribute.
             */
            override fun caseSensitive(caseSensitive: IResolvable) {
                cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty,
        ) : UsernameConfigurationProperty {
            /**
             * Specifies whether user name case sensitivity will be applied for all users in the
             * user pool through Amazon Cognito APIs.
             *
             * For most use cases, set case sensitivity to `False` (case insensitive) as a best
             * practice. When usernames and email addresses are case insensitive, users can sign in
             * as the same user when they enter a different capitalization of their user name.
             *
             * Valid values include:
             * * **True** - Enables case sensitivity for all username input. When this option is set
             *   to `True` , users must sign in using the exact capitalization of their given
             *   username, such as “UserName”. This is the default value.
             * * **False** - Enables case insensitivity for all username input. For example, when
             *   this option is set to `False` , users can sign in using `username` , `USERNAME` ,
             *   or `UserName` . This option also enables both `preferred_username` and `email`
             *   alias to be case insensitive, in addition to the `username` attribute.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive)
             */
            override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): UsernameConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty
            ): UsernameConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: UsernameConfigurationProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RecoveryOptionProperty {
        /**
         * Specifies the recovery method for a user.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * A positive integer specifying priority of a method with 1 being the highest priority.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-priority)
         */
        public fun priority(): Number? = unwrap(this).getPriority()

        /** A builder for [RecoveryOptionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name Specifies the recovery method for a user. */
            public fun name(name: String)

            /**
             * @param priority A positive integer specifying priority of a method with 1 being the
             *   highest priority.
             */
            public fun priority(priority: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.builder()

            /** @param name Specifies the recovery method for a user. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param priority A positive integer specifying priority of a method with 1 being the
             *   highest priority.
             */
            override fun priority(priority: Number) {
                cdkBuilder.priority(priority)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty,
        ) : RecoveryOptionProperty {
            /**
             * Specifies the recovery method for a user.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * A positive integer specifying priority of a method with 1 being the highest priority.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-priority)
             */
            override fun priority(): Number? = unwrap(this).getPriority()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RecoveryOptionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty
            ): RecoveryOptionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RecoveryOptionProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LambdaConfigProperty {
        /**
         * Creates an authentication challenge.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
         */
        public fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

        /**
         * A custom email sender AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customemailsender)
         */
        public fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

        /**
         * A custom Message AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
         */
        public fun customMessage(): String? = unwrap(this).getCustomMessage()

        /**
         * A custom SMS sender AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customsmssender)
         */
        public fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

        /**
         * Defines the authentication challenge.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
         */
        public fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

        /**
         * The Amazon Resource Name of a AWS Key Management Service ( AWS KMS ) key.
         *
         * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
         * `CustomEmailSender` and `CustomSMSSender` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-kmskeyid)
         */
        public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

        /**
         * A post-authentication AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
         */
        public fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

        /**
         * A post-confirmation AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
         */
        public fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

        /**
         * A pre-authentication AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
         */
        public fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

        /**
         * A pre-registration AWS Lambda trigger.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
         */
        public fun preSignUp(): String? = unwrap(this).getPreSignUp()

        /**
         * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
         * trigger.
         *
         * Set this parameter for legacy purposes. If you also set an ARN in
         * `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` . For
         * new instances of pre token generation triggers, set the `LambdaArn` of
         * `PreTokenGenerationConfig` .
         *
         * You can set ``
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration)
         */
        public fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

        /**
         * The detailed configuration of a pre token generation trigger.
         *
         * If you also set an ARN in `PreTokenGeneration` , its value must be identical to
         * `PreTokenGenerationConfig` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengenerationconfig)
         */
        public fun preTokenGenerationConfig(): Any? = unwrap(this).getPreTokenGenerationConfig()

        /**
         * The user migration Lambda config type.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration)
         */
        public fun userMigration(): String? = unwrap(this).getUserMigration()

        /**
         * Verifies the authentication challenge response.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
         */
        public fun verifyAuthChallengeResponse(): String? =
            unwrap(this).getVerifyAuthChallengeResponse()

        /** A builder for [LambdaConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param createAuthChallenge Creates an authentication challenge. */
            public fun createAuthChallenge(createAuthChallenge: String)

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            public fun customEmailSender(customEmailSender: IResolvable)

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            public fun customEmailSender(customEmailSender: CustomEmailSenderProperty)

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
            public fun customEmailSender(
                customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit
            )

            /** @param customMessage A custom Message AWS Lambda trigger. */
            public fun customMessage(customMessage: String)

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            public fun customSmsSender(customSmsSender: IResolvable)

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            public fun customSmsSender(customSmsSender: CustomSMSSenderProperty)

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
            public fun customSmsSender(customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit)

            /** @param defineAuthChallenge Defines the authentication challenge. */
            public fun defineAuthChallenge(defineAuthChallenge: String)

            /**
             * @param kmsKeyId The Amazon Resource Name of a AWS Key Management Service ( AWS KMS )
             *   key. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
             *   `CustomEmailSender` and `CustomSMSSender` .
             */
            public fun kmsKeyId(kmsKeyId: String)

            /** @param postAuthentication A post-authentication AWS Lambda trigger. */
            public fun postAuthentication(postAuthentication: String)

            /** @param postConfirmation A post-confirmation AWS Lambda trigger. */
            public fun postConfirmation(postConfirmation: String)

            /** @param preAuthentication A pre-authentication AWS Lambda trigger. */
            public fun preAuthentication(preAuthentication: String)

            /** @param preSignUp A pre-registration AWS Lambda trigger. */
            public fun preSignUp(preSignUp: String)

            /**
             * @param preTokenGeneration The Amazon Resource Name (ARN) of the function that you
             *   want to assign to your Lambda trigger. Set this parameter for legacy purposes. If
             *   you also set an ARN in `PreTokenGenerationConfig` , its value must be identical to
             *   `PreTokenGeneration` . For new instances of pre token generation triggers, set the
             *   `LambdaArn` of `PreTokenGenerationConfig` .
             *
             * You can set ``
             */
            public fun preTokenGeneration(preTokenGeneration: String)

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            public fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable)

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            public fun preTokenGenerationConfig(
                preTokenGenerationConfig: PreTokenGenerationConfigProperty
            )

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
            public fun preTokenGenerationConfig(
                preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit
            )

            /** @param userMigration The user migration Lambda config type. */
            public fun userMigration(userMigration: String)

            /**
             * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
             */
            public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.builder()

            /** @param createAuthChallenge Creates an authentication challenge. */
            override fun createAuthChallenge(createAuthChallenge: String) {
                cdkBuilder.createAuthChallenge(createAuthChallenge)
            }

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            override fun customEmailSender(customEmailSender: IResolvable) {
                cdkBuilder.customEmailSender(customEmailSender.let(IResolvable::unwrap))
            }

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            override fun customEmailSender(customEmailSender: CustomEmailSenderProperty) {
                cdkBuilder.customEmailSender(
                    customEmailSender.let(CustomEmailSenderProperty::unwrap)
                )
            }

            /** @param customEmailSender A custom email sender AWS Lambda trigger. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
            override fun customEmailSender(
                customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit
            ): Unit = customEmailSender(CustomEmailSenderProperty(customEmailSender))

            /** @param customMessage A custom Message AWS Lambda trigger. */
            override fun customMessage(customMessage: String) {
                cdkBuilder.customMessage(customMessage)
            }

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            override fun customSmsSender(customSmsSender: IResolvable) {
                cdkBuilder.customSmsSender(customSmsSender.let(IResolvable::unwrap))
            }

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            override fun customSmsSender(customSmsSender: CustomSMSSenderProperty) {
                cdkBuilder.customSmsSender(customSmsSender.let(CustomSMSSenderProperty::unwrap))
            }

            /** @param customSmsSender A custom SMS sender AWS Lambda trigger. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
            override fun customSmsSender(
                customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit
            ): Unit = customSmsSender(CustomSMSSenderProperty(customSmsSender))

            /** @param defineAuthChallenge Defines the authentication challenge. */
            override fun defineAuthChallenge(defineAuthChallenge: String) {
                cdkBuilder.defineAuthChallenge(defineAuthChallenge)
            }

            /**
             * @param kmsKeyId The Amazon Resource Name of a AWS Key Management Service ( AWS KMS )
             *   key. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
             *   `CustomEmailSender` and `CustomSMSSender` .
             */
            override fun kmsKeyId(kmsKeyId: String) {
                cdkBuilder.kmsKeyId(kmsKeyId)
            }

            /** @param postAuthentication A post-authentication AWS Lambda trigger. */
            override fun postAuthentication(postAuthentication: String) {
                cdkBuilder.postAuthentication(postAuthentication)
            }

            /** @param postConfirmation A post-confirmation AWS Lambda trigger. */
            override fun postConfirmation(postConfirmation: String) {
                cdkBuilder.postConfirmation(postConfirmation)
            }

            /** @param preAuthentication A pre-authentication AWS Lambda trigger. */
            override fun preAuthentication(preAuthentication: String) {
                cdkBuilder.preAuthentication(preAuthentication)
            }

            /** @param preSignUp A pre-registration AWS Lambda trigger. */
            override fun preSignUp(preSignUp: String) {
                cdkBuilder.preSignUp(preSignUp)
            }

            /**
             * @param preTokenGeneration The Amazon Resource Name (ARN) of the function that you
             *   want to assign to your Lambda trigger. Set this parameter for legacy purposes. If
             *   you also set an ARN in `PreTokenGenerationConfig` , its value must be identical to
             *   `PreTokenGeneration` . For new instances of pre token generation triggers, set the
             *   `LambdaArn` of `PreTokenGenerationConfig` .
             *
             * You can set ``
             */
            override fun preTokenGeneration(preTokenGeneration: String) {
                cdkBuilder.preTokenGeneration(preTokenGeneration)
            }

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            override fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable) {
                cdkBuilder.preTokenGenerationConfig(
                    preTokenGenerationConfig.let(IResolvable::unwrap)
                )
            }

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            override fun preTokenGenerationConfig(
                preTokenGenerationConfig: PreTokenGenerationConfigProperty
            ) {
                cdkBuilder.preTokenGenerationConfig(
                    preTokenGenerationConfig.let(PreTokenGenerationConfigProperty::unwrap)
                )
            }

            /**
             * @param preTokenGenerationConfig The detailed configuration of a pre token generation
             *   trigger. If you also set an ARN in `PreTokenGeneration` , its value must be
             *   identical to `PreTokenGenerationConfig` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
            override fun preTokenGenerationConfig(
                preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit
            ): Unit =
                preTokenGenerationConfig(PreTokenGenerationConfigProperty(preTokenGenerationConfig))

            /** @param userMigration The user migration Lambda config type. */
            override fun userMigration(userMigration: String) {
                cdkBuilder.userMigration(userMigration)
            }

            /**
             * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
             */
            override fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
                cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty,
        ) : LambdaConfigProperty {
            /**
             * Creates an authentication challenge.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
             */
            override fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

            /**
             * A custom email sender AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customemailsender)
             */
            override fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

            /**
             * A custom Message AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
             */
            override fun customMessage(): String? = unwrap(this).getCustomMessage()

            /**
             * A custom SMS sender AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customsmssender)
             */
            override fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

            /**
             * Defines the authentication challenge.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
             */
            override fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

            /**
             * The Amazon Resource Name of a AWS Key Management Service ( AWS KMS ) key.
             *
             * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to
             * `CustomEmailSender` and `CustomSMSSender` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-kmskeyid)
             */
            override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

            /**
             * A post-authentication AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
             */
            override fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

            /**
             * A post-confirmation AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
             */
            override fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

            /**
             * A pre-authentication AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
             */
            override fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

            /**
             * A pre-registration AWS Lambda trigger.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
             */
            override fun preSignUp(): String? = unwrap(this).getPreSignUp()

            /**
             * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
             * trigger.
             *
             * Set this parameter for legacy purposes. If you also set an ARN in
             * `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` .
             * For new instances of pre token generation triggers, set the `LambdaArn` of
             * `PreTokenGenerationConfig` .
             *
             * You can set ``
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration)
             */
            override fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

            /**
             * The detailed configuration of a pre token generation trigger.
             *
             * If you also set an ARN in `PreTokenGeneration` , its value must be identical to
             * `PreTokenGenerationConfig` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengenerationconfig)
             */
            override fun preTokenGenerationConfig(): Any? =
                unwrap(this).getPreTokenGenerationConfig()

            /**
             * The user migration Lambda config type.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration)
             */
            override fun userMigration(): String? = unwrap(this).getUserMigration()

            /**
             * Verifies the authentication challenge response.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
             */
            override fun verifyAuthChallengeResponse(): String? =
                unwrap(this).getVerifyAuthChallengeResponse()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty
            ): LambdaConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LambdaConfigProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PreTokenGenerationConfigProperty {
        /**
         * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
         * trigger.
         *
         * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same
         * value. For new instances of pre token generation triggers, set `LambdaArn` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html#cfn-cognito-userpool-pretokengenerationconfig-lambdaarn)
         */
        public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

        /**
         * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
         * function.
         *
         * Higher-numbered versions add fields that support new features.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html#cfn-cognito-userpool-pretokengenerationconfig-lambdaversion)
         */
        public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

        /** A builder for [PreTokenGenerationConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to
             *   assign to your Lambda trigger. This parameter and the `PreTokenGeneration` property
             *   of `LambdaConfig` have the same value. For new instances of pre token generation
             *   triggers, set `LambdaArn` .
             */
            public fun lambdaArn(lambdaArn: String)

            /**
             * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito
             *   sends to your Lambda function. Higher-numbered versions add fields that support new
             *   features.
             */
            public fun lambdaVersion(lambdaVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty
                    .builder()

            /**
             * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to
             *   assign to your Lambda trigger. This parameter and the `PreTokenGeneration` property
             *   of `LambdaConfig` have the same value. For new instances of pre token generation
             *   triggers, set `LambdaArn` .
             */
            override fun lambdaArn(lambdaArn: String) {
                cdkBuilder.lambdaArn(lambdaArn)
            }

            /**
             * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito
             *   sends to your Lambda function. Higher-numbered versions add fields that support new
             *   features.
             */
            override fun lambdaVersion(lambdaVersion: String) {
                cdkBuilder.lambdaVersion(lambdaVersion)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty,
        ) : PreTokenGenerationConfigProperty {
            /**
             * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
             * trigger.
             *
             * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same
             * value. For new instances of pre token generation triggers, set `LambdaArn` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html#cfn-cognito-userpool-pretokengenerationconfig-lambdaarn)
             */
            override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

            /**
             * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
             * function.
             *
             * Higher-numbered versions add fields that support new features.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html#cfn-cognito-userpool-pretokengenerationconfig-lambdaversion)
             */
            override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): PreTokenGenerationConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty
            ): PreTokenGenerationConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PreTokenGenerationConfigProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface InviteMessageTemplateProperty {
        /**
         * The message template for email messages.
         *
         * EmailMessage is allowed only if
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is DEVELOPER.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
         */
        public fun emailMessage(): String? = unwrap(this).getEmailMessage()

        /**
         * The subject line for email messages.
         *
         * EmailSubject is allowed only if
         * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
         * is DEVELOPER.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
         */
        public fun emailSubject(): String? = unwrap(this).getEmailSubject()

        /**
         * The message template for SMS messages.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
         */
        public fun smsMessage(): String? = unwrap(this).getSmsMessage()

        /** A builder for [InviteMessageTemplateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param emailMessage The message template for email messages. EmailMessage is allowed
             *   only if
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is DEVELOPER.
             */
            public fun emailMessage(emailMessage: String)

            /**
             * @param emailSubject The subject line for email messages. EmailSubject is allowed only
             *   if
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is DEVELOPER.
             */
            public fun emailSubject(emailSubject: String)

            /** @param smsMessage The message template for SMS messages. */
            public fun smsMessage(smsMessage: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty
                    .builder()

            /**
             * @param emailMessage The message template for email messages. EmailMessage is allowed
             *   only if
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is DEVELOPER.
             */
            override fun emailMessage(emailMessage: String) {
                cdkBuilder.emailMessage(emailMessage)
            }

            /**
             * @param emailSubject The subject line for email messages. EmailSubject is allowed only
             *   if
             *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             *   is DEVELOPER.
             */
            override fun emailSubject(emailSubject: String) {
                cdkBuilder.emailSubject(emailSubject)
            }

            /** @param smsMessage The message template for SMS messages. */
            override fun smsMessage(smsMessage: String) {
                cdkBuilder.smsMessage(smsMessage)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty,
        ) : InviteMessageTemplateProperty {
            /**
             * The message template for email messages.
             *
             * EmailMessage is allowed only if
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is DEVELOPER.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
             */
            override fun emailMessage(): String? = unwrap(this).getEmailMessage()

            /**
             * The subject line for email messages.
             *
             * EmailSubject is allowed only if
             * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
             * is DEVELOPER.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
             */
            override fun emailSubject(): String? = unwrap(this).getEmailSubject()

            /**
             * The message template for SMS messages.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
             */
            override fun smsMessage(): String? = unwrap(this).getSmsMessage()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): InviteMessageTemplateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty
            ): InviteMessageTemplateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: InviteMessageTemplateProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface UserAttributeUpdateSettingsProperty {
        /**
         * Requires that your user verifies their email address, phone number, or both before Amazon
         * Cognito updates the value of that attribute.
         *
         * When you update a user attribute that has this option activated, Amazon Cognito sends a
         * verification message to the new phone number or email address. Amazon Cognito doesn’t
         * change the value of the attribute until your user responds to the verification message
         * and confirms the new value.
         *
         * You can verify an updated email address or phone number with a
         * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
         * API request. You can also call the
         * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
         * API and set `email_verified` or `phone_number_verified` to true.
         *
         * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
         * that your users verify attribute changes before Amazon Cognito updates them. In a user
         * pool where `AttributesRequireVerificationBeforeUpdate` is false, API operations that
         * change attribute values can immediately update a user’s `email` or `phone_number`
         * attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html#cfn-cognito-userpool-userattributeupdatesettings-attributesrequireverificationbeforeupdate)
         */
        public fun attributesRequireVerificationBeforeUpdate(): List<String>

        /** A builder for [UserAttributeUpdateSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies
             *   their email address, phone number, or both before Amazon Cognito updates the value
             *   of that attribute. When you update a user attribute that has this option activated,
             *   Amazon Cognito sends a verification message to the new phone number or email
             *   address. Amazon Cognito doesn’t change the value of the attribute until your user
             *   responds to the verification message and confirms the new value.
             *
             * You can verify an updated email address or phone number with a
             * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
             * API request. You can also call the
             * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
             * API and set `email_verified` or `phone_number_verified` to true.
             *
             * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't
             * require that your users verify attribute changes before Amazon Cognito updates them.
             * In a user pool where `AttributesRequireVerificationBeforeUpdate` is false, API
             * operations that change attribute values can immediately update a user’s `email` or
             * `phone_number` attribute.
             */
            public fun attributesRequireVerificationBeforeUpdate(
                attributesRequireVerificationBeforeUpdate: List<String>
            )

            /**
             * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies
             *   their email address, phone number, or both before Amazon Cognito updates the value
             *   of that attribute. When you update a user attribute that has this option activated,
             *   Amazon Cognito sends a verification message to the new phone number or email
             *   address. Amazon Cognito doesn’t change the value of the attribute until your user
             *   responds to the verification message and confirms the new value.
             *
             * You can verify an updated email address or phone number with a
             * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
             * API request. You can also call the
             * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
             * API and set `email_verified` or `phone_number_verified` to true.
             *
             * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't
             * require that your users verify attribute changes before Amazon Cognito updates them.
             * In a user pool where `AttributesRequireVerificationBeforeUpdate` is false, API
             * operations that change attribute values can immediately update a user’s `email` or
             * `phone_number` attribute.
             */
            public fun attributesRequireVerificationBeforeUpdate(
                vararg attributesRequireVerificationBeforeUpdate: String
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool
                    .UserAttributeUpdateSettingsProperty
                    .builder()

            /**
             * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies
             *   their email address, phone number, or both before Amazon Cognito updates the value
             *   of that attribute. When you update a user attribute that has this option activated,
             *   Amazon Cognito sends a verification message to the new phone number or email
             *   address. Amazon Cognito doesn’t change the value of the attribute until your user
             *   responds to the verification message and confirms the new value.
             *
             * You can verify an updated email address or phone number with a
             * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
             * API request. You can also call the
             * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
             * API and set `email_verified` or `phone_number_verified` to true.
             *
             * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't
             * require that your users verify attribute changes before Amazon Cognito updates them.
             * In a user pool where `AttributesRequireVerificationBeforeUpdate` is false, API
             * operations that change attribute values can immediately update a user’s `email` or
             * `phone_number` attribute.
             */
            override fun attributesRequireVerificationBeforeUpdate(
                attributesRequireVerificationBeforeUpdate: List<String>
            ) {
                cdkBuilder.attributesRequireVerificationBeforeUpdate(
                    attributesRequireVerificationBeforeUpdate
                )
            }

            /**
             * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies
             *   their email address, phone number, or both before Amazon Cognito updates the value
             *   of that attribute. When you update a user attribute that has this option activated,
             *   Amazon Cognito sends a verification message to the new phone number or email
             *   address. Amazon Cognito doesn’t change the value of the attribute until your user
             *   responds to the verification message and confirms the new value.
             *
             * You can verify an updated email address or phone number with a
             * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
             * API request. You can also call the
             * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
             * API and set `email_verified` or `phone_number_verified` to true.
             *
             * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't
             * require that your users verify attribute changes before Amazon Cognito updates them.
             * In a user pool where `AttributesRequireVerificationBeforeUpdate` is false, API
             * operations that change attribute values can immediately update a user’s `email` or
             * `phone_number` attribute.
             */
            override fun attributesRequireVerificationBeforeUpdate(
                vararg attributesRequireVerificationBeforeUpdate: String
            ): Unit =
                attributesRequireVerificationBeforeUpdate(
                    attributesRequireVerificationBeforeUpdate.toList()
                )

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty,
        ) : UserAttributeUpdateSettingsProperty {
            /**
             * Requires that your user verifies their email address, phone number, or both before
             * Amazon Cognito updates the value of that attribute.
             *
             * When you update a user attribute that has this option activated, Amazon Cognito sends
             * a verification message to the new phone number or email address. Amazon Cognito
             * doesn’t change the value of the attribute until your user responds to the
             * verification message and confirms the new value.
             *
             * You can verify an updated email address or phone number with a
             * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
             * API request. You can also call the
             * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
             * API and set `email_verified` or `phone_number_verified` to true.
             *
             * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't
             * require that your users verify attribute changes before Amazon Cognito updates them.
             * In a user pool where `AttributesRequireVerificationBeforeUpdate` is false, API
             * operations that change attribute values can immediately update a user’s `email` or
             * `phone_number` attribute.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html#cfn-cognito-userpool-userattributeupdatesettings-attributesrequireverificationbeforeupdate)
             */
            override fun attributesRequireVerificationBeforeUpdate(): List<String> =
                unwrap(this).getAttributesRequireVerificationBeforeUpdate()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): UserAttributeUpdateSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty
            ): UserAttributeUpdateSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: UserAttributeUpdateSettingsProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface UserPoolAddOnsProperty {
        /**
         * The operating mode of advanced security features in your user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode)
         */
        public fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()

        /** A builder for [UserPoolAddOnsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param advancedSecurityMode The operating mode of advanced security features in your
             *   user pool.
             */
            public fun advancedSecurityMode(advancedSecurityMode: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.Builder =
                software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.builder()

            /**
             * @param advancedSecurityMode The operating mode of advanced security features in your
             *   user pool.
             */
            override fun advancedSecurityMode(advancedSecurityMode: String) {
                cdkBuilder.advancedSecurityMode(advancedSecurityMode)
            }

            public fun build():
                software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty,
        ) : UserPoolAddOnsProperty {
            /**
             * The operating mode of advanced security features in your user pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode)
             */
            override fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolAddOnsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty
            ): UserPoolAddOnsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: UserPoolAddOnsProperty
            ): software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
