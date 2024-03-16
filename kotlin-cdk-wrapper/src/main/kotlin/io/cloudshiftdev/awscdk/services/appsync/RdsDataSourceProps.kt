@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit

/**
 * Properties for an AppSync RDS datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * GraphqlApi graphqlApi;
 * Role role;
 * Secret secret;
 * ServerlessCluster serverlessCluster;
 * RdsDataSourceProps rdsDataSourceProps = RdsDataSourceProps.builder()
 * .api(graphqlApi)
 * .secretStore(secret)
 * .serverlessCluster(serverlessCluster)
 * // the properties below are optional
 * .databaseName("databaseName")
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface RdsDataSourceProps : BackedDataSourceProps {
  /**
   * The name of the database to use within the cluster.
   *
   * Default: - None
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The secret containing the credentials for the database.
   */
  public fun secretStore(): ISecret

  /**
   * The serverless cluster to call to interact with this data source.
   */
  public fun serverlessCluster(): IServerlessCluster

  /**
   * A builder for [RdsDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param databaseName The name of the database to use within the cluster.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)

    /**
     * @param secretStore The secret containing the credentials for the database. 
     */
    public fun secretStore(secretStore: ISecret)

    /**
     * @param serverlessCluster The serverless cluster to call to interact with this data source. 
     */
    public fun serverlessCluster(serverlessCluster: IServerlessCluster)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RdsDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.RdsDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * @param databaseName The name of the database to use within the cluster.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param secretStore The secret containing the credentials for the database. 
     */
    override fun secretStore(secretStore: ISecret) {
      cdkBuilder.secretStore(secretStore.let(ISecret::unwrap))
    }

    /**
     * @param serverlessCluster The serverless cluster to call to interact with this data source. 
     */
    override fun serverlessCluster(serverlessCluster: IServerlessCluster) {
      cdkBuilder.serverlessCluster(serverlessCluster.let(IServerlessCluster::unwrap))
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.RdsDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourceProps,
  ) : CdkObject(cdkObject), RdsDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * The name of the database to use within the cluster.
     *
     * Default: - None
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The secret containing the credentials for the database.
     */
    override fun secretStore(): ISecret = unwrap(this).getSecretStore().let(ISecret::wrap)

    /**
     * The serverless cluster to call to interact with this data source.
     */
    override fun serverlessCluster(): IServerlessCluster =
        unwrap(this).getServerlessCluster().let(IServerlessCluster::wrap)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RdsDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourceProps):
        RdsDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as RdsDataSourceProps

    internal fun unwrap(wrapped: RdsDataSourceProps):
        software.amazon.awscdk.services.appsync.RdsDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.RdsDataSourceProps
  }
}
