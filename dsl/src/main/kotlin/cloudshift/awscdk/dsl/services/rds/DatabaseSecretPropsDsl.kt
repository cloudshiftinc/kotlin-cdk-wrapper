@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.secretsmanager.ReplicaRegionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

/**
 * Construction properties for a DatabaseSecret.
 *
 * Example:
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
@CdkDslMarker
public class DatabaseSecretPropsDsl {
    private val cdkBuilder: DatabaseSecretProps.Builder = DatabaseSecretProps.builder()

    private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

    /** @param dbname The database name, if not using the default one. */
    public fun dbname(dbname: String) {
        cdkBuilder.dbname(dbname)
    }

    /** @param encryptionKey The KMS key to use to encrypt the secret. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param excludeCharacters Characters to not include in the generated password. */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /** @param masterSecret The master secret which will be used to rotate this secret. */
    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    /**
     * @param replaceOnPasswordCriteriaChanges Whether to replace this secret when the criteria for
     *   the password change. This is achieved by overriding the logical id of the
     *   AWS::SecretsManager::Secret with a hash of the options that influence the password
     *   generation. This way a new secret will be created when the password is regenerated and the
     *   cluster or instance consuming this secret will have its credentials updated.
     */
    public fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean) {
        cdkBuilder.replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges)
    }

    /** @param replicaRegions A list of regions where to replicate this secret. */
    public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
        _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
    }

    /** @param replicaRegions A list of regions where to replicate this secret. */
    public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
        _replicaRegions.addAll(replicaRegions)
    }

    /** @param secretName A name for the secret. */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    /** @param username The username. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): DatabaseSecretProps {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        return cdkBuilder.build()
    }
}
