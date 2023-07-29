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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

/**
 * An AppSync datasource backed by RDS.
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
public class RdsDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: RdsDataSource.Builder = RdsDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to.
     */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /**
     * The name of the database to use within the cluster.
     *
     * Default: - None
     *
     * @param databaseName The name of the database to use within the cluster.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The secret containing the credentials for the database.
     *
     * @param secretStore The secret containing the credentials for the database.
     */
    public fun secretStore(secretStore: ISecret) {
        cdkBuilder.secretStore(secretStore)
    }

    /**
     * The serverless cluster to call to interact with this data source.
     *
     * @param serverlessCluster The serverless cluster to call to interact with this data source.
     */
    public fun serverlessCluster(serverlessCluster: IServerlessCluster) {
        cdkBuilder.serverlessCluster(serverlessCluster)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: - Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): RdsDataSource = cdkBuilder.build()
}
