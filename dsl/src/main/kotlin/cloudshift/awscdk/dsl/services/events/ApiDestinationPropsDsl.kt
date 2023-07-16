@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.amazon.awscdk.services.events.HttpMethod
import software.amazon.awscdk.services.events.IConnection

@CdkDslMarker
public class ApiDestinationPropsDsl {
  private val cdkBuilder: ApiDestinationProps.Builder = ApiDestinationProps.builder()

  public fun apiDestinationName(apiDestinationName: String) {
    cdkBuilder.apiDestinationName(apiDestinationName)
  }

  public fun connection(connection: IConnection) {
    cdkBuilder.connection(connection)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun httpMethod(httpMethod: HttpMethod) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun rateLimitPerSecond(rateLimitPerSecond: Number) {
    cdkBuilder.rateLimitPerSecond(rateLimitPerSecond)
  }

  public fun build(): ApiDestinationProps = cdkBuilder.build()
}
