@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPool` resource creates an Amazon Cognito user pool.
 *
 * For more information on working with Amazon Cognito user pools, see [Amazon Cognito User
 * Pools](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
 * and
 * [CreateUserPool](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPool.html)
 * .
 *
 *
 * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object userPoolTags;
 * CfnUserPool cfnUserPool = CfnUserPool.Builder.create(this, "MyCfnUserPool")
 * .accountRecoverySetting(AccountRecoverySettingProperty.builder()
 * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
 * .name("name")
 * .priority(123)
 * .build()))
 * .build())
 * .adminCreateUserConfig(AdminCreateUserConfigProperty.builder()
 * .allowAdminCreateUserOnly(false)
 * .inviteMessageTemplate(InviteMessageTemplateProperty.builder()
 * .emailMessage("emailMessage")
 * .emailSubject("emailSubject")
 * .smsMessage("smsMessage")
 * .build())
 * .unusedAccountValidityDays(123)
 * .build())
 * .aliasAttributes(List.of("aliasAttributes"))
 * .autoVerifiedAttributes(List.of("autoVerifiedAttributes"))
 * .deletionProtection("deletionProtection")
 * .deviceConfiguration(DeviceConfigurationProperty.builder()
 * .challengeRequiredOnNewDevice(false)
 * .deviceOnlyRememberedOnUserPrompt(false)
 * .build())
 * .emailAuthenticationMessage("emailAuthenticationMessage")
 * .emailAuthenticationSubject("emailAuthenticationSubject")
 * .emailConfiguration(EmailConfigurationProperty.builder()
 * .configurationSet("configurationSet")
 * .emailSendingAccount("emailSendingAccount")
 * .from("from")
 * .replyToEmailAddress("replyToEmailAddress")
 * .sourceArn("sourceArn")
 * .build())
 * .emailVerificationMessage("emailVerificationMessage")
 * .emailVerificationSubject("emailVerificationSubject")
 * .enabledMfas(List.of("enabledMfas"))
 * .lambdaConfig(LambdaConfigProperty.builder()
 * .createAuthChallenge("createAuthChallenge")
 * .customEmailSender(CustomEmailSenderProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .customMessage("customMessage")
 * .customSmsSender(CustomSMSSenderProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .defineAuthChallenge("defineAuthChallenge")
 * .kmsKeyId("kmsKeyId")
 * .postAuthentication("postAuthentication")
 * .postConfirmation("postConfirmation")
 * .preAuthentication("preAuthentication")
 * .preSignUp("preSignUp")
 * .preTokenGeneration("preTokenGeneration")
 * .preTokenGenerationConfig(PreTokenGenerationConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build())
 * .userMigration("userMigration")
 * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
 * .build())
 * .mfaConfiguration("mfaConfiguration")
 * .policies(PoliciesProperty.builder()
 * .passwordPolicy(PasswordPolicyProperty.builder()
 * .minimumLength(123)
 * .passwordHistorySize(123)
 * .requireLowercase(false)
 * .requireNumbers(false)
 * .requireSymbols(false)
 * .requireUppercase(false)
 * .temporaryPasswordValidityDays(123)
 * .build())
 * .signInPolicy(SignInPolicyProperty.builder()
 * .allowedFirstAuthFactors(List.of("allowedFirstAuthFactors"))
 * .build())
 * .build())
 * .schema(List.of(SchemaAttributeProperty.builder()
 * .attributeDataType("attributeDataType")
 * .developerOnlyAttribute(false)
 * .mutable(false)
 * .name("name")
 * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
 * .maxValue("maxValue")
 * .minValue("minValue")
 * .build())
 * .required(false)
 * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
 * .maxLength("maxLength")
 * .minLength("minLength")
 * .build())
 * .build()))
 * .smsAuthenticationMessage("smsAuthenticationMessage")
 * .smsConfiguration(SmsConfigurationProperty.builder()
 * .externalId("externalId")
 * .snsCallerArn("snsCallerArn")
 * .snsRegion("snsRegion")
 * .build())
 * .smsVerificationMessage("smsVerificationMessage")
 * .userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty.builder()
 * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
 * .build())
 * .usernameAttributes(List.of("usernameAttributes"))
 * .usernameConfiguration(UsernameConfigurationProperty.builder()
 * .caseSensitive(false)
 * .build())
 * .userPoolAddOns(UserPoolAddOnsProperty.builder()
 * .advancedSecurityAdditionalFlows(AdvancedSecurityAdditionalFlowsProperty.builder()
 * .customAuthMode("customAuthMode")
 * .build())
 * .advancedSecurityMode("advancedSecurityMode")
 * .build())
 * .userPoolName("userPoolName")
 * .userPoolTags(userPoolTags)
 * .userPoolTier("userPoolTier")
 * .verificationMessageTemplate(VerificationMessageTemplateProperty.builder()
 * .defaultEmailOption("defaultEmailOption")
 * .emailMessage("emailMessage")
 * .emailMessageByLink("emailMessageByLink")
 * .emailSubject("emailSubject")
 * .emailSubjectByLink("emailSubjectByLink")
 * .smsMessage("smsMessage")
 * .build())
 * .webAuthnRelyingPartyId("webAuthnRelyingPartyId")
 * .webAuthnUserVerification("webAuthnUserVerification")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
 */
public open class CfnUserPool(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cognito.CfnUserPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolProps(props)
  )

  /**
   * The available verified method a user can use to recover their password when they call
   * `ForgotPassword` .
   */
  public open fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

  /**
   * The available verified method a user can use to recover their password when they call
   * `ForgotPassword` .
   */
  public open fun accountRecoverySetting(`value`: IResolvable) {
    unwrap(this).setAccountRecoverySetting(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The available verified method a user can use to recover their password when they call
   * `ForgotPassword` .
   */
  public open fun accountRecoverySetting(`value`: AccountRecoverySettingProperty) {
    unwrap(this).setAccountRecoverySetting(`value`.let(AccountRecoverySettingProperty.Companion::unwrap))
  }

  /**
   * The available verified method a user can use to recover their password when they call
   * `ForgotPassword` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41869758d1479e39ad7853ac6413ee514612afc9860a9041b64a47dee3a233cd")
  public open
      fun accountRecoverySetting(`value`: AccountRecoverySettingProperty.Builder.() -> Unit): Unit =
      accountRecoverySetting(AccountRecoverySettingProperty(`value`))

  /**
   * The settings for administrator creation of users in a user pool.
   */
  public open fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

  /**
   * The settings for administrator creation of users in a user pool.
   */
  public open fun adminCreateUserConfig(`value`: IResolvable) {
    unwrap(this).setAdminCreateUserConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for administrator creation of users in a user pool.
   */
  public open fun adminCreateUserConfig(`value`: AdminCreateUserConfigProperty) {
    unwrap(this).setAdminCreateUserConfig(`value`.let(AdminCreateUserConfigProperty.Companion::unwrap))
  }

  /**
   * The settings for administrator creation of users in a user pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a26247a0a20ec4848afe270346c20b8a0d598576ae427ad07d74f7e102cf7f6e")
  public open fun adminCreateUserConfig(`value`: AdminCreateUserConfigProperty.Builder.() -> Unit):
      Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(`value`))

  /**
   * Attributes supported as an alias for this user pool.
   */
  public open fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

  /**
   * Attributes supported as an alias for this user pool.
   */
  public open fun aliasAttributes(`value`: List<String>) {
    unwrap(this).setAliasAttributes(`value`)
  }

  /**
   * Attributes supported as an alias for this user pool.
   */
  public open fun aliasAttributes(vararg `value`: String): Unit = aliasAttributes(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the user pool, such as
   * `arn:aws:cognito-idp:us-east-1:123412341234:userpool/us-east-1_123412341` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A friendly name for the IdP.
   */
  public open fun attrProviderName(): String = unwrap(this).getAttrProviderName()

  /**
   * The URL of the provider of the Amazon Cognito user pool, specified as a `String` .
   */
  public open fun attrProviderUrl(): String = unwrap(this).getAttrProviderUrl()

  /**
   * The ID of the user pool.
   */
  public open fun attrUserPoolId(): String = unwrap(this).getAttrUserPoolId()

  /**
   * The attributes that you want your user pool to automatically verify.
   */
  public open fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes()
      ?: emptyList()

  /**
   * The attributes that you want your user pool to automatically verify.
   */
  public open fun autoVerifiedAttributes(`value`: List<String>) {
    unwrap(this).setAutoVerifiedAttributes(`value`)
  }

  /**
   * The attributes that you want your user pool to automatically verify.
   */
  public open fun autoVerifiedAttributes(vararg `value`: String): Unit =
      autoVerifiedAttributes(`value`.toList())

  /**
   * When active, `DeletionProtection` prevents accidental deletion of your user pool.
   */
  public open fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

  /**
   * When active, `DeletionProtection` prevents accidental deletion of your user pool.
   */
  public open fun deletionProtection(`value`: String) {
    unwrap(this).setDeletionProtection(`value`)
  }

  /**
   * The device-remembering configuration for a user pool.
   */
  public open fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

  /**
   * The device-remembering configuration for a user pool.
   */
  public open fun deviceConfiguration(`value`: IResolvable) {
    unwrap(this).setDeviceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The device-remembering configuration for a user pool.
   */
  public open fun deviceConfiguration(`value`: DeviceConfigurationProperty) {
    unwrap(this).setDeviceConfiguration(`value`.let(DeviceConfigurationProperty.Companion::unwrap))
  }

  /**
   * The device-remembering configuration for a user pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b35171bfbda008f4b6b9e661be8a69c0c4121d1ffa7951db3edc900d38625f2c")
  public open fun deviceConfiguration(`value`: DeviceConfigurationProperty.Builder.() -> Unit): Unit
      = deviceConfiguration(DeviceConfigurationProperty(`value`))

  /**
   *
   */
  public open fun emailAuthenticationMessage(): String? =
      unwrap(this).getEmailAuthenticationMessage()

  /**
   *
   */
  public open fun emailAuthenticationMessage(`value`: String) {
    unwrap(this).setEmailAuthenticationMessage(`value`)
  }

  /**
   *
   */
  public open fun emailAuthenticationSubject(): String? =
      unwrap(this).getEmailAuthenticationSubject()

  /**
   *
   */
  public open fun emailAuthenticationSubject(`value`: String) {
    unwrap(this).setEmailAuthenticationSubject(`value`)
  }

  /**
   * The email configuration of your user pool.
   */
  public open fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

  /**
   * The email configuration of your user pool.
   */
  public open fun emailConfiguration(`value`: IResolvable) {
    unwrap(this).setEmailConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The email configuration of your user pool.
   */
  public open fun emailConfiguration(`value`: EmailConfigurationProperty) {
    unwrap(this).setEmailConfiguration(`value`.let(EmailConfigurationProperty.Companion::unwrap))
  }

  /**
   * The email configuration of your user pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e380aac4b166f086c05484321f9074512a3203c5bc32edb9c10ea216d01f4ebf")
  public open fun emailConfiguration(`value`: EmailConfigurationProperty.Builder.() -> Unit): Unit =
      emailConfiguration(EmailConfigurationProperty(`value`))

  /**
   * This parameter is no longer used.
   */
  public open fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

  /**
   * This parameter is no longer used.
   */
  public open fun emailVerificationMessage(`value`: String) {
    unwrap(this).setEmailVerificationMessage(`value`)
  }

  /**
   * This parameter is no longer used.
   */
  public open fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

  /**
   * This parameter is no longer used.
   */
  public open fun emailVerificationSubject(`value`: String) {
    unwrap(this).setEmailVerificationSubject(`value`)
  }

  /**
   * Set enabled MFA options on a specified user pool.
   */
  public open fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

  /**
   * Set enabled MFA options on a specified user pool.
   */
  public open fun enabledMfas(`value`: List<String>) {
    unwrap(this).setEnabledMfas(`value`)
  }

  /**
   * Set enabled MFA options on a specified user pool.
   */
  public open fun enabledMfas(vararg `value`: String): Unit = enabledMfas(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A collection of user pool Lambda triggers.
   */
  public open fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * A collection of user pool Lambda triggers.
   */
  public open fun lambdaConfig(`value`: IResolvable) {
    unwrap(this).setLambdaConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of user pool Lambda triggers.
   */
  public open fun lambdaConfig(`value`: LambdaConfigProperty) {
    unwrap(this).setLambdaConfig(`value`.let(LambdaConfigProperty.Companion::unwrap))
  }

  /**
   * A collection of user pool Lambda triggers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("746fcba026dd44cfc248dcc3a74bb75dec1927c844a55e0c3cb65e4935ef3654")
  public open fun lambdaConfig(`value`: LambdaConfigProperty.Builder.() -> Unit): Unit =
      lambdaConfig(LambdaConfigProperty(`value`))

  /**
   * Displays the state of multi-factor authentication (MFA) as on, off, or optional.
   */
  public open fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

  /**
   * Displays the state of multi-factor authentication (MFA) as on, off, or optional.
   */
  public open fun mfaConfiguration(`value`: String) {
    unwrap(this).setMfaConfiguration(`value`)
  }

  /**
   * A list of user pool policies.
   */
  public open fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * A list of user pool policies.
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of user pool policies.
   */
  public open fun policies(`value`: PoliciesProperty) {
    unwrap(this).setPolicies(`value`.let(PoliciesProperty.Companion::unwrap))
  }

  /**
   * A list of user pool policies.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c8acea4f8e23426db34b7f27283cfb03e85ea58103fa10ce204a08d84d35d8da")
  public open fun policies(`value`: PoliciesProperty.Builder.() -> Unit): Unit =
      policies(PoliciesProperty(`value`))

  /**
   * An array of attributes for the new user pool.
   */
  public open fun schema(): Any? = unwrap(this).getSchema()

  /**
   * An array of attributes for the new user pool.
   */
  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of attributes for the new user pool.
   */
  public open fun schema(`value`: List<Any>) {
    unwrap(this).setSchema(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of attributes for the new user pool.
   */
  public open fun schema(vararg `value`: Any): Unit = schema(`value`.toList())

  /**
   * The contents of the SMS authentication message.
   */
  public open fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

  /**
   * The contents of the SMS authentication message.
   */
  public open fun smsAuthenticationMessage(`value`: String) {
    unwrap(this).setSmsAuthenticationMessage(`value`)
  }

  /**
   * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
   * Notification Service.
   */
  public open fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

  /**
   * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
   * Notification Service.
   */
  public open fun smsConfiguration(`value`: IResolvable) {
    unwrap(this).setSmsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
   * Notification Service.
   */
  public open fun smsConfiguration(`value`: SmsConfigurationProperty) {
    unwrap(this).setSmsConfiguration(`value`.let(SmsConfigurationProperty.Companion::unwrap))
  }

  /**
   * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
   * Notification Service.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a50346460383087797abc34d738bc3deae588a86f4a5a46bf21193632e510438")
  public open fun smsConfiguration(`value`: SmsConfigurationProperty.Builder.() -> Unit): Unit =
      smsConfiguration(SmsConfigurationProperty(`value`))

  /**
   * This parameter is no longer used.
   */
  public open fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

  /**
   * This parameter is no longer used.
   */
  public open fun smsVerificationMessage(`value`: String) {
    unwrap(this).setSmsVerificationMessage(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The settings for updates to user attributes.
   */
  public open fun userAttributeUpdateSettings(): Any? =
      unwrap(this).getUserAttributeUpdateSettings()

  /**
   * The settings for updates to user attributes.
   */
  public open fun userAttributeUpdateSettings(`value`: IResolvable) {
    unwrap(this).setUserAttributeUpdateSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for updates to user attributes.
   */
  public open fun userAttributeUpdateSettings(`value`: UserAttributeUpdateSettingsProperty) {
    unwrap(this).setUserAttributeUpdateSettings(`value`.let(UserAttributeUpdateSettingsProperty.Companion::unwrap))
  }

  /**
   * The settings for updates to user attributes.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e2d9507e58e9c57069f320b0d14c9b7b7d6feab509f57ffc2151b658768e3ac")
  public open
      fun userAttributeUpdateSettings(`value`: UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
      Unit = userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty(`value`))

  /**
   * Contains settings for activation of threat protection, including the operating mode and
   * additional authentication types.
   */
  public open fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

  /**
   * Contains settings for activation of threat protection, including the operating mode and
   * additional authentication types.
   */
  public open fun userPoolAddOns(`value`: IResolvable) {
    unwrap(this).setUserPoolAddOns(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains settings for activation of threat protection, including the operating mode and
   * additional authentication types.
   */
  public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty) {
    unwrap(this).setUserPoolAddOns(`value`.let(UserPoolAddOnsProperty.Companion::unwrap))
  }

  /**
   * Contains settings for activation of threat protection, including the operating mode and
   * additional authentication types.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52b1b6a3af630a51f88af5dab8da0c8eafd9d71d75bf8939966599637d57e6e4")
  public open fun userPoolAddOns(`value`: UserPoolAddOnsProperty.Builder.() -> Unit): Unit =
      userPoolAddOns(UserPoolAddOnsProperty(`value`))

  /**
   * A friendly name for your user pool.
   */
  public open fun userPoolName(): String? = unwrap(this).getUserPoolName()

  /**
   * A friendly name for your user pool.
   */
  public open fun userPoolName(`value`: String) {
    unwrap(this).setUserPoolName(`value`)
  }

  /**
   * The tag keys and values to assign to the user pool.
   */
  public open fun userPoolTagsRaw(): Any? = unwrap(this).getUserPoolTagsRaw()

  /**
   * The tag keys and values to assign to the user pool.
   */
  public open fun userPoolTagsRaw(`value`: Any) {
    unwrap(this).setUserPoolTagsRaw(`value`)
  }

  /**
   * The user pool [feature
   * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
   * , or tier. This parameter determines the eligibility of the user pool for features like managed
   * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
   */
  public open fun userPoolTier(): String? = unwrap(this).getUserPoolTier()

  /**
   * The user pool [feature
   * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
   * , or tier. This parameter determines the eligibility of the user pool for features like managed
   * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
   */
  public open fun userPoolTier(`value`: String) {
    unwrap(this).setUserPoolTier(`value`)
  }

  /**
   * Specifies whether a user can use an email address or phone number as a username when they sign
   * up.
   */
  public open fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
      emptyList()

  /**
   * Specifies whether a user can use an email address or phone number as a username when they sign
   * up.
   */
  public open fun usernameAttributes(`value`: List<String>) {
    unwrap(this).setUsernameAttributes(`value`)
  }

  /**
   * Specifies whether a user can use an email address or phone number as a username when they sign
   * up.
   */
  public open fun usernameAttributes(vararg `value`: String): Unit =
      usernameAttributes(`value`.toList())

  /**
   * Sets the case sensitivity option for sign-in usernames.
   */
  public open fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

  /**
   * Sets the case sensitivity option for sign-in usernames.
   */
  public open fun usernameConfiguration(`value`: IResolvable) {
    unwrap(this).setUsernameConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Sets the case sensitivity option for sign-in usernames.
   */
  public open fun usernameConfiguration(`value`: UsernameConfigurationProperty) {
    unwrap(this).setUsernameConfiguration(`value`.let(UsernameConfigurationProperty.Companion::unwrap))
  }

  /**
   * Sets the case sensitivity option for sign-in usernames.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4530461026528910b8f5a9c46b31dd9e2b7bd6245adf82505f50792d1e4e7a7")
  public open fun usernameConfiguration(`value`: UsernameConfigurationProperty.Builder.() -> Unit):
      Unit = usernameConfiguration(UsernameConfigurationProperty(`value`))

  /**
   * The template for the verification message that your user pool delivers to users who set an
   * email address or phone number attribute.
   */
  public open fun verificationMessageTemplate(): Any? =
      unwrap(this).getVerificationMessageTemplate()

  /**
   * The template for the verification message that your user pool delivers to users who set an
   * email address or phone number attribute.
   */
  public open fun verificationMessageTemplate(`value`: IResolvable) {
    unwrap(this).setVerificationMessageTemplate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The template for the verification message that your user pool delivers to users who set an
   * email address or phone number attribute.
   */
  public open fun verificationMessageTemplate(`value`: VerificationMessageTemplateProperty) {
    unwrap(this).setVerificationMessageTemplate(`value`.let(VerificationMessageTemplateProperty.Companion::unwrap))
  }

  /**
   * The template for the verification message that your user pool delivers to users who set an
   * email address or phone number attribute.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a739849a2934daad512588221e8cd348c058e98865835fc2950debe0c51ff649")
  public open
      fun verificationMessageTemplate(`value`: VerificationMessageTemplateProperty.Builder.() -> Unit):
      Unit = verificationMessageTemplate(VerificationMessageTemplateProperty(`value`))

  /**
   * Sets or displays the authentication domain, typically your user pool domain, that passkey
   * providers must use as a relying party (RP) in their configuration.
   */
  public open fun webAuthnRelyingPartyId(): String? = unwrap(this).getWebAuthnRelyingPartyId()

  /**
   * Sets or displays the authentication domain, typically your user pool domain, that passkey
   * providers must use as a relying party (RP) in their configuration.
   */
  public open fun webAuthnRelyingPartyId(`value`: String) {
    unwrap(this).setWebAuthnRelyingPartyId(`value`)
  }

  /**
   * When `required` , users can only register and sign in users with passkeys that are capable of
   * [user
   * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
   * . When `preferred` , your user pool doesn't require the use of authenticators with user
   * verification but encourages it.
   */
  public open fun webAuthnUserVerification(): String? = unwrap(this).getWebAuthnUserVerification()

  /**
   * When `required` , users can only register and sign in users with passkeys that are capable of
   * [user
   * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
   * . When `preferred` , your user pool doesn't require the use of authenticators with user
   * verification but encourages it.
   */
  public open fun webAuthnUserVerification(`value`: String) {
    unwrap(this).setWebAuthnUserVerification(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable)

    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    public fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty)

    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
    public
        fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit)

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable)

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    public fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty)

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
    public
        fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit)

    /**
     * Attributes supported as an alias for this user pool.
     *
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     * @param aliasAttributes Attributes supported as an alias for this user pool. 
     */
    public fun aliasAttributes(aliasAttributes: List<String>)

    /**
     * Attributes supported as an alias for this user pool.
     *
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     * @param aliasAttributes Attributes supported as an alias for this user pool. 
     */
    public fun aliasAttributes(vararg aliasAttributes: String)

    /**
     * The attributes that you want your user pool to automatically verify.
     *
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify. 
     */
    public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>)

    /**
     * The attributes that you want your user pool to automatically verify.
     *
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify. 
     */
    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String)

    /**
     * When active, `DeletionProtection` prevents accidental deletion of your user pool.
     *
     * Before you can delete a user pool that you have protected against deletion, you
     * must deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool. 
     */
    public fun deletionProtection(deletionProtection: String)

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    public fun deviceConfiguration(deviceConfiguration: IResolvable)

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    public fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty)

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
    public
        fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationmessage)
     * @param emailAuthenticationMessage 
     */
    public fun emailAuthenticationMessage(emailAuthenticationMessage: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationsubject)
     * @param emailAuthenticationSubject 
     */
    public fun emailAuthenticationSubject(emailAuthenticationSubject: String)

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    public fun emailConfiguration(emailConfiguration: IResolvable)

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    public fun emailConfiguration(emailConfiguration: EmailConfigurationProperty)

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
    public fun emailConfiguration(emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit)

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
     * @param emailVerificationMessage This parameter is no longer used. 
     */
    public fun emailVerificationMessage(emailVerificationMessage: String)

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
     * @param emailVerificationSubject This parameter is no longer used. 
     */
    public fun emailVerificationSubject(emailVerificationSubject: String)

    /**
     * Set enabled MFA options on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set `MfaConfiguration` to `OFF` and remove
     * EnabledMfas. MFAs can only be all disabled if `MfaConfiguration` is `OFF` . After you enable
     * `SMS_MFA` , you can only disable it by setting `MfaConfiguration` to `OFF` . Can be one of the
     * following values:
     *
     * * `SMS_MFA` - Enables MFA with SMS for the user pool. To select this option, you must also
     * provide values for `SmsConfiguration` .
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     * * `EMAIL_OTP` - Enables MFA with email for the user pool. To select this option, you must
     * provide values for `EmailConfiguration` and within those, set `EmailSendingAccount` to
     * `DEVELOPER` .
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA` | `EMAIL_OTP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
     * @param enabledMfas Set enabled MFA options on a specified user pool. 
     */
    public fun enabledMfas(enabledMfas: List<String>)

    /**
     * Set enabled MFA options on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set `MfaConfiguration` to `OFF` and remove
     * EnabledMfas. MFAs can only be all disabled if `MfaConfiguration` is `OFF` . After you enable
     * `SMS_MFA` , you can only disable it by setting `MfaConfiguration` to `OFF` . Can be one of the
     * following values:
     *
     * * `SMS_MFA` - Enables MFA with SMS for the user pool. To select this option, you must also
     * provide values for `SmsConfiguration` .
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     * * `EMAIL_OTP` - Enables MFA with email for the user pool. To select this option, you must
     * provide values for `EmailConfiguration` and within those, set `EmailSendingAccount` to
     * `DEVELOPER` .
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA` | `EMAIL_OTP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
     * @param enabledMfas Set enabled MFA options on a specified user pool. 
     */
    public fun enabledMfas(vararg enabledMfas: String)

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty)

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit)

    /**
     * Displays the state of multi-factor authentication (MFA) as on, off, or optional.
     *
     * When `ON` , all users must set up MFA before they can sign in. When `OPTIONAL` , your
     * application must make a client-side determination of whether a user wants to register an MFA
     * device. For user pools with adaptive authentication with threat protection, choose `OPTIONAL` .
     *
     * When `MfaConfiguration` is `OPTIONAL` , managed login doesn't automatically prompt users to
     * set up MFA. Amazon Cognito generates MFA prompts in API responses and in managed login for users
     * who have chosen and configured a preferred MFA factor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
     * @param mfaConfiguration Displays the state of multi-factor authentication (MFA) as on, off,
     * or optional. 
     */
    public fun mfaConfiguration(mfaConfiguration: String)

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    public fun policies(policies: IResolvable)

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    public fun policies(policies: PoliciesProperty)

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
    public fun policies(policies: PoliciesProperty.Builder.() -> Unit)

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    public fun schema(schema: IResolvable)

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    public fun schema(schema: List<Any>)

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    public fun schema(vararg schema: Any)

    /**
     * The contents of the SMS authentication message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
     * @param smsAuthenticationMessage The contents of the SMS authentication message. 
     */
    public fun smsAuthenticationMessage(smsAuthenticationMessage: String)

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    public fun smsConfiguration(smsConfiguration: IResolvable)

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty)

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
    public fun smsConfiguration(smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit)

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
     * @param smsVerificationMessage This parameter is no longer used. 
     */
    public fun smsVerificationMessage(smsVerificationMessage: String)

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable)

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty)

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit)

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    public fun userPoolAddOns(userPoolAddOns: IResolvable)

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty)

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
    public fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit)

    /**
     * A friendly name for your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
     * @param userPoolName A friendly name for your user pool. 
     */
    public fun userPoolName(userPoolName: String)

    /**
     * The tag keys and values to assign to the user pool.
     *
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
     * @param userPoolTags The tag keys and values to assign to the user pool. 
     */
    public fun userPoolTags(userPoolTags: Any)

    /**
     * The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltier)
     * @param userPoolTier The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` . 
     */
    public fun userPoolTier(userPoolTier: String)

    /**
     * Specifies whether a user can use an email address or phone number as a username when they
     * sign up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up. 
     */
    public fun usernameAttributes(usernameAttributes: List<String>)

    /**
     * Specifies whether a user can use an email address or phone number as a username when they
     * sign up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up. 
     */
    public fun usernameAttributes(vararg usernameAttributes: String)

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    public fun usernameConfiguration(usernameConfiguration: IResolvable)

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    public fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty)

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
    public
        fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit)

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable)

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    public
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty)

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
    public
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit)

    /**
     * Sets or displays the authentication domain, typically your user pool domain, that passkey
     * providers must use as a relying party (RP) in their configuration.
     *
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnrelyingpartyid)
     * @param webAuthnRelyingPartyId Sets or displays the authentication domain, typically your user
     * pool domain, that passkey providers must use as a relying party (RP) in their configuration. 
     */
    public fun webAuthnRelyingPartyId(webAuthnRelyingPartyId: String)

    /**
     * When `required` , users can only register and sign in users with passkeys that are capable of
     * [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnuserverification)
     * @param webAuthnUserVerification When `required` , users can only register and sign in users
     * with passkeys that are capable of [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it. 
     */
    public fun webAuthnUserVerification(webAuthnUserVerification: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPool.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPool.Builder.create(scope, id)

    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    override fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(AccountRecoverySettingProperty.Companion::unwrap))
    }

    /**
     * The available verified method a user can use to recover their password when they call
     * `ForgotPassword` .
     *
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9216516402b768e12eee63936587d1ecdce6a2999312cef66624ac3826f8ed8")
    override
        fun accountRecoverySetting(accountRecoverySetting: AccountRecoverySettingProperty.Builder.() -> Unit):
        Unit = accountRecoverySetting(AccountRecoverySettingProperty(accountRecoverySetting))

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    override fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(AdminCreateUserConfigProperty.Companion::unwrap))
    }

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3fe1657f113035c8cfe9214c57b409c4a8c5814c069ddcd2b9042f8dbf7fcb")
    override
        fun adminCreateUserConfig(adminCreateUserConfig: AdminCreateUserConfigProperty.Builder.() -> Unit):
        Unit = adminCreateUserConfig(AdminCreateUserConfigProperty(adminCreateUserConfig))

    /**
     * Attributes supported as an alias for this user pool.
     *
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     * @param aliasAttributes Attributes supported as an alias for this user pool. 
     */
    override fun aliasAttributes(aliasAttributes: List<String>) {
      cdkBuilder.aliasAttributes(aliasAttributes)
    }

    /**
     * Attributes supported as an alias for this user pool.
     *
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     * @param aliasAttributes Attributes supported as an alias for this user pool. 
     */
    override fun aliasAttributes(vararg aliasAttributes: String): Unit =
        aliasAttributes(aliasAttributes.toList())

    /**
     * The attributes that you want your user pool to automatically verify.
     *
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify. 
     */
    override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
      cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
    }

    /**
     * The attributes that you want your user pool to automatically verify.
     *
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify. 
     */
    override fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String): Unit =
        autoVerifiedAttributes(autoVerifiedAttributes.toList())

    /**
     * When active, `DeletionProtection` prevents accidental deletion of your user pool.
     *
     * Before you can delete a user pool that you have protected against deletion, you
     * must deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool. 
     */
    override fun deletionProtection(deletionProtection: String) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    override fun deviceConfiguration(deviceConfiguration: IResolvable) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    override fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(DeviceConfigurationProperty.Companion::unwrap))
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * Device remembering or device tracking is a "Remember me on this device" option for user pools
     * that perform authentication with the device key of a trusted device in the back end, instead of
     * a user-provided MFA code. For more information about device authentication, see [Working with
     * user devices in your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * . A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature. For more information, see [Working with
     * devices](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     * @param deviceConfiguration The device-remembering configuration for a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ba3c98bf6a69cd5b04af03f903f98c4287e73fe625f2b789c6bea737ca17dc")
    override
        fun deviceConfiguration(deviceConfiguration: DeviceConfigurationProperty.Builder.() -> Unit):
        Unit = deviceConfiguration(DeviceConfigurationProperty(deviceConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationmessage)
     * @param emailAuthenticationMessage 
     */
    override fun emailAuthenticationMessage(emailAuthenticationMessage: String) {
      cdkBuilder.emailAuthenticationMessage(emailAuthenticationMessage)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationsubject)
     * @param emailAuthenticationSubject 
     */
    override fun emailAuthenticationSubject(emailAuthenticationSubject: String) {
      cdkBuilder.emailAuthenticationSubject(emailAuthenticationSubject)
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    override fun emailConfiguration(emailConfiguration: IResolvable) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    override fun emailConfiguration(emailConfiguration: EmailConfigurationProperty) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(EmailConfigurationProperty.Companion::unwrap))
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     * @param emailConfiguration The email configuration of your user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54c1c70858e1a62cb0aac10d296ec1ddc0a2b81ea7aa388ace4cc2b06d92b352")
    override
        fun emailConfiguration(emailConfiguration: EmailConfigurationProperty.Builder.() -> Unit):
        Unit = emailConfiguration(EmailConfigurationProperty(emailConfiguration))

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
     * @param emailVerificationMessage This parameter is no longer used. 
     */
    override fun emailVerificationMessage(emailVerificationMessage: String) {
      cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
     * @param emailVerificationSubject This parameter is no longer used. 
     */
    override fun emailVerificationSubject(emailVerificationSubject: String) {
      cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    /**
     * Set enabled MFA options on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set `MfaConfiguration` to `OFF` and remove
     * EnabledMfas. MFAs can only be all disabled if `MfaConfiguration` is `OFF` . After you enable
     * `SMS_MFA` , you can only disable it by setting `MfaConfiguration` to `OFF` . Can be one of the
     * following values:
     *
     * * `SMS_MFA` - Enables MFA with SMS for the user pool. To select this option, you must also
     * provide values for `SmsConfiguration` .
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     * * `EMAIL_OTP` - Enables MFA with email for the user pool. To select this option, you must
     * provide values for `EmailConfiguration` and within those, set `EmailSendingAccount` to
     * `DEVELOPER` .
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA` | `EMAIL_OTP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
     * @param enabledMfas Set enabled MFA options on a specified user pool. 
     */
    override fun enabledMfas(enabledMfas: List<String>) {
      cdkBuilder.enabledMfas(enabledMfas)
    }

    /**
     * Set enabled MFA options on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set `MfaConfiguration` to `OFF` and remove
     * EnabledMfas. MFAs can only be all disabled if `MfaConfiguration` is `OFF` . After you enable
     * `SMS_MFA` , you can only disable it by setting `MfaConfiguration` to `OFF` . Can be one of the
     * following values:
     *
     * * `SMS_MFA` - Enables MFA with SMS for the user pool. To select this option, you must also
     * provide values for `SmsConfiguration` .
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     * * `EMAIL_OTP` - Enables MFA with email for the user pool. To select this option, you must
     * provide values for `EmailConfiguration` and within those, set `EmailSendingAccount` to
     * `DEVELOPER` .
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA` | `EMAIL_OTP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
     * @param enabledMfas Set enabled MFA options on a specified user pool. 
     */
    override fun enabledMfas(vararg enabledMfas: String): Unit = enabledMfas(enabledMfas.toList())

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty.Companion::unwrap))
    }

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     * @param lambdaConfig A collection of user pool Lambda triggers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce9ebed52e53df7caf415c831c615f3e079dc4af05892a8d790b56ffbaf46753")
    override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
        lambdaConfig(LambdaConfigProperty(lambdaConfig))

    /**
     * Displays the state of multi-factor authentication (MFA) as on, off, or optional.
     *
     * When `ON` , all users must set up MFA before they can sign in. When `OPTIONAL` , your
     * application must make a client-side determination of whether a user wants to register an MFA
     * device. For user pools with adaptive authentication with threat protection, choose `OPTIONAL` .
     *
     * When `MfaConfiguration` is `OPTIONAL` , managed login doesn't automatically prompt users to
     * set up MFA. Amazon Cognito generates MFA prompts in API responses and in managed login for users
     * who have chosen and configured a preferred MFA factor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
     * @param mfaConfiguration Displays the state of multi-factor authentication (MFA) as on, off,
     * or optional. 
     */
    override fun mfaConfiguration(mfaConfiguration: String) {
      cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    override fun policies(policies: PoliciesProperty) {
      cdkBuilder.policies(policies.let(PoliciesProperty.Companion::unwrap))
    }

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     * @param policies A list of user pool policies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2314ae1357fcdad41bc2dff9235f62b786cb7031cd62319f510d5ece0d71b8d6")
    override fun policies(policies: PoliciesProperty.Builder.() -> Unit): Unit =
        policies(PoliciesProperty(policies))

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    override fun schema(schema: List<Any>) {
      cdkBuilder.schema(schema.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of attributes for the new user pool.
     *
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     * @param schema An array of attributes for the new user pool. 
     */
    override fun schema(vararg schema: Any): Unit = schema(schema.toList())

    /**
     * The contents of the SMS authentication message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
     * @param smsAuthenticationMessage The contents of the SMS authentication message. 
     */
    override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
      cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    override fun smsConfiguration(smsConfiguration: IResolvable) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    override fun smsConfiguration(smsConfiguration: SmsConfigurationProperty) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(SmsConfigurationProperty.Companion::unwrap))
    }

    /**
     * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
     * Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea364adb12244e589a60f32213c0b23b344aaebba234adf4fa4a99113a2d5fe")
    override fun smsConfiguration(smsConfiguration: SmsConfigurationProperty.Builder.() -> Unit):
        Unit = smsConfiguration(SmsConfigurationProperty(smsConfiguration))

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
     * @param smsVerificationMessage This parameter is no longer used. 
     */
    override fun smsVerificationMessage(smsVerificationMessage: String) {
      cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    override fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(UserAttributeUpdateSettingsProperty.Companion::unwrap))
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     * @param userAttributeUpdateSettings The settings for updates to user attributes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7175a49101d9224b2ba59105a9d196736ddf87f371a6727f5f8eb0ed1963bcb")
    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
        Unit =
        userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty(userAttributeUpdateSettings))

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    override fun userPoolAddOns(userPoolAddOns: IResolvable) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    override fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(UserPoolAddOnsProperty.Companion::unwrap))
    }

    /**
     * Contains settings for activation of threat protection, including the operating mode and
     * additional authentication types.
     *
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0bd77391868ae9ce3d79949e6cf67dab1ff5ea9c26501d144ac9963e691697c")
    override fun userPoolAddOns(userPoolAddOns: UserPoolAddOnsProperty.Builder.() -> Unit): Unit =
        userPoolAddOns(UserPoolAddOnsProperty(userPoolAddOns))

    /**
     * A friendly name for your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
     * @param userPoolName A friendly name for your user pool. 
     */
    override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * The tag keys and values to assign to the user pool.
     *
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
     * @param userPoolTags The tag keys and values to assign to the user pool. 
     */
    override fun userPoolTags(userPoolTags: Any) {
      cdkBuilder.userPoolTags(userPoolTags)
    }

    /**
     * The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltier)
     * @param userPoolTier The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` . 
     */
    override fun userPoolTier(userPoolTier: String) {
      cdkBuilder.userPoolTier(userPoolTier)
    }

    /**
     * Specifies whether a user can use an email address or phone number as a username when they
     * sign up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up. 
     */
    override fun usernameAttributes(usernameAttributes: List<String>) {
      cdkBuilder.usernameAttributes(usernameAttributes)
    }

    /**
     * Specifies whether a user can use an email address or phone number as a username when they
     * sign up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up. 
     */
    override fun usernameAttributes(vararg usernameAttributes: String): Unit =
        usernameAttributes(usernameAttributes.toList())

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    override fun usernameConfiguration(usernameConfiguration: IResolvable) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    override fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(UsernameConfigurationProperty.Companion::unwrap))
    }

    /**
     * Sets the case sensitivity option for sign-in usernames.
     *
     * When `CaseSensitive` is `false` (case insensitive), users can sign in with any combination of
     * capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName` , or for
     * email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
     * sensitivity to `false` as a best practice. When usernames and email addresses are case
     * insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a case
     * variation from being assigned to the same attribute for a different user.
     *
     * When `CaseSensitive` is `true` (case sensitive), Amazon Cognito interprets `USERNAME` and
     * `UserName` as distinct users.
     *
     * This configuration is immutable after you set it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5532e61a25d6f32e948ead823d706a13cc63936fd365e336428c65d754fa6931")
    override
        fun usernameConfiguration(usernameConfiguration: UsernameConfigurationProperty.Builder.() -> Unit):
        Unit = usernameConfiguration(UsernameConfigurationProperty(usernameConfiguration))

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    override
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(VerificationMessageTemplateProperty.Companion::unwrap))
    }

    /**
     * The template for the verification message that your user pool delivers to users who set an
     * email address or phone number attribute.
     *
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("562526c03ebc016af3ef3117fb389f2040d3aab89ab5facbe2931bdfdfa0cd7a")
    override
        fun verificationMessageTemplate(verificationMessageTemplate: VerificationMessageTemplateProperty.Builder.() -> Unit):
        Unit =
        verificationMessageTemplate(VerificationMessageTemplateProperty(verificationMessageTemplate))

    /**
     * Sets or displays the authentication domain, typically your user pool domain, that passkey
     * providers must use as a relying party (RP) in their configuration.
     *
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnrelyingpartyid)
     * @param webAuthnRelyingPartyId Sets or displays the authentication domain, typically your user
     * pool domain, that passkey providers must use as a relying party (RP) in their configuration. 
     */
    override fun webAuthnRelyingPartyId(webAuthnRelyingPartyId: String) {
      cdkBuilder.webAuthnRelyingPartyId(webAuthnRelyingPartyId)
    }

    /**
     * When `required` , users can only register and sign in users with passkeys that are capable of
     * [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnuserverification)
     * @param webAuthnUserVerification When `required` , users can only register and sign in users
     * with passkeys that are capable of [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it. 
     */
    override fun webAuthnUserVerification(webAuthnUserVerification: String) {
      cdkBuilder.webAuthnUserVerification(webAuthnUserVerification)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPool.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as software.amazon.awscdk.services.cognito.CfnUserPool
  }

  /**
   * The available verified method a user can use to recover their password when they call
   * `ForgotPassword` .
   *
   * You can use this setting to define a preferred method when a user has more than one method
   * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
   * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
   * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
   * through email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AccountRecoverySettingProperty accountRecoverySettingProperty =
   * AccountRecoverySettingProperty.builder()
   * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
   * .name("name")
   * .priority(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html)
   */
  public interface AccountRecoverySettingProperty {
    /**
     * The list of options and priorities for user message delivery in forgot-password operations.
     *
     * Sets or displays user pool preferences for email or SMS message priority, whether users
     * should fall back to a second delivery method, and whether passwords should only be reset by
     * administrators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms)
     */
    public fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()

    /**
     * A builder for [AccountRecoverySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      public fun recoveryMechanisms(recoveryMechanisms: IResolvable)

      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      public fun recoveryMechanisms(recoveryMechanisms: List<Any>)

      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      public fun recoveryMechanisms(vararg recoveryMechanisms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.builder()

      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      override fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      override fun recoveryMechanisms(recoveryMechanisms: List<Any>) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recoveryMechanisms The list of options and priorities for user message delivery in
       * forgot-password operations.
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       */
      override fun recoveryMechanisms(vararg recoveryMechanisms: Any): Unit =
          recoveryMechanisms(recoveryMechanisms.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty,
    ) : CdkObject(cdkObject),
        AccountRecoverySettingProperty {
      /**
       * The list of options and priorities for user message delivery in forgot-password operations.
       *
       * Sets or displays user pool preferences for email or SMS message priority, whether users
       * should fall back to a second delivery method, and whether passwords should only be reset by
       * administrators.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms)
       */
      override fun recoveryMechanisms(): Any? = unwrap(this).getRecoveryMechanisms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccountRecoverySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty):
          AccountRecoverySettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccountRecoverySettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountRecoverySettingProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty
    }
  }

  /**
   * The settings for administrator creation of users in a user pool.
   *
   * Contains settings for allowing user sign-up, customizing invitation messages to new users, and
   * the amount of time before temporary passwords expire.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AdminCreateUserConfigProperty adminCreateUserConfigProperty =
   * AdminCreateUserConfigProperty.builder()
   * .allowAdminCreateUserOnly(false)
   * .inviteMessageTemplate(InviteMessageTemplateProperty.builder()
   * .emailMessage("emailMessage")
   * .emailSubject("emailSubject")
   * .smsMessage("smsMessage")
   * .build())
   * .unusedAccountValidityDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html)
   */
  public interface AdminCreateUserConfigProperty {
    /**
     * The setting for allowing self-service sign-up.
     *
     * When `true` , only administrators can create new user profiles. When `false` , users can
     * register themselves and create a new user profile with the `SignUp` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
     */
    public fun allowAdminCreateUserOnly(): Any? = unwrap(this).getAllowAdminCreateUserOnly()

    /**
     * The template for the welcome message to new users.
     *
     * This template must include the `{####}` temporary password placeholder if you are creating
     * users with passwords. If your users don't have passwords, you can omit the placeholder.
     *
     * See also [Customizing User Invitation
     * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
     */
    public fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

    /**
     * This parameter is no longer in use.
     *
     * The password expiration limit in days for administrator-created users. When this time
     * expires, the user can't sign in with their temporary password. To reset the account after that
     * time limit, you must call `AdminCreateUser` again, specifying `RESEND` for the `MessageAction`
     * parameter.
     *
     * The default value for this parameter is 7.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
     */
    public fun unusedAccountValidityDays(): Number? = unwrap(this).getUnusedAccountValidityDays()

    /**
     * A builder for [AdminCreateUserConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowAdminCreateUserOnly The setting for allowing self-service sign-up.
       * When `true` , only administrators can create new user profiles. When `false` , users can
       * register themselves and create a new user profile with the `SignUp` operation.
       */
      public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean)

      /**
       * @param allowAdminCreateUserOnly The setting for allowing self-service sign-up.
       * When `true` , only administrators can create new user profiles. When `false` , users can
       * register themselves and create a new user profile with the `SignUp` operation.
       */
      public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable)

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      public fun inviteMessageTemplate(inviteMessageTemplate: IResolvable)

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      public fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty)

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
      public
          fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit)

      /**
       * @param unusedAccountValidityDays This parameter is no longer in use.
       * The password expiration limit in days for administrator-created users. When this time
       * expires, the user can't sign in with their temporary password. To reset the account after that
       * time limit, you must call `AdminCreateUser` again, specifying `RESEND` for the `MessageAction`
       * parameter.
       *
       * The default value for this parameter is 7.
       */
      public fun unusedAccountValidityDays(unusedAccountValidityDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.builder()

      /**
       * @param allowAdminCreateUserOnly The setting for allowing self-service sign-up.
       * When `true` , only administrators can create new user profiles. When `false` , users can
       * register themselves and create a new user profile with the `SignUp` operation.
       */
      override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
        cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
      }

      /**
       * @param allowAdminCreateUserOnly The setting for allowing self-service sign-up.
       * When `true` , only administrators can create new user profiles. When `false` , users can
       * register themselves and create a new user profile with the `SignUp` operation.
       */
      override fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
        cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      override fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
        cdkBuilder.inviteMessageTemplate(inviteMessageTemplate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      override fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty) {
        cdkBuilder.inviteMessageTemplate(inviteMessageTemplate.let(InviteMessageTemplateProperty.Companion::unwrap))
      }

      /**
       * @param inviteMessageTemplate The template for the welcome message to new users.
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38297d4306f52423c4829c35a479cbb5637fb1fab09e621dfe29a31956988a22")
      override
          fun inviteMessageTemplate(inviteMessageTemplate: InviteMessageTemplateProperty.Builder.() -> Unit):
          Unit = inviteMessageTemplate(InviteMessageTemplateProperty(inviteMessageTemplate))

      /**
       * @param unusedAccountValidityDays This parameter is no longer in use.
       * The password expiration limit in days for administrator-created users. When this time
       * expires, the user can't sign in with their temporary password. To reset the account after that
       * time limit, you must call `AdminCreateUser` again, specifying `RESEND` for the `MessageAction`
       * parameter.
       *
       * The default value for this parameter is 7.
       */
      override fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
        cdkBuilder.unusedAccountValidityDays(unusedAccountValidityDays)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty,
    ) : CdkObject(cdkObject),
        AdminCreateUserConfigProperty {
      /**
       * The setting for allowing self-service sign-up.
       *
       * When `true` , only administrators can create new user profiles. When `false` , users can
       * register themselves and create a new user profile with the `SignUp` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
       */
      override fun allowAdminCreateUserOnly(): Any? = unwrap(this).getAllowAdminCreateUserOnly()

      /**
       * The template for the welcome message to new users.
       *
       * This template must include the `{####}` temporary password placeholder if you are creating
       * users with passwords. If your users don't have passwords, you can omit the placeholder.
       *
       * See also [Customizing User Invitation
       * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
       */
      override fun inviteMessageTemplate(): Any? = unwrap(this).getInviteMessageTemplate()

      /**
       * This parameter is no longer in use.
       *
       * The password expiration limit in days for administrator-created users. When this time
       * expires, the user can't sign in with their temporary password. To reset the account after that
       * time limit, you must call `AdminCreateUser` again, specifying `RESEND` for the `MessageAction`
       * parameter.
       *
       * The default value for this parameter is 7.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
       */
      override fun unusedAccountValidityDays(): Number? =
          unwrap(this).getUnusedAccountValidityDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdminCreateUserConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty):
          AdminCreateUserConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdminCreateUserConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdminCreateUserConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty
    }
  }

  /**
   * Threat protection configuration options for additional authentication types in your user pool,
   * including custom authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AdvancedSecurityAdditionalFlowsProperty advancedSecurityAdditionalFlowsProperty =
   * AdvancedSecurityAdditionalFlowsProperty.builder()
   * .customAuthMode("customAuthMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-advancedsecurityadditionalflows.html)
   */
  public interface AdvancedSecurityAdditionalFlowsProperty {
    /**
     * The operating mode of threat protection in custom authentication with [Custom authentication
     * challenge Lambda
     * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-advancedsecurityadditionalflows.html#cfn-cognito-userpool-advancedsecurityadditionalflows-customauthmode)
     */
    public fun customAuthMode(): String? = unwrap(this).getCustomAuthMode()

    /**
     * A builder for [AdvancedSecurityAdditionalFlowsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customAuthMode The operating mode of threat protection in custom authentication with
       * [Custom authentication challenge Lambda
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      public fun customAuthMode(customAuthMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty.builder()

      /**
       * @param customAuthMode The operating mode of threat protection in custom authentication with
       * [Custom authentication challenge Lambda
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      override fun customAuthMode(customAuthMode: String) {
        cdkBuilder.customAuthMode(customAuthMode)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty,
    ) : CdkObject(cdkObject),
        AdvancedSecurityAdditionalFlowsProperty {
      /**
       * The operating mode of threat protection in custom authentication with [Custom
       * authentication challenge Lambda
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-advancedsecurityadditionalflows.html#cfn-cognito-userpool-advancedsecurityadditionalflows-customauthmode)
       */
      override fun customAuthMode(): String? = unwrap(this).getCustomAuthMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedSecurityAdditionalFlowsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty):
          AdvancedSecurityAdditionalFlowsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedSecurityAdditionalFlowsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedSecurityAdditionalFlowsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.AdvancedSecurityAdditionalFlowsProperty
    }
  }

  /**
   * The configuration of a custom email sender Lambda trigger.
   *
   * This trigger routes all email notifications from a user pool to a Lambda function that delivers
   * the message using custom logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CustomEmailSenderProperty customEmailSenderProperty = CustomEmailSenderProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html)
   */
  public interface CustomEmailSenderProperty {
    /**
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
     * trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaarn)
     */
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    /**
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
     * function.
     *
     * Higher-numbered versions add fields that support new features.
     *
     * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaversion)
     */
    public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

    /**
     * A builder for [CustomEmailSenderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       */
      public fun lambdaVersion(lambdaVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty.builder()

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       */
      override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty,
    ) : CdkObject(cdkObject),
        CustomEmailSenderProperty {
      /**
       * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
       * trigger.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaarn)
       */
      override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      /**
       * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
       * function.
       *
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html#cfn-cognito-userpool-customemailsender-lambdaversion)
       */
      override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomEmailSenderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty):
          CustomEmailSenderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomEmailSenderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomEmailSenderProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty
    }
  }

  /**
   * The configuration of a custom SMS sender Lambda trigger.
   *
   * This trigger routes all SMS notifications from a user pool to a Lambda function that delivers
   * the message using custom logic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CustomSMSSenderProperty customSMSSenderProperty = CustomSMSSenderProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html)
   */
  public interface CustomSMSSenderProperty {
    /**
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
     * trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaarn)
     */
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    /**
     * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
     * function.
     *
     * Higher-numbered versions add fields that support new features.
     *
     * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaversion)
     */
    public fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()

    /**
     * A builder for [CustomSMSSenderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       */
      public fun lambdaVersion(lambdaVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty.builder()

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       */
      override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty,
    ) : CdkObject(cdkObject),
        CustomSMSSenderProperty {
      /**
       * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
       * trigger.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaarn)
       */
      override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      /**
       * The user pool trigger version of the request that Amazon Cognito sends to your Lambda
       * function.
       *
       * Higher-numbered versions add fields that support new features.
       *
       * You must use a `LambdaVersion` of `V1_0` with a custom sender function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html#cfn-cognito-userpool-customsmssender-lambdaversion)
       */
      override fun lambdaVersion(): String? = unwrap(this).getLambdaVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomSMSSenderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty):
          CustomSMSSenderProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomSMSSenderProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomSMSSenderProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty
    }
  }

  /**
   * The device-remembering configuration for a user pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * DeviceConfigurationProperty deviceConfigurationProperty = DeviceConfigurationProperty.builder()
   * .challengeRequiredOnNewDevice(false)
   * .deviceOnlyRememberedOnUserPrompt(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html)
   */
  public interface DeviceConfigurationProperty {
    /**
     * When true, a remembered device can sign in with device authentication instead of SMS and
     * time-based one-time password (TOTP) factors for multi-factor authentication (MFA).
     *
     *
     * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
     * have not been confirmed or remembered must still provide a second factor in a user pool that
     * requires MFA.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
     */
    public fun challengeRequiredOnNewDevice(): Any? = unwrap(this).getChallengeRequiredOnNewDevice()

    /**
     * When true, Amazon Cognito doesn't automatically remember a user's device when your app sends
     * a `ConfirmDevice` API request.
     *
     * In your app, create a prompt for your user to choose whether they want to remember their
     * device. Return the user's choice in an `UpdateDeviceStatus` API request.
     *
     * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
     * devices that you register in a `ConfirmDevice` API request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
     */
    public fun deviceOnlyRememberedOnUserPrompt(): Any? =
        unwrap(this).getDeviceOnlyRememberedOnUserPrompt()

    /**
     * A builder for [DeviceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
       * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
       * authentication (MFA).
       *
       * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
       * have not been confirmed or remembered must still provide a second factor in a user pool that
       * requires MFA.
       */
      public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean)

      /**
       * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
       * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
       * authentication (MFA).
       *
       * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
       * have not been confirmed or remembered must still provide a second factor in a user pool that
       * requires MFA.
       */
      public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable)

      /**
       * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
       * remember a user's device when your app sends a `ConfirmDevice` API request.
       * In your app, create a prompt for your user to choose whether they want to remember their
       * device. Return the user's choice in an `UpdateDeviceStatus` API request.
       *
       * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
       * devices that you register in a `ConfirmDevice` API request.
       */
      public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean)

      /**
       * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
       * remember a user's device when your app sends a `ConfirmDevice` API request.
       * In your app, create a prompt for your user to choose whether they want to remember their
       * device. Return the user's choice in an `UpdateDeviceStatus` API request.
       *
       * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
       * devices that you register in a `ConfirmDevice` API request.
       */
      public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.builder()

      /**
       * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
       * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
       * authentication (MFA).
       *
       * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
       * have not been confirmed or remembered must still provide a second factor in a user pool that
       * requires MFA.
       */
      override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
      }

      /**
       * @param challengeRequiredOnNewDevice When true, a remembered device can sign in with device
       * authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor
       * authentication (MFA).
       *
       * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
       * have not been confirmed or remembered must still provide a second factor in a user pool that
       * requires MFA.
       */
      override fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
       * remember a user's device when your app sends a `ConfirmDevice` API request.
       * In your app, create a prompt for your user to choose whether they want to remember their
       * device. Return the user's choice in an `UpdateDeviceStatus` API request.
       *
       * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
       * devices that you register in a `ConfirmDevice` API request.
       */
      override fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
      }

      /**
       * @param deviceOnlyRememberedOnUserPrompt When true, Amazon Cognito doesn't automatically
       * remember a user's device when your app sends a `ConfirmDevice` API request.
       * In your app, create a prompt for your user to choose whether they want to remember their
       * device. Return the user's choice in an `UpdateDeviceStatus` API request.
       *
       * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
       * devices that you register in a `ConfirmDevice` API request.
       */
      override fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty,
    ) : CdkObject(cdkObject),
        DeviceConfigurationProperty {
      /**
       * When true, a remembered device can sign in with device authentication instead of SMS and
       * time-based one-time password (TOTP) factors for multi-factor authentication (MFA).
       *
       *
       * Whether or not `ChallengeRequiredOnNewDevice` is true, users who sign in with devices that
       * have not been confirmed or remembered must still provide a second factor in a user pool that
       * requires MFA.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
       */
      override fun challengeRequiredOnNewDevice(): Any? =
          unwrap(this).getChallengeRequiredOnNewDevice()

      /**
       * When true, Amazon Cognito doesn't automatically remember a user's device when your app
       * sends a `ConfirmDevice` API request.
       *
       * In your app, create a prompt for your user to choose whether they want to remember their
       * device. Return the user's choice in an `UpdateDeviceStatus` API request.
       *
       * When `DeviceOnlyRememberedOnUserPrompt` is `false` , Amazon Cognito immediately remembers
       * devices that you register in a `ConfirmDevice` API request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
       */
      override fun deviceOnlyRememberedOnUserPrompt(): Any? =
          unwrap(this).getDeviceOnlyRememberedOnUserPrompt()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty):
          DeviceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeviceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty
    }
  }

  /**
   * The email configuration of your user pool.
   *
   * The email configuration type sets your preferred sending method, AWS Region, and sender for
   * messages from your user pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * EmailConfigurationProperty emailConfigurationProperty = EmailConfigurationProperty.builder()
   * .configurationSet("configurationSet")
   * .emailSendingAccount("emailSendingAccount")
   * .from("from")
   * .replyToEmailAddress("replyToEmailAddress")
   * .sourceArn("sourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html)
   */
  public interface EmailConfigurationProperty {
    /**
     * The set of configuration rules that can be applied to emails sent using Amazon Simple Email
     * Service.
     *
     * A configuration set is applied to an email by including a reference to the configuration set
     * in the headers of the email. Once applied, all of the rules in that configuration set are
     * applied to the email. Configuration sets can be used to apply the following types of rules to
     * emails:
     *
     * * **Event publishing** - Amazon Simple Email Service can track the number of send, delivery,
     * open, click, bounce, and complaint events for each email sent. Use event publishing to send
     * information about these events to other AWS services such as and Amazon CloudWatch
     * * **IP pool management** - When leasing dedicated IP addresses with Amazon Simple Email
     * Service, you can create groups of IP addresses, called dedicated IP pools. You can then
     * associate the dedicated IP pools with configuration sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
     */
    public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    /**
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email
     * messages, or uses your Amazon Simple Email Service email configuration.
     *
     * Specify one of the following values:
     *
     * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows only a limited number of
     * emails each day for your user pool. For typical production environments, the default email limit
     * is less than the required delivery volume. To achieve a higher delivery volume, specify
     * DEVELOPER to use your Amazon SES email configuration.
     *
     * To look up the email delivery limit for the default option, see
     * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in the *Amazon
     * Cognito Developer Guide* .
     *
     * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the FROM
     * address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the
     * `SourceArn` parameter.
     *
     * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified
     * email address. When you use this option, the email delivery limits are the same limits that
     * apply to your Amazon SES verified email address in your AWS account .
     *
     * If you use this option, provide the ARN of an Amazon SES verified email address for the
     * `SourceArn` parameter.
     *
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon
     * SES on your behalf. When you update your user pool with this option, Amazon Cognito creates a
     * *service-linked role* , which is a type of role in your AWS account . This role contains the
     * permissions that allow you to access Amazon SES and send email messages from your email address.
     * For more information about the service-linked role that Amazon Cognito creates, see [Using
     * Service-Linked Roles for Amazon
     * Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
     * in the *Amazon Cognito Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount)
     */
    public fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

    /**
     * Either the sender’s email address or the sender’s name with their email address.
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
     * You can set a `SourceArn` email from a verified domain only with an API request. You can set
     * a verified email address, but not an address in a verified domain, in the Amazon Cognito
     * console. Amazon Cognito uses the email address that you provide in one of the following ways,
     * depending on the value that you specify for the `EmailSendingAccount` parameter:
     *
     * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom FROM
     * address when it emails your users using its built-in email account.
     * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by calling
     * Amazon SES on your behalf.
     *
     * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of your
     * user pool. Typically, the Region in the `SourceArn` and the user pool Region are the same. For
     * more information, see [Amazon SES email configuration
     * regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
     * in the [Amazon Cognito Developer
     * Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
     */
    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    /**
     * A builder for [EmailConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurationSet The set of configuration rules that can be applied to emails sent
       * using Amazon Simple Email Service.
       * A configuration set is applied to an email by including a reference to the configuration
       * set in the headers of the email. Once applied, all of the rules in that configuration set are
       * applied to the email. Configuration sets can be used to apply the following types of rules to
       * emails:
       *
       * * **Event publishing** - Amazon Simple Email Service can track the number of send,
       * delivery, open, click, bounce, and complaint events for each email sent. Use event publishing
       * to send information about these events to other AWS services such as and Amazon CloudWatch
       * * **IP pool management** - When leasing dedicated IP addresses with Amazon Simple Email
       * Service, you can create groups of IP addresses, called dedicated IP pools. You can then
       * associate the dedicated IP pools with configuration sets.
       */
      public fun configurationSet(configurationSet: String)

      /**
       * @param emailSendingAccount Specifies whether Amazon Cognito uses its built-in functionality
       * to send your users email messages, or uses your Amazon Simple Email Service email
       * configuration.
       * Specify one of the following values:
       *
       * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in email
       * functionality. When you use the default option, Amazon Cognito allows only a limited number of
       * emails each day for your user pool. For typical production environments, the default email
       * limit is less than the required delivery volume. To achieve a higher delivery volume, specify
       * DEVELOPER to use your Amazon SES email configuration.
       *
       * To look up the email delivery limit for the default option, see
       * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in the *Amazon
       * Cognito Developer Guide* .
       *
       * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the FROM
       * address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for
       * the `SourceArn` parameter.
       *
       * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
       * configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified
       * email address. When you use this option, the email delivery limits are the same limits that
       * apply to your Amazon SES verified email address in your AWS account .
       *
       * If you use this option, provide the ARN of an Amazon SES verified email address for the
       * `SourceArn` parameter.
       *
       * Before Amazon Cognito can email your users, it requires additional permissions to call
       * Amazon SES on your behalf. When you update your user pool with this option, Amazon Cognito
       * creates a *service-linked role* , which is a type of role in your AWS account . This role
       * contains the permissions that allow you to access Amazon SES and send email messages from your
       * email address. For more information about the service-linked role that Amazon Cognito creates,
       * see [Using Service-Linked Roles for Amazon
       * Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
       * in the *Amazon Cognito Developer Guide* .
       */
      public fun emailSendingAccount(emailSendingAccount: String)

      /**
       * @param from Either the sender’s email address or the sender’s name with their email
       * address.
       * For example, `testuser&#64;example.com` or `Test User &lt;testuser&#64;example.com&gt;` .
       * This address appears before the body of the email.
       */
      public fun from(from: String)

      /**
       * @param replyToEmailAddress The destination to which the receiver of the email should reply.
       */
      public fun replyToEmailAddress(replyToEmailAddress: String)

      /**
       * @param sourceArn The ARN of a verified email address or an address from a verified domain
       * in Amazon SES.
       * You can set a `SourceArn` email from a verified domain only with an API request. You can
       * set a verified email address, but not an address in a verified domain, in the Amazon Cognito
       * console. Amazon Cognito uses the email address that you provide in one of the following ways,
       * depending on the value that you specify for the `EmailSendingAccount` parameter:
       *
       * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom FROM
       * address when it emails your users using its built-in email account.
       * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
       * calling Amazon SES on your behalf.
       *
       * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of your
       * user pool. Typically, the Region in the `SourceArn` and the user pool Region are the same. For
       * more information, see [Amazon SES email configuration
       * regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
       * in the [Amazon Cognito Developer
       * Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
       * .
       */
      public fun sourceArn(sourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.builder()

      /**
       * @param configurationSet The set of configuration rules that can be applied to emails sent
       * using Amazon Simple Email Service.
       * A configuration set is applied to an email by including a reference to the configuration
       * set in the headers of the email. Once applied, all of the rules in that configuration set are
       * applied to the email. Configuration sets can be used to apply the following types of rules to
       * emails:
       *
       * * **Event publishing** - Amazon Simple Email Service can track the number of send,
       * delivery, open, click, bounce, and complaint events for each email sent. Use event publishing
       * to send information about these events to other AWS services such as and Amazon CloudWatch
       * * **IP pool management** - When leasing dedicated IP addresses with Amazon Simple Email
       * Service, you can create groups of IP addresses, called dedicated IP pools. You can then
       * associate the dedicated IP pools with configuration sets.
       */
      override fun configurationSet(configurationSet: String) {
        cdkBuilder.configurationSet(configurationSet)
      }

      /**
       * @param emailSendingAccount Specifies whether Amazon Cognito uses its built-in functionality
       * to send your users email messages, or uses your Amazon Simple Email Service email
       * configuration.
       * Specify one of the following values:
       *
       * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in email
       * functionality. When you use the default option, Amazon Cognito allows only a limited number of
       * emails each day for your user pool. For typical production environments, the default email
       * limit is less than the required delivery volume. To achieve a higher delivery volume, specify
       * DEVELOPER to use your Amazon SES email configuration.
       *
       * To look up the email delivery limit for the default option, see
       * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in the *Amazon
       * Cognito Developer Guide* .
       *
       * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the FROM
       * address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for
       * the `SourceArn` parameter.
       *
       * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
       * configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified
       * email address. When you use this option, the email delivery limits are the same limits that
       * apply to your Amazon SES verified email address in your AWS account .
       *
       * If you use this option, provide the ARN of an Amazon SES verified email address for the
       * `SourceArn` parameter.
       *
       * Before Amazon Cognito can email your users, it requires additional permissions to call
       * Amazon SES on your behalf. When you update your user pool with this option, Amazon Cognito
       * creates a *service-linked role* , which is a type of role in your AWS account . This role
       * contains the permissions that allow you to access Amazon SES and send email messages from your
       * email address. For more information about the service-linked role that Amazon Cognito creates,
       * see [Using Service-Linked Roles for Amazon
       * Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
       * in the *Amazon Cognito Developer Guide* .
       */
      override fun emailSendingAccount(emailSendingAccount: String) {
        cdkBuilder.emailSendingAccount(emailSendingAccount)
      }

      /**
       * @param from Either the sender’s email address or the sender’s name with their email
       * address.
       * For example, `testuser&#64;example.com` or `Test User &lt;testuser&#64;example.com&gt;` .
       * This address appears before the body of the email.
       */
      override fun from(from: String) {
        cdkBuilder.from(from)
      }

      /**
       * @param replyToEmailAddress The destination to which the receiver of the email should reply.
       */
      override fun replyToEmailAddress(replyToEmailAddress: String) {
        cdkBuilder.replyToEmailAddress(replyToEmailAddress)
      }

      /**
       * @param sourceArn The ARN of a verified email address or an address from a verified domain
       * in Amazon SES.
       * You can set a `SourceArn` email from a verified domain only with an API request. You can
       * set a verified email address, but not an address in a verified domain, in the Amazon Cognito
       * console. Amazon Cognito uses the email address that you provide in one of the following ways,
       * depending on the value that you specify for the `EmailSendingAccount` parameter:
       *
       * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom FROM
       * address when it emails your users using its built-in email account.
       * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
       * calling Amazon SES on your behalf.
       *
       * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of your
       * user pool. Typically, the Region in the `SourceArn` and the user pool Region are the same. For
       * more information, see [Amazon SES email configuration
       * regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
       * in the [Amazon Cognito Developer
       * Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
       * .
       */
      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty,
    ) : CdkObject(cdkObject),
        EmailConfigurationProperty {
      /**
       * The set of configuration rules that can be applied to emails sent using Amazon Simple Email
       * Service.
       *
       * A configuration set is applied to an email by including a reference to the configuration
       * set in the headers of the email. Once applied, all of the rules in that configuration set are
       * applied to the email. Configuration sets can be used to apply the following types of rules to
       * emails:
       *
       * * **Event publishing** - Amazon Simple Email Service can track the number of send,
       * delivery, open, click, bounce, and complaint events for each email sent. Use event publishing
       * to send information about these events to other AWS services such as and Amazon CloudWatch
       * * **IP pool management** - When leasing dedicated IP addresses with Amazon Simple Email
       * Service, you can create groups of IP addresses, called dedicated IP pools. You can then
       * associate the dedicated IP pools with configuration sets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-configurationset)
       */
      override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

      /**
       * Specifies whether Amazon Cognito uses its built-in functionality to send your users email
       * messages, or uses your Amazon Simple Email Service email configuration.
       *
       * Specify one of the following values:
       *
       * * **COGNITO_DEFAULT** - When Amazon Cognito emails your users, it uses its built-in email
       * functionality. When you use the default option, Amazon Cognito allows only a limited number of
       * emails each day for your user pool. For typical production environments, the default email
       * limit is less than the required delivery volume. To achieve a higher delivery volume, specify
       * DEVELOPER to use your Amazon SES email configuration.
       *
       * To look up the email delivery limit for the default option, see
       * [Limits](https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html) in the *Amazon
       * Cognito Developer Guide* .
       *
       * The default FROM address is `no-reply&#64;verificationemail.com` . To customize the FROM
       * address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for
       * the `SourceArn` parameter.
       *
       * * **DEVELOPER** - When Amazon Cognito emails your users, it uses your Amazon SES
       * configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified
       * email address. When you use this option, the email delivery limits are the same limits that
       * apply to your Amazon SES verified email address in your AWS account .
       *
       * If you use this option, provide the ARN of an Amazon SES verified email address for the
       * `SourceArn` parameter.
       *
       * Before Amazon Cognito can email your users, it requires additional permissions to call
       * Amazon SES on your behalf. When you update your user pool with this option, Amazon Cognito
       * creates a *service-linked role* , which is a type of role in your AWS account . This role
       * contains the permissions that allow you to access Amazon SES and send email messages from your
       * email address. For more information about the service-linked role that Amazon Cognito creates,
       * see [Using Service-Linked Roles for Amazon
       * Cognito](https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html)
       * in the *Amazon Cognito Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-emailsendingaccount)
       */
      override fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

      /**
       * Either the sender’s email address or the sender’s name with their email address.
       *
       * For example, `testuser&#64;example.com` or `Test User &lt;testuser&#64;example.com&gt;` .
       * This address appears before the body of the email.
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
       * The ARN of a verified email address or an address from a verified domain in Amazon SES.
       *
       * You can set a `SourceArn` email from a verified domain only with an API request. You can
       * set a verified email address, but not an address in a verified domain, in the Amazon Cognito
       * console. Amazon Cognito uses the email address that you provide in one of the following ways,
       * depending on the value that you specify for the `EmailSendingAccount` parameter:
       *
       * * If you specify `COGNITO_DEFAULT` , Amazon Cognito uses this address as the custom FROM
       * address when it emails your users using its built-in email account.
       * * If you specify `DEVELOPER` , Amazon Cognito emails your users with this address by
       * calling Amazon SES on your behalf.
       *
       * The Region value of the `SourceArn` parameter must indicate a supported AWS Region of your
       * user pool. Typically, the Region in the `SourceArn` and the user pool Region are the same. For
       * more information, see [Amazon SES email configuration
       * regions](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping)
       * in the [Amazon Cognito Developer
       * Guide](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
       */
      override fun sourceArn(): String? = unwrap(this).getSourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty):
          EmailConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty
    }
  }

  /**
   * The template for the welcome message to new users.
   *
   * This template must include the `{####}` temporary password placeholder if you are creating
   * users with passwords. If your users don't have passwords, you can omit the placeholder.
   *
   * See also [Customizing User Invitation
   * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * InviteMessageTemplateProperty inviteMessageTemplateProperty =
   * InviteMessageTemplateProperty.builder()
   * .emailMessage("emailMessage")
   * .emailSubject("emailSubject")
   * .smsMessage("smsMessage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html)
   */
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

    /**
     * A builder for [InviteMessageTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailMessage The message template for email messages.
       * EmailMessage is allowed only if
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is DEVELOPER.
       */
      public fun emailMessage(emailMessage: String)

      /**
       * @param emailSubject The subject line for email messages.
       * EmailSubject is allowed only if
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is DEVELOPER.
       */
      public fun emailSubject(emailSubject: String)

      /**
       * @param smsMessage The message template for SMS messages.
       */
      public fun smsMessage(smsMessage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.builder()

      /**
       * @param emailMessage The message template for email messages.
       * EmailMessage is allowed only if
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is DEVELOPER.
       */
      override fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
      }

      /**
       * @param emailSubject The subject line for email messages.
       * EmailSubject is allowed only if
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is DEVELOPER.
       */
      override fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
      }

      /**
       * @param smsMessage The message template for SMS messages.
       */
      override fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty,
    ) : CdkObject(cdkObject),
        InviteMessageTemplateProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): InviteMessageTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty):
          InviteMessageTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InviteMessageTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InviteMessageTemplateProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty
    }
  }

  /**
   * A collection of user pool Lambda triggers.
   *
   * Amazon Cognito invokes triggers at several possible stages of user pool operations. Triggers
   * can modify the outcome of the operations that invoked them.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
   * .createAuthChallenge("createAuthChallenge")
   * .customEmailSender(CustomEmailSenderProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build())
   * .customMessage("customMessage")
   * .customSmsSender(CustomSMSSenderProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build())
   * .defineAuthChallenge("defineAuthChallenge")
   * .kmsKeyId("kmsKeyId")
   * .postAuthentication("postAuthentication")
   * .postConfirmation("postConfirmation")
   * .preAuthentication("preAuthentication")
   * .preSignUp("preSignUp")
   * .preTokenGeneration("preTokenGeneration")
   * .preTokenGenerationConfig(PreTokenGenerationConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build())
   * .userMigration("userMigration")
   * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html)
   */
  public interface LambdaConfigProperty {
    /**
     * The configuration of a create auth challenge Lambda trigger, one of three triggers in the
     * sequence of the [custom authentication challenge
     * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
     */
    public fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

    /**
     * The configuration of a custom email sender Lambda trigger.
     *
     * This trigger routes all email notifications from a user pool to a Lambda function that
     * delivers the message using custom logic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customemailsender)
     */
    public fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

    /**
     * A custom message Lambda trigger.
     *
     * This trigger is an opportunity to customize all SMS and email messages from your user pool.
     * When a custom message trigger is active, your user pool routes all messages to a Lambda function
     * that returns a runtime-customized message subject and body for your user pool to deliver to a
     * user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
     */
    public fun customMessage(): String? = unwrap(this).getCustomMessage()

    /**
     * The configuration of a custom SMS sender Lambda trigger.
     *
     * This trigger routes all SMS notifications from a user pool to a Lambda function that delivers
     * the message using custom logic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customsmssender)
     */
    public fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

    /**
     * The configuration of a define auth challenge Lambda trigger, one of three triggers in the
     * sequence of the [custom authentication challenge
     * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
     */
    public fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

    /**
     * The ARN of an [KMS
     * key](https://docs.aws.amazon.com//kms/latest/developerguide/concepts.html#master_keys) . Amazon
     * Cognito uses the key to encrypt codes and temporary passwords sent to custom sender Lambda
     * triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The configuration of a [post authentication Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
     * in a user pool. This trigger can take custom actions after a user signs in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
     */
    public fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

    /**
     * The configuration of a [post confirmation Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
     * in a user pool. This trigger can take custom actions after a user confirms their user account
     * and their email address or phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
     */
    public fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

    /**
     * The configuration of a [pre authentication
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
     * in a user pool. This trigger can evaluate and modify user sign-in events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
     */
    public fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

    /**
     * The configuration of a [pre sign-up Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     * in a user pool. This trigger evaluates new users and can bypass confirmation, [link a federated
     * user
     * profile](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html)
     * , or block sign-up requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
     */
    public fun preSignUp(): String? = unwrap(this).getPreSignUp()

    /**
     * The legacy configuration of a [pre token generation Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
     * in a user pool.
     *
     * Set this parameter for legacy purposes. If you also set an ARN in `PreTokenGenerationConfig`
     * , its value must be identical to `PreTokenGeneration` . For new instances of pre token
     * generation triggers, set the `LambdaArn` of `PreTokenGenerationConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration)
     */
    public fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

    /**
     * The detailed configuration of a [pre token generation Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
     * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical to
     * `PreTokenGenerationConfig` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengenerationconfig)
     */
    public fun preTokenGenerationConfig(): Any? = unwrap(this).getPreTokenGenerationConfig()

    /**
     * The configuration of a [migrate user Lambda
     * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
     * in a user pool. This trigger can create user profiles when users sign in or attempt to reset
     * their password with credentials that don't exist yet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration)
     */
    public fun userMigration(): String? = unwrap(this).getUserMigration()

    /**
     * The configuration of a verify auth challenge Lambda trigger, one of three triggers in the
     * sequence of the [custom authentication challenge
     * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
     */
    public fun verifyAuthChallengeResponse(): String? =
        unwrap(this).getVerifyAuthChallengeResponse()

    /**
     * A builder for [LambdaConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param createAuthChallenge The configuration of a create auth challenge Lambda trigger, one
       * of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      public fun createAuthChallenge(createAuthChallenge: String)

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      public fun customEmailSender(customEmailSender: IResolvable)

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      public fun customEmailSender(customEmailSender: CustomEmailSenderProperty)

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
      public fun customEmailSender(customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit)

      /**
       * @param customMessage A custom message Lambda trigger.
       * This trigger is an opportunity to customize all SMS and email messages from your user pool.
       * When a custom message trigger is active, your user pool routes all messages to a Lambda
       * function that returns a runtime-customized message subject and body for your user pool to
       * deliver to a user.
       */
      public fun customMessage(customMessage: String)

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      public fun customSmsSender(customSmsSender: IResolvable)

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      public fun customSmsSender(customSmsSender: CustomSMSSenderProperty)

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
      public fun customSmsSender(customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit)

      /**
       * @param defineAuthChallenge The configuration of a define auth challenge Lambda trigger, one
       * of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      public fun defineAuthChallenge(defineAuthChallenge: String)

      /**
       * @param kmsKeyId The ARN of an [KMS
       * key](https://docs.aws.amazon.com//kms/latest/developerguide/concepts.html#master_keys) .
       * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to custom sender
       * Lambda triggers.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param postAuthentication The configuration of a [post authentication Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
       * in a user pool. This trigger can take custom actions after a user signs in.
       */
      public fun postAuthentication(postAuthentication: String)

      /**
       * @param postConfirmation The configuration of a [post confirmation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
       * in a user pool. This trigger can take custom actions after a user confirms their user account
       * and their email address or phone number.
       */
      public fun postConfirmation(postConfirmation: String)

      /**
       * @param preAuthentication The configuration of a [pre authentication
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
       * in a user pool. This trigger can evaluate and modify user sign-in events.
       */
      public fun preAuthentication(preAuthentication: String)

      /**
       * @param preSignUp The configuration of a [pre sign-up Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
       * in a user pool. This trigger evaluates new users and can bypass confirmation, [link a
       * federated user
       * profile](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html)
       * , or block sign-up requests.
       */
      public fun preSignUp(preSignUp: String)

      /**
       * @param preTokenGeneration The legacy configuration of a [pre token generation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool.
       * Set this parameter for legacy purposes. If you also set an ARN in
       * `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` . For new
       * instances of pre token generation triggers, set the `LambdaArn` of `PreTokenGenerationConfig`
       * .
       */
      public fun preTokenGeneration(preTokenGeneration: String)

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      public fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable)

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      public
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty)

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
      public
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit)

      /**
       * @param userMigration The configuration of a [migrate user Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
       * in a user pool. This trigger can create user profiles when users sign in or attempt to reset
       * their password with credentials that don't exist yet.
       */
      public fun userMigration(userMigration: String)

      /**
       * @param verifyAuthChallengeResponse The configuration of a verify auth challenge Lambda
       * trigger, one of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.builder()

      /**
       * @param createAuthChallenge The configuration of a create auth challenge Lambda trigger, one
       * of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      override fun createAuthChallenge(createAuthChallenge: String) {
        cdkBuilder.createAuthChallenge(createAuthChallenge)
      }

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      override fun customEmailSender(customEmailSender: IResolvable) {
        cdkBuilder.customEmailSender(customEmailSender.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      override fun customEmailSender(customEmailSender: CustomEmailSenderProperty) {
        cdkBuilder.customEmailSender(customEmailSender.let(CustomEmailSenderProperty.Companion::unwrap))
      }

      /**
       * @param customEmailSender The configuration of a custom email sender Lambda trigger.
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7d9e137c25f2c1d15eb3a299c9a56a4b0019d8bba232c57c2e9fb5d5bafb60")
      override
          fun customEmailSender(customEmailSender: CustomEmailSenderProperty.Builder.() -> Unit):
          Unit = customEmailSender(CustomEmailSenderProperty(customEmailSender))

      /**
       * @param customMessage A custom message Lambda trigger.
       * This trigger is an opportunity to customize all SMS and email messages from your user pool.
       * When a custom message trigger is active, your user pool routes all messages to a Lambda
       * function that returns a runtime-customized message subject and body for your user pool to
       * deliver to a user.
       */
      override fun customMessage(customMessage: String) {
        cdkBuilder.customMessage(customMessage)
      }

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      override fun customSmsSender(customSmsSender: IResolvable) {
        cdkBuilder.customSmsSender(customSmsSender.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      override fun customSmsSender(customSmsSender: CustomSMSSenderProperty) {
        cdkBuilder.customSmsSender(customSmsSender.let(CustomSMSSenderProperty.Companion::unwrap))
      }

      /**
       * @param customSmsSender The configuration of a custom SMS sender Lambda trigger.
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54486d32cdda0d945d81186fbb052e94a2a17aa61e72dfffc11105186277a85a")
      override fun customSmsSender(customSmsSender: CustomSMSSenderProperty.Builder.() -> Unit):
          Unit = customSmsSender(CustomSMSSenderProperty(customSmsSender))

      /**
       * @param defineAuthChallenge The configuration of a define auth challenge Lambda trigger, one
       * of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      override fun defineAuthChallenge(defineAuthChallenge: String) {
        cdkBuilder.defineAuthChallenge(defineAuthChallenge)
      }

      /**
       * @param kmsKeyId The ARN of an [KMS
       * key](https://docs.aws.amazon.com//kms/latest/developerguide/concepts.html#master_keys) .
       * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to custom sender
       * Lambda triggers.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param postAuthentication The configuration of a [post authentication Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
       * in a user pool. This trigger can take custom actions after a user signs in.
       */
      override fun postAuthentication(postAuthentication: String) {
        cdkBuilder.postAuthentication(postAuthentication)
      }

      /**
       * @param postConfirmation The configuration of a [post confirmation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
       * in a user pool. This trigger can take custom actions after a user confirms their user account
       * and their email address or phone number.
       */
      override fun postConfirmation(postConfirmation: String) {
        cdkBuilder.postConfirmation(postConfirmation)
      }

      /**
       * @param preAuthentication The configuration of a [pre authentication
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
       * in a user pool. This trigger can evaluate and modify user sign-in events.
       */
      override fun preAuthentication(preAuthentication: String) {
        cdkBuilder.preAuthentication(preAuthentication)
      }

      /**
       * @param preSignUp The configuration of a [pre sign-up Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
       * in a user pool. This trigger evaluates new users and can bypass confirmation, [link a
       * federated user
       * profile](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html)
       * , or block sign-up requests.
       */
      override fun preSignUp(preSignUp: String) {
        cdkBuilder.preSignUp(preSignUp)
      }

      /**
       * @param preTokenGeneration The legacy configuration of a [pre token generation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool.
       * Set this parameter for legacy purposes. If you also set an ARN in
       * `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` . For new
       * instances of pre token generation triggers, set the `LambdaArn` of `PreTokenGenerationConfig`
       * .
       */
      override fun preTokenGeneration(preTokenGeneration: String) {
        cdkBuilder.preTokenGeneration(preTokenGeneration)
      }

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      override fun preTokenGenerationConfig(preTokenGenerationConfig: IResolvable) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      override
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty) {
        cdkBuilder.preTokenGenerationConfig(preTokenGenerationConfig.let(PreTokenGenerationConfigProperty.Companion::unwrap))
      }

      /**
       * @param preTokenGenerationConfig The detailed configuration of a [pre token generation
       * Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c425a8910dea4d16cc4bf204847a407cf8f4e8c879c77e5567cd60d70cc82e0")
      override
          fun preTokenGenerationConfig(preTokenGenerationConfig: PreTokenGenerationConfigProperty.Builder.() -> Unit):
          Unit =
          preTokenGenerationConfig(PreTokenGenerationConfigProperty(preTokenGenerationConfig))

      /**
       * @param userMigration The configuration of a [migrate user Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
       * in a user pool. This trigger can create user profiles when users sign in or attempt to reset
       * their password with credentials that don't exist yet.
       */
      override fun userMigration(userMigration: String) {
        cdkBuilder.userMigration(userMigration)
      }

      /**
       * @param verifyAuthChallengeResponse The configuration of a verify auth challenge Lambda
       * trigger, one of three triggers in the sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       */
      override fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: String) {
        cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty,
    ) : CdkObject(cdkObject),
        LambdaConfigProperty {
      /**
       * The configuration of a create auth challenge Lambda trigger, one of three triggers in the
       * sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
       */
      override fun createAuthChallenge(): String? = unwrap(this).getCreateAuthChallenge()

      /**
       * The configuration of a custom email sender Lambda trigger.
       *
       * This trigger routes all email notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customemailsender)
       */
      override fun customEmailSender(): Any? = unwrap(this).getCustomEmailSender()

      /**
       * A custom message Lambda trigger.
       *
       * This trigger is an opportunity to customize all SMS and email messages from your user pool.
       * When a custom message trigger is active, your user pool routes all messages to a Lambda
       * function that returns a runtime-customized message subject and body for your user pool to
       * deliver to a user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
       */
      override fun customMessage(): String? = unwrap(this).getCustomMessage()

      /**
       * The configuration of a custom SMS sender Lambda trigger.
       *
       * This trigger routes all SMS notifications from a user pool to a Lambda function that
       * delivers the message using custom logic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-customsmssender)
       */
      override fun customSmsSender(): Any? = unwrap(this).getCustomSmsSender()

      /**
       * The configuration of a define auth challenge Lambda trigger, one of three triggers in the
       * sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
       */
      override fun defineAuthChallenge(): String? = unwrap(this).getDefineAuthChallenge()

      /**
       * The ARN of an [KMS
       * key](https://docs.aws.amazon.com//kms/latest/developerguide/concepts.html#master_keys) .
       * Amazon Cognito uses the key to encrypt codes and temporary passwords sent to custom sender
       * Lambda triggers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The configuration of a [post authentication Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
       * in a user pool. This trigger can take custom actions after a user signs in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
       */
      override fun postAuthentication(): String? = unwrap(this).getPostAuthentication()

      /**
       * The configuration of a [post confirmation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
       * in a user pool. This trigger can take custom actions after a user confirms their user account
       * and their email address or phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
       */
      override fun postConfirmation(): String? = unwrap(this).getPostConfirmation()

      /**
       * The configuration of a [pre authentication
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
       * in a user pool. This trigger can evaluate and modify user sign-in events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
       */
      override fun preAuthentication(): String? = unwrap(this).getPreAuthentication()

      /**
       * The configuration of a [pre sign-up Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
       * in a user pool. This trigger evaluates new users and can bypass confirmation, [link a
       * federated user
       * profile](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-identity-federation-consolidate-users.html)
       * , or block sign-up requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
       */
      override fun preSignUp(): String? = unwrap(this).getPreSignUp()

      /**
       * The legacy configuration of a [pre token generation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool.
       *
       * Set this parameter for legacy purposes. If you also set an ARN in
       * `PreTokenGenerationConfig` , its value must be identical to `PreTokenGeneration` . For new
       * instances of pre token generation triggers, set the `LambdaArn` of `PreTokenGenerationConfig`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengeneration)
       */
      override fun preTokenGeneration(): String? = unwrap(this).getPreTokenGeneration()

      /**
       * The detailed configuration of a [pre token generation Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
       * in a user pool. If you also set an ARN in `PreTokenGeneration` , its value must be identical
       * to `PreTokenGenerationConfig` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-pretokengenerationconfig)
       */
      override fun preTokenGenerationConfig(): Any? = unwrap(this).getPreTokenGenerationConfig()

      /**
       * The configuration of a [migrate user Lambda
       * trigger](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
       * in a user pool. This trigger can create user profiles when users sign in or attempt to reset
       * their password with credentials that don't exist yet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-usermigration)
       */
      override fun userMigration(): String? = unwrap(this).getUserMigration()

      /**
       * The configuration of a verify auth challenge Lambda trigger, one of three triggers in the
       * sequence of the [custom authentication challenge
       * triggers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-challenge.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
       */
      override fun verifyAuthChallengeResponse(): String? =
          unwrap(this).getVerifyAuthChallengeResponse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty):
          LambdaConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty
    }
  }

  /**
   * The minimum and maximum values of an attribute that is of the number type, for example
   * `custom:age` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * NumberAttributeConstraintsProperty numberAttributeConstraintsProperty =
   * NumberAttributeConstraintsProperty.builder()
   * .maxValue("maxValue")
   * .minValue("minValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html)
   */
  public interface NumberAttributeConstraintsProperty {
    /**
     * The maximum length of a number attribute value.
     *
     * Must be a number less than or equal to `2^1023` , represented as a string with a length of
     * 131072 characters or fewer.
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

    /**
     * A builder for [NumberAttributeConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxValue The maximum length of a number attribute value.
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
       */
      public fun maxValue(maxValue: String)

      /**
       * @param minValue The minimum value of an attribute that is of the number data type.
       */
      public fun minValue(minValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.builder()

      /**
       * @param maxValue The maximum length of a number attribute value.
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
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

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty,
    ) : CdkObject(cdkObject),
        NumberAttributeConstraintsProperty {
      /**
       * The maximum length of a number attribute value.
       *
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
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
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NumberAttributeConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty):
          NumberAttributeConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NumberAttributeConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberAttributeConstraintsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty
    }
  }

  /**
   * The password policy settings for a user pool, including complexity, history, and length
   * requirements.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * PasswordPolicyProperty passwordPolicyProperty = PasswordPolicyProperty.builder()
   * .minimumLength(123)
   * .passwordHistorySize(123)
   * .requireLowercase(false)
   * .requireNumbers(false)
   * .requireSymbols(false)
   * .requireUppercase(false)
   * .temporaryPasswordValidityDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html)
   */
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
     * The number of previous passwords that you want Amazon Cognito to restrict each user from
     * reusing.
     *
     * Users can't set a password that matches any of `n` previous passwords, where `n` is the value
     * of `PasswordHistorySize` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-passwordhistorysize)
     */
    public fun passwordHistorySize(): Number? = unwrap(this).getPasswordHistorySize()

    /**
     * The requirement in a password policy that users must include at least one lowercase letter in
     * their password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
     */
    public fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

    /**
     * The requirement in a password policy that users must include at least one number in their
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
     */
    public fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

    /**
     * The requirement in a password policy that users must include at least one symbol in their
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
     */
    public fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

    /**
     * The requirement in a password policy that users must include at least one uppercase letter in
     * their password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
     */
    public fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

    /**
     * The number of days a temporary password is valid in the password policy.
     *
     * If the user doesn't sign in during this time, an administrator must reset their password.
     * Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it as a null value and
     * sets `TemporaryPasswordValidityDays` to its default value.
     *
     *
     * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a value
     * for the legacy `UnusedAccountValidityDays` parameter in that user pool.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays)
     */
    public fun temporaryPasswordValidityDays(): Number? =
        unwrap(this).getTemporaryPasswordValidityDays()

    /**
     * A builder for [PasswordPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param minimumLength The minimum length of the password in the policy that you have set.
       * This value can't be less than 6.
       */
      public fun minimumLength(minimumLength: Number)

      /**
       * @param passwordHistorySize The number of previous passwords that you want Amazon Cognito to
       * restrict each user from reusing.
       * Users can't set a password that matches any of `n` previous passwords, where `n` is the
       * value of `PasswordHistorySize` .
       */
      public fun passwordHistorySize(passwordHistorySize: Number)

      /**
       * @param requireLowercase The requirement in a password policy that users must include at
       * least one lowercase letter in their password.
       */
      public fun requireLowercase(requireLowercase: Boolean)

      /**
       * @param requireLowercase The requirement in a password policy that users must include at
       * least one lowercase letter in their password.
       */
      public fun requireLowercase(requireLowercase: IResolvable)

      /**
       * @param requireNumbers The requirement in a password policy that users must include at least
       * one number in their password.
       */
      public fun requireNumbers(requireNumbers: Boolean)

      /**
       * @param requireNumbers The requirement in a password policy that users must include at least
       * one number in their password.
       */
      public fun requireNumbers(requireNumbers: IResolvable)

      /**
       * @param requireSymbols The requirement in a password policy that users must include at least
       * one symbol in their password.
       */
      public fun requireSymbols(requireSymbols: Boolean)

      /**
       * @param requireSymbols The requirement in a password policy that users must include at least
       * one symbol in their password.
       */
      public fun requireSymbols(requireSymbols: IResolvable)

      /**
       * @param requireUppercase The requirement in a password policy that users must include at
       * least one uppercase letter in their password.
       */
      public fun requireUppercase(requireUppercase: Boolean)

      /**
       * @param requireUppercase The requirement in a password policy that users must include at
       * least one uppercase letter in their password.
       */
      public fun requireUppercase(requireUppercase: IResolvable)

      /**
       * @param temporaryPasswordValidityDays The number of days a temporary password is valid in
       * the password policy.
       * If the user doesn't sign in during this time, an administrator must reset their password.
       * Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it as a null value and
       * sets `TemporaryPasswordValidityDays` to its default value.
       *
       *
       * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a value
       * for the legacy `UnusedAccountValidityDays` parameter in that user pool.
       */
      public fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.builder()

      /**
       * @param minimumLength The minimum length of the password in the policy that you have set.
       * This value can't be less than 6.
       */
      override fun minimumLength(minimumLength: Number) {
        cdkBuilder.minimumLength(minimumLength)
      }

      /**
       * @param passwordHistorySize The number of previous passwords that you want Amazon Cognito to
       * restrict each user from reusing.
       * Users can't set a password that matches any of `n` previous passwords, where `n` is the
       * value of `PasswordHistorySize` .
       */
      override fun passwordHistorySize(passwordHistorySize: Number) {
        cdkBuilder.passwordHistorySize(passwordHistorySize)
      }

      /**
       * @param requireLowercase The requirement in a password policy that users must include at
       * least one lowercase letter in their password.
       */
      override fun requireLowercase(requireLowercase: Boolean) {
        cdkBuilder.requireLowercase(requireLowercase)
      }

      /**
       * @param requireLowercase The requirement in a password policy that users must include at
       * least one lowercase letter in their password.
       */
      override fun requireLowercase(requireLowercase: IResolvable) {
        cdkBuilder.requireLowercase(requireLowercase.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requireNumbers The requirement in a password policy that users must include at least
       * one number in their password.
       */
      override fun requireNumbers(requireNumbers: Boolean) {
        cdkBuilder.requireNumbers(requireNumbers)
      }

      /**
       * @param requireNumbers The requirement in a password policy that users must include at least
       * one number in their password.
       */
      override fun requireNumbers(requireNumbers: IResolvable) {
        cdkBuilder.requireNumbers(requireNumbers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requireSymbols The requirement in a password policy that users must include at least
       * one symbol in their password.
       */
      override fun requireSymbols(requireSymbols: Boolean) {
        cdkBuilder.requireSymbols(requireSymbols)
      }

      /**
       * @param requireSymbols The requirement in a password policy that users must include at least
       * one symbol in their password.
       */
      override fun requireSymbols(requireSymbols: IResolvable) {
        cdkBuilder.requireSymbols(requireSymbols.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requireUppercase The requirement in a password policy that users must include at
       * least one uppercase letter in their password.
       */
      override fun requireUppercase(requireUppercase: Boolean) {
        cdkBuilder.requireUppercase(requireUppercase)
      }

      /**
       * @param requireUppercase The requirement in a password policy that users must include at
       * least one uppercase letter in their password.
       */
      override fun requireUppercase(requireUppercase: IResolvable) {
        cdkBuilder.requireUppercase(requireUppercase.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param temporaryPasswordValidityDays The number of days a temporary password is valid in
       * the password policy.
       * If the user doesn't sign in during this time, an administrator must reset their password.
       * Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it as a null value and
       * sets `TemporaryPasswordValidityDays` to its default value.
       *
       *
       * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a value
       * for the legacy `UnusedAccountValidityDays` parameter in that user pool.
       */
      override fun temporaryPasswordValidityDays(temporaryPasswordValidityDays: Number) {
        cdkBuilder.temporaryPasswordValidityDays(temporaryPasswordValidityDays)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty,
    ) : CdkObject(cdkObject),
        PasswordPolicyProperty {
      /**
       * The minimum length of the password in the policy that you have set.
       *
       * This value can't be less than 6.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
       */
      override fun minimumLength(): Number? = unwrap(this).getMinimumLength()

      /**
       * The number of previous passwords that you want Amazon Cognito to restrict each user from
       * reusing.
       *
       * Users can't set a password that matches any of `n` previous passwords, where `n` is the
       * value of `PasswordHistorySize` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-passwordhistorysize)
       */
      override fun passwordHistorySize(): Number? = unwrap(this).getPasswordHistorySize()

      /**
       * The requirement in a password policy that users must include at least one lowercase letter
       * in their password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
       */
      override fun requireLowercase(): Any? = unwrap(this).getRequireLowercase()

      /**
       * The requirement in a password policy that users must include at least one number in their
       * password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
       */
      override fun requireNumbers(): Any? = unwrap(this).getRequireNumbers()

      /**
       * The requirement in a password policy that users must include at least one symbol in their
       * password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
       */
      override fun requireSymbols(): Any? = unwrap(this).getRequireSymbols()

      /**
       * The requirement in a password policy that users must include at least one uppercase letter
       * in their password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
       */
      override fun requireUppercase(): Any? = unwrap(this).getRequireUppercase()

      /**
       * The number of days a temporary password is valid in the password policy.
       *
       * If the user doesn't sign in during this time, an administrator must reset their password.
       * Defaults to `7` . If you submit a value of `0` , Amazon Cognito treats it as a null value and
       * sets `TemporaryPasswordValidityDays` to its default value.
       *
       *
       * When you set `TemporaryPasswordValidityDays` for a user pool, you can no longer set a value
       * for the legacy `UnusedAccountValidityDays` parameter in that user pool.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-temporarypasswordvaliditydays)
       */
      override fun temporaryPasswordValidityDays(): Number? =
          unwrap(this).getTemporaryPasswordValidityDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PasswordPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty):
          PasswordPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? PasswordPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PasswordPolicyProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty
    }
  }

  /**
   * A list of user pool policies.
   *
   * Contains the policy that sets password-complexity requirements.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * PoliciesProperty policiesProperty = PoliciesProperty.builder()
   * .passwordPolicy(PasswordPolicyProperty.builder()
   * .minimumLength(123)
   * .passwordHistorySize(123)
   * .requireLowercase(false)
   * .requireNumbers(false)
   * .requireSymbols(false)
   * .requireUppercase(false)
   * .temporaryPasswordValidityDays(123)
   * .build())
   * .signInPolicy(SignInPolicyProperty.builder()
   * .allowedFirstAuthFactors(List.of("allowedFirstAuthFactors"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html)
   */
  public interface PoliciesProperty {
    /**
     * The password policy settings for a user pool, including complexity, history, and length
     * requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
     */
    public fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()

    /**
     * The policy for allowed types of authentication in a user pool.
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-signinpolicy)
     */
    public fun signInPolicy(): Any? = unwrap(this).getSignInPolicy()

    /**
     * A builder for [PoliciesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      public fun passwordPolicy(passwordPolicy: IResolvable)

      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty)

      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
      public fun passwordPolicy(passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit)

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      public fun signInPolicy(signInPolicy: IResolvable)

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      public fun signInPolicy(signInPolicy: SignInPolicyProperty)

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4637f26ccd21e203837a5784d48af8d868554a3c675006409b05915474aa8d10")
      public fun signInPolicy(signInPolicy: SignInPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.builder()

      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      override fun passwordPolicy(passwordPolicy: IResolvable) {
        cdkBuilder.passwordPolicy(passwordPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      override fun passwordPolicy(passwordPolicy: PasswordPolicyProperty) {
        cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicyProperty.Companion::unwrap))
      }

      /**
       * @param passwordPolicy The password policy settings for a user pool, including complexity,
       * history, and length requirements.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397bfa55c66c4e794868359ddbcc20b3f495bd76ce469f761741f1d76a32bde2")
      override fun passwordPolicy(passwordPolicy: PasswordPolicyProperty.Builder.() -> Unit): Unit =
          passwordPolicy(PasswordPolicyProperty(passwordPolicy))

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      override fun signInPolicy(signInPolicy: IResolvable) {
        cdkBuilder.signInPolicy(signInPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      override fun signInPolicy(signInPolicy: SignInPolicyProperty) {
        cdkBuilder.signInPolicy(signInPolicy.let(SignInPolicyProperty.Companion::unwrap))
      }

      /**
       * @param signInPolicy The policy for allowed types of authentication in a user pool.
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4637f26ccd21e203837a5784d48af8d868554a3c675006409b05915474aa8d10")
      override fun signInPolicy(signInPolicy: SignInPolicyProperty.Builder.() -> Unit): Unit =
          signInPolicy(SignInPolicyProperty(signInPolicy))

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty,
    ) : CdkObject(cdkObject),
        PoliciesProperty {
      /**
       * The password policy settings for a user pool, including complexity, history, and length
       * requirements.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
       */
      override fun passwordPolicy(): Any? = unwrap(this).getPasswordPolicy()

      /**
       * The policy for allowed types of authentication in a user pool.
       *
       * To activate this setting, your user pool must be in the [Essentials
       * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
       * or higher.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-signinpolicy)
       */
      override fun signInPolicy(): Any? = unwrap(this).getSignInPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty):
          PoliciesProperty = CdkObjectWrappers.wrap(cdkObject) as? PoliciesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PoliciesProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty
    }
  }

  /**
   * The properties of a pre token generation Lambda trigger.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * PreTokenGenerationConfigProperty preTokenGenerationConfigProperty =
   * PreTokenGenerationConfigProperty.builder()
   * .lambdaArn("lambdaArn")
   * .lambdaVersion("lambdaVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html)
   */
  public interface PreTokenGenerationConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
     * trigger.
     *
     * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same value.
     * For new instances of pre token generation triggers, set `LambdaArn` .
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

    /**
     * A builder for [PreTokenGenerationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same value.
       * For new instances of pre token generation triggers, set `LambdaArn` .
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       */
      public fun lambdaVersion(lambdaVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty.builder()

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
       * your Lambda trigger.
       * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same value.
       * For new instances of pre token generation triggers, set `LambdaArn` .
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
       * to your Lambda function.
       * Higher-numbered versions add fields that support new features.
       */
      override fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty,
    ) : CdkObject(cdkObject),
        PreTokenGenerationConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the function that you want to assign to your Lambda
       * trigger.
       *
       * This parameter and the `PreTokenGeneration` property of `LambdaConfig` have the same value.
       * For new instances of pre token generation triggers, set `LambdaArn` .
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
      public operator fun invoke(block: Builder.() -> Unit = {}): PreTokenGenerationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty):
          PreTokenGenerationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PreTokenGenerationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PreTokenGenerationConfigProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.PreTokenGenerationConfigProperty
    }
  }

  /**
   * A recovery option for a user.
   *
   * The `AccountRecoverySettingType` data type is an array of this object. Each
   * `RecoveryOptionType` has a priority property that determines whether it is a primary or secondary
   * option.
   *
   * For example, if `verified_email` has a priority of `1` and `verified_phone_number` has a
   * priority of `2` , your user pool sends account-recovery messages to a verified email address but
   * falls back to an SMS message if the user has a verified phone number. The `admin_only` option
   * prevents self-service account recovery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * RecoveryOptionProperty recoveryOptionProperty = RecoveryOptionProperty.builder()
   * .name("name")
   * .priority(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html)
   */
  public interface RecoveryOptionProperty {
    /**
     * The recovery method that this object sets a recovery option for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Your priority preference for using the specified attribute in account recovery.
     *
     * The highest priority is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * A builder for [RecoveryOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The recovery method that this object sets a recovery option for.
       */
      public fun name(name: String)

      /**
       * @param priority Your priority preference for using the specified attribute in account
       * recovery.
       * The highest priority is `1` .
       */
      public fun priority(priority: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.builder()

      /**
       * @param name The recovery method that this object sets a recovery option for.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param priority Your priority preference for using the specified attribute in account
       * recovery.
       * The highest priority is `1` .
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty,
    ) : CdkObject(cdkObject),
        RecoveryOptionProperty {
      /**
       * The recovery method that this object sets a recovery option for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Your priority preference for using the specified attribute in account recovery.
       *
       * The highest priority is `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html#cfn-cognito-userpool-recoveryoption-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecoveryOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty):
          RecoveryOptionProperty = CdkObjectWrappers.wrap(cdkObject) as? RecoveryOptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecoveryOptionProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty
    }
  }

  /**
   * A list of the user attributes and their properties in your user pool.
   *
   * The attribute schema contains standard attributes, custom attributes with a `custom:` prefix,
   * and developer attributes with a `dev:` prefix. For more information, see [User pool
   * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
   * .
   *
   * Developer-only `dev:` attributes are a legacy feature of user pools, and are read-only to all
   * app clients. You can create and update developer-only attributes only with IAM-authenticated API
   * operations. Use app client read/write permissions instead.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * SchemaAttributeProperty schemaAttributeProperty = SchemaAttributeProperty.builder()
   * .attributeDataType("attributeDataType")
   * .developerOnlyAttribute(false)
   * .mutable(false)
   * .name("name")
   * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
   * .maxValue("maxValue")
   * .minValue("minValue")
   * .build())
   * .required(false)
   * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
   * .maxLength("maxLength")
   * .minLength("minLength")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
   */
  public interface SchemaAttributeProperty {
    /**
     * The data format of the values for your attribute.
     *
     * When you choose an `AttributeDataType` , Amazon Cognito validates the input against the data
     * type. A custom attribute value in your user's ID token is always a string, for example
     * `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
     */
    public fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

    /**
     * You should use
     * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
     * in the user pool client to control how attributes can be mutated for new use cases instead of
     * using `DeveloperOnlyAttribute` .
     *
     * Specifies whether the attribute type is developer only. This attribute can only be modified
     * by an administrator. Users won't be able to modify this attribute using their access token. For
     * example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but can't be
     * updated using UpdateUserAttributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
     */
    public fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

    /**
     * Specifies whether the value of the attribute can be changed.
     *
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
     * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to your
     * application through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it
     * attempts to update the attribute. For more information, see [Specifying Identity Provider
     * Attribute Mappings for Your User
     * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
     */
    public fun mutable(): Any? = unwrap(this).getMutable()

    /**
     * The name of your user pool attribute.
     *
     * When you create or update a user pool, adding a schema attribute creates a custom or
     * developer-only attribute. When you add an attribute with a `Name` value of `MyAttribute` ,
     * Amazon Cognito creates the custom attribute `custom:MyAttribute` . When `DeveloperOnlyAttribute`
     * is `true` , Amazon Cognito creates your attribute as `dev:MyAttribute` . In an operation that
     * describes a user pool, Amazon Cognito returns this value as `value` for standard attributes,
     * `custom:value` for custom attributes, and `dev:value` for developer-only attributes..
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
     * If the attribute is required and the user doesn't provide a value, registration or sign-in
     * will fail.
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

    /**
     * A builder for [SchemaAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeDataType The data format of the values for your attribute.
       * When you choose an `AttributeDataType` , Amazon Cognito validates the input against the
       * data type. A custom attribute value in your user's ID token is always a string, for example
       * `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
       */
      public fun attributeDataType(attributeDataType: String)

      /**
       * @param developerOnlyAttribute You should use
       * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
       * in the user pool client to control how attributes can be mutated for new use cases instead of
       * using `DeveloperOnlyAttribute` .
       * Specifies whether the attribute type is developer only. This attribute can only be modified
       * by an administrator. Users won't be able to modify this attribute using their access token.
       * For example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but
       * can't be updated using UpdateUserAttributes.
       */
      public fun developerOnlyAttribute(developerOnlyAttribute: Boolean)

      /**
       * @param developerOnlyAttribute You should use
       * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
       * in the user pool client to control how attributes can be mutated for new use cases instead of
       * using `DeveloperOnlyAttribute` .
       * Specifies whether the attribute type is developer only. This attribute can only be modified
       * by an administrator. Users won't be able to modify this attribute using their access token.
       * For example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but
       * can't be updated using UpdateUserAttributes.
       */
      public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable)

      /**
       * @param mutable Specifies whether the value of the attribute can be changed.
       * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
       * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to
       * your application through an IdP. If an attribute is immutable, Amazon Cognito throws an error
       * when it attempts to update the attribute. For more information, see [Specifying Identity
       * Provider Attribute Mappings for Your User
       * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
       * .
       */
      public fun mutable(mutable: Boolean)

      /**
       * @param mutable Specifies whether the value of the attribute can be changed.
       * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
       * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to
       * your application through an IdP. If an attribute is immutable, Amazon Cognito throws an error
       * when it attempts to update the attribute. For more information, see [Specifying Identity
       * Provider Attribute Mappings for Your User
       * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
       * .
       */
      public fun mutable(mutable: IResolvable)

      /**
       * @param name The name of your user pool attribute.
       * When you create or update a user pool, adding a schema attribute creates a custom or
       * developer-only attribute. When you add an attribute with a `Name` value of `MyAttribute` ,
       * Amazon Cognito creates the custom attribute `custom:MyAttribute` . When
       * `DeveloperOnlyAttribute` is `true` , Amazon Cognito creates your attribute as
       * `dev:MyAttribute` . In an operation that describes a user pool, Amazon Cognito returns this
       * value as `value` for standard attributes, `custom:value` for custom attributes, and
       * `dev:value` for developer-only attributes..
       */
      public fun name(name: String)

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable)

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      public
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty)

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
      public
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit)

      /**
       * @param required Specifies whether a user pool attribute is required.
       * If the attribute is required and the user doesn't provide a value, registration or sign-in
       * will fail.
       */
      public fun required(required: Boolean)

      /**
       * @param required Specifies whether a user pool attribute is required.
       * If the attribute is required and the user doesn't provide a value, registration or sign-in
       * will fail.
       */
      public fun required(required: IResolvable)

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable)

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      public
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty)

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
      public
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.builder()

      /**
       * @param attributeDataType The data format of the values for your attribute.
       * When you choose an `AttributeDataType` , Amazon Cognito validates the input against the
       * data type. A custom attribute value in your user's ID token is always a string, for example
       * `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
       */
      override fun attributeDataType(attributeDataType: String) {
        cdkBuilder.attributeDataType(attributeDataType)
      }

      /**
       * @param developerOnlyAttribute You should use
       * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
       * in the user pool client to control how attributes can be mutated for new use cases instead of
       * using `DeveloperOnlyAttribute` .
       * Specifies whether the attribute type is developer only. This attribute can only be modified
       * by an administrator. Users won't be able to modify this attribute using their access token.
       * For example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but
       * can't be updated using UpdateUserAttributes.
       */
      override fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
      }

      /**
       * @param developerOnlyAttribute You should use
       * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
       * in the user pool client to control how attributes can be mutated for new use cases instead of
       * using `DeveloperOnlyAttribute` .
       * Specifies whether the attribute type is developer only. This attribute can only be modified
       * by an administrator. Users won't be able to modify this attribute using their access token.
       * For example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but
       * can't be updated using UpdateUserAttributes.
       */
      override fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mutable Specifies whether the value of the attribute can be changed.
       * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
       * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to
       * your application through an IdP. If an attribute is immutable, Amazon Cognito throws an error
       * when it attempts to update the attribute. For more information, see [Specifying Identity
       * Provider Attribute Mappings for Your User
       * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
       * .
       */
      override fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
      }

      /**
       * @param mutable Specifies whether the value of the attribute can be changed.
       * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
       * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to
       * your application through an IdP. If an attribute is immutable, Amazon Cognito throws an error
       * when it attempts to update the attribute. For more information, see [Specifying Identity
       * Provider Attribute Mappings for Your User
       * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
       * .
       */
      override fun mutable(mutable: IResolvable) {
        cdkBuilder.mutable(mutable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param name The name of your user pool attribute.
       * When you create or update a user pool, adding a schema attribute creates a custom or
       * developer-only attribute. When you add an attribute with a `Name` value of `MyAttribute` ,
       * Amazon Cognito creates the custom attribute `custom:MyAttribute` . When
       * `DeveloperOnlyAttribute` is `true` , Amazon Cognito creates your attribute as
       * `dev:MyAttribute` . In an operation that describes a user pool, Amazon Cognito returns this
       * value as `value` for standard attributes, `custom:value` for custom attributes, and
       * `dev:value` for developer-only attributes..
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      override fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      override
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints.let(NumberAttributeConstraintsProperty.Companion::unwrap))
      }

      /**
       * @param numberAttributeConstraints Specifies the constraints for an attribute of the number
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5d6d36ad43793a320eae4a5a3a75086074c7f0622688e783ff944948317db17")
      override
          fun numberAttributeConstraints(numberAttributeConstraints: NumberAttributeConstraintsProperty.Builder.() -> Unit):
          Unit =
          numberAttributeConstraints(NumberAttributeConstraintsProperty(numberAttributeConstraints))

      /**
       * @param required Specifies whether a user pool attribute is required.
       * If the attribute is required and the user doesn't provide a value, registration or sign-in
       * will fail.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required Specifies whether a user pool attribute is required.
       * If the attribute is required and the user doesn't provide a value, registration or sign-in
       * will fail.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      override fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      override
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints.let(StringAttributeConstraintsProperty.Companion::unwrap))
      }

      /**
       * @param stringAttributeConstraints Specifies the constraints for an attribute of the string
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17300017bb16bdaac29a5b06982973316c96674bb0349c363884b0bded8cfc97")
      override
          fun stringAttributeConstraints(stringAttributeConstraints: StringAttributeConstraintsProperty.Builder.() -> Unit):
          Unit =
          stringAttributeConstraints(StringAttributeConstraintsProperty(stringAttributeConstraints))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty,
    ) : CdkObject(cdkObject),
        SchemaAttributeProperty {
      /**
       * The data format of the values for your attribute.
       *
       * When you choose an `AttributeDataType` , Amazon Cognito validates the input against the
       * data type. A custom attribute value in your user's ID token is always a string, for example
       * `"custom:isMember" : "true"` or `"custom:YearsAsMember" : "12"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
       */
      override fun attributeDataType(): String? = unwrap(this).getAttributeDataType()

      /**
       * You should use
       * [WriteAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes)
       * in the user pool client to control how attributes can be mutated for new use cases instead of
       * using `DeveloperOnlyAttribute` .
       *
       * Specifies whether the attribute type is developer only. This attribute can only be modified
       * by an administrator. Users won't be able to modify this attribute using their access token.
       * For example, `DeveloperOnlyAttribute` can be modified using AdminUpdateUserAttributes but
       * can't be updated using UpdateUserAttributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
       */
      override fun developerOnlyAttribute(): Any? = unwrap(this).getDeveloperOnlyAttribute()

      /**
       * Specifies whether the value of the attribute can be changed.
       *
       * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a
       * parameter value of `true` . Amazon Cognito updates mapped attributes when users sign in to
       * your application through an IdP. If an attribute is immutable, Amazon Cognito throws an error
       * when it attempts to update the attribute. For more information, see [Specifying Identity
       * Provider Attribute Mappings for Your User
       * Pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
       */
      override fun mutable(): Any? = unwrap(this).getMutable()

      /**
       * The name of your user pool attribute.
       *
       * When you create or update a user pool, adding a schema attribute creates a custom or
       * developer-only attribute. When you add an attribute with a `Name` value of `MyAttribute` ,
       * Amazon Cognito creates the custom attribute `custom:MyAttribute` . When
       * `DeveloperOnlyAttribute` is `true` , Amazon Cognito creates your attribute as
       * `dev:MyAttribute` . In an operation that describes a user pool, Amazon Cognito returns this
       * value as `value` for standard attributes, `custom:value` for custom attributes, and
       * `dev:value` for developer-only attributes..
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Specifies the constraints for an attribute of the number type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
       */
      override fun numberAttributeConstraints(): Any? = unwrap(this).getNumberAttributeConstraints()

      /**
       * Specifies whether a user pool attribute is required.
       *
       * If the attribute is required and the user doesn't provide a value, registration or sign-in
       * will fail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()

      /**
       * Specifies the constraints for an attribute of the string type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
       */
      override fun stringAttributeConstraints(): Any? = unwrap(this).getStringAttributeConstraints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty):
          SchemaAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaAttributeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaAttributeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty
    }
  }

  /**
   * The policy for allowed types of authentication in a user pool.
   *
   * To activate this setting, your user pool must be in the [Essentials
   * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
   * or higher.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * SignInPolicyProperty signInPolicyProperty = SignInPolicyProperty.builder()
   * .allowedFirstAuthFactors(List.of("allowedFirstAuthFactors"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-signinpolicy.html)
   */
  public interface SignInPolicyProperty {
    /**
     * The sign-in methods that a user pool supports as the first factor.
     *
     * You can permit users to start authentication with a standard username and password, or with
     * other one-time password and hardware factors.
     *
     * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-signinpolicy.html#cfn-cognito-userpool-signinpolicy-allowedfirstauthfactors)
     */
    public fun allowedFirstAuthFactors(): List<String> = unwrap(this).getAllowedFirstAuthFactors()
        ?: emptyList()

    /**
     * A builder for [SignInPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedFirstAuthFactors The sign-in methods that a user pool supports as the first
       * factor.
       * You can permit users to start authentication with a standard username and password, or with
       * other one-time password and hardware factors.
       *
       * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
       */
      public fun allowedFirstAuthFactors(allowedFirstAuthFactors: List<String>)

      /**
       * @param allowedFirstAuthFactors The sign-in methods that a user pool supports as the first
       * factor.
       * You can permit users to start authentication with a standard username and password, or with
       * other one-time password and hardware factors.
       *
       * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
       */
      public fun allowedFirstAuthFactors(vararg allowedFirstAuthFactors: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty.builder()

      /**
       * @param allowedFirstAuthFactors The sign-in methods that a user pool supports as the first
       * factor.
       * You can permit users to start authentication with a standard username and password, or with
       * other one-time password and hardware factors.
       *
       * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
       */
      override fun allowedFirstAuthFactors(allowedFirstAuthFactors: List<String>) {
        cdkBuilder.allowedFirstAuthFactors(allowedFirstAuthFactors)
      }

      /**
       * @param allowedFirstAuthFactors The sign-in methods that a user pool supports as the first
       * factor.
       * You can permit users to start authentication with a standard username and password, or with
       * other one-time password and hardware factors.
       *
       * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
       */
      override fun allowedFirstAuthFactors(vararg allowedFirstAuthFactors: String): Unit =
          allowedFirstAuthFactors(allowedFirstAuthFactors.toList())

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty,
    ) : CdkObject(cdkObject),
        SignInPolicyProperty {
      /**
       * The sign-in methods that a user pool supports as the first factor.
       *
       * You can permit users to start authentication with a standard username and password, or with
       * other one-time password and hardware factors.
       *
       * Supports values of `EMAIL_OTP` , `SMS_OTP` , `WEB_AUTHN` and `PASSWORD` ,
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-signinpolicy.html#cfn-cognito-userpool-signinpolicy-allowedfirstauthfactors)
       */
      override fun allowedFirstAuthFactors(): List<String> =
          unwrap(this).getAllowedFirstAuthFactors() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignInPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty):
          SignInPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? SignInPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignInPolicyProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.SignInPolicyProperty
    }
  }

  /**
   * User pool configuration for delivery of SMS messages with Amazon Simple Notification Service.
   *
   * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
   * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * SmsConfigurationProperty smsConfigurationProperty = SmsConfigurationProperty.builder()
   * .externalId("externalId")
   * .snsCallerArn("snsCallerArn")
   * .snsRegion("snsRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html)
   */
  public interface SmsConfigurationProperty {
    /**
     * The external ID provides additional security for your IAM role.
     *
     * You can use an `ExternalId` with the IAM role that you use with Amazon SNS to send SMS
     * messages for your user pool. If you provide an `ExternalId` , your Amazon Cognito user pool
     * includes it in the request to assume your IAM role. You can configure the role trust policy to
     * require that Amazon Cognito, and any principal, provide the `ExternalID` . If you use the Amazon
     * Cognito Management Console to create a role for SMS multi-factor authentication (MFA), Amazon
     * Cognito creates a role with the required permissions and a trust policy that demonstrates use of
     * the `ExternalId` .
     *
     * For more information about the `ExternalId` of a role, see [How to use an external ID when
     * granting access to your AWS resources to a third
     * party](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS caller.
     *
     * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to send SMS
     * messages. SMS messages are subject to a [spending
     * limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
     */
    public fun snsCallerArn(): String? = unwrap(this).getSnsCallerArn()

    /**
     * The AWS Region to use with Amazon SNS integration.
     *
     * You can choose the same Region as your user pool, or a supported *Legacy Amazon SNS alternate
     * Region* .
     *
     * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS
     * configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message
     * settings for Amazon Cognito user
     * pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snsregion)
     */
    public fun snsRegion(): String? = unwrap(this).getSnsRegion()

    /**
     * A builder for [SmsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param externalId The external ID provides additional security for your IAM role.
       * You can use an `ExternalId` with the IAM role that you use with Amazon SNS to send SMS
       * messages for your user pool. If you provide an `ExternalId` , your Amazon Cognito user pool
       * includes it in the request to assume your IAM role. You can configure the role trust policy to
       * require that Amazon Cognito, and any principal, provide the `ExternalID` . If you use the
       * Amazon Cognito Management Console to create a role for SMS multi-factor authentication (MFA),
       * Amazon Cognito creates a role with the required permissions and a trust policy that
       * demonstrates use of the `ExternalId` .
       *
       * For more information about the `ExternalId` of a role, see [How to use an external ID when
       * granting access to your AWS resources to a third
       * party](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * .
       */
      public fun externalId(externalId: String)

      /**
       * @param snsCallerArn The Amazon Resource Name (ARN) of the Amazon SNS caller.
       * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
       * SMS messages. SMS messages are subject to a [spending
       * limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
       * .
       */
      public fun snsCallerArn(snsCallerArn: String)

      /**
       * @param snsRegion The AWS Region to use with Amazon SNS integration.
       * You can choose the same Region as your user pool, or a supported *Legacy Amazon SNS
       * alternate Region* .
       *
       * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS
       * configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message
       * settings for Amazon Cognito user
       * pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
       * .
       */
      public fun snsRegion(snsRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.builder()

      /**
       * @param externalId The external ID provides additional security for your IAM role.
       * You can use an `ExternalId` with the IAM role that you use with Amazon SNS to send SMS
       * messages for your user pool. If you provide an `ExternalId` , your Amazon Cognito user pool
       * includes it in the request to assume your IAM role. You can configure the role trust policy to
       * require that Amazon Cognito, and any principal, provide the `ExternalID` . If you use the
       * Amazon Cognito Management Console to create a role for SMS multi-factor authentication (MFA),
       * Amazon Cognito creates a role with the required permissions and a trust policy that
       * demonstrates use of the `ExternalId` .
       *
       * For more information about the `ExternalId` of a role, see [How to use an external ID when
       * granting access to your AWS resources to a third
       * party](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * .
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param snsCallerArn The Amazon Resource Name (ARN) of the Amazon SNS caller.
       * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
       * SMS messages. SMS messages are subject to a [spending
       * limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
       * .
       */
      override fun snsCallerArn(snsCallerArn: String) {
        cdkBuilder.snsCallerArn(snsCallerArn)
      }

      /**
       * @param snsRegion The AWS Region to use with Amazon SNS integration.
       * You can choose the same Region as your user pool, or a supported *Legacy Amazon SNS
       * alternate Region* .
       *
       * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS
       * configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message
       * settings for Amazon Cognito user
       * pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
       * .
       */
      override fun snsRegion(snsRegion: String) {
        cdkBuilder.snsRegion(snsRegion)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty,
    ) : CdkObject(cdkObject),
        SmsConfigurationProperty {
      /**
       * The external ID provides additional security for your IAM role.
       *
       * You can use an `ExternalId` with the IAM role that you use with Amazon SNS to send SMS
       * messages for your user pool. If you provide an `ExternalId` , your Amazon Cognito user pool
       * includes it in the request to assume your IAM role. You can configure the role trust policy to
       * require that Amazon Cognito, and any principal, provide the `ExternalID` . If you use the
       * Amazon Cognito Management Console to create a role for SMS multi-factor authentication (MFA),
       * Amazon Cognito creates a role with the required permissions and a trust policy that
       * demonstrates use of the `ExternalId` .
       *
       * For more information about the `ExternalId` of a role, see [How to use an external ID when
       * granting access to your AWS resources to a third
       * party](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS caller.
       *
       * This is the ARN of the IAM role in your AWS account that Amazon Cognito will use to send
       * SMS messages. SMS messages are subject to a [spending
       * limit](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html)
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
       * Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS
       * configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message
       * settings for Amazon Cognito user
       * pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snsregion)
       */
      override fun snsRegion(): String? = unwrap(this).getSnsRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SmsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty):
          SmsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? SmsConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty
    }
  }

  /**
   * The minimum and maximum length values of an attribute that is of the string type, for example
   * `custom:department` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * StringAttributeConstraintsProperty stringAttributeConstraintsProperty =
   * StringAttributeConstraintsProperty.builder()
   * .maxLength("maxLength")
   * .minLength("minLength")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html)
   */
  public interface StringAttributeConstraintsProperty {
    /**
     * The maximum length of a string attribute value.
     *
     * Must be a number less than or equal to `2^1023` , represented as a string with a length of
     * 131072 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
     */
    public fun maxLength(): String? = unwrap(this).getMaxLength()

    /**
     * The minimum length of a string attribute value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
     */
    public fun minLength(): String? = unwrap(this).getMinLength()

    /**
     * A builder for [StringAttributeConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxLength The maximum length of a string attribute value.
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
       */
      public fun maxLength(maxLength: String)

      /**
       * @param minLength The minimum length of a string attribute value.
       */
      public fun minLength(minLength: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.builder()

      /**
       * @param maxLength The maximum length of a string attribute value.
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
       */
      override fun maxLength(maxLength: String) {
        cdkBuilder.maxLength(maxLength)
      }

      /**
       * @param minLength The minimum length of a string attribute value.
       */
      override fun minLength(minLength: String) {
        cdkBuilder.minLength(minLength)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty,
    ) : CdkObject(cdkObject),
        StringAttributeConstraintsProperty {
      /**
       * The maximum length of a string attribute value.
       *
       * Must be a number less than or equal to `2^1023` , represented as a string with a length of
       * 131072 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
       */
      override fun maxLength(): String? = unwrap(this).getMaxLength()

      /**
       * The minimum length of a string attribute value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
       */
      override fun minLength(): String? = unwrap(this).getMinLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StringAttributeConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty):
          StringAttributeConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StringAttributeConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringAttributeConstraintsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty
    }
  }

  /**
   * The settings for updates to user attributes.
   *
   * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
   * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your users'
   * email address and phone number attributes. For
   * more information, see [Verifying updates to email addresses and phone
   * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * UserAttributeUpdateSettingsProperty userAttributeUpdateSettingsProperty =
   * UserAttributeUpdateSettingsProperty.builder()
   * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html)
   */
  public interface UserAttributeUpdateSettingsProperty {
    /**
     * Requires that your user verifies their email address, phone number, or both before Amazon
     * Cognito updates the value of that attribute.
     *
     * When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the
     * value of the attribute until your user responds to the verification message and confirms the new
     * value.
     *
     * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
     * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
     * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change attribute
     * values can immediately update a user’s `email` or `phone_number` attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html#cfn-cognito-userpool-userattributeupdatesettings-attributesrequireverificationbeforeupdate)
     */
    public fun attributesRequireVerificationBeforeUpdate(): List<String>

    /**
     * A builder for [UserAttributeUpdateSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their
       * email address, phone number, or both before Amazon Cognito updates the value of that
       * attribute. 
       * When you update a user attribute that has this option activated, Amazon Cognito sends a
       * verification message to the new phone number or email address. Amazon Cognito doesn’t change
       * the value of the attribute until your user responds to the verification message and confirms
       * the new value.
       *
       * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
       * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
       * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change
       * attribute values can immediately update a user’s `email` or `phone_number` attribute.
       */
      public
          fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: List<String>)

      /**
       * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their
       * email address, phone number, or both before Amazon Cognito updates the value of that
       * attribute. 
       * When you update a user attribute that has this option activated, Amazon Cognito sends a
       * verification message to the new phone number or email address. Amazon Cognito doesn’t change
       * the value of the attribute until your user responds to the verification message and confirms
       * the new value.
       *
       * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
       * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
       * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change
       * attribute values can immediately update a user’s `email` or `phone_number` attribute.
       */
      public fun attributesRequireVerificationBeforeUpdate(vararg
          attributesRequireVerificationBeforeUpdate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty.builder()

      /**
       * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their
       * email address, phone number, or both before Amazon Cognito updates the value of that
       * attribute. 
       * When you update a user attribute that has this option activated, Amazon Cognito sends a
       * verification message to the new phone number or email address. Amazon Cognito doesn’t change
       * the value of the attribute until your user responds to the verification message and confirms
       * the new value.
       *
       * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
       * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
       * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change
       * attribute values can immediately update a user’s `email` or `phone_number` attribute.
       */
      override
          fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: List<String>) {
        cdkBuilder.attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate)
      }

      /**
       * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their
       * email address, phone number, or both before Amazon Cognito updates the value of that
       * attribute. 
       * When you update a user attribute that has this option activated, Amazon Cognito sends a
       * verification message to the new phone number or email address. Amazon Cognito doesn’t change
       * the value of the attribute until your user responds to the verification message and confirms
       * the new value.
       *
       * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
       * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
       * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change
       * attribute values can immediately update a user’s `email` or `phone_number` attribute.
       */
      override fun attributesRequireVerificationBeforeUpdate(vararg
          attributesRequireVerificationBeforeUpdate: String): Unit =
          attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate.toList())

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty,
    ) : CdkObject(cdkObject),
        UserAttributeUpdateSettingsProperty {
      /**
       * Requires that your user verifies their email address, phone number, or both before Amazon
       * Cognito updates the value of that attribute.
       *
       * When you update a user attribute that has this option activated, Amazon Cognito sends a
       * verification message to the new phone number or email address. Amazon Cognito doesn’t change
       * the value of the attribute until your user responds to the verification message and confirms
       * the new value.
       *
       * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require
       * that your users verify attribute changes before Amazon Cognito updates them. In a user pool
       * where `AttributesRequireVerificationBeforeUpdate` is false, API operations that change
       * attribute values can immediately update a user’s `email` or `phone_number` attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html#cfn-cognito-userpool-userattributeupdatesettings-attributesrequireverificationbeforeupdate)
       */
      override fun attributesRequireVerificationBeforeUpdate(): List<String> =
          unwrap(this).getAttributesRequireVerificationBeforeUpdate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UserAttributeUpdateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty):
          UserAttributeUpdateSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UserAttributeUpdateSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAttributeUpdateSettingsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.UserAttributeUpdateSettingsProperty
    }
  }

  /**
   * User pool add-ons.
   *
   * Contains settings for activation of threat protection. To log user security information but
   * take no action, set to `AUDIT` . To configure automatic security responses to risky traffic to
   * your user pool, set to `ENFORCED` .
   *
   * For more information, see [Adding advanced security to a user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
   * . To activate this setting, your user pool must be on the [Plus
   * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * UserPoolAddOnsProperty userPoolAddOnsProperty = UserPoolAddOnsProperty.builder()
   * .advancedSecurityAdditionalFlows(AdvancedSecurityAdditionalFlowsProperty.builder()
   * .customAuthMode("customAuthMode")
   * .build())
   * .advancedSecurityMode("advancedSecurityMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
   */
  public interface UserPoolAddOnsProperty {
    /**
     * Threat protection configuration options for additional authentication types in your user
     * pool, including custom authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecurityadditionalflows)
     */
    public fun advancedSecurityAdditionalFlows(): Any? =
        unwrap(this).getAdvancedSecurityAdditionalFlows()

    /**
     * The operating mode of threat protection for standard authentication types in your user pool,
     * including username-password and secure remote password (SRP) authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode)
     */
    public fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()

    /**
     * A builder for [UserPoolAddOnsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      public fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: IResolvable)

      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      public
          fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: AdvancedSecurityAdditionalFlowsProperty)

      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c88fdc674109bd078b0a05975904bd69d7fedf2979e8b7013328198e6d479b98")
      public
          fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: AdvancedSecurityAdditionalFlowsProperty.Builder.() -> Unit)

      /**
       * @param advancedSecurityMode The operating mode of threat protection for standard
       * authentication types in your user pool, including username-password and secure remote password
       * (SRP) authentication.
       */
      public fun advancedSecurityMode(advancedSecurityMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.builder()

      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      override fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: IResolvable) {
        cdkBuilder.advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      override
          fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: AdvancedSecurityAdditionalFlowsProperty) {
        cdkBuilder.advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows.let(AdvancedSecurityAdditionalFlowsProperty.Companion::unwrap))
      }

      /**
       * @param advancedSecurityAdditionalFlows Threat protection configuration options for
       * additional authentication types in your user pool, including custom authentication.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c88fdc674109bd078b0a05975904bd69d7fedf2979e8b7013328198e6d479b98")
      override
          fun advancedSecurityAdditionalFlows(advancedSecurityAdditionalFlows: AdvancedSecurityAdditionalFlowsProperty.Builder.() -> Unit):
          Unit =
          advancedSecurityAdditionalFlows(AdvancedSecurityAdditionalFlowsProperty(advancedSecurityAdditionalFlows))

      /**
       * @param advancedSecurityMode The operating mode of threat protection for standard
       * authentication types in your user pool, including username-password and secure remote password
       * (SRP) authentication.
       */
      override fun advancedSecurityMode(advancedSecurityMode: String) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty,
    ) : CdkObject(cdkObject),
        UserPoolAddOnsProperty {
      /**
       * Threat protection configuration options for additional authentication types in your user
       * pool, including custom authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecurityadditionalflows)
       */
      override fun advancedSecurityAdditionalFlows(): Any? =
          unwrap(this).getAdvancedSecurityAdditionalFlows()

      /**
       * The operating mode of threat protection for standard authentication types in your user
       * pool, including username-password and secure remote password (SRP) authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html#cfn-cognito-userpool-userpooladdons-advancedsecuritymode)
       */
      override fun advancedSecurityMode(): String? = unwrap(this).getAdvancedSecurityMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolAddOnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty):
          UserPoolAddOnsProperty = CdkObjectWrappers.wrap(cdkObject) as? UserPoolAddOnsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPoolAddOnsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty
    }
  }

  /**
   * Case sensitivity of the username input for the selected sign-in option.
   *
   * When case sensitivity is set to `False` (case insensitive), users can sign in with any
   * combination of capital and lowercase letters. For example, `username` , `USERNAME` , or `UserName`
   * , or for email, `email&#64;example.com` or `EMaiL&#64;eXamplE.Com` . For most use cases, set case
   * sensitivity to `False` (case insensitive) as a best practice. When usernames and email addresses
   * are case insensitive, Amazon Cognito treats any variation in case as the same user, and prevents a
   * case variation from being assigned to the same attribute for a different user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * UsernameConfigurationProperty usernameConfigurationProperty =
   * UsernameConfigurationProperty.builder()
   * .caseSensitive(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html)
   */
  public interface UsernameConfigurationProperty {
    /**
     * Specifies whether user name case sensitivity will be applied for all users in the user pool
     * through Amazon Cognito APIs.
     *
     * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
     * When usernames and email addresses are case insensitive, users can sign in as the same user when
     * they enter a different capitalization of their user name.
     *
     * Valid values include:
     *
     * * **true** - Enables case sensitivity for all username input. When this option is set to
     * `true` , users must sign in using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * * **false** - Enables case insensitivity for all username input. For example, when this
     * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
     * This option also enables both `preferred_username` and `email` alias to be case insensitive, in
     * addition to the `username` attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive)
     */
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    /**
     * A builder for [UsernameConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caseSensitive Specifies whether user name case sensitivity will be applied for all
       * users in the user pool through Amazon Cognito APIs.
       * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
       * When usernames and email addresses are case insensitive, users can sign in as the same user
       * when they enter a different capitalization of their user name.
       *
       * Valid values include:
       *
       * * **true** - Enables case sensitivity for all username input. When this option is set to
       * `true` , users must sign in using the exact capitalization of their given username, such as
       * “UserName”. This is the default value.
       * * **false** - Enables case insensitivity for all username input. For example, when this
       * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
       * This option also enables both `preferred_username` and `email` alias to be case insensitive,
       * in addition to the `username` attribute.
       */
      public fun caseSensitive(caseSensitive: Boolean)

      /**
       * @param caseSensitive Specifies whether user name case sensitivity will be applied for all
       * users in the user pool through Amazon Cognito APIs.
       * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
       * When usernames and email addresses are case insensitive, users can sign in as the same user
       * when they enter a different capitalization of their user name.
       *
       * Valid values include:
       *
       * * **true** - Enables case sensitivity for all username input. When this option is set to
       * `true` , users must sign in using the exact capitalization of their given username, such as
       * “UserName”. This is the default value.
       * * **false** - Enables case insensitivity for all username input. For example, when this
       * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
       * This option also enables both `preferred_username` and `email` alias to be case insensitive,
       * in addition to the `username` attribute.
       */
      public fun caseSensitive(caseSensitive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty.builder()

      /**
       * @param caseSensitive Specifies whether user name case sensitivity will be applied for all
       * users in the user pool through Amazon Cognito APIs.
       * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
       * When usernames and email addresses are case insensitive, users can sign in as the same user
       * when they enter a different capitalization of their user name.
       *
       * Valid values include:
       *
       * * **true** - Enables case sensitivity for all username input. When this option is set to
       * `true` , users must sign in using the exact capitalization of their given username, such as
       * “UserName”. This is the default value.
       * * **false** - Enables case insensitivity for all username input. For example, when this
       * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
       * This option also enables both `preferred_username` and `email` alias to be case insensitive,
       * in addition to the `username` attribute.
       */
      override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      /**
       * @param caseSensitive Specifies whether user name case sensitivity will be applied for all
       * users in the user pool through Amazon Cognito APIs.
       * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
       * When usernames and email addresses are case insensitive, users can sign in as the same user
       * when they enter a different capitalization of their user name.
       *
       * Valid values include:
       *
       * * **true** - Enables case sensitivity for all username input. When this option is set to
       * `true` , users must sign in using the exact capitalization of their given username, such as
       * “UserName”. This is the default value.
       * * **false** - Enables case insensitivity for all username input. For example, when this
       * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
       * This option also enables both `preferred_username` and `email` alias to be case insensitive,
       * in addition to the `username` attribute.
       */
      override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty,
    ) : CdkObject(cdkObject),
        UsernameConfigurationProperty {
      /**
       * Specifies whether user name case sensitivity will be applied for all users in the user pool
       * through Amazon Cognito APIs.
       *
       * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice.
       * When usernames and email addresses are case insensitive, users can sign in as the same user
       * when they enter a different capitalization of their user name.
       *
       * Valid values include:
       *
       * * **true** - Enables case sensitivity for all username input. When this option is set to
       * `true` , users must sign in using the exact capitalization of their given username, such as
       * “UserName”. This is the default value.
       * * **false** - Enables case insensitivity for all username input. For example, when this
       * option is set to `false` , users can sign in using `username` , `USERNAME` , or `UserName` .
       * This option also enables both `preferred_username` and `email` alias to be case insensitive,
       * in addition to the `username` attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html#cfn-cognito-userpool-usernameconfiguration-casesensitive)
       */
      override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UsernameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty):
          UsernameConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UsernameConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UsernameConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty
    }
  }

  /**
   * The template for the verification message that your user pool delivers to users who set an
   * email address or phone number attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * VerificationMessageTemplateProperty verificationMessageTemplateProperty =
   * VerificationMessageTemplateProperty.builder()
   * .defaultEmailOption("defaultEmailOption")
   * .emailMessage("emailMessage")
   * .emailMessageByLink("emailMessageByLink")
   * .emailSubject("emailSubject")
   * .emailSubjectByLink("emailSubjectByLink")
   * .smsMessage("smsMessage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
   */
  public interface VerificationMessageTemplateProperty {
    /**
     * The configuration of verification emails to contain a clickable link or a verification code.
     *
     * For link, your template body must contain link text in the format `{##Click here##}` . "Click
     * here" in the example is a customizable string. For code, your template body must contain a code
     * placeholder in the format `{####}` .
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
     * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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
     * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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
     * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject)
     */
    public fun emailSubject(): String? = unwrap(this).getEmailSubject()

    /**
     * The subject line for the email message template for sending a confirmation link to the user.
     *
     * You can set an `EmailSubjectByLink` template only if the value of
     * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
     * is `DEVELOPER` . When your
     * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
     * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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

    /**
     * A builder for [VerificationMessageTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultEmailOption The configuration of verification emails to contain a clickable
       * link or a verification code.
       * For link, your template body must contain link text in the format `{##Click here##}` .
       * "Click here" in the example is a customizable string. For code, your template body must
       * contain a code placeholder in the format `{####}` .
       */
      public fun defaultEmailOption(defaultEmailOption: String)

      /**
       * @param emailMessage The template for email messages that Amazon Cognito sends to your
       * users.
       * You can set an `EmailMessage` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      public fun emailMessage(emailMessage: String)

      /**
       * @param emailMessageByLink The email message template for sending a confirmation link to the
       * user.
       * You can set an `EmailMessageByLink` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      public fun emailMessageByLink(emailMessageByLink: String)

      /**
       * @param emailSubject The subject line for the email message template.
       * You can set an `EmailSubject` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      public fun emailSubject(emailSubject: String)

      /**
       * @param emailSubjectByLink The subject line for the email message template for sending a
       * confirmation link to the user.
       * You can set an `EmailSubjectByLink` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      public fun emailSubjectByLink(emailSubjectByLink: String)

      /**
       * @param smsMessage The template for SMS messages that Amazon Cognito sends to your users.
       */
      public fun smsMessage(smsMessage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.builder()

      /**
       * @param defaultEmailOption The configuration of verification emails to contain a clickable
       * link or a verification code.
       * For link, your template body must contain link text in the format `{##Click here##}` .
       * "Click here" in the example is a customizable string. For code, your template body must
       * contain a code placeholder in the format `{####}` .
       */
      override fun defaultEmailOption(defaultEmailOption: String) {
        cdkBuilder.defaultEmailOption(defaultEmailOption)
      }

      /**
       * @param emailMessage The template for email messages that Amazon Cognito sends to your
       * users.
       * You can set an `EmailMessage` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      override fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
      }

      /**
       * @param emailMessageByLink The email message template for sending a confirmation link to the
       * user.
       * You can set an `EmailMessageByLink` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      override fun emailMessageByLink(emailMessageByLink: String) {
        cdkBuilder.emailMessageByLink(emailMessageByLink)
      }

      /**
       * @param emailSubject The subject line for the email message template.
       * You can set an `EmailSubject` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      override fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
      }

      /**
       * @param emailSubjectByLink The subject line for the email message template for sending a
       * confirmation link to the user.
       * You can set an `EmailSubjectByLink` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       */
      override fun emailSubjectByLink(emailSubjectByLink: String) {
        cdkBuilder.emailSubjectByLink(emailSubjectByLink)
      }

      /**
       * @param smsMessage The template for SMS messages that Amazon Cognito sends to your users.
       */
      override fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty,
    ) : CdkObject(cdkObject),
        VerificationMessageTemplateProperty {
      /**
       * The configuration of verification emails to contain a clickable link or a verification
       * code.
       *
       * For link, your template body must contain link text in the format `{##Click here##}` .
       * "Click here" in the example is a customizable string. For code, your template body must
       * contain a code placeholder in the format `{####}` .
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
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html#cfn-cognito-userpool-verificationmessagetemplate-emailsubject)
       */
      override fun emailSubject(): String? = unwrap(this).getEmailSubject()

      /**
       * The subject line for the email message template for sending a confirmation link to the
       * user.
       *
       * You can set an `EmailSubjectByLink` template only if the value of
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` . When your
       * [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
       * is `DEVELOPER` , your user pool sends email messages with your own Amazon SES configuration.
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
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VerificationMessageTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty):
          VerificationMessageTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VerificationMessageTemplateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerificationMessageTemplateProperty):
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty
    }
  }
}
