@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainWindowStartTimePropertyDsl {
  private val cdkBuilder: CfnDomain.WindowStartTimeProperty.Builder =
      CfnDomain.WindowStartTimeProperty.builder()

  /**
   * @param hours The start hour of the window in Coordinated Universal Time (UTC), using 24-hour
   * time. 
   * For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value is 23.
   */
  public fun hours(hours: Number) {
    cdkBuilder.hours(hours)
  }

  /**
   * @param minutes The start minute of the window, in UTC. 
   * The minimum value is 0 and the maximum value is 59.
   */
  public fun minutes(minutes: Number) {
    cdkBuilder.minutes(minutes)
  }

  public fun build(): CfnDomain.WindowStartTimeProperty = cdkBuilder.build()
}
