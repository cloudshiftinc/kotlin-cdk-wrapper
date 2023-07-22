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
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.constructs.Construct

/**
 * The `AWS::SSM::MaintenanceWindow` resource represents general information about a maintenance
 * window for AWS Systems Manager .
 *
 * Maintenance Windows let you define a schedule for when to perform potentially disruptive actions
 * on your instances, such as patching an operating system (OS), updating drivers, or installing
 * software. Each maintenance window has a schedule, a duration, a set of registered targets, and a set
 * of registered tasks.
 *
 * For more information, see [Systems Manager Maintenance
 * Windows](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-maintenance.html)
 * in the *AWS Systems Manager User Guide* and
 * [CreateMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateMaintenanceWindow.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnMaintenanceWindow cfnMaintenanceWindow = CfnMaintenanceWindow.Builder.create(this,
 * "MyCfnMaintenanceWindow")
 * .allowUnassociatedTargets(false)
 * .cutoff(123)
 * .duration(123)
 * .name("name")
 * .schedule("schedule")
 * // the properties below are optional
 * .description("description")
 * .endDate("endDate")
 * .scheduleOffset(123)
 * .scheduleTimezone("scheduleTimezone")
 * .startDate("startDate")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMaintenanceWindow.Builder = CfnMaintenanceWindow.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   *
   * If enabled, then you must specify the unregistered instances (by instance ID) when you register
   * a task with the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
   * @param allowUnassociatedTargets Enables a maintenance window task to run on managed instances,
   * even if you have not registered those instances as targets. 
   */
  public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   *
   * If enabled, then you must specify the unregistered instances (by instance ID) when you register
   * a task with the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
   * @param allowUnassociatedTargets Enables a maintenance window task to run on managed instances,
   * even if you have not registered those instances as targets. 
   */
  public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
    cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
  }

  /**
   * The number of hours before the end of the maintenance window that AWS Systems Manager stops
   * scheduling new tasks for execution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-cutoff)
   * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
   * Manager stops scheduling new tasks for execution. 
   */
  public fun cutoff(cutoff: Number) {
    cdkBuilder.cutoff(cutoff)
  }

  /**
   * A description of the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-description)
   * @param description A description of the maintenance window. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The duration of the maintenance window in hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-duration)
   * @param duration The duration of the maintenance window in hours. 
   */
  public fun duration(duration: Number) {
    cdkBuilder.duration(duration)
  }

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become inactive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-enddate)
   * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance window
   * is scheduled to become inactive. 
   */
  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  /**
   * The name of the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-name)
   * @param name The name of the maintenance window. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The schedule of the maintenance window in the form of a cron or rate expression.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-schedule)
   * @param schedule The schedule of the maintenance window in the form of a cron or rate
   * expression. 
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The number of days to wait to run a maintenance window after the scheduled cron expression date
   * and time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduleoffset)
   * @param scheduleOffset The number of days to wait to run a maintenance window after the
   * scheduled cron expression date and time. 
   */
  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  /**
   * The time zone that the scheduled maintenance window executions are based on, in Internet
   * Assigned Numbers Authority (IANA) format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduletimezone)
   * @param scheduleTimezone The time zone that the scheduled maintenance window executions are
   * based on, in Internet Assigned Numbers Authority (IANA) format. 
   */
  public fun scheduleTimezone(scheduleTimezone: String) {
    cdkBuilder.scheduleTimezone(scheduleTimezone)
  }

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become active.
   *
   * StartDate allows you to delay activation of the Maintenance Window until the specified future
   * date.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-startdate)
   * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
   * window is scheduled to become active. 
   */
  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a maintenance window to identify the type of tasks
   * it will run, the types of targets, and the environment it will run in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs). 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a maintenance window to identify the type of tasks
   * it will run, the types of targets, and the environment it will run in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
   * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set of
   * tags (key-value pairs). 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMaintenanceWindow {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
