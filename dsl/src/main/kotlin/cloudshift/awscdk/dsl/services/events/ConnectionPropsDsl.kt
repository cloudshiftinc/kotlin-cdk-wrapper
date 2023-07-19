@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.events.Authorization
import software.amazon.awscdk.services.events.ConnectionProps
import software.amazon.awscdk.services.events.HttpParameter

@CdkDslMarker
public class ConnectionPropsDsl {
  private val cdkBuilder: ConnectionProps.Builder = ConnectionProps.builder()

  public fun authorization(authorization: Authorization) {
    cdkBuilder.authorization(authorization)
  }

  public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
    cdkBuilder.bodyParameters(bodyParameters)
  }

  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): ConnectionProps = cdkBuilder.build()
}
