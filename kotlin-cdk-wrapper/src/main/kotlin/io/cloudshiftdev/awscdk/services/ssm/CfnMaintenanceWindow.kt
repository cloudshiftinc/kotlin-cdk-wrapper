@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSM::MaintenanceWindow` resource represents general information about a maintenance
 * window for AWS Systems Manager .
 *
 * Maintenance windows let you define a schedule for when to perform potentially disruptive actions
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
 * import io.cloudshiftdev.awscdk.services.ssm.*;
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
public open class CfnMaintenanceWindow(
  cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMaintenanceWindowProps,
  ) :
      this(software.amazon.awscdk.services.ssm.CfnMaintenanceWindow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMaintenanceWindowProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMaintenanceWindowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMaintenanceWindowProps(props)
  )

  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   */
  public open fun allowUnassociatedTargets(): Any = unwrap(this).getAllowUnassociatedTargets()

  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   */
  public open fun allowUnassociatedTargets(`value`: Boolean) {
    unwrap(this).setAllowUnassociatedTargets(`value`)
  }

  /**
   * Enables a maintenance window task to run on managed instances, even if you have not registered
   * those instances as targets.
   */
  public open fun allowUnassociatedTargets(`value`: IResolvable) {
    unwrap(this).setAllowUnassociatedTargets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The number of hours before the end of the maintenance window that AWS Systems Manager stops
   * scheduling new tasks for execution.
   */
  public open fun cutoff(): Number = unwrap(this).getCutoff()

  /**
   * The number of hours before the end of the maintenance window that AWS Systems Manager stops
   * scheduling new tasks for execution.
   */
  public open fun cutoff(`value`: Number) {
    unwrap(this).setCutoff(`value`)
  }

  /**
   * A description of the maintenance window.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the maintenance window.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The duration of the maintenance window in hours.
   */
  public open fun duration(): Number = unwrap(this).getDuration()

  /**
   * The duration of the maintenance window in hours.
   */
  public open fun duration(`value`: Number) {
    unwrap(this).setDuration(`value`)
  }

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become inactive.
   */
  public open fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become inactive.
   */
  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the maintenance window.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the maintenance window.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schedule of the maintenance window in the form of a cron or rate expression.
   */
  public open fun schedule(): String = unwrap(this).getSchedule()

  /**
   * The schedule of the maintenance window in the form of a cron or rate expression.
   */
  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  /**
   * The number of days to wait to run a maintenance window after the scheduled cron expression date
   * and time.
   */
  public open fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  /**
   * The number of days to wait to run a maintenance window after the scheduled cron expression date
   * and time.
   */
  public open fun scheduleOffset(`value`: Number) {
    unwrap(this).setScheduleOffset(`value`)
  }

  /**
   * The time zone that the scheduled maintenance window executions are based on, in Internet
   * Assigned Numbers Authority (IANA) format.
   */
  public open fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

  /**
   * The time zone that the scheduled maintenance window executions are based on, in Internet
   * Assigned Numbers Authority (IANA) format.
   */
  public open fun scheduleTimezone(`value`: String) {
    unwrap(this).setScheduleTimezone(`value`)
  }

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become active.
   */
  public open fun startDate(): String? = unwrap(this).getStartDate()

  /**
   * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to
   * become active.
   */
  public open fun startDate(`value`: String) {
    unwrap(this).setStartDate(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
   * (key-value pairs).
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnMaintenanceWindow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Enables a maintenance window task to run on managed instances, even if you have not
     * registered those instances as targets.
     *
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     */
    public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean)

    /**
     * Enables a maintenance window task to run on managed instances, even if you have not
     * registered those instances as targets.
     *
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     */
    public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable)

    /**
     * The number of hours before the end of the maintenance window that AWS Systems Manager stops
     * scheduling new tasks for execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-cutoff)
     * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
     * Manager stops scheduling new tasks for execution. 
     */
    public fun cutoff(cutoff: Number)

    /**
     * A description of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-description)
     * @param description A description of the maintenance window. 
     */
    public fun description(description: String)

    /**
     * The duration of the maintenance window in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-duration)
     * @param duration The duration of the maintenance window in hours. 
     */
    public fun duration(duration: Number)

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-enddate)
     * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. 
     */
    public fun endDate(endDate: String)

    /**
     * The name of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-name)
     * @param name The name of the maintenance window. 
     */
    public fun name(name: String)

    /**
     * The schedule of the maintenance window in the form of a cron or rate expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-schedule)
     * @param schedule The schedule of the maintenance window in the form of a cron or rate
     * expression. 
     */
    public fun schedule(schedule: String)

    /**
     * The number of days to wait to run a maintenance window after the scheduled cron expression
     * date and time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduleoffset)
     * @param scheduleOffset The number of days to wait to run a maintenance window after the
     * scheduled cron expression date and time. 
     */
    public fun scheduleOffset(scheduleOffset: Number)

    /**
     * The time zone that the scheduled maintenance window executions are based on, in Internet
     * Assigned Numbers Authority (IANA) format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduletimezone)
     * @param scheduleTimezone The time zone that the scheduled maintenance window executions are
     * based on, in Internet Assigned Numbers Authority (IANA) format. 
     */
    public fun scheduleTimezone(scheduleTimezone: String)

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become active.
     *
     * `StartDate` allows you to delay activation of the maintenance window until the specified
     * future date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-startdate)
     * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. 
     */
    public fun startDate(startDate: String)

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder.create(scope, id)

    /**
     * Enables a maintenance window task to run on managed instances, even if you have not
     * registered those instances as targets.
     *
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     */
    override fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
    }

    /**
     * Enables a maintenance window task to run on managed instances, even if you have not
     * registered those instances as targets.
     *
     * If enabled, then you must specify the unregistered instances (by instance ID) when you
     * register a task with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-allowunassociatedtargets)
     * @param allowUnassociatedTargets Enables a maintenance window task to run on managed
     * instances, even if you have not registered those instances as targets. 
     */
    override fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets.let(IResolvable.Companion::unwrap))
    }

    /**
     * The number of hours before the end of the maintenance window that AWS Systems Manager stops
     * scheduling new tasks for execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-cutoff)
     * @param cutoff The number of hours before the end of the maintenance window that AWS Systems
     * Manager stops scheduling new tasks for execution. 
     */
    override fun cutoff(cutoff: Number) {
      cdkBuilder.cutoff(cutoff)
    }

    /**
     * A description of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-description)
     * @param description A description of the maintenance window. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The duration of the maintenance window in hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-duration)
     * @param duration The duration of the maintenance window in hours. 
     */
    override fun duration(duration: Number) {
      cdkBuilder.duration(duration)
    }

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-enddate)
     * @param endDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become inactive. 
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * The name of the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-name)
     * @param name The name of the maintenance window. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schedule of the maintenance window in the form of a cron or rate expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-schedule)
     * @param schedule The schedule of the maintenance window in the form of a cron or rate
     * expression. 
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * The number of days to wait to run a maintenance window after the scheduled cron expression
     * date and time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-scheduleoffset)
     * @param scheduleOffset The number of days to wait to run a maintenance window after the
     * scheduled cron expression date and time. 
     */
    override fun scheduleOffset(scheduleOffset: Number) {
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
    override fun scheduleTimezone(scheduleTimezone: String) {
      cdkBuilder.scheduleTimezone(scheduleTimezone)
    }

    /**
     * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled
     * to become active.
     *
     * `StartDate` allows you to delay activation of the maintenance window until the specified
     * future date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-startdate)
     * @param startDate The date and time, in ISO-8601 Extended format, for when the maintenance
     * window is scheduled to become active. 
     */
    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Optional metadata that you assign to a resource in the form of an arbitrary set of tags
     * (key-value pairs).
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a maintenance window to identify the type of
     * tasks it will run, the types of targets, and the environment it will run in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindow.html#cfn-ssm-maintenancewindow-tags)
     * @param tags Optional metadata that you assign to a resource in the form of an arbitrary set
     * of tags (key-value pairs). 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindow =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow):
        CfnMaintenanceWindow = CfnMaintenanceWindow(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindow):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow = wrapped.cdkObject as
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
  }
}
