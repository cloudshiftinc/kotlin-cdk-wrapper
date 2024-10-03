@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AutoScaling::ScheduledAction` resource specifies an Amazon EC2 Auto Scaling scheduled
 * action so that the Auto Scaling group can change the number of instances available for your
 * application in response to predictable load changes.
 *
 * When you update a stack with an Auto Scaling group and scheduled action, CloudFormation always
 * sets the min size, max size, and desired capacity properties of your group to the values that are
 * defined in the `AWS::AutoScaling::AutoScalingGroup` section of your template. However, you might not
 * want CloudFormation to do that when you have a scheduled action in effect. You can use an
 * [UpdatePolicy
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
 * to prevent CloudFormation from changing the min size, max size, or desired capacity property values
 * during a stack update unless you modified the individual values in your template. If you have
 * rolling updates enabled, before you can update the Auto Scaling group, you must suspend scheduled
 * actions by specifying an [UpdatePolicy
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
 * for the Auto Scaling group. You can find a sample update policy for rolling updates in [Configure
 * Amazon EC2 Auto Scaling
 * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html)
 * .
 *
 * For more information, see [Scheduled
 * scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html) and [Suspending
 * and resuming scaling
 * processes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnScheduledAction cfnScheduledAction = CfnScheduledAction.Builder.create(this,
 * "MyCfnScheduledAction")
 * .autoScalingGroupName("autoScalingGroupName")
 * // the properties below are optional
 * .desiredCapacity(123)
 * .endTime("endTime")
 * .maxSize(123)
 * .minSize(123)
 * .recurrence("recurrence")
 * .startTime("startTime")
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html)
 */
public open class CfnScheduledAction(
  cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledAction,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScheduledActionProps,
  ) :
      this(software.amazon.awscdk.services.autoscaling.CfnScheduledAction(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnScheduledActionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScheduledActionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnScheduledActionProps(props)
  )

  /**
   * Returns the name of a scheduled action.
   */
  public open fun attrScheduledActionName(): String = unwrap(this).getAttrScheduledActionName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  /**
   * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled
   * action runs and the capacity it attempts to maintain.
   */
  public open fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  /**
   * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled
   * action runs and the capacity it attempts to maintain.
   */
  public open fun desiredCapacity(`value`: Number) {
    unwrap(this).setDesiredCapacity(`value`)
  }

  /**
   * The date and time for the recurring schedule to end, in UTC.
   */
  public open fun endTime(): String? = unwrap(this).getEndTime()

  /**
   * The date and time for the recurring schedule to end, in UTC.
   */
  public open fun endTime(`value`: String) {
    unwrap(this).setEndTime(`value`)
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
   * The maximum size of the Auto Scaling group.
   */
  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The maximum size of the Auto Scaling group.
   */
  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  /**
   * The minimum size of the Auto Scaling group.
   */
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The minimum size of the Auto Scaling group.
   */
  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * The recurring schedule for this action.
   */
  public open fun recurrence(): String? = unwrap(this).getRecurrence()

  /**
   * The recurring schedule for this action.
   */
  public open fun recurrence(`value`: String) {
    unwrap(this).setRecurrence(`value`)
  }

  /**
   * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and
   * in quotes (for example, `"2021-06-01T00:00:00Z"` ).
   */
  public open fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and
   * in quotes (for example, `"2021-06-01T00:00:00Z"` ).
   */
  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  /**
   * Specifies the time zone for a cron expression.
   */
  public open fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * Specifies the time zone for a cron expression.
   */
  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnScheduledAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled
     * action runs and the capacity it attempts to maintain.
     *
     * It can scale beyond this capacity if you add more scaling conditions.
     *
     *
     * You must specify at least one of the following properties: `MaxSize` , `MinSize` , or
     * `DesiredCapacity` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-desiredcapacity)
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * after the scheduled action runs and the capacity it attempts to maintain. 
     */
    public fun desiredCapacity(desiredCapacity: Number)

    /**
     * The date and time for the recurring schedule to end, in UTC.
     *
     * For example, `"2021-06-01T00:00:00Z"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-endtime)
     * @param endTime The date and time for the recurring schedule to end, in UTC. 
     */
    public fun endTime(endTime: String)

    /**
     * The maximum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-maxsize)
     * @param maxSize The maximum size of the Auto Scaling group. 
     */
    public fun maxSize(maxSize: Number)

    /**
     * The minimum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-minsize)
     * @param minSize The minimum size of the Auto Scaling group. 
     */
    public fun minSize(minSize: Number)

    /**
     * The recurring schedule for this action.
     *
     * This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month]
     * [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, `"30 0 1 1,6,12 *"` ).
     * For more information about this format, see
     * [Crontab](https://docs.aws.amazon.com/http://crontab.org) .
     *
     * When `StartTime` and `EndTime` are specified with `Recurrence` , they form the boundaries of
     * when the recurring action starts and stops.
     *
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-recurrence)
     * @param recurrence The recurring schedule for this action. 
     */
    public fun recurrence(recurrence: String)

    /**
     * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only
     * and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
     *
     * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-starttime)
     * @param startTime The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format
     * in UTC/GMT only and in quotes (for example, `"2021-06-01T00:00:00Z"` ). 
     */
    public fun startTime(startTime: String)

    /**
     * Specifies the time zone for a cron expression.
     *
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as `Etc/GMT+9` or `Pacific/Tahiti` ). For more information, see
     * [https://en.wikipedia.org/wiki/List_of_tz_database_time_zones](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-timezone)
     * @param timeZone Specifies the time zone for a cron expression. 
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder.create(scope, id)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled
     * action runs and the capacity it attempts to maintain.
     *
     * It can scale beyond this capacity if you add more scaling conditions.
     *
     *
     * You must specify at least one of the following properties: `MaxSize` , `MinSize` , or
     * `DesiredCapacity` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-desiredcapacity)
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * after the scheduled action runs and the capacity it attempts to maintain. 
     */
    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * The date and time for the recurring schedule to end, in UTC.
     *
     * For example, `"2021-06-01T00:00:00Z"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-endtime)
     * @param endTime The date and time for the recurring schedule to end, in UTC. 
     */
    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * The maximum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-maxsize)
     * @param maxSize The maximum size of the Auto Scaling group. 
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * The minimum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-minsize)
     * @param minSize The minimum size of the Auto Scaling group. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * The recurring schedule for this action.
     *
     * This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month]
     * [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, `"30 0 1 1,6,12 *"` ).
     * For more information about this format, see
     * [Crontab](https://docs.aws.amazon.com/http://crontab.org) .
     *
     * When `StartTime` and `EndTime` are specified with `Recurrence` , they form the boundaries of
     * when the recurring action starts and stops.
     *
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-recurrence)
     * @param recurrence The recurring schedule for this action. 
     */
    override fun recurrence(recurrence: String) {
      cdkBuilder.recurrence(recurrence)
    }

    /**
     * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only
     * and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
     *
     * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-starttime)
     * @param startTime The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format
     * in UTC/GMT only and in quotes (for example, `"2021-06-01T00:00:00Z"` ). 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * Specifies the time zone for a cron expression.
     *
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as `Etc/GMT+9` or `Pacific/Tahiti` ). For more information, see
     * [https://en.wikipedia.org/wiki/List_of_tz_database_time_zones](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-timezone)
     * @param timeZone Specifies the time zone for a cron expression. 
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledAction):
        CfnScheduledAction = CfnScheduledAction(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAction):
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction
  }
}
