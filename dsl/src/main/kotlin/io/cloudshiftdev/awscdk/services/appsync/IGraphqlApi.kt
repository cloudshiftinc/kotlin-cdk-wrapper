package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain as ElasticsearchIDomain
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain as OpensearchserviceIDomain

public interface IGraphqlApi : IResource {
  public fun addDynamoDbDataSource(arg0: String, arg1: ITable): DynamoDbDataSource

  public fun addDynamoDbDataSource(
    arg0: String,
    arg1: ITable,
    arg2: DataSourceOptions,
  ): DynamoDbDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("530dd82c95ed746875fe350e7cde2e4fbc011d487637179a7db2e8e6deacaf0f")
  public fun addDynamoDbDataSource(
    arg0: String,
    arg1: ITable,
    arg2: DataSourceOptions.Builder.() -> Unit,
  ): DynamoDbDataSource

  @Deprecated(message = "deprecated in CDK")
  public fun addElasticsearchDataSource(arg0: String, arg1: ElasticsearchIDomain):
      ElasticsearchDataSource

  @Deprecated(message = "deprecated in CDK")
  public fun addElasticsearchDataSource(
    arg0: String,
    arg1: ElasticsearchIDomain,
    arg2: DataSourceOptions,
  ): ElasticsearchDataSource

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0140c82b8b61fcbf955d362494e2dda1c27bce203e323f42c39a2f0d210d07e3")
  public fun addElasticsearchDataSource(
    arg0: String,
    arg1: ElasticsearchIDomain,
    arg2: DataSourceOptions.Builder.() -> Unit,
  ): ElasticsearchDataSource

  public fun addEventBridgeDataSource(arg0: String, arg1: IEventBus): EventBridgeDataSource

  public fun addEventBridgeDataSource(
    arg0: String,
    arg1: IEventBus,
    arg2: DataSourceOptions,
  ): EventBridgeDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1a221338235f20da91d27739af1cae4d12b3f101b872bc80ef0dc52cb587b3d")
  public fun addEventBridgeDataSource(
    arg0: String,
    arg1: IEventBus,
    arg2: DataSourceOptions.Builder.() -> Unit,
  ): EventBridgeDataSource

  public fun addHttpDataSource(arg0: String, arg1: String): HttpDataSource

  public fun addHttpDataSource(
    arg0: String,
    arg1: String,
    arg2: HttpDataSourceOptions,
  ): HttpDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adc715bb04cde12e0c5e1b70042b159e2aab45f9ee3bfd1d56778b2f941f73b6")
  public fun addHttpDataSource(
    arg0: String,
    arg1: String,
    arg2: HttpDataSourceOptions.Builder.() -> Unit,
  ): HttpDataSource

  public fun addLambdaDataSource(arg0: String, arg1: IFunction): LambdaDataSource

  public fun addLambdaDataSource(
    arg0: String,
    arg1: IFunction,
    arg2: DataSourceOptions,
  ): LambdaDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5743d20f6e9bffad5b7739c473ab2a90eb35b8c23f6c85534da3967bd9c0a1a")
  public fun addLambdaDataSource(
    arg0: String,
    arg1: IFunction,
    arg2: DataSourceOptions.Builder.() -> Unit,
  ): LambdaDataSource

  public fun addNoneDataSource(arg0: String): NoneDataSource

  public fun addNoneDataSource(arg0: String, arg1: DataSourceOptions): NoneDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6ad3c2d0d3a1e70a3c0a4d1b13a764aaf821c23e6022c32e77eafd2e3511485")
  public fun addNoneDataSource(arg0: String, arg1: DataSourceOptions.Builder.() -> Unit):
      NoneDataSource

  public fun addOpenSearchDataSource(arg0: String, arg1: OpensearchserviceIDomain):
      OpenSearchDataSource

  public fun addOpenSearchDataSource(
    arg0: String,
    arg1: OpensearchserviceIDomain,
    arg2: DataSourceOptions,
  ): OpenSearchDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a4cb979329edf469eb722bd82ee676e144874290e4bf8b25e186aa1b5331890")
  public fun addOpenSearchDataSource(
    arg0: String,
    arg1: OpensearchserviceIDomain,
    arg2: DataSourceOptions.Builder.() -> Unit,
  ): OpenSearchDataSource

  public fun addRdsDataSource(
    arg0: String,
    arg1: IServerlessCluster,
    arg2: ISecret,
  ): RdsDataSource

  public fun addRdsDataSource(
    arg0: String,
    arg1: IServerlessCluster,
    arg2: ISecret,
    arg3: String,
  ): RdsDataSource

  public fun addRdsDataSource(
    arg0: String,
    arg1: IServerlessCluster,
    arg2: ISecret,
    arg3: String,
    arg4: DataSourceOptions,
  ): RdsDataSource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a9fffa2af175b82843c8d257699a3a39f51c1a5f014c37a8b7fc18df18205e9")
  public fun addRdsDataSource(
    arg0: String,
    arg1: IServerlessCluster,
    arg2: ISecret,
    arg3: String,
    arg4: DataSourceOptions.Builder.() -> Unit,
  ): RdsDataSource

