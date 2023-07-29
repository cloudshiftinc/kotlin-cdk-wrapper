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
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ApiKeyConfig
import software.amazon.awscdk.services.appsync.AuthorizationMode
import software.amazon.awscdk.services.appsync.AuthorizationType
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig
import software.amazon.awscdk.services.appsync.UserPoolConfig

/**
 * Interface to specify default or additional authorization(s).
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
public class AuthorizationModeDsl {
    private val cdkBuilder: AuthorizationMode.Builder = AuthorizationMode.builder()

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     *   configured.
     */
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfigDsl.() -> Unit = {}) {
        val builder = ApiKeyConfigDsl()
        builder.apply(apiKeyConfig)
        cdkBuilder.apiKeyConfig(builder.build())
    }

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     *   configured.
     */
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig) {
        cdkBuilder.apiKeyConfig(apiKeyConfig)
    }

    /** @param authorizationType One of possible four values AppSync supports. */
    public fun authorizationType(authorizationType: AuthorizationType) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     *   is required.
     */
    public fun lambdaAuthorizerConfig(
        lambdaAuthorizerConfig: LambdaAuthorizerConfigDsl.() -> Unit = {}
    ) {
        val builder = LambdaAuthorizerConfigDsl()
        builder.apply(lambdaAuthorizerConfig)
        cdkBuilder.lambdaAuthorizerConfig(builder.build())
    }

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     *   is required.
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     *   required.
     */
    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfigDsl.() -> Unit = {}) {
        val builder = OpenIdConnectConfigDsl()
        builder.apply(openIdConnectConfig)
        cdkBuilder.openIdConnectConfig(builder.build())
    }

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     *   required.
     */
    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     *   required.
     */
    public fun userPoolConfig(userPoolConfig: UserPoolConfigDsl.() -> Unit = {}) {
        val builder = UserPoolConfigDsl()
        builder.apply(userPoolConfig)
        cdkBuilder.userPoolConfig(builder.build())
    }

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     *   required.
     */
    public fun userPoolConfig(userPoolConfig: UserPoolConfig) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun build(): AuthorizationMode = cdkBuilder.build()
}
