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
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.ExtendedDataSourceProps

/**
 * props used by implementations of BaseDataSource to provide configuration.
 *
 * Should not be used directly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * ExtendedDataSourceProps extendedDataSourceProps = ExtendedDataSourceProps.builder()
 * .type("type")
 * // the properties below are optional
 * .dynamoDbConfig(DynamoDBConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .tableName("tableName")
 * // the properties below are optional
 * .deltaSyncConfig(DeltaSyncConfigProperty.builder()
 * .baseTableTtl("baseTableTtl")
 * .deltaSyncTableName("deltaSyncTableName")
 * .deltaSyncTableTtl("deltaSyncTableTtl")
 * .build())
 * .useCallerCredentials(false)
 * .versioned(false)
 * .build())
 * .elasticsearchConfig(ElasticsearchConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build())
 * .eventBridgeConfig(EventBridgeConfigProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build())
 * .httpConfig(HttpConfigProperty.builder()
 * .endpoint("endpoint")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .awsIamConfig(AwsIamConfigProperty.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .build())
 * .build())
 * .lambdaConfig(LambdaConfigProperty.builder()
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build())
 * .openSearchServiceConfig(OpenSearchServiceConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build())
 * .relationalDatabaseConfig(RelationalDatabaseConfigProperty.builder()
 * .relationalDatabaseSourceType("relationalDatabaseSourceType")
 * // the properties below are optional
 * .rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .awsSecretStoreArn("awsSecretStoreArn")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * // the properties below are optional
 * .databaseName("databaseName")
 * .schema("schema")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ExtendedDataSourcePropsDsl {
    private val cdkBuilder: ExtendedDataSourceProps.Builder = ExtendedDataSourceProps.builder()

    /** @param dynamoDbConfig configuration for DynamoDB Datasource. */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    /** @param dynamoDbConfig configuration for DynamoDB Datasource. */
    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    /** @param eventBridgeConfig configuration for EventBridge Datasource. */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    /** @param eventBridgeConfig configuration for EventBridge Datasource. */
    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    /** @param httpConfig configuration for HTTP Datasource. */
    public fun httpConfig(httpConfig: IResolvable) {
        cdkBuilder.httpConfig(httpConfig)
    }

    /** @param httpConfig configuration for HTTP Datasource. */
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
        cdkBuilder.httpConfig(httpConfig)
    }

    /** @param lambdaConfig configuration for Lambda Datasource. */
    public fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    /** @param lambdaConfig configuration for Lambda Datasource. */
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    /** @param openSearchServiceConfig configuration for OpenSearch data source. */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    /** @param openSearchServiceConfig configuration for OpenSearch data source. */
    public fun openSearchServiceConfig(
        openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty
    ) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    /** @param relationalDatabaseConfig configuration for RDS Datasource. */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    /** @param relationalDatabaseConfig configuration for RDS Datasource. */
    public fun relationalDatabaseConfig(
        relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty
    ) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    /** @param type the type of the AppSync datasource. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): ExtendedDataSourceProps = cdkBuilder.build()
}
