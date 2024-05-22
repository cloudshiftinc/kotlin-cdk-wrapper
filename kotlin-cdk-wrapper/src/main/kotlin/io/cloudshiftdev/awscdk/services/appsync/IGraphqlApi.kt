@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.rds.IDatabaseCluster
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain as ElasticsearchIDomain
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain as OpensearchserviceIDomain

/**
 * Interface for GraphQL.
 */
public interface IGraphqlApi : IResource {
  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addDynamoDbDataSource(id: String, table: ITable): DynamoDbDataSource

  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: DataSourceOptions,
  ): DynamoDbDataSource

  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("530dd82c95ed746875fe350e7cde2e4fbc011d487637179a7db2e8e6deacaf0f")
  public fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: DataSourceOptions.Builder.() -> Unit,
  ): DynamoDbDataSource

  /**
   * (deprecated) add a new elasticsearch data source to this API.
   *
   * * use `addOpenSearchDataSource`
   * @param id The data source's id. 
   * @param domain The elasticsearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun addElasticsearchDataSource(id: String, domain: ElasticsearchIDomain):
      ElasticsearchDataSource

  /**
   * (deprecated) add a new elasticsearch data source to this API.
   *
   * * use `addOpenSearchDataSource`
   * @param id The data source's id. 
   * @param domain The elasticsearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun addElasticsearchDataSource(
    id: String,
    domain: ElasticsearchIDomain,
    options: DataSourceOptions,
  ): ElasticsearchDataSource

  /**
   * (deprecated) add a new elasticsearch data source to this API.
   *
   * * use `addOpenSearchDataSource`
   * @param id The data source's id. 
   * @param domain The elasticsearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0140c82b8b61fcbf955d362494e2dda1c27bce203e323f42c39a2f0d210d07e3")
  public fun addElasticsearchDataSource(
    id: String,
    domain: ElasticsearchIDomain,
    options: DataSourceOptions.Builder.() -> Unit,
  ): ElasticsearchDataSource

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  public fun addEventBridgeDataSource(id: String, eventBus: IEventBus): EventBridgeDataSource

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  public fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: DataSourceOptions,
  ): EventBridgeDataSource

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1a221338235f20da91d27739af1cae4d12b3f101b872bc80ef0dc52cb587b3d")
  public fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: DataSourceOptions.Builder.() -> Unit,
  ): EventBridgeDataSource

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  public fun addHttpDataSource(id: String, endpoint: String): HttpDataSource

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  public fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: HttpDataSourceOptions,
  ): HttpDataSource

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adc715bb04cde12e0c5e1b70042b159e2aab45f9ee3bfd1d56778b2f941f73b6")
  public fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: HttpDataSourceOptions.Builder.() -> Unit,
  ): HttpDataSource

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addLambdaDataSource(id: String, lambdaFunction: IFunction): LambdaDataSource

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: DataSourceOptions,
  ): LambdaDataSource

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5743d20f6e9bffad5b7739c473ab2a90eb35b8c23f6c85534da3967bd9c0a1a")
  public fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: DataSourceOptions.Builder.() -> Unit,
  ): LambdaDataSource

  /**
   * add a new dummy data source to this API.
   *
   * Useful for pipeline resolvers
   * and for backend changes that don't require a data source.
   *
   * @param id The data source's id. 
   * @param options The optional configuration for this data source.
   */
  public fun addNoneDataSource(id: String): NoneDataSource

  /**
   * add a new dummy data source to this API.
   *
   * Useful for pipeline resolvers
   * and for backend changes that don't require a data source.
   *
   * @param id The data source's id. 
   * @param options The optional configuration for this data source.
   */
  public fun addNoneDataSource(id: String, options: DataSourceOptions): NoneDataSource

  /**
   * add a new dummy data source to this API.
   *
   * Useful for pipeline resolvers
   * and for backend changes that don't require a data source.
   *
   * @param id The data source's id. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6ad3c2d0d3a1e70a3c0a4d1b13a764aaf821c23e6022c32e77eafd2e3511485")
  public fun addNoneDataSource(id: String, options: DataSourceOptions.Builder.() -> Unit):
      NoneDataSource

  /**
   * Add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addOpenSearchDataSource(id: String, domain: OpensearchserviceIDomain):
      OpenSearchDataSource

  /**
   * Add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  public fun addOpenSearchDataSource(
    id: String,
    domain: OpensearchserviceIDomain,
    options: DataSourceOptions,
  ): OpenSearchDataSource

  /**
   * Add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a4cb979329edf469eb722bd82ee676e144874290e4bf8b25e186aa1b5331890")
  public fun addOpenSearchDataSource(
    id: String,
    domain: OpensearchserviceIDomain,
    options: DataSourceOptions.Builder.() -> Unit,
  ): OpenSearchDataSource

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
  ): RdsDataSource

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
  ): RdsDataSource

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions,
  ): RdsDataSource

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a9fffa2af175b82843c8d257699a3a39f51c1a5f014c37a8b7fc18df18205e9")
  public fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions.Builder.() -> Unit,
  ): RdsDataSource

  /**
   * add a new Rds Serverless V2 data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSourceV2(
    id: String,
    serverlessCluster: IDatabaseCluster,
    secretStore: ISecret,
  ): RdsDataSource

  /**
   * add a new Rds Serverless V2 data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSourceV2(
    id: String,
    serverlessCluster: IDatabaseCluster,
    secretStore: ISecret,
    databaseName: String,
  ): RdsDataSource

  /**
   * add a new Rds Serverless V2 data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public fun addRdsDataSourceV2(
    id: String,
    serverlessCluster: IDatabaseCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions,
  ): RdsDataSource

  /**
   * add a new Rds Serverless V2 data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the serverless
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ac39443c1f1e3dc3b207cab5d6c797d277750bffdbf77218e1e142cf4d9800c")
  public fun addRdsDataSourceV2(
    id: String,
    serverlessCluster: IDatabaseCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions.Builder.() -> Unit,
  ): RdsDataSource

  /**
   * Add schema dependency if not imported.
   *
   * @param construct the dependee. 
   */
  public fun addSchemaDependency(construct: CfnResource): Boolean

  /**
   * an unique AWS AppSync GraphQL API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
   */
  public fun apiId(): String

  /**
   * the ARN of the API.
   */
  public fun arn(): String

  /**
   * creates a new resolver for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  public fun createResolver(id: String, props: ExtendedResolverProps): Resolver

  /**
   * creates a new resolver for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfac965a6b25365e261bc8f10e37f75dee20d44ce736e5d6bb3be729ca63320e")
  public fun createResolver(id: String, props: ExtendedResolverProps.Builder.() -> Unit): Resolver

  /**
   * Adds an IAM policy statement associated with this GraphQLApi to an IAM principal's policy.
   *
   * @param grantee The principal. 
   * @param resources The set of resources to allow (i.e.
   * ...:[region]:[accountId]:apis/GraphQLId/...). 
   * @param actions The actions that should be granted to the principal (i.e. appsync:graphql ). 
   */
  public fun grant(
    grantee: IGrantable,
    resources: IamResource,
    vararg actions: String,
  ): Grant

  /**
   * Adds an IAM policy statement for Mutation access to this GraphQLApi to an IAM principal's
   * policy.
   *
   * @param grantee The principal. 
   * @param fields The fields to grant access to that are Mutations (leave blank for all). 
   */
  public fun grantMutation(grantee: IGrantable, vararg fields: String): Grant

  /**
   * Adds an IAM policy statement for Query access to this GraphQLApi to an IAM principal's policy.
   *
   * @param grantee The principal. 
   * @param fields The fields to grant access to that are Queries (leave blank for all). 
   */
  public fun grantQuery(grantee: IGrantable, vararg fields: String): Grant

  /**
   * Adds an IAM policy statement for Subscription access to this GraphQLApi to an IAM principal's
   * policy.
   *
   * @param grantee The principal. 
   * @param fields The fields to grant access to that are Subscriptions (leave blank for all). 
   */
  public fun grantSubscription(grantee: IGrantable, vararg fields: String): Grant

  /**
   * The GraphQL endpoint ARN.
   */
  public fun graphQLEndpointArn(): String

  /**
   * The Authorization Types for this GraphQL Api.
   */
  public fun modes(): List<AuthorizationType>

  /**
   * the visibility of the API.
   */
  public fun visibility(): Visibility

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.IGraphqlApi,
  ) : CdkObject(cdkObject), IGraphqlApi {
    /**
     * add a new DynamoDB data source to this API.
     *
     * @param id The data source's id. 
     * @param table The DynamoDB table backing this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addDynamoDbDataSource(id: String, table: ITable): DynamoDbDataSource =
        unwrap(this).addDynamoDbDataSource(id,
        table.let(ITable.Companion::unwrap)).let(DynamoDbDataSource::wrap)

    /**
     * add a new DynamoDB data source to this API.
     *
     * @param id The data source's id. 
     * @param table The DynamoDB table backing this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addDynamoDbDataSource(
      id: String,
      table: ITable,
      options: DataSourceOptions,
    ): DynamoDbDataSource = unwrap(this).addDynamoDbDataSource(id,
        table.let(ITable.Companion::unwrap),
        options.let(DataSourceOptions.Companion::unwrap)).let(DynamoDbDataSource::wrap)

    /**
     * add a new DynamoDB data source to this API.
     *
     * @param id The data source's id. 
     * @param table The DynamoDB table backing this data source. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530dd82c95ed746875fe350e7cde2e4fbc011d487637179a7db2e8e6deacaf0f")
    override fun addDynamoDbDataSource(
      id: String,
      table: ITable,
      options: DataSourceOptions.Builder.() -> Unit,
    ): DynamoDbDataSource = addDynamoDbDataSource(id, table, DataSourceOptions(options))

    /**
     * (deprecated) add a new elasticsearch data source to this API.
     *
     * * use `addOpenSearchDataSource`
     * @param id The data source's id. 
     * @param domain The elasticsearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun addElasticsearchDataSource(id: String, domain: ElasticsearchIDomain):
        ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(id,
        domain.let(ElasticsearchIDomain.Companion::unwrap)).let(ElasticsearchDataSource::wrap)

    /**
     * (deprecated) add a new elasticsearch data source to this API.
     *
     * * use `addOpenSearchDataSource`
     * @param id The data source's id. 
     * @param domain The elasticsearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun addElasticsearchDataSource(
      id: String,
      domain: ElasticsearchIDomain,
      options: DataSourceOptions,
    ): ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(id,
        domain.let(ElasticsearchIDomain.Companion::unwrap),
        options.let(DataSourceOptions.Companion::unwrap)).let(ElasticsearchDataSource::wrap)

    /**
     * (deprecated) add a new elasticsearch data source to this API.
     *
     * * use `addOpenSearchDataSource`
     * @param id The data source's id. 
     * @param domain The elasticsearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0140c82b8b61fcbf955d362494e2dda1c27bce203e323f42c39a2f0d210d07e3")
    override fun addElasticsearchDataSource(
      id: String,
      domain: ElasticsearchIDomain,
      options: DataSourceOptions.Builder.() -> Unit,
    ): ElasticsearchDataSource = addElasticsearchDataSource(id, domain, DataSourceOptions(options))

    /**
     * Add an EventBridge data source to this api.
     *
     * @param id The data source's id. 
     * @param eventBus The EventBridge EventBus on which to put events. 
     * @param options The optional configuration for this data source.
     */
    override fun addEventBridgeDataSource(id: String, eventBus: IEventBus): EventBridgeDataSource =
        unwrap(this).addEventBridgeDataSource(id,
        eventBus.let(IEventBus.Companion::unwrap)).let(EventBridgeDataSource::wrap)

    /**
     * Add an EventBridge data source to this api.
     *
     * @param id The data source's id. 
     * @param eventBus The EventBridge EventBus on which to put events. 
     * @param options The optional configuration for this data source.
     */
    override fun addEventBridgeDataSource(
      id: String,
      eventBus: IEventBus,
      options: DataSourceOptions,
    ): EventBridgeDataSource = unwrap(this).addEventBridgeDataSource(id,
        eventBus.let(IEventBus.Companion::unwrap),
        options.let(DataSourceOptions.Companion::unwrap)).let(EventBridgeDataSource::wrap)

    /**
     * Add an EventBridge data source to this api.
     *
     * @param id The data source's id. 
     * @param eventBus The EventBridge EventBus on which to put events. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a221338235f20da91d27739af1cae4d12b3f101b872bc80ef0dc52cb587b3d")
    override fun addEventBridgeDataSource(
      id: String,
      eventBus: IEventBus,
      options: DataSourceOptions.Builder.() -> Unit,
    ): EventBridgeDataSource = addEventBridgeDataSource(id, eventBus, DataSourceOptions(options))

    /**
     * add a new http data source to this API.
     *
     * @param id The data source's id. 
     * @param endpoint The http endpoint. 
     * @param options The optional configuration for this data source.
     */
    override fun addHttpDataSource(id: String, endpoint: String): HttpDataSource =
        unwrap(this).addHttpDataSource(id, endpoint).let(HttpDataSource::wrap)

    /**
     * add a new http data source to this API.
     *
     * @param id The data source's id. 
     * @param endpoint The http endpoint. 
     * @param options The optional configuration for this data source.
     */
    override fun addHttpDataSource(
      id: String,
      endpoint: String,
      options: HttpDataSourceOptions,
    ): HttpDataSource = unwrap(this).addHttpDataSource(id, endpoint,
        options.let(HttpDataSourceOptions.Companion::unwrap)).let(HttpDataSource::wrap)

    /**
     * add a new http data source to this API.
     *
     * @param id The data source's id. 
     * @param endpoint The http endpoint. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adc715bb04cde12e0c5e1b70042b159e2aab45f9ee3bfd1d56778b2f941f73b6")
    override fun addHttpDataSource(
      id: String,
      endpoint: String,
      options: HttpDataSourceOptions.Builder.() -> Unit,
    ): HttpDataSource = addHttpDataSource(id, endpoint, HttpDataSourceOptions(options))

    /**
     * add a new Lambda data source to this API.
     *
     * @param id The data source's id. 
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addLambdaDataSource(id: String, lambdaFunction: IFunction): LambdaDataSource =
        unwrap(this).addLambdaDataSource(id,
        lambdaFunction.let(IFunction.Companion::unwrap)).let(LambdaDataSource::wrap)

    /**
     * add a new Lambda data source to this API.
     *
     * @param id The data source's id. 
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addLambdaDataSource(
      id: String,
      lambdaFunction: IFunction,
      options: DataSourceOptions,
    ): LambdaDataSource = unwrap(this).addLambdaDataSource(id,
        lambdaFunction.let(IFunction.Companion::unwrap),
        options.let(DataSourceOptions.Companion::unwrap)).let(LambdaDataSource::wrap)

    /**
     * add a new Lambda data source to this API.
     *
     * @param id The data source's id. 
     * @param lambdaFunction The Lambda function to call to interact with this data source. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5743d20f6e9bffad5b7739c473ab2a90eb35b8c23f6c85534da3967bd9c0a1a")
    override fun addLambdaDataSource(
      id: String,
      lambdaFunction: IFunction,
      options: DataSourceOptions.Builder.() -> Unit,
    ): LambdaDataSource = addLambdaDataSource(id, lambdaFunction, DataSourceOptions(options))

    /**
     * add a new dummy data source to this API.
     *
     * Useful for pipeline resolvers
     * and for backend changes that don't require a data source.
     *
     * @param id The data source's id. 
     * @param options The optional configuration for this data source.
     */
    override fun addNoneDataSource(id: String): NoneDataSource =
        unwrap(this).addNoneDataSource(id).let(NoneDataSource::wrap)

    /**
     * add a new dummy data source to this API.
     *
     * Useful for pipeline resolvers
     * and for backend changes that don't require a data source.
     *
     * @param id The data source's id. 
     * @param options The optional configuration for this data source.
     */
    override fun addNoneDataSource(id: String, options: DataSourceOptions): NoneDataSource =
        unwrap(this).addNoneDataSource(id,
        options.let(DataSourceOptions.Companion::unwrap)).let(NoneDataSource::wrap)

    /**
     * add a new dummy data source to this API.
     *
     * Useful for pipeline resolvers
     * and for backend changes that don't require a data source.
     *
     * @param id The data source's id. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6ad3c2d0d3a1e70a3c0a4d1b13a764aaf821c23e6022c32e77eafd2e3511485")
    override fun addNoneDataSource(id: String, options: DataSourceOptions.Builder.() -> Unit):
        NoneDataSource = addNoneDataSource(id, DataSourceOptions(options))

    /**
     * Add a new OpenSearch data source to this API.
     *
     * @param id The data source's id. 
     * @param domain The OpenSearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addOpenSearchDataSource(id: String, domain: OpensearchserviceIDomain):
        OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
        domain.let(OpensearchserviceIDomain.Companion::unwrap)).let(OpenSearchDataSource::wrap)

    /**
     * Add a new OpenSearch data source to this API.
     *
     * @param id The data source's id. 
     * @param domain The OpenSearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    override fun addOpenSearchDataSource(
      id: String,
      domain: OpensearchserviceIDomain,
      options: DataSourceOptions,
    ): OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
        domain.let(OpensearchserviceIDomain.Companion::unwrap),
        options.let(DataSourceOptions.Companion::unwrap)).let(OpenSearchDataSource::wrap)

    /**
     * Add a new OpenSearch data source to this API.
     *
     * @param id The data source's id. 
     * @param domain The OpenSearch domain for this data source. 
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a4cb979329edf469eb722bd82ee676e144874290e4bf8b25e186aa1b5331890")
    override fun addOpenSearchDataSource(
      id: String,
      domain: OpensearchserviceIDomain,
      options: DataSourceOptions.Builder.() -> Unit,
    ): OpenSearchDataSource = addOpenSearchDataSource(id, domain, DataSourceOptions(options))

    /**
     * add a new Rds data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSource(
      id: String,
      serverlessCluster: IServerlessCluster,
      secretStore: ISecret,
    ): RdsDataSource = unwrap(this).addRdsDataSource(id,
        serverlessCluster.let(IServerlessCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap)).let(RdsDataSource::wrap)

    /**
     * add a new Rds data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSource(
      id: String,
      serverlessCluster: IServerlessCluster,
      secretStore: ISecret,
      databaseName: String,
    ): RdsDataSource = unwrap(this).addRdsDataSource(id,
        serverlessCluster.let(IServerlessCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap), databaseName).let(RdsDataSource::wrap)

    /**
     * add a new Rds data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSource(
      id: String,
      serverlessCluster: IServerlessCluster,
      secretStore: ISecret,
      databaseName: String,
      options: DataSourceOptions,
    ): RdsDataSource = unwrap(this).addRdsDataSource(id,
        serverlessCluster.let(IServerlessCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap), databaseName,
        options.let(DataSourceOptions.Companion::unwrap)).let(RdsDataSource::wrap)

    /**
     * add a new Rds data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a9fffa2af175b82843c8d257699a3a39f51c1a5f014c37a8b7fc18df18205e9")
    override fun addRdsDataSource(
      id: String,
      serverlessCluster: IServerlessCluster,
      secretStore: ISecret,
      databaseName: String,
      options: DataSourceOptions.Builder.() -> Unit,
    ): RdsDataSource = addRdsDataSource(id, serverlessCluster, secretStore, databaseName,
        DataSourceOptions(options))

    /**
     * add a new Rds Serverless V2 data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSourceV2(
      id: String,
      serverlessCluster: IDatabaseCluster,
      secretStore: ISecret,
    ): RdsDataSource = unwrap(this).addRdsDataSourceV2(id,
        serverlessCluster.let(IDatabaseCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap)).let(RdsDataSource::wrap)

    /**
     * add a new Rds Serverless V2 data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSourceV2(
      id: String,
      serverlessCluster: IDatabaseCluster,
      secretStore: ISecret,
      databaseName: String,
    ): RdsDataSource = unwrap(this).addRdsDataSourceV2(id,
        serverlessCluster.let(IDatabaseCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap), databaseName).let(RdsDataSource::wrap)

    /**
     * add a new Rds Serverless V2 data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    override fun addRdsDataSourceV2(
      id: String,
      serverlessCluster: IDatabaseCluster,
      secretStore: ISecret,
      databaseName: String,
      options: DataSourceOptions,
    ): RdsDataSource = unwrap(this).addRdsDataSourceV2(id,
        serverlessCluster.let(IDatabaseCluster.Companion::unwrap),
        secretStore.let(ISecret.Companion::unwrap), databaseName,
        options.let(DataSourceOptions.Companion::unwrap)).let(RdsDataSource::wrap)

    /**
     * add a new Rds Serverless V2 data source to this API.
     *
     * @param id The data source's id. 
     * @param serverlessCluster The serverless V2 cluster to interact with this data source. 
     * @param secretStore The secret store that contains the username and password for the
     * serverless cluster. 
     * @param databaseName The optional name of the database to use within the cluster.
     * @param options The optional configuration for this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac39443c1f1e3dc3b207cab5d6c797d277750bffdbf77218e1e142cf4d9800c")
    override fun addRdsDataSourceV2(
      id: String,
      serverlessCluster: IDatabaseCluster,
      secretStore: ISecret,
      databaseName: String,
      options: DataSourceOptions.Builder.() -> Unit,
    ): RdsDataSource = addRdsDataSourceV2(id, serverlessCluster, secretStore, databaseName,
        DataSourceOptions(options))

    /**
     * Add schema dependency if not imported.
     *
     * @param construct the dependee. 
     */
    override fun addSchemaDependency(construct: CfnResource): Boolean =
        unwrap(this).addSchemaDependency(construct.let(CfnResource.Companion::unwrap))

    /**
     * an unique AWS AppSync GraphQL API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * the ARN of the API.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * creates a new resolver for this datasource and API using the given properties.
     *
     * @param id 
     * @param props 
     */
    override fun createResolver(id: String, props: ExtendedResolverProps): Resolver =
        unwrap(this).createResolver(id,
        props.let(ExtendedResolverProps.Companion::unwrap)).let(Resolver::wrap)

    /**
     * creates a new resolver for this datasource and API using the given properties.
     *
     * @param id 
     * @param props 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfac965a6b25365e261bc8f10e37f75dee20d44ce736e5d6bb3be729ca63320e")
    override fun createResolver(id: String, props: ExtendedResolverProps.Builder.() -> Unit):
        Resolver = createResolver(id, ExtendedResolverProps(props))

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Adds an IAM policy statement associated with this GraphQLApi to an IAM principal's policy.
     *
     * @param grantee The principal. 
     * @param resources The set of resources to allow (i.e.
     * ...:[region]:[accountId]:apis/GraphQLId/...). 
     * @param actions The actions that should be granted to the principal (i.e. appsync:graphql ). 
     */
    override fun grant(
      grantee: IGrantable,
      resources: IamResource,
      vararg actions: String,
    ): Grant = unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        resources.let(IamResource.Companion::unwrap), *actions.map{CdkObjectWrappers.unwrap(it) as
        String}.toTypedArray()).let(Grant::wrap)

    /**
     * Adds an IAM policy statement for Mutation access to this GraphQLApi to an IAM principal's
     * policy.
     *
     * @param grantee The principal. 
     * @param fields The fields to grant access to that are Mutations (leave blank for all). 
     */
    override fun grantMutation(grantee: IGrantable, vararg fields: String): Grant =
        unwrap(this).grantMutation(grantee.let(IGrantable.Companion::unwrap),
        *fields.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Adds an IAM policy statement for Query access to this GraphQLApi to an IAM principal's
     * policy.
     *
     * @param grantee The principal. 
     * @param fields The fields to grant access to that are Queries (leave blank for all). 
     */
    override fun grantQuery(grantee: IGrantable, vararg fields: String): Grant =
        unwrap(this).grantQuery(grantee.let(IGrantable.Companion::unwrap),
        *fields.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Adds an IAM policy statement for Subscription access to this GraphQLApi to an IAM principal's
     * policy.
     *
     * @param grantee The principal. 
     * @param fields The fields to grant access to that are Subscriptions (leave blank for all). 
     */
    override fun grantSubscription(grantee: IGrantable, vararg fields: String): Grant =
        unwrap(this).grantSubscription(grantee.let(IGrantable.Companion::unwrap),
        *fields.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * The GraphQL endpoint ARN.
     */
    override fun graphQLEndpointArn(): String = unwrap(this).getGraphQLEndpointArn()

    /**
     * The Authorization Types for this GraphQL Api.
     */
    override fun modes(): List<AuthorizationType> =
        unwrap(this).getModes().map(AuthorizationType::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * the visibility of the API.
     */
    override fun visibility(): Visibility = unwrap(this).getVisibility().let(Visibility::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IGraphqlApi): IGraphqlApi =
        CdkObjectWrappers.wrap(cdkObject) as? IGraphqlApi ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGraphqlApi): software.amazon.awscdk.services.appsync.IGraphqlApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.IGraphqlApi
  }
}
