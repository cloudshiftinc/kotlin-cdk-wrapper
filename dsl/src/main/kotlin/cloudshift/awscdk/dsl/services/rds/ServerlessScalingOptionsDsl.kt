@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.AuroraCapacityUnit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

@CdkDslMarker
public class ServerlessScalingOptionsDsl {
  private val cdkBuilder: ServerlessScalingOptions.Builder = ServerlessScalingOptions.builder()

  public fun autoPause(autoPause: Duration) {
    cdkBuilder.autoPause(autoPause)
  }

  public fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: AuroraCapacityUnit) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): ServerlessScalingOptions = cdkBuilder.build()
}
