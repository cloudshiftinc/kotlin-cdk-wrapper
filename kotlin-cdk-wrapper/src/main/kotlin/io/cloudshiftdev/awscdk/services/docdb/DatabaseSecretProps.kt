@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a DatabaseSecret.
 *
 * Example:
 *
 * ```
 * DatabaseCluster cluster;
 * DatabaseSecret myUserSecret = DatabaseSecret.Builder.create(this, "MyUserSecret")
 * .username("myuser")
 * .masterSecret(cluster.getSecret())
 * .build();
 * ISecret myUserSecretAttached = myUserSecret.attach(cluster); // Adds DB connections information
 * in the secret
 * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder() // Add rotation using
 * the multi user scheme
 * .secret(myUserSecretAttached).build());
 * ```
 */
public interface DatabaseSecretProps {
  /**
   * The KMS key to use to encrypt the secret.
   *
   * Default: default master key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Characters to not include in the generated password.
   *
   * Default: "\"@/"
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * The master secret which will be used to rotate this secret.
   *
   * Default: - no master secret information will be included
   */
  public fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

  /**
   * The physical name of the secret.
   *
   * Default: Secretsmanager will generate a physical name for the secret
   */
  public fun secretName(): String? = unwrap(this).getSecretName()

  /**
   * The username.
   */
  public fun username(): String

  /**
   * A builder for [DatabaseSecretProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey The KMS key to use to encrypt the secret.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param excludeCharacters Characters to not include in the generated password.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param masterSecret The master secret which will be used to rotate this secret.
     */
    public fun masterSecret(masterSecret: ISecret)

    /**
     * @param secretName The physical name of the secret.
     */
    public fun secretName(secretName: String)

    /**
     * @param username The username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseSecretProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseSecretProps.builder()

    /**
     * @param encryptionKey The KMS key to use to encrypt the secret.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param excludeCharacters Characters to not include in the generated password.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param masterSecret The master secret which will be used to rotate this secret.
     */
    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param secretName The physical name of the secret.
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    /**
     * @param username The username. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecretProps,
  ) : CdkObject(cdkObject), DatabaseSecretProps {
    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Characters to not include in the generated password.
     *
     * Default: "\"@/"
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * The master secret which will be used to rotate this secret.
     *
     * Default: - no master secret information will be included
     */
    override fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

    /**
     * The physical name of the secret.
     *
     * Default: Secretsmanager will generate a physical name for the secret
     */
    override fun secretName(): String? = unwrap(this).getSecretName()

    /**
     * The username.
     */
    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecretProps):
        DatabaseSecretProps = CdkObjectWrappers.wrap(cdkObject) as? DatabaseSecretProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecretProps):
        software.amazon.awscdk.services.docdb.DatabaseSecretProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.DatabaseSecretProps
  }
}
