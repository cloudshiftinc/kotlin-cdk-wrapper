@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options used in the `SnapshotCredentials.fromGeneratedPassword` method.
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
public interface SnapshotCredentialsFromGeneratedPasswordOptions {
  /**
   * KMS encryption key to encrypt the generated secret.
   *
   * Default: - default master key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The characters to exclude from the generated password.
   *
   * Default: - the DatabaseSecret default exclude character set (" %+~`#$&*()|[]{}:;<>?!'/@\"\\")
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * A list of regions where to replicate this secret.
   *
   * Default: - Secret is not replicated
   */
  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  /**
   * A builder for [SnapshotCredentialsFromGeneratedPasswordOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey KMS encryption key to encrypt the generated secret.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param excludeCharacters The characters to exclude from the generated password.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.Builder
        =
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.builder()

    /**
     * @param encryptionKey KMS encryption key to encrypt the generated secret.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param excludeCharacters The characters to exclude from the generated password.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion.Companion::unwrap))
    }

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    public fun build():
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions,
  ) : CdkObject(cdkObject), SnapshotCredentialsFromGeneratedPasswordOptions {
    /**
     * KMS encryption key to encrypt the generated secret.
     *
     * Default: - default master key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The characters to exclude from the generated password.
     *
     * Default: - the DatabaseSecret default exclude character set (" %+~`#$&*()|[]{}:;<>?!'/@\"\\")
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     */
    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        SnapshotCredentialsFromGeneratedPasswordOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions):
        SnapshotCredentialsFromGeneratedPasswordOptions = CdkObjectWrappers.wrap(cdkObject) as?
        SnapshotCredentialsFromGeneratedPasswordOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapshotCredentialsFromGeneratedPasswordOptions):
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions
  }
}
