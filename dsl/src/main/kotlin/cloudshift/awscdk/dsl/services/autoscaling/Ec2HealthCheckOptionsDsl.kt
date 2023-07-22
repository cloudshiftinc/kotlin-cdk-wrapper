@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions

@CdkDslMarker
public class Ec2HealthCheckOptionsDsl {
  private val cdkBuilder: Ec2HealthCheckOptions.Builder = Ec2HealthCheckOptions.builder()

  /**
   * @param grace Specified the time Auto Scaling waits before checking the health status of an EC2
   * instance that has come into service.
   */
  public fun grace(grace: Duration) {
    cdkBuilder.grace(grace)
  }

  public fun build(): Ec2HealthCheckOptions = cdkBuilder.build()
}
