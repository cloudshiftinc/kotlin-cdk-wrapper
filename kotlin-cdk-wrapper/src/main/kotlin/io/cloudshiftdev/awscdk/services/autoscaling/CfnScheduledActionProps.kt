@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnScheduledAction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnScheduledActionProps cfnScheduledActionProps = CfnScheduledActionProps.builder()
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
public interface CfnScheduledActionProps {
  /**
   * The name of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-autoscalinggroupname)
   */
  public fun autoScalingGroupName(): String

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
   */
  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  /**
   * The date and time for the recurring schedule to end, in UTC.
   *
   * For example, `"2021-06-01T00:00:00Z"` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-endtime)
   */
  public fun endTime(): String? = unwrap(this).getEndTime()

  /**
   * The maximum size of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-maxsize)
   */
  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The minimum size of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-minsize)
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

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
   */
  public fun recurrence(): String? = unwrap(this).getRecurrence()

  /**
   * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and
   * in quotes (for example, `"2021-06-01T00:00:00Z"` ).
   *
   * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
   * this time, and then performs the action based on the specified recurrence.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-starttime)
   */
  public fun startTime(): String? = unwrap(this).getStartTime()

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
   */
  public fun timeZone(): String? = unwrap(this).getTimeZone()

  /**
   * A builder for [CfnScheduledActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * after the scheduled action runs and the capacity it attempts to maintain.
     * It can scale beyond this capacity if you add more scaling conditions.
     *
     *
     * You must specify at least one of the following properties: `MaxSize` , `MinSize` , or
     * `DesiredCapacity` .
     */
    public fun desiredCapacity(desiredCapacity: Number)

    /**
     * @param endTime The date and time for the recurring schedule to end, in UTC.
     * For example, `"2021-06-01T00:00:00Z"` .
     */
    public fun endTime(endTime: String)

    /**
     * @param maxSize The maximum size of the Auto Scaling group.
     */
    public fun maxSize(maxSize: Number)

    /**
     * @param minSize The minimum size of the Auto Scaling group.
     */
    public fun minSize(minSize: Number)

    /**
     * @param recurrence The recurring schedule for this action.
     * This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month]
     * [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, `"30 0 1 1,6,12 *"` ).
     * For more information about this format, see
     * [Crontab](https://docs.aws.amazon.com/http://crontab.org) .
     *
     * When `StartTime` and `EndTime` are specified with `Recurrence` , they form the boundaries of
     * when the recurring action starts and stops.
     *
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     */
    public fun recurrence(recurrence: String)

    /**
     * @param startTime The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format
     * in UTC/GMT only and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
     * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     */
    public fun startTime(startTime: String)

    /**
     * @param timeZone Specifies the time zone for a cron expression.
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as `Etc/GMT+9` or `Pacific/Tahiti` ). For more information, see
     * [https://en.wikipedia.org/wiki/List_of_tz_database_time_zones](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)
     * .
     */
    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.builder()

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * after the scheduled action runs and the capacity it attempts to maintain.
     * It can scale beyond this capacity if you add more scaling conditions.
     *
     *
     * You must specify at least one of the following properties: `MaxSize` , `MinSize` , or
     * `DesiredCapacity` .
     */
    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * @param endTime The date and time for the recurring schedule to end, in UTC.
     * For example, `"2021-06-01T00:00:00Z"` .
     */
    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * @param maxSize The maximum size of the Auto Scaling group.
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum size of the Auto Scaling group.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param recurrence The recurring schedule for this action.
     * This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month]
     * [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, `"30 0 1 1,6,12 *"` ).
     * For more information about this format, see
     * [Crontab](https://docs.aws.amazon.com/http://crontab.org) .
     *
     * When `StartTime` and `EndTime` are specified with `Recurrence` , they form the boundaries of
     * when the recurring action starts and stops.
     *
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     */
    override fun recurrence(recurrence: String) {
      cdkBuilder.recurrence(recurrence)
    }

    /**
     * @param startTime The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format
     * in UTC/GMT only and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
     * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param timeZone Specifies the time zone for a cron expression.
     * If a time zone is not provided, UTC is used by default.
     *
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
     * Database (such as `Etc/GMT+9` or `Pacific/Tahiti` ). For more information, see
     * [https://en.wikipedia.org/wiki/List_of_tz_database_time_zones](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)
     * .
     */
    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps,
  ) : CdkObject(cdkObject), CfnScheduledActionProps {
    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-autoscalinggroupname)
     */
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

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
     */
    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    /**
     * The date and time for the recurring schedule to end, in UTC.
     *
     * For example, `"2021-06-01T00:00:00Z"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-endtime)
     */
    override fun endTime(): String? = unwrap(this).getEndTime()

    /**
     * The maximum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-maxsize)
     */
    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * The minimum size of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-minsize)
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

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
     */
    override fun recurrence(): String? = unwrap(this).getRecurrence()

    /**
     * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only
     * and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
     *
     * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html#cfn-autoscaling-scheduledaction-starttime)
     */
    override fun startTime(): String? = unwrap(this).getStartTime()

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
     */
    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps):
        CfnScheduledActionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScheduledActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
  }
}
