@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.ExtendedDataSourceProps

@CdkDslMarker
public class ExtendedDataSourcePropsDsl {
  private val cdkBuilder: ExtendedDataSourceProps.Builder = ExtendedDataSourceProps.builder()

  /**
   * @param dynamoDbConfig configuration for DynamoDB Datasource.
   */
  public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
    cdkBuilder.dynamoDbConfig(dynamoDbConfig)
  }

  /**
   * @param dynamoDbConfig configuration for DynamoDB Datasource.
   */
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

  /**
   * @param eventBridgeConfig configuration for EventBridge Datasource.
   */
  public fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
    cdkBuilder.eventBridgeConfig(eventBridgeConfig)
  }

  /**
   * @param eventBridgeConfig configuration for EventBridge Datasource.
   */
  public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
    cdkBuilder.eventBridgeConfig(eventBridgeConfig)
  }

  /**
   * @param httpConfig configuration for HTTP Datasource.
   */
  public fun httpConfig(httpConfig: IResolvable) {
    cdkBuilder.httpConfig(httpConfig)
  }

  /**
   * @param httpConfig configuration for HTTP Datasource.
   */
  public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
    cdkBuilder.httpConfig(httpConfig)
  }

  /**
   * @param lambdaConfig configuration for Lambda Datasource.
   */
  public fun lambdaConfig(lambdaConfig: IResolvable) {
    cdkBuilder.lambdaConfig(lambdaConfig)
  }

  /**
   * @param lambdaConfig configuration for Lambda Datasource.
   */
  public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
    cdkBuilder.lambdaConfig(lambdaConfig)
  }

  /**
   * @param openSearchServiceConfig configuration for OpenSearch data source.
   */
  public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
    cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
  }

  /**
   * @param openSearchServiceConfig configuration for OpenSearch data source.
   */
  public
      fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
    cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
  }

  /**
   * @param relationalDatabaseConfig configuration for RDS Datasource.
   */
  public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
    cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
  }

  /**
   * @param relationalDatabaseConfig configuration for RDS Datasource.
   */
  public
      fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
    cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
  }

  /**
   * @param type the type of the AppSync datasource. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): ExtendedDataSourceProps = cdkBuilder.build()
}
