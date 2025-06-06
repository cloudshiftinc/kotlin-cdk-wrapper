@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a DatabaseSecret.
 *
 * Example:
 *
 * ```
 * // Build a data source for AppSync to access the database.
 * GraphqlApi api;
 * // Create username and password secret for DB Cluster
 * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
 * .username("clusteradmin")
 * .build();
 * // The VPC to place the cluster in
 * Vpc vpc = new Vpc(this, "AuroraVpc");
 * // Create the serverless cluster, provide all values needed to customise the database.
 * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
 * .engine(DatabaseClusterEngine.AURORA_MYSQL)
 * .vpc(vpc)
 * .credentials(Map.of("username", "clusteradmin"))
 * .clusterIdentifier("db-endpoint-test")
 * .defaultDatabaseName("demos")
 * .build();
 * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
 * // Set up a resolver for an RDS query.
 * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n     
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
public interface DatabaseSecretProps {
  /**
   * The database name, if not using the default one.
   *
   * Default: - whatever the secret generates after the attach method is run
   */
  public fun dbname(): String? = unwrap(this).getDbname()

  /**
   * The KMS key to use to encrypt the secret.
   *
   * Default: default master key
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Characters to not include in the generated password.
   *
   * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * The master secret which will be used to rotate this secret.
   *
   * Default: - no master secret information will be included
   */
  public fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

  /**
   * Whether to replace this secret when the criteria for the password change.
   *
   * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
   * with a hash of the options that influence the password generation. This
   * way a new secret will be created when the password is regenerated and the
   * cluster or instance consuming this secret will have its credentials updated.
   *
   * Default: false
   */
  public fun replaceOnPasswordCriteriaChanges(): Boolean? =
      unwrap(this).getReplaceOnPasswordCriteriaChanges()

  /**
   * A list of regions where to replicate this secret.
   *
   * Default: - Secret is not replicated
   */
  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  /**
   * A name for the secret.
   *
   * Default: - A name is generated by CloudFormation.
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
     * @param dbname The database name, if not using the default one.
     */
    public fun dbname(dbname: String)

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
     * @param replaceOnPasswordCriteriaChanges Whether to replace this secret when the criteria for
     * the password change.
     * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
     * with a hash of the options that influence the password generation. This
     * way a new secret will be created when the password is regenerated and the
     * cluster or instance consuming this secret will have its credentials updated.
     */
    public fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    /**
     * @param replicaRegions A list of regions where to replicate this secret.
     */
    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    /**
     * @param secretName A name for the secret.
     */
    public fun secretName(secretName: String)

    /**
     * @param username The username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseSecretProps.Builder =
        software.amazon.awscdk.services.rds.DatabaseSecretProps.builder()

    /**
     * @param dbname The database name, if not using the default one.
     */
    override fun dbname(dbname: String) {
      cdkBuilder.dbname(dbname)
    }

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
     * @param replaceOnPasswordCriteriaChanges Whether to replace this secret when the criteria for
     * the password change.
     * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
     * with a hash of the options that influence the password generation. This
     * way a new secret will be created when the password is regenerated and the
     * cluster or instance consuming this secret will have its credentials updated.
     */
    override fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean) {
      cdkBuilder.replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges)
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
     * @param secretName A name for the secret.
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

    public fun build(): software.amazon.awscdk.services.rds.DatabaseSecretProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseSecretProps,
  ) : CdkObject(cdkObject),
      DatabaseSecretProps {
    /**
     * The database name, if not using the default one.
     *
     * Default: - whatever the secret generates after the attach method is run
     */
    override fun dbname(): String? = unwrap(this).getDbname()

    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Characters to not include in the generated password.
     *
     * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * The master secret which will be used to rotate this secret.
     *
     * Default: - no master secret information will be included
     */
    override fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

    /**
     * Whether to replace this secret when the criteria for the password change.
     *
     * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
     * with a hash of the options that influence the password generation. This
     * way a new secret will be created when the password is regenerated and the
     * cluster or instance consuming this secret will have its credentials updated.
     *
     * Default: false
     */
    override fun replaceOnPasswordCriteriaChanges(): Boolean? =
        unwrap(this).getReplaceOnPasswordCriteriaChanges()

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     */
    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

    /**
     * A name for the secret.
     *
     * Default: - A name is generated by CloudFormation.
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseSecretProps):
        DatabaseSecretProps = CdkObjectWrappers.wrap(cdkObject) as? DatabaseSecretProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecretProps):
        software.amazon.awscdk.services.rds.DatabaseSecretProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseSecretProps
  }
}
