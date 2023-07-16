@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@CdkDslMarker
public class CfnScalableTargetScheduledActionPropertyDsl {
  private val cdkBuilder: CfnScalableTarget.ScheduledActionProperty.Builder =
      CfnScalableTarget.ScheduledActionProperty.builder()

  public fun endTime(endTime: Instant) {
    cdkBuilder.endTime(endTime)
  }

  public fun endTime(endTime: IResolvable) {
    cdkBuilder.endTime(endTime)
  }

  public fun scalableTargetAction(scalableTargetAction: IResolvable) {
    cdkBuilder.scalableTargetAction(scalableTargetAction)
  }

  public
      fun scalableTargetAction(scalableTargetAction: CfnScalableTarget.ScalableTargetActionProperty) {
    cdkBuilder.scalableTargetAction(scalableTargetAction)
  }

  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun scheduledActionName(scheduledActionName: String) {
    cdkBuilder.scheduledActionName(scheduledActionName)
  }

  public fun startTime(startTime: Instant) {
    cdkBuilder.startTime(startTime)
  }

  public fun startTime(startTime: IResolvable) {
    cdkBuilder.startTime(startTime)
  }

  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnScalableTarget.ScheduledActionProperty = cdkBuilder.build()
}
