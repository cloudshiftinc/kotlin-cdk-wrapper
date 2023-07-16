@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions

@CdkDslMarker
public class Ec2HealthCheckOptionsDsl {
  private val cdkBuilder: Ec2HealthCheckOptions.Builder = Ec2HealthCheckOptions.builder()

  public fun grace(grace: Duration) {
    cdkBuilder.grace(grace)
  }

  public fun build(): Ec2HealthCheckOptions = cdkBuilder.build()
}
