@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolEmail
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

@CdkDslMarker
public class UserPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPool.Builder = UserPool.Builder.create(scope, id)

  public fun accountRecovery(accountRecovery: AccountRecovery) {
    cdkBuilder.accountRecovery(accountRecovery)
  }

  public fun advancedSecurityMode(advancedSecurityMode: AdvancedSecurityMode) {
    cdkBuilder.advancedSecurityMode(advancedSecurityMode)
  }

  public fun autoVerify(block: AutoVerifiedAttrsDsl.() -> Unit = {}) {
    val builder = AutoVerifiedAttrsDsl()
    builder.apply(block)
    cdkBuilder.autoVerify(builder.build())
  }

  public fun autoVerify(autoVerify: AutoVerifiedAttrs) {
    cdkBuilder.autoVerify(autoVerify)
  }

  public fun customAttributes(customAttributes: Map<String, ICustomAttribute>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  public fun customSenderKmsKey(customSenderKmsKey: IKey) {
    cdkBuilder.customSenderKmsKey(customSenderKmsKey)
  }

  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun deviceTracking(block: DeviceTrackingDsl.() -> Unit = {}) {
    val builder = DeviceTrackingDsl()
    builder.apply(block)
    cdkBuilder.deviceTracking(builder.build())
  }

  public fun deviceTracking(deviceTracking: DeviceTracking) {
    cdkBuilder.deviceTracking(deviceTracking)
  }

  public fun email(email: UserPoolEmail) {
    cdkBuilder.email(email)
  }

  public fun enableSmsRole(enableSmsRole: Boolean) {
    cdkBuilder.enableSmsRole(enableSmsRole)
  }

  public fun keepOriginal(block: KeepOriginalAttrsDsl.() -> Unit = {}) {
    val builder = KeepOriginalAttrsDsl()
    builder.apply(block)
    cdkBuilder.keepOriginal(builder.build())
  }

  public fun keepOriginal(keepOriginal: KeepOriginalAttrs) {
    cdkBuilder.keepOriginal(keepOriginal)
  }

  public fun lambdaTriggers(block: UserPoolTriggersDsl.() -> Unit = {}) {
    val builder = UserPoolTriggersDsl()
    builder.apply(block)
    cdkBuilder.lambdaTriggers(builder.build())
  }

  public fun lambdaTriggers(lambdaTriggers: UserPoolTriggers) {
    cdkBuilder.lambdaTriggers(lambdaTriggers)
  }

  public fun mfa(mfa: Mfa) {
    cdkBuilder.mfa(mfa)
  }

  public fun mfaMessage(mfaMessage: String) {
    cdkBuilder.mfaMessage(mfaMessage)
  }

  public fun mfaSecondFactor(block: MfaSecondFactorDsl.() -> Unit = {}) {
    val builder = MfaSecondFactorDsl()
    builder.apply(block)
    cdkBuilder.mfaSecondFactor(builder.build())
  }

  public fun mfaSecondFactor(mfaSecondFactor: MfaSecondFactor) {
    cdkBuilder.mfaSecondFactor(mfaSecondFactor)
  }

  public fun passwordPolicy(block: PasswordPolicyDsl.() -> Unit = {}) {
    val builder = PasswordPolicyDsl()
    builder.apply(block)
    cdkBuilder.passwordPolicy(builder.build())
  }

  public fun passwordPolicy(passwordPolicy: PasswordPolicy) {
    cdkBuilder.passwordPolicy(passwordPolicy)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun selfSignUpEnabled(selfSignUpEnabled: Boolean) {
    cdkBuilder.selfSignUpEnabled(selfSignUpEnabled)
  }

  public fun signInAliases(block: SignInAliasesDsl.() -> Unit = {}) {
    val builder = SignInAliasesDsl()
    builder.apply(block)
    cdkBuilder.signInAliases(builder.build())
  }

  public fun signInAliases(signInAliases: SignInAliases) {
    cdkBuilder.signInAliases(signInAliases)
  }

  public fun signInCaseSensitive(signInCaseSensitive: Boolean) {
    cdkBuilder.signInCaseSensitive(signInCaseSensitive)
  }

  public fun smsRole(smsRole: IRole) {
    cdkBuilder.smsRole(smsRole)
  }

  public fun smsRoleExternalId(smsRoleExternalId: String) {
    cdkBuilder.smsRoleExternalId(smsRoleExternalId)
  }

  public fun snsRegion(snsRegion: String) {
    cdkBuilder.snsRegion(snsRegion)
  }

  public fun standardAttributes(block: StandardAttributesDsl.() -> Unit = {}) {
    val builder = StandardAttributesDsl()
    builder.apply(block)
    cdkBuilder.standardAttributes(builder.build())
  }

  public fun standardAttributes(standardAttributes: StandardAttributes) {
    cdkBuilder.standardAttributes(standardAttributes)
  }

  public fun userInvitation(block: UserInvitationConfigDsl.() -> Unit = {}) {
    val builder = UserInvitationConfigDsl()
    builder.apply(block)
    cdkBuilder.userInvitation(builder.build())
  }

  public fun userInvitation(userInvitation: UserInvitationConfig) {
    cdkBuilder.userInvitation(userInvitation)
  }

  public fun userPoolName(userPoolName: String) {
    cdkBuilder.userPoolName(userPoolName)
  }

  public fun userVerification(block: UserVerificationConfigDsl.() -> Unit = {}) {
    val builder = UserVerificationConfigDsl()
    builder.apply(block)
    cdkBuilder.userVerification(builder.build())
  }

  public fun userVerification(userVerification: UserVerificationConfig) {
    cdkBuilder.userVerification(userVerification)
  }

  public fun build(): UserPool = cdkBuilder.build()
}
