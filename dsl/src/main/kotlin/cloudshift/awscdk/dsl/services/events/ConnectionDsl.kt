@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.events.Authorization
import software.amazon.awscdk.services.events.Connection
import software.amazon.awscdk.services.events.HttpParameter
import software.constructs.Construct

@CdkDslMarker
public class ConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Connection.Builder = Connection.Builder.create(scope, id)

  public fun authorization(authorization: Authorization) {
    cdkBuilder.authorization(authorization)
  }

  public fun bodyParameters(bodyParameters: Map<String, out HttpParameter>) {
    cdkBuilder.bodyParameters(bodyParameters)
  }

  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun headerParameters(headerParameters: Map<String, out HttpParameter>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun queryStringParameters(queryStringParameters: Map<String, out HttpParameter>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): Connection = cdkBuilder.build()
}
