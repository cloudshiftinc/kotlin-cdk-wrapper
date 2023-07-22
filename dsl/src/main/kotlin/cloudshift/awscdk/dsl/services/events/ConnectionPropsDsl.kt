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

  /**
   * @param authorization The authorization type for the connection. 
   */
  public fun authorization(authorization: Authorization) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * @param bodyParameters Additional string parameters to add to the invocation bodies.
   */
  public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
    cdkBuilder.bodyParameters(bodyParameters)
  }

  /**
   * @param connectionName The name of the connection.
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param description The name of the connection.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param headerParameters Additional string parameters to add to the invocation headers.
   */
  public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  /**
   * @param queryStringParameters Additional string parameters to add to the invocation query
   * strings.
   */
  public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): ConnectionProps = cdkBuilder.build()
}
