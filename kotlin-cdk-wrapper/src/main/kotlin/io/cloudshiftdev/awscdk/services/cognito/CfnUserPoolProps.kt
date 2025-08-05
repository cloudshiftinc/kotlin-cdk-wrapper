@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserPool`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object userPoolTags;
 * CfnUserPoolProps cfnUserPoolProps = CfnUserPoolProps.builder()
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
public interface CfnUserPoolProps {
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
   */
  public fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

  /**
   * The settings for administrator creation of users in a user pool.
   *
   * Contains settings for allowing user sign-up, customizing invitation messages to new users, and
   * the amount of time before temporary passwords expire.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
   */
  public fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

  /**
   * Attributes supported as an alias for this user pool.
   *
   * For more information about alias attributes, see [Customizing sign-in
   * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
   */
  public fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

  /**
   * The attributes that you want your user pool to automatically verify.
   *
   * For more information, see [Verifying contact information at
   * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
   */
  public fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes() ?:
      emptyList()

  /**
   * When active, `DeletionProtection` prevents accidental deletion of your user pool.
   *
   * Before you can delete a user pool that you have protected against deletion, you
   * must deactivate this feature.
   *
   * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon Cognito
   * returns an `InvalidParameterException` error. To delete a protected user pool, send a new
   * `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
   * request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
   */
  public fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

  /**
   * The device-remembering configuration for a user pool.
   *
   * Device remembering or device tracking is a "Remember me on this device" option for user pools
   * that perform authentication with the device key of a trusted device in the back end, instead of a
   * user-provided MFA code. For more information about device authentication, see [Working with user
   * devices in your user
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
   */
  public fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationmessage)
   */
  public fun emailAuthenticationMessage(): String? = unwrap(this).getEmailAuthenticationMessage()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationsubject)
   */
  public fun emailAuthenticationSubject(): String? = unwrap(this).getEmailAuthenticationSubject()

  /**
   * The email configuration of your user pool.
   *
   * The email configuration type sets your preferred sending method, AWS Region, and sender for
   * messages from your user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
   */
  public fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

  /**
   * This parameter is no longer used.
   *
   * See
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
   */
  public fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

  /**
   * This parameter is no longer used.
   *
   * See
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
   */
  public fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

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
   * provide values for `EmailConfiguration` and within those, set `EmailSendingAccount` to `DEVELOPER`
   * .
   *
   * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA` | `EMAIL_OTP`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
   */
  public fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

  /**
   * A collection of user pool Lambda triggers.
   *
   * Amazon Cognito invokes triggers at several possible stages of authentication operations.
   * Triggers can modify the outcome of the operations that invoked them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
   */
  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * Displays the state of multi-factor authentication (MFA) as on, off, or optional.
   *
   * When `ON` , all users must set up MFA before they can sign in. When `OPTIONAL` , your
   * application must make a client-side determination of whether a user wants to register an MFA
   * device. For user pools with adaptive authentication with threat protection, choose `OPTIONAL` .
   *
   * When `MfaConfiguration` is `OPTIONAL` , managed login doesn't automatically prompt users to set
   * up MFA. Amazon Cognito generates MFA prompts in API responses and in managed login for users who
   * have chosen and configured a preferred MFA factor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
   */
  public fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

  /**
   * A list of user pool policies.
   *
   * Contains the policy that sets password-complexity requirements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

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
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The contents of the SMS authentication message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
   */
  public fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

  /**
   * The settings for your Amazon Cognito user pool to send SMS messages with Amazon Simple
   * Notification Service.
   *
   * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
   * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
   * information see [SMS message
   * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
   */
  public fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

  /**
   * This parameter is no longer used.
   *
   * See
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
   */
  public fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
   */
  public fun userAttributeUpdateSettings(): Any? = unwrap(this).getUserAttributeUpdateSettings()

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
   */
  public fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

  /**
   * A friendly name for your user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
   */
  public fun userPoolName(): String? = unwrap(this).getUserPoolName()

  /**
   * The tag keys and values to assign to the user pool.
   *
   * A tag is a label that you can use to categorize and manage user pools in different ways, such
   * as by purpose, owner, environment, or other criteria.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
   */
  public fun userPoolTags(): Any? = unwrap(this).getUserPoolTags()

  /**
   * The user pool [feature
   * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
   * , or tier. This parameter determines the eligibility of the user pool for features like managed
   * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltier)
   */
  public fun userPoolTier(): String? = unwrap(this).getUserPoolTier()

  /**
   * Specifies whether a user can use an email address or phone number as a username when they sign
   * up.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
   */
  public fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
      emptyList()

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
   */
  public fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

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
   */
  public fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()

  /**
   * Sets or displays the authentication domain, typically your user pool domain, that passkey
   * providers must use as a relying party (RP) in their configuration.
   *
   * Under the following conditions, the passkey relying party ID must be the fully-qualified domain
   * name of your custom domain:
   *
   * * The user pool is configured for passkey authentication.
   * * The user pool has a custom domain, whether or not it also has a prefix domain.
   * * Your application performs authentication with managed login or the classic hosted UI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnrelyingpartyid)
   */
  public fun webAuthnRelyingPartyId(): String? = unwrap(this).getWebAuthnRelyingPartyId()

  /**
   * When `required` , users can only register and sign in users with passkeys that are capable of
   * [user
   * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
   * . When `preferred` , your user pool doesn't require the use of authenticators with user
   * verification but encourages it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnuserverification)
   */
  public fun webAuthnUserVerification(): String? = unwrap(this).getWebAuthnUserVerification()

  /**
   * A builder for [CfnUserPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable)

    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty)

    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit)

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable)

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty)

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit)

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool.
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    public fun aliasAttributes(aliasAttributes: List<String>)

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool.
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    public fun aliasAttributes(vararg aliasAttributes: String)

    /**
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify.
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     */
    public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>)

    /**
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify.
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     */
    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String)

    /**
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool.
     * Before you can delete a user pool that you have protected against deletion, you
     * must deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
     * request.
     */
    public fun deletionProtection(deletionProtection: String)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    public fun deviceConfiguration(deviceConfiguration: IResolvable)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    public fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    public
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param emailAuthenticationMessage the value to be set.
     */
    public fun emailAuthenticationMessage(emailAuthenticationMessage: String)

    /**
     * @param emailAuthenticationSubject the value to be set.
     */
    public fun emailAuthenticationSubject(emailAuthenticationSubject: String)

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    public fun emailConfiguration(emailConfiguration: IResolvable)

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    public fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty)

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ab302803ade9b232feb3b22f11bbb0cd00b4239fc2acac9158d6e2b41c72e64")
    public
        fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit)

    /**
     * @param emailVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    public fun emailVerificationMessage(emailVerificationMessage: String)

    /**
     * @param emailVerificationSubject This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    public fun emailVerificationSubject(emailVerificationSubject: String)

    /**
     * @param enabledMfas Set enabled MFA options on a specified user pool.
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
     */
    public fun enabledMfas(enabledMfas: List<String>)

    /**
     * @param enabledMfas Set enabled MFA options on a specified user pool.
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
     */
    public fun enabledMfas(vararg enabledMfas: String)

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty)

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit)

    /**
     * @param mfaConfiguration Displays the state of multi-factor authentication (MFA) as on, off,
     * or optional.
     * When `ON` , all users must set up MFA before they can sign in. When `OPTIONAL` , your
     * application must make a client-side determination of whether a user wants to register an MFA
     * device. For user pools with adaptive authentication with threat protection, choose `OPTIONAL` .
     *
     * When `MfaConfiguration` is `OPTIONAL` , managed login doesn't automatically prompt users to
     * set up MFA. Amazon Cognito generates MFA prompts in API responses and in managed login for users
     * who have chosen and configured a preferred MFA factor.
     */
    public fun mfaConfiguration(mfaConfiguration: String)

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    public fun policies(policies: CfnUserPool.PoliciesProperty)

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    public fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit)

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    public fun schema(schema: List<Any>)

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    public fun schema(vararg schema: Any)

    /**
     * @param smsAuthenticationMessage The contents of the SMS authentication message.
     */
    public fun smsAuthenticationMessage(smsAuthenticationMessage: String)

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    public fun smsConfiguration(smsConfiguration: IResolvable)

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    public fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty)

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    public
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param smsVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    public fun smsVerificationMessage(smsVerificationMessage: String)

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable)

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty)

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94408e710349a962ce64783c9f093b3b03f8bc22695424bc56fa9ec354684c41")
    public
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder.() -> Unit)

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    public fun userPoolAddOns(userPoolAddOns: IResolvable)

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty)

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit)

    /**
     * @param userPoolName A friendly name for your user pool.
     */
    public fun userPoolName(userPoolName: String)

    /**
     * @param userPoolTags The tag keys and values to assign to the user pool.
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     */
    public fun userPoolTags(userPoolTags: Any)

    /**
     * @param userPoolTier The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
     */
    public fun userPoolTier(userPoolTier: String)

    /**
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up.
     */
    public fun usernameAttributes(usernameAttributes: List<String>)

    /**
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up.
     */
    public fun usernameAttributes(vararg usernameAttributes: String)

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    public fun usernameConfiguration(usernameConfiguration: IResolvable)

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty)

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit)

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable)

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty)

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013e72971088221a7901816ff1cc9a02b7d294abd0f631b7d9bc30cb5c5116a")
    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit)

    /**
     * @param webAuthnRelyingPartyId Sets or displays the authentication domain, typically your user
     * pool domain, that passkey providers must use as a relying party (RP) in their configuration.
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     */
    public fun webAuthnRelyingPartyId(webAuthnRelyingPartyId: String)

    /**
     * @param webAuthnUserVerification When `required` , users can only register and sign in users
     * with passkeys that are capable of [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it.
     */
    public fun webAuthnUserVerification(webAuthnUserVerification: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolProps.builder()

    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(CfnUserPool.AccountRecoverySettingProperty.Companion::unwrap))
    }

    /**
     * @param accountRecoverySetting The available verified method a user can use to recover their
     * password when they call `ForgotPassword` .
     * You can use this setting to define a preferred method when a user has more than one method
     * available. With this setting, SMS doesn't qualify for a valid password recovery mechanism if the
     * user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     * Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred
     * through email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit):
        Unit =
        accountRecoverySetting(CfnUserPool.AccountRecoverySettingProperty(accountRecoverySetting))

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(CfnUserPool.AdminCreateUserConfigProperty.Companion::unwrap))
    }

    /**
     * @param adminCreateUserConfig The settings for administrator creation of users in a user pool.
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit):
        Unit =
        adminCreateUserConfig(CfnUserPool.AdminCreateUserConfigProperty(adminCreateUserConfig))

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool.
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    override fun aliasAttributes(aliasAttributes: List<String>) {
      cdkBuilder.aliasAttributes(aliasAttributes)
    }

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool.
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     */
    override fun aliasAttributes(vararg aliasAttributes: String): Unit =
        aliasAttributes(aliasAttributes.toList())

    /**
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify.
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     */
    override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
      cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
    }

    /**
     * @param autoVerifiedAttributes The attributes that you want your user pool to automatically
     * verify.
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     */
    override fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String): Unit =
        autoVerifiedAttributes(autoVerifiedAttributes.toList())

    /**
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool.
     * Before you can delete a user pool that you have protected against deletion, you
     * must deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
     * request.
     */
    override fun deletionProtection(deletionProtection: String) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    override fun deviceConfiguration(deviceConfiguration: IResolvable) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    override fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(CfnUserPool.DeviceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    override
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit):
        Unit = deviceConfiguration(CfnUserPool.DeviceConfigurationProperty(deviceConfiguration))

    /**
     * @param emailAuthenticationMessage the value to be set.
     */
    override fun emailAuthenticationMessage(emailAuthenticationMessage: String) {
      cdkBuilder.emailAuthenticationMessage(emailAuthenticationMessage)
    }

    /**
     * @param emailAuthenticationSubject the value to be set.
     */
    override fun emailAuthenticationSubject(emailAuthenticationSubject: String) {
      cdkBuilder.emailAuthenticationSubject(emailAuthenticationSubject)
    }

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    override fun emailConfiguration(emailConfiguration: IResolvable) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    override fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(CfnUserPool.EmailConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ab302803ade9b232feb3b22f11bbb0cd00b4239fc2acac9158d6e2b41c72e64")
    override
        fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit):
        Unit = emailConfiguration(CfnUserPool.EmailConfigurationProperty(emailConfiguration))

    /**
     * @param emailVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    override fun emailVerificationMessage(emailVerificationMessage: String) {
      cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    /**
     * @param emailVerificationSubject This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    override fun emailVerificationSubject(emailVerificationSubject: String) {
      cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    /**
     * @param enabledMfas Set enabled MFA options on a specified user pool.
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
     */
    override fun enabledMfas(enabledMfas: List<String>) {
      cdkBuilder.enabledMfas(enabledMfas)
    }

    /**
     * @param enabledMfas Set enabled MFA options on a specified user pool.
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
     */
    override fun enabledMfas(vararg enabledMfas: String): Unit = enabledMfas(enabledMfas.toList())

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnUserPool.LambdaConfigProperty.Companion::unwrap))
    }

    /**
     * @param lambdaConfig A collection of user pool Lambda triggers.
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnUserPool.LambdaConfigProperty(lambdaConfig))

    /**
     * @param mfaConfiguration Displays the state of multi-factor authentication (MFA) as on, off,
     * or optional.
     * When `ON` , all users must set up MFA before they can sign in. When `OPTIONAL` , your
     * application must make a client-side determination of whether a user wants to register an MFA
     * device. For user pools with adaptive authentication with threat protection, choose `OPTIONAL` .
     *
     * When `MfaConfiguration` is `OPTIONAL` , managed login doesn't automatically prompt users to
     * set up MFA. Amazon Cognito generates MFA prompts in API responses and in managed login for users
     * who have chosen and configured a preferred MFA factor.
     */
    override fun mfaConfiguration(mfaConfiguration: String) {
      cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    override fun policies(policies: CfnUserPool.PoliciesProperty) {
      cdkBuilder.policies(policies.let(CfnUserPool.PoliciesProperty.Companion::unwrap))
    }

    /**
     * @param policies A list of user pool policies.
     * Contains the policy that sets password-complexity requirements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    override fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit): Unit =
        policies(CfnUserPool.PoliciesProperty(policies))

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    override fun schema(schema: List<Any>) {
      cdkBuilder.schema(schema.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param schema An array of attributes for the new user pool.
     * You can add custom attributes and modify the properties of default attributes. The
     * specifications in this parameter set the required attributes in your user pool. For more
     * information, see [Working with user
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html)
     * .
     */
    override fun schema(vararg schema: Any): Unit = schema(schema.toList())

    /**
     * @param smsAuthenticationMessage The contents of the SMS authentication message.
     */
    override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
      cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    override fun smsConfiguration(smsConfiguration: IResolvable) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    override fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(CfnUserPool.SmsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param smsConfiguration The settings for your Amazon Cognito user pool to send SMS messages
     * with Amazon Simple Notification Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account . For more
     * information see [SMS message
     * settings](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    override
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit):
        Unit = smsConfiguration(CfnUserPool.SmsConfigurationProperty(smsConfiguration))

    /**
     * @param smsVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     */
    override fun smsVerificationMessage(smsVerificationMessage: String) {
      cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    override fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty) {
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(CfnUserPool.UserAttributeUpdateSettingsProperty.Companion::unwrap))
    }

    /**
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
     * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your
     * users' email address and phone number attributes. For
     * more information, see [Verifying updates to email addresses and phone
     * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94408e710349a962ce64783c9f093b3b03f8bc22695424bc56fa9ec354684c41")
    override
        fun userAttributeUpdateSettings(userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder.() -> Unit):
        Unit =
        userAttributeUpdateSettings(CfnUserPool.UserAttributeUpdateSettingsProperty(userAttributeUpdateSettings))

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    override fun userPoolAddOns(userPoolAddOns: IResolvable) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    override fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(CfnUserPool.UserPoolAddOnsProperty.Companion::unwrap))
    }

    /**
     * @param userPoolAddOns Contains settings for activation of threat protection, including the
     * operating mode and additional authentication types.
     * To log user security information but take no action, set to `AUDIT` . To configure automatic
     * security responses to potentially unwanted traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * . To activate this setting, your user pool must be on the [Plus
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-plus.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    override
        fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit):
        Unit = userPoolAddOns(CfnUserPool.UserPoolAddOnsProperty(userPoolAddOns))

    /**
     * @param userPoolName A friendly name for your user pool.
     */
    override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * @param userPoolTags The tag keys and values to assign to the user pool.
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     */
    override fun userPoolTags(userPoolTags: Any) {
      cdkBuilder.userPoolTags(userPoolTags)
    }

    /**
     * @param userPoolTier The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
     */
    override fun userPoolTier(userPoolTier: String) {
      cdkBuilder.userPoolTier(userPoolTier)
    }

    /**
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up.
     */
    override fun usernameAttributes(usernameAttributes: List<String>) {
      cdkBuilder.usernameAttributes(usernameAttributes)
    }

    /**
     * @param usernameAttributes Specifies whether a user can use an email address or phone number
     * as a username when they sign up.
     */
    override fun usernameAttributes(vararg usernameAttributes: String): Unit =
        usernameAttributes(usernameAttributes.toList())

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    override fun usernameConfiguration(usernameConfiguration: IResolvable) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(CfnUserPool.UsernameConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param usernameConfiguration Sets the case sensitivity option for sign-in usernames.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit):
        Unit =
        usernameConfiguration(CfnUserPool.UsernameConfigurationProperty(usernameConfiguration))

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    override
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(CfnUserPool.VerificationMessageTemplateProperty.Companion::unwrap))
    }

    /**
     * @param verificationMessageTemplate The template for the verification message that your user
     * pool delivers to users who set an email address or phone number attribute.
     * Set the email message type that corresponds to your `DefaultEmailOption` selection. For
     * `CONFIRM_WITH_LINK` , specify an `EmailMessageByLink` and leave `EmailMessage` blank. For
     * `CONFIRM_WITH_CODE` , specify an `EmailMessage` and leave `EmailMessageByLink` blank. When you
     * supply both parameters with either choice, Amazon Cognito returns an error.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013e72971088221a7901816ff1cc9a02b7d294abd0f631b7d9bc30cb5c5116a")
    override
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit):
        Unit =
        verificationMessageTemplate(CfnUserPool.VerificationMessageTemplateProperty(verificationMessageTemplate))

    /**
     * @param webAuthnRelyingPartyId Sets or displays the authentication domain, typically your user
     * pool domain, that passkey providers must use as a relying party (RP) in their configuration.
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     */
    override fun webAuthnRelyingPartyId(webAuthnRelyingPartyId: String) {
      cdkBuilder.webAuthnRelyingPartyId(webAuthnRelyingPartyId)
    }

    /**
     * @param webAuthnUserVerification When `required` , users can only register and sign in users
     * with passkeys that are capable of [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it.
     */
    override fun webAuthnUserVerification(webAuthnUserVerification: String) {
      cdkBuilder.webAuthnUserVerification(webAuthnUserVerification)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolProps {
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
     */
    override fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

    /**
     * The settings for administrator creation of users in a user pool.
     *
     * Contains settings for allowing user sign-up, customizing invitation messages to new users,
     * and the amount of time before temporary passwords expire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     */
    override fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

    /**
     * Attributes supported as an alias for this user pool.
     *
     * For more information about alias attributes, see [Customizing sign-in
     * attributes](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-aliases)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     */
    override fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

    /**
     * The attributes that you want your user pool to automatically verify.
     *
     * For more information, see [Verifying contact information at
     * sign-up](https://docs.aws.amazon.com/cognito/latest/developerguide/signing-up-users-in-your-app.html#allowing-users-to-sign-up-and-confirm-themselves)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     */
    override fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes()
        ?: emptyList()

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
     */
    override fun deletionProtection(): String? = unwrap(this).getDeletionProtection()

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
     */
    override fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationmessage)
     */
    override fun emailAuthenticationMessage(): String? =
        unwrap(this).getEmailAuthenticationMessage()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailauthenticationsubject)
     */
    override fun emailAuthenticationSubject(): String? =
        unwrap(this).getEmailAuthenticationSubject()

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     */
    override fun emailConfiguration(): Any? = unwrap(this).getEmailConfiguration()

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
     */
    override fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
     */
    override fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

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
     */
    override fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

    /**
     * A collection of user pool Lambda triggers.
     *
     * Amazon Cognito invokes triggers at several possible stages of authentication operations.
     * Triggers can modify the outcome of the operations that invoked them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     */
    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

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
     */
    override fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

    /**
     * A list of user pool policies.
     *
     * Contains the policy that sets password-complexity requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

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
     */
    override fun schema(): Any? = unwrap(this).getSchema()

    /**
     * The contents of the SMS authentication message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
     */
    override fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

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
     */
    override fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
     */
    override fun smsVerificationMessage(): String? = unwrap(this).getSmsVerificationMessage()

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
     */
    override fun userAttributeUpdateSettings(): Any? = unwrap(this).getUserAttributeUpdateSettings()

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
     */
    override fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

    /**
     * A friendly name for your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
     */
    override fun userPoolName(): String? = unwrap(this).getUserPoolName()

    /**
     * The tag keys and values to assign to the user pool.
     *
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
     */
    override fun userPoolTags(): Any? = unwrap(this).getUserPoolTags()

    /**
     * The user pool [feature
     * plan](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * , or tier. This parameter determines the eligibility of the user pool for features like managed
     * login, access-token customization, and threat protection. Defaults to `ESSENTIALS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltier)
     */
    override fun userPoolTier(): String? = unwrap(this).getUserPoolTier()

    /**
     * Specifies whether a user can use an email address or phone number as a username when they
     * sign up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     */
    override fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
        emptyList()

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
     */
    override fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

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
     */
    override fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()

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
     */
    override fun webAuthnRelyingPartyId(): String? = unwrap(this).getWebAuthnRelyingPartyId()

    /**
     * When `required` , users can only register and sign in users with passkeys that are capable of
     * [user
     * verification](https://docs.aws.amazon.com/https://www.w3.org/TR/webauthn-2/#enum-userVerificationRequirement)
     * . When `preferred` , your user pool doesn't require the use of authenticators with user
     * verification but encourages it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-webauthnuserverification)
     */
    override fun webAuthnUserVerification(): String? = unwrap(this).getWebAuthnUserVerification()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolProps):
        CfnUserPoolProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.CfnUserPoolProps
  }
}
