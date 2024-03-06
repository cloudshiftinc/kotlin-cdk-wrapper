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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cognito.AccountRecovery
import software.amazon.awscdk.services.cognito.AdvancedSecurityMode
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs
import software.amazon.awscdk.services.cognito.DeviceTracking
import software.amazon.awscdk.services.cognito.ICustomAttribute
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs
import software.amazon.awscdk.services.cognito.Mfa
import software.amazon.awscdk.services.cognito.MfaSecondFactor
import software.amazon.awscdk.services.cognito.PasswordPolicy
import software.amazon.awscdk.services.cognito.SignInAliases
import software.amazon.awscdk.services.cognito.StandardAttributes
import software.amazon.awscdk.services.cognito.UserInvitationConfig
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolEmail
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * Define a Cognito User Pool.
 *
 * Example:
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * .oAuth(OAuthSettings.builder()
 * .flows(OAuthFlows.builder()
 * .authorizationCodeGrant(true)
 * .build())
 * .scopes(List.of(OAuthScope.OPENID))
 * .callbackUrls(List.of("https://my-app-domain.com/welcome"))
 * .logoutUrls(List.of("https://my-app-domain.com/signin"))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class UserPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UserPool.Builder = UserPool.Builder.create(scope, id)

    /**
     * How will a user be able to recover their account?
     *
     * Default: AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
     *
     * @param accountRecovery How will a user be able to recover their account?.
     */
    public fun accountRecovery(accountRecovery: AccountRecovery) {
        cdkBuilder.accountRecovery(accountRecovery)
    }

    /**
     * The user pool's Advanced Security Mode.
     *
     * Default: - no value
     *
     * @param advancedSecurityMode The user pool's Advanced Security Mode.
     */
    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
    }

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default. If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     *   up.
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrsDsl.() -> Unit = {}) {
        val builder = AutoVerifiedAttrsDsl()
        builder.apply(autoVerify)
        cdkBuilder.autoVerify(builder.build())
    }

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default. If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     *   up.
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrs) {
        cdkBuilder.autoVerify(autoVerify)
    }

    /**
     * Define a set of custom attributes that can be configured for each user in the user pool.
     *
     * Default: - No custom attributes.
     *
     * @param customAttributes Define a set of custom attributes that can be configured for each
     *   user in the user pool.
     */
    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * This key will be used to encrypt temporary passwords and authorization codes that Amazon
     * Cognito generates.
     *
     * Default: - no key ID configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sender-triggers.html)
     *
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     *   authorization codes that Amazon Cognito generates.
     */
    public fun customSenderKmsKey(customSenderKmsKey: IKey) {
        cdkBuilder.customSenderKmsKey(customSenderKmsKey)
    }

    /**
     * Indicates whether the user pool should have deletion protection enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings.
     */
    public fun deviceTracking(deviceTracking: DeviceTrackingDsl.() -> Unit = {}) {
        val builder = DeviceTrackingDsl()
        builder.apply(deviceTracking)
        cdkBuilder.deviceTracking(builder.build())
    }

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings.
     */
    public fun deviceTracking(deviceTracking: DeviceTracking) {
        cdkBuilder.deviceTracking(deviceTracking)
    }

    /**
     * Email settings for a user pool.
     *
     * Default: - cognito will use the default email configuration
     *
     * @param email Email settings for a user pool.
     */
    public fun email(email: UserPoolEmail) {
        cdkBuilder.email(email)
    }

    /**
     * Setting this would explicitly enable or disable SMS role creation.
     *
     * When left unspecified, CDK will determine based on other properties if a role is needed or
     * not.
     *
     * Default: - CDK will determine based on other properties of the user pool if an SMS role
     * should be created or not.
     *
     * @param enableSmsRole Setting this would explicitly enable or disable SMS role creation.
     */
    public fun enableSmsRole(enableSmsRole: Boolean) {
        cdkBuilder.enableSmsRole(enableSmsRole)
    }

    /**
     * Attributes which Cognito will look to handle changes to the value of your users' email
     * address and phone number attributes.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - Nothing is kept.
     *
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     *   users' email address and phone number attributes.
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrsDsl.() -> Unit = {}) {
        val builder = KeepOriginalAttrsDsl()
        builder.apply(keepOriginal)
        cdkBuilder.keepOriginal(builder.build())
    }

    /**
     * Attributes which Cognito will look to handle changes to the value of your users' email
     * address and phone number attributes.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - Nothing is kept.
     *
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     *   users' email address and phone number attributes.
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
        cdkBuilder.keepOriginal(keepOriginal)
    }

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     *
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggersDsl.() -> Unit = {}) {
        val builder = UserPoolTriggersDsl()
        builder.apply(lambdaTriggers)
        cdkBuilder.lambdaTriggers(builder.build())
    }

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     *
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
        cdkBuilder.lambdaTriggers(lambdaTriggers)
    }

    /**
     * Configure whether users of this user pool can or are required use MFA to sign in.
     *
     * Default: Mfa.OFF
     *
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in.
     */
    public fun mfa(mfa: Mfa) {
        cdkBuilder.mfa(mfa)
    }

    /**
     * The SMS message template sent during MFA verification.
     *
     * Use '{####}' in the template where Cognito should insert the verification code.
     *
     * Default: 'Your authentication code is {####}.'
     *
     * @param mfaMessage The SMS message template sent during MFA verification.
     */
    public fun mfaMessage(mfaMessage: String) {
        cdkBuilder.mfaMessage(mfaMessage)
    }

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false }, if `mfa` is set to `OPTIONAL` or `REQUIRED`. { sms:
     * false, otp: false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactorDsl.() -> Unit = {}) {
        val builder = MfaSecondFactorDsl()
        builder.apply(mfaSecondFactor)
        cdkBuilder.mfaSecondFactor(builder.build())
    }

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false }, if `mfa` is set to `OPTIONAL` or `REQUIRED`. { sms:
     * false, otp: false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
        cdkBuilder.mfaSecondFactor(mfaSecondFactor)
    }

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool.
     */
    public fun passwordPolicy(passwordPolicy: PasswordPolicyDsl.() -> Unit = {}) {
        val builder = PasswordPolicyDsl()
        builder.apply(passwordPolicy)
        cdkBuilder.passwordPolicy(builder.build())
    }

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool.
     */
    public fun passwordPolicy(passwordPolicy: PasswordPolicy) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    /**
     * Policy to apply when the user pool is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the user pool is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Whether self sign-up should be enabled.
     *
     * To configure self sign-up configuration use the `userVerification` property.
     *
     * Default: - false
     *
     * @param selfSignUpEnabled Whether self sign-up should be enabled.
     */
    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
        cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
    }

    /**
     * Methods in which a user registers or signs in to a user pool.
     *
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to `{ username: true, email: true }`. To match with 'Option 2' in the above link with
     * both a verified email and phone number, this property should be set to `{ email: true, phone:
     * true }`.
     *
     * Default: { username: true }
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     */
    public fun signInAliases(signInAliases: SignInAliasesDsl.() -> Unit = {}) {
        val builder = SignInAliasesDsl()
        builder.apply(signInAliases)
        cdkBuilder.signInAliases(builder.build())
    }

    /**
     * Methods in which a user registers or signs in to a user pool.
     *
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to `{ username: true, email: true }`. To match with 'Option 2' in the above link with
     * both a verified email and phone number, this property should be set to `{ email: true, phone:
     * true }`.
     *
     * Default: { username: true }
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     */
    public fun signInAliases(signInAliases: SignInAliases) {
        cdkBuilder.signInAliases(signInAliases)
    }

    /**
     * Whether sign-in aliases should be evaluated with case sensitivity.
     *
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     *
     * Default: true
     *
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     */
    public fun signInCaseSensitive(signInCaseSensitive: Boolean) {
        cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    /**
     * The IAM role that Cognito will assume while sending SMS messages.
     *
     * Default: - a new IAM role is created.
     *
     * @param smsRole The IAM role that Cognito will assume while sending SMS messages.
     */
    public fun smsRole(smsRole: IRole) {
        cdkBuilder.smsRole(smsRole)
    }

    /**
     * The 'ExternalId' that Cognito service must be using when assuming the `smsRole`, if the role
     * is restricted with an 'sts:ExternalId' conditional.
     *
     * Learn more about ExternalId here -
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     *
     * This property will be ignored if `smsRole` is not specified.
     *
     * Default: - No external id will be configured.
     *
     * @param smsRoleExternalId The 'ExternalId' that Cognito service must be using when assuming
     *   the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional.
     */
    public fun smsRoleExternalId(smsRoleExternalId: String) {
        cdkBuilder.smsRoleExternalId(smsRoleExternalId)
    }

    /**
     * The region to integrate with SNS to send SMS messages.
     *
     * This property will do nothing if SMS configuration is not configured.
     *
     * Default: - The same region as the user pool, with a few exceptions -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html#user-pool-sms-settings-first-time
     *
     * @param snsRegion The region to integrate with SNS to send SMS messages.
     */
    public fun snsRegion(snsRegion: String) {
        cdkBuilder.snsRegion(snsRegion)
    }

    /**
     * The set of attributes that are required for every user in the user pool.
     *
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * Default: - All standard attributes are optional and mutable.
     *
     * @param standardAttributes The set of attributes that are required for every user in the user
     *   pool.
     */
    public fun standardAttributes(standardAttributes: StandardAttributesDsl.() -> Unit = {}) {
        val builder = StandardAttributesDsl()
        builder.apply(standardAttributes)
        cdkBuilder.standardAttributes(builder.build())
    }

    /**
     * The set of attributes that are required for every user in the user pool.
     *
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * Default: - All standard attributes are optional and mutable.
     *
     * @param standardAttributes The set of attributes that are required for every user in the user
     *   pool.
     */
    public fun standardAttributes(standardAttributes: StandardAttributes) {
        cdkBuilder.standardAttributes(standardAttributes)
    }

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    public fun userInvitation(userInvitation: UserInvitationConfigDsl.() -> Unit = {}) {
        val builder = UserInvitationConfigDsl()
        builder.apply(userInvitation)
        cdkBuilder.userInvitation(builder.build())
    }

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    public fun userInvitation(userInvitation: UserInvitationConfig) {
        cdkBuilder.userInvitation(userInvitation)
    }

    /**
     * Name of the user pool.
     *
     * Default: - automatically generated name by CloudFormation at deploy time.
     *
     * @param userPoolName Name of the user pool.
     */
    public fun userPoolName(userPoolName: String) {
        cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * Configuration around users signing themselves up to the user pool.
     *
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     *
     * Default: - see defaults in UserVerificationConfig.
     *
     * @param userVerification Configuration around users signing themselves up to the user pool.
     */
    public fun userVerification(userVerification: UserVerificationConfigDsl.() -> Unit = {}) {
        val builder = UserVerificationConfigDsl()
        builder.apply(userVerification)
        cdkBuilder.userVerification(builder.build())
    }

    /**
     * Configuration around users signing themselves up to the user pool.
     *
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     *
     * Default: - see defaults in UserVerificationConfig.
     *
     * @param userVerification Configuration around users signing themselves up to the user pool.
     */
    public fun userVerification(userVerification: UserVerificationConfig) {
        cdkBuilder.userVerification(userVerification)
    }

    public fun build(): UserPool = cdkBuilder.build()
}
