@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps

@CdkDslMarker
public class JsonWithStandardFieldPropsDsl {
  private val cdkBuilder: JsonWithStandardFieldProps.Builder = JsonWithStandardFieldProps.builder()

  public fun caller(caller: Boolean) {
    cdkBuilder.caller(caller)
  }

  public fun httpMethod(httpMethod: Boolean) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun ip(ip: Boolean) {
    cdkBuilder.ip(ip)
  }

  public fun protocol(protocol: Boolean) {
    cdkBuilder.protocol(protocol)
  }

  public fun requestTime(requestTime: Boolean) {
    cdkBuilder.requestTime(requestTime)
  }

  public fun resourcePath(resourcePath: Boolean) {
    cdkBuilder.resourcePath(resourcePath)
  }

  public fun responseLength(responseLength: Boolean) {
    cdkBuilder.responseLength(responseLength)
  }

  public fun status(status: Boolean) {
    cdkBuilder.status(status)
  }

  public fun user(user: Boolean) {
    cdkBuilder.user(user)
  }

  public fun build(): JsonWithStandardFieldProps = cdkBuilder.build()
}
