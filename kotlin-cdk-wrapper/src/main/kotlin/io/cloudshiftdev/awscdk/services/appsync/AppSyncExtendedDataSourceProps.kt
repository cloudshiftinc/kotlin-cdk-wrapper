@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Props used by implementations of BaseDataSource to provide configuration.
 *
 * Should not be used directly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * AppSyncExtendedDataSourceProps appSyncExtendedDataSourceProps =
 * AppSyncExtendedDataSourceProps.builder()
 * .type(AppSyncDataSourceType.LAMBDA)
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
public interface AppSyncExtendedDataSourceProps {
  /**
   * Configuration for DynamoDB Datasource.
   *
   * Default: - No config
   */
  public fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  /**
   * Configuration for EventBridge Datasource.
   *
   * Default: - No config
   */
  public fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  /**
   * Configuration for HTTP Datasource.
   *
   * Default: - No config
   */
  public fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  /**
   * Configuration for Lambda Datasource.
   *
   * Default: - No config
   */
  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * Configuration for OpenSearch data source.
   *
   * Default: - No config
   */
  public fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  /**
   * Configuration for RDS Datasource.
   *
   * Default: - No config
   */
  public fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  /**
   * The type of the AppSync datasource.
   */
  public fun type(): AppSyncDataSourceType

  /**
   * A builder for [AppSyncExtendedDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty)

    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f6b4cad0bd12709b4d3c5bf5be13ff9d840f97f54f009340fcd0da566b664e")
    public
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit)

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty)

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01ba1df0b205e05ed4f2197ceaea8503a07b3ec5331c40ac4b3578f86d6cbf87")
    public
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit)

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    public fun httpConfig(httpConfig: IResolvable)

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty)

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f9f24da6961d0900c40a047c2048802cd8573fd4a37d0a123ee361688050060")
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit)

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty)

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee02c26a42b41896c371b8afdc9a8cb10685bb410d56556c77d8c7cc0515623a")
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit)

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty)

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("320e1b99e026398fa920a132b1a96fefaaa44529173480d45630a42e53fd0c31")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit)

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty)

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98c0a6e5a54a25486b25ce98e885cd254e1da8efebce2cd0c13ab9c6250a911a")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit)

    /**
     * @param type The type of the AppSync datasource. 
     */
    public fun type(type: AppSyncDataSourceType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps.builder()

    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    override fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(CfnDataSource.DynamoDBConfigProperty.Companion::unwrap))
    }

    /**
     * @param dynamoDbConfig Configuration for DynamoDB Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f6b4cad0bd12709b4d3c5bf5be13ff9d840f97f54f009340fcd0da566b664e")
    override
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(CfnDataSource.DynamoDBConfigProperty(dynamoDbConfig))

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    override fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(CfnDataSource.EventBridgeConfigProperty.Companion::unwrap))
    }

    /**
     * @param eventBridgeConfig Configuration for EventBridge Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01ba1df0b205e05ed4f2197ceaea8503a07b3ec5331c40ac4b3578f86d6cbf87")
    override
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit):
        Unit = eventBridgeConfig(CfnDataSource.EventBridgeConfigProperty(eventBridgeConfig))

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(CfnDataSource.HttpConfigProperty.Companion::unwrap))
    }

    /**
     * @param httpConfig Configuration for HTTP Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f9f24da6961d0900c40a047c2048802cd8573fd4a37d0a123ee361688050060")
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(CfnDataSource.HttpConfigProperty(httpConfig))

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnDataSource.LambdaConfigProperty.Companion::unwrap))
    }

    /**
     * @param lambdaConfig Configuration for Lambda Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee02c26a42b41896c371b8afdc9a8cb10685bb410d56556c77d8c7cc0515623a")
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnDataSource.LambdaConfigProperty(lambdaConfig))

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(CfnDataSource.OpenSearchServiceConfigProperty.Companion::unwrap))
    }

    /**
     * @param openSearchServiceConfig Configuration for OpenSearch data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("320e1b99e026398fa920a132b1a96fefaaa44529173480d45630a42e53fd0c31")
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit =
        openSearchServiceConfig(CfnDataSource.OpenSearchServiceConfigProperty(openSearchServiceConfig))

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(CfnDataSource.RelationalDatabaseConfigProperty.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseConfig Configuration for RDS Datasource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98c0a6e5a54a25486b25ce98e885cd254e1da8efebce2cd0c13ab9c6250a911a")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit =
        relationalDatabaseConfig(CfnDataSource.RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    /**
     * @param type The type of the AppSync datasource. 
     */
    override fun type(type: AppSyncDataSourceType) {
      cdkBuilder.type(type.let(AppSyncDataSourceType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps,
  ) : CdkObject(cdkObject),
      AppSyncExtendedDataSourceProps {
    /**
     * Configuration for DynamoDB Datasource.
     *
     * Default: - No config
     */
    override fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

    /**
     * Configuration for EventBridge Datasource.
     *
     * Default: - No config
     */
    override fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

    /**
     * Configuration for HTTP Datasource.
     *
     * Default: - No config
     */
    override fun httpConfig(): Any? = unwrap(this).getHttpConfig()

    /**
     * Configuration for Lambda Datasource.
     *
     * Default: - No config
     */
    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    /**
     * Configuration for OpenSearch data source.
     *
     * Default: - No config
     */
    override fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

    /**
     * Configuration for RDS Datasource.
     *
     * Default: - No config
     */
    override fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

    /**
     * The type of the AppSync datasource.
     */
    override fun type(): AppSyncDataSourceType =
        unwrap(this).getType().let(AppSyncDataSourceType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncExtendedDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps):
        AppSyncExtendedDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        AppSyncExtendedDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncExtendedDataSourceProps):
        software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncExtendedDataSourceProps
  }
}
