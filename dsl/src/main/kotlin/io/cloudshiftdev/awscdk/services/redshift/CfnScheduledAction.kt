package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction,
) : CfnResource(cdkObject), IInspectable {
  /**
   * List of times when the scheduled action will run.
   */
  public open fun attrNextInvocations(): List<String> = unwrap(this).getAttrNextInvocations()

  /**
   * The state of the scheduled action.
   *
   * For example, `DISABLED` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * If true, the schedule is enabled.
   */
  public open fun enable(): Any? = unwrap(this).getEnable()

  /**
   * If true, the schedule is enabled.
   */
  public open fun enable(`value`: Boolean) {
    unwrap(this).setEnable(`value`)
  }

  /**
   * If true, the schedule is enabled.
   */
  public open fun enable(`value`: IResolvable) {
    unwrap(this).setEnable(`value`.let(IResolvable::unwrap))
  }

  /**
   * The end time in UTC when the schedule is no longer active.
   */
  public open fun endTime(): String? = unwrap(this).getEndTime()

  /**
   * The end time in UTC when the schedule is no longer active.
   */
  public open fun endTime(`value`: String) {
    unwrap(this).setEndTime(`value`)
  }

  /**
   * The IAM role to assume to run the scheduled action.
   */
  public open fun iamRole(): String? = unwrap(this).getIamRole()

  /**
   * The IAM role to assume to run the scheduled action.
   */
  public open fun iamRole(`value`: String) {
    unwrap(this).setIamRole(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The schedule for a one-time (at format) or recurring (cron format) scheduled action.
   */
  public open fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * The schedule for a one-time (at format) or recurring (cron format) scheduled action.
   */
  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  /**
   * The description of the scheduled action.
   */
  public open fun scheduledActionDescription(): String? =
      unwrap(this).getScheduledActionDescription()

  /**
   * The description of the scheduled action.
   */
  public open fun scheduledActionDescription(`value`: String) {
    unwrap(this).setScheduledActionDescription(`value`)
  }

  /**
   * The name of the scheduled action.
   */
  public open fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

  /**
   * The name of the scheduled action.
   */
  public open fun scheduledActionName(`value`: String) {
    unwrap(this).setScheduledActionName(`value`)
  }

  /**
   * The start time in UTC when the schedule is active.
   */
  public open fun startTime(): String? = unwrap(this).getStartTime()

  /**
   * The start time in UTC when the schedule is active.
   */
  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  /**
   * A JSON format string of the Amazon Redshift API operation with input parameters.
   */
  public open fun targetAction(): Any? = unwrap(this).getTargetAction()

  /**
   * A JSON format string of the Amazon Redshift API operation with input parameters.
   */
  public open fun targetAction(`value`: IResolvable) {
    unwrap(this).setTargetAction(`value`.let(IResolvable::unwrap))
  }

  /**
   * A JSON format string of the Amazon Redshift API operation with input parameters.
   */
  public open fun targetAction(`value`: ScheduledActionTypeProperty) {
    unwrap(this).setTargetAction(`value`.let(ScheduledActionTypeProperty::unwrap))
  }

  /**
   * A JSON format string of the Amazon Redshift API operation with input parameters.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4b776fff06cfc70e9dc28510b2c0860fe6a17c4d592e3160522dec0f65666da")
  public open fun targetAction(`value`: ScheduledActionTypeProperty.Builder.() -> Unit): Unit =
      targetAction(ScheduledActionTypeProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnScheduledAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     * @param enable If true, the schedule is enabled. 
     */
    public fun enable(enable: Boolean)

    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     * @param enable If true, the schedule is enabled. 
     */
    public fun enable(enable: IResolvable)

    /**
     * The end time in UTC when the schedule is no longer active.
     *
     * After this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-endtime)
     * @param endTime The end time in UTC when the schedule is no longer active. 
     */
    public fun endTime(endTime: String)

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
     * @param iamRole The IAM role to assume to run the scheduled action. 
     */
    public fun iamRole(iamRole: String)

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
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     * action. 
     */
    public fun schedule(schedule: String)

    /**
     * The description of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactiondescription)
     * @param scheduledActionDescription The description of the scheduled action. 
     */
    public fun scheduledActionDescription(scheduledActionDescription: String)

    /**
     * The name of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactionname)
     * @param scheduledActionName The name of the scheduled action. 
     */
    public fun scheduledActionName(scheduledActionName: String)

    /**
     * The start time in UTC when the schedule is active.
     *
     * Before this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-starttime)
     * @param startTime The start time in UTC when the schedule is active. 
     */
    public fun startTime(startTime: String)

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    public fun targetAction(targetAction: IResolvable)

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    public fun targetAction(targetAction: ScheduledActionTypeProperty)

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14944716e8349afb884b0656bf96de37477ce11afde21172787d26fbb9224eb")
    public fun targetAction(targetAction: ScheduledActionTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnScheduledAction.Builder =
        software.amazon.awscdk.services.redshift.CfnScheduledAction.Builder.create(scope, id)

    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     * @param enable If true, the schedule is enabled. 
     */
    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     * @param enable If true, the schedule is enabled. 
     */
    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    /**
     * The end time in UTC when the schedule is no longer active.
     *
     * After this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-endtime)
     * @param endTime The end time in UTC when the schedule is no longer active. 
     */
    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

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
     * @param iamRole The IAM role to assume to run the scheduled action. 
     */
    override fun iamRole(iamRole: String) {
      cdkBuilder.iamRole(iamRole)
    }

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
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     * action. 
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * The description of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactiondescription)
     * @param scheduledActionDescription The description of the scheduled action. 
     */
    override fun scheduledActionDescription(scheduledActionDescription: String) {
      cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    /**
     * The name of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactionname)
     * @param scheduledActionName The name of the scheduled action. 
     */
    override fun scheduledActionName(scheduledActionName: String) {
      cdkBuilder.scheduledActionName(scheduledActionName)
    }

    /**
     * The start time in UTC when the schedule is active.
     *
     * Before this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-starttime)
     * @param startTime The start time in UTC when the schedule is active. 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    override fun targetAction(targetAction: IResolvable) {
      cdkBuilder.targetAction(targetAction.let(IResolvable::unwrap))
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    override fun targetAction(targetAction: ScheduledActionTypeProperty) {
      cdkBuilder.targetAction(targetAction.let(ScheduledActionTypeProperty::unwrap))
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     * parameters. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14944716e8349afb884b0656bf96de37477ce11afde21172787d26fbb9224eb")
    override fun targetAction(targetAction: ScheduledActionTypeProperty.Builder.() -> Unit): Unit =
        targetAction(ScheduledActionTypeProperty(targetAction))

    public fun build(): software.amazon.awscdk.services.redshift.CfnScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction):
        CfnScheduledAction = CfnScheduledAction(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAction):
        software.amazon.awscdk.services.redshift.CfnScheduledAction = wrapped.cdkObject
  }

  public interface ResizeClusterMessageProperty {
    /**
     * A boolean value indicating whether the resize operation is using the classic resize process.
     *
     * If you don't provide this parameter or set the value to `false` , the resize type is elastic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-classic)
     */
    public fun classic(): Any? = unwrap(this).getClassic()

    /**
     * The unique identifier for the cluster to resize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-clusteridentifier)
     */
    public fun clusterIdentifier(): String

    /**
     * The new cluster type for the specified cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-clustertype)
     */
    public fun clusterType(): String? = unwrap(this).getClusterType()

    /**
     * The new node type for the nodes you are adding.
     *
     * If not specified, the cluster's current node type is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-nodetype)
     */
    public fun nodeType(): String? = unwrap(this).getNodeType()

    /**
     * The new number of nodes for the cluster.
     *
     * If not specified, the cluster's current number of nodes is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-numberofnodes)
     */
    public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    /**
     * A builder for [ResizeClusterMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classic A boolean value indicating whether the resize operation is using the classic
       * resize process.
       * If you don't provide this parameter or set the value to `false` , the resize type is
       * elastic.
       */
      public fun classic(classic: Boolean)

      /**
       * @param classic A boolean value indicating whether the resize operation is using the classic
       * resize process.
       * If you don't provide this parameter or set the value to `false` , the resize type is
       * elastic.
       */
      public fun classic(classic: IResolvable)

      /**
       * @param clusterIdentifier The unique identifier for the cluster to resize. 
       */
      public fun clusterIdentifier(clusterIdentifier: String)

      /**
       * @param clusterType The new cluster type for the specified cluster.
       */
      public fun clusterType(clusterType: String)

      /**
       * @param nodeType The new node type for the nodes you are adding.
       * If not specified, the cluster's current node type is used.
       */
      public fun nodeType(nodeType: String)

      /**
       * @param numberOfNodes The new number of nodes for the cluster.
       * If not specified, the cluster's current number of nodes is used.
       */
      public fun numberOfNodes(numberOfNodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.builder()

      /**
       * @param classic A boolean value indicating whether the resize operation is using the classic
       * resize process.
       * If you don't provide this parameter or set the value to `false` , the resize type is
       * elastic.
       */
      override fun classic(classic: Boolean) {
        cdkBuilder.classic(classic)
      }

      /**
       * @param classic A boolean value indicating whether the resize operation is using the classic
       * resize process.
       * If you don't provide this parameter or set the value to `false` , the resize type is
       * elastic.
       */
      override fun classic(classic: IResolvable) {
        cdkBuilder.classic(classic.let(IResolvable::unwrap))
      }

      /**
       * @param clusterIdentifier The unique identifier for the cluster to resize. 
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      /**
       * @param clusterType The new cluster type for the specified cluster.
       */
      override fun clusterType(clusterType: String) {
        cdkBuilder.clusterType(clusterType)
      }

      /**
       * @param nodeType The new node type for the nodes you are adding.
       * If not specified, the cluster's current node type is used.
       */
      override fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
      }

      /**
       * @param numberOfNodes The new number of nodes for the cluster.
       * If not specified, the cluster's current number of nodes is used.
       */
      override fun numberOfNodes(numberOfNodes: Number) {
        cdkBuilder.numberOfNodes(numberOfNodes)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty,
    ) : CdkObject(cdkObject), ResizeClusterMessageProperty {
      /**
       * A boolean value indicating whether the resize operation is using the classic resize
       * process.
       *
       * If you don't provide this parameter or set the value to `false` , the resize type is
       * elastic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-classic)
       */
      override fun classic(): Any? = unwrap(this).getClassic()

      /**
       * The unique identifier for the cluster to resize.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-clusteridentifier)
       */
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

      /**
       * The new cluster type for the specified cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-clustertype)
       */
      override fun clusterType(): String? = unwrap(this).getClusterType()

      /**
       * The new node type for the nodes you are adding.
       *
       * If not specified, the cluster's current node type is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-nodetype)
       */
      override fun nodeType(): String? = unwrap(this).getNodeType()

      /**
       * The new number of nodes for the cluster.
       *
       * If not specified, the cluster's current number of nodes is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html#cfn-redshift-scheduledaction-resizeclustermessage-numberofnodes)
       */
      override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResizeClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty):
          ResizeClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResizeClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty
    }
  }

  public interface ResumeClusterMessageProperty {
    /**
     * The identifier of the cluster to be resumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resumeclustermessage.html#cfn-redshift-scheduledaction-resumeclustermessage-clusteridentifier)
     */
    public fun clusterIdentifier(): String

    /**
     * A builder for [ResumeClusterMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterIdentifier The identifier of the cluster to be resumed. 
       */
      public fun clusterIdentifier(clusterIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty.builder()

      /**
       * @param clusterIdentifier The identifier of the cluster to be resumed. 
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty,
    ) : CdkObject(cdkObject), ResumeClusterMessageProperty {
      /**
       * The identifier of the cluster to be resumed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resumeclustermessage.html#cfn-redshift-scheduledaction-resumeclustermessage-clusteridentifier)
       */
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResumeClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty):
          ResumeClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResumeClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty
    }
  }

  public interface PauseClusterMessageProperty {
    /**
     * The identifier of the cluster to be paused.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-pauseclustermessage.html#cfn-redshift-scheduledaction-pauseclustermessage-clusteridentifier)
     */
    public fun clusterIdentifier(): String

    /**
     * A builder for [PauseClusterMessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterIdentifier The identifier of the cluster to be paused. 
       */
      public fun clusterIdentifier(clusterIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty.builder()

      /**
       * @param clusterIdentifier The identifier of the cluster to be paused. 
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty,
    ) : CdkObject(cdkObject), PauseClusterMessageProperty {
      /**
       * The identifier of the cluster to be paused.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-pauseclustermessage.html#cfn-redshift-scheduledaction-pauseclustermessage-clusteridentifier)
       */
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PauseClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty):
          PauseClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PauseClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty
    }
  }

  public interface ScheduledActionTypeProperty {
    /**
     * An action that runs a `PauseCluster` API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-pausecluster)
     */
    public fun pauseCluster(): Any? = unwrap(this).getPauseCluster()

    /**
     * An action that runs a `ResizeCluster` API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-resizecluster)
     */
    public fun resizeCluster(): Any? = unwrap(this).getResizeCluster()

    /**
     * An action that runs a `ResumeCluster` API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-resumecluster)
     */
    public fun resumeCluster(): Any? = unwrap(this).getResumeCluster()

    /**
     * A builder for [ScheduledActionTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      public fun pauseCluster(pauseCluster: IResolvable)

      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      public fun pauseCluster(pauseCluster: PauseClusterMessageProperty)

      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a24da4bcf80749aa50cbefd201500769afcab07d995759c89ae4b58185cd8ff4")
      public fun pauseCluster(pauseCluster: PauseClusterMessageProperty.Builder.() -> Unit)

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      public fun resizeCluster(resizeCluster: IResolvable)

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      public fun resizeCluster(resizeCluster: ResizeClusterMessageProperty)

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc0c6375f9e1956454d5514ce08573f2beb7656c87933e47644f071f71821d30")
      public fun resizeCluster(resizeCluster: ResizeClusterMessageProperty.Builder.() -> Unit)

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      public fun resumeCluster(resumeCluster: IResolvable)

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      public fun resumeCluster(resumeCluster: ResumeClusterMessageProperty)

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb060bab55e9fef415647c52936d5aa164157292c6e5658c8be5d9de35546c1b")
      public fun resumeCluster(resumeCluster: ResumeClusterMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty.builder()

      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      override fun pauseCluster(pauseCluster: IResolvable) {
        cdkBuilder.pauseCluster(pauseCluster.let(IResolvable::unwrap))
      }

      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      override fun pauseCluster(pauseCluster: PauseClusterMessageProperty) {
        cdkBuilder.pauseCluster(pauseCluster.let(PauseClusterMessageProperty::unwrap))
      }

      /**
       * @param pauseCluster An action that runs a `PauseCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a24da4bcf80749aa50cbefd201500769afcab07d995759c89ae4b58185cd8ff4")
      override fun pauseCluster(pauseCluster: PauseClusterMessageProperty.Builder.() -> Unit): Unit
          = pauseCluster(PauseClusterMessageProperty(pauseCluster))

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      override fun resizeCluster(resizeCluster: IResolvable) {
        cdkBuilder.resizeCluster(resizeCluster.let(IResolvable::unwrap))
      }

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      override fun resizeCluster(resizeCluster: ResizeClusterMessageProperty) {
        cdkBuilder.resizeCluster(resizeCluster.let(ResizeClusterMessageProperty::unwrap))
      }

      /**
       * @param resizeCluster An action that runs a `ResizeCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc0c6375f9e1956454d5514ce08573f2beb7656c87933e47644f071f71821d30")
      override fun resizeCluster(resizeCluster: ResizeClusterMessageProperty.Builder.() -> Unit):
          Unit = resizeCluster(ResizeClusterMessageProperty(resizeCluster))

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      override fun resumeCluster(resumeCluster: IResolvable) {
        cdkBuilder.resumeCluster(resumeCluster.let(IResolvable::unwrap))
      }

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      override fun resumeCluster(resumeCluster: ResumeClusterMessageProperty) {
        cdkBuilder.resumeCluster(resumeCluster.let(ResumeClusterMessageProperty::unwrap))
      }

      /**
       * @param resumeCluster An action that runs a `ResumeCluster` API operation.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb060bab55e9fef415647c52936d5aa164157292c6e5658c8be5d9de35546c1b")
      override fun resumeCluster(resumeCluster: ResumeClusterMessageProperty.Builder.() -> Unit):
          Unit = resumeCluster(ResumeClusterMessageProperty(resumeCluster))

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty,
    ) : CdkObject(cdkObject), ScheduledActionTypeProperty {
      /**
       * An action that runs a `PauseCluster` API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-pausecluster)
       */
      override fun pauseCluster(): Any? = unwrap(this).getPauseCluster()

      /**
       * An action that runs a `ResizeCluster` API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-resizecluster)
       */
      override fun resizeCluster(): Any? = unwrap(this).getResizeCluster()

      /**
       * An action that runs a `ResumeCluster` API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html#cfn-redshift-scheduledaction-scheduledactiontype-resumecluster)
       */
      override fun resumeCluster(): Any? = unwrap(this).getResumeCluster()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty):
          ScheduledActionTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledActionTypeProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty
    }
  }
}
