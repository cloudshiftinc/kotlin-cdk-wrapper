@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.Secret
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A database secret.
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
public open class DatabaseSecret(
  cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecret,
) : Secret(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseSecretProps,
  ) :
      this(software.amazon.awscdk.services.docdb.DatabaseSecret(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DatabaseSecretProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DatabaseSecretProps.Builder.() -> Unit,
  ) : this(scope, id, DatabaseSecretProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.DatabaseSecret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     *
     * @param encryptionKey The KMS key to use to encrypt the secret. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Characters to not include in the generated password.
     *
     * Default: "\"@/"
     *
     * @param excludeCharacters Characters to not include in the generated password. 
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * The master secret which will be used to rotate this secret.
     *
     * Default: - no master secret information will be included
     *
     * @param masterSecret The master secret which will be used to rotate this secret. 
     */
    public fun masterSecret(masterSecret: ISecret)

    /**
     * The physical name of the secret.
     *
     * Default: Secretsmanager will generate a physical name for the secret
     *
     * @param secretName The physical name of the secret. 
     */
    public fun secretName(secretName: String)

    /**
     * The username.
     *
     * @param username The username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseSecret.Builder =
        software.amazon.awscdk.services.docdb.DatabaseSecret.Builder.create(scope, id)

    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     *
     * @param encryptionKey The KMS key to use to encrypt the secret. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * Characters to not include in the generated password.
     *
     * Default: "\"@/"
     *
     * @param excludeCharacters Characters to not include in the generated password. 
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * The master secret which will be used to rotate this secret.
     *
     * Default: - no master secret information will be included
     *
     * @param masterSecret The master secret which will be used to rotate this secret. 
     */
    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret.Companion::unwrap))
    }

    /**
     * The physical name of the secret.
     *
     * Default: Secretsmanager will generate a physical name for the secret
     *
     * @param secretName The physical name of the secret. 
     */
    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    /**
     * The username.
     *
     * @param username The username. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseSecret = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecret):
        DatabaseSecret = DatabaseSecret(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecret):
        software.amazon.awscdk.services.docdb.DatabaseSecret = wrapped.cdkObject as
        software.amazon.awscdk.services.docdb.DatabaseSecret
  }
}
