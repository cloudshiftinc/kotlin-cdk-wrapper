@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.origins.RestApiOriginProps

@CdkDslMarker
public class RestApiOriginPropsDsl {
  private val cdkBuilder: RestApiOriginProps.Builder = RestApiOriginProps.builder()

  public fun connectionAttempts(connectionAttempts: Number) {
    cdkBuilder.connectionAttempts(connectionAttempts)
  }

  public fun connectionTimeout(connectionTimeout: Duration) {
    cdkBuilder.connectionTimeout(connectionTimeout)
  }

  public fun customHeaders(customHeaders: Map<String, String>) {
    cdkBuilder.customHeaders(customHeaders)
  }

  public fun keepaliveTimeout(keepaliveTimeout: Duration) {
    cdkBuilder.keepaliveTimeout(keepaliveTimeout)
  }

  public fun originId(originId: String) {
    cdkBuilder.originId(originId)
  }

  public fun originPath(originPath: String) {
    cdkBuilder.originPath(originPath)
  }

  public fun originShieldEnabled(originShieldEnabled: Boolean) {
    cdkBuilder.originShieldEnabled(originShieldEnabled)
  }

  public fun originShieldRegion(originShieldRegion: String) {
    cdkBuilder.originShieldRegion(originShieldRegion)
  }

  public fun readTimeout(readTimeout: Duration) {
    cdkBuilder.readTimeout(readTimeout)
  }

  public fun build(): RestApiOriginProps = cdkBuilder.build()
}
