@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

@CdkDslMarker
public class RdsDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: RdsDataSource.Builder = RdsDataSource.Builder.create(scope, id)

  /**
   * The API to attach this data source to.
   *
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * The name of the database to use within the cluster.
   *
   * Default: - None
   *
   * @param databaseName The name of the database to use within the cluster. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * the description of the data source.
   *
   * Default: - None
   *
   * @param description the description of the data source. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the data source.
   *
   * Default: - id of data source
   *
   * @param name The name of the data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The secret containing the credentials for the database.
   *
   * @param secretStore The secret containing the credentials for the database. 
   */
  public fun secretStore(secretStore: ISecret) {
    cdkBuilder.secretStore(secretStore)
  }

  /**
   * The serverless cluster to call to interact with this data source.
   *
   * @param serverlessCluster The serverless cluster to call to interact with this data source. 
   */
  public fun serverlessCluster(serverlessCluster: IServerlessCluster) {
    cdkBuilder.serverlessCluster(serverlessCluster)
  }

  /**
   * The IAM service role to be assumed by AppSync to interact with the data source.
   *
   * Default: -  Create a new role
   *
   * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
   * source. 
   */
  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): RdsDataSource = cdkBuilder.build()
}
