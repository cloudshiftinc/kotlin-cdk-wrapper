@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

@CdkDslMarker
public class ElbHealthCheckOptionsDsl {
  private val cdkBuilder: ElbHealthCheckOptions.Builder = ElbHealthCheckOptions.builder()

  /**
   * @param grace Specified the time Auto Scaling waits before checking the health status of an EC2
   * instance that has come into service. 
   * This option is required for ELB health checks.
   */
  public fun grace(grace: Duration) {
    cdkBuilder.grace(grace)
  }

  public fun build(): ElbHealthCheckOptions = cdkBuilder.build()
}
