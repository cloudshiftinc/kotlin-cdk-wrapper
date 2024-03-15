@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class Credentials internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.Credentials,
) : CdkObject(cdkObject) {
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public open fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public open fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  public open fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public open fun secretName(): String? = unwrap(this).getSecretName()

  public open fun username(): String = unwrap(this).getUsername()

  public open fun usernameAsString(): Boolean? = unwrap(this).getUsernameAsString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.Credentials,
  ) : Credentials(cdkObject)

  public companion object {
    public fun fromGeneratedSecret(username: String): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromGeneratedSecret(username).let(Credentials::wrap)

    public fun fromGeneratedSecret(username: String, options: CredentialsBaseOptions): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromGeneratedSecret(username,
        options.let(CredentialsBaseOptions::unwrap)).let(Credentials::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b03868995120525e6c312c2b4db8734101eb6d27be52a57f09996a4835396e0b")
    public fun fromGeneratedSecret(username: String,
        options: CredentialsBaseOptions.Builder.() -> Unit): Credentials =
        fromGeneratedSecret(username, CredentialsBaseOptions(options))

    public fun fromPassword(username: String, password: SecretValue): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromPassword(username,
        password.let(SecretValue::unwrap)).let(Credentials::wrap)

    public fun fromSecret(secret: ISecret): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromSecret(secret.let(ISecret::unwrap)).let(Credentials::wrap)

    public fun fromSecret(secret: ISecret, username: String): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromSecret(secret.let(ISecret::unwrap),
        username).let(Credentials::wrap)

    public fun fromUsername(username: String): Credentials =
        software.amazon.awscdk.services.rds.Credentials.fromUsername(username).let(Credentials::wrap)

    public fun fromUsername(username: String, options: CredentialsFromUsernameOptions): Credentials
        = software.amazon.awscdk.services.rds.Credentials.fromUsername(username,
        options.let(CredentialsFromUsernameOptions::unwrap)).let(Credentials::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0119aa6b8af2cf428e8ddcf75af4780c80416d50332ca96c1ad629359abae392")
    public fun fromUsername(username: String,
        options: CredentialsFromUsernameOptions.Builder.() -> Unit): Credentials =
        fromUsername(username, CredentialsFromUsernameOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.Credentials): Credentials =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Credentials): software.amazon.awscdk.services.rds.Credentials =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.Credentials
  }
}
