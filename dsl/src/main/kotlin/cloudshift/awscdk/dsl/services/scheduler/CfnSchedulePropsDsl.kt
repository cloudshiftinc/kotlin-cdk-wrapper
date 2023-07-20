@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleProps

@CdkDslMarker
public class CfnSchedulePropsDsl {
  private val cdkBuilder: CfnScheduleProps.Builder = CfnScheduleProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
    cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
  }

  public fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty) {
    cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
  }

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
    cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
  }

  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnSchedule.TargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnScheduleProps = cdkBuilder.build()
}
