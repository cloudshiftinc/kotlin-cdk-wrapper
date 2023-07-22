@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps

@CdkDslMarker
public class CfnMaintenanceWindowPropsDsl {
  private val cdkBuilder: CfnMaintenanceWindowProps.Builder = CfnMaintenanceWindowProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param allowUnassociatedTargets Enables a maintenance window task to run on managed instances,
   * even if you have not registered those instances as targets. 
   * If enabled, then you must specify the unregistered instances (by instance ID) when you register
   * a task with the maintenance window.
   */
  public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  /**
   * @param allowUnassociatedTargets Enables a maintenance window task to run on managed instances,
   * even if you have not registered those instances as targets. 
   * If enabled, then you must specify the unregistered instances (by instance ID) when you register
   * a task with the maintenance window.
   */
  public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  /**
   * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
   * Manager stops scheduling new tasks for execution. 
   */
  public fun cutoff(cutoff: Number) {
    cdkBuilder.cutoff(cutoff)
  }

  /**
   * @param description A description of the maintenance window.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param duration The duration of the maintenance window in hours. 
   */
  public fun duration(duration: Number) {
    cdkBuilder.duration(duration)
  }

  /**
   * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance window
   * is scheduled to become inactive.
   */
  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  /**
   * @param name The name of the maintenance window. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param schedule The schedule of the maintenance window in the form of a cron or rate
   * expression. 
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param scheduleOffset The number of days to wait to run a maintenance window after the
   * scheduled cron expression date and time.
   */
  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  /**
   * @param scheduleTimezone The time zone that the scheduled maintenance window executions are
   * based on, in Internet Assigned Numbers Authority (IANA) format.
   */
  public fun scheduleTimezone(scheduleTimezone: String) {
    cdkBuilder.scheduleTimezone(scheduleTimezone)
  }

  /**
   * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
   * window is scheduled to become active.
   * StartDate allows you to delay activation of the Maintenance Window until the specified future
   * date.
   */
  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  /**
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs).
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a maintenance window to identify the type of tasks
   * it will run, the types of targets, and the environment it will run in.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs).
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a maintenance window to identify the type of tasks
   * it will run, the types of targets, and the environment it will run in.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMaintenanceWindowProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
