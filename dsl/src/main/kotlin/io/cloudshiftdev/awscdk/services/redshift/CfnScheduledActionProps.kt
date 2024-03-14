package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnScheduledActionProps {
  /**
   * If true, the schedule is enabled.
   *
   * If false, the scheduled action does not trigger. For more information about `state` of the
   * scheduled action, see `ScheduledAction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
   */
  public fun enable(): Any? = unwrap(this).getEnable()

  /**
   * The end time in UTC when the schedule is no longer active.
   *
   * After this time, the scheduled action does not trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-endtime)
   */
  public fun endTime(): String? = unwrap(this).getEndTime()

  /**
   * The IAM role to assume to run the scheduled action.
   *
   * This IAM role must have permission to run the Amazon Redshift API operation in the scheduled
   * action. This IAM role must allow the Amazon Redshift scheduler (Principal
   * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about
   * the IAM role to use with the Amazon Redshift scheduler, see [Using Identity-Based Policies for
   * Amazon
   * Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
   * in the *Amazon Redshift Cluster Management Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-iamrole)
   */
  public fun iamRole(): String? = unwrap(this).getIamRole()

  /**
   * The schedule for a one-time (at format) or recurring (cron format) scheduled action.
   *
   * Schedule invocations must be separated by at least one hour.
   *
   * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
   * `at(2016-03-04T17:27:00)` ".
   *
   * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
   * For example, " `cron(0 10 ? * MON *)` ". For more information, see [Cron
   * Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
   * in the *Amazon CloudWatch Events User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-schedule)
   */
  public fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * The description of the scheduled action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactiondescription)
   */
  public fun scheduledActionDescription(): String? = unwrap(this).getScheduledActionDescription()

  /**
   * The name of the scheduled action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactionname)
   */
  public fun scheduledActionName(): String

  /**
   * The start time in UTC when the schedule is active.
   *
   * Before this time, the scheduled action does not trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-starttime)
   */
  public fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * A JSON format string of the Amazon Redshift API operation with input parameters.
   *
   * "
   * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
   * ".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
   */
  public fun targetAction(): Any? = unwrap(this).getTargetAction()

  /**
   * A builder for [CfnScheduledActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enable If true, the schedule is enabled.
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     */
    public fun enable(enable: Boolean)

    /**
     * @param enable If true, the schedule is enabled.
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     */
    public fun enable(enable: IResolvable)

    /**
     * @param endTime The end time in UTC when the schedule is no longer active.
     * After this time, the scheduled action does not trigger.
     */
    public fun endTime(endTime: String)

    /**
     * @param iamRole The IAM role to assume to run the scheduled action.
     * This IAM role must have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     * about the IAM role to use with the Amazon Redshift scheduler, see [Using Identity-Based Policies
     * for Amazon
     * Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRole(iamRole: String)

    /**
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     * action.
     * Schedule invocations must be separated by at least one hour.
     *
     * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
     * `at(2016-03-04T17:27:00)` ".
     *
     * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
     * For example, " `cron(0 10 ? * MON *)` ". For more information, see [Cron
     * Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch Events User Guide* .
     */
    public fun schedule(schedule: String)

    /**
     * @param scheduledActionDescription The description of the scheduled action.
     */
    public fun scheduledActionDescription(scheduledActionDescription: String)

    /**
     * @param scheduledActionName The name of the scheduled action. 
     */
    public fun scheduledActionName(scheduledActionName: String)

    /**
     * @param startTime The start time in UTC when the schedule is active.
     * Before this time, the scheduled action does not trigger.
     */
    public fun startTime(startTime: String)

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    public fun targetAction(targetAction: IResolvable)

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    public fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty)

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd137b88f193866d0b88e047c1e5039564dabc677c2d45457207af12ac238425")
    public
        fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnScheduledActionProps.Builder
        = software.amazon.awscdk.services.redshift.CfnScheduledActionProps.builder()

    /**
     * @param enable If true, the schedule is enabled.
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     */
    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    /**
     * @param enable If true, the schedule is enabled.
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     */
    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    /**
     * @param endTime The end time in UTC when the schedule is no longer active.
     * After this time, the scheduled action does not trigger.
     */
    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    /**
     * @param iamRole The IAM role to assume to run the scheduled action.
     * This IAM role must have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     * about the IAM role to use with the Amazon Redshift scheduler, see [Using Identity-Based Policies
     * for Amazon
     * Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     */
    override fun iamRole(iamRole: String) {
      cdkBuilder.iamRole(iamRole)
    }

    /**
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     * action.
     * Schedule invocations must be separated by at least one hour.
     *
     * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
     * `at(2016-03-04T17:27:00)` ".
     *
     * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
     * For example, " `cron(0 10 ? * MON *)` ". For more information, see [Cron
     * Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch Events User Guide* .
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * @param scheduledActionDescription The description of the scheduled action.
     */
    override fun scheduledActionDescription(scheduledActionDescription: String) {
      cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    /**
     * @param scheduledActionName The name of the scheduled action. 
     */
    override fun scheduledActionName(scheduledActionName: String) {
      cdkBuilder.scheduledActionName(scheduledActionName)
    }

    /**
     * @param startTime The start time in UTC when the schedule is active.
     * Before this time, the scheduled action does not trigger.
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    override fun targetAction(targetAction: IResolvable) {
      cdkBuilder.targetAction(targetAction.let(IResolvable::unwrap))
    }

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    override fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty) {
      cdkBuilder.targetAction(targetAction.let(CfnScheduledAction.ScheduledActionTypeProperty::unwrap))
    }

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd137b88f193866d0b88e047c1e5039564dabc677c2d45457207af12ac238425")
    override
        fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty.Builder.() -> Unit):
        Unit = targetAction(CfnScheduledAction.ScheduledActionTypeProperty(targetAction))

    public fun build(): software.amazon.awscdk.services.redshift.CfnScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledActionProps,
  ) : CdkObject(cdkObject), CfnScheduledActionProps {
    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     */
    override fun enable(): Any? = unwrap(this).getEnable()

    /**
     * The end time in UTC when the schedule is no longer active.
     *
     * After this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-endtime)
     */
    override fun endTime(): String? = unwrap(this).getEndTime()

    /**
     * The IAM role to assume to run the scheduled action.
     *
     * This IAM role must have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     * about the IAM role to use with the Amazon Redshift scheduler, see [Using Identity-Based Policies
     * for Amazon
     * Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-iamrole)
     */
    override fun iamRole(): String? = unwrap(this).getIamRole()

    /**
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action.
     *
     * Schedule invocations must be separated by at least one hour.
     *
     * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
     * `at(2016-03-04T17:27:00)` ".
     *
     * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
     * For example, " `cron(0 10 ? * MON *)` ". For more information, see [Cron
     * Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch Events User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-schedule)
     */
    override fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * The description of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactiondescription)
     */
    override fun scheduledActionDescription(): String? =
        unwrap(this).getScheduledActionDescription()

    /**
     * The name of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactionname)
     */
    override fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

    /**
     * The start time in UTC when the schedule is active.
     *
     * Before this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-starttime)
     */
    override fun startTime(): String? = unwrap(this).getStartTime()

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     */
    override fun targetAction(): Any? = unwrap(this).getTargetAction()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledActionProps):
        CfnScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledActionProps):
        software.amazon.awscdk.services.redshift.CfnScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnScheduledActionProps
  }
}
