@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDataSourceProps {
  public fun apiId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  public fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  public fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  public fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  public fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  public fun name(): String

  public fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  public fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun description(description: String)

    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f5899905406c9cb2957b06ed9341002fc8e03a7566227b4bebbbfe9502a6b1b")
    public
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit)

    public fun elasticsearchConfig(elasticsearchConfig: IResolvable)

    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97e3723e80a155fb931c4d1b50be94b9f029cd43eb14d0305ced2ff662e0e92")
    public
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit)

    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23945a82aa0ecb7796322ce072b4910c48c4ece3825f8c99e9dc062e2c043ff5")
    public
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit)

    public fun httpConfig(httpConfig: IResolvable)

    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bffa8002d26ae78a6b3702e292a71eee63716c5861e5c6c34cfedbbaeceebfc2")
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit)

    public fun lambdaConfig(lambdaConfig: IResolvable)

    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("239cc3c4cf652dc6110c569148705b48bb8fcef2142582fec9535456a9085144")
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit)

    public fun metricsConfig(metricsConfig: String)

    public fun name(name: String)

    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0ff795e8b192096acd30d955d3cde975c4d54bffeb7d4d2c2609c11355ffe2")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit)

    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1f9990817fa15280ff49915f76523cce55f290b546b355551fd4f45fa7c8fb")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDataSourceProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable::unwrap))
    }

    override fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(CfnDataSource.DynamoDBConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f5899905406c9cb2957b06ed9341002fc8e03a7566227b4bebbbfe9502a6b1b")
    override
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(CfnDataSource.DynamoDBConfigProperty(dynamoDbConfig))

    override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable::unwrap))
    }

    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(CfnDataSource.ElasticsearchConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97e3723e80a155fb931c4d1b50be94b9f029cd43eb14d0305ced2ff662e0e92")
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit):
        Unit = elasticsearchConfig(CfnDataSource.ElasticsearchConfigProperty(elasticsearchConfig))

    override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable::unwrap))
    }

    override fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(CfnDataSource.EventBridgeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23945a82aa0ecb7796322ce072b4910c48c4ece3825f8c99e9dc062e2c043ff5")
    override
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit):
        Unit = eventBridgeConfig(CfnDataSource.EventBridgeConfigProperty(eventBridgeConfig))

    override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable::unwrap))
    }

    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(CfnDataSource.HttpConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bffa8002d26ae78a6b3702e292a71eee63716c5861e5c6c34cfedbbaeceebfc2")
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(CfnDataSource.HttpConfigProperty(httpConfig))

    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnDataSource.LambdaConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("239cc3c4cf652dc6110c569148705b48bb8fcef2142582fec9535456a9085144")
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnDataSource.LambdaConfigProperty(lambdaConfig))

    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable::unwrap))
    }

    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(CfnDataSource.OpenSearchServiceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0ff795e8b192096acd30d955d3cde975c4d54bffeb7d4d2c2609c11355ffe2")
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit =
        openSearchServiceConfig(CfnDataSource.OpenSearchServiceConfigProperty(openSearchServiceConfig))

    override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable::unwrap))
    }

    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(CfnDataSource.RelationalDatabaseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1f9990817fa15280ff49915f76523cce55f290b546b355551fd4f45fa7c8fb")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit =
        relationalDatabaseConfig(CfnDataSource.RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

    override fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

    override fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

    override fun httpConfig(): Any? = unwrap(this).getHttpConfig()

    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    override fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

    override fun name(): String = unwrap(this).getName()

    override fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

    override fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

    override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSourceProps):
        CfnDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.appsync.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnDataSourceProps
  }
}
