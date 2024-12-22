@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Props for the UserPool construct.
 *
 * Example:
 *
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
public interface UserPoolProps {
  /**
   * How will a user be able to recover their account?
   *
   * Default: AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
   */
  public fun accountRecovery(): AccountRecovery? =
      unwrap(this).getAccountRecovery()?.let(AccountRecovery::wrap)

  /**
   * (deprecated) The user pool's Advanced Security Mode.
   *
   * Default: - no value
   *
   * @deprecated Advanced Security Mode is deprecated in favor of user pool feature plans.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun advancedSecurityMode(): AdvancedSecurityMode? =
      unwrap(this).getAdvancedSecurityMode()?.let(AdvancedSecurityMode::wrap)

  /**
   * Attributes which Cognito will look to verify automatically upon user sign up.
   *
   * EMAIL and PHONE are the only available options.
   *
   * Default: - If `signInAlias` includes email and/or phone, they will be included in
   * `autoVerifiedAttributes` by default.
   * If absent, no attributes will be auto-verified.
   */
  public fun autoVerify(): AutoVerifiedAttrs? =
      unwrap(this).getAutoVerify()?.let(AutoVerifiedAttrs::wrap)

  /**
   * Define a set of custom attributes that can be configured for each user in the user pool.
   *
   * Default: - No custom attributes.
   */
  public fun customAttributes(): Map<String, ICustomAttribute> =
      unwrap(this).getCustomAttributes()?.mapValues{ICustomAttribute.wrap(it.value)} ?: emptyMap()

  /**
   * This key will be used to encrypt temporary passwords and authorization codes that Amazon
   * Cognito generates.
   *
   * Default: - no key ID configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sender-triggers.html)
   */
  public fun customSenderKmsKey(): IKey? = unwrap(this).getCustomSenderKmsKey()?.let(IKey::wrap)

  /**
   * Indicates whether the user pool should have deletion protection enabled.
   *
   * Default: false
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * Device tracking settings.
   *
   * Default: - see defaults on each property of DeviceTracking.
   */
  public fun deviceTracking(): DeviceTracking? =
      unwrap(this).getDeviceTracking()?.let(DeviceTracking::wrap)

  /**
   * Email settings for a user pool.
   *
   * Default: - cognito will use the default email configuration
   */
  public fun email(): UserPoolEmail? = unwrap(this).getEmail()?.let(UserPoolEmail::wrap)

  /**
   * Setting this would explicitly enable or disable SMS role creation.
   *
   * When left unspecified, CDK will determine based on other properties if a role is needed or not.
   *
   * Default: - CDK will determine based on other properties of the user pool if an SMS role should
   * be created or not.
   */
  public fun enableSmsRole(): Boolean? = unwrap(this).getEnableSmsRole()

  /**
   * The user pool feature plan, or tier.
   *
   * This parameter determines the eligibility of the user pool for features like managed login,
   * access-token customization, and threat protection.
   *
   * Default: - FeaturePlan.ESSENTIALS for a newly created user pool; FeaturePlan.LITE otherwise
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
   */
  public fun featurePlan(): FeaturePlan? = unwrap(this).getFeaturePlan()?.let(FeaturePlan::wrap)

  /**
   * Attributes which Cognito will look to handle changes to the value of your users' email address
   * and phone number attributes.
   *
   * EMAIL and PHONE are the only available options.
   *
   * Default: - Nothing is kept.
   */
  public fun keepOriginal(): KeepOriginalAttrs? =
      unwrap(this).getKeepOriginal()?.let(KeepOriginalAttrs::wrap)

  /**
   * Lambda functions to use for supported Cognito triggers.
   *
   * Default: - No Lambda triggers.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
   */
  public fun lambdaTriggers(): UserPoolTriggers? =
      unwrap(this).getLambdaTriggers()?.let(UserPoolTriggers::wrap)

  /**
   * Configure whether users of this user pool can or are required use MFA to sign in.
   *
   * Default: Mfa.OFF
   */
  public fun mfa(): Mfa? = unwrap(this).getMfa()?.let(Mfa::wrap)

