@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.constructs.Construct

/**
 * The `AWS::Cognito::UserPool` resource creates an Amazon Cognito user pool.
 *
 * For more information on working with Amazon Cognito user pools, see
 * [Amazon Cognito User Pools](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
 * and
 * [CreateUserPool](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPool.html)
 * .
 *
 * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
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
@CdkDslMarker
public class CfnUserPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPool.Builder = CfnUserPool.Builder.create(scope, id)

    private val _aliasAttributes: MutableList<String> = mutableListOf()

    private val _autoVerifiedAttributes: MutableList<String> = mutableListOf()

    private val _enabledMfas: MutableList<String> = mutableListOf()

    private val _schema: MutableList<Any> = mutableListOf()

    private val _usernameAttributes: MutableList<String> = mutableListOf()

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     *
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user
     * also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     *
     * @param accountRecoverySetting Use this setting to define which verified available method a
     *   user can use to recover their password when they call `ForgotPassword` .
     */
    public fun accountRecoverySetting(accountRecoverySetting: IResolvable) {
        cdkBuilder.accountRecoverySetting(accountRecoverySetting)
    }

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     *
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user
     * also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-accountrecoverysetting)
     *
     * @param accountRecoverySetting Use this setting to define which verified available method a
     *   user can use to recover their password when they call `ForgotPassword` .
     */
    public fun accountRecoverySetting(
        accountRecoverySetting: CfnUserPool.AccountRecoverySettingProperty
    ) {
        cdkBuilder.accountRecoverySetting(accountRecoverySetting)
    }

    /**
     * The configuration for creating a new user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     *
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    public fun adminCreateUserConfig(adminCreateUserConfig: IResolvable) {
        cdkBuilder.adminCreateUserConfig(adminCreateUserConfig)
    }

    /**
     * The configuration for creating a new user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
     *
     * @param adminCreateUserConfig The configuration for creating a new user profile.
     */
    public fun adminCreateUserConfig(
        adminCreateUserConfig: CfnUserPool.AdminCreateUserConfigProperty
    ) {
        cdkBuilder.adminCreateUserConfig(adminCreateUserConfig)
    }

    /**
     * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
     * *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *   *phone_number* , *email* , or *preferred_username* .
     */
    public fun aliasAttributes(vararg aliasAttributes: String) {
        _aliasAttributes.addAll(listOf(*aliasAttributes))
    }

    /**
     * Attributes supported as an alias for this user pool. Possible values: *phone_number* ,
     * *email* , or *preferred_username* .
     *
     * This user pool property cannot be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *   *phone_number* , *email* , or *preferred_username* .
     */
    public fun aliasAttributes(aliasAttributes: Collection<String>) {
        _aliasAttributes.addAll(aliasAttributes)
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
    public fun autoVerifiedAttributes(vararg autoVerifiedAttributes: String) {
        _autoVerifiedAttributes.addAll(listOf(*autoVerifiedAttributes))
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
    public fun autoVerifiedAttributes(autoVerifiedAttributes: Collection<String>) {
        _autoVerifiedAttributes.addAll(autoVerifiedAttributes)
    }

    /**
     * When active, `DeletionProtection` prevents accidental deletion of your user pool.
     *
     * Before you can delete a user pool that you have protected against deletion, you must
     * deactivate this feature.
     *
     * When you try to delete a protected user pool in a `DeleteUserPool` API request, Amazon
     * Cognito returns an `InvalidParameterException` error. To delete a protected user pool, send a
     * new `DeleteUserPool` request after you deactivate deletion protection in an `UpdateUserPool`
     * API request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deletionprotection)
     *
     * @param deletionProtection When active, `DeletionProtection` prevents accidental deletion of
     *   your user pool.
     */
    public fun deletionProtection(deletionProtection: String) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     *
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     */
    public fun deviceConfiguration(deviceConfiguration: IResolvable) {
        cdkBuilder.deviceConfiguration(deviceConfiguration)
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * A null value indicates that you have deactivated device remembering in your user pool.
     *
     * When you provide a value for any `DeviceConfiguration` field, you activate the Amazon Cognito
     * device-remembering feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
     *
     * @param deviceConfiguration The device-remembering configuration for a user pool.
     */
    public fun deviceConfiguration(deviceConfiguration: CfnUserPool.DeviceConfigurationProperty) {
        cdkBuilder.deviceConfiguration(deviceConfiguration)
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     *
     * @param emailConfiguration The email configuration of your user pool.
     */
    public fun emailConfiguration(emailConfiguration: IResolvable) {
        cdkBuilder.emailConfiguration(emailConfiguration)
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
     *
     * @param emailConfiguration The email configuration of your user pool.
     */
    public fun emailConfiguration(emailConfiguration: CfnUserPool.EmailConfigurationProperty) {
        cdkBuilder.emailConfiguration(emailConfiguration)
    }

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
    public fun emailVerificationMessage(emailVerificationMessage: String) {
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
    public fun emailVerificationSubject(emailVerificationSubject: String) {
        cdkBuilder.emailVerificationSubject(emailVerificationSubject)
    }

    /**
     * Enables MFA on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
     * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the
     * following values:
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
    public fun enabledMfas(vararg enabledMfas: String) {
        _enabledMfas.addAll(listOf(*enabledMfas))
    }

    /**
     * Enables MFA on a specified user pool.
     *
     * To disable all MFAs after it has been enabled, set MfaConfiguration to “OFF” and remove
     * EnabledMfas. MFAs can only be all disabled if MfaConfiguration is OFF. Once SMS_MFA is
     * enabled, SMS_MFA can only be disabled by setting MfaConfiguration to “OFF”. Can be one of the
     * following values:
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
    public fun enabledMfas(enabledMfas: Collection<String>) {
        _enabledMfas.addAll(enabledMfas)
    }

    /**
     * The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources
     * to invoke your Lambda function.
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
    public fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    /**
     * The Lambda trigger configuration information for the new user pool.
     *
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to
     * invoke a function. So you must make an extra call to add permission for these event sources
     * to invoke your Lambda function.
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
    public fun lambdaConfig(lambdaConfig: CfnUserPool.LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    /**
     * The multi-factor authentication (MFA) configuration. Valid values include:.
     * * `OFF` MFA won't be used for any users.
     * * `ON` MFA is required for all users to sign in.
     * * `OPTIONAL` MFA will be required only for individual users who have an MFA factor activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
     *
     * @param mfaConfiguration The multi-factor authentication (MFA) configuration. Valid values
     *   include:.
     */
    public fun mfaConfiguration(mfaConfiguration: String) {
        cdkBuilder.mfaConfiguration(mfaConfiguration)
    }

    /**
     * The policy associated with a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     *
     * @param policies The policy associated with a user pool.
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /**
     * The policy associated with a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
     *
     * @param policies The policy associated with a user pool.
     */
    public fun policies(policies: CfnUserPool.PoliciesProperty) {
        cdkBuilder.policies(policies)
    }

    /**
     * The schema attributes for the new user pool. These attributes can be standard or custom
     * attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     *
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     *   or custom attributes.
     */
    public fun schema(vararg schema: Any) {
        _schema.addAll(listOf(*schema))
    }

    /**
     * The schema attributes for the new user pool. These attributes can be standard or custom
     * attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     *
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     *   or custom attributes.
     */
    public fun schema(schema: Collection<Any>) {
        _schema.addAll(schema)
    }

    /**
     * The schema attributes for the new user pool. These attributes can be standard or custom
     * attributes.
     *
     * During a user pool update, you can add new schema attributes but you cannot modify or delete
     * an existing schema attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
     *
     * @param schema The schema attributes for the new user pool. These attributes can be standard
     *   or custom attributes.
     */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /**
     * A string representing the SMS authentication message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
     *
     * @param smsAuthenticationMessage A string representing the SMS authentication message.
     */
    public fun smsAuthenticationMessage(smsAuthenticationMessage: String) {
        cdkBuilder.smsAuthenticationMessage(smsAuthenticationMessage)
    }

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     *
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     *   pool must use to send an SMS message from your AWS account through Amazon Simple
     *   Notification Service.
     */
    public fun smsConfiguration(smsConfiguration: IResolvable) {
        cdkBuilder.smsConfiguration(smsConfiguration)
    }

    /**
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send
     * an SMS message from your AWS account through Amazon Simple Notification Service.
     *
     * To send SMS messages with Amazon SNS in the AWS Region that you want, the Amazon Cognito user
     * pool uses an AWS Identity and Access Management (IAM) role in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
     *
     * @param smsConfiguration The SMS configuration with the settings that your Amazon Cognito user
     *   pool must use to send an SMS message from your AWS account through Amazon Simple
     *   Notification Service.
     */
    public fun smsConfiguration(smsConfiguration: CfnUserPool.SmsConfigurationProperty) {
        cdkBuilder.smsConfiguration(smsConfiguration)
    }

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
    public fun smsVerificationMessage(smsVerificationMessage: String) {
        cdkBuilder.smsVerificationMessage(smsVerificationMessage)
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a user-pool
     * setting that tells Amazon Cognito how to handle changes to the value of your users' email
     * address and phone number attributes. For more information, see
     * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     *
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     */
    public fun userAttributeUpdateSettings(userAttributeUpdateSettings: IResolvable) {
        cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings)
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a user-pool
     * setting that tells Amazon Cognito how to handle changes to the value of your users' email
     * address and phone number attributes. For more information, see
     * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userattributeupdatesettings)
     *
     * @param userAttributeUpdateSettings The settings for updates to user attributes.
     */
    public fun userAttributeUpdateSettings(
        userAttributeUpdateSettings: CfnUserPool.UserAttributeUpdateSettingsProperty
    ) {
        cdkBuilder.userAttributeUpdateSettings(userAttributeUpdateSettings)
    }

    /**
     * User pool add-ons.
     *
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see
     * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     *
     * @param userPoolAddOns User pool add-ons.
     */
    public fun userPoolAddOns(userPoolAddOns: IResolvable) {
        cdkBuilder.userPoolAddOns(userPoolAddOns)
    }

    /**
     * User pool add-ons.
     *
     * Contains settings for activation of advanced security features. To log user security
     * information but take no action, set to `AUDIT` . To configure automatic security responses to
     * risky traffic to your user pool, set to `ENFORCED` .
     *
     * For more information, see
     * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooladdons)
     *
     * @param userPoolAddOns User pool add-ons.
     */
    public fun userPoolAddOns(userPoolAddOns: CfnUserPool.UserPoolAddOnsProperty) {
        cdkBuilder.userPoolAddOns(userPoolAddOns)
    }

    /**
     * A string used to name the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
     *
     * @param userPoolName A string used to name the user pool.
     */
    public fun userPoolName(userPoolName: String) {
        cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * The tag keys and values to assign to the user pool.
     *
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
     *
     * @param userPoolTags The tag keys and values to assign to the user pool.
     */
    public fun userPoolTags(userPoolTags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(userPoolTags)
        cdkBuilder.userPoolTags(builder.map)
    }

    /**
     * The tag keys and values to assign to the user pool.
     *
     * A tag is a label that you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
     *
     * @param userPoolTags The tag keys and values to assign to the user pool.
     */
    public fun userPoolTags(userPoolTags: Any) {
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
    public fun usernameAttributes(vararg usernameAttributes: String) {
        _usernameAttributes.addAll(listOf(*usernameAttributes))
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
    public fun usernameAttributes(usernameAttributes: Collection<String>) {
        _usernameAttributes.addAll(usernameAttributes)
    }

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     *
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     *
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     *   the selected sign-in option.
     */
    public fun usernameConfiguration(usernameConfiguration: IResolvable) {
        cdkBuilder.usernameConfiguration(usernameConfiguration)
    }

    /**
     * You can choose to set case sensitivity on the username input for the selected sign-in option.
     *
     * For example, when this is set to `False` , users will be able to sign in using either
     * "username" or "Username". This configuration is immutable once it has been set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameconfiguration)
     *
     * @param usernameConfiguration You can choose to set case sensitivity on the username input for
     *   the selected sign-in option.
     */
    public fun usernameConfiguration(
        usernameConfiguration: CfnUserPool.UsernameConfigurationProperty
    ) {
        cdkBuilder.usernameConfiguration(usernameConfiguration)
    }

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     *
     * @param verificationMessageTemplate The template for the verification message that the user
     *   sees when the app requests permission to access the user's information.
     */
    public fun verificationMessageTemplate(verificationMessageTemplate: IResolvable) {
        cdkBuilder.verificationMessageTemplate(verificationMessageTemplate)
    }

    /**
     * The template for the verification message that the user sees when the app requests permission
     * to access the user's information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-verificationmessagetemplate)
     *
     * @param verificationMessageTemplate The template for the verification message that the user
     *   sees when the app requests permission to access the user's information.
     */
    public fun verificationMessageTemplate(
        verificationMessageTemplate: CfnUserPool.VerificationMessageTemplateProperty
    ) {
        cdkBuilder.verificationMessageTemplate(verificationMessageTemplate)
    }

    public fun build(): CfnUserPool {
        if (_aliasAttributes.isNotEmpty()) cdkBuilder.aliasAttributes(_aliasAttributes)
        if (_autoVerifiedAttributes.isNotEmpty())
            cdkBuilder.autoVerifiedAttributes(_autoVerifiedAttributes)
        if (_enabledMfas.isNotEmpty()) cdkBuilder.enabledMfas(_enabledMfas)
        if (_schema.isNotEmpty()) cdkBuilder.schema(_schema)
        if (_usernameAttributes.isNotEmpty()) cdkBuilder.usernameAttributes(_usernameAttributes)
        return cdkBuilder.build()
    }
}
