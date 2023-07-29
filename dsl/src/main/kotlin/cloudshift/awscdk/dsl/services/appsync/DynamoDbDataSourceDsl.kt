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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * An AppSync datasource backed by a DynamoDB table.
 *
 * Example:
 * ```
 * GraphqlApi api = GraphqlApi.Builder.create(this, "Api")
 * .name("demo")
 * .schema(SchemaFile.fromAsset(join(__dirname, "schema.graphql")))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder()
 * .authorizationType(AuthorizationType.IAM)
 * .build())
 * .build())
 * .xrayEnabled(true)
 * .build();
 * Table demoTable = Table.Builder.create(this, "DemoTable")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .build();
 * DynamoDbDataSource demoDS = api.addDynamoDbDataSource("demoDataSource", demoTable);
 * // Resolver for the Query "getDemos" that scans the DynamoDb table and returns the entire list.
 * // Resolver Mapping Template Reference:
 * //
 * https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference-dynamodb.html
 * demoDS.createResolver("QueryGetDemosResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemos")
 * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable())
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
 * .build());
 * // Resolver for the Mutation "addDemo" that puts the item into the DynamoDb table.
 * demoDS.createResolver("MutationAddDemoResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemo")
 * .requestMappingTemplate(MappingTemplate.dynamoDbPutItem(PrimaryKey.partition("id").auto(),
 * Values.projecting("input")))
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultItem())
 * .build());
 * //To enable DynamoDB read consistency with the `MappingTemplate`:
 * demoDS.createResolver("QueryGetDemosConsistentResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosConsistent")
 * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable(true))
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
 * .build());
 * ```
 */
@CdkDslMarker
public class DynamoDbDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DynamoDbDataSource.Builder =
        DynamoDbDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to.
     */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
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
     * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
     *
     * Default: false
     *
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     *   to the DynamoDB table.
     */
    public fun readOnlyAccess(readOnlyAccess: Boolean) {
        cdkBuilder.readOnlyAccess(readOnlyAccess)
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

    /**
     * The DynamoDB table backing this data source.
     *
     * @param table The DynamoDB table backing this data source.
     */
    public fun table(table: ITable) {
        cdkBuilder.table(table)
    }

    /**
     * use credentials of caller to access DynamoDB.
     *
     * Default: false
     *
     * @param useCallerCredentials use credentials of caller to access DynamoDB.
     */
    public fun useCallerCredentials(useCallerCredentials: Boolean) {
        cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): DynamoDbDataSource = cdkBuilder.build()
}
