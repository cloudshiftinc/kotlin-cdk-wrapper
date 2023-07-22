@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.AuroraCapacityUnit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

@CdkDslMarker
public class ServerlessScalingOptionsDsl {
  private val cdkBuilder: ServerlessScalingOptions.Builder = ServerlessScalingOptions.builder()

  /**
   * @param autoPause The time before an Aurora Serverless database cluster is paused.
   * A database cluster can be paused only when it is idle (it has no connections).
   * Auto pause time must be between 5 minutes and 1 day.
   *
   * If a DB cluster is paused for more than seven days, the DB cluster might be
   * backed up with a snapshot. In this case, the DB cluster is restored when there
   * is a request to connect to it.
   *
   * Set to 0 to disable
   */
  public fun autoPause(autoPause: Duration) {
    cdkBuilder.autoPause(autoPause)
  }

  /**
   * @param maxCapacity The maximum capacity for an Aurora Serverless database cluster.
   */
  public fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum capacity for an Aurora Serverless database cluster.
   */
  public fun minCapacity(minCapacity: AuroraCapacityUnit) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): ServerlessScalingOptions = cdkBuilder.build()
}
