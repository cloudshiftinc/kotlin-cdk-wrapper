@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync datasource backed by RDS.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Vpc vpc;
 * String databaseName = "mydb";
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Cluster")
 * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_16_6).build()))
 * .writer(ClusterInstance.serverlessV2("writer"))
 * .vpc(vpc)
 * .credentials(Map.of("username", "clusteradmin"))
 * .defaultDatabaseName(databaseName)
 * .enableDataApi(true)
 * .build();
 * ISecret secret = Secret.fromSecretNameV2(this, "Secret", "db-secretName");
 * EventApi api = EventApi.Builder.create(this, "EventApiRds")
 * .apiName("RdsEventApi")
 * .build();
 * AppSyncRdsDataSource dataSource = api.addRdsDataSource("rdsds", cluster, secret, databaseName);
 * ```
 */
public open class AppSyncRdsDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncRdsDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncRdsDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncRdsDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncRdsDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncRdsDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncRdsDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncRdsDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * The name of the database to use within the cluster.
     *
     * Default: - None
     *
     * @param databaseName The name of the database to use within the cluster. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The secret containing the credentials for the database.
     *
     * @param secretStore The secret containing the credentials for the database. 
     */
    public fun secretStore(secretStore: ISecret)

    /**
     * The serverless cluster to call to interact with this data source.
     *
     * @param serverlessCluster The serverless cluster to call to interact with this data source. 
     */
    public fun serverlessCluster(serverlessCluster: IServerlessCluster)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncRdsDataSource.Builder =
        software.amazon.awscdk.services.appsync.AppSyncRdsDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The name of the database to use within the cluster.
     *
     * Default: - None
     *
     * @param databaseName The name of the database to use within the cluster. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The secret containing the credentials for the database.
     *
     * @param secretStore The secret containing the credentials for the database. 
     */
    override fun secretStore(secretStore: ISecret) {
      cdkBuilder.secretStore(secretStore.let(ISecret.Companion::unwrap))
    }

    /**
     * The serverless cluster to call to interact with this data source.
     *
     * @param serverlessCluster The serverless cluster to call to interact with this data source. 
     */
    override fun serverlessCluster(serverlessCluster: IServerlessCluster) {
      cdkBuilder.serverlessCluster(serverlessCluster.let(IServerlessCluster.Companion::unwrap))
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncRdsDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncRdsDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncRdsDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncRdsDataSource):
        AppSyncRdsDataSource = AppSyncRdsDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncRdsDataSource):
        software.amazon.awscdk.services.appsync.AppSyncRdsDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncRdsDataSource
  }
}
