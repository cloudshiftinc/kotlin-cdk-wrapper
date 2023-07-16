@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnDataSourceProps

@CdkDslMarker
public class CfnDataSourcePropsDsl {
  private val cdkBuilder: CfnDataSourceProps.Builder = CfnDataSourceProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
    cdkBuilder.dynamoDbConfig(dynamoDbConfig)
  }

  public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
    cdkBuilder.dynamoDbConfig(dynamoDbConfig)
  }

  public fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
    cdkBuilder.elasticsearchConfig(elasticsearchConfig)
  }

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

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
    cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
  }

  public
      fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
    cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
  }

  public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
    cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
  }

  public
      fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
    cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
  }

  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSourceProps = cdkBuilder.build()
}
