package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPool,
) : Resource(cdkObject), IUserPool {
  public override fun addClient(id: String): UserPoolClient =
      unwrap(this).addClient(id).let(UserPoolClient::wrap)

  public override fun addClient(id: String, options: UserPoolClientOptions): UserPoolClient =
      unwrap(this).addClient(id,
      options.let(UserPoolClientOptions::unwrap)).let(UserPoolClient::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
  public override fun addClient(id: String, options: UserPoolClientOptions.Builder.() -> Unit):
      UserPoolClient = addClient(id, UserPoolClientOptions(options))

  public override fun addDomain(id: String, options: UserPoolDomainOptions): UserPoolDomain =
      unwrap(this).addDomain(id,
      options.let(UserPoolDomainOptions::unwrap)).let(UserPoolDomain::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
  public override fun addDomain(id: String, options: UserPoolDomainOptions.Builder.() -> Unit):
      UserPoolDomain = addDomain(id, UserPoolDomainOptions(options))

  public override fun addResourceServer(id: String, options: UserPoolResourceServerOptions):
      UserPoolResourceServer = unwrap(this).addResourceServer(id,
      options.let(UserPoolResourceServerOptions::unwrap)).let(UserPoolResourceServer::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
  public override fun addResourceServer(id: String,
      options: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer =
      addResourceServer(id, UserPoolResourceServerOptions(options))

  public open fun addTrigger(operation: UserPoolOperation, fn: IFunction) {
    unwrap(this).addTrigger(operation.let(UserPoolOperation::unwrap), fn.let(IFunction::unwrap))
  }

  public open fun addTrigger(
    operation: UserPoolOperation,
    fn: IFunction,
    lambdaVersion: LambdaVersion,
  ) {
    unwrap(this).addTrigger(operation.let(UserPoolOperation::unwrap), fn.let(IFunction::unwrap),
        lambdaVersion.let(LambdaVersion::unwrap))
  }

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun identityProviders(): List<IUserPoolIdentityProvider> =
      unwrap(this).getIdentityProviders().map(IUserPoolIdentityProvider::wrap)

  public override fun registerIdentityProvider(provider: IUserPoolIdentityProvider) {
    unwrap(this).registerIdentityProvider(provider.let(IUserPoolIdentityProvider::unwrap))
  }

  public override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

  public override fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolProviderName(): String = unwrap(this).getUserPoolProviderName()

  public open fun userPoolProviderUrl(): String = unwrap(this).getUserPoolProviderUrl()

  public interface Builder {
    public fun accountRecovery(accountRecovery: AccountRecovery) {
    }

    public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
    }

    public fun autoVerify(autoVerify: AutoVerifiedAttrs) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8eba2c9580b25226a6b82a53157ea60ab0cea35bc25b366368aebc9da14abf")
    public fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit) {
    }

    public fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
    }

    public fun customSenderKmsKey(customSenderKmsKey: IKey) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun deviceTracking(deviceTracking: DeviceTracking) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94ddbb8b1e7b792d0f2e69d522e1f559b8cb4365e67cfcdd99d46fbd1ad213d1")
    public fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit) {
    }

    public fun email(email: UserPoolEmail) {
    }

    public fun enableSmsRole(enableSmsRole: Boolean) {
    }

    public fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51e606eae0609292702f5292fc6e6697de1f009c1cf2b240dd78c7b306c9429c")
    public fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit) {
    }

    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbc157e10e7aef4bcc260e1dafec88b2f0bc74b2825338e225fa638bbd4847")
    public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit) {
    }

    public fun mfa(mfa: Mfa) {
    }

    public fun mfaMessage(mfaMessage: String) {
    }

    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("858b5658f1bc02ddc7e42fc9c5c10c1cc04de7f5d4b006ed2ac10828a41091c8")
    public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit) {
    }

    public fun passwordPolicy(passwordPolicy: PasswordPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60b6eb2f7c453c8be04544e87017e2c767db716c39d8fd38009edfe2a9514526")
    public fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
    }

    public fun signInAliases(signInAliases: SignInAliases) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0914377040da9b9bc0eca84fe21d97b73fccf05eda87d3ab8f605b76d94e286")
    public fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit) {
    }

    public fun signInCaseSensitive(signInCaseSensitive: Boolean) {
    }

    public fun smsRole(smsRole: IRole) {
    }

    public fun smsRoleExternalId(smsRoleExternalId: String) {
    }

    public fun snsRegion(snsRegion: String) {
    }

    public fun standardAttributes(standardAttributes: StandardAttributes) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8096998feb3fe3aa70fee05d564bd96732eb2f7a77729561ccb46044210058ea")
    public fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit) {
    }

    public fun userInvitation(userInvitation: UserInvitationConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c47794b636ee902ac75d64d09a24c129417ef52b5068ad62a48120024c45d3a5")
    public fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit) {
    }

    public fun userPoolName(userPoolName: String) {
    }

    public fun userVerification(userVerification: UserVerificationConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe36baf5dd3c2b0c9c372e6a08eb81d6971a63456433d7bf4c29371436ba1ed")
    public fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPool.Builder =
        software.amazon.awscdk.services.cognito.UserPool.Builder.create(scope, id)

    public override fun accountRecovery(accountRecovery: AccountRecovery) {
      cdkBuilder.accountRecovery(accountRecovery.let(AccountRecovery::unwrap))
    }

    public override fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
      cdkBuilder.advancedSecurityMode(advancedSecurityMode.let(AdvancedSecurityMode::unwrap))
    }

    public override fun autoVerify(autoVerify: AutoVerifiedAttrs) {
      cdkBuilder.autoVerify(autoVerify.let(AutoVerifiedAttrs::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da8eba2c9580b25226a6b82a53157ea60ab0cea35bc25b366368aebc9da14abf")
    public override fun autoVerify(autoVerify: AutoVerifiedAttrs.Builder.() -> Unit): Unit =
        autoVerify(AutoVerifiedAttrs(autoVerify))

    public override fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
      cdkBuilder.customAttributes(customAttributes.mapValues { ICustomAttribute.unwrap(it.value)})
    }

    public override fun customSenderKmsKey(customSenderKmsKey: IKey) {
      cdkBuilder.customSenderKmsKey(customSenderKmsKey.let(IKey::unwrap))
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun deviceTracking(deviceTracking: DeviceTracking) {
      cdkBuilder.deviceTracking(deviceTracking.let(DeviceTracking::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94ddbb8b1e7b792d0f2e69d522e1f559b8cb4365e67cfcdd99d46fbd1ad213d1")
    public override fun deviceTracking(deviceTracking: DeviceTracking.Builder.() -> Unit): Unit =
        deviceTracking(DeviceTracking(deviceTracking))

    public override fun email(email: UserPoolEmail) {
      cdkBuilder.email(email.let(UserPoolEmail::unwrap))
    }

    public override fun enableSmsRole(enableSmsRole: Boolean) {
      cdkBuilder.enableSmsRole(enableSmsRole)
    }

    public override fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
      cdkBuilder.keepOriginal(keepOriginal.let(KeepOriginalAttrs::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51e606eae0609292702f5292fc6e6697de1f009c1cf2b240dd78c7b306c9429c")
    public override fun keepOriginal(keepOriginal: KeepOriginalAttrs.Builder.() -> Unit): Unit =
        keepOriginal(KeepOriginalAttrs(keepOriginal))

    public override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
      cdkBuilder.lambdaTriggers(lambdaTriggers.let(UserPoolTriggers::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbc157e10e7aef4bcc260e1dafec88b2f0bc74b2825338e225fa638bbd4847")
    public override fun lambdaTriggers(lambdaTriggers: UserPoolTriggers.Builder.() -> Unit): Unit =
        lambdaTriggers(UserPoolTriggers(lambdaTriggers))

    public override fun mfa(mfa: Mfa) {
      cdkBuilder.mfa(mfa.let(Mfa::unwrap))
    }

    public override fun mfaMessage(mfaMessage: String) {
      cdkBuilder.mfaMessage(mfaMessage)
    }

    public override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
      cdkBuilder.mfaSecondFactor(mfaSecondFactor.let(MfaSecondFactor::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("858b5658f1bc02ddc7e42fc9c5c10c1cc04de7f5d4b006ed2ac10828a41091c8")
    public override fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor.Builder.() -> Unit): Unit =
        mfaSecondFactor(MfaSecondFactor(mfaSecondFactor))

    public override fun passwordPolicy(passwordPolicy: PasswordPolicy) {
      cdkBuilder.passwordPolicy(passwordPolicy.let(PasswordPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60b6eb2f7c453c8be04544e87017e2c767db716c39d8fd38009edfe2a9514526")
    public override fun passwordPolicy(passwordPolicy: PasswordPolicy.Builder.() -> Unit): Unit =
        passwordPolicy(PasswordPolicy(passwordPolicy))

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
      cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
    }

    public override fun signInAliases(signInAliases: SignInAliases) {
      cdkBuilder.signInAliases(signInAliases.let(SignInAliases::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0914377040da9b9bc0eca84fe21d97b73fccf05eda87d3ab8f605b76d94e286")
    public override fun signInAliases(signInAliases: SignInAliases.Builder.() -> Unit): Unit =
        signInAliases(SignInAliases(signInAliases))

    public override fun signInCaseSensitive(signInCaseSensitive: Boolean) {
      cdkBuilder.signInCaseSensitive(signInCaseSensitive)
    }

    public override fun smsRole(smsRole: IRole) {
      cdkBuilder.smsRole(smsRole.let(IRole::unwrap))
    }

    public override fun smsRoleExternalId(smsRoleExternalId: String) {
      cdkBuilder.smsRoleExternalId(smsRoleExternalId)
    }

    public override fun snsRegion(snsRegion: String) {
      cdkBuilder.snsRegion(snsRegion)
    }

    public override fun standardAttributes(standardAttributes: StandardAttributes) {
      cdkBuilder.standardAttributes(standardAttributes.let(StandardAttributes::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8096998feb3fe3aa70fee05d564bd96732eb2f7a77729561ccb46044210058ea")
    public override
        fun standardAttributes(standardAttributes: StandardAttributes.Builder.() -> Unit): Unit =
        standardAttributes(StandardAttributes(standardAttributes))

    public override fun userInvitation(userInvitation: UserInvitationConfig) {
      cdkBuilder.userInvitation(userInvitation.let(UserInvitationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c47794b636ee902ac75d64d09a24c129417ef52b5068ad62a48120024c45d3a5")
    public override fun userInvitation(userInvitation: UserInvitationConfig.Builder.() -> Unit):
        Unit = userInvitation(UserInvitationConfig(userInvitation))

    public override fun userPoolName(userPoolName: String) {
      cdkBuilder.userPoolName(userPoolName)
    }

    public override fun userVerification(userVerification: UserVerificationConfig) {
      cdkBuilder.userVerification(userVerification.let(UserVerificationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfe36baf5dd3c2b0c9c372e6a08eb81d6971a63456433d7bf4c29371436ba1ed")
    public override
        fun userVerification(userVerification: UserVerificationConfig.Builder.() -> Unit): Unit =
        userVerification(UserVerificationConfig(userVerification))

    public fun build(): software.amazon.awscdk.services.cognito.UserPool = cdkBuilder.build()
  }

  public companion object {
    public open fun fromUserPoolArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolArn: String,
    ): IUserPool =
        software.amazon.awscdk.services.cognito.UserPool.fromUserPoolArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userPoolArn).let(IUserPool::wrap)

    public open fun fromUserPoolId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolId: String,
    ): IUserPool =
        software.amazon.awscdk.services.cognito.UserPool.fromUserPoolId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        wrapped.cdkObject
  }
}
