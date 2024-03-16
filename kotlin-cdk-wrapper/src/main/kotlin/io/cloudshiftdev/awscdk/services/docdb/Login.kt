@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Login credentials for a database cluster.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .removalPolicy(RemovalPolicy.SNAPSHOT)
 * .build();
 * ```
 */
public interface Login {
  /**
   * Specifies characters to not include in generated passwords.
   *
   * Default: "\"@/"
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * KMS encryption key to encrypt the generated secret.
   *
   * Default: default master key
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * Password.
   *
   * Do not put passwords in your CDK code directly.
   *
   * Default: a Secrets Manager generated password
   */
  public fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  /**
   * The physical name of the secret, that will be generated.
   *
   * Default: Secretsmanager will generate a physical name for the secret
   */
  public fun secretName(): String? = unwrap(this).getSecretName()

  /**
   * Username.
   */
  public fun username(): String

  /**
   * A builder for [Login]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeCharacters Specifies characters to not include in generated passwords.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param kmsKey KMS encryption key to encrypt the generated secret.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param password Password.
     * Do not put passwords in your CDK code directly.
     */
    public fun password(password: SecretValue)

    /**
     * @param secretName The physical name of the secret, that will be generated.
     */
    public fun secretName(secretName: String)

    /**
     * @param username Username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.Login.Builder =
        software.amazon.awscdk.services.docdb.Login.builder()

    /**
     * @param excludeCharacters Specifies characters to not include in generated passwords.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param kmsKey KMS encryption key to encrypt the generated secret.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param password Password.
     * Do not put passwords in your CDK code directly.
     */
    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    /**
     * @param secretName The physical name of the secret, that will be generated.
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    /**
     * @param username Username. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.docdb.Login = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.Login,
  ) : CdkObject(cdkObject), Login {
    /**
     * Specifies characters to not include in generated passwords.
     *
     * Default: "\"@/"
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * KMS encryption key to encrypt the generated secret.
     *
     * Default: default master key
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * Password.
     *
     * Do not put passwords in your CDK code directly.
     *
     * Default: a Secrets Manager generated password
     */
    override fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

    /**
     * The physical name of the secret, that will be generated.
     *
     * Default: Secretsmanager will generate a physical name for the secret
     */
    override fun secretName(): String? = unwrap(this).getSecretName()

    /**
     * Username.
     */
    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Login {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Login): Login =
        CdkObjectWrappers.wrap(cdkObject) as Login

    internal fun unwrap(wrapped: Login): software.amazon.awscdk.services.docdb.Login = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.Login
  }
}
