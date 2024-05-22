@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * props used by implementations of BaseDataSource to provide configuration.
 *
 * Should not be used directly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
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
public interface ExtendedDataSourceProps {
  /**
   * configuration for DynamoDB Datasource.
   *
   * Default: - No config
   */
  public fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  /**
   * (deprecated) configuration for Elasticsearch data source.
   *
   * Default: - No config
   *
   * * use `openSearchConfig`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  /**
   * configuration for EventBridge Datasource.
   *
   * Default: - No config
   */
  public fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  /**
   * configuration for HTTP Datasource.
   *
   * Default: - No config
   */
  public fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  /**
   * configuration for Lambda Datasource.
   *
   * Default: - No config
   */
  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * configuration for OpenSearch data source.
   *
   * Default: - No config
   */
  public fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  /**
   * configuration for RDS Datasource.
   *
   * Default: - No config
   */
  public fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  /**
   * the type of the AppSync datasource.
   */
  public fun type(): String

  /**
   * A builder for [ExtendedDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty)

    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293eb694721edc32e8a1153bd9eb5a95779f3df44babd7194e4b53549ae41988")
    public
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit)

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable)

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty)

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c59a8513aef1e90584e348184ea4f58a4b84f6e9bbc783266e55b31c6e3cfe")
    public
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit)

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty)

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f993365b52d05651f40f620b809f272f7b114333d46013cf291a84d64cd09e3")
    public
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit)

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    public fun httpConfig(httpConfig: IResolvable)

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty)

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3883f8f6f7be1bf1a0a5f033019b520998880155cd6ea6300e83320f945c5f39")
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit)

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty)

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f43b4431cc09115a22dc67f7855956ce623db31a64dc5756d9068ce81290eda3")
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit)

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty)

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001c3a2dc911a8b4cdf6595770910c4e55a75dc7334bee51cc980e2914ce725")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit)

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty)

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0edfddb893c596cbc446b1f3ee1a861988c7e9bacfdf8c26589d8af637d043e6")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit)

    /**
     * @param type the type of the AppSync datasource. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps.Builder
        = software.amazon.awscdk.services.appsync.ExtendedDataSourceProps.builder()

    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    override fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(CfnDataSource.DynamoDBConfigProperty.Companion::unwrap))
    }

    /**
     * @param dynamoDbConfig configuration for DynamoDB Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293eb694721edc32e8a1153bd9eb5a95779f3df44babd7194e4b53549ae41988")
    override
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(CfnDataSource.DynamoDBConfigProperty(dynamoDbConfig))

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(CfnDataSource.ElasticsearchConfigProperty.Companion::unwrap))
    }

    /**
     * @param elasticsearchConfig configuration for Elasticsearch data source.
     * @deprecated - use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c59a8513aef1e90584e348184ea4f58a4b84f6e9bbc783266e55b31c6e3cfe")
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit):
        Unit = elasticsearchConfig(CfnDataSource.ElasticsearchConfigProperty(elasticsearchConfig))

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    override fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(CfnDataSource.EventBridgeConfigProperty.Companion::unwrap))
    }

    /**
     * @param eventBridgeConfig configuration for EventBridge Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f993365b52d05651f40f620b809f272f7b114333d46013cf291a84d64cd09e3")
    override
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit):
        Unit = eventBridgeConfig(CfnDataSource.EventBridgeConfigProperty(eventBridgeConfig))

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(CfnDataSource.HttpConfigProperty.Companion::unwrap))
    }

    /**
     * @param httpConfig configuration for HTTP Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3883f8f6f7be1bf1a0a5f033019b520998880155cd6ea6300e83320f945c5f39")
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(CfnDataSource.HttpConfigProperty(httpConfig))

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnDataSource.LambdaConfigProperty.Companion::unwrap))
    }

    /**
     * @param lambdaConfig configuration for Lambda Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f43b4431cc09115a22dc67f7855956ce623db31a64dc5756d9068ce81290eda3")
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnDataSource.LambdaConfigProperty(lambdaConfig))

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(CfnDataSource.OpenSearchServiceConfigProperty.Companion::unwrap))
    }

    /**
     * @param openSearchServiceConfig configuration for OpenSearch data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001c3a2dc911a8b4cdf6595770910c4e55a75dc7334bee51cc980e2914ce725")
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit =
        openSearchServiceConfig(CfnDataSource.OpenSearchServiceConfigProperty(openSearchServiceConfig))

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(CfnDataSource.RelationalDatabaseConfigProperty.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseConfig configuration for RDS Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0edfddb893c596cbc446b1f3ee1a861988c7e9bacfdf8c26589d8af637d043e6")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit =
        relationalDatabaseConfig(CfnDataSource.RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    /**
     * @param type the type of the AppSync datasource. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.ExtendedDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps,
  ) : CdkObject(cdkObject), ExtendedDataSourceProps {
    /**
     * configuration for DynamoDB Datasource.
     *
     * Default: - No config
     */
    override fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

    /**
     * (deprecated) configuration for Elasticsearch data source.
     *
     * Default: - No config
     *
     * * use `openSearchConfig`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

    /**
     * configuration for EventBridge Datasource.
     *
     * Default: - No config
     */
    override fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

    /**
     * configuration for HTTP Datasource.
     *
     * Default: - No config
     */
    override fun httpConfig(): Any? = unwrap(this).getHttpConfig()

    /**
     * configuration for Lambda Datasource.
     *
     * Default: - No config
     */
    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    /**
     * configuration for OpenSearch data source.
     *
     * Default: - No config
     */
    override fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

    /**
     * configuration for RDS Datasource.
     *
     * Default: - No config
     */
    override fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

    /**
     * the type of the AppSync datasource.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps):
        ExtendedDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? ExtendedDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtendedDataSourceProps):
        software.amazon.awscdk.services.appsync.ExtendedDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ExtendedDataSourceProps
  }
}
