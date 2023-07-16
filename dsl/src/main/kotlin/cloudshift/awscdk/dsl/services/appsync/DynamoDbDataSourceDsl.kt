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

  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun readOnlyAccess(readOnlyAccess: Boolean) {
    cdkBuilder.readOnlyAccess(readOnlyAccess)
  }

  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun table(table: ITable) {
    cdkBuilder.table(table)
  }

  public fun useCallerCredentials(useCallerCredentials: Boolean) {
    cdkBuilder.useCallerCredentials(useCallerCredentials)
  }

  public fun build(): DynamoDbDataSource = cdkBuilder.build()
}
