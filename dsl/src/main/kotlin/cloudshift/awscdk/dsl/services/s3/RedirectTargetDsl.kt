@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.RedirectProtocol
import software.amazon.awscdk.services.s3.RedirectTarget

@CdkDslMarker
public class RedirectTargetDsl {
  private val cdkBuilder: RedirectTarget.Builder = RedirectTarget.builder()

  /**
   * @param hostName Name of the host where requests are redirected. 
   */
  public fun hostName(hostName: String) {
    cdkBuilder.hostName(hostName)
  }

  /**
   * @param protocol Protocol to use when redirecting requests.
   */
  public fun protocol(protocol: RedirectProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): RedirectTarget = cdkBuilder.build()
}
