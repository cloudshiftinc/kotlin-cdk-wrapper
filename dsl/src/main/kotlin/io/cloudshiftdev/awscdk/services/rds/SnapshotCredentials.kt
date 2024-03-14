package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class SnapshotCredentials internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials,
) {
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public open fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public open fun generatePassword(): Boolean = unwrap(this).getGeneratePassword()

  public open fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  public open fun replaceOnPasswordCriteriaChanges(): Boolean? =
      unwrap(this).getReplaceOnPasswordCriteriaChanges()

  public open fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public open fun username(): String? = unwrap(this).getUsername()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials,
  ) : SnapshotCredentials(cdkObject)

  public companion object {
    public open fun fromGeneratedPassword(username: String): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedPassword(username).let(SnapshotCredentials::wrap)

    public open fun fromGeneratedPassword(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedPassword(username,
        options.let(SnapshotCredentialsFromGeneratedPasswordOptions::unwrap)).let(SnapshotCredentials::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b437dfc7de68bde863f8913a8f7257fa4f3365c7319431248f9f54c1c2072b1")
    public open fun fromGeneratedPassword(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions.Builder.() -> Unit):
        SnapshotCredentials = fromGeneratedPassword(username,
        SnapshotCredentialsFromGeneratedPasswordOptions(options))

    public open fun fromGeneratedSecret(username: String): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedSecret(username).let(SnapshotCredentials::wrap)

    public open fun fromGeneratedSecret(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedSecret(username,
        options.let(SnapshotCredentialsFromGeneratedPasswordOptions::unwrap)).let(SnapshotCredentials::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705fa082196cb4dd2b1b4538f0bf65522295840612d62d4ebfd5fe38af402ef1")
    public open fun fromGeneratedSecret(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions.Builder.() -> Unit):
        SnapshotCredentials = fromGeneratedSecret(username,
        SnapshotCredentialsFromGeneratedPasswordOptions(options))

    public open fun fromPassword(password: SecretValue): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromPassword(password.let(SecretValue::unwrap)).let(SnapshotCredentials::wrap)

    public open fun fromSecret(secret: ISecret): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromSecret(secret.let(ISecret::unwrap)).let(SnapshotCredentials::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials):
        SnapshotCredentials = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapshotCredentials):
        software.amazon.awscdk.services.rds.SnapshotCredentials = (wrapped as Wrapper).cdkObject
  }
}
