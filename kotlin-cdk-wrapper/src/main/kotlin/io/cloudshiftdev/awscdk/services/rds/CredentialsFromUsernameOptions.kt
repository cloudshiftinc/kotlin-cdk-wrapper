@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for creating Credentials from a username.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_2).build()))
 * .credentials(Credentials.fromUsername("adminuser",
 * CredentialsFromUsernameOptions.builder().password(SecretValue.unsafePlainText("7959866cacc02c2d243ecfe177464fe6")).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .publiclyAccessible(false)
 * .build()))
 * .readers(List.of(ClusterInstance.provisioned("reader")))
 * .storageType(DBClusterStorageType.AURORA_IOPT1)
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build())
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface CredentialsFromUsernameOptions : CredentialsBaseOptions {
  /**
   * Password.
   *
   * Do not put passwords in your CDK code directly.
   *
   * Default: - a Secrets Manager generated password
   */
  public fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  /**
   * A builder for [CredentialsFromUsernameOptions]
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
     * @param password Password.
     * Do not put passwords in your CDK code directly.
     */
    public fun password(password: SecretValue)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions.Builder =
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions.builder()

    /**
     * @param encryptionKey KMS encryption key to encrypt the generated secret.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param excludeCharacters The characters to exclude from the generated password.
     * Has no effect if `password` has been provided.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param password Password.
     * Do not put passwords in your CDK code directly.
     */
    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions,
  ) : CdkObject(cdkObject), CredentialsFromUsernameOptions {
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
     * Password.
     *
     * Do not put passwords in your CDK code directly.
     *
     * Default: - a Secrets Manager generated password
     */
    override fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialsFromUsernameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions):
        CredentialsFromUsernameOptions = CdkObjectWrappers.wrap(cdkObject) as
        CredentialsFromUsernameOptions

    internal fun unwrap(wrapped: CredentialsFromUsernameOptions):
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions
  }
}
