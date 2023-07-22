@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class DynamoDbDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DynamoDbDataSource.Builder = DynamoDbDataSource.Builder.create(scope, id)

  /**
   * The API to attach this data source to.
   *
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
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
   * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
   *
   * Default: false
   *
   * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions to
   * the DynamoDB table. 
   */
  public fun readOnlyAccess(readOnlyAccess: Boolean) {
    cdkBuilder.readOnlyAccess(readOnlyAccess)
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

  /**
   * The DynamoDB table backing this data source.
   *
   * @param table The DynamoDB table backing this data source. 
   */
  public fun table(table: ITable) {
    cdkBuilder.table(table)
  }

  /**
   * use credentials of caller to access DynamoDB.
   *
   * Default: false
   *
   * @param useCallerCredentials use credentials of caller to access DynamoDB. 
   */
  public fun useCallerCredentials(useCallerCredentials: Boolean) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  public fun build(): DynamoDbDataSource = cdkBuilder.build()
}
