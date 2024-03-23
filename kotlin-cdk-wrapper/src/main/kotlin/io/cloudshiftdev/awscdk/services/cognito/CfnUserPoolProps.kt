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
 * .requireLowercase(false)
 * .requireNumbers(false)
 * .requireSymbols(false)
 * .requireUppercase(false)
 * .temporaryPasswordValidityDays(123)
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
 * .advancedSecurityMode("advancedSecurityMode")
 * .build())
 * .userPoolName("userPoolName")
 * .userPoolTags(userPoolTags)
 * .verificationMessageTemplate(VerificationMessageTemplateProperty.builder()
 * .defaultEmailOption("defaultEmailOption")
 * .emailMessage("emailMessage")
 * .emailMessageByLink("emailMessageByLink")
 * .emailSubject("emailSubject")
 * .emailSubjectByLink("emailSubjectByLink")
 * .smsMessage("smsMessage")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
 */
public interface CfnUserPoolProps {
  /**
   * Use this setting to define which verified available method a user can use to recover their
   * password when they call `ForgotPassword` .
   *
   * It allows you to define a preferred method when a user has more than one method available. With
   * this setting, SMS does not qualify for a valid password recovery mechanism if the user also has
   * SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the
   * recovery method where SMS is preferred over email.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
   */
  public fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

  /**
   * The configuration for creating a new user profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
   */
  public fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

  /**
   * Attributes supported as an alias for this user pool. Possible values: *phone_number* , *email*
   * , or *preferred_username* .
   *
   *
   * This user pool property cannot be updated.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
   */
  public fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

  /**
   * The attributes to be auto-verified.
   *
   * Possible values: *email* , *phone_number* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
   */
  public fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes() ?:
      emptyList()

  /**
   * When active, `DeletionProtection` prevents accidental deletion of your user pool.
   *
   * Before you can delete a user pool that you have protected against deletion, you must deactivate
   * this feature.
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
   * A null value indicates that you have deactivated device remembering in your user pool.
   *
   *
   * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
   * device-remembering feature.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
   */
  public fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

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
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
   */
  public fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

  /**
   * This parameter is no longer used.
   *
   * See
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
   */
  public fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

  /**
   * Enables MFA on a specified user pool.
   *
   * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
   * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
   * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
   * values:
   *
   * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
   * configuration is provided.
   * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
   *
   * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
   */
  public fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

  /**
   * The Lambda trigger configuration information for the new user pool.
   *
   *
   * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
   * invoke a function. So you must make an extra call to add permission for these event sources to
   * invoke your Lambda function.
   *
   * For more information on using the Lambda API to add permission, see
   * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
   *
   * For adding permission using the AWS CLI , see
   * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
   */
  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * The multi-factor authentication (MFA) configuration. Valid values include:.
   *
   * * `OFF` MFA won't be used for any users.
   * * `ON` MFA is required for all users to sign in.
   * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor activated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
   */
  public fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

  /**
   * The policy associated with a user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * The schema attributes for the new user pool. These attributes can be standard or custom
   * attributes.
   *
   *
   * During a user pool update, you can add new schema attributes but you cannot modify or delete an
   * existing schema attribute.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * A string representing the SMS authentication message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
   */
  public fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

  /**
   * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an
   * SMS message from your AWS account through Amazon Simple Notification Service.
   *
   * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
   * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
   */
  public fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

  /**
   * This parameter is no longer used.
   *
   * See
   * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
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
   * User pool add-ons.
   *
   * Contains settings for activation of advanced security features. To log user security
   * information but take no action, set to `AUDIT` . To configure automatic security responses to
   * risky traffic to your user pool, set to `ENFORCED` .
   *
   * For more information, see [Adding advanced security to a user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
   */
  public fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

  /**
   * A string used to name the user pool.
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
   * Determines whether email addresses or phone numbers can be specified as user names when a user
   * signs up.
   *
   * Possible values: `phone_number` or `email` .
   *
   * This user pool property cannot be updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
   */
  public fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
      emptyList()

  /**
   * You can choose to set case sensitivity on the username input for the selected sign-in option.
   *
   * For example, when this is set to `False` , users will be able to sign in using either
   * "username" or "Username". This configuration is immutable once it has been set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
   */
  public fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

  /**
   * The template for the verification message that the user sees when the app requests permission
   * to access the user's information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
   */
  public fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()

  /**
   * A builder for [CfnUserPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable)

    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty)

    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    public
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit)

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable)

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty)

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    public
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit)

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     * *phone_number* , *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     */
    public fun aliasAttributes(aliasAttributes: List<String>)

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     * *phone_number* , *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     */
    public fun aliasAttributes(vararg aliasAttributes: String)

    /**
     * @param autoVerifiedAttributes The attributes to be auto-verified.
     * Possible values: *email* , *phone_number* .
     */
    public fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>)

    /**
     * @param autoVerifiedAttributes The attributes to be auto-verified.
     * Possible values: *email* , *phone_number* .
     */
    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String)

    /**
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool.
     * Before you can delete a user pool that you have protected against deletion, you must
     * deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool` API
     * request.
     */
    public fun deletionProtection(deletionProtection: String)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    public fun deviceConfiguration(deviceConfiguration: IResolvable)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    public fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty)

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    public
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit)

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
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     */
    public fun emailVerificationMessage(emailVerificationMessage: String)

    /**
     * @param emailVerificationSubject This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     */
    public fun emailVerificationSubject(emailVerificationSubject: String)

    /**
     * @param enabledMfas Enables MFA on a specified user pool.
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
     * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
     * values:
     *
     * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
     * configuration is provided.
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
     */
    public fun enabledMfas(enabledMfas: List<String>)

    /**
     * @param enabledMfas Enables MFA on a specified user pool.
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
     * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
     * values:
     *
     * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
     * configuration is provided.
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
     */
    public fun enabledMfas(vararg enabledMfas: String)

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty)

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit)

    /**
     * @param mfaConfiguration The multi-factor authentication (MFA) configuration. Valid values
     * include:.
     * * `OFF` MFA won't be used for any users.
     * * `ON` MFA is required for all users to sign in.
     * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor activated.
     */
    public fun mfaConfiguration(mfaConfiguration: String)

    /**
     * @param policies The policy associated with a user pool.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies The policy associated with a user pool.
     */
    public fun policies(policies: CfnUserPool.PoliciesProperty)

    /**
     * @param policies The policy associated with a user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    public fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit)

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    public fun schema(schema: List<Any>)

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    public fun schema(vararg schema: Any)

    /**
     * @param smsAuthenticationMessage A string representing the SMS authentication message.
     */
    public fun smsAuthenticationMessage(smsAuthenticationMessage: String)

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    public fun smsConfiguration(smsConfiguration: IResolvable)

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    public fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty)

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    public
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param smsVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
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
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    public fun userPoolAddOns(userPoolAddOns: IResolvable)

    /**
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty)

    /**
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit)

    /**
     * @param userPoolName A string used to name the user pool.
     */
    public fun userPoolName(userPoolName: String)

    /**
     * @param userPoolTags The tag keys and values to assign to the user pool.
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     */
    public fun userPoolTags(userPoolTags: Any)

    /**
     * @param usernameAttributes Determines whether email addresses or phone numbers can be
     * specified as user names when a user signs up.
     * Possible values: `phone_number` or `email` .
     *
     * This user pool property cannot be updated.
     */
    public fun usernameAttributes(usernameAttributes: List<String>)

    /**
     * @param usernameAttributes Determines whether email addresses or phone numbers can be
     * specified as user names when a user signs up.
     * Possible values: `phone_number` or `email` .
     *
     * This user pool property cannot be updated.
     */
    public fun usernameAttributes(vararg usernameAttributes: String)

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    public fun usernameConfiguration(usernameConfiguration: IResolvable)

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty)

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    public
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit)

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable)

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty)

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013e72971088221a7901816ff1cc9a02b7d294abd0f631b7d9bc30cb5c5116a")
    public
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolProps.builder()

    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    override fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(IResolvable::unwrap))
    }

    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty) {
      cdkBuilder.accountRecoverySetting(accountRecoverySetting.let(CfnUserPool.AccountRecoverySettingProperty::unwrap))
    }

    /**
     * @param accountRecoverySetting Use this setting to define which verified available method a
     * user can use to recover their password when they call `ForgotPassword` .
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59dfa045ce85607f20aa678f020a99ed7b95190a17293c19f2a15c682efca79")
    override
        fun accountRecoverySetting(accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit):
        Unit =
        accountRecoverySetting(CfnUserPool.AccountRecoverySettingProperty(accountRecoverySetting))

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    override fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(IResolvable::unwrap))
    }

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty) {
      cdkBuilder.adminCreateUserConfig(adminCreateUserConfig.let(CfnUserPool.AdminCreateUserConfigProperty::unwrap))
    }

    /**
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f794518daabdad2774e4c8975200c25b556f58d5765e61484e8e043a75a3aa32")
    override
        fun adminCreateUserConfig(adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit):
        Unit =
        adminCreateUserConfig(CfnUserPool.AdminCreateUserConfigProperty(adminCreateUserConfig))

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     * *phone_number* , *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     */
    override fun aliasAttributes(aliasAttributes: List<String>) {
      cdkBuilder.aliasAttributes(aliasAttributes)
    }

    /**
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     * *phone_number* , *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     */
    override fun aliasAttributes(vararg aliasAttributes: String): Unit =
        aliasAttributes(aliasAttributes.toList())

    /**
     * @param autoVerifiedAttributes The attributes to be auto-verified.
     * Possible values: *email* , *phone_number* .
     */
    override fun autoVerifiedAttributes(autoVerifiedAttributes: List<String>) {
      cdkBuilder.autoVerifiedAttributes(autoVerifiedAttributes)
    }

    /**
     * @param autoVerifiedAttributes The attributes to be auto-verified.
     * Possible values: *email* , *phone_number* .
     */
    override fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String): Unit =
        autoVerifiedAttributes(autoVerifiedAttributes.toList())

    /**
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     * your user pool.
     * Before you can delete a user pool that you have protected against deletion, you must
     * deactivate this feature.
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
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    override fun deviceConfiguration(deviceConfiguration: IResolvable) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    override fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty) {
      cdkBuilder.deviceConfiguration(deviceConfiguration.let(CfnUserPool.DeviceConfigurationProperty::unwrap))
    }

    /**
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d479a7df8f39b01b84dff47e811e0ba4301f3cd858f8c59b1bec5ba5787350a")
    override
        fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit):
        Unit = deviceConfiguration(CfnUserPool.DeviceConfigurationProperty(deviceConfiguration))

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    override fun emailConfiguration(emailConfiguration: IResolvable) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param emailConfiguration The email configuration of your user pool.
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     */
    override fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty) {
      cdkBuilder.emailConfiguration(emailConfiguration.let(CfnUserPool.EmailConfigurationProperty::unwrap))
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
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     */
    override fun emailVerificationMessage(emailVerificationMessage: String) {
      cdkBuilder.emailVerificationMessage(emailVerificationMessage)
    }

    /**
     * @param emailVerificationSubject This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     */
    override fun emailVerificationSubject(emailVerificationSubject: String) {
      cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    /**
     * @param enabledMfas Enables MFA on a specified user pool.
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
     * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
     * values:
     *
     * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
     * configuration is provided.
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
     */
    override fun enabledMfas(enabledMfas: List<String>) {
      cdkBuilder.enabledMfas(enabledMfas)
    }

    /**
     * @param enabledMfas Enables MFA on a specified user pool.
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
     * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
     * values:
     *
     * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
     * configuration is provided.
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
     */
    override fun enabledMfas(vararg enabledMfas: String): Unit = enabledMfas(enabledMfas.toList())

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnUserPool.LambdaConfigProperty::unwrap))
    }

    /**
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db420d077990a8f3f5f9aacfd7af72fcdea4ac8959a927526e1d56a2037fca89")
    override fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnUserPool.LambdaConfigProperty(lambdaConfig))

    /**
     * @param mfaConfiguration The multi-factor authentication (MFA) configuration. Valid values
     * include:.
     * * `OFF` MFA won't be used for any users.
     * * `ON` MFA is required for all users to sign in.
     * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor activated.
     */
    override fun mfaConfiguration(mfaConfiguration: String) {
      cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    /**
     * @param policies The policy associated with a user pool.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * @param policies The policy associated with a user pool.
     */
    override fun policies(policies: CfnUserPool.PoliciesProperty) {
      cdkBuilder.policies(policies.let(CfnUserPool.PoliciesProperty::unwrap))
    }

    /**
     * @param policies The policy associated with a user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("343a2a106aa51ec53bcbb198a72763d39c1daff0913054bb5997ab31e254fc8b")
    override fun policies(policies: CfnUserPool.PoliciesProperty.Builder.() -> Unit): Unit =
        policies(CfnUserPool.PoliciesProperty(policies))

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    override fun schema(schema: List<Any>) {
      cdkBuilder.schema(schema)
    }

    /**
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     * or custom attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     */
    override fun schema(vararg schema: Any): Unit = schema(schema.toList())

    /**
     * @param smsAuthenticationMessage A string representing the SMS authentication message.
     */
    override fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
      cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    override fun smsConfiguration(smsConfiguration: IResolvable) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    override fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty) {
      cdkBuilder.smsConfiguration(smsConfiguration.let(CfnUserPool.SmsConfigurationProperty::unwrap))
    }

    /**
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     * pool must use to send an SMS message from your AWS account through Amazon Simple Notification
     * Service.
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3fdf43729944e82bbd4b0def5cdfaeaf11cddf784119a22823da49aed4fe0d")
    override
        fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit):
        Unit = smsConfiguration(CfnUserPool.SmsConfigurationProperty(smsConfiguration))

    /**
     * @param smsVerificationMessage This parameter is no longer used.
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
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
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(IResolvable::unwrap))
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
      cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings.let(CfnUserPool.UserAttributeUpdateSettingsProperty::unwrap))
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
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    override fun userPoolAddOns(userPoolAddOns: IResolvable) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(IResolvable::unwrap))
    }

    /**
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    override fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty) {
      cdkBuilder.userPoolAddOns(userPoolAddOns.let(CfnUserPool.UserPoolAddOnsProperty::unwrap))
    }

    /**
     * @param userPoolAddOns User pool add-ons.
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea5372e4f76aaf332c79bd10d3a441a63f2adf98920f56d60afb1e6ce2c3a62e")
    override
        fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit):
        Unit = userPoolAddOns(CfnUserPool.UserPoolAddOnsProperty(userPoolAddOns))

    /**
     * @param userPoolName A string used to name the user pool.
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
     * @param usernameAttributes Determines whether email addresses or phone numbers can be
     * specified as user names when a user signs up.
     * Possible values: `phone_number` or `email` .
     *
     * This user pool property cannot be updated.
     */
    override fun usernameAttributes(usernameAttributes: List<String>) {
      cdkBuilder.usernameAttributes(usernameAttributes)
    }

    /**
     * @param usernameAttributes Determines whether email addresses or phone numbers can be
     * specified as user names when a user signs up.
     * Possible values: `phone_number` or `email` .
     *
     * This user pool property cannot be updated.
     */
    override fun usernameAttributes(vararg usernameAttributes: String): Unit =
        usernameAttributes(usernameAttributes.toList())

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    override fun usernameConfiguration(usernameConfiguration: IResolvable) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty) {
      cdkBuilder.usernameConfiguration(usernameConfiguration.let(CfnUserPool.UsernameConfigurationProperty::unwrap))
    }

    /**
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     * the selected sign-in option.
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c305bacc242b75f5988ca36ec44228eb3d89c339cb54142c5a3ffae58d6b0ec7")
    override
        fun usernameConfiguration(usernameConfiguration: CfnUserPool.UsernameConfigurationProperty.Builder.() -> Unit):
        Unit =
        usernameConfiguration(CfnUserPool.UsernameConfigurationProperty(usernameConfiguration))

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
    override fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(IResolvable::unwrap))
    }

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
    override
        fun verificationMessageTemplate(verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty) {
      cdkBuilder.verificationMessageTemplate(verificationMessageTemplate.let(CfnUserPool.VerificationMessageTemplateProperty::unwrap))
    }

    /**
     * @param verificationMessageTemplate The template for the verification message that the user
     * sees when the app requests permission to access the user's information.
     */
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
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolProps,
  ) : CdkObject(cdkObject), CfnUserPoolProps {
    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     *
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user also
     * has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     */
    override fun accountRecoverySetting(): Any? = unwrap(this).getAccountRecoverySetting()

    /**
     * The configuration for creating a new user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     */
    override fun adminCreateUserConfig(): Any? = unwrap(this).getAdminCreateUserConfig()

    /**
     * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
     * *email* , or *preferred_username* .
     *
     *
     * This user pool property cannot be updated.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     */
    override fun aliasAttributes(): List<String> = unwrap(this).getAliasAttributes() ?: emptyList()

    /**
     * The attributes to be auto-verified.
     *
     * Possible values: *email* , *phone_number* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
     */
    override fun autoVerifiedAttributes(): List<String> = unwrap(this).getAutoVerifiedAttributes()
        ?: emptyList()

    /**
     * When active, `DeletionProtection` prevents accidental deletion of your user pool.
     *
     * Before you can delete a user pool that you have protected against deletion, you must
     * deactivate this feature.
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
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     */
    override fun deviceConfiguration(): Any? = unwrap(this).getDeviceConfiguration()

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
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
     */
    override fun emailVerificationMessage(): String? = unwrap(this).getEmailVerificationMessage()

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
     */
    override fun emailVerificationSubject(): String? = unwrap(this).getEmailVerificationSubject()

    /**
     * Enables MFA on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is enabled,
     * SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the following
     * values:
     *
     * * `SMS_MFA` - Enables SMS MFA for the user pool. SMS_MFA can only be enabled if SMS
     * configuration is provided.
     * * `SOFTWARE_TOKEN_MFA` - Enables software token MFA for the user pool.
     *
     * Allowed values: `SMS_MFA` | `SOFTWARE_TOKEN_MFA`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-enabledmfas)
     */
    override fun enabledMfas(): List<String> = unwrap(this).getEnabledMfas() ?: emptyList()

    /**
     * The Lambda trigger configuration information for the new user pool.
     *
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources to
     * invoke your Lambda function.
     *
     * For more information on using the Lambda API to add permission, see
     * [AddPermission](https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html) .
     *
     * For adding permission using the AWS CLI , see
     * [add-permission](https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
     */
    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    /**
     * The multi-factor authentication (MFA) configuration. Valid values include:.
     *
     * * `OFF` MFA won't be used for any users.
     * * `ON` MFA is required for all users to sign in.
     * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
     */
    override fun mfaConfiguration(): String? = unwrap(this).getMfaConfiguration()

    /**
     * The policy associated with a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * The schema attributes for the new user pool. These attributes can be standard or custom
     * attributes.
     *
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     */
    override fun schema(): Any? = unwrap(this).getSchema()

    /**
     * A string representing the SMS authentication message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
     */
    override fun smsAuthenticationMessage(): String? = unwrap(this).getSmsAuthenticationMessage()

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     */
    override fun smsConfiguration(): Any? = unwrap(this).getSmsConfiguration()

    /**
     * This parameter is no longer used.
     *
     * See
     * [VerificationMessageTemplateType](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html)
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
     * User pool add-ons.
     *
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see [Adding advanced security to a user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     */
    override fun userPoolAddOns(): Any? = unwrap(this).getUserPoolAddOns()

    /**
     * A string used to name the user pool.
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
     * Determines whether email addresses or phone numbers can be specified as user names when a
     * user signs up.
     *
     * Possible values: `phone_number` or `email` .
     *
     * This user pool property cannot be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
     */
    override fun usernameAttributes(): List<String> = unwrap(this).getUsernameAttributes() ?:
        emptyList()

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     *
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     */
    override fun usernameConfiguration(): Any? = unwrap(this).getUsernameConfiguration()

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     */
    override fun verificationMessageTemplate(): Any? = unwrap(this).getVerificationMessageTemplate()
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
