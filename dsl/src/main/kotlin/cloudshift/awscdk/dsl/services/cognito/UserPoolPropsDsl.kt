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
import software.amazon.awscdk.services.cognito.UserPoolEmail
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey

/**
 * Props for the UserPool construct.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .selfSignUpEnabled(true)
 * .userVerification(UserVerificationConfig.builder()
 * .emailSubject("Verify your email for our awesome app!")
 * .emailBody("Thanks for signing up to our awesome app! Your verification code is {####}")
 * .emailStyle(VerificationEmailStyle.CODE)
 * .smsMessage("Thanks for signing up to our awesome app! Your verification code is {####}")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolPropsDsl {
    private val cdkBuilder: UserPoolProps.Builder = UserPoolProps.builder()

    /** @param accountRecovery How will a user be able to recover their account?. */
    public fun accountRecovery(accountRecovery: AccountRecovery) {
        cdkBuilder.accountRecovery(accountRecovery)
    }

    /** @param advancedSecurityMode The user pool's Advanced Security Mode. */
    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
    }

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     *   up. EMAIL and PHONE are the only available options.
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrsDsl.() -> Unit = {}) {
        val builder = AutoVerifiedAttrsDsl()
        builder.apply(autoVerify)
        cdkBuilder.autoVerify(builder.build())
    }

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     *   up. EMAIL and PHONE are the only available options.
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrs) {
        cdkBuilder.autoVerify(autoVerify)
    }

    /**
     * @param customAttributes Define a set of custom attributes that can be configured for each
     *   user in the user pool.
     */
    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     *   authorization codes that Amazon Cognito generates.
     */
    public fun customSenderKmsKey(customSenderKmsKey: IKey) {
        cdkBuilder.customSenderKmsKey(customSenderKmsKey)
    }

    /**
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /** @param deviceTracking Device tracking settings. */
    public fun deviceTracking(deviceTracking: DeviceTrackingDsl.() -> Unit = {}) {
        val builder = DeviceTrackingDsl()
        builder.apply(deviceTracking)
        cdkBuilder.deviceTracking(builder.build())
    }

    /** @param deviceTracking Device tracking settings. */
    public fun deviceTracking(deviceTracking: DeviceTracking) {
        cdkBuilder.deviceTracking(deviceTracking)
    }

    /** @param email Email settings for a user pool. */
    public fun email(email: UserPoolEmail) {
        cdkBuilder.email(email)
    }

    /**
     * @param enableSmsRole Setting this would explicitly enable or disable SMS role creation. When
     *   left unspecified, CDK will determine based on other properties if a role is needed or not.
     */
    public fun enableSmsRole(enableSmsRole: Boolean) {
        cdkBuilder.enableSmsRole(enableSmsRole)
    }

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     *   users' email address and phone number attributes. EMAIL and PHONE are the only available
     *   options.
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrsDsl.() -> Unit = {}) {
        val builder = KeepOriginalAttrsDsl()
        builder.apply(keepOriginal)
        cdkBuilder.keepOriginal(builder.build())
    }

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     *   users' email address and phone number attributes. EMAIL and PHONE are the only available
     *   options.
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
        cdkBuilder.keepOriginal(keepOriginal)
    }

    /** @param lambdaTriggers Lambda functions to use for supported Cognito triggers. */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggersDsl.() -> Unit = {}) {
        val builder = UserPoolTriggersDsl()
        builder.apply(lambdaTriggers)
        cdkBuilder.lambdaTriggers(builder.build())
    }

    /** @param lambdaTriggers Lambda functions to use for supported Cognito triggers. */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
        cdkBuilder.lambdaTriggers(lambdaTriggers)
    }

    /**
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in.
     */
    public fun mfa(mfa: Mfa) {
        cdkBuilder.mfa(mfa)
    }

    /**
     * @param mfaMessage The SMS message template sent during MFA verification. Use '{####}' in the
     *   template where Cognito should insert the verification code.
     */
    public fun mfaMessage(mfaMessage: String) {
        cdkBuilder.mfaMessage(mfaMessage)
    }

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. Ignored
     *   if `mfa` is set to `OFF`.
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactorDsl.() -> Unit = {}) {
        val builder = MfaSecondFactorDsl()
        builder.apply(mfaSecondFactor)
        cdkBuilder.mfaSecondFactor(builder.build())
    }

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. Ignored
     *   if `mfa` is set to `OFF`.
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
        cdkBuilder.mfaSecondFactor(mfaSecondFactor)
    }

    /** @param passwordPolicy Password policy for this user pool. */
    public fun passwordPolicy(passwordPolicy: PasswordPolicyDsl.() -> Unit = {}) {
        val builder = PasswordPolicyDsl()
        builder.apply(passwordPolicy)
        cdkBuilder.passwordPolicy(builder.build())
    }

    /** @param passwordPolicy Password policy for this user pool. */
    public fun passwordPolicy(passwordPolicy: PasswordPolicy) {
        cdkBuilder.passwordPolicy(passwordPolicy)
    }

    /** @param removalPolicy Policy to apply when the user pool is removed from the stack. */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param selfSignUpEnabled Whether self sign up should be enabled. This can be further
     *   configured via the `selfSignUp` property.
     */
    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
        cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
    }

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool. Allows
     *   either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to `{ username: true, email: true }`. To match with 'Option 2' in the above link with
     * both a verified email and phone number, this property should be set to `{ email: true, phone:
     * true }`.
     */
    public fun signInAliases(signInAliases: SignInAliasesDsl.() -> Unit = {}) {
        val builder = SignInAliasesDsl()
        builder.apply(signInAliases)
        cdkBuilder.signInAliases(builder.build())
    }

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool. Allows
     *   either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to `{ username: true, email: true }`. To match with 'Option 2' in the above link with
     * both a verified email and phone number, this property should be set to `{ email: true, phone:
     * true }`.
     */
    public fun signInAliases(signInAliases: SignInAliases) {
        cdkBuilder.signInAliases(signInAliases)
    }

    /**
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     *   For example, when this option is set to false, users will be able to sign in using either
     *   `MyUsername` or `myusername`.
     */
    public fun signInCaseSensitive(signInCaseSensitive: Boolean) {
        cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    /** @param smsRole The IAM role that Cognito will assume while sending SMS messages. */
    public fun smsRole(smsRole: IRole) {
        cdkBuilder.smsRole(smsRole)
    }

    /**
     * @param smsRoleExternalId The 'ExternalId' that Cognito service must be using when assuming
     *   the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional. Learn more
     *   about ExternalId here -
     *   https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     *
     * This property will be ignored if `smsRole` is not specified.
     */
    public fun smsRoleExternalId(smsRoleExternalId: String) {
        cdkBuilder.smsRoleExternalId(smsRoleExternalId)
    }

    /**
     * @param snsRegion The region to integrate with SNS to send SMS messages. This property will do
     *   nothing if SMS configuration is not configured
     */
    public fun snsRegion(snsRegion: String) {
        cdkBuilder.snsRegion(snsRegion)
    }

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     *   pool. Read more on attributes here -
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    public fun standardAttributes(standardAttributes: StandardAttributesDsl.() -> Unit = {}) {
        val builder = StandardAttributesDsl()
        builder.apply(standardAttributes)
        cdkBuilder.standardAttributes(builder.build())
    }

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     *   pool. Read more on attributes here -
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    public fun standardAttributes(standardAttributes: StandardAttributes) {
        cdkBuilder.standardAttributes(standardAttributes)
    }

    /** @param userInvitation Configuration around admins signing up users into a user pool. */
    public fun userInvitation(userInvitation: UserInvitationConfigDsl.() -> Unit = {}) {
        val builder = UserInvitationConfigDsl()
        builder.apply(userInvitation)
        cdkBuilder.userInvitation(builder.build())
    }

    /** @param userInvitation Configuration around admins signing up users into a user pool. */
    public fun userInvitation(userInvitation: UserInvitationConfig) {
        cdkBuilder.userInvitation(userInvitation)
    }

    /** @param userPoolName Name of the user pool. */
    public fun userPoolName(userPoolName: String) {
        cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     *   Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    public fun userVerification(userVerification: UserVerificationConfigDsl.() -> Unit = {}) {
        val builder = UserVerificationConfigDsl()
        builder.apply(userVerification)
        cdkBuilder.userVerification(builder.build())
    }

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     *   Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    public fun userVerification(userVerification: UserVerificationConfig) {
        cdkBuilder.userVerification(userVerification)
    }

    public fun build(): UserPoolProps = cdkBuilder.build()
}
