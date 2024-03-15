@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ExtendedDataSourceProps {
  public fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  @Deprecated(message = "deprecated in CDK")
  public fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  public fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  public fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  public fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  public fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293eb694721edc32e8a1153bd9eb5a95779f3df44babd7194e4b53549ae41988")
    public
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c59a8513aef1e90584e348184ea4f58a4b84f6e9bbc783266e55b31c6e3cfe")
    public
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit)

    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f993365b52d05651f40f620b809f272f7b114333d46013cf291a84d64cd09e3")
    public
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit)

    public fun httpConfig(httpConfig: IResolvable)

    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3883f8f6f7be1bf1a0a5f033019b520998880155cd6ea6300e83320f945c5f39")
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit)

    public fun lambdaConfig(lambdaConfig: IResolvable)

    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f43b4431cc09115a22dc67f7855956ce623db31a64dc5756d9068ce81290eda3")
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit)

    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001c3a2dc911a8b4cdf6595770910c4e55a75dc7334bee51cc980e2914ce725")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit)

    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0edfddb893c596cbc446b1f3ee1a861988c7e9bacfdf8c26589d8af637d043e6")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps.Builder
        = software.amazon.awscdk.services.appsync.ExtendedDataSourceProps.builder()

    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable::unwrap))
    }

    override fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(CfnDataSource.DynamoDBConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293eb694721edc32e8a1153bd9eb5a95779f3df44babd7194e4b53549ae41988")
    override
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(CfnDataSource.DynamoDBConfigProperty(dynamoDbConfig))

    @Deprecated(message = "deprecated in CDK")
    override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(CfnDataSource.ElasticsearchConfigProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c59a8513aef1e90584e348184ea4f58a4b84f6e9bbc783266e55b31c6e3cfe")
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
    @JvmName("9f993365b52d05651f40f620b809f272f7b114333d46013cf291a84d64cd09e3")
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
    @JvmName("3883f8f6f7be1bf1a0a5f033019b520998880155cd6ea6300e83320f945c5f39")
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(CfnDataSource.HttpConfigProperty(httpConfig))

    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnDataSource.LambdaConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f43b4431cc09115a22dc67f7855956ce623db31a64dc5756d9068ce81290eda3")
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnDataSource.LambdaConfigProperty(lambdaConfig))

    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable::unwrap))
    }

    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(CfnDataSource.OpenSearchServiceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001c3a2dc911a8b4cdf6595770910c4e55a75dc7334bee51cc980e2914ce725")
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
    @JvmName("0edfddb893c596cbc446b1f3ee1a861988c7e9bacfdf8c26589d8af637d043e6")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit =
        relationalDatabaseConfig(CfnDataSource.RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.ExtendedDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps,
  ) : CdkObject(cdkObject), ExtendedDataSourceProps {
    override fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

    @Deprecated(message = "deprecated in CDK")
    override fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

    override fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

    override fun httpConfig(): Any? = unwrap(this).getHttpConfig()

    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    override fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

    override fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ExtendedDataSourceProps):
        ExtendedDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtendedDataSourceProps):
        software.amazon.awscdk.services.appsync.ExtendedDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ExtendedDataSourceProps
  }
}