  public fun addSchemaDependency(arg0: CfnResource): Boolean

  public fun apiId(): String

  public fun arn(): String

  public fun createResolver(arg0: String, arg1: ExtendedResolverProps): Resolver

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfac965a6b25365e261bc8f10e37f75dee20d44ce736e5d6bb3be729ca63320e")
  public fun createResolver(arg0: String, arg1: ExtendedResolverProps.Builder.() -> Unit): Resolver

  public fun grant(
    arg0: IGrantable,
    arg1: IamResource,
    arg2: String,
  ): Grant

  public fun grantMutation(arg0: IGrantable, arg1: String): Grant

  public fun grantQuery(arg0: IGrantable, arg1: String): Grant

  public fun grantSubscription(arg0: IGrantable, arg1: String): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.IGraphqlApi,
  ) : IGraphqlApi {
    override fun addDynamoDbDataSource(arg0: String, arg1: ITable): DynamoDbDataSource =
        unwrap(this).addDynamoDbDataSource(arg0,
        arg1.let(ITable::unwrap)).let(DynamoDbDataSource::wrap)

    override fun addDynamoDbDataSource(
      arg0: String,
      arg1: ITable,
      arg2: DataSourceOptions,
    ): DynamoDbDataSource = unwrap(this).addDynamoDbDataSource(arg0, arg1.let(ITable::unwrap),
        arg2.let(DataSourceOptions::unwrap)).let(DynamoDbDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530dd82c95ed746875fe350e7cde2e4fbc011d487637179a7db2e8e6deacaf0f")
    override fun addDynamoDbDataSource(
      arg0: String,
      arg1: ITable,
      arg2: DataSourceOptions.Builder.() -> Unit,
    ): DynamoDbDataSource = addDynamoDbDataSource(arg0, arg1, DataSourceOptions(arg2))

    @Deprecated(message = "deprecated in CDK")
    override fun addElasticsearchDataSource(arg0: String, arg1: ElasticsearchIDomain):
        ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(arg0,
        arg1.let(ElasticsearchIDomain::unwrap)).let(ElasticsearchDataSource::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun addElasticsearchDataSource(
      arg0: String,
      arg1: ElasticsearchIDomain,
      arg2: DataSourceOptions,
    ): ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(arg0,
        arg1.let(ElasticsearchIDomain::unwrap),
        arg2.let(DataSourceOptions::unwrap)).let(ElasticsearchDataSource::wrap)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0140c82b8b61fcbf955d362494e2dda1c27bce203e323f42c39a2f0d210d07e3")
    override fun addElasticsearchDataSource(
      arg0: String,
      arg1: ElasticsearchIDomain,
      arg2: DataSourceOptions.Builder.() -> Unit,
    ): ElasticsearchDataSource = addElasticsearchDataSource(arg0, arg1, DataSourceOptions(arg2))

    override fun addEventBridgeDataSource(arg0: String, arg1: IEventBus): EventBridgeDataSource =
        unwrap(this).addEventBridgeDataSource(arg0,
        arg1.let(IEventBus::unwrap)).let(EventBridgeDataSource::wrap)

    override fun addEventBridgeDataSource(
      arg0: String,
      arg1: IEventBus,
      arg2: DataSourceOptions,
    ): EventBridgeDataSource = unwrap(this).addEventBridgeDataSource(arg0,
        arg1.let(IEventBus::unwrap),
        arg2.let(DataSourceOptions::unwrap)).let(EventBridgeDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a221338235f20da91d27739af1cae4d12b3f101b872bc80ef0dc52cb587b3d")
    override fun addEventBridgeDataSource(
      arg0: String,
      arg1: IEventBus,
      arg2: DataSourceOptions.Builder.() -> Unit,
    ): EventBridgeDataSource = addEventBridgeDataSource(arg0, arg1, DataSourceOptions(arg2))

    override fun addHttpDataSource(arg0: String, arg1: String): HttpDataSource =
        unwrap(this).addHttpDataSource(arg0, arg1).let(HttpDataSource::wrap)

    override fun addHttpDataSource(
      arg0: String,
      arg1: String,
      arg2: HttpDataSourceOptions,
    ): HttpDataSource = unwrap(this).addHttpDataSource(arg0, arg1,
        arg2.let(HttpDataSourceOptions::unwrap)).let(HttpDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adc715bb04cde12e0c5e1b70042b159e2aab45f9ee3bfd1d56778b2f941f73b6")
    override fun addHttpDataSource(
      arg0: String,
      arg1: String,
      arg2: HttpDataSourceOptions.Builder.() -> Unit,
    ): HttpDataSource = addHttpDataSource(arg0, arg1, HttpDataSourceOptions(arg2))

    override fun addLambdaDataSource(arg0: String, arg1: IFunction): LambdaDataSource =
        unwrap(this).addLambdaDataSource(arg0,
        arg1.let(IFunction::unwrap)).let(LambdaDataSource::wrap)

    override fun addLambdaDataSource(
      arg0: String,
      arg1: IFunction,
      arg2: DataSourceOptions,
    ): LambdaDataSource = unwrap(this).addLambdaDataSource(arg0, arg1.let(IFunction::unwrap),
        arg2.let(DataSourceOptions::unwrap)).let(LambdaDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5743d20f6e9bffad5b7739c473ab2a90eb35b8c23f6c85534da3967bd9c0a1a")
    override fun addLambdaDataSource(
      arg0: String,
      arg1: IFunction,
      arg2: DataSourceOptions.Builder.() -> Unit,
    ): LambdaDataSource = addLambdaDataSource(arg0, arg1, DataSourceOptions(arg2))

    override fun addNoneDataSource(arg0: String): NoneDataSource =
        unwrap(this).addNoneDataSource(arg0).let(NoneDataSource::wrap)

    override fun addNoneDataSource(arg0: String, arg1: DataSourceOptions): NoneDataSource =
        unwrap(this).addNoneDataSource(arg0,
        arg1.let(DataSourceOptions::unwrap)).let(NoneDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6ad3c2d0d3a1e70a3c0a4d1b13a764aaf821c23e6022c32e77eafd2e3511485")
    override fun addNoneDataSource(arg0: String, arg1: DataSourceOptions.Builder.() -> Unit):
        NoneDataSource = addNoneDataSource(arg0, DataSourceOptions(arg1))

    override fun addOpenSearchDataSource(arg0: String, arg1: OpensearchserviceIDomain):
        OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(arg0,
        arg1.let(OpensearchserviceIDomain::unwrap)).let(OpenSearchDataSource::wrap)

    override fun addOpenSearchDataSource(
      arg0: String,
      arg1: OpensearchserviceIDomain,
      arg2: DataSourceOptions,
    ): OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(arg0,
        arg1.let(OpensearchserviceIDomain::unwrap),
        arg2.let(DataSourceOptions::unwrap)).let(OpenSearchDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a4cb979329edf469eb722bd82ee676e144874290e4bf8b25e186aa1b5331890")
    override fun addOpenSearchDataSource(
      arg0: String,
      arg1: OpensearchserviceIDomain,
      arg2: DataSourceOptions.Builder.() -> Unit,
    ): OpenSearchDataSource = addOpenSearchDataSource(arg0, arg1, DataSourceOptions(arg2))

    override fun addRdsDataSource(
      arg0: String,
      arg1: IServerlessCluster,
      arg2: ISecret,
    ): RdsDataSource = unwrap(this).addRdsDataSource(arg0, arg1.let(IServerlessCluster::unwrap),
        arg2.let(ISecret::unwrap)).let(RdsDataSource::wrap)

    override fun addRdsDataSource(
      arg0: String,
      arg1: IServerlessCluster,
      arg2: ISecret,
      arg3: String,
    ): RdsDataSource = unwrap(this).addRdsDataSource(arg0, arg1.let(IServerlessCluster::unwrap),
        arg2.let(ISecret::unwrap), arg3).let(RdsDataSource::wrap)

    override fun addRdsDataSource(
      arg0: String,
      arg1: IServerlessCluster,
      arg2: ISecret,
      arg3: String,
      arg4: DataSourceOptions,
    ): RdsDataSource = unwrap(this).addRdsDataSource(arg0, arg1.let(IServerlessCluster::unwrap),
        arg2.let(ISecret::unwrap), arg3,
        arg4.let(DataSourceOptions::unwrap)).let(RdsDataSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a9fffa2af175b82843c8d257699a3a39f51c1a5f014c37a8b7fc18df18205e9")
    override fun addRdsDataSource(
      arg0: String,
      arg1: IServerlessCluster,
      arg2: ISecret,
      arg3: String,
      arg4: DataSourceOptions.Builder.() -> Unit,
    ): RdsDataSource = addRdsDataSource(arg0, arg1, arg2, arg3, DataSourceOptions(arg4))

    override fun addSchemaDependency(arg0: CfnResource): Boolean =
        unwrap(this).addSchemaDependency(arg0.let(CfnResource::unwrap))

    override fun apiId(): String = unwrap(this).getApiId()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun arn(): String = unwrap(this).getArn()

    override fun createResolver(arg0: String, arg1: ExtendedResolverProps): Resolver =
        unwrap(this).createResolver(arg0,
        arg1.let(ExtendedResolverProps::unwrap)).let(Resolver::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfac965a6b25365e261bc8f10e37f75dee20d44ce736e5d6bb3be729ca63320e")
    override fun createResolver(arg0: String, arg1: ExtendedResolverProps.Builder.() -> Unit):
        Resolver = createResolver(arg0, ExtendedResolverProps(arg1))

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(
      arg0: IGrantable,
      arg1: IamResource,
      arg2: String,
    ): Grant = unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1.let(IamResource::unwrap),
        arg2).let(Grant::wrap)

    override fun grantMutation(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantMutation(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantQuery(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantQuery(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantSubscription(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantSubscription(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IGraphqlApi): IGraphqlApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGraphqlApi): software.amazon.awscdk.services.appsync.IGraphqlApi =
        (wrapped as Wrapper).cdkObject
  }
}
