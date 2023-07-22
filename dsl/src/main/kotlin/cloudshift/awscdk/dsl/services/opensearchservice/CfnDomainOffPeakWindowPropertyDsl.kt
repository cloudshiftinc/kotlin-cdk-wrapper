@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainOffPeakWindowPropertyDsl {
  private val cdkBuilder: CfnDomain.OffPeakWindowProperty.Builder =
      CfnDomain.OffPeakWindowProperty.builder()

  /**
   * @param windowStartTime The desired start time for an off-peak maintenance window.
   */
  public fun windowStartTime(windowStartTime: IResolvable) {
    cdkBuilder.windowStartTime(windowStartTime)
  }

  /**
   * @param windowStartTime The desired start time for an off-peak maintenance window.
   */
  public fun windowStartTime(windowStartTime: CfnDomain.WindowStartTimeProperty) {
    cdkBuilder.windowStartTime(windowStartTime)
  }

  public fun build(): CfnDomain.OffPeakWindowProperty = cdkBuilder.build()
}
