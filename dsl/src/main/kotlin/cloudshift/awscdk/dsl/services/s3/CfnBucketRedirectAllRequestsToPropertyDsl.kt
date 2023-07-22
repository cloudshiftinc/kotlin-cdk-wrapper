@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketRedirectAllRequestsToPropertyDsl {
  private val cdkBuilder: CfnBucket.RedirectAllRequestsToProperty.Builder =
      CfnBucket.RedirectAllRequestsToProperty.builder()

  /**
   * @param hostName Name of the host where requests are redirected. 
   */
  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  /**
   * @param protocol Protocol to use when redirecting requests.
   * The default is the protocol that is used in the original request.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnBucket.RedirectAllRequestsToProperty = cdkBuilder.build()
}