  /**
   * The SMS message template sent during MFA verification.
   *
   * Use '{####}' in the template where Cognito should insert the verification code.
   *
   * Default: 'Your authentication code is {####}.'
   */
  public fun mfaMessage(): String? = unwrap(this).getMfaMessage()

  /**
   * Configure the MFA types that users can use in this user pool.
   *
   * Ignored if `mfa` is set to `OFF`.
   *
   * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
   * `REQUIRED`.
   * { sms: false, otp: false, email:false }, otherwise
   */
  public fun mfaSecondFactor(): MfaSecondFactor? =
      unwrap(this).getMfaSecondFactor()?.let(MfaSecondFactor::wrap)

  /**
   * Password policy for this user pool.
   *
   * Default: - see defaults on each property of PasswordPolicy.
   */
  public fun passwordPolicy(): PasswordPolicy? =
      unwrap(this).getPasswordPolicy()?.let(PasswordPolicy::wrap)

  /**
   * Policy to apply when the user pool is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Whether self sign-up should be enabled.
   *
   * To configure self sign-up configuration use the `userVerification` property.
   *
   * Default: - false
   */
  public fun selfSignUpEnabled(): Boolean? = unwrap(this).getSelfSignUpEnabled()

  /**
   * Methods in which a user registers or signs in to a user pool.
   *
   * Allows either username with aliases OR sign in with email, phone, or both.
   *
   * Read the sections on usernames and aliases to learn more -
   * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
   *
   * To match with 'Option 1' in the above link, with a verified email, this property should be set
   * to
   * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
   * verified email and phone
   * number, this property should be set to `{ email: true, phone: true }`.
   *
   * Default: { username: true }
   */
  public fun signInAliases(): SignInAliases? =
      unwrap(this).getSignInAliases()?.let(SignInAliases::wrap)

  /**
   * Whether sign-in aliases should be evaluated with case sensitivity.
   *
   * For example, when this option is set to false, users will be able to sign in using either
   * `MyUsername` or `myusername`.
   *
   * Default: true
   */
  public fun signInCaseSensitive(): Boolean? = unwrap(this).getSignInCaseSensitive()

  /**
   * The IAM role that Cognito will assume while sending SMS messages.
   *
   * Default: - a new IAM role is created.
   */
  public fun smsRole(): IRole? = unwrap(this).getSmsRole()?.let(IRole::wrap)

  /**
   * The 'ExternalId' that Cognito service must be using when assuming the `smsRole`, if the role is
   * restricted with an 'sts:ExternalId' conditional.
   *
   * Learn more about ExternalId here -
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
   *
   * This property will be ignored if `smsRole` is not specified.
   *
   * Default: - No external id will be configured.
   */
  public fun smsRoleExternalId(): String? = unwrap(this).getSmsRoleExternalId()

  /**
   * The region to integrate with SNS to send SMS messages.
   *
   * This property will do nothing if SMS configuration is not configured.
   *
   * Default: - The same region as the user pool, with a few exceptions -
   * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html#user-pool-sms-settings-first-time
   */
  public fun snsRegion(): String? = unwrap(this).getSnsRegion()

  /**
   * The set of attributes that are required for every user in the user pool.
   *
   * Read more on attributes here -
   * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
   *
   * Default: - All standard attributes are optional and mutable.
   */
  public fun standardAttributes(): StandardAttributes? =
      unwrap(this).getStandardAttributes()?.let(StandardAttributes::wrap)

  /**
   * Configuration around admins signing up users into a user pool.
   *
   * Default: - see defaults in UserInvitationConfig.
   */
  public fun userInvitation(): UserInvitationConfig? =
      unwrap(this).getUserInvitation()?.let(UserInvitationConfig::wrap)

  /**
   * Name of the user pool.
   *
   * Default: - automatically generated name by CloudFormation at deploy time.
   */
  public fun userPoolName(): String? = unwrap(this).getUserPoolName()

