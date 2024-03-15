@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import io.cloudshiftdev.awscdk.services.secretsmanager.Secret
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A database secret.
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
public open class DatabaseSecret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseSecret,
) : Secret(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.DatabaseSecret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The database name, if not using the default one.
     *
     * Default: - whatever the secret generates after the attach method is run
     *
     * @param dbname The database name, if not using the default one. 
     */
    public fun dbname(dbname: String)

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
     * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
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
     * Whether to replace this secret when the criteria for the password change.
     *
     * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
     * with a hash of the options that influence the password generation. This
     * way a new secret will be created when the password is regenerated and the
     * cluster or instance consuming this secret will have its credentials updated.
     *
     * Default: false
     *
     * @param replaceOnPasswordCriteriaChanges Whether to replace this secret when the criteria for
     * the password change. 
     */
    public fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean)

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    /**
     * A name for the secret.
     *
     * Default: - A name is generated by CloudFormation.
     *
     * @param secretName A name for the secret. 
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
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseSecret.Builder =
        software.amazon.awscdk.services.rds.DatabaseSecret.Builder.create(scope, id)

    /**
     * The database name, if not using the default one.
     *
     * Default: - whatever the secret generates after the attach method is run
     *
     * @param dbname The database name, if not using the default one. 
     */
    override fun dbname(dbname: String) {
      cdkBuilder.dbname(dbname)
    }

    /**
     * The KMS key to use to encrypt the secret.
     *
     * Default: default master key
     *
     * @param encryptionKey The KMS key to use to encrypt the secret. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Characters to not include in the generated password.
     *
     * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
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
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    /**
     * Whether to replace this secret when the criteria for the password change.
     *
     * This is achieved by overriding the logical id of the AWS::SecretsManager::Secret
     * with a hash of the options that influence the password generation. This
     * way a new secret will be created when the password is regenerated and the
     * cluster or instance consuming this secret will have its credentials updated.
     *
     * Default: false
     *
     * @param replaceOnPasswordCriteriaChanges Whether to replace this secret when the criteria for
     * the password change. 
     */
    override fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean) {
      cdkBuilder.replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges)
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    /**
     * A list of regions where to replicate this secret.
     *
     * Default: - Secret is not replicated
     *
     * @param replicaRegions A list of regions where to replicate this secret. 
     */
    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    /**
     * A name for the secret.
     *
     * Default: - A name is generated by CloudFormation.
     *
     * @param secretName A name for the secret. 
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

    public fun build(): software.amazon.awscdk.services.rds.DatabaseSecret = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseSecret): DatabaseSecret
        = DatabaseSecret(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecret): software.amazon.awscdk.services.rds.DatabaseSecret
        = wrapped.cdkObject
  }
}
