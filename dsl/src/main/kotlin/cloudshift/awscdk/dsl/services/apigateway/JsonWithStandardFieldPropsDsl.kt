@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps

@CdkDslMarker
public class JsonWithStandardFieldPropsDsl {
  private val cdkBuilder: JsonWithStandardFieldProps.Builder = JsonWithStandardFieldProps.builder()

  /**
   * @param caller If this flag is enabled, the principal identifier of the caller will be output to
   * the log. 
   */
  public fun caller(caller: Boolean) {
    cdkBuilder.caller(caller)
  }

  /**
   * @param httpMethod If this flag is enabled, the http method will be output to the log. 
   */
  public fun httpMethod(httpMethod: Boolean) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param ip If this flag is enabled, the source IP of request will be output to the log. 
   */
  public fun ip(ip: Boolean) {
    cdkBuilder.ip(ip)
  }

  /**
   * @param protocol If this flag is enabled, the request protocol will be output to the log. 
   */
  public fun protocol(protocol: Boolean) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param requestTime If this flag is enabled, the CLF-formatted request
   * time((dd/MMM/yyyy:HH:mm:ss +-hhmm) will be output to the log. 
   */
  public fun requestTime(requestTime: Boolean) {
    cdkBuilder.requestTime(requestTime)
  }

  /**
   * @param resourcePath If this flag is enabled, the path to your resource will be output to the
   * log. 
   */
  public fun resourcePath(resourcePath: Boolean) {
    cdkBuilder.resourcePath(resourcePath)
  }

  /**
   * @param responseLength If this flag is enabled, the response payload length will be output to
   * the log. 
   */
  public fun responseLength(responseLength: Boolean) {
    cdkBuilder.responseLength(responseLength)
  }

  /**
   * @param status If this flag is enabled, the method response status will be output to the log. 
   */
  public fun status(status: Boolean) {
    cdkBuilder.status(status)
  }

  /**
   * @param user If this flag is enabled, the principal identifier of the user will be output to the
   * log. 
   */
  public fun user(user: Boolean) {
    cdkBuilder.user(user)
  }

  public fun build(): JsonWithStandardFieldProps = cdkBuilder.build()
}
