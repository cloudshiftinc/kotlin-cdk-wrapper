@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.constructs.Construct

@CdkDslMarker
public class CfnScheduledActionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScheduledAction.Builder = CfnScheduledAction.Builder.create(scope, id)

  public fun autoScalingGroupName(autoScalingGroupName: String) {
    cdkBuilder.autoScalingGroupName(autoScalingGroupName)
  }

  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  public fun endTime(endTime: String) {
    cdkBuilder.endTime(endTime)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun recurrence(recurrence: String) {
    cdkBuilder.recurrence(recurrence)
  }

  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnScheduledAction = cdkBuilder.build()
}
