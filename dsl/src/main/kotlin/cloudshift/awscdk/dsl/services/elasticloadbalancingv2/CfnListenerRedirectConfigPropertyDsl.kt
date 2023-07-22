@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

@CdkDslMarker
public class CfnListenerRedirectConfigPropertyDsl {
  private val cdkBuilder: CfnListener.RedirectConfigProperty.Builder =
      CfnListener.RedirectConfigProperty.builder()

  /**
   * @param host The hostname.
   * This component is not percent-encoded. The hostname can contain #{host}.
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param path The absolute path, starting with the leading "/".
   * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param port The port.
   * You can specify a value from 1 to 65535 or #{port}.
   */
  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol.
   * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and
   * HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param query The query parameters, URL-encoded when necessary, but not percent-encoded.
   * Do not include the leading "?", as it is automatically added. You can specify any of the
   * reserved keywords.
   */
  public fun query(query: String) {
    cdkBuilder.query(query)
  }

  /**
   * @param statusCode The HTTP redirect code. 
   * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnListener.RedirectConfigProperty = cdkBuilder.build()
}
