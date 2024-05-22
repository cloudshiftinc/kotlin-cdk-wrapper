@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.rds.IDatabaseCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit

/**
 * Properties for an AppSync RDS datasource Aurora Serverless V2.
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
 * DatabaseCluster databaseCluster;
 * GraphqlApi graphqlApi;
 * Role role;
 * Secret secret;
 * RdsDataSourcePropsV2 rdsDataSourcePropsV2 = RdsDataSourcePropsV2.builder()
 * .api(graphqlApi)
 * .secretStore(secret)
 * .serverlessCluster(databaseCluster)
 * // the properties below are optional
 * .databaseName("databaseName")
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface RdsDataSourcePropsV2 : BackedDataSourceProps {
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
  public fun serverlessCluster(): IDatabaseCluster

  /**
   * A builder for [RdsDataSourcePropsV2]
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
    public fun serverlessCluster(serverlessCluster: IDatabaseCluster)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2.Builder =
        software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
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
      cdkBuilder.secretStore(secretStore.let(ISecret.Companion::unwrap))
    }

    /**
     * @param serverlessCluster The serverless cluster to call to interact with this data source. 
     */
    override fun serverlessCluster(serverlessCluster: IDatabaseCluster) {
      cdkBuilder.serverlessCluster(serverlessCluster.let(IDatabaseCluster.Companion::unwrap))
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2 =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2,
  ) : CdkObject(cdkObject), RdsDataSourcePropsV2 {
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
    override fun serverlessCluster(): IDatabaseCluster =
        unwrap(this).getServerlessCluster().let(IDatabaseCluster::wrap)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RdsDataSourcePropsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2):
        RdsDataSourcePropsV2 = CdkObjectWrappers.wrap(cdkObject) as? RdsDataSourcePropsV2 ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RdsDataSourcePropsV2):
        software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2 = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.RdsDataSourcePropsV2
  }
}
