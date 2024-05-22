@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Credentials to update the password for a `DatabaseInstanceFromSnapshot`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * IInstanceEngine engine =
 * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
 * Key myKey = new Key(this, "MyKey");
 * DatabaseInstanceFromSnapshot.Builder.create(this, "InstanceFromSnapshotWithCustomizedSecret")
 * .engine(engine)
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .credentials(SnapshotCredentials.fromGeneratedSecret("username",
 * SnapshotCredentialsFromGeneratedPasswordOptions.builder()
 * .encryptionKey(myKey)
 * .excludeCharacters("!&amp;*^#&#64;()")
 * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
 * ReplicaRegion.builder().region("eu-west-2").build()))
 * .build()))
 * .build();
 * ```
 */
public abstract class SnapshotCredentials(
  cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials,
) : CdkObject(cdkObject) {
  /**
   * KMS encryption key to encrypt the generated secret.
   *
   * Default: - default master key
   */
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The characters to exclude from the generated password.
   *
   * Only used if `generatePassword` if true.
   *
   * Default: - the DatabaseSecret default exclude character set (" %+~`#$&*()|[]{}:;<>?!'/@\"\\")
   */
  public open fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * Whether a new password should be generated.
   */
  public open fun generatePassword(): Boolean = unwrap(this).getGeneratePassword()

  /**
   * The master user password.
   *
   * Do not put passwords in your CDK code directly.
   *
   * Default: - the existing password from the snapshot
   */
  public open fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  /**
   * Whether to replace the generated secret when the criteria for the password change.
   *
   * Default: false
   */
  public open fun replaceOnPasswordCriteriaChanges(): Boolean? =
      unwrap(this).getReplaceOnPasswordCriteriaChanges()

  /**
   * A list of regions where to replicate the generated secret.
   *
   * Default: - Secret is not replicated
   */
  public open fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  /**
   * Secret used to instantiate this Login.
   *
   * Default: - none
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * The master user name.
   *
   * Must be the **current** master user name of the snapshot.
   * It is not possible to change the master user name of a RDS instance.
   *
   * Default: - the existing username from the snapshot
   */
  public open fun username(): String? = unwrap(this).getUsername()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials,
  ) : SnapshotCredentials(cdkObject)

  public companion object {
    public fun fromGeneratedPassword(username: String): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedPassword(username).let(SnapshotCredentials::wrap)

    public fun fromGeneratedPassword(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedPassword(username,
        options.let(SnapshotCredentialsFromGeneratedPasswordOptions.Companion::unwrap)).let(SnapshotCredentials::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b437dfc7de68bde863f8913a8f7257fa4f3365c7319431248f9f54c1c2072b1")
    public fun fromGeneratedPassword(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions.Builder.() -> Unit):
        SnapshotCredentials = fromGeneratedPassword(username,
        SnapshotCredentialsFromGeneratedPasswordOptions(options))

    public fun fromGeneratedSecret(username: String): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedSecret(username).let(SnapshotCredentials::wrap)

    public fun fromGeneratedSecret(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromGeneratedSecret(username,
        options.let(SnapshotCredentialsFromGeneratedPasswordOptions.Companion::unwrap)).let(SnapshotCredentials::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705fa082196cb4dd2b1b4538f0bf65522295840612d62d4ebfd5fe38af402ef1")
    public fun fromGeneratedSecret(username: String,
        options: SnapshotCredentialsFromGeneratedPasswordOptions.Builder.() -> Unit):
        SnapshotCredentials = fromGeneratedSecret(username,
        SnapshotCredentialsFromGeneratedPasswordOptions(options))

    public fun fromPassword(password: SecretValue): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromPassword(password.let(SecretValue.Companion::unwrap)).let(SnapshotCredentials::wrap)

    public fun fromSecret(secret: ISecret): SnapshotCredentials =
        software.amazon.awscdk.services.rds.SnapshotCredentials.fromSecret(secret.let(ISecret.Companion::unwrap)).let(SnapshotCredentials::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentials):
        SnapshotCredentials = CdkObjectWrappers.wrap(cdkObject) as? SnapshotCredentials ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapshotCredentials):
        software.amazon.awscdk.services.rds.SnapshotCredentials = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.SnapshotCredentials
  }
}
