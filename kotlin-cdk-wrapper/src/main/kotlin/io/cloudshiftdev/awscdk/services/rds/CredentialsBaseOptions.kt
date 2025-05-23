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
 * Base options for creating Credentials.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * IInstanceEngine engine =
 * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_16_3).build());
 * Key myKey = new Key(this, "MyKey");
 * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
 * .engine(engine)
 * .vpc(vpc)
 * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
 * .secretName("my-cool-name")
 * .encryptionKey(myKey)
 * .excludeCharacters("!&amp;*^#&#64;()")
 * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
 * ReplicaRegion.builder().region("eu-west-2").build()))
 * .build()))
 * .build();
 * ```
 */
public interface CredentialsBaseOptions {
  /**
   * KMS encryption key to encrypt the generated secret.
   *
   * Default: - default master key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The characters to exclude from the generated password.
   *
   * Has no effect if `password` has been provided.
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
   * The name of the secret.
   *
   * Default: - A name is generated by CloudFormation.
   */
  public fun secretName(): String? = unwrap(this).getSecretName()

  /**
   * A builder for [CredentialsBaseOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey KMS encryption key to encrypt the generated secret.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param excludeCharacters The characters to exclude from the generated password.
     * Has no effect if `password` has been provided.
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

    /**
     * @param secretName The name of the secret.
     */
    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CredentialsBaseOptions.Builder =
        software.amazon.awscdk.services.rds.CredentialsBaseOptions.builder()

    /**
     * @param encryptionKey KMS encryption key to encrypt the generated secret.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param excludeCharacters The characters to exclude from the generated password.
     * Has no effect if `password` has been provided.
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

    /**
     * @param secretName The name of the secret.
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CredentialsBaseOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CredentialsBaseOptions,
  ) : CdkObject(cdkObject),
      CredentialsBaseOptions {
    /**
     * KMS encryption key to encrypt the generated secret.
     *
     * Default: - default master key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The characters to exclude from the generated password.
     *
     * Has no effect if `password` has been provided.
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

    /**
     * The name of the secret.
     *
     * Default: - A name is generated by CloudFormation.
     */
    override fun secretName(): String? = unwrap(this).getSecretName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialsBaseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CredentialsBaseOptions):
        CredentialsBaseOptions = CdkObjectWrappers.wrap(cdkObject) as? CredentialsBaseOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CredentialsBaseOptions):
        software.amazon.awscdk.services.rds.CredentialsBaseOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CredentialsBaseOptions
  }
}
