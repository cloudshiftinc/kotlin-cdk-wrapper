@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface UserPoolProps {
  public fun accountRecovery(): AccountRecovery? =
      unwrap(this).getAccountRecovery()?.let(AccountRecovery::wrap)

  public fun advancedSecurityMode(): AdvancedSecurityMode? =
      unwrap(this).getAdvancedSecurityMode()?.let(AdvancedSecurityMode::wrap)

  public fun autoVerify(): AutoVerifiedAttrs? =
      unwrap(this).getAutoVerify()?.let(AutoVerifiedAttrs::wrap)

  public fun customAttributes(): Map<String, ICustomAttribute> =
      unwrap(this).getCustomAttributes()?.mapValues{ICustomAttribute.wrap(it.value)} ?: emptyMap()

  public fun customSenderKmsKey(): IKey? = unwrap(this).getCustomSenderKmsKey()?.let(IKey::wrap)

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun deviceTracking(): DeviceTracking? =
      unwrap(this).getDeviceTracking()?.let(DeviceTracking::wrap)

  public fun email(): UserPoolEmail? = unwrap(this).getEmail()?.let(UserPoolEmail::wrap)

  public fun enableSmsRole(): Boolean? = unwrap(this).getEnableSmsRole()

  public fun keepOriginal(): KeepOriginalAttrs? =
      unwrap(this).getKeepOriginal()?.let(KeepOriginalAttrs::wrap)

  public fun lambdaTriggers(): UserPoolTriggers? =
      unwrap(this).getLambdaTriggers()?.let(UserPoolTriggers::wrap)

  public fun mfa(): Mfa? = unwrap(this).getMfa()?.let(Mfa::wrap)

  public fun mfaMessage(): String? = unwrap(this).getMfaMessage()

  public fun mfaSecondFactor(): MfaSecondFactor? =
      unwrap(this).getMfaSecondFactor()?.let(MfaSecondFactor::wrap)

  public fun passwordPolicy(): PasswordPolicy? =
      unwrap(this).getPasswordPolicy()?.let(PasswordPolicy::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun selfSignUpEnabled(): Boolean? = unwrap(this).getSelfSignUpEnabled()

  public fun signInAliases(): SignInAliases? =
      unwrap(this).getSignInAliases()?.let(SignInAliases::wrap)

  public fun signInCaseSensitive(): Boolean? = unwrap(this).getSignInCaseSensitive()

  public fun smsRole(): IRole? = unwrap(this).getSmsRole()?.let(IRole::wrap)

  public fun smsRoleExternalId(): String? = unwrap(this).getSmsRoleExternalId()

  public fun snsRegion(): String? = unwrap(this).getSnsRegion()

  public fun standardAttributes(): StandardAttributes? =
      unwrap(this).getStandardAttributes()?.let(StandardAttributes::wrap)

  public fun userInvitation(): UserInvitationConfig? =
      unwrap(this).getUserInvitation()?.let(UserInvitationConfig::wrap)

  public fun userPoolName(): String? = unwrap(this).getUserPoolName()

  public fun userVerification(): UserVerificationConfig? =
      unwrap(this).getUserVerification()?.let(UserVerificationConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accountRecovery(accountRecovery: AccountRecovery)

    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode)

    public fun autoVerify(autoVerify: AutoVerifiedAttrs)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b4c61fb6b6786ba2cd0cdaee62f5bfac5a8f5c1263df095f355841dfe31583")
    public fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit)

    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>)

    public fun customSenderKmsKey(customSenderKmsKey: IKey)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deviceTracking(deviceTracking: DeviceTracking)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bebdf43dd1565603791104679b92654e2c1c2e5ae437f097e61173b19806735b")
    public fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit)

    public fun email(email: UserPoolEmail)

    public fun enableSmsRole(enableSmsRole: Boolean)

    public fun keepOriginal(keepOriginal: KeepOriginalAttrs)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2b1ea51ebc2e561f7aec7ff97a33b13d62962c674c4821501ca4d5773748a6")
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit)

    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7261e6a2616c914377ca8a5cb2975dca9fdf661ccd0b4a7d43592ff553961581")
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit)

    public fun mfa(mfa: Mfa)

    public fun mfaMessage(mfaMessage: String)

    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73c017dab3fe462b9952cab3509b256dab8ab5a5f46e4dc1a6ecef646d5db7d5")
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit)

    public fun passwordPolicy(passwordPolicy: PasswordPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bb1007ada74f849e18b728735681540aa7a4fee82bd055ccd6b15f1ad2c5f86")
    public fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean)

    public fun signInAliases(signInAliases: SignInAliases)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07190ed32577742f603b5f0d950b360ddd53c462284c6178f81f0d01e4e621")
    public fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit)

    public fun signInCaseSensitive(signInCaseSensitive: Boolean)

    public fun smsRole(smsRole: IRole)

    public fun smsRoleExternalId(smsRoleExternalId: String)

    public fun snsRegion(snsRegion: String)

    public fun standardAttributes(standardAttributes: StandardAttributes)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2715b7948228a46279c9333a4055c40ab1580e1a61e60dd6a8d822fb787658")
    public fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit)

    public fun userInvitation(userInvitation: UserInvitationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("841e70ce34bb7311c26a090ce295b06a7391fc0831a768576a6f0992dd711f6a")
    public fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit)

    public fun userPoolName(userPoolName: String)

    public fun userVerification(userVerification: UserVerificationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5630d9e9cd8ade6f605913d682079ac865f4fef996bae0e10e6b7214918862b")
    public fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolProps.builder()

    override fun accountRecovery(accountRecovery: AccountRecovery) {
      cdkBuilder.accountRecovery(accountRecovery.let(AccountRecovery::unwrap))
    }

    override fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
      cdkBuilder.advancedSecurityMode(advancedSecurityMode.let(AdvancedSecurityMode::unwrap))
    }

    override fun autoVerify(autoVerify: AutoVerifiedAttrs) {
      cdkBuilder.autoVerify(autoVerify.let(AutoVerifiedAttrs::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b4c61fb6b6786ba2cd0cdaee62f5bfac5a8f5c1263df095f355841dfe31583")
    override fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit): Unit =
        autoVerify(AutoVerifiedAttrs(autoVerify))

    override fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
      cdkBuilder.customAttributes(customAttributes.mapValues{ICustomAttribute.unwrap(it.value)})
    }

    override fun customSenderKmsKey(customSenderKmsKey: IKey) {
      cdkBuilder.customSenderKmsKey(customSenderKmsKey.let(IKey::unwrap))
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deviceTracking(deviceTracking: DeviceTracking) {
      cdkBuilder.deviceTracking(deviceTracking.let(DeviceTracking::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bebdf43dd1565603791104679b92654e2c1c2e5ae437f097e61173b19806735b")
    override fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit): Unit =
        deviceTracking(DeviceTracking(deviceTracking))

    override fun email(email: UserPoolEmail) {
      cdkBuilder.email(email.let(UserPoolEmail::unwrap))
    }

    override fun enableSmsRole(enableSmsRole: Boolean) {
      cdkBuilder.enableSmsRole(enableSmsRole)
    }

    override fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
      cdkBuilder.keepOriginal(keepOriginal.let(KeepOriginalAttrs::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2b1ea51ebc2e561f7aec7ff97a33b13d62962c674c4821501ca4d5773748a6")
    override fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit): Unit =
        keepOriginal(KeepOriginalAttrs(keepOriginal))

    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
      cdkBuilder.lambdaTriggers(lambdaTriggers.let(UserPoolTriggers::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7261e6a2616c914377ca8a5cb2975dca9fdf661ccd0b4a7d43592ff553961581")
    override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit): Unit =
        lambdaTriggers(UserPoolTriggers(lambdaTriggers))

    override fun mfa(mfa: Mfa) {
      cdkBuilder.mfa(mfa.let(Mfa::unwrap))
    }

    override fun mfaMessage(mfaMessage: String) {
      cdkBuilder.mfaMessage(mfaMessage)
    }

    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
      cdkBuilder.mfaSecondFactor(mfaSecondFactor.let(MfaSecondFactor::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73c017dab3fe462b9952cab3509b256dab8ab5a5f46e4dc1a6ecef646d5db7d5")
    override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit): Unit =
        mfaSecondFactor(MfaSecondFactor(mfaSecondFactor))

    override fun passwordPolicy(passwordPolicy: PasswordPolicy) {
      cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bb1007ada74f849e18b728735681540aa7a4fee82bd055ccd6b15f1ad2c5f86")
    override fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit): Unit =
        passwordPolicy(PasswordPolicy(passwordPolicy))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
      cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
    }

    override fun signInAliases(signInAliases: SignInAliases) {
      cdkBuilder.signInAliases(signInAliases.let(SignInAliases::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07190ed32577742f603b5f0d950b360ddd53c462284c6178f81f0d01e4e621")
    override fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit): Unit =
        signInAliases(SignInAliases(signInAliases))

    override fun signInCaseSensitive(signInCaseSensitive: Boolean) {
      cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    override fun smsRole(smsRole: IRole) {
      cdkBuilder.smsRole(smsRole.let(IRole::unwrap))
    }

    override fun smsRoleExternalId(smsRoleExternalId: String) {
      cdkBuilder.smsRoleExternalId(smsRoleExternalId)
    }

    override fun snsRegion(snsRegion: String) {
      cdkBuilder.snsRegion(snsRegion)
    }

    override fun standardAttributes(standardAttributes: StandardAttributes) {
      cdkBuilder.standardAttributes(standardAttributes.let(StandardAttributes::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2715b7948228a46279c9333a4055c40ab1580e1a61e60dd6a8d822fb787658")
    override fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit): Unit
        = standardAttributes(StandardAttributes(standardAttributes))

    override fun userInvitation(userInvitation: UserInvitationConfig) {
      cdkBuilder.userInvitation(userInvitation.let(UserInvitationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("841e70ce34bb7311c26a090ce295b06a7391fc0831a768576a6f0992dd711f6a")
    override fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit): Unit =
        userInvitation(UserInvitationConfig(userInvitation))

    override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    override fun userVerification(userVerification: UserVerificationConfig) {
      cdkBuilder.userVerification(userVerification.let(UserVerificationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5630d9e9cd8ade6f605913d682079ac865f4fef996bae0e10e6b7214918862b")
    override fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit): Unit
        = userVerification(UserVerificationConfig(userVerification))

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolProps,
  ) : CdkObject(cdkObject), UserPoolProps {
    override fun accountRecovery(): AccountRecovery? =
        unwrap(this).getAccountRecovery()?.let(AccountRecovery::wrap)

    override fun advancedSecurityMode(): AdvancedSecurityMode? =
        unwrap(this).getAdvancedSecurityMode()?.let(AdvancedSecurityMode::wrap)

    override fun autoVerify(): AutoVerifiedAttrs? =
        unwrap(this).getAutoVerify()?.let(AutoVerifiedAttrs::wrap)

    override fun customAttributes(): Map<String, ICustomAttribute> =
        unwrap(this).getCustomAttributes()?.mapValues{ICustomAttribute.wrap(it.value)} ?: emptyMap()

    override fun customSenderKmsKey(): IKey? = unwrap(this).getCustomSenderKmsKey()?.let(IKey::wrap)

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun deviceTracking(): DeviceTracking? =
        unwrap(this).getDeviceTracking()?.let(DeviceTracking::wrap)

    override fun email(): UserPoolEmail? = unwrap(this).getEmail()?.let(UserPoolEmail::wrap)

    override fun enableSmsRole(): Boolean? = unwrap(this).getEnableSmsRole()

    override fun keepOriginal(): KeepOriginalAttrs? =
        unwrap(this).getKeepOriginal()?.let(KeepOriginalAttrs::wrap)

    override fun lambdaTriggers(): UserPoolTriggers? =
        unwrap(this).getLambdaTriggers()?.let(UserPoolTriggers::wrap)

    override fun mfa(): Mfa? = unwrap(this).getMfa()?.let(Mfa::wrap)

    override fun mfaMessage(): String? = unwrap(this).getMfaMessage()

    override fun mfaSecondFactor(): MfaSecondFactor? =
        unwrap(this).getMfaSecondFactor()?.let(MfaSecondFactor::wrap)

    override fun passwordPolicy(): PasswordPolicy? =
        unwrap(this).getPasswordPolicy()?.let(PasswordPolicy::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun selfSignUpEnabled(): Boolean? = unwrap(this).getSelfSignUpEnabled()

    override fun signInAliases(): SignInAliases? =
        unwrap(this).getSignInAliases()?.let(SignInAliases::wrap)

    override fun signInCaseSensitive(): Boolean? = unwrap(this).getSignInCaseSensitive()

    override fun smsRole(): IRole? = unwrap(this).getSmsRole()?.let(IRole::wrap)

    override fun smsRoleExternalId(): String? = unwrap(this).getSmsRoleExternalId()

    override fun snsRegion(): String? = unwrap(this).getSnsRegion()

    override fun standardAttributes(): StandardAttributes? =
        unwrap(this).getStandardAttributes()?.let(StandardAttributes::wrap)

    override fun userInvitation(): UserInvitationConfig? =
        unwrap(this).getUserInvitation()?.let(UserInvitationConfig::wrap)

    override fun userPoolName(): String? = unwrap(this).getUserPoolName()

    override fun userVerification(): UserVerificationConfig? =
        unwrap(this).getUserVerification()?.let(UserVerificationConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolProps):
        UserPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolProps):
        software.amazon.awscdk.services.cognito.UserPoolProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolProps
  }
}
