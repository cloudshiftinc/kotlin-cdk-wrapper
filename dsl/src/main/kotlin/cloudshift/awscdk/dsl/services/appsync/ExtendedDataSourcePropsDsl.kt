@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.ExtendedDataSourceProps
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class ExtendedDataSourcePropsDsl {
    private val cdkBuilder: ExtendedDataSourceProps.Builder = ExtendedDataSourceProps.builder()

    public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    public fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    public fun httpConfig(httpConfig: IResolvable) {
        cdkBuilder.httpConfig(httpConfig)
    }

    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
        cdkBuilder.httpConfig(httpConfig)
    }

    public fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    public fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    public fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): ExtendedDataSourceProps = cdkBuilder.build()
}
