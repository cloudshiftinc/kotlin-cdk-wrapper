@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Base Class for Event API.
 */
public abstract class EventApiBase(
  cdkObject: software.amazon.awscdk.services.appsync.EventApiBase,
) : ApiBase(cdkObject),
    IEventApi {
  /**
   * add a new Channel Namespace to this API.
   *
   * @param id 
   * @param options
   */
  public override fun addChannelNamespace(id: String): ChannelNamespace =
      unwrap(this).addChannelNamespace(id).let(ChannelNamespace::wrap)

  /**
   * add a new Channel Namespace to this API.
   *
   * @param id 
   * @param options
   */
  public override fun addChannelNamespace(id: String, options: ChannelNamespaceOptions):
      ChannelNamespace = unwrap(this).addChannelNamespace(id,
      options.let(ChannelNamespaceOptions.Companion::unwrap)).let(ChannelNamespace::wrap)

  /**
   * add a new Channel Namespace to this API.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9c25d14182b2746083b165494af38d1447444a519a2c627c4f153e2a59426863")
  public override fun addChannelNamespace(id: String,
      options: ChannelNamespaceOptions.Builder.() -> Unit): ChannelNamespace =
      addChannelNamespace(id, ChannelNamespaceOptions(options))

  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addDynamoDbDataSource(id: String, table: ITable): AppSyncDynamoDbDataSource =
      unwrap(this).addDynamoDbDataSource(id,
      table.let(ITable.Companion::unwrap)).let(AppSyncDynamoDbDataSource::wrap)

  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: AppSyncDataSourceOptions,
  ): AppSyncDynamoDbDataSource = unwrap(this).addDynamoDbDataSource(id,
      table.let(ITable.Companion::unwrap),
      options.let(AppSyncDataSourceOptions.Companion::unwrap)).let(AppSyncDynamoDbDataSource::wrap)

  /**
   * add a new DynamoDB data source to this API.
   *
   * @param id The data source's id. 
   * @param table The DynamoDB table backing this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73e9ef71bf32900e655d5daf0d3463543b3a28a9a0a4c72bd3ee00bfb16985f6")
  public override fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: AppSyncDataSourceOptions.Builder.() -> Unit,
  ): AppSyncDynamoDbDataSource = addDynamoDbDataSource(id, table, AppSyncDataSourceOptions(options))

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  public override fun addEventBridgeDataSource(id: String, eventBus: IEventBus):
      AppSyncEventBridgeDataSource = unwrap(this).addEventBridgeDataSource(id,
      eventBus.let(IEventBus.Companion::unwrap)).let(AppSyncEventBridgeDataSource::wrap)

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  public override fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: AppSyncDataSourceOptions,
  ): AppSyncEventBridgeDataSource = unwrap(this).addEventBridgeDataSource(id,
      eventBus.let(IEventBus.Companion::unwrap),
      options.let(AppSyncDataSourceOptions.Companion::unwrap)).let(AppSyncEventBridgeDataSource::wrap)

  /**
   * Add an EventBridge data source to this api.
   *
   * @param id The data source's id. 
   * @param eventBus The EventBridge EventBus on which to put events. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb7cb56fd8c3a64d1a66809527a878b4ea04090bb9e7952771c47c16ca203c83")
  public override fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: AppSyncDataSourceOptions.Builder.() -> Unit,
  ): AppSyncEventBridgeDataSource = addEventBridgeDataSource(id, eventBus,
      AppSyncDataSourceOptions(options))

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  public override fun addHttpDataSource(id: String, endpoint: String): AppSyncHttpDataSource =
      unwrap(this).addHttpDataSource(id, endpoint).let(AppSyncHttpDataSource::wrap)

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  public override fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: AppSyncHttpDataSourceOptions,
  ): AppSyncHttpDataSource = unwrap(this).addHttpDataSource(id, endpoint,
      options.let(AppSyncHttpDataSourceOptions.Companion::unwrap)).let(AppSyncHttpDataSource::wrap)

  /**
   * add a new http data source to this API.
   *
   * @param id The data source's id. 
   * @param endpoint The http endpoint. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe1d350c682cbd223d394228c69ec23b5cefb40cbdd874b592073211c29789eb")
  public override fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: AppSyncHttpDataSourceOptions.Builder.() -> Unit,
  ): AppSyncHttpDataSource = addHttpDataSource(id, endpoint, AppSyncHttpDataSourceOptions(options))

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addLambdaDataSource(id: String, lambdaFunction: IFunction):
      AppSyncLambdaDataSource = unwrap(this).addLambdaDataSource(id,
      lambdaFunction.let(IFunction.Companion::unwrap)).let(AppSyncLambdaDataSource::wrap)

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: AppSyncDataSourceOptions,
  ): AppSyncLambdaDataSource = unwrap(this).addLambdaDataSource(id,
      lambdaFunction.let(IFunction.Companion::unwrap),
      options.let(AppSyncDataSourceOptions.Companion::unwrap)).let(AppSyncLambdaDataSource::wrap)

  /**
   * add a new Lambda data source to this API.
   *
   * @param id The data source's id. 
   * @param lambdaFunction The Lambda function to call to interact with this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b765ae5bc721f1abf3fe9c179e9024e66f89c90924732be5956aefc8f677e42")
  public override fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: AppSyncDataSourceOptions.Builder.() -> Unit,
  ): AppSyncLambdaDataSource = addLambdaDataSource(id, lambdaFunction,
      AppSyncDataSourceOptions(options))

  /**
   * add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addOpenSearchDataSource(id: String, domain: IDomain):
      AppSyncOpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
      domain.let(IDomain.Companion::unwrap)).let(AppSyncOpenSearchDataSource::wrap)

  /**
   * add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  public override fun addOpenSearchDataSource(
    id: String,
    domain: IDomain,
    options: AppSyncDataSourceOptions,
  ): AppSyncOpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
      domain.let(IDomain.Companion::unwrap),
      options.let(AppSyncDataSourceOptions.Companion::unwrap)).let(AppSyncOpenSearchDataSource::wrap)

  /**
   * add a new OpenSearch data source to this API.
   *
   * @param id The data source's id. 
   * @param domain The OpenSearch domain for this data source. 
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37ea9a68dec9c7b12d28b6582a38f7f29fb1402747bfa2a6018761f9774bfda2")
  public override fun addOpenSearchDataSource(
    id: String,
    domain: IDomain,
    options: AppSyncDataSourceOptions.Builder.() -> Unit,
  ): AppSyncOpenSearchDataSource = addOpenSearchDataSource(id, domain,
      AppSyncDataSourceOptions(options))

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The database cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the database
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: Any,
    secretStore: ISecret,
  ): AppSyncRdsDataSource = unwrap(this).addRdsDataSource(id, serverlessCluster,
      secretStore.let(ISecret.Companion::unwrap)).let(AppSyncRdsDataSource::wrap)

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The database cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the database
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: Any,
    secretStore: ISecret,
    databaseName: String,
  ): AppSyncRdsDataSource = unwrap(this).addRdsDataSource(id, serverlessCluster,
      secretStore.let(ISecret.Companion::unwrap), databaseName).let(AppSyncRdsDataSource::wrap)

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The database cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the database
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: Any,
    secretStore: ISecret,
    databaseName: String,
    options: AppSyncDataSourceOptions,
  ): AppSyncRdsDataSource = unwrap(this).addRdsDataSource(id, serverlessCluster,
      secretStore.let(ISecret.Companion::unwrap), databaseName,
      options.let(AppSyncDataSourceOptions.Companion::unwrap)).let(AppSyncRdsDataSource::wrap)

  /**
   * add a new Rds data source to this API.
   *
   * @param id The data source's id. 
   * @param serverlessCluster The database cluster to interact with this data source. 
   * @param secretStore The secret store that contains the username and password for the database
   * cluster. 
   * @param databaseName The optional name of the database to use within the cluster.
   * @param options The optional configuration for this data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53d04e681505a71f217553799c49d6d7c9c3c6c2f02544cc4968ca0e7e80486c")
  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: Any,
    secretStore: ISecret,
    databaseName: String,
    options: AppSyncDataSourceOptions.Builder.() -> Unit,
  ): AppSyncRdsDataSource = addRdsDataSource(id, serverlessCluster, secretStore, databaseName,
      AppSyncDataSourceOptions(options))

  /**
   * The Authorization Types for this Event Api.
   */
  public override fun authProviderTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getAuthProviderTypes().map(AppSyncAuthorizationType::wrap)

  /**
   * Adds an IAM policy statement associated with this Event API to an IAM principal's policy.
   *
   * @param grantee The principal. 
   * @param resources The set of resources to allow (i.e.
   * ...:[region]:[accountId]:apis/EventApiId/...). 
   * @param actions The actions that should be granted to the principal (i.e. appsync:EventPublish
   * ). 
   */
  public override fun grant(
    grantee: IGrantable,
    resources: AppSyncEventResource,
    vararg actions: String,
  ): Grant = unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      resources.let(AppSyncEventResource.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Adds an IAM policy statement for EventConnect access to this EventApi to an IAM principal's
   * policy.
   *
   * @param grantee The principal. 
   */
  public override fun grantConnect(grantee: IGrantable): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement for EventPublish access to this EventApi to an IAM principal's
   * policy.
   *
   * This grants publish permission for all channels within the API.
   *
   * @param grantee The principal. 
   */
  public override fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement to publish and subscribe to this API for an IAM principal's
   * policy.
   *
   * This grants publish &amp; subscribe permission for all channels within the API.
   *
   * @param grantee The principal. 
   */
  public override fun grantPublishAndSubscribe(grantee: IGrantable): Grant =
      unwrap(this).grantPublishAndSubscribe(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement for EventSubscribe access to this EventApi to an IAM principal's
   * policy.
   *
   * This grants subscribe permission for all channels within the API.
   *
   * @param grantee The principal. 
   */
  public override fun grantSubscribe(grantee: IGrantable): Grant =
      unwrap(this).grantSubscribe(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The domain name of the Api's HTTP endpoint.
   */
  public override fun httpDns(): String = unwrap(this).getHttpDns()

  /**
   * The domain name of the Api's real-time endpoint.
   */
  public override fun realtimeDns(): String = unwrap(this).getRealtimeDns()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.EventApiBase,
  ) : EventApiBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventApiBase): EventApiBase
        = CdkObjectWrappers.wrap(cdkObject) as? EventApiBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventApiBase): software.amazon.awscdk.services.appsync.EventApiBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.EventApiBase
  }
}
