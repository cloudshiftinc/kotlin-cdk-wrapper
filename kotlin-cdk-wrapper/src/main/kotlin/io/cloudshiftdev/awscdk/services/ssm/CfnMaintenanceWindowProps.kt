@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMaintenanceWindow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * CfnMaintenanceWindowProps cfnMaintenanceWindowProps = CfnMaintenanceWindowProps.builder()
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
public interface CfnMaintenanceWindowProps {
  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   *
   * If enabled, then you must specify the unregistered instances (by instance ID) when you register
   * a task with the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
   */
  public fun allowUnassociatedTargets(): Any

  /**
   * The number of hours before the end of the maintenance window that AWS Systems Manager stops
   * scheduling new tasks for execution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-cutoff)
   */
  public fun cutoff(): Number

  /**
   * A description of the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The duration of the maintenance window in hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-duration)
   */
  public fun duration(): Number

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become inactive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-enddate)
   */
  public fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * The name of the maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-name)
   */
  public fun name(): String

  /**
   * The schedule of the maintenance window in the form of a cron or rate expression.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-schedule)
   */
  public fun schedule(): String

  /**
   * The number of days to wait to run a maintenance window after the scheduled cron expression date
   * and time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduleoffset)
   */
  public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  /**
   * The time zone that the scheduled maintenance window executions are based on, in Internet
   * Assigned Numbers Authority (IANA) format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduletimezone)
   */
  public fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become active.
   *
   * `StartDate` allows you to delay activation of the maintenance window until the specified future
   * date.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-startdate)
   */
  public fun startDate(): String? = unwrap(this).getStartDate()

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For example, you might want to tag a maintenance window to identify the type of tasks
   * it will run, the types of targets, and the environment it will run in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMaintenanceWindowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     */
    public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean)

    /**
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     */
    public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable)

    /**
     * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
     * Manager stops scheduling new tasks for execution. 
     */
    public fun cutoff(cutoff: Number)

    /**
     * @param description A description of the maintenance window.
     */
    public fun description(description: String)

    /**
     * @param duration The duration of the maintenance window in hours. 
     */
    public fun duration(duration: Number)

    /**
     * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     */
    public fun endDate(endDate: String)

    /**
     * @param name The name of the maintenance window. 
     */
    public fun name(name: String)

    /**
     * @param schedule The schedule of the maintenance window in the form of a cron or rate
     * expression. 
     */
    public fun schedule(schedule: String)

    /**
     * @param scheduleOffset The number of days to wait to run a maintenance window after the
     * scheduled cron expression date and time.
     */
    public fun scheduleOffset(scheduleOffset: Number)

    /**
     * @param scheduleTimezone The time zone that the scheduled maintenance window executions are
     * based on, in Internet Assigned Numbers Authority (IANA) format.
     */
    public fun scheduleTimezone(scheduleTimezone: String)

    /**
     * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * `StartDate` allows you to delay activation of the maintenance window until the specified
     * future date.
     */
    public fun startDate(startDate: String)

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps.builder()

    /**
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     */
    override fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
    }

    /**
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     */
    override fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets.let(IResolvable::unwrap))
    }

    /**
     * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
     * Manager stops scheduling new tasks for execution. 
     */
    override fun cutoff(cutoff: Number) {
      cdkBuilder.cutoff(cutoff)
    }

    /**
     * @param description A description of the maintenance window.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param duration The duration of the maintenance window in hours. 
     */
    override fun duration(duration: Number) {
      cdkBuilder.duration(duration)
    }

    /**
     * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive.
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * @param name The name of the maintenance window. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schedule The schedule of the maintenance window in the form of a cron or rate
     * expression. 
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * @param scheduleOffset The number of days to wait to run a maintenance window after the
     * scheduled cron expression date and time.
     */
    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    /**
     * @param scheduleTimezone The time zone that the scheduled maintenance window executions are
     * based on, in Internet Assigned Numbers Authority (IANA) format.
     */
    override fun scheduleTimezone(scheduleTimezone: String) {
      cdkBuilder.scheduleTimezone(scheduleTimezone)
    }

    /**
     * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active.
     * `StartDate` allows you to delay activation of the maintenance window until the specified
     * future date.
     */
    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs).
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowProps {
    /**
     * Enables a maintenance window task to run on managed instances, even if you have not
     * registered those instances as targets.
     *
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
     */
    override fun allowUnassociatedTargets(): Any = unwrap(this).getAllowUnassociatedTargets()

    /**
     * The number of hours before the end of the maintenance window that AWS Systems Manager stops
     * scheduling new tasks for execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-cutoff)
     */
    override fun cutoff(): Number = unwrap(this).getCutoff()

    /**
     * A description of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The duration of the maintenance window in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-duration)
     */
    override fun duration(): Number = unwrap(this).getDuration()

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-enddate)
     */
    override fun endDate(): String? = unwrap(this).getEndDate()

    /**
     * The name of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The schedule of the maintenance window in the form of a cron or rate expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-schedule)
     */
    override fun schedule(): String = unwrap(this).getSchedule()

    /**
     * The number of days to wait to run a maintenance window after the scheduled cron expression
     * date and time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduleoffset)
     */
    override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    /**
     * The time zone that the scheduled maintenance window executions are based on, in Internet
     * Assigned Numbers Authority (IANA) format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduletimezone)
     */
    override fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become active.
     *
     * `StartDate` allows you to delay activation of the maintenance window until the specified
     * future date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-startdate)
     */
    override fun startDate(): String? = unwrap(this).getStartDate()

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps):
        CfnMaintenanceWindowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
  }
}
