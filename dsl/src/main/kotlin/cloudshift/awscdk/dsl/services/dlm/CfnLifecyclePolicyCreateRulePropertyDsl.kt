@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyCreateRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.CreateRuleProperty.Builder =
      CfnLifecyclePolicy.CreateRuleProperty.builder()

  private val _times: MutableList<String> = mutableListOf()

  /**
   * @param cronExpression The schedule, as a Cron expression.
   * The schedule interval must be between 1 hour and 1 year. For more information, see [Cron
   * expressions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
   * in the *Amazon CloudWatch User Guide* .
   */
  public fun cronExpression(cronExpression: String) {
    cdkBuilder.cronExpression(cronExpression)
  }

  /**
   * @param interval The interval between snapshots.
   * The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param intervalUnit The interval unit.
   */
  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  /**
   * @param location *[Snapshot policies only]* Specifies the destination for snapshots created by
   * the policy.
   * To create snapshots in the same Region as the source resource, specify `CLOUD` . To create
   * snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL` . If you omit this
   * parameter, `CLOUD` is used by default.
   *
   * If the policy targets resources in an AWS Region , then you must create snapshots in the same
   * Region as the source resource. If the policy targets resources on an Outpost, then you can create
   * snapshots on the same Outpost as the source resource, or in the Region of that Outpost.
   */
  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  /**
   * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
   * The operation occurs within a one-hour window following the specified time. If you do not
   * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
   */
  public fun times(vararg times: String) {
    _times.addAll(listOf(*times))
  }

  /**
   * @param times The time, in UTC, to start the operation. The supported format is hh:mm.
   * The operation occurs within a one-hour window following the specified time. If you do not
   * specify a time, Amazon Data Lifecycle Manager selects a time within the next 24 hours.
   */
  public fun times(times: Collection<String>) {
    _times.addAll(times)
  }

  public fun build(): CfnLifecyclePolicy.CreateRuleProperty {
    if(_times.isNotEmpty()) cdkBuilder.times(_times)
    return cdkBuilder.build()
  }
}
