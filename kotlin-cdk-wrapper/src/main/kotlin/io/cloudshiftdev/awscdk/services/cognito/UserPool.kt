@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Cognito User Pool.
 *
 * Example:
 *
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
public open class UserPool(
  cdkObject: software.amazon.awscdk.services.cognito.UserPool,
) : Resource(cdkObject),
    IUserPool {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cognito.UserPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolProps(props)
  )

  /**
   * Add a new app client to this user pool.
   *
   * @param id 
   * @param options
   */
  public override fun addClient(id: String): UserPoolClient =
      unwrap(this).addClient(id).let(UserPoolClient::wrap)

  /**
   * Add a new app client to this user pool.
   *
   * @param id 
   * @param options
   */
  public override fun addClient(id: String, options: UserPoolClientOptions): UserPoolClient =
      unwrap(this).addClient(id,
      options.let(UserPoolClientOptions.Companion::unwrap)).let(UserPoolClient::wrap)

  /**
   * Add a new app client to this user pool.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
  public override fun addClient(id: String, options: UserPoolClientOptions.Builder.() -> Unit):
      UserPoolClient = addClient(id, UserPoolClientOptions(options))

  /**
   * Associate a domain to this user pool.
   *
   * @param id 
   * @param options 
   */
  public override fun addDomain(id: String, options: UserPoolDomainOptions): UserPoolDomain =
      unwrap(this).addDomain(id,
      options.let(UserPoolDomainOptions.Companion::unwrap)).let(UserPoolDomain::wrap)

  /**
   * Associate a domain to this user pool.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
  public override fun addDomain(id: String, options: UserPoolDomainOptions.Builder.() -> Unit):
      UserPoolDomain = addDomain(id, UserPoolDomainOptions(options))

  /**
   * Add a new group to this user pool.
   *
   * @param id 
   * @param options 
   */
  public override fun addGroup(id: String, options: UserPoolGroupOptions): UserPoolGroup =
      unwrap(this).addGroup(id,
      options.let(UserPoolGroupOptions.Companion::unwrap)).let(UserPoolGroup::wrap)

  /**
   * Add a new group to this user pool.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed60659e1cd7a9eaf786d6b5c28d91b9f35ff91fa1d394660d954ba05aa25f09")
  public override fun addGroup(id: String, options: UserPoolGroupOptions.Builder.() -> Unit):
      UserPoolGroup = addGroup(id, UserPoolGroupOptions(options))

  /**
   * Add a new resource server to this user pool.
   *
   * @param id 
   * @param options 
   */
  public override fun addResourceServer(id: String, options: UserPoolResourceServerOptions):
      UserPoolResourceServer = unwrap(this).addResourceServer(id,
      options.let(UserPoolResourceServerOptions.Companion::unwrap)).let(UserPoolResourceServer::wrap)

  /**
   * Add a new resource server to this user pool.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
  public override fun addResourceServer(id: String,
      options: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer =
      addResourceServer(id, UserPoolResourceServerOptions(options))

  /**
   * Add a lambda trigger to a user pool operation.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
   * @param operation 
   * @param fn 
   * @param lambdaVersion
   */
  public open fun addTrigger(operation: UserPoolOperation, fn: IFunction) {
    unwrap(this).addTrigger(operation.let(UserPoolOperation.Companion::unwrap),
        fn.let(IFunction.Companion::unwrap))
  }

  /**
   * Add a lambda trigger to a user pool operation.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
   * @param operation 
   * @param fn 
   * @param lambdaVersion
   */
  public open fun addTrigger(
    operation: UserPoolOperation,
    fn: IFunction,
    lambdaVersion: LambdaVersion,
  ) {
    unwrap(this).addTrigger(operation.let(UserPoolOperation.Companion::unwrap),
        fn.let(IFunction.Companion::unwrap), lambdaVersion.let(LambdaVersion.Companion::unwrap))
  }

  /**
   * Adds an IAM policy statement associated with this user pool to an IAM principal's policy.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Get all identity providers registered with this user pool.
   */
  public override fun identityProviders(): List<IUserPoolIdentityProvider> =
      unwrap(this).getIdentityProviders().map(IUserPoolIdentityProvider::wrap)

  /**
   * Register an identity provider with this user pool.
   *
   * @param provider 
   */
  public override fun registerIdentityProvider(provider: IUserPoolIdentityProvider) {
    unwrap(this).registerIdentityProvider(provider.let(IUserPoolIdentityProvider.Companion::unwrap))
  }

  /**
   * The ARN of the user pool.
   */
  public override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

  /**
   * The physical ID of this user pool resource.
   */
  public override fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * User pool provider name.
   */
  public override fun userPoolProviderName(): String = unwrap(this).getUserPoolProviderName()

  /**
   * User pool provider URL.
   */
  public open fun userPoolProviderUrl(): String = unwrap(this).getUserPoolProviderUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * How will a user be able to recover their account?
     *
     * Default: AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
     *
     * @param accountRecovery How will a user be able to recover their account?. 
     */
    public fun accountRecovery(accountRecovery: AccountRecovery)

    /**
     * (deprecated) The user pool's Advanced Security Mode.
     *
     * Default: - no value
     *
     * @deprecated Advanced Security Mode is deprecated due to user pool feature plans. Use
     * StandardThreatProtectionMode and CustomThreatProtectionMode to set Thread Protection level.
     * @param advancedSecurityMode The user pool's Advanced Security Mode. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode)

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default.
     * If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up. 
     */
    public fun autoVerify(autoVerify: AutoVerifiedAttrs)

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default.
     * If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8eba2c9580b25226a6b82a53157ea60ab0cea35bc25b366368aebc9da14abf")
    public fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit)

    /**
     * Define a set of custom attributes that can be configured for each user in the user pool.
     *
     * Default: - No custom attributes.
     *
     * @param customAttributes Define a set of custom attributes that can be configured for each
     * user in the user pool. 
     */
    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>)

    /**
     * This key will be used to encrypt temporary passwords and authorization codes that Amazon
     * Cognito generates.
     *
     * Default: - no key ID configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sender-triggers.html)
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     * authorization codes that Amazon Cognito generates. 
     */
    public fun customSenderKmsKey(customSenderKmsKey: IKey)

    /**
     * The Type of Threat Protection Enabled for Custom Authentication.
     *
     * This feature only functions if your FeaturePlan is set to FeaturePlan.PLUS
     *
     * Default: - no value
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
     * @param customThreatProtectionMode The Type of Threat Protection Enabled for Custom
     * Authentication. 
     */
    public fun customThreatProtectionMode(customThreatProtectionMode: CustomThreatProtectionMode)

    /**
     * Indicates whether the user pool should have deletion protection enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings. 
     */
    public fun deviceTracking(deviceTracking: DeviceTracking)

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94ddbb8b1e7b792d0f2e69d522e1f559b8cb4365e67cfcdd99d46fbd1ad213d1")
    public fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit)

    /**
     * Email settings for a user pool.
     *
     * Default: - cognito will use the default email configuration
     *
     * @param email Email settings for a user pool. 
     */
    public fun email(email: UserPoolEmail)

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
    public fun enableSmsRole(enableSmsRole: Boolean)

    /**
     * The user pool feature plan, or tier.
     *
     * This parameter determines the eligibility of the user pool for features like managed login,
     * access-token customization, and threat protection.
     *
     * Default: - FeaturePlan.ESSENTIALS for a newly created user pool; FeaturePlan.LITE otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * @param featurePlan The user pool feature plan, or tier. 
     */
    public fun featurePlan(featurePlan: FeaturePlan)

    /**
     * Attributes which Cognito will look to handle changes to the value of your users' email
     * address and phone number attributes.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - Nothing is kept.
     *
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes. 
     */
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs)

    /**
     * Attributes which Cognito will look to handle changes to the value of your users' email
     * address and phone number attributes.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - Nothing is kept.
     *
     * @param keepOriginal Attributes which Cognito will look to handle changes to the value of your
     * users' email address and phone number attributes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51e606eae0609292702f5292fc6e6697de1f009c1cf2b240dd78c7b306c9429c")
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit)

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers. 
     */
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers)

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbc157e10e7aef4bcc260e1dafec88b2f0bc74b2825338e225fa638bbd4847")
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit)

    /**
     * Configure whether users of this user pool can or are required use MFA to sign in.
     *
     * Default: Mfa.OFF
     *
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in. 
     */
    public fun mfa(mfa: Mfa)

    /**
     * The SMS message template sent during MFA verification.
     *
     * Use '{####}' in the template where Cognito should insert the verification code.
     *
     * Default: 'Your authentication code is {####}.'
     *
     * @param mfaMessage The SMS message template sent during MFA verification. 
     */
    public fun mfaMessage(mfaMessage: String)

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
     * `REQUIRED`.
     * { sms: false, otp: false, email:false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. 
     */
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor)

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
     * `REQUIRED`.
     * { sms: false, otp: false, email:false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("858b5658f1bc02ddc7e42fc9c5c10c1cc04de7f5d4b006ed2ac10828a41091c8")
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit)

    /**
     * The authentication domain that passkey providers must use as a relying party (RP) in their
     * configuration.
     *
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     *
     * Default: - No authentication domain
     *
     * @param passkeyRelyingPartyId The authentication domain that passkey providers must use as a
     * relying party (RP) in their configuration. 
     */
    public fun passkeyRelyingPartyId(passkeyRelyingPartyId: String)

    /**
     * Your user-pool treatment for MFA with a passkey.
     *
     * You can override other MFA options and require passkey MFA, or you can set it as preferred.
     * When passkey MFA is preferred, the hosted UI encourages users to register a passkey at
     * sign-in.
     *
     * Default: - Cognito default setting is PasskeyUserVerification.PREFERRED
     *
     * @param passkeyUserVerification Your user-pool treatment for MFA with a passkey. 
     */
    public fun passkeyUserVerification(passkeyUserVerification: PasskeyUserVerification)

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool. 
     */
    public fun passwordPolicy(passwordPolicy: PasswordPolicy)

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60b6eb2f7c453c8be04544e87017e2c767db716c39d8fd38009edfe2a9514526")
    public fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit)

    /**
     * Policy to apply when the user pool is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the user pool is removed from the stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Whether self sign-up should be enabled.
     *
     * To configure self sign-up configuration use the `userVerification` property.
     *
     * Default: - false
     *
     * @param selfSignUpEnabled Whether self sign-up should be enabled. 
     */
    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean)

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
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool. 
     */
    public fun signInAliases(signInAliases: SignInAliases)

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
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0914377040da9b9bc0eca84fe21d97b73fccf05eda87d3ab8f605b76d94e286")
    public fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit)

    /**
     * Whether sign-in aliases should be evaluated with case sensitivity.
     *
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     *
     * Default: true
     *
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     * 
     */
    public fun signInCaseSensitive(signInCaseSensitive: Boolean)

    /**
     * Sign-in policy for this user pool.
     *
     * Default: - see defaults on each property of SignInPolicy.
     *
     * @param signInPolicy Sign-in policy for this user pool. 
     */
    public fun signInPolicy(signInPolicy: SignInPolicy)

    /**
     * Sign-in policy for this user pool.
     *
     * Default: - see defaults on each property of SignInPolicy.
     *
     * @param signInPolicy Sign-in policy for this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5762057f950fd27e0c0c56f0d51adca7c49d04e21acc41d2070164b0d786c")
    public fun signInPolicy(signInPolicy: SignInPolicy.Builder.() -> Unit)

    /**
     * The IAM role that Cognito will assume while sending SMS messages.
     *
     * Default: - a new IAM role is created.
     *
     * @param smsRole The IAM role that Cognito will assume while sending SMS messages. 
     */
    public fun smsRole(smsRole: IRole)

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
     * the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional. 
     */
    public fun smsRoleExternalId(smsRoleExternalId: String)

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
    public fun snsRegion(snsRegion: String)

    /**
     * The set of attributes that are required for every user in the user pool.
     *
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * Default: - All standard attributes are optional and mutable.
     *
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool. 
     */
    public fun standardAttributes(standardAttributes: StandardAttributes)

    /**
     * The set of attributes that are required for every user in the user pool.
     *
     * Read more on attributes here -
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     *
     * Default: - All standard attributes are optional and mutable.
     *
     * @param standardAttributes The set of attributes that are required for every user in the user
     * pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8096998feb3fe3aa70fee05d564bd96732eb2f7a77729561ccb46044210058ea")
    public fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit)

    /**
     * The Type of Threat Protection Enabled for Standard Authentication.
     *
     * This feature only functions if your FeaturePlan is set to FeaturePlan.PLUS
     *
     * Default: - StandardThreatProtectionMode.NO_ENFORCEMENT
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
     * @param standardThreatProtectionMode The Type of Threat Protection Enabled for Standard
     * Authentication. 
     */
    public
        fun standardThreatProtectionMode(standardThreatProtectionMode: StandardThreatProtectionMode)

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool. 
     */
    public fun userInvitation(userInvitation: UserInvitationConfig)

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c47794b636ee902ac75d64d09a24c129417ef52b5068ad62a48120024c45d3a5")
    public fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit)

    /**
     * Name of the user pool.
     *
     * Default: - automatically generated name by CloudFormation at deploy time.
     *
     * @param userPoolName Name of the user pool. 
     */
    public fun userPoolName(userPoolName: String)

    /**
     * Configuration around users signing themselves up to the user pool.
     *
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     *
     * Default: - see defaults in UserVerificationConfig.
     *
     * @param userVerification Configuration around users signing themselves up to the user pool. 
     */
    public fun userVerification(userVerification: UserVerificationConfig)

    /**
     * Configuration around users signing themselves up to the user pool.
     *
     * Enable or disable self sign-up via the `selfSignUpEnabled` property.
     *
     * Default: - see defaults in UserVerificationConfig.
     *
     * @param userVerification Configuration around users signing themselves up to the user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe36baf5dd3c2b0c9c372e6a08eb81d6971a63456433d7bf4c29371436ba1ed")
    public fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPool.Builder =
        software.amazon.awscdk.services.cognito.UserPool.Builder.create(scope, id)

    /**
     * How will a user be able to recover their account?
     *
     * Default: AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
     *
     * @param accountRecovery How will a user be able to recover their account?. 
     */
    override fun accountRecovery(accountRecovery: AccountRecovery) {
      cdkBuilder.accountRecovery(accountRecovery.let(AccountRecovery.Companion::unwrap))
    }

    /**
     * (deprecated) The user pool's Advanced Security Mode.
     *
     * Default: - no value
     *
     * @deprecated Advanced Security Mode is deprecated due to user pool feature plans. Use
     * StandardThreatProtectionMode and CustomThreatProtectionMode to set Thread Protection level.
     * @param advancedSecurityMode The user pool's Advanced Security Mode. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
      cdkBuilder.advancedSecurityMode(advancedSecurityMode.let(AdvancedSecurityMode.Companion::unwrap))
    }

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default.
     * If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up. 
     */
    override fun autoVerify(autoVerify: AutoVerifiedAttrs) {
      cdkBuilder.autoVerify(autoVerify.let(AutoVerifiedAttrs.Companion::unwrap))
    }

    /**
     * Attributes which Cognito will look to verify automatically upon user sign up.
     *
     * EMAIL and PHONE are the only available options.
     *
     * Default: - If `signInAlias` includes email and/or phone, they will be included in
     * `autoVerifiedAttributes` by default.
     * If absent, no attributes will be auto-verified.
     *
     * @param autoVerify Attributes which Cognito will look to verify automatically upon user sign
     * up. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8eba2c9580b25226a6b82a53157ea60ab0cea35bc25b366368aebc9da14abf")
    override fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit): Unit =
        autoVerify(AutoVerifiedAttrs(autoVerify))

    /**
     * Define a set of custom attributes that can be configured for each user in the user pool.
     *
     * Default: - No custom attributes.
     *
     * @param customAttributes Define a set of custom attributes that can be configured for each
     * user in the user pool. 
     */
    override fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
      cdkBuilder.customAttributes(customAttributes.mapValues{ICustomAttribute.unwrap(it.value)})
    }

    /**
     * This key will be used to encrypt temporary passwords and authorization codes that Amazon
     * Cognito generates.
     *
     * Default: - no key ID configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sender-triggers.html)
     * @param customSenderKmsKey This key will be used to encrypt temporary passwords and
     * authorization codes that Amazon Cognito generates. 
     */
    override fun customSenderKmsKey(customSenderKmsKey: IKey) {
      cdkBuilder.customSenderKmsKey(customSenderKmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * The Type of Threat Protection Enabled for Custom Authentication.
     *
     * This feature only functions if your FeaturePlan is set to FeaturePlan.PLUS
     *
     * Default: - no value
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
     * @param customThreatProtectionMode The Type of Threat Protection Enabled for Custom
     * Authentication. 
     */
    override
        fun customThreatProtectionMode(customThreatProtectionMode: CustomThreatProtectionMode) {
      cdkBuilder.customThreatProtectionMode(customThreatProtectionMode.let(CustomThreatProtectionMode.Companion::unwrap))
    }

    /**
     * Indicates whether the user pool should have deletion protection enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether the user pool should have deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings. 
     */
    override fun deviceTracking(deviceTracking: DeviceTracking) {
      cdkBuilder.deviceTracking(deviceTracking.let(DeviceTracking.Companion::unwrap))
    }

    /**
     * Device tracking settings.
     *
     * Default: - see defaults on each property of DeviceTracking.
     *
     * @param deviceTracking Device tracking settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94ddbb8b1e7b792d0f2e69d522e1f559b8cb4365e67cfcdd99d46fbd1ad213d1")
    override fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit): Unit =
        deviceTracking(DeviceTracking(deviceTracking))

    /**
     * Email settings for a user pool.
     *
     * Default: - cognito will use the default email configuration
     *
     * @param email Email settings for a user pool. 
     */
    override fun email(email: UserPoolEmail) {
      cdkBuilder.email(email.let(UserPoolEmail.Companion::unwrap))
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
    override fun enableSmsRole(enableSmsRole: Boolean) {
      cdkBuilder.enableSmsRole(enableSmsRole)
    }

    /**
     * The user pool feature plan, or tier.
     *
     * This parameter determines the eligibility of the user pool for features like managed login,
     * access-token customization, and threat protection.
     *
     * Default: - FeaturePlan.ESSENTIALS for a newly created user pool; FeaturePlan.LITE otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-sign-in-feature-plans.html)
     * @param featurePlan The user pool feature plan, or tier. 
     */
    override fun featurePlan(featurePlan: FeaturePlan) {
      cdkBuilder.featurePlan(featurePlan.let(FeaturePlan.Companion::unwrap))
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
     * users' email address and phone number attributes. 
     */
    override fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
      cdkBuilder.keepOriginal(keepOriginal.let(KeepOriginalAttrs.Companion::unwrap))
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
     * users' email address and phone number attributes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51e606eae0609292702f5292fc6e6697de1f009c1cf2b240dd78c7b306c9429c")
    override fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit): Unit =
        keepOriginal(KeepOriginalAttrs(keepOriginal))

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers. 
     */
    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
      cdkBuilder.lambdaTriggers(lambdaTriggers.let(UserPoolTriggers.Companion::unwrap))
    }

    /**
     * Lambda functions to use for supported Cognito triggers.
     *
     * Default: - No Lambda triggers.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     * @param lambdaTriggers Lambda functions to use for supported Cognito triggers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbc157e10e7aef4bcc260e1dafec88b2f0bc74b2825338e225fa638bbd4847")
    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit): Unit =
        lambdaTriggers(UserPoolTriggers(lambdaTriggers))

    /**
     * Configure whether users of this user pool can or are required use MFA to sign in.
     *
     * Default: Mfa.OFF
     *
     * @param mfa Configure whether users of this user pool can or are required use MFA to sign in. 
     */
    override fun mfa(mfa: Mfa) {
      cdkBuilder.mfa(mfa.let(Mfa.Companion::unwrap))
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
    override fun mfaMessage(mfaMessage: String) {
      cdkBuilder.mfaMessage(mfaMessage)
    }

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
     * `REQUIRED`.
     * { sms: false, otp: false, email:false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. 
     */
    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
      cdkBuilder.mfaSecondFactor(mfaSecondFactor.let(MfaSecondFactor.Companion::unwrap))
    }

    /**
     * Configure the MFA types that users can use in this user pool.
     *
     * Ignored if `mfa` is set to `OFF`.
     *
     * Default: - { sms: true, otp: false, email: false }, if `mfa` is set to `OPTIONAL` or
     * `REQUIRED`.
     * { sms: false, otp: false, email:false }, otherwise
     *
     * @param mfaSecondFactor Configure the MFA types that users can use in this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("858b5658f1bc02ddc7e42fc9c5c10c1cc04de7f5d4b006ed2ac10828a41091c8")
    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit): Unit =
        mfaSecondFactor(MfaSecondFactor(mfaSecondFactor))

    /**
     * The authentication domain that passkey providers must use as a relying party (RP) in their
     * configuration.
     *
     * Under the following conditions, the passkey relying party ID must be the fully-qualified
     * domain name of your custom domain:
     *
     * * The user pool is configured for passkey authentication.
     * * The user pool has a custom domain, whether or not it also has a prefix domain.
     * * Your application performs authentication with managed login or the classic hosted UI.
     *
     * Default: - No authentication domain
     *
     * @param passkeyRelyingPartyId The authentication domain that passkey providers must use as a
     * relying party (RP) in their configuration. 
     */
    override fun passkeyRelyingPartyId(passkeyRelyingPartyId: String) {
      cdkBuilder.passkeyRelyingPartyId(passkeyRelyingPartyId)
    }

    /**
     * Your user-pool treatment for MFA with a passkey.
     *
     * You can override other MFA options and require passkey MFA, or you can set it as preferred.
     * When passkey MFA is preferred, the hosted UI encourages users to register a passkey at
     * sign-in.
     *
     * Default: - Cognito default setting is PasskeyUserVerification.PREFERRED
     *
     * @param passkeyUserVerification Your user-pool treatment for MFA with a passkey. 
     */
    override fun passkeyUserVerification(passkeyUserVerification: PasskeyUserVerification) {
      cdkBuilder.passkeyUserVerification(passkeyUserVerification.let(PasskeyUserVerification.Companion::unwrap))
    }

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool. 
     */
    override fun passwordPolicy(passwordPolicy: PasswordPolicy) {
      cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicy.Companion::unwrap))
    }

    /**
     * Password policy for this user pool.
     *
     * Default: - see defaults on each property of PasswordPolicy.
     *
     * @param passwordPolicy Password policy for this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60b6eb2f7c453c8be04544e87017e2c767db716c39d8fd38009edfe2a9514526")
    override fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit): Unit =
        passwordPolicy(PasswordPolicy(passwordPolicy))

    /**
     * Policy to apply when the user pool is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the user pool is removed from the stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
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
    override fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
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
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     *
     * Default: { username: true }
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool. 
     */
    override fun signInAliases(signInAliases: SignInAliases) {
      cdkBuilder.signInAliases(signInAliases.let(SignInAliases.Companion::unwrap))
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
     * set to
     * `{ username: true, email: true }`. To match with 'Option 2' in the above link with both a
     * verified email and phone
     * number, this property should be set to `{ email: true, phone: true }`.
     *
     * Default: { username: true }
     *
     * @param signInAliases Methods in which a user registers or signs in to a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0914377040da9b9bc0eca84fe21d97b73fccf05eda87d3ab8f605b76d94e286")
    override fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit): Unit =
        signInAliases(SignInAliases(signInAliases))

    /**
     * Whether sign-in aliases should be evaluated with case sensitivity.
     *
     * For example, when this option is set to false, users will be able to sign in using either
     * `MyUsername` or `myusername`.
     *
     * Default: true
     *
     * @param signInCaseSensitive Whether sign-in aliases should be evaluated with case sensitivity.
     * 
     */
    override fun signInCaseSensitive(signInCaseSensitive: Boolean) {
      cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    /**
     * Sign-in policy for this user pool.
     *
     * Default: - see defaults on each property of SignInPolicy.
     *
     * @param signInPolicy Sign-in policy for this user pool. 
     */
    override fun signInPolicy(signInPolicy: SignInPolicy) {
      cdkBuilder.signInPolicy(signInPolicy.let(SignInPolicy.Companion::unwrap))
    }

    /**
     * Sign-in policy for this user pool.
     *
     * Default: - see defaults on each property of SignInPolicy.
     *
     * @param signInPolicy Sign-in policy for this user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5762057f950fd27e0c0c56f0d51adca7c49d04e21acc41d2070164b0d786c")
    override fun signInPolicy(signInPolicy: SignInPolicy.Builder.() -> Unit): Unit =
        signInPolicy(SignInPolicy(signInPolicy))

    /**
     * The IAM role that Cognito will assume while sending SMS messages.
     *
     * Default: - a new IAM role is created.
     *
     * @param smsRole The IAM role that Cognito will assume while sending SMS messages. 
     */
    override fun smsRole(smsRole: IRole) {
      cdkBuilder.smsRole(smsRole.let(IRole.Companion::unwrap))
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
     * the `smsRole`, if the role is restricted with an 'sts:ExternalId' conditional. 
     */
    override fun smsRoleExternalId(smsRoleExternalId: String) {
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
    override fun snsRegion(snsRegion: String) {
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
     * pool. 
     */
    override fun standardAttributes(standardAttributes: StandardAttributes) {
      cdkBuilder.standardAttributes(standardAttributes.let(StandardAttributes.Companion::unwrap))
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
     * pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8096998feb3fe3aa70fee05d564bd96732eb2f7a77729561ccb46044210058ea")
    override fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit): Unit
        = standardAttributes(StandardAttributes(standardAttributes))

    /**
     * The Type of Threat Protection Enabled for Standard Authentication.
     *
     * This feature only functions if your FeaturePlan is set to FeaturePlan.PLUS
     *
     * Default: - StandardThreatProtectionMode.NO_ENFORCEMENT
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
     * @param standardThreatProtectionMode The Type of Threat Protection Enabled for Standard
     * Authentication. 
     */
    override
        fun standardThreatProtectionMode(standardThreatProtectionMode: StandardThreatProtectionMode) {
      cdkBuilder.standardThreatProtectionMode(standardThreatProtectionMode.let(StandardThreatProtectionMode.Companion::unwrap))
    }

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool. 
     */
    override fun userInvitation(userInvitation: UserInvitationConfig) {
      cdkBuilder.userInvitation(userInvitation.let(UserInvitationConfig.Companion::unwrap))
    }

    /**
     * Configuration around admins signing up users into a user pool.
     *
     * Default: - see defaults in UserInvitationConfig.
     *
     * @param userInvitation Configuration around admins signing up users into a user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c47794b636ee902ac75d64d09a24c129417ef52b5068ad62a48120024c45d3a5")
    override fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit): Unit =
        userInvitation(UserInvitationConfig(userInvitation))

    /**
     * Name of the user pool.
     *
     * Default: - automatically generated name by CloudFormation at deploy time.
     *
     * @param userPoolName Name of the user pool. 
     */
    override fun userPoolName(userPoolName: String) {
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
    override fun userVerification(userVerification: UserVerificationConfig) {
      cdkBuilder.userVerification(userVerification.let(UserVerificationConfig.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe36baf5dd3c2b0c9c372e6a08eb81d6971a63456433d7bf4c29371436ba1ed")
    override fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit): Unit
        = userVerification(UserVerificationConfig(userVerification))

    public fun build(): software.amazon.awscdk.services.cognito.UserPool = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cognito.UserPool.PROPERTY_INJECTION_ID

    public fun fromUserPoolArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolArn: String,
    ): IUserPool =
        software.amazon.awscdk.services.cognito.UserPool.fromUserPoolArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, userPoolArn).let(IUserPool::wrap)

    public fun fromUserPoolId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolId: String,
    ): IUserPool =
        software.amazon.awscdk.services.cognito.UserPool.fromUserPoolId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, userPoolId).let(IUserPool::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPool): UserPool =
        UserPool(cdkObject)

    internal fun unwrap(wrapped: UserPool): software.amazon.awscdk.services.cognito.UserPool =
        wrapped.cdkObject as software.amazon.awscdk.services.cognito.UserPool
  }
}