  /**
   * Configuration around users signing themselves up to the user pool.
   *
   * Enable or disable self sign-up via the `selfSignUpEnabled` property.
   *
   * Default: - see defaults in UserVerificationConfig.
   */
  public fun userVerification(): UserVerificationConfig? =
      unwrap(this).getUserVerification()?.let(UserVerificationConfig::wrap)

  /**
   * A builder for [UserPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountRecovery How will a user be able to recover their account?.
     */
    public fun accountRecovery(accountRecovery: AccountRecovery)

    /**
     * @param advancedSecurityMode The user pool's Advanced Security Mode.
     * @deprecated Advanced Security Mode is deprecated in favor of user pool feature plans.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode)

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up.
     * EMAIL and PHONE are the only available options.
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrs)

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up.
     * EMAIL and PHONE are the only available options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b4c61fb6b6786ba2cd0cdaee62f5bfac5a8f5c1263df095f355841dfe31583")
    public fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit)

    /**
     * @param customAttributes Define a set of custom attributes that can be configured for each
     * user in the user pool.
     */
    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>)

    /**
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     * authorization codes that Amazon Cognito generates.
     */
    public fun customSenderKmsKey(customSenderKmsKey: IKey)

    /**
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     * enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deviceTracking Device tracking settings.
     */
    public fun deviceTracking(deviceTracking: DeviceTracking)

    /**
     * @param deviceTracking Device tracking settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bebdf43dd1565603791104679b92654e2c1c2e5ae437f097e61173b19806735b")
    public fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit)

    /**
     * @param email Email settings for a user pool.
     */
    public fun email(email: UserPoolEmail)

    /**
     * @param enableSmsRole Setting this would explicitly enable or disable SMS role creation.
     * When left unspecified, CDK will determine based on other properties if a role is needed or
     * not.
     */
    public fun enableSmsRole(enableSmsRole: Boolean)

    /**
     * @param featurePlan The user pool feature plan, or tier.
     * This parameter determines the eligibility of the user pool for features like managed login,
     * access-token customization, and threat protection.
     */
    public fun featurePlan(featurePlan: FeaturePlan)

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes.
     * EMAIL and PHONE are the only available options.
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs)

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes.
     * EMAIL and PHONE are the only available options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2b1ea51ebc2e561f7aec7ff97a33b13d62962c674c4821501ca4d5773748a6")
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit)

    /**
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers)

    /**
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7261e6a2616c914377ca8a5cb2975dca9fdf661ccd0b4a7d43592ff553961581")
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit)

    /**
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in.
     */
    public fun mfa(mfa: Mfa)

    /**
     * @param mfaMessage The SMS message template sent during MFA verification.
     * Use '{####}' in the template where Cognito should insert the verification code.
     */
    public fun mfaMessage(mfaMessage: String)

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     * Ignored if `mfa` is set to `OFF`.
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor)

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     * Ignored if `mfa` is set to `OFF`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73c017dab3fe462b9952cab3509b256dab8ab5a5f46e4dc1a6ecef646d5db7d5")
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit)

    /**
     * @param passwordPolicy Password policy for this user pool.
     */
    public fun passwordPolicy(passwordPolicy: PasswordPolicy)

    /**
     * @param passwordPolicy Password policy for this user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bb1007ada74f849e18b728735681540aa7a4fee82bd055ccd6b15f1ad2c5f86")
    public fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit)

    /**
     * @param removalPolicy Policy to apply when the user pool is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param selfSignUpEnabled Whether self sign-up should be enabled.
     * To configure self sign-up configuration use the `userVerification` property.
     */
    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean)

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     */
    public fun signInAliases(signInAliases: SignInAliases)

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07190ed32577742f603b5f0d950b360ddd53c462284c6178f81f0d01e4e621")
    public fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit)

    /**
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     */
    public fun signInCaseSensitive(signInCaseSensitive: Boolean)

    /**
     * @param smsRole The IAM role that Cognito will assume while sending SMS messages.
     */
    public fun smsRole(smsRole: IRole)

    /**
     * @param smsRoleExternalId The 'ExternalId' that Cognito service must be using when assuming
     * the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional.
     * Learn more about ExternalId here -
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     *
     * This property will be ignored if `smsRole` is not specified.
     */
    public fun smsRoleExternalId(smsRoleExternalId: String)

    /**
     * @param snsRegion The region to integrate with SNS to send SMS messages.
     * This property will do nothing if SMS configuration is not configured.
     */
    public fun snsRegion(snsRegion: String)

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool.
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    public fun standardAttributes(standardAttributes: StandardAttributes)

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool.
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2715b7948228a46279c9333a4055c40ab1580e1a61e60dd6a8d822fb787658")
    public fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit)

    /**
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    public fun userInvitation(userInvitation: UserInvitationConfig)

    /**
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("841e70ce34bb7311c26a090ce295b06a7391fc0831a768576a6f0992dd711f6a")
    public fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit)

    /**
     * @param userPoolName Name of the user pool.
     */
    public fun userPoolName(userPoolName: String)

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    public fun userVerification(userVerification: UserVerificationConfig)

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5630d9e9cd8ade6f605913d682079ac865f4fef996bae0e10e6b7214918862b")
    public fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolProps.builder()

    /**
     * @param accountRecovery How will a user be able to recover their account?.
     */
    override fun accountRecovery(accountRecovery: AccountRecovery) {
      cdkBuilder.accountRecovery(accountRecovery.let(AccountRecovery.Companion::unwrap))
    }

    /**
     * @param advancedSecurityMode The user pool's Advanced Security Mode.
     * @deprecated Advanced Security Mode is deprecated in favor of user pool feature plans.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
      cdkBuilder.advancedSecurityMode(advancedSecurityMode.let(AdvancedSecurityMode.Companion::unwrap))
    }

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up.
     * EMAIL and PHONE are the only available options.
     */
    override fun autoVerify(autoVerify: AutoVerifiedAttrs) {
      cdkBuilder.autoVerify(autoVerify.let(AutoVerifiedAttrs.Companion::unwrap))
    }

    /**
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up.
     * EMAIL and PHONE are the only available options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b4c61fb6b6786ba2cd0cdaee62f5bfac5a8f5c1263df095f355841dfe31583")
    override fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit): Unit =
        autoVerify(AutoVerifiedAttrs(autoVerify))

    /**
     * @param customAttributes Define a set of custom attributes that can be configured for each
     * user in the user pool.
     */
    override fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
      cdkBuilder.customAttributes(customAttributes.mapValues{ICustomAttribute.unwrap(it.value)})
    }

    /**
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     * authorization codes that Amazon Cognito generates.
     */
    override fun customSenderKmsKey(customSenderKmsKey: IKey) {
      cdkBuilder.customSenderKmsKey(customSenderKmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     * enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deviceTracking Device tracking settings.
     */
    override fun deviceTracking(deviceTracking: DeviceTracking) {
      cdkBuilder.deviceTracking(deviceTracking.let(DeviceTracking.Companion::unwrap))
    }

    /**
     * @param deviceTracking Device tracking settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bebdf43dd1565603791104679b92654e2c1c2e5ae437f097e61173b19806735b")
    override fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit): Unit =
        deviceTracking(DeviceTracking(deviceTracking))

    /**
     * @param email Email settings for a user pool.
     */
    override fun email(email: UserPoolEmail) {
      cdkBuilder.email(email.let(UserPoolEmail.Companion::unwrap))
    }

    /**
     * @param enableSmsRole Setting this would explicitly enable or disable SMS role creation.
     * When left unspecified, CDK will determine based on other properties if a role is needed or
     * not.
     */
    override fun enableSmsRole(enableSmsRole: Boolean) {
      cdkBuilder.enableSmsRole(enableSmsRole)
    }

    /**
     * @param featurePlan The user pool feature plan, or tier.
     * This parameter determines the eligibility of the user pool for features like managed login,
     * access-token customization, and threat protection.
     */
    override fun featurePlan(featurePlan: FeaturePlan) {
      cdkBuilder.featurePlan(featurePlan.let(FeaturePlan.Companion::unwrap))
    }

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes.
     * EMAIL and PHONE are the only available options.
     */
    override fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
      cdkBuilder.keepOriginal(keepOriginal.let(KeepOriginalAttrs.Companion::unwrap))
    }

    /**
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes.
     * EMAIL and PHONE are the only available options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2b1ea51ebc2e561f7aec7ff97a33b13d62962c674c4821501ca4d5773748a6")
    override fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit): Unit =
        keepOriginal(KeepOriginalAttrs(keepOriginal))

    /**
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
      cdkBuilder.lambdaTriggers(lambdaTriggers.let(UserPoolTriggers.Companion::unwrap))
    }

    /**
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7261e6a2616c914377ca8a5cb2975dca9fdf661ccd0b4a7d43592ff553961581")
    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit): Unit =
        lambdaTriggers(UserPoolTriggers(lambdaTriggers))

    /**
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in.
     */
    override fun mfa(mfa: Mfa) {
      cdkBuilder.mfa(mfa.let(Mfa.Companion::unwrap))
    }

    /**
     * @param mfaMessage The SMS message template sent during MFA verification.
     * Use '{####}' in the template where Cognito should insert the verification code.
     */
    override fun mfaMessage(mfaMessage: String) {
      cdkBuilder.mfaMessage(mfaMessage)
    }

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     * Ignored if `mfa` is set to `OFF`.
     */
    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
      cdkBuilder.mfaSecondFactor(mfaSecondFactor.let(MfaSecondFactor.Companion::unwrap))
    }

    /**
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool.
     * Ignored if `mfa` is set to `OFF`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73c017dab3fe462b9952cab3509b256dab8ab5a5f46e4dc1a6ecef646d5db7d5")
    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit): Unit =
        mfaSecondFactor(MfaSecondFactor(mfaSecondFactor))

    /**
     * @param passwordPolicy Password policy for this user pool.
     */
    override fun passwordPolicy(passwordPolicy: PasswordPolicy) {
      cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicy.Companion::unwrap))
    }

    /**
     * @param passwordPolicy Password policy for this user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bb1007ada74f849e18b728735681540aa7a4fee82bd055ccd6b15f1ad2c5f86")
    override fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit): Unit =
        passwordPolicy(PasswordPolicy(passwordPolicy))

    /**
     * @param removalPolicy Policy to apply when the user pool is removed from the stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param selfSignUpEnabled Whether self sign-up should be enabled.
     * To configure self sign-up configuration use the `userVerification` property.
     */
    override fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
      cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
    }

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     */
    override fun signInAliases(signInAliases: SignInAliases) {
      cdkBuilder.signInAliases(signInAliases.let(SignInAliases.Companion::unwrap))
    }

    /**
     * @param signInAliases Methods in which a user registers or signs in to a user pool.
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07190ed32577742f603b5f0d950b360ddd53c462284c6178f81f0d01e4e621")
    override fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit): Unit =
        signInAliases(SignInAliases(signInAliases))

    /**
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     */
    override fun signInCaseSensitive(signInCaseSensitive: Boolean) {
      cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    /**
     * @param smsRole The IAM role that Cognito will assume while sending SMS messages.
     */
    override fun smsRole(smsRole: IRole) {
      cdkBuilder.smsRole(smsRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param smsRoleExternalId The 'ExternalId' that Cognito service must be using when assuming
     * the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional.
     * Learn more about ExternalId here -
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     *
     * This property will be ignored if `smsRole` is not specified.
     */
    override fun smsRoleExternalId(smsRoleExternalId: String) {
      cdkBuilder.smsRoleExternalId(smsRoleExternalId)
    }

    /**
     * @param snsRegion The region to integrate with SNS to send SMS messages.
     * This property will do nothing if SMS configuration is not configured.
     */
    override fun snsRegion(snsRegion: String) {
      cdkBuilder.snsRegion(snsRegion)
    }

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool.
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    override fun standardAttributes(standardAttributes: StandardAttributes) {
      cdkBuilder.standardAttributes(standardAttributes.let(StandardAttributes.Companion::unwrap))
    }

    /**
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool.
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2715b7948228a46279c9333a4055c40ab1580e1a61e60dd6a8d822fb787658")
    override fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit): Unit
        = standardAttributes(StandardAttributes(standardAttributes))

    /**
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    override fun userInvitation(userInvitation: UserInvitationConfig) {
      cdkBuilder.userInvitation(userInvitation.let(UserInvitationConfig.Companion::unwrap))
    }

    /**
     * @param userInvitation Configuration around admins signing up users into a user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("841e70ce34bb7311c26a090ce295b06a7391fc0831a768576a6f0992dd711f6a")
    override fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit): Unit =
        userInvitation(UserInvitationConfig(userInvitation))

    /**
     * @param userPoolName Name of the user pool.
     */
    override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    override fun userVerification(userVerification: UserVerificationConfig) {
      cdkBuilder.userVerification(userVerification.let(UserVerificationConfig.Companion::unwrap))
    }

    /**
     * @param userVerification Configuration around users signing themselves up to the user pool.
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5630d9e9cd8ade6f605913d682079ac865f4fef996bae0e10e6b7214918862b")
    override fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit): Unit
        = userVerification(UserVerificationConfig(userVerification))

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolProps,
  ) : CdkObject(cdkObject),
      UserPoolProps {
    /**
     * How will a user be able to recover their account?
     *
     * Default: AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
     */
    override fun accountRecovery(): AccountRecovery? =
        unwrap(this).getAccountRecovery()?.let(AccountRecovery::wrap)

    /**
     * (deprecated) The user pool's Advanced Security Mode.
     *
     * Default: - no value
     *
     * @deprecated Advanced Security Mode is deprecated in favor of user pool feature plans.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun advancedSecurityMode(): AdvancedSecurityMode? =
        unwrap(this).getAdvancedSecurityMode()?.let(AdvancedSecurityMode::wrap)

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default.
     * If absent, no attributes will be auto-verified.
     */
    override fun autoVerify(): AutoVerifiedAttrs? =
        unwrap(this).getAutoVerify()?.let(AutoVerifiedAttrs::wrap)

    /**
     * Define a set of custom attributes that can be configured for each user in the user pool.
     *
     * Default: - No custom attributes.
     */
    override fun customAttributes(): Map<String, ICustomAttribute> =
        unwrap(this).getCustomAttributes()?.mapValues{ICustomAttribute.wrap(it.value)} ?: emptyMap()

    /**
     * This key will be used to encrypt temporary passwords and authorization codes that Amazon
     * Cognito generates.
     *
     * Default: - no key ID configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sender-triggers.html)
     */
    override fun customSenderKmsKey(): IKey? = unwrap(this).getCustomSenderKmsKey()?.let(IKey::wrap)

    /**
     * Indicates whether the user pool should have deletion protection enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     */
    override fun deviceTracking(): DeviceTracking? =
        unwrap(this).getDeviceTracking()?.let(DeviceTracking::wrap)

    /**
     * Email settings for a user pool.
     *
     * Default: - cognito will use the default email configuration
     */
    override fun email(): UserPoolEmail? = unwrap(this).getEmail()?.let(UserPoolEmail::wrap)

    /**
     * Setting this would explicitly enable or disable SMS role creation.
     *
     * When left unspecified, CDK will determine based on other properties if a role is needed or
     * not.
     *
     * Default: - CDK will determine based on other properties of the user pool if an SMS role
     * should be created or not.
     */
    override fun enableSmsRole(): Boolean? = unwrap(this).getEnableSmsRole()

    /**
     * The user pool feature plan, or tier.
     *
     * This parameter determines the eligibility of the user pool for features like managed login,
     * access-token customization, and threat protection.
     *
     * Default: - FeaturePlan.ESSENTIALS for a newly created user pool; FeaturePlan.LITE otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     */
    override fun featurePlan(): FeaturePlan? = unwrap(this).getFeaturePlan()?.let(FeaturePlan::wrap)

    /**
     * Attributes which Cognito will look to handle changes to the value of your users' email
     * address and phone number attributes.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - Nothing is kept.
     */
    override fun keepOriginal(): KeepOriginalAttrs? =
        unwrap(this).getKeepOriginal()?.let(KeepOriginalAttrs::wrap)

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     */
    override fun lambdaTriggers(): UserPoolTriggers? =
        unwrap(this).getLambdaTriggers()?.let(UserPoolTriggers::wrap)

    /**
     * Configure whether users of this user pool can or are required use MFA to sign in.
     *
     * Default: Mfa.OFF
     */
    override fun mfa(): Mfa? = unwrap(this).getMfa()?.let(Mfa::wrap)

    /**
     * The SMS message template sent during MFA verification.
     *
     * Use '{####}' in the template where Cognito should insert the verification code.
     *
     * Default: 'Your authentication code is {####}.'
     */
    override fun mfaMessage(): String? = unwrap(this).getMfaMessage()

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
     * `REQUIRED`.
     * { sms: false, otp: false, email:false }, otherwise
     */
    override fun mfaSecondFactor(): MfaSecondFactor? =
        unwrap(this).getMfaSecondFactor()?.let(MfaSecondFactor::wrap)

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     */
    override fun passwordPolicy(): PasswordPolicy? =
        unwrap(this).getPasswordPolicy()?.let(PasswordPolicy::wrap)

    /**
     * Policy to apply when the user pool is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Whether self sign-up should be enabled.
     *
     * To configure self sign-up configuration use the `userVerification` property.
     *
     * Default: - false
     */
    override fun selfSignUpEnabled(): Boolean? = unwrap(this).getSelfSignUpEnabled()

    /**
     * Methods in which a user registers or signs in to a user pool.
     *
     * Allows either username with aliases OR sign in with email, phone, or both.
     *
     * Read the sections on usernames and aliases to learn more -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * To match with 'Option 1' in the above link, with a verified email, this property should be
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     *
     * Default: { username: true }
     */
    override fun signInAliases(): SignInAliases? =
        unwrap(this).getSignInAliases()?.let(SignInAliases::wrap)

    /**
     * Whether sign-in aliases should be evaluated with case sensitivity.
     *
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     *
     * Default: true
     */
    override fun signInCaseSensitive(): Boolean? = unwrap(this).getSignInCaseSensitive()

    /**
     * The IAM role that Cognito will assume while sending SMS messages.
     *
     * Default: - a new IAM role is created.
     */
    override fun smsRole(): IRole? = unwrap(this).getSmsRole()?.let(IRole::wrap)

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
     */
    override fun smsRoleExternalId(): String? = unwrap(this).getSmsRoleExternalId()

    /**
     * The region to integrate with SNS to send SMS messages.
     *
     * This property will do nothing if SMS configuration is not configured.
     *
     * Default: - The same region as the user pool, with a few exceptions -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html#user-pool-sms-settings-first-time
     */
    override fun snsRegion(): String? = unwrap(this).getSnsRegion()

    /**
     * The set of attributes that are required for every user in the user pool.
     *
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * Default: - All standard attributes are optional and mutable.
     */
    override fun standardAttributes(): StandardAttributes? =
        unwrap(this).getStandardAttributes()?.let(StandardAttributes::wrap)

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     */
    override fun userInvitation(): UserInvitationConfig? =
        unwrap(this).getUserInvitation()?.let(UserInvitationConfig::wrap)

    /**
     * Name of the user pool.
     *
     * Default: - automatically generated name by CloudFormation at deploy time.
     */
    override fun userPoolName(): String? = unwrap(this).getUserPoolName()

    /**
     * Configuration around users signing themselves up to the user pool.
     *
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     *
     * Default: - see defaults in UserVerificationConfig.
     */
    override fun userVerification(): UserVerificationConfig? =
        unwrap(this).getUserVerification()?.let(UserVerificationConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolProps):
        UserPoolProps = CdkObjectWrappers.wrap(cdkObject) as? UserPoolProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolProps):
        software.amazon.awscdk.services.cognito.UserPoolProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolProps
  }
}
